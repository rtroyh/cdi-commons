package com.gather.cdicommons.producer;

import org.omnifaces.util.Faces;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import java.lang.annotation.Annotation;

/**
 * Created with IntelliJ IDEA.
 * $ Project: cdi-commons
 * User: rodrigotroy
 * Date: 12/11/17
 * Time: 11:24
 */
public class ResourceBundleProducer {
    @Produces
    @ResourceBundleConfig
    public java.util.ResourceBundle getBundle(InjectionPoint ctx) {
        return Faces.evaluateExpressionGet("#{" + extractValue(ctx) + "}");
    }

    private String extractValue(InjectionPoint ip) {
        for (Annotation annotation : ip.getQualifiers()) {
            if (annotation.annotationType().equals(ResourceBundleConfig.class)) {
                return ((ResourceBundleConfig) annotation).value();
            }
        }

        throw new IllegalStateException("No @Initialized on InjectionPoint");
    }
}
