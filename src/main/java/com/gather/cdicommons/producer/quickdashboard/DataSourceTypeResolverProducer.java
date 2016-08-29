package com.gather.cdicommons.producer.quickdashboard;

import com.gather.quickdashboard.core.datasource.DataSourceType;
import com.gather.quickdashboard.core.datasource.DefaultDataSourceTypeResolver;
import com.gather.quickdashboard.core.datasource.IDataSourceTypeResolver;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * $ Project: bci_ffmm_apv
 * User: rodrigotroy
 * Date: 09-03-16
 * Time: 11:27
 */
@Named
@RequestScoped
public class DataSourceTypeResolverProducer implements Serializable {
    @Inject
    private List<DataSourceType> dataSourceTypes;

    @Produces
    public IDataSourceTypeResolver createDataSourceTypeResolver(InjectionPoint injectionPoint) {
        return new DefaultDataSourceTypeResolver(dataSourceTypes);
    }
}
