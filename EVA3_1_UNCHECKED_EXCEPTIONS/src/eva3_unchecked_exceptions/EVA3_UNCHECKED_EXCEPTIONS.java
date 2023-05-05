/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_unchecked_exceptions;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_UNCHECKED_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // TODO code application logic here
        
        
//        son todas de RUNTIME EXCEPTION
        //Arithmetic exception: division entre cero
        System.out.println("Inicio el programa");
        System.out.println("Declarano variables");
        
        int  x = 5, y = 0;
        System.out.println("Intentar la división");
        int resu = x / y;
//                        Si no se atiende , el programa se termina
        System.out.println("Resultado:" + resu);
                
        //imputmismatch exception
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el número:");
        int num = input.nextInt();//si el usuario captura una cadena de 
                                 //que no se pueda convertir a número
                                 //Se produce una exception y termina el 
                                 //programa
        System.out.println("El número es:" + num);
        
        
//        ArrayIndexOutOfBounds Exceptions
        int[] arreglo = new int [5];//Arreglo con 5 posiciones
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
        arreglo[5] = 600; //<--? 5 no es un indice válido,
//                          el arreglo va de 0 a 4
        
        
        //NULLPOINTER EXCEPTION
        Prueba objPrueba=null;
        System.out.println(objPrueba.x); 
    }
    
}


class Prueba{
    public int x=100;
}