/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg2018.gui.factura;

import com.tfg2018.gui.RequestObjects.CreateTokenStructure;
import javax.xml.parsers.ParserConfigurationException;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.xml.sax.SAXException;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Tomas
 */
public class ComprobanteTest {

    public ComprobanteTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void test() throws ParserConfigurationException, SAXException, IOException, Exception {

        try {
            File archivo = new File("sample.xml");
            InvoiceReader i = new InvoiceReader();
            Factura result = i.readInvoice(archivo);
            CreateTokenStructure test = new CreateTokenStructure("test", result.getTokenParameters());
            System.out.println(test.getTokenName());
            assert true;
        }catch(Exception e){
            assert false;
        }

    }
}
