/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miembroscolegio;

import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Diego Navarrete Martínez
 */
public class MiembrosColegio {

    public String mostrarMenu(int c){
        String menu="";    
        
        System.out.println("Elija una opción:");
        
        switch (c) {
            case 1:
                menu = "OPCIONES: \n";
                menu += "1. Administración de Profesores\n";
                menu += "2. Administracción de Alumnos\n";
                menu += "3. Administración de Personal Admnistrativo\n";
                menu += "4. Salir\n";
                return menu;
            case 2:
                menu = "OPCIONES: \n";
                menu += "1. Agregar Profesor: \n";
                menu += "2. Listar Profesores: \n";
                return menu;
            case 3:
                menu = "OPCIONES: \n";
                menu += "1. Agregar Alumnos: \n";
                menu += "2. Listar Alumnos: \n";
                return menu;
            default:
                break;
        }
        return menu;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MiembrosColegio mcolegio = new MiembrosColegio();
        ArrayList<Profesor> lsProfesores = new ArrayList<>();
        int option, option2;
        do{
            option = Integer.parseInt(JOptionPane.showInputDialog(null,
                    mcolegio.mostrarMenu(1), "Administración de Miembros de "
                            + "Colegio", JOptionPane.INFORMATION_MESSAGE));
            switch(option){
                case 1:
                    option2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                        mcolegio.mostrarMenu(2), "Administración de Miembros de"
                                + " Colegio", JOptionPane.INFORMATION_MESSAGE));
                    switch(option2){
                        case 1:
                            String nombres, apellidos, carnet, direccion,
                                    genero, dui;
                            BigDecimal salario;
                            nombres = JOptionPane.showInputDialog( 
                                    "Ingrese nombres de Profesor", 
                                    JOptionPane.INFORMATION_MESSAGE);
                            apellidos = JOptionPane.showInputDialog( 
                                    "Ingrese apellidos de Profesor", 
                                    JOptionPane.INFORMATION_MESSAGE);
                            carnet = JOptionPane.showInputDialog( 
                                    "Ingrese carnet de Profesor", 
                                    JOptionPane.INFORMATION_MESSAGE);
                            direccion = JOptionPane.showInputDialog( 
                                    "Ingrese direccion de Profesor", 
                                    JOptionPane.INFORMATION_MESSAGE);
                            genero = JOptionPane.showInputDialog( 
                                    "Ingrese genero de Profesor", 
                                    JOptionPane.INFORMATION_MESSAGE);
                            dui = JOptionPane.showInputDialog( 
                                    "Ingrese dui de Profesor", 
                                    JOptionPane.INFORMATION_MESSAGE);
                            salario = BigDecimal.valueOf(2555);
                            lsProfesores.add(new Profesor(nombres, 
                                    apellidos, carnet, 
                                    direccion, genero, 
                                    salario,dui));
                            break;
                        case 2:
                            System.out.println(lsProfesores.toString());
                    }
                    break;
                case 2:
                    option2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                        mcolegio.mostrarMenu(3), "Administración de Miembros de"
                                + " Colegio", JOptionPane.INFORMATION_MESSAGE));
                    break;
            }
        }
        while(option!=4);
        
        /*while(option!=1){
            option = Integer.parseInt(JOptionPane.showInputDialog
        (null, mcolegio.mostrarMenu(1), "Administración de Miembros de Colegio",
                JOptionPane.INFORMATION_MESSAGE));
        }*/
        
        
    }
    
        
    
    
}
