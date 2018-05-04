/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2_joselagos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tali_
 */
public class Lab2_JoseLagos {
static Scanner entrada = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido Maestro de UNITEC");
        System.out.println("1.Administracion");
        System.out.println("2.Crear Cuenta");
        System.out.println("3.Log in");
        ArrayList<String>preguntas=new ArrayList();
        ArrayList<String>examenes= new ArrayList();
        ArrayList<String>respuestas= new ArrayList();
        ArrayList<String>materias= new ArrayList();
        int menu = entrada.nextInt();
        switch (menu){
            case 1:
                System.out.println("1.Crear examen");
                System.out.println("2.Revisar examen");
                System.out.println("3.Ver notas");
                System.out.println("4.Modificar notas");
                switch (menu){
                    case 1:
                        char resp = 's';
                        System.out.println("Ingrese la materia de cual hara el examen");
                        String materia = entrada.next();
                        materias.add(materia);
                        while(resp=='s' || resp=='s'){
                            System.out.println("Ingrese la pregunta:");
                            String pregunta = entrada.nextLine();
                            System.out.println("Ingrese la respuesta");
                            String respuesta=entrada.nextLine();
                            preguntas.add(pregunta);
                            respuestas.add(respuesta);
                            System.out.println("Desea ingresar otra pregunta?");
                            resp = entrada.next().charAt(0);
                        }
                        break;
                }
                break;
        }
    }
    
}
