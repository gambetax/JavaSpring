/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaSpring.com.services;

import com.google.gson.Gson;
import java.io.File;
import javaSpring.com.model.Ticket;
import javaSpring.com.repositories.GrabadorMulta;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Marian
 */
public class GrabadorMultaJson implements GrabadorMulta{
    
     @Override
    public void grabar(Ticket t) {
        System.out.println("Grabando Ticket en formato JSON");
        
        
         try {
             
             String nomArch = String.join("", "/tickets/", t.idTicket, ".json");
             File arch = new File(nomArch);
             
             Gson gson = new Gson();
             String strJson = gson.toJson(t);
             
             System.out.println("DATA: " + strJson);
             FileUtils.writeStringToFile(arch, strJson, "UTF-8");
             
         } catch (Exception ex) {
             System.out.println(ex.getMessage());
             
         }
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
