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
    
    public String toString(){
        String DatosAlumno;
        Miembro MiembrosClass = new Miembro(nombres, apellidos, carnet, direccion, genero);
        DatosAlumno= "Nombre:" + MiembrosClass.getNombres() + " " + 
                MiembrosClass.getApellidos() + "\n";
        DatosAlumno+= "Carnet" + MiembrosClass.getCarnet() + " " + "\n";
        DatosAlumno+= "Direccion:" + MiembrosClass.getDireccion() + "\n";
        DatosAlumno+= "genero" + MiembrosClass.getGenero() + "\n";
        DatosAlumno+= "Grado academico:" + getGradoAcademico() + "\n";
        DatosAlumno+= "Nombre Responsable:" + getNombreResponsable() 
                + "" + "Telefono del responsable:" + getNumeroResponsable() 
                + "\n"; 
        
        return DatosAlumno;
    }
}
