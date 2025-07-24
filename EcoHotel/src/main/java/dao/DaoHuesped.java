/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dto.DtoHuesped;
import java.util.ArrayList;

/**
 *
 * @author Juanes Cardona
 */
public class DaoHuesped{
    
    private ArrayList<DtoHuesped> huespedes = new ArrayList<>();

    public DaoHuesped() {
        this.huespedes = new ArrayList<>();
    }

    // Metodo para listar todos los huespedes
    public ArrayList<DtoHuesped> listarHuespedes() {
        return huespedes;
    }

    // Metodo para buscar un huesped por ID
    public DtoHuesped buscarHuespedporID(String id) {
        for (int i = 0; i < huespedes.size(); i++) {
            DtoHuesped h = huespedes.get(i);
            if (h.getId().equals(id)) {
                return h;
            }
        }
        return null;
    }

    // Metodo para registrar un nuevo huesped
    public boolean registrarHuesped(DtoHuesped huesped) {
        for (int i = 0; i < huespedes.size(); i++) {
            DtoHuesped h = huespedes.get(i);
            if (h.getId().equals(huesped.getId())) {
                return false;
            }
        }
        huespedes.add(huesped);
        return true;
    }

    // Metodo para actualizar informacion del huesped (excepto el ID)
    public boolean actualizarHuesped(String id, DtoHuesped huesped) {
        for (int i = 0; i < huespedes.size(); i++) {
            DtoHuesped h = huespedes.get(i);
            if (h.getId().equals(id)) {
                h.setNombre(huesped.getNombre());
                h.setDocumento(huesped.getDocumento());
                h.setCorreo(huesped.getCorreo());
                h.setTelefono(huesped.getTelefono());
                return true;
            }
        }
        return false;
    }

    // Metodo para eliminar un huesped
    public boolean removerHuesped(DtoHuesped huesped) {
        for (int i = 0; i < huespedes.size(); i++) {
            DtoHuesped h = huespedes.get(i);
            if (h.getId().equals(huesped.getId())) {
                huespedes.remove(i);
                return true;
            }
        }
        return false;
    }
}