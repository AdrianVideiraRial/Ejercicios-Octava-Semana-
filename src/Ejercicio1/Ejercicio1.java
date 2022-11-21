package Ejercicio1;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class Ejercicio1 {

    public static void main(String[] args) {
         /*Crea un método que permita al usuario insertar datos en un array y otro que
        muestre los datos que contiene el array y sus índices (posiciones) hasta que el
        usuario decida parar (bucle). Los array se pueden pasar como parámetros a
        las funciones o devolverlos igual que el resto de variables.*/

        // variable que define el tamaño del array
        Scanner entrada = new Scanner(System.in);
        int nElementos;
        int a;

        do {
            System.out.println("Define cual es el largo del array");
            nElementos = entrada.nextInt();

            int[] numeros = new int[nElementos];//Creamos array según largo definido por el usuario,

            for (int i = 0; i < nElementos; i++) {//Creamos bucle for para pedir al usuario que ingrese los valores y los guardamos.
                System.out.println("Escribe un numero para la posición " + (i) + " del array");
                numeros[i] = entrada.nextInt();
            }

            System.out.println("Los numeros del array son:");//Mostramos los valores en pantalla.
            for (int i = 0; i < nElementos; i++) {
                System.out.println("Indice " + (i) + "= " + numeros[i]);
            }
            System.out.println("Si deseas salir pulsa la teclas 5");
            a = entrada.nextInt();
        } while (a != 5);
        System.out.println("Has salido del programa");
    }
}


