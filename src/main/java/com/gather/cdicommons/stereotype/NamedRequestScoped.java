package com.gather.cdicommons.stereotype;

/**
 * Created with IntelliJ IDEA.
 * $ Project: cdi-commons
 * User: rodrigotroy
 * Date: 11/2/17
 * Time: 11:42
 */

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Stereotype;
import javax.inject.Named;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Named
@RequestScoped
@Stereotype
@Target({TYPE, METHOD, FIELD})
@Retention(RUNTIME)
public @interface NamedRequestScoped {
}
