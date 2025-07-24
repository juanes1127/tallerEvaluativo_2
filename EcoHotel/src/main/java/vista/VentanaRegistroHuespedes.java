/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import dto.DtoHabitacion;
import javax.swing.JOptionPane;
import controladores.ControlHab;
import controladores.ControlHuesped;
import controladores.ControlReser;
import dto.DtoHuesped;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juanes Cardona
 */
public class VentanaRegistroHuespedes extends javax.swing.JFrame {
    private ControlHab controladorHabitacion = new ControlHab();
    private VentanaMenu ventanaMenu;
    public VentanaRegistroHuespedes(VentanaMenu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        initComponents();
        ListarTablaHab();
    }

    public void ListarTablaHab(){
        String [] columnas = {"Id","Tipo","Capacidad","Estado"};
        DefaultTableModel modeloHab = new DefaultTableModel(columnas, 0);
        ArrayList<DtoHabitacion> lista = controladorHabitacion.listarHabitaciones();

        for (DtoHabitacion Habitacion : lista) {
            if(Habitacion != null){
                 Object [] filas = {
                Habitacion.getId(),
                Habitacion.getTipo(),
                Habitacion.getCapacidad(),
                Habitacion.getEstado()
};
modeloHab.addRow(filas);
            }
            
        }
        tablaHab.setModel(modeloHab);

    }
    private void limpiarCampos() {
    txtIdH.setText("");
    txtTipoH.setText("");
    txtCapacidadH.setText("");
    txtEstadoH.setText("");
}
    
public class VentanaRegistroHuespedes extends javax.swing.JFrame {
    private ControlHuesped controladorHuespedes= new ControlHuesped();
    private VentanaMenu ventanaMenu;
    public VentanaRegistroHuespedes(VentanaMenu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        initComponents();
        ListarTablaHab();
    }

    public void ListarTablaHuesped(){
        String [] columnas = {"Id","Nombre","Documento","Correo","Telefono"};
        DefaultTableModel modeloHuesped= new DefaultTableModel(columnas, 0);
        ArrayList<DtoHuesped> lista = controladorHuespedes.listarHuespedes();

        for (DtoHuesped Huesped : lista) {
            if(Huesped != null){
                 Object [] filas = {
                Huesped.getId(),
                Huesped.getNombre(),
                Huesped.getDocumento();
                Huesped.getCorreo();
                Huesped.getTelefono();
};
modeloHuesped.addRow(filas);
            }
            
        }
        tablaHuesped.setModel(modeloHuesped);

    }
    private void limpiarCampos() {
    txtIdHu.setText("");
    txtNombreHu.setText("");
    txtDocumentoHu.setText("");
    txtCorreoHu.setText("");
    txtTelefonoHu.setText("");
}

 public class VentanaRegistroHuespedes extends javax.swing.JFrame {
    private ControlReser controladorReser = new ControlReser();
    private VentanaMenu ventanaMenu;
    public VentanaRegistroHuespedes(VentanaMenu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        initComponents();
        ListarTablaHab();
    }

