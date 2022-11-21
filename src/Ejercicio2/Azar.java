package Ejercicio2;

import java.util.Scanner;

public class Azar {

    Scanner entrada = new Scanner(System.in); //MEMORIA
    //VARIABLES
    int x;
    int maximo;
    int minimo;

    //MÉTODO NUMERO ALEATORIO
    public void aleatorio(){
        System.out.println("Introduce un valor máximo");
        maximo = entrada.nextInt();
        System.out.println("Introduce un valor mínimo");
        minimo = entrada.nextInt();

        x = (int)(Math.random()*(maximo-minimo))+minimo;
        System.out.println();
    }

    public void resultado_aleatorio (){
        System.out.println("El resultado entre el rango "+ maximo +" y "+ minimo + " es "+ x);
    }

}
