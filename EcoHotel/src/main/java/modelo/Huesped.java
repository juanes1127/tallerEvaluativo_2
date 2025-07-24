/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/* Autor: Juanes Cardona
 */
public class Huesped {

    // Atributos privados
    private String id;
    private String nombre;
    private String documento;
    private String correo;
    private String telefono;
    
    public Huesped(String id, String nombre, String documento, String correo, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.documento = documento;
        this.correo = correo;
        this.telefono = telefono;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }
    
    public void setId(String id) {
        if (id != null && !id.trim().isEmpty()) {
            this.id = id.trim();
        } else {
            throw new IllegalArgumentException("El ID no puede estar vacío");
        }
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre.trim();
        } else {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
    }

    public void setDocumento(String documento) {
        if (documento != null && !documento.trim().isEmpty() && documento.matches("\\d+")) {
            this.documento = documento.trim();
        } else {
            throw new IllegalArgumentException("El documento debe contener solo números y no estar vacío");
        }
    }

    public void setCorreo(String correo) {
        if (correo != null && !correo.trim().isEmpty() && correo.contains("@")) {
            this.correo = correo.trim();
        } else {
            throw new IllegalArgumentException("El correo debe ser válido y no puede estar vacío");
        }
    }

    public void setTelefono(String telefono) {
        if (telefono != null && !telefono.trim().isEmpty() && telefono.matches("\\d+")) {
            this.telefono = telefono.trim();
        } else {
            throw new IllegalArgumentException("El teléfono debe contener solo números y no estar vacío");
        }
    }
}