package com.gather.cdicommons.producer.quickdashboard;

import com.gather.quickdashboard.core.DashboardManager;
import com.gather.quickdashboard.core.component.IComponentFactory;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * $ Project: bci_ffmm_apv
 * User: rodrigotroy
 * Date: 09-03-16
 * Time: 14:28
 */

@Named
@RequestScoped
public class DashboardManagerProducer implements Serializable {
    @Inject
    private IComponentFactory componentFactory;

    @Produces
    public DashboardManager createDashboardManager(InjectionPoint injectionPoint) {
        return new DashboardManager(componentFactory);
    }
}