    public void ListarTablaHab(){
        String [] columnas = {"Id","Fecha Entrada","Fecha Sañ+lida","Huesped", "Habitacion"};
        DefaultTableModel modeloReserva = new DefaultTableModel(columnas, 0);
        ArrayList<DtoReserva> lista = controlReser.listarReservas();

        for (DtoReserva Reserva : lista) {
            if(Reserva!= null){
                 Object [] filas = {
                Reserva.getReserva(""),
                Reserva.get
                
};
modeloReserva.addRow(filas);
            }
            
        }
        tablaReserva.setModel(modeloReserva);

    }
    private void limpiarCampos() {
    txt.setText("");
    txtTipoH.setText("");
    txtCapacidadH.setText("");
    txtEstadoH.setText("");
}
 }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTituloR = new javax.swing.JPanel();
        lblRegistro = new javax.swing.JLabel();
        tbbFunciones = new javax.swing.JTabbedPane();
        pnlHabitaciones = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHab = new javax.swing.JTable();
        lblIdH = new javax.swing.JLabel();
        lblTipoH = new javax.swing.JLabel();
        lblCapacidadH = new javax.swing.JLabel();
        lblEstadoH = new javax.swing.JLabel();
        txtIdH = new javax.swing.JTextField();
        txtTipoH = new javax.swing.JTextField();
        txtCapacidadH = new javax.swing.JTextField();
        txtEstadoH = new javax.swing.JTextField();
        btnGuardarH = new javax.swing.JButton();
        btnEditarH = new javax.swing.JButton();
        btnEliminarH = new javax.swing.JButton();
        pnlHuespedes = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        lblIdHu = new javax.swing.JLabel();
        lblNombreHu = new javax.swing.JLabel();
        lblDocumentoHu = new javax.swing.JLabel();
        lblCorreoHu = new javax.swing.JLabel();
        lblTelefonoHu = new javax.swing.JLabel();
        txtIdHu = new javax.swing.JTextField();
        txtNombreHu = new javax.swing.JTextField();
        txtDocumentoHu = new javax.swing.JTextField();
        txtCorreoHu = new javax.swing.JTextField();
        txtTelefonoHu = new javax.swing.JTextField();
        btnGuardarHu = new javax.swing.JButton();
        btnEditarHu = new javax.swing.JButton();
        btnEliminarHu = new javax.swing.JButton();
        pnlReserva = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        lblIdR = new javax.swing.JLabel();
        lblFechaEntradaR = new javax.swing.JLabel();
        lblFechaSalidaR = new javax.swing.JLabel();
        lblHuespedR = new javax.swing.JLabel();
        lblHabitacionR = new javax.swing.JLabel();
        txtIdR = new javax.swing.JTextField();
        txtHabitacionR = new javax.swing.JTextField();
        txtFechaEntradaR = new javax.swing.JTextField();
        txtFechaSalidadR = new javax.swing.JTextField();
        txtHuespedR = new javax.swing.JTextField();
        btnGuardarR = new javax.swing.JButton();
        btnEditarR = new javax.swing.JButton();
        btnEliminarR = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro Huespedes");

        pnlTituloR.setBackground(new java.awt.Color(0, 255, 102));

        lblRegistro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistro.setText("Registro");

        tbbFunciones.setBackground(new java.awt.Color(102, 102, 0));

        pnlHabitaciones.setBackground(new java.awt.Color(102, 102, 0));

        tablaHab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaHab);

        lblIdH.setText("Id :");

        lblTipoH.setText("Tipo :");

        lblCapacidadH.setText("Capacidad :");

        lblEstadoH.setText("Estado :");

