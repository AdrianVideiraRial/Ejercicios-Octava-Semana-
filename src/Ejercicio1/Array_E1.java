package Ejercicio1;

import java.util.Scanner;

public class Array_E1 {
    //Memoria
    Scanner entrada = new Scanner(System.in);
    //Variables
    int[]matriz=new int[3];
    int i;

    //METODOS
    //METODO INTRODUCIR VALORES
    public void rellenar_matriz(){
        for(i=0;i<matriz.length;i++){
            System.out.println("Introduce un numero entero");
            matriz[i]=entrada.nextInt();
        }
    }
    //METODO MOSTRAR VALORES
    public void mostrar_matriz(){

        for(i=0;i<matriz.length;i++){
            System.out.println("Valor indice "+ i +"= "+ matriz[i]);
        }
    }
    //METODO MAIN
    public static void main(String[] args) {
        Array_E1 array1 = new Array_E1();//CREACION OBJETO
        Scanner memoria = new Scanner(System.in);
        int a;

        do{
        array1.rellenar_matriz();
        array1.mostrar_matriz();
        System.out.println("Pulsa el numero 5 para salir, Si quieres continuar pulsa cualquie tecla");
        a=memoria.nextInt();

    }while (a!=5);

        System.out.println("Has salido del programa");

    }

}
