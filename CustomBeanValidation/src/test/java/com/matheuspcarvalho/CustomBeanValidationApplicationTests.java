package com.matheuspcarvalho;

import org.junit.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.matheuspcarvalho.validators.PlacaCarroValidator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomBeanValidationApplicationTests {

	@Test
	public void testPlacaCarroInvalida() {
		PlacaCarroValidator placaCarroValidator = new PlacaCarroValidator();
		Assert.assertFalse(placaCarroValidator.isValid("112-1234", null));
		Assert.assertFalse(placaCarroValidator.isValid("AB-1234", null));
		Assert.assertFalse(placaCarroValidator.isValid("A-123", null));

	}

	@Test
	public void testPlacaCarroValida() {
		PlacaCarroValidator placaCarroValidator = new PlacaCarroValidator();
		Assert.assertTrue(placaCarroValidator.isValid("ABC-1234", null));
		Assert.assertTrue(placaCarroValidator.isValid("DEF-5678", null));
		Assert.assertTrue(placaCarroValidator.isValid("GHI-5678", null));

	}

}
