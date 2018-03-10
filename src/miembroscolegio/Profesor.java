/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miembroscolegio;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @Henry Moises Marinero Gutierrez.
 */
public class Profesor {
    private BigDecimal sueldo;
    private String dui;
    //private Date fechaIngreso;
    
    public Profesor(BigDecimal sueldo, String dui){
        this.sueldo = sueldo;
        this.dui = dui;
        //this.fechaIngreso= fechaIngreso;
        
      
    }
      public BigDecimal getSueldo(){
        return sueldo;
            
        }
      
      public String getdui(){
        return dui;
            
        }
      /*public Date getfechaIngreso(){
        return fechaIngreso;
            
        }*/
      public String toString(){
        String DatosProfesor;
        
        DatosProfesor="Sueldo: "+ getSueldo() + "\n";
        DatosProfesor += "Dui "+ getdui() + "\n";
       
        
        return DatosProfesor;
    }
            
        }
    

