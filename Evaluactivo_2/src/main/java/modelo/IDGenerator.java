/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Juanes Cardona
 */
public class IDGenerator {

    
    private static int contador = 1;

    // Método estático que genera el ID único
    public static String generateReservaId() {
        String id = "RES-" + contador;
        contador++; 
        return id;
    }
}

