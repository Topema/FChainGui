/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg2018.gui.Utils;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Tomas
 */
public class PrivateKeyManager {
    
    public void savePrivKey(String privKey){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try{
            fichero = new FileWriter("C:/privKey.txt");
            pw = new PrintWriter(fichero);
            pw.print("prueba");
            
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try{
                if (null != fichero){
                    fichero.close();
                }
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }
    }
    
}
