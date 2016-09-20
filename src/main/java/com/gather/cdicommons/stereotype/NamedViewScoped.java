package com.gather.cdicommons.stereotype;

import org.omnifaces.cdi.ViewScoped;

import javax.enterprise.inject.Stereotype;
import javax.inject.Named;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created with IntelliJ IDEA.
 * $ Project: cdi-commons
 * User: rodrigotroy
 * Date: 20-09-16
 * Time: 14:11
 */
@Named
@ViewScoped
@Stereotype
@Target({TYPE, METHOD, FIELD})
@Retention(RUNTIME)
public @interface NamedViewScoped {
}
