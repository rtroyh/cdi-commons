package com.gather.cdicommons.producer.quickpdf;

import com.gather.pdfcommons.quickpdf.PDFBuilder;
import com.gather.pdfcommons.quickpdf.writer.DocumentWriter;
import com.gather.pdfcommons.quickpdf.writer.IElementWriter;
import com.gather.pdfcommons.quickpdf.writer.PDFContentByteWriter;

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
 * Date: 29-03-16
 * Time: 18:57
 */

@Named
@RequestScoped
public class PDFBuilderProducer implements Serializable {
    @Produces
    public PDFBuilder createPDFBuilder(InjectionPoint injectionPoint) {
        List<IElementWriter> elementWriterList = new ArrayList<>();
        elementWriterList.add(new PDFContentByteWriter());
        elementWriterList.add(new DocumentWriter());

        return new PDFBuilder(elementWriterList);
    }
}
