package com.gather.cdicommons.producer;

import com.gather.cdicommons.producer.type.DBComAPV;
import com.gather.cdicommons.producer.type.DBSybase;
import com.gather.cdicommons.producer.type.DBTributar;
import com.gather.cdicommons.stereotype.NamedRequestScoped;
import com.gather.gathercommons.jdbc.SQLHelper;

import javax.annotation.Resource;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.sql.DataSource;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * $ Project: bci_ffmm_apv
 * User: rodrigotroy
 * Date: 22-02-16
 * Time: 16:44
 */
@NamedRequestScoped
public class SQLHelperProducer implements Serializable {
    @Resource(name = "jdbc/COMAPV")
    private DataSource dsCOMAPV;

    @Resource(name = "jdbc/TRIBUTAR")
    private DataSource dsTributar;

    @Resource(name = "jdbc/FMParticipes")
    private DataSource dsFMParticipes;

    @Produces
    @DBComAPV
    public SQLHelper createSQLHelperComapv(InjectionPoint injectionPoint) {
        return new SQLHelper(dsCOMAPV);
    }

    @Produces
    @DBTributar
    public SQLHelper createSQLHelperTributar(InjectionPoint injectionPoint) {
        return new SQLHelper(dsTributar);
    }

    @Produces
    @DBSybase
    public SQLHelper createSQLHelperSybase(InjectionPoint injectionPoint) {
        return new SQLHelper(dsFMParticipes);
    }
}
