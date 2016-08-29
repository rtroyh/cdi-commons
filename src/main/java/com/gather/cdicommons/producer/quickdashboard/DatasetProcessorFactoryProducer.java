package com.gather.cdicommons.producer.quickdashboard;

import com.gather.quickdashboard.core.dataset.*;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * $ Project: bci_ffmm_apv
 * User: rodrigotroy
 * Date: 09-03-16
 * Time: 13:16
 */

@Named
@RequestScoped
public class DatasetProcessorFactoryProducer implements Serializable {

    @Produces
    public IDatasetProcessorFactory createDatasetProcessorFactory(InjectionPoint injectionPoint) {
        List<IDatasetProcessor> datasetProcessorList = new ArrayList<>();
        datasetProcessorList.add(new PFLineDatasetProcessor());
        datasetProcessorList.add(new CustomPieDatasetProcessor());
        datasetProcessorList.add(new DataTableDatasetProcessor());
        datasetProcessorList.add(new LabelDatasetProcessor());
        datasetProcessorList.add(new StoredProcedureDatasetProcessor());

        return new DefaultDatasetProcessorFactory(datasetProcessorList);
    }
}
