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

public class Alumno extends Miembro{
    private int gradoAcademico;
    private String nombreResponsable;
    private int numeroResponsable;
    
    
public Alumno(String nombres, String apellidos, String carnet
            , String direccion, String genero,
            int gradoAcademico, String nombreResponsable, int numeroResponsable)
    {
        //this.fechaMatricula = fechaMatricula;
        super(nombres, apellidos, carnet, direccion, genero);
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
    
    @Override
    public String toString(){
        String DatosAlumno;
        
        DatosAlumno= "Nombre:" + getNombres() + " " + 
                getApellidos() + "\n";
        DatosAlumno+= "Carnet" + getCarnet() + " " + "\n";
        DatosAlumno+= "Direccion:" + getDireccion() + "\n";
        DatosAlumno+= "genero" + getGenero() + "\n";
        DatosAlumno+= "Grado academico:" + getGradoAcademico() + "\n";
        DatosAlumno+= "Nombre Responsable:" + getNombreResponsable() 
                + "" + "Telefono del responsable:" + getNumeroResponsable() 
                + "\n"; 
        
        return DatosAlumno;
    }
}
