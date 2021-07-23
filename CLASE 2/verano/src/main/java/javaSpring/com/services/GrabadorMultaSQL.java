/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaSpring.com.services;

import javaSpring.com.model.Ticket;
import javaSpring.com.repositories.GrabadorMulta;

/**
 *
 * @author Marian
 */
public class GrabadorMultaSQL implements GrabadorMulta{

    @Override
    public void grabar(Ticket t) {
        System.out.println("Grabando Ticket en formato SQL");
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
