/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miembroscolegio;

import java.util.Date;

/**
 *
 * @author Cesar Kevin Sanchez Garcia
 */
public class Alumno{
    //private Date fechaMatricula;
    private int gradoAcademico;
    private String nombreResponsable;
    private int numeroResponsable;
    
    public Alumno(int gradoAcademico, String nombreResponsable, int numeroResponsable){
        //this.fechaMatricula = fechaMatricula;
        
        this.gradoAcademico = gradoAcademico;
        this.nombreResponsable = nombreResponsable;
        this.numeroResponsable = numeroResponsable;
        
    }
    
    //public Date getFechaMatricula (){
     //   return fechaMatricula;
        
    //}
    
    public int getGradoAcademico (){
        return gradoAcademico;
    }
    
    public String getNombreResponsable (){
        return nombreResponsable;
    }
    
    public int getNumeroResponsable(){
        return numeroResponsable;
    }
    
    
    public String toString(){
        
        String DatosAlumno;
        
        DatosAlumno= "Grado academico:" + getGradoAcademico() + "\n";
        DatosAlumno+= "Nombre Responsable:" + getNombreResponsable() 
                + "" + "Telefono del responsable:" + getNumeroResponsable() 
                + "\n"; 
        
        return DatosAlumno;
    }
}
