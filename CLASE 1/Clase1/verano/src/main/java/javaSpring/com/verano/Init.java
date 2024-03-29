/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaSpring.com.verano;

import com.bolivarsoft.sensorclima.SensorClima;
import com.bolivarsoft.sensorvelocidad.SensorVelocidad;
import javaSpring.com.services.EvaluadorMultas;
import javaSpring.com.services.GrabadorMultaJson;
import javaSpring.com.services.SensorInEternum;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marian
 */
@Service
public class Init implements CommandLineRunner{
    //Implementación de interface
    
    //llamada de nuevo metodo factory -> para llamar a sensar
    private static SensorInEternum factory() {
        return new SensorInEternum(
                new SensorClima(),
                new SensorVelocidad(),
                new EvaluadorMultas(
                        new GrabadorMultaJson()
                )
        );
    }
    
    @Override
    public void run(String... args) throws Exception {
        
       //ejecución de aplicación
       factory().sensar();
    }
  
}
