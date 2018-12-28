/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg2018.gui.ApiManager;

import com.tfg2018.gui.ResponseObject.KeyPair;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tomas
 */
public class GetOperationTest {

    private final GetOperation get;

    public GetOperationTest() {
        this.get = new GetOperation();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getNewKeyPair method, of class GetOperation.
     */
    @Test
    public void testGetNewKeyPair() throws Exception {
        try {
            get.getNewKeyPair();
            assert (true);
        } catch (Exception e) {
            assert (false);

        }

    }

}
