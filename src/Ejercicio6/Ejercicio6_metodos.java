package Ejercicio6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio6_metodos {

    Scanner entrada = new Scanner(System.in); //MEMORIA
    //VARIABLES
    int valor_usuario; //valor introducido por el usuario
    int valor_aleatorio; // valor generado por la maquina
    int intentos; // numero de intentos

    //MÉTODO GENERA NUMERO ALEATORIO ENTRE 0 Y 100
    public void aleatorio(){
        valor_aleatorio= (int)(Math.random()*100);
        //System.out.println(valor_aleatorio);
    }

    public void instrucciones(){
        System.out.println("Introduce valores solo de 0 a 100");
    }

    //MÉTODO INTRODUCIR VALORES + PISTA
    public void introducir_valor() {

        do {
            valor_usuario = entrada.nextInt();
            if (valor_usuario < valor_aleatorio) {
                System.out.println("El valor generado es MAYOR");
            } else {
                System.out.println("El valor generado es MENOR");
            }
            intentos++;
        } while((intentos<5)&&(valor_usuario!=valor_aleatorio));
    }

    //METODO RESULTADO JUEGO

    public void resultado(){
        if(valor_usuario==valor_aleatorio){
            System.out.println("¡¡Enhora buena has acertado!!");
        }else if (intentos>=5){
            System.out.println("GAME OVER");
            System.out.println("Has excedido el número de intentos");
        }

    }

}
