/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miembroscolegio;

import javax.swing.JOptionPane;

/**
 *
 * @author Luis Diego Navarrete Martínez
 */
public class MiembrosColegio {

    public String mostrarMenu(int c){
        String menu="";    
        
        System.out.println("Elija una opción:");
        
        if(c==1){
            menu = "OPCIONES: \n";
            menu += "1. Administración de Profesores\n";
            menu += "2. Administracción de Alumnos\n";
            menu += "3. Administración de Personal Admnistrativo\n";
            menu += "4. Salir\n";
            return menu;
        }
        else if(c==2){
            menu = "OPCIONES: \n";
            menu += "1. Agregar Profesor: \n";
            menu += "2. Listar Profesores: \n";
            return menu;
        }
        return menu;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MiembrosColegio mcolegio = new MiembrosColegio();
        int option;
        do{option = Integer.parseInt(JOptionPane.showInputDialog(null,
                mcolegio.mostrarMenu(1), "Administración de Miembros de Colegio", 
                JOptionPane.INFORMATION_MESSAGE));}
        while(option!=4);
        
        /*while(option!=1){
            option = Integer.parseInt(JOptionPane.showInputDialog
        (null, mcolegio.mostrarMenu(1), "Administración de Miembros de Colegio",
                JOptionPane.INFORMATION_MESSAGE));
        }*/
        
        
    }
    
        
    
    
}
