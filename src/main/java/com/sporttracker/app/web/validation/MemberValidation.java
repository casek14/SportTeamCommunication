package com.sporttracker.app.web.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.sporttracker.app.web.model.Member;

public class MemberValidation implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		return Member.class.equals(arg0);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub

	}

}
