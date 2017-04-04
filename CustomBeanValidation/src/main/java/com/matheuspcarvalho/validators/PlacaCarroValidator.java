package com.matheuspcarvalho.validators;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.matheuspcarvalho.anotations.PlacaCarro;

public class PlacaCarroValidator implements ConstraintValidator<PlacaCarro, String> {

	private Pattern padrao = Pattern.compile("^[a-zA-Z]{3}\\-\\d{4}$");

	@Override
	public void initialize(PlacaCarro constraintAnnotation) {

	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {

		if (value == null || "".equals(value)) {
			return true;
		}

		Matcher matcher = padrao.matcher(value);
		return matcher.matches();
	}

}
