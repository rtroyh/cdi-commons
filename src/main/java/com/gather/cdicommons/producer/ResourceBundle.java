package com.gather.cdicommons.producer;

import javax.enterprise.util.Nonbinding;
import javax.inject.Qualifier;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created with IntelliJ IDEA.
 * $ Project: bci_ffmm_movimientos
 * User: rodrigotroy
 * Date: 12/11/17
 * Time: 12:00
 */
@Qualifier
@Target({TYPE, METHOD, PARAMETER, FIELD})
@Retention(RUNTIME)
@Documented
public @interface ResourceBundle {
    @Nonbinding
    String value() default "";
}
