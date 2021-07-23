/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaSpring.com.services;

import com.bolivarsoft.sensorclima.TipoClima;
import com.bolivarsoft.sensorvelocidad.DatosVehiculo;
import com.bolivarsoft.sensorvelocidad.TipoVehiculo;
import java.util.UUID;
import javaSpring.com.model.Ticket;
import javaSpring.com.repositories.GrabadorMulta;
import org.omg.CORBA.Current;

/**
 *
 * @author Marian
 */
// Cómo va a ser la inteligencia del evaluador
public class EvaluadorMultas {

    private GrabadorMulta grabadorMulta;

    public EvaluadorMultas(GrabadorMulta grabadorMulta) {
        this.grabadorMulta = grabadorMulta;
    }

    void evaluar(TipoClima tc, DatosVehiculo dv) {

        //AUTO
        if (tc == TipoClima.NORMAL && dv.tipoVehiculo == TipoVehiculo.Auto) {
            if (dv.velocidadMedida <= 130) {
                return;
            }
        }

        if (tc == TipoClima.LLUVIAS_MODERADAS && dv.tipoVehiculo == TipoVehiculo.Auto) {
            if (dv.velocidadMedida <= 110) {
                return;
            }
        }

        if (tc == TipoClima.LLUVIAS_TORRENCIALES && dv.tipoVehiculo == TipoVehiculo.Auto) {
            if (dv.velocidadMedida <= 90) {
                return;
            }
        }

        //MOTO
        if (tc == TipoClima.NORMAL && dv.tipoVehiculo == TipoVehiculo.Moto) {
            if (dv.velocidadMedida <= 130) {
                return;
            }
        }

        if (tc == TipoClima.LLUVIAS_MODERADAS && dv.tipoVehiculo == TipoVehiculo.Moto) {
            if (dv.velocidadMedida <= 110) {
                return;
            }
        }

        if (tc == TipoClima.LLUVIAS_TORRENCIALES && dv.tipoVehiculo == TipoVehiculo.Moto) {
            if (dv.velocidadMedida <= 90) {
                return;
            }
        }

        //CAMION
        if (tc == TipoClima.NORMAL && dv.tipoVehiculo == TipoVehiculo.Camion) {
            if (dv.velocidadMedida <= 90) {
                return;
            }
        }

        if (tc == TipoClima.LLUVIAS_MODERADAS && dv.tipoVehiculo == TipoVehiculo.Camion) {
            if (dv.velocidadMedida <= 80) {
                return;
            }
        }

        if (tc == TipoClima.LLUVIAS_TORRENCIALES && dv.tipoVehiculo == TipoVehiculo.Camion) {
            if (dv.velocidadMedida <= 70) {
                return;
            }
        }

        //TRACTOR
        if (tc == TipoClima.NORMAL && dv.tipoVehiculo == TipoVehiculo.Camion) {
            if (dv.velocidadMedida <= 60) {
                return;
            }
        }

        if (tc == TipoClima.LLUVIAS_MODERADAS && dv.tipoVehiculo == TipoVehiculo.Camion) {
            if (dv.velocidadMedida <= 60) {
                return;
            }
        }

        if (tc == TipoClima.LLUVIAS_TORRENCIALES && dv.tipoVehiculo == TipoVehiculo.Camion) {
            if (dv.velocidadMedida <= 60) {
                return;
            }
        }

        //si se dan condiciones, llamar a grabador multa
        
        Ticket t =new Ticket(
                UUID.randomUUID().toString(),
                System.currentTimeMillis()/1000,
                dv,
                tc.name(),
                100,
                dv.velocidadMedida      
                            );
        
        grabadorMulta.grabar(t);
    }

}
