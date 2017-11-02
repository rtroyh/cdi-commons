package com.gather.cdicommons.producer.quickdashboard;

import com.gather.cdicommons.stereotype.NamedRequestScoped;
import com.gather.quickdashboard.core.datasource.DataSourceType;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * $ Project: bci_ffmm_apv
 * User: rodrigotroy
 * Date: 09-03-16
 * Time: 11:34
 */
@NamedRequestScoped
public class DataSourceTypeListProducer implements Serializable {

    @Produces
    public List<DataSourceType> createDataSourceTypeList(InjectionPoint injectionPoint) {
        List<DataSourceType> typeList = new ArrayList<>();
        typeList.add(DataSourceType.DB2_SP);
        typeList.add(DataSourceType.FROM_LOOP);

        return typeList;
    }
}
