package com.sporttracker.app.web.config;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

import freemarker.template.TemplateModelException;

/**
 * Extra spring configuration provided support for freemarker and
 * 
 *
 */
@Configuration
@EnableWebMvc
public class FreeMarkerConfig {

	private static Logger logger = LoggerFactory.getLogger(FreeMarkerConfig.class);

	@Value("${app.domain_url:localhost}")
	private String domainUrl;

	@Value("${app.domain_email:localhost}")
	private String domainEmail;

	@Autowired
	private FreeMarkerViewResolver resolver;

	/**
	 * Default templates configuration constants.
	 */
	interface ConfigConstants {
		String TEMPLATES_PATH = "/templates";
		String TEMPLATES_SUFFIX = ".ftl";
		String ENCODING = "UTF-8";
		Locale LOCALE = Locale.US;

	}

	@Bean
	public ViewResolver viewResolver() {
		resolver.setCache(true);
		resolver.setPrefix("");
		resolver.setSuffix(ConfigConstants.TEMPLATES_SUFFIX);
		resolver.setRequestContextAttribute("rc");
		resolver.setExposeSpringMacroHelpers(true);
		return resolver;
	}

	@Bean
	public FreeMarkerConfigurer freemarkerConfig() {
		FreeMarkerConfigurer result = new FreeMarkerConfigurer();
		result.setConfiguration(prepareConfig());
		return result;
	}

	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/**");
	}

	/**
	 * Prepares freemarker configuration with enabled templates inheritance.
	 * 
	 * @return prepared freemarker configuration.
	 */
	private freemarker.template.Configuration prepareConfig() {
		logger.debug("Creating new freemarker configuration.");
		freemarker.template.Configuration config = new freemarker.template.Configuration(
				freemarker.template.Configuration.VERSION_2_3_24);

		// Update freemarker to allow templates inheritance.
		setUpTemplateInheritanceExtension(config);

		// Templates will be loaded from classpath from templates package
		config.setClassForTemplateLoading(FreeMarkerConfig.class, ConfigConstants.TEMPLATES_PATH);

		// Set some other freemarker configuration
		config.setDefaultEncoding(ConfigConstants.ENCODING);
		config.setURLEscapingCharset(ConfigConstants.ENCODING);
		config.setLocale(ConfigConstants.LOCALE);
		config.setLogTemplateExceptions(false);
		logger.debug("Freemarker configuration was created.");
		return config;
	}

	/**
	 * Configures freemarker to be able use templates inheritace. See
	 * https://github.com/kwon37xi/freemarker-template-inheritance for more details.
	 */
	private void setUpTemplateInheritanceExtension(freemarker.template.Configuration config) {
		Map<String, Object> layoutCfg = new HashMap<String, Object>();
		layoutCfg.put("extends", new kr.pe.kwonnam.freemarker.inheritance.ExtendsDirective());
		layoutCfg.put("block", new kr.pe.kwonnam.freemarker.inheritance.BlockDirective());
		layoutCfg.put("put", new kr.pe.kwonnam.freemarker.inheritance.PutDirective());
		try {
			config.setSharedVariable("layout", layoutCfg);
		} catch (TemplateModelException e) {
			String errMsg = "Unexpecter error when setting shared variable with layout extensions to freemarker.";
			logger.error(errMsg, e);
		}
	}

}
