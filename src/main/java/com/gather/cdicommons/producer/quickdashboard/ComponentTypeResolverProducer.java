package com.gather.cdicommons.producer.quickdashboard;

import com.gather.cdicommons.stereotype.NamedRequestScoped;
import com.gather.quickdashboard.core.component.ComponentType;
import com.gather.quickdashboard.core.component.DefaultComponentTypeResolver;
import com.gather.quickdashboard.core.component.IComponentTypeResolver;

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
 * Time: 13:05
 */
@NamedRequestScoped
public class ComponentTypeResolverProducer implements Serializable {

    @Produces
    public IComponentTypeResolver createComponentTypeResolver(InjectionPoint injectionPoint) {
        List<ComponentType> componentTypeList = new ArrayList<>();
        componentTypeList.add(ComponentType.DATATABLE);
        componentTypeList.add(ComponentType.LABEL);
        componentTypeList.add(ComponentType.MSCOLUMN);
        componentTypeList.add(ComponentType.MSCOLUMN3D);
        componentTypeList.add(ComponentType.MSLINE);
        componentTypeList.add(ComponentType.PIE);
        componentTypeList.add(ComponentType.SP);

        return new DefaultComponentTypeResolver(componentTypeList);
    }
}
