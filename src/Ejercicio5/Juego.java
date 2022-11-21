package Ejercicio5;
/*Crea una clase “Juego” con un método que, dado un número al azar y un
número dado por el usuario, compruebe si son iguales. Si no lo son, dará una
pista de si el número al azar es mayor o menor que el del usuario.*/

import java.util.Scanner;

public class Juego {

    Scanner entrada = new Scanner(System.in);

    public void juego_aleatorio(){
        int valor_usuario;
        int valor_aleatorio;

        valor_aleatorio= (int)(Math.random()*100); //Generamos valor aleatorio entre 0 y 100
        System.out.println("Introduce un numero del 0 al 100");//Solicitamos valor a usuario.

        do {
            valor_usuario = entrada.nextInt();

            if (valor_usuario < valor_aleatorio) {
                System.out.println("El valor generado es MAYOR");
            } else {
                System.out.println("El valor generado es MENOR");
            }
        }while (valor_usuario != valor_aleatorio);

        System.out.println("Enhorabuena has acertado!!");
    }

    public static void main(String[] args) {

        Juego j1 = new Juego();

        j1.juego_aleatorio();


    }





}
