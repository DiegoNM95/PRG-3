/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miembroscolegio;

import java.math.BigDecimal;

/**
 *
 * @Oscar Edgardo Villacorta
 */
public class  Administrativo extends Miembro {
    private BigDecimal sueldo;
    private String dui;
    
    Administrativo(String nombre, String apellido, String carnet, 
            String direccion, String genero, BigDecimal sueldo, String dui){
        super(nombre, apellido, carnet, direccion,genero);
        this.sueldo=sueldo;
        this.dui=dui;
    }    

    public BigDecimal getSueldo() {
        return sueldo;
    }

    public String getDui() {
        return dui;
    }
    
    @Override
    public String toString(){
        String texto="";
        texto="Nombre: "+getNombres()+"\n";
        texto+="Apellidos: "+getApellidos()+"\n";
        texto+="Carnet: "+getCarnet()+"\n";
        texto+="direccion: "+getDireccion()+"\n";
        texto+="genero: "+getGenero()+"\n";
        texto+="sueldo: "+getSueldo()+"\n";
        texto+="dui: "+getDui()+"\n";
        return texto;
    }
}
