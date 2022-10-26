/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej6;

import Entidad.Cafetera;
import Servicio.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class POOEj6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double completo, tamaño, agregado;
        Cafetera cafeteranueva = new Cafetera(3.0, 2.0);
        CafeteraServicio cafet = new CafeteraServicio();
        Scanner leer = new Scanner(System.in);
        int opcion;
        String salir = "N";
        do {

            System.out.println("MENU");
            System.out.println("1.Llenar");
            System.out.println("2.Servir");
            System.out.println("3.Vaciar");
            System.out.println("4.Agregar");
            System.out.println("5.Salir");

            System.out.println("Elija una operacion de el MENU");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:

                    completo = cafet.llenarCafetera(cafeteranueva.getCapacidadMaxima());
                    cafeteranueva.setCantidadActual(completo);
                    System.out.println("La cafetera esta llena con " + cafeteranueva.getCantidadActual()
                            + " Litros ");
                    break;
                case 2:
                    System.out.println("Indique el tamaño de la taza");
                    tamaño = leer.nextDouble();

                    cafet.servirTaza(tamaño, cafeteranueva);
                    break;
                case 3:

                    cafeteranueva.setCantidadActual(cafet.vaciarCafetera());
                    System.out.println("La cafetera tiene " + cafeteranueva.getCantidadActual());
                    break;
                case 4:
                    System.out.println("Cuanto cafe desea agregar ");
                    agregado = leer.nextDouble();
                    cafet.agregarCafe(agregado, cafeteranueva);
                    break;

                case 5:
                    System.out.println("¿Esta seguro que desea salir del programa S/N?");
                    salir = leer.next();
                    break;

            }

        } while (salir.equalsIgnoreCase("N"));
    }

}
