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
        char respuesta_inicial = 's';
        ArrayList<Integer> examenes = new ArrayList();
        ArrayList<String> materias = new ArrayList();
        Examenes ex = new Examenes();
        Alumnos al = new Alumnos();
        while (respuesta_inicial == 's' || respuesta_inicial == 'S') {
            System.out.println("Bienvenido Maestro de UNITEC");
            System.out.println("1.Administracion");
            System.out.println("2.Crear Cuenta");
            System.out.println("3.Log in");
           
            int menu = entrada.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("QUE DESEA HACER?");
                    System.out.println("1.Crear Examen");
                    System.out.println("2.Revisar Examen");
                    System.out.println("3.Ver Notas");
                    System.out.println("4.Modificar Datos");
                    int menu2 = entrada.nextInt();
                    switch (menu2){
                        case 1:
                            System.out.println("Cuantas preguntas va ingresar?");
                            int pregunt = entrada.nextInt();
                            examenes.add(pregunt);
                            System.out.println("Ingrese la materia de el examen");
                            entrada = new Scanner(System.in);
                            String materia= entrada.nextLine();
                            ex.materias.add(materia);
                            for (int a=1;a<=pregunt;a++){
                                System.out.println("Ingrese la pregunta numero"+a);
                                 entrada = new Scanner(System.in);
                                String pregunta = entrada.nextLine();
                                ex.preguntas.add(pregunta);
                            }
                            break;
                        case 2:
                            break;
                            }
                    break;
                case 2:
                    System.out.println("Ingrese su nombre");
                    entrada = new Scanner(System.in);
                    al.nombre.add(entrada.nextLine());
                    System.out.println("Ingrese su numero de cuenta");
                    entrada = new Scanner(System.in);
                    al.numero.add(entrada.nextLine());
                    System.out.println("Ingrese su fecha de nacimiento");
                    entrada = new Scanner(System.in);
                    al.fecha.add(entrada.nextLine());
                    System.out.println("Ingrese su edad");
                    entrada = new Scanner(System.in);
                    al.edad.add(entrada.nextLine());
                    System.out.println("Ingrese su cuidad de residencia");
                    entrada = new Scanner(System.in);
                    al.residencia.add(entrada.nextLine());
                    System.out.println("Ingrese su nacionalidad");
                    entrada = new Scanner(System.in);
                    al.nacionalidad.add(entrada.nextLine());
                    System.out.println("Ingrese su ID");
                    entrada = new Scanner(System.in);
                    al.id.add(entrada.nextLine());
                    System.out.println("Ingrese su nombre de usuario");
                    entrada = new Scanner(System.in);
                    al.user.add(entrada.nextLine());
                    System.out.println("Ingrese su password");
                    entrada = new Scanner(System.in);
                    al.password.add(entrada.nextLine());
                    break;
                case 3:
                    System.out.println("Ingrese su nombre de usuario");
                    entrada = new Scanner(System.in);
                    String name = entrada.nextLine();
                    for(int a=0;a<al.user.size();a++){
                        if (name.equals(al.user.get(a))){
                            System.out.println("Ingrese su password");
                            entrada = new Scanner(System.in);
                            String pass= entrada.nextLine();
                            for(int b=0;a<al.password.size();a++){
                                if(pass.equals(al.password.get(b))){
                                    int pos = b;
                                    System.out.println("1.Ver Datos");
                                    System.out.println("2.Modificar Datos");
                                    System.out.println("3.Realizar Evaluaciones");
                                    System.out.println("4.");
                                }
                                else{
                                    System.out.println("Contrasena equivocada");
                                }
                            }
                        }
                        else{
                            System.out.println("no existe ese usuario");
                        }
                    }
                    break;
                    }

      
            }
            System.out.println("Desea hacer otra operacion?");
            respuesta_inicial = entrada.next().charAt(0);
        }
    }


