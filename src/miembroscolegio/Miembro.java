/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miembroscolegio;

import java.util.Date;



/**
 *
 * @author Vidal Useda
 */
public class Miembro {
   protected String nombres;
   protected String apellidos;
   protected String carnet;
   protected Date fechaNacimiento;
   protected String direccion;
   protected String genero;
   
   Miembro(String nombres, String apellidos, String carnet, String direccion,
           String genero ){
   this.nombres=nombres;
   this.apellidos=apellidos;
   this.carnet=carnet;
   //this.fechaNacimiento=fechaNacimiento;
   this.direccion=direccion;
   this.genero=genero;
   }
   
   public String getNombres(){
   return nombres;
   }
   public String getApellidos(){
   return apellidos;
   }
        public String getCarnet(){
   return carnet;     
   }
     public Date getFechaNac(){
   return fechaNacimiento;
     }
       public String getDireccion(){
   return direccion;
     }
     public String getGenero(){
   return genero;
     }
   @Override
    public String toString ()
    {
     String texto;
 
     texto = "Nombre: "+ getNombres() + " "  + getApellidos() + "\n"; 
     texto +="Carnet: "+ getCarnet()+ " " +"\n";
     texto +="direccion: "+getDireccion()+ "\n";
     texto +="Genero: " +getGenero()+"\n";
     
     return texto;
    }
    
    
     
}
