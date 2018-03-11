/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miembroscolegio;

import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Diego Navarrete Martínez
 */
public class MiembrosColegio {

    static ArrayList<Profesor> lsProfesores = new ArrayList<>();
    static ArrayList<Alumno> lsAlumnos = new ArrayList<>();
    static ArrayList<Administrativo> lsAdministrativo = new ArrayList<>();
    static ArrayList<Miembro> lsMiembro = new ArrayList<>();
    
    public String mostrarMenu(int c){
        String menu="";    
        //System.out.println("Elija una opción:");
        switch (c) {
            case 1:
                menu = "OPCIONES: \n";
                menu += "1. Administración de Profesores\n";
                menu += "2. Administracción de Alumnos\n";
                menu += "3. Administración de Personal Admnistrativo\n";
                menu += "4. Listar todos los miembros\n";
                menu += "5. Salir\n";
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
            case 4:
                menu = "OPCIONES: \n";
                menu += "1. Agregar Personal Administrativo: \n";
                menu += "2. Listar Personal Administrativo: \n";
                return menu;
            default:
                break;
        }
        return menu;
    }
    
    public String listarProfesores(){
        String listado = "";
        for(int i=0; i<lsProfesores.size(); i++){
            listado += (i+1) + ". "
                    +lsProfesores.get(i).getNombres()+ " " 
                    + lsProfesores.get(i).getApellidos()
                    +",";
        }
        return listado;
    }
    public String listarAlumnos(){
        String listado = "";
        for(int i=0; i<lsAlumnos.size(); i++){
            listado += (i+1) + ". "
                    +lsAlumnos.get(i).getNombres()+ " " 
                    + lsAlumnos.get(i).getApellidos()
                    +",";
        }
        return listado;
    }
    public String listarAdministrativo(){
        String listado = "";
        for(int i=0; i<lsAdministrativo.size(); i++){
            listado += (i+1) + ". "
                    +lsAdministrativo.get(i).getNombres()+ " " 
                    + lsAdministrativo.get(i).getApellidos()
                    +",";
        }
        return listado;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MiembrosColegio mcolegio = new MiembrosColegio();
        int option, option2;
        //Contadores de objetos
        int cProf=0,cAlum=0,cPAd=0;
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
                            salario = new BigDecimal(JOptionPane.showInputDialog( 
                                    "Ingrese salario de Profesor", 
                                    JOptionPane.INFORMATION_MESSAGE));
                            lsProfesores.add(new Profesor(nombres,apellidos,
                                    carnet,direccion,genero,salario,dui));
                            lsMiembro.add(lsProfesores.get(cProf));
                            cProf++;
                        break;
                        case 2:      
                            //System.out.println(mcolegio.listarProfesores());
                            String[] list = mcolegio.listarProfesores().split(",");
                            JComboBox jcb = new JComboBox(list);
                            jcb.setEditable(true);
                            JOptionPane.showMessageDialog( null, jcb, 
                                    "Listado de Profesores", 
                                    JOptionPane.QUESTION_MESSAGE);
                            JOptionPane.showMessageDialog(null,
                                    lsProfesores.get(
                                            jcb.getSelectedIndex()).toString(),
                                    "Profesor",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                break;
                case 2:
                    option2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                        mcolegio.mostrarMenu(3), "Administración de Miembros de"
                                + " Colegio", JOptionPane.INFORMATION_MESSAGE));
                    switch(option2){
                        case 1:
                            String nombres, apellidos, carnet, direccion,
                                    genero;
                            int grado;
                            nombres = JOptionPane.showInputDialog( 
                                    "Ingrese nombres de Alumno", 
                                    JOptionPane.INFORMATION_MESSAGE);
                            apellidos = JOptionPane.showInputDialog( 
                                    "Ingrese apellidos de Alumno", 
                                    JOptionPane.INFORMATION_MESSAGE);
                            carnet = JOptionPane.showInputDialog( 
                                    "Ingrese carnet de Alumno", 
                                    JOptionPane.INFORMATION_MESSAGE);
                            direccion = JOptionPane.showInputDialog( 
                                    "Ingrese direccion de Alumno", 
                                    JOptionPane.INFORMATION_MESSAGE);
                            genero = JOptionPane.showInputDialog( 
                                    "Ingrese genero de Alumno", 
                                    JOptionPane.INFORMATION_MESSAGE);
                            grado = Integer.parseInt(JOptionPane.showInputDialog( 
                                    "Ingrese grado de Alumno", 
                                    JOptionPane.INFORMATION_MESSAGE));
                            lsAlumnos.add(new Alumno(nombres,apellidos,
                                    carnet,direccion,genero, grado));
                            lsMiembro.add(lsAlumnos.get(cAlum));
                            cAlum++;
                        break;
                        case 2:      
                            String[] list = mcolegio.listarAlumnos().split(",");
                            JComboBox jcb = new JComboBox(list);
                            jcb.setEditable(true);
                            JOptionPane.showMessageDialog( null, jcb, 
                                    "Listado de Alumnos", 
                                    JOptionPane.QUESTION_MESSAGE);
                            JOptionPane.showMessageDialog(null,
                                    lsAlumnos.get(
                                            jcb.getSelectedIndex()).toString(),
                                    "Alumno",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                break;
                case 3:
                    option2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                        mcolegio.mostrarMenu(4), "Administración de Miembros de"
                                + " Colegio", JOptionPane.INFORMATION_MESSAGE));
                    switch(option2){
                        case 1:
                            String nombres, apellidos, carnet, direccion,
                                    genero, dui;
                            BigDecimal salario;
                            nombres = JOptionPane.showInputDialog( 
                                    "Ingrese nombres del Personal Administrativo", 
                                    JOptionPane.INFORMATION_MESSAGE);
                            apellidos = JOptionPane.showInputDialog( 
                                    "Ingrese apellidos del Personal Administrativo", 
                                    JOptionPane.INFORMATION_MESSAGE);
                            carnet = JOptionPane.showInputDialog( 
                                    "Ingrese carnet del Personal Administrativo", 
                                    JOptionPane.INFORMATION_MESSAGE);
                            direccion = JOptionPane.showInputDialog( 
                                    "Ingrese direccion del Personal Administrativo", 
                                    JOptionPane.INFORMATION_MESSAGE);
                            genero = JOptionPane.showInputDialog( 
                                    "Ingrese genero del Personal Administrativo", 
                                    JOptionPane.INFORMATION_MESSAGE);
                            dui = JOptionPane.showInputDialog( 
                                    "Ingrese dui del Personal Administrativo", 
                                    JOptionPane.INFORMATION_MESSAGE);
                            salario = new BigDecimal(JOptionPane.showInputDialog( 
                                    "Ingrese salario del Personal Administrativo", 
                                    JOptionPane.INFORMATION_MESSAGE));
                            lsAdministrativo.add(new Administrativo(nombres,apellidos,
                                    carnet,direccion,genero,salario,dui));
                            lsMiembro.add(lsAdministrativo.get(cPAd));
                            cPAd++;
                        break;
                        case 2:      
                            //System.out.println(mcolegio.listarProfesores());
                            String[] list = mcolegio.listarAdministrativo().split(",");
                            JComboBox jcb = new JComboBox(list);
                            jcb.setEditable(true);
                            JOptionPane.showMessageDialog( null, jcb, 
                                    "Listado de Personal Administrativo", 
                                    JOptionPane.QUESTION_MESSAGE);
                            JOptionPane.showMessageDialog(null,
                                    lsAdministrativo.get(
                                            jcb.getSelectedIndex()).toString(),
                                    "Personal Administrativo",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                break;
                case 4:
                    String listado = "";
                    for(int j=0; j<lsMiembro.size();j++){                  
                        listado += lsMiembro.get(j).toString() + "\n";
                        listado += "----------------------------------\n";
                    }
                    JOptionPane.showMessageDialog(null,listado ,
                                "Listado de miembros con detalles",
                                JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
        while(option!=5);
        
        /*while(option!=1){
            option = Integer.parseInt(JOptionPane.showInputDialog
        (null, mcolegio.mostrarMenu(1), "Administración de Miembros de Colegio",
                JOptionPane.INFORMATION_MESSAGE));
        }*/

    }
    
        
    
    
}
