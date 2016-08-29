package com.gather.cdicommons.producer;

import org.apache.log4j.Logger;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * $ Project: bci_ffmm_apv
 * User: rodrigotroy
 * Date: 29-12-15
 * Time: 10:08
 */
public class LogProducer implements Serializable {
    @Produces
    public Logger createLogger(InjectionPoint injectionPoint) {
        return Logger.getLogger(injectionPoint.getBean().getBeanClass());
    }
}
