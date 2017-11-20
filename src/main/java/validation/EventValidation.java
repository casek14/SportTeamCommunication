package validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import model.Event;


public class EventValidation implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		return Event.class.equals(arg0);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub
		
	}

}
