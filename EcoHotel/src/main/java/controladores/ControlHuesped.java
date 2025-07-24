package controladores;

import dao.DaoHuesped;
import dto.DtoHuesped;
import java.util.ArrayList;

/**
 * Controlador de gestión de huéspedes.
 * Autor: Juanes Cardona
 */
public class ControlHuesped {

    private DaoHuesped dao;

    public ControlHuesped() {
        dao = new DaoHuesped();
    }

    // Listar todos los huéspedes
    public ArrayList<DtoHuesped> listarHuespedes() {
        return dao.listarHuespedes();
    }

    // Buscar huésped por ID
    public DtoHuesped buscarHuespedPorId(String id) {
        if (id == null || id.trim().isEmpty()) {
            return null;
        }
        return dao.buscarHuespedporID(id);
    }

    // Registrar un nuevo huésped
    public boolean registrarHuesped(String id, String nombre, String documento, String correo, String telefono) {
        if (nombre == null || nombre.trim().isEmpty()) return false;
        if (documento == null || documento.trim().isEmpty()) return false;
        if (correo == null || correo.trim().isEmpty()) return false;
        if (telefono == null || telefono.trim().isEmpty()) return false;

        DtoHuesped nuevo = new DtoHuesped(id, nombre, documento, correo, telefono);
        return dao.registrarHuesped(nuevo);
    }

    // Editar datos de un huésped
    public boolean editarHuesped(String id, String nombre, String documento, String correo, String telefono) {
        if (id == null || id.trim().isEmpty()) return false;

        DtoHuesped huesperEdit = new DtoHuesped(id, nombre, documento, correo, telefono);
        return dao.actualizarHuesped(id, huesperEdit);
    }

    // Eliminar huésped por ID
    public boolean eliminarHuesped(String id) {
        if (id == null || id.trim().isEmpty()) {
            return false;
        }

        // Busca el huésped por ID
        DtoHuesped huesped = dao.buscarHuespedporID(id);
    
        if (huesped != null) {
            return dao.removerHuesped(huesped);
        }

        return false;
    }
}