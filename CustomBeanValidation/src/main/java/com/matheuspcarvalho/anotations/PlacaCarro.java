package com.matheuspcarvalho.anotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.matheuspcarvalho.validators.PlacaCarroValidator;

@Constraint(validatedBy = PlacaCarroValidator.class)
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PlacaCarro
{
   
  String message() default "Formato de placa inválido";
  Class<?>[] groups() default { };
  Class<? extends Payload>[] payload() default { };
 
}
