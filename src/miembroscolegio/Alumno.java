/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miembroscolegio;

/**
 *
 * @author Cesar Kevin Sanchez Garcia
 */

public class Alumno extends Miembro{
    private int gradoAcademico;
    
    
public Alumno(String nombres, String apellidos, String carnet
            , String direccion, String genero,
            int gradoAcademico)
    {
        //this.fechaMatricula = fechaMatricula;
        super(nombres, apellidos, carnet, direccion, genero);
        this.gradoAcademico = gradoAcademico;
    }
    
    //public Date getFechaMatricula (){
     //   return fechaMatricula;
        
    //}
    
    public int getGradoAcademico (){
        return gradoAcademico;
    }
    
    @Override
    public String toString(){
        String DatosAlumno;
        
        DatosAlumno= "Nombre: " + getNombres() + " " + getApellidos() + "\n";
        DatosAlumno+= "Carnet: " + getCarnet() + " " + "\n";
        DatosAlumno+= "Direccion: " + getDireccion() + "\n";
        DatosAlumno+= "genero: " + getGenero() + "\n";
        DatosAlumno+= "Grado académico: " + getGradoAcademico() + "\n"; 
        
        return DatosAlumno;
    }
}
