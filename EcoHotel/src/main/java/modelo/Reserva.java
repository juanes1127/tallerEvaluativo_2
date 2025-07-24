/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

/* Autor: Juanes Cardona
 */
public class Reserva {

    // Atributos privados
    private String id;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private ArrayList<Huesped> huesped;
    private ArrayList<Habitacion> habitacion;

    // Constructor con this (sin validaciones al crear)
    public Reserva(String id, LocalDate fechaEntrada, LocalDate fechaSalida) {
        this.id = id;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.habitacion = habitacion;
        this.huesped = huesped;
    }


    // Getters
    public String getId() {
        return id;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public ArrayList<Huesped> getHuesped() {
        return huesped;
    }

    public ArrayList<Habitacion> getHabitacion() {
        return habitacion;
    }
    

    // Setters con validaciones
    public void setId(String id) {
        if (id != null && !id.trim().isEmpty()) {
            this.id = id.trim();
        } else {
            throw new IllegalArgumentException("El ID de la reserva no puede estar vacío");
        }
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        if (fechaEntrada != null) {
            this.fechaEntrada = fechaEntrada;
        } else {
            throw new IllegalArgumentException("La fecha de entrada no puede ser nula");
        }
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        if (fechaSalida != null) {
            if (this.fechaEntrada != null && fechaSalida.isAfter(this.fechaEntrada)) {
                this.fechaSalida = fechaSalida;
            } else {
                throw new IllegalArgumentException("La fecha de salida debe ser posterior a la de entrada");
            }
        } else {
            throw new IllegalArgumentException("La fecha de salida no puede ser nula");
        }
    }

    public void setHuesped(ArrayList<Huesped> huesped) {
        this.huesped = huesped;
    }

    public void setHabitacion(ArrayList<Habitacion> habitacion) {
        this.habitacion = habitacion;
    }

  

}