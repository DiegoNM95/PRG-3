/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miembroscolegio;

import java.math.BigDecimal;
/**
 *
 * @Henry Moises Marinero Gutierrez.
 */
public class Profesor extends Miembro {
    private BigDecimal sueldo;
    private String dui;
    //private Date fechaIngreso;
    
    public Profesor(String nombres, String apellidos, String carnet, 
            String direccion, String genero, BigDecimal sueldo, String dui){
        super(nombres, apellidos, carnet, direccion, genero);
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
      @Override
      public String toString(){
        String DatosProfesor;
        
        DatosProfesor="Sueldo: "+ getSueldo() + "\n";
        DatosProfesor += "Dui: "+ getdui() + "\n";
        DatosProfesor += "Nombres: " + getNombres() + "\n";
        DatosProfesor += "Apellidos: " +getApellidos() + "\n";
        DatosProfesor += "Carnet:" + getCarnet() + " " + "\n";
        DatosProfesor += "Direccion: " + getDireccion() + "\n";
        DatosProfesor += "Género: " + getGenero() + "\n";
   
        return DatosProfesor;
    }
            
}
    

