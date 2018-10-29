/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg2018.gui.ApiManager;

import com.tfg2018.gui.RequestObjects.CheckToken;
import com.tfg2018.gui.RequestObjects.CreateTokenStructure;
import com.tfg2018.gui.ResponseObject.KeyPair;
import com.tfg2018.gui.ResponseObject.Token;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
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

    public PostOperationTest() throws Exception  {
        this.get = new GetOperation();
        this.post = new PostOperation();
        try {
            this.keyPair = this.get.getNewKeyPair();
        } catch (Exception ex) {
            System.out.println("wtf");
            throw new Exception(ex);
        }
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
    public void testValidateAddress() throws Exception {
        System.out.println("validateAddress");
        KeyPair test = new KeyPair(this.keyPair.getPrivkey());
        try {
            test = post.validateAddress(test);
            assertEquals(keyPair.getAddress(), test.getAddress());
        } catch (Exception e) {
            assert (false);
            throw new Exception(e);
        }
    }

    @Test
    public void testIssueNewToken() throws Exception {
        System.out.println("IssueNewtoken");
        Map<String, String> params = new HashMap<String, String>();
        params.put("param1", "param1");
        params.put("param2", "param2");
        CreateTokenStructure newToken = new CreateTokenStructure(this.keyPair.getAddress(), randomString(), params);
        try {
            Token response = post.generateToken(newToken);
            CheckToken check = new CheckToken(response.getName());
            assertEquals(post.getTokenInfo(check).getName(),response.getName());
        } catch (Exception ex) {
            assert(false);
            throw new Exception(ex);
        }
    }

    private String randomString() {
        int length = 32;
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvwxyz"
                + "0123456789";
        String str = new Random().ints(length, 0, chars.length())
                .mapToObj(i -> "" + chars.charAt(i))
                .collect(Collectors.joining());
        return str;
    }

}
