package Caso04;

import java.util.Scanner;

public class Interfaz {

    static Jugador jugador = new Jugador("German");

    public static void menu(){
        Scanner teclado = new Scanner(System.in);
        mostrarMenu();
        try{
            int eleccion = teclado.nextInt();
            do {

                do {
                    switch (eleccion){
                        case 1:
                            mostrarDatosObjeto();
                            break;
                        case 2:
                            editarDatosObjeto();
                            break;
                        case 3:
                            break;
                    }
                }while (eleccion >=1 || eleccion <= 3);
            }while (eleccion != 3);
        }catch (Exception e){
            System.out.println("Invalido");
        }
    }

    public static void mostrarMenu() {
        System.out.println("[1] Mostrar datos del objeto");
        System.out.println("[2] Editar datos del objeto");
        System.out.println("[3] Salir");
    }

    public static void mostrarDatosObjeto() {
        System.out.println(jugador.getNombre());
    }

    public static void editarDatosObjeto() {
        jugador.setNombre("Pedro");
    }

}
