/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaSpring.com.repositories;

import javaSpring.com.model.Ticket;

/**
 *
 * @author Marian
 */

//Interfaz donde se va a generar el ticket
public interface GrabadorMulta {
    
    
    public void grabar(Ticket t);
}
