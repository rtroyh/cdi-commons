package com.gather.cdicommons.producer.quickdashboard;

import com.gather.cdicommons.stereotype.NamedRequestScoped;
import com.gather.quickdashboard.core.component.DefaultComponentFactory;
import com.gather.quickdashboard.core.component.IComponentFactory;
import com.gather.quickdashboard.core.component.IComponentTypeResolver;
import com.gather.quickdashboard.core.dataset.IDatasetProcessorFactory;
import com.gather.quickdashboard.core.datasource.IDataSourceFactory;
import com.gather.quickdashboard.core.event.IClickResolver;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * $ Project: bci_ffmm_apv
 * User: rodrigotroy
 * Date: 09-03-16
 * Time: 13:24
 */
@NamedRequestScoped
public class ComponentFactoryProducer implements Serializable {
    @Inject
    private IClickResolver clickResolver;

    @Inject
    private IDataSourceFactory dataSourceFactory;

    @Inject
    private IComponentTypeResolver componentTypeResolver;

    @Inject
    private IDatasetProcessorFactory datasetProcessorFactory;

    @Produces
    public IComponentFactory createComponentFactory(InjectionPoint injectionPoint) {
        return new DefaultComponentFactory(dataSourceFactory,
                                           datasetProcessorFactory,
                                           componentTypeResolver,
                                           clickResolver);
    }
}
