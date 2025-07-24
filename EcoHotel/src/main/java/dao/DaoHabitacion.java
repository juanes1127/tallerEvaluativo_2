/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dto.DtoHabitacion;
import java.util.ArrayList;

/**
 *
 * @author Juanes Cardona
 */
public class DaoHabitacion {

    // Lista para almacenar habitaciones
    private ArrayList<DtoHabitacion> listaHabitaciones;

    // Constructor
    public DaoHabitacion() {
        listaHabitaciones = new ArrayList<>();
    }
    
    public ArrayList<DtoHabitacion> listarHabitaciones() {
        return listaHabitaciones;
    }
    
    // Metodo para buscar una habitacion por ID
    public DtoHabitacion obtenerHabitacionPorId(String id) {
        for (int i = 0; i < listaHabitaciones.size(); i++) {
            if (listaHabitaciones.get(i).getId().equals(id)) {
                return listaHabitaciones.get(i);
            }
        }
        return null;
    }

    // Metodo para guardar una nueva habitacion
    public boolean registrarNuevaHabitacion(DtoHabitacion nuevaHabitacion) {
        for (int i = 0; i < listaHabitaciones.size(); i++) {
            if (listaHabitaciones.get(i).getId().equals(nuevaHabitacion.getId())) {
                return false; // Ya existe una habitacion con ese ID
            }
        }
        listaHabitaciones.add(nuevaHabitacion);
        return true; 
    }

    // Metodo para editar los datos de una habitacion existente
    public boolean actualizarDatosHabitacion(String id, DtoHabitacion datosActualizados) {
        for (int i = 0; i < listaHabitaciones.size(); i++) {
            DtoHabitacion h = listaHabitaciones.get(i);
            if (h.getId().equals(id)) {
                h.setCapacidad(datosActualizados.getCapacidad());
                h.setEstado(datosActualizados.getEstado());
                h.setTipo(datosActualizados.getTipo());
                return true;
            }
        }
        return false;
    }

    // Metodo para eliminar una habitacion por su ID
    public boolean RemoverHabitacionPorId(String id) {
        for (int i = 0; i < listaHabitaciones.size(); i++) {
            if (listaHabitaciones.get(i).getId().equals(id)) {
                listaHabitaciones.remove(i);
                return true;
            }
        }
        return false;
    }
}