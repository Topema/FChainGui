/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg2018.gui.ApiManager;

import com.tfg2018.gui.Object.KeyPair;
import java.io.IOException;
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
public class PostOperationTest {
    
        private final GetOperation get;
        private final PostOperation post;
        private final KeyPair keyPair;
        
    
    public PostOperationTest() throws IOException {
        this.get = new GetOperation();
        this.post = new PostOperation();
        this.keyPair = this.get.getNewKeyPair();
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
     * Test of validateAddress method, of class PostOperation.
     */
    @Test
    public void testValidateAddress() throws Exception{
        System.out.println("validateAddress");
        KeyPair test = new KeyPair(this.keyPair.getPrivkey());
        try{
            test = post.validateAddress(test);
            assertEquals(keyPair.getAddress(), test.getAddress());
        }catch(Exception e){
            assert(false);
            throw new Exception (e);
        }
    }
    
}
