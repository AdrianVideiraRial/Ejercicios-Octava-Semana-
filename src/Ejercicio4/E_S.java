package Ejercicio4;
/*Crea una clase llamada “E_S” (de entrada/salida). Crea tres métodos:
1. Debe recibir una cadena de caracteres y devolver una cadena de
caracteres, solicitando al usuario dicha cadena.
2. Debe recibir una cadena de caracteres y devolver un valor entero,
solicitando al usuario dicho valor entero.
3. Debe recibir una cadena de caracteres y mostrar por pantalla esa
misma cadena.*/

import java.util.Random;
import java.util.Scanner;

public class E_S {
    //Memoria
    Scanner entrada = new Scanner(System.in);
    //Variables

    //Métodos

    //Método 1: Caracteres
    public void array_caracteres (){
        int largo;
        System.out.println("METODO:1");
        System.out.println("Define el largo del array");
        largo= entrada.nextInt();

        char[] matriz_caracteres = new char[largo];

        //llenado matriz
        for(int i=0;i<matriz_caracteres.length;i++){
            System.out.println("Escribe un Caracter");
            matriz_caracteres[i]=entrada.next().charAt(0);
        }
        //Mostrar matriz
        for(int i=0;i<matriz_caracteres.length;i++){
            System.out.println("Indice "+i+" = "+matriz_caracteres[i]);
        }
    }

    //Método 2: Caracteres a enteros.
    public void array_mixto(){

        System.out.println("METODO:2 \n");
        char[] matriz_caracteres={'a','b','c','d','e'};


        //llenado matriz
        //Mostrar matriz
        for(int i=0;i<matriz_caracteres.length;i++){

            System.out.println("Indice "+i+" = "+matriz_caracteres[i]);
        }



    }
    //Método 3: Caracteres a caracteres.
      public void array_cadena(){
        //Variables
        int cadena;
        String letras = new String("abcdefghijklmnñopqrstuvwxyz");
        Random numeroLetra = new Random();

        System.out.println("METODO:3");
        System.out.println("Define el largo de la cadena de caracteres");
        cadena= entrada.nextInt();

        char[] matriz_caracteres = new char[cadena];
        //Mensaje Resultado
        System.out.println("La cadena de caracteres es: ");

        //llenado matriz
        for(int i=0;i<matriz_caracteres.length;i++){

            matriz_caracteres[i]=(char)numeroLetra.nextInt(letras.length()-1);
        }
        //Mostrar matriz
        for(int i=0;i<matriz_caracteres.length;i++){
            System.out.println("Indice "+i+" = "+letras.charAt(matriz_caracteres[i]));
        }

    }


    public static void main(String[] args) {

        E_S matriz_1 = new E_S();
        matriz_1.array_caracteres();

        E_S matriz_2 = new E_S();
        matriz_2.array_mixto();

        E_S matriz_3 = new E_S();
        matriz_3.array_cadena();

    }




}
