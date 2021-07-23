/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaSpring.com.model;

import com.bolivarsoft.sensorvelocidad.DatosVehiculo;

/**
 *
 * @author Marian
 */
public class Ticket {
    
    public String idTicket;
    public Long fechaHora;
    public DatosVehiculo datosVehiculo;
    public String situacionClimatologica;
    public Integer LimiteVelPermitido;
    public Integer limiteMedido;
    
    public Ticket(){}

    public Ticket(String idTicket, Long fechaHora, DatosVehiculo datosVehiculo, String situacionClimatologica, Integer LimiteVelPermitido, Integer limiteMedido) {
        this.idTicket = idTicket;
        this.fechaHora = fechaHora;
        this.datosVehiculo = datosVehiculo;
        this.situacionClimatologica = situacionClimatologica;
        this.LimiteVelPermitido = LimiteVelPermitido;
        this.limiteMedido = limiteMedido;
    }
    
    
}

/*

El ticket debe tener IDTicket, FechaYhora, DatosDelVehiculo,
SituacionClimatologica, LimiteVelocidadPermitido, limiteMedido.


*/




