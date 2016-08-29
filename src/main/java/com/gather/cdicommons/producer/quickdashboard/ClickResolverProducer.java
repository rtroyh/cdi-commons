package com.gather.cdicommons.producer.quickdashboard;

import com.gather.quickdashboard.core.event.DefaultClickResolver;
import com.gather.quickdashboard.core.event.IClickResolver;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * $ Project: bci_ffmm_apv
 * User: rodrigotroy
 * Date: 09-03-16
 * Time: 13:20
 */
@Named
@RequestScoped
public class ClickResolverProducer implements Serializable {

    @Produces
    public IClickResolver createClickResolver(InjectionPoint injectionPoint) {
        return new DefaultClickResolver();
    }
}
