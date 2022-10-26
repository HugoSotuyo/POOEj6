/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;



/**
 *
 * @author hdsot
 */
public class CafeteraServicio {
    public double llenarCafetera(double capacidadMaxima){
       double llena;
       llena=capacidadMaxima;
       return llena;
    }
    public void servirTaza(double tamañoTaza,Cafetera cafeteranueva){
       double comparacion,estado;
       comparacion=cafeteranueva.getCantidadActual();
        if (tamañoTaza<comparacion){
            estado=comparacion-tamañoTaza;
            cafeteranueva.setCantidadActual(estado);
            System.out.println("La taza se lleno");
            
        }else{
            cafeteranueva.setCantidadActual(0.0);
            System.out.println("La taza no se lleno");
            System.out.println("Tiene ahora " + comparacion + " Litros ");
        }
    }
    public double vaciarCafetera(){
       double vacia=0.0;
       
       return vacia;
    }
    public void agregarCafe(double cantidad, Cafetera cafeteranueva) {
        double estado, nuevoestado;
        estado = cafeteranueva.getCantidadActual();
        nuevoestado = estado + cantidad;
        if (nuevoestado < cafeteranueva.getCapacidadMaxima()) {
            cafeteranueva.setCantidadActual(nuevoestado);
            System.out.println("La cantidad actual es " + cafeteranueva.getCantidadActual());
        } else {
            System.out.println("La cafetera se lleno");
            cafeteranueva.setCantidadActual(cafeteranueva.getCapacidadMaxima());
        }
    }
}
