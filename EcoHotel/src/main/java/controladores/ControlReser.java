package controladores;
/* Autor: Juanes Cardona
 */
import dao.DaoReserva;
import dto.*;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Controlador de reservas.
 * Autor: Juanes Cardona
 */
public class ControlReser {

    private DaoReserva dao;

    public ControlReser() {
        dao = new DaoReserva();
    }

    // Listar todas las reservas
    public ArrayList<DtoReserva> listarReservas() {
        return dao.listarReservas();
    }

    // Buscar una reserva por ID
    public DtoReserva buscarReservaPorId(String id) {
        if (id == null || id.trim().isEmpty()) {
            return null;
        }
        return dao.obtenerReservaPorId(id);
    }

    // Registrar una nueva reserva
    public boolean registrarReserva(String id, LocalDate entrada, LocalDate salida, DtoHuesped huesped, DtoHabitacion habitacion) {
        if (id == null || entrada == null || salida == null || huesped == null || habitacion == null) return false;
        if (salida.isBefore(entrada)) return false;
        if (dao.obtenerReservaPorId(id) != null) return false;

        DtoReserva nueva = new DtoReserva(id, entrada, salida);
        nueva.setHuesped(huesped);
        nueva.setHabitacion(habitacion);
        return dao.registrarNuevaReserva(nueva);
    }

    // Editar datos de una reserva
    public boolean editarReserva(String id, LocalDate nuevaEntrada, LocalDate nuevaSalida) {
        if (id == null || id.trim().isEmpty() || nuevaEntrada == null || nuevaSalida == null) return false;
        if (nuevaSalida.isBefore(nuevaEntrada)) return false;

        DtoReserva actualizada = new DtoReserva(id, nuevaEntrada, nuevaSalida);
        return dao.actualizarDatosReserva(id, actualizada);
    }

    // Eliminar una reserva por ID
    public boolean eliminarReserva(String id) {
        if (id == null || id.trim().isEmpty()) return false;
        return dao.eliminarReservaPorId(id);
    }
}