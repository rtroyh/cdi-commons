package com.gather.cdicommons.producer.quickdashboard;

import com.gather.cdicommons.stereotype.NamedRequestScoped;
import com.gather.quickdashboard.core.datasource.DataSourceType;
import com.gather.quickdashboard.core.datasource.DefaultDataSourceTypeResolver;
import com.gather.quickdashboard.core.datasource.IDataSourceTypeResolver;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * $ Project: bci_ffmm_apv
 * User: rodrigotroy
 * Date: 09-03-16
 * Time: 11:27
 */
@NamedRequestScoped
public class DataSourceTypeResolverProducer implements Serializable {
    @Inject
    private List<DataSourceType> dataSourceTypes;

    @Produces
    public IDataSourceTypeResolver createDataSourceTypeResolver(InjectionPoint injectionPoint) {
        return new DefaultDataSourceTypeResolver(dataSourceTypes);
    }
}
