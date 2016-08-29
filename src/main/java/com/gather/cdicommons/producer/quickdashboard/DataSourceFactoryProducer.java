package com.gather.cdicommons.producer.quickdashboard;

import com.gather.quickdashboard.core.datasource.DefaultDataSourceFactory;
import com.gather.quickdashboard.core.datasource.IDataSourceFactory;
import com.gather.quickdashboard.core.datasource.IDataSourceTypeResolver;

import javax.annotation.Resource;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * $ Project: bci_ffmm_apv
 * User: rodrigotroy
 * Date: 09-03-16
 * Time: 12:48
 */
@Named
@RequestScoped
public class DataSourceFactoryProducer implements Serializable {
    @Resource(name = "jdbc/COMAPV")
    private DataSource ds;

    @Inject
    private IDataSourceTypeResolver dataSourceTypeResolver;

    @Produces
    public IDataSourceFactory createDataSourceFactory(InjectionPoint injectionPoint) {
        return new DefaultDataSourceFactory(ds,
                                            dataSourceTypeResolver);
    }
}
