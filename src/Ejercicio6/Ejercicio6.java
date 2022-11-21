package Ejercicio6;
/*En el método main que aune los métodos necesarios para generar un pequeño juego:
el ordenador genera un número al azar (entre el 1 y el 100,por ejemplo)
y el usuario tendrá 5 intentos para adivinarlo.*/

public class Ejercicio6 {
    public static void main(String[] args) {

        Ejercicio6_metodos juego = new Ejercicio6_metodos();

        juego.aleatorio();
        juego.instrucciones();
        juego.introducir_valor();
        juego.resultado();

    }
}