        btnGuardarH.setText("Guardar");
        btnGuardarH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarHActionPerformed(evt);
            }
        });

        btnEditarH.setText("Editar");
        btnEditarH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarHActionPerformed(evt);
            }
        });

        btnEliminarH.setText("Eliminar");
        btnEliminarH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlHabitacionesLayout = new javax.swing.GroupLayout(pnlHabitaciones);
        pnlHabitaciones.setLayout(pnlHabitacionesLayout);
        pnlHabitacionesLayout.setHorizontalGroup(
            pnlHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHabitacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblTipoH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCapacidadH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(lblEstadoH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIdH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(pnlHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIdH)
                    .addComponent(txtTipoH)
                    .addComponent(txtCapacidadH)
                    .addComponent(txtEstadoH, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                .addGap(85, 85, 85)
                .addGroup(pnlHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuardarH)
                    .addComponent(btnEliminarH)
                    .addComponent(btnEditarH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlHabitacionesLayout.setVerticalGroup(
            pnlHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(pnlHabitacionesLayout.createSequentialGroup()
                .addGroup(pnlHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHabitacionesLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(pnlHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdH)
                            .addComponent(txtIdH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipoH)
                            .addComponent(txtTipoH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCapacidadH)
                            .addComponent(txtCapacidadH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEstadoH)
                            .addComponent(txtEstadoH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarH)))
                    .addGroup(pnlHabitacionesLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnGuardarH)
                        .addGap(36, 36, 36)
                        .addComponent(btnEditarH)))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        tbbFunciones.addTab("Registro Habitaciones ", pnlHabitaciones);

        pnlHuespedes.setBackground(new java.awt.Color(102, 102, 0));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        lblIdHu.setText("Id :");

        lblNombreHu.setText("Nombre :");

        lblDocumentoHu.setText("Documento");

        lblCorreoHu.setText("Correo :");

        lblTelefonoHu.setText("Telefono :");

        btnGuardarHu.setText("Guardar");
        btnGuardarHu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarHuActionPerformed(evt);
            }
        });

        btnEditarHu.setText("Editar");
        btnEditarHu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarHuActionPerformed(evt);
            }
        });

        btnEliminarHu.setText("Eliminar");
        btnEliminarHu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarHuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlHuespedesLayout = new javax.swing.GroupLayout(pnlHuespedes);
        pnlHuespedes.setLayout(pnlHuespedesLayout);
        pnlHuespedesLayout.setHorizontalGroup(
            pnlHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHuespedesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTelefonoHu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCorreoHu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDocumentoHu, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(lblNombreHu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIdHu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIdHu)
                    .addComponent(txtNombreHu)
                    .addComponent(txtDocumentoHu)
                    .addComponent(txtCorreoHu)
                    .addComponent(txtTelefonoHu, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addGroup(pnlHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardarHu, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEditarHu, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEliminarHu, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(124, 124, 124)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlHuespedesLayout.setVerticalGroup(
            pnlHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHuespedesLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlHuespedesLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(pnlHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdHu)
                    .addComponent(txtIdHu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarHu))
                .addGroup(pnlHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHuespedesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnlHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreHu)
                            .addComponent(txtNombreHu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDocumentoHu)
                            .addComponent(txtDocumentoHu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlHuespedesLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnEditarHu)))
                .addGap(18, 18, 18)
                .addGroup(pnlHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreoHu)
                    .addComponent(txtCorreoHu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarHu))
                .addGap(18, 18, 18)
                .addGroup(pnlHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefonoHu)
                    .addComponent(txtTelefonoHu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbbFunciones.addTab("Registro Husped", pnlHuespedes);

        pnlReserva.setBackground(new java.awt.Color(102, 102, 0));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        lblIdR.setText("Id :");

        lblFechaEntradaR.setText("Fecha Entrada :");

        lblFechaSalidaR.setText("Fecha Salida :");

        lblHuespedR.setText("Huesped :");

        lblHabitacionR.setText("Habitacion :");

        btnGuardarR.setText("Guardar");
        btnGuardarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRActionPerformed(evt);
            }
        });

        btnEditarR.setText("Editar");
        btnEditarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarRActionPerformed(evt);
            }
        });

        btnEliminarR.setText("Eliminar");
        btnEliminarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlReservaLayout = new javax.swing.GroupLayout(pnlReserva);
        pnlReserva.setLayout(pnlReservaLayout);
        pnlReservaLayout.setHorizontalGroup(
            pnlReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReservaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblIdR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFechaEntradaR, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(lblFechaSalidaR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHuespedR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHabitacionR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIdR)
                    .addComponent(txtHabitacionR)
                    .addComponent(txtFechaEntradaR)
                    .addComponent(txtFechaSalidadR)
                    .addComponent(txtHuespedR, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addGroup(pnlReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardarR, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEditarR, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEliminarR, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(89, 89, 89)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlReservaLayout.setVerticalGroup(
            pnlReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(pnlReservaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdR)
                    .addComponent(txtIdR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarR))
                .addGroup(pnlReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlReservaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnlReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFechaEntradaR)
                            .addComponent(txtFechaEntradaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlReservaLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnEditarR)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaSalidaR)
                    .addComponent(txtFechaSalidadR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlReservaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnlReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHuespedR)
                            .addComponent(txtHuespedR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlReservaLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btnEliminarR)))
                .addGap(18, 18, 18)
                .addGroup(pnlReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHabitacionR)
                    .addComponent(txtHabitacionR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        tbbFunciones.addTab("Reserva", pnlReserva);

        btnMenu.setText("menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTituloRLayout = new javax.swing.GroupLayout(pnlTituloR);
        pnlTituloR.setLayout(pnlTituloRLayout);
        pnlTituloRLayout.setHorizontalGroup(
            pnlTituloRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbbFunciones, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlTituloRLayout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(lblRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMenu)
                .addGap(72, 72, 72))
        );
        pnlTituloRLayout.setVerticalGroup(
            pnlTituloRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTituloRLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlTituloRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTituloRLayout.createSequentialGroup()
                        .addComponent(lblRegistro)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTituloRLayout.createSequentialGroup()
                        .addComponent(btnMenu)
                        .addGap(2, 2, 2)))
                .addComponent(tbbFunciones, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(578, 578, 578))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTituloR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTituloR, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarHActionPerformed
        String id = txtIdH.getText();
        String tipo = txtTipoH.getText();
        String capacidad = txtCapacidadH.getText();
        String estado = txtEstadoH.getText();
        if(id == null || id.isBlank() || tipo == null || tipo.isBlank() || capacidad == null || capacidad.isBlank() ||
                estado == null || estado.isBlank() ){
        JOptiopane.showMessageDialog(this,"completar todos los campos para poder guardar");
        return ;
    }
      
       DtoHabitacion confirmar = ControlHuesped.buscarHabitacionPorId(id);
       
       if(confirmar != null){
           JOptionPane.showMessageDialog(this, "Ya existe una habitacion con el id" + id);
           return;
       }
       
        DtoHabitacion hab = new DtoHabitacion(id, tipo, capacidad, estado);
       boolean guardar = controladorHabitacion.guardarHabitacion(hab);
       if(guardar){
           JOptionPane.showMessageDialog(this, "La habitacion se guardo de manera correcta.");
           ListarTablaHab();
           limpiarCampos() ;
           
       }else{
           JOptionPane.showMessageDialog(this, "La habitacion no se pudo guardar.");
       }
      

    }//GEN-LAST:event_btnGuardarHActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
     this.setVisible();e(false);
     ventanaMenu.setVisible(true);


    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnEditarHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarHActionPerformed

    private void btnEliminarHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarHActionPerformed

    private void btnGuardarHuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarHuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarHuActionPerformed

    private void btnEditarHuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarHuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarHuActionPerformed

    private void btnEliminarHuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarHuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarHuActionPerformed

    private void btnGuardarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarRActionPerformed

    private void btnEditarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarRActionPerformed

    private void btnEliminarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarRActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroHuespedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroHuespedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroHuespedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroHuespedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new VentanaRegistroHuespedes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarH;
    private javax.swing.JButton btnEditarHu;
    private javax.swing.JButton btnEditarR;
    private javax.swing.JButton btnEliminarH;
    private javax.swing.JButton btnEliminarHu;
    private javax.swing.JButton btnEliminarR;
    private javax.swing.JButton btnGuardarH;
    private javax.swing.JButton btnGuardarHu;
    private javax.swing.JButton btnGuardarR;
    private javax.swing.JButton btnMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lblCapacidadH;
    private javax.swing.JLabel lblCorreoHu;
    private javax.swing.JLabel lblDocumentoHu;
    private javax.swing.JLabel lblEstadoH;
    private javax.swing.JLabel lblFechaEntradaR;
    private javax.swing.JLabel lblFechaSalidaR;
    private javax.swing.JLabel lblHabitacionR;
    private javax.swing.JLabel lblHuespedR;
    private javax.swing.JLabel lblIdH;
    private javax.swing.JLabel lblIdHu;
    private javax.swing.JLabel lblIdR;
    private javax.swing.JLabel lblNombreHu;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblTelefonoHu;
    private javax.swing.JLabel lblTipoH;
    private javax.swing.JPanel pnlHabitaciones;
    private javax.swing.JPanel pnlHuespedes;
    private javax.swing.JPanel pnlReserva;
    private javax.swing.JPanel pnlTituloR;
    private javax.swing.JTable tablaHab;
    private javax.swing.JTabbedPane tbbFunciones;
    private javax.swing.JTextField txtCapacidadH;
    private javax.swing.JTextField txtCorreoHu;
    private javax.swing.JTextField txtDocumentoHu;
    private javax.swing.JTextField txtEstadoH;
    private javax.swing.JTextField txtFechaEntradaR;
    private javax.swing.JTextField txtFechaSalidadR;
    private javax.swing.JTextField txtHabitacionR;
    private javax.swing.JTextField txtHuespedR;
    private javax.swing.JTextField txtIdH;
    private javax.swing.JTextField txtIdHu;
    private javax.swing.JTextField txtIdR;
    private javax.swing.JTextField txtNombreHu;
    private javax.swing.JTextField txtTelefonoHu;
    private javax.swing.JTextField txtTipoH;
    // End of variables declaration//GEN-END:variables

 
