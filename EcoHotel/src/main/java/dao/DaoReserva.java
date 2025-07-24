package dao;

import dto.DtoReserva;
import java.util.ArrayList;

/**
 * DAO para gestionar las reservas del sistema.
 * Autor: Juanes Cardona
 */
public class DaoReserva {

    private ArrayList<DtoReserva> listaReservas;

    public DaoReserva() {
        listaReservas = new ArrayList<>();
    }

    // Listar todas las reservas registradas
    public ArrayList<DtoReserva> listarReservas() {
        return listaReservas;
    }

    // Buscar una reserva por su ID
    public DtoReserva obtenerReservaPorId(String id) {
        for (DtoReserva r : listaReservas) {
            if (r.getId().equals(id)) {
                return r;
            }
        }
        return null;
    }

    // Registrar una nueva reserva
    public boolean registrarNuevaReserva(DtoReserva nueva) {
        if (obtenerReservaPorId(nueva.getId()) == null) {
            listaReservas.add(nueva);
            return true;
        }
        return false;
    }

    // Actualizar los datos de una reserva existente
    public boolean actualizarDatosReserva(String id, DtoReserva actualizada) {
        for (int i = 0; i < listaReservas.size(); i++) {
            if (listaReservas.get(i).getId().equals(id)) {
                listaReservas.set(i, actualizada);
                return true;
            }
        }
        return false;
    }

    // Eliminar una reserva por su ID
    public boolean eliminarReservaPorId(String id) {
        for (int i = 0; i < listaReservas.size(); i++) {
            if (listaReservas.get(i).getId().equals(id)) {
                listaReservas.remove(i);
                return true;
            }
        }
        return false;
    }
}