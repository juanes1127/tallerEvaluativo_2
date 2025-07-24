/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/* Autor: Juanes Cardona
 */
public class Habitacion {
    
    private String id;
    private String tipo;
    private String capacidad;
    private String estado;

    public Habitacion(String id, String tipo, String capacidad, String estado) {
        this.id = id;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.estado = estado;
    }
    
    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public String getEstado() {
        return estado;
    }
    
    public void setId(String id) {
        if (id != null && !id.trim().isEmpty()) {
            this.id = id.trim();
        } else {
            throw new IllegalArgumentException("El ID no puede estar vacío");
        }
    }

    public void setTipo(String tipo) {
        if (tipo != null && !tipo.trim().isEmpty()) {
            this.tipo = tipo.trim();
        } else {
            throw new IllegalArgumentException("El tipo no puede estar vacío");
        }
    }

    public void setCapacidad(String capacidad) {
        if (capacidad != null && !capacidad.trim().isEmpty()) {
            try {
                int valor = Integer.parseInt(capacidad.trim());
                if (valor > 0) {
                    this.capacidad = capacidad.trim();
                } else {
                    throw new IllegalArgumentException("La capacidad debe ser mayor a cero");
                }
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("La capacidad debe ser un número válido");
            }
        } else {
            throw new IllegalArgumentException("La capacidad no puede estar vacía");
        }
    }

    public void setEstado(String estado) {
        if (estado != null && !estado.trim().isEmpty()) {
            this.estado = estado.trim();
        } else {
            throw new IllegalArgumentException("El estado no puede estar vacío");
        }
    }
}