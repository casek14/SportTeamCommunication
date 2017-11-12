package controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Address;
import model.Member;
import services.MemberService;
import validation.MemberValidation;


/**
 * This controller handle members
 * @author casek
 *
 */
@Controller
public class MemberController {
	
private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/member/register",method=RequestMethod.GET)
	public String showRegisterMemberForm(ModelMap model) {
		model.put("memberData", new Member());
		return "member/registerMember";
	}
	
	
	@RequestMapping(value="/member/register",method=RequestMethod.POST)
	public String saveMember(ModelMap model, @ModelAttribute("memberData") @Valid Member member,
			BindingResult br, HttpSession session) {
		
		MemberValidation memberValidation = new MemberValidation();
		memberValidation.validate(member, br);
		if(br.hasErrors()) {
			return "member/registerMember";
		}
		
		member.setAdministrator(false);
		memberService.saveMember(member);
		session.setAttribute("member", member);
		return "member/registerSuccessful";
	}
	
	@RequestMapping(value="/member/login", method=RequestMethod.GET)
	public String showLoginMember(ModelMap model, HttpSession session) {
		Member member = (Member) session.getAttribute("member");
	    if(member == null) {
	    	model.put("memberData", new Member());
	    	return "member/loginMember";
	    }
		
		return "loginSuccessfull";
	}
	
	@RequestMapping(value="/member/login", method=RequestMethod.POST)
	public String doLogin(ModelMap model, HttpSession session, @ModelAttribute("memberData") Member member,
			 BindingResult br) {
		
		MemberValidation memberValidation = new MemberValidation();
		memberValidation.validate(member, br);
		if(br.hasErrors()) {
			System.out.println("Mam problem");	
			return "member/loginMember";
			
		}
		member = memberService.loginMember(member);
		if(member != null) {
			session.setAttribute("member", member);
			return "loginSuccessfull";
		}
		
		return "member/loginMember";
	}
	
	@RequestMapping(value="/member/logout",method=RequestMethod.GET)
	public String memberLogout(HttpSession session) {
		session.invalidate();
		return "home";
	}

}
