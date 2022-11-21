package Ejercicio3;
/*Crea un método que dado una cantidad de datos X y un rango de estos,
genere un array con X cantidad de datos generados al azar en el rango
pedido y muestralos por pantalla.*/

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ejercicio3 {
    //Memoria
    Scanner entrada = new Scanner(System.in);
    //Método
    public void array_aleatorio(){
        //variables
        int largo;
        int maximo;
        int minimo;

        //Definimos la cantidad de datos
        System.out.println("Define el largo del array");
        largo = entrada.nextInt();

        //Definimos el rango de esos datos (entre el máximo y el minimo)
        System.out.println("Introduce un valor máximo");
        maximo = entrada.nextInt();

        System.out.println("Introduce un valor mínimo");
        minimo = entrada.nextInt();

        int[]matriz=new int[largo];

        //Rellenado aleatorio matriz.
        for(int i=0;i<matriz.length;i++){

            matriz[i]=(int)(Math.random()*(maximo-minimo))+minimo;

            System.out.println("Indice " +i+"= "+matriz[i]);
        }
    }


    public static void main(String[] args) {

        //Creamos nuestro objeto
        Ejercicio3 mi_matriz = new Ejercicio3();

        mi_matriz.array_aleatorio();

    }

}
