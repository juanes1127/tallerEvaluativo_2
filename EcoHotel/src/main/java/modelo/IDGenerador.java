/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/* Autor: Juanes Cardona
 */
public class IDGenerador {

    private static int contadorReserva = 0;
    private static int contadorHuesped = 0;
    private static int contadorHabitacion = 0;

    
    public static String generarIDHuesped() {
        return "Huesped" + (++contadorHuesped);
    }
        
    public static String generarIDReserva() {
        return "Reserva" + (++contadorReserva);
    }

    public static String generarIDHabitacion() {
        return "Habitacion" + (++contadorHabitacion);
    }
}