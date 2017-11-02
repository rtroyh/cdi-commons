package com.gather.cdicommons.producer.quickdashboard;

import com.gather.cdicommons.stereotype.NamedRequestScoped;
import com.gather.quickdashboard.core.DashboardManager;
import com.gather.quickdashboard.core.component.IComponentFactory;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * $ Project: bci_ffmm_apv
 * User: rodrigotroy
 * Date: 09-03-16
 * Time: 14:28
 */

@NamedRequestScoped
public class DashboardManagerProducer implements Serializable {
    @Inject
    private IComponentFactory componentFactory;

    @Produces
    public DashboardManager createDashboardManager(InjectionPoint injectionPoint) {
        return new DashboardManager(componentFactory);
    }
}
