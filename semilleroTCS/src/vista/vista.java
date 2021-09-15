/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;




import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.comercial;
import modelo.empleado;
import modelo.repartidor;


/**
 *
 * @author Bedoya
 */
public class vista extends javax.swing.JFrame {

    /**
     * Creates new form vista
     */
    public vista() {
        initComponents();
        cajaZona.setVisible(false);
        jLabel6.setVisible(false);   
    }
    
    comercial comercial = new comercial();
    repartidor repartidor = new repartidor();
    ArrayList<empleado> empleados = new ArrayList<>();
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameListar = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaMostrar = new javax.swing.JTextArea();
        atras = new javax.swing.JButton();
        frameEdit = new javax.swing.JFrame();
        atrasEdit = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        editNombre = new javax.swing.JTextField();
        editSalario = new javax.swing.JTextField();
        editBonificacion = new javax.swing.JTextField();
        editComision = new javax.swing.JTextField();
        editZona = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        seleccionNombre = new javax.swing.JComboBox<>();
        labelTipo = new javax.swing.JLabel();
        editEdad = new javax.swing.JComboBox<>();
        texto1 = new javax.swing.JLabel();
        botonGuardar = new javax.swing.JButton();
        botonToCSV = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textoNombre = new java.awt.TextField();
        jLabel2 = new javax.swing.JLabel();
        textoSalario = new java.awt.TextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cajaTipo = new javax.swing.JComboBox<>();
        textoComision = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cajaZona = new javax.swing.JComboBox<>();
        cajaEdades = new javax.swing.JComboBox<>();
        botonMostrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        editar = new javax.swing.JButton();

        frameListar.setLocation(new java.awt.Point(300, 200));
        frameListar.setSize(new java.awt.Dimension(783, 452));

        areaMostrar.setColumns(20);
        areaMostrar.setRows(5);
        jScrollPane1.setViewportView(areaMostrar);

        atras.setText("Atrás");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frameListarLayout = new javax.swing.GroupLayout(frameListar.getContentPane());
        frameListar.getContentPane().setLayout(frameListarLayout);
        frameListarLayout.setHorizontalGroup(
            frameListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameListarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameListarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        frameListarLayout.setVerticalGroup(
            frameListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameListarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        frameEdit.setLocation(new java.awt.Point(400, 0));
        frameEdit.setSize(new java.awt.Dimension(400, 400));

        atrasEdit.setText("Atrás");
        atrasEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasEditActionPerformed(evt);
            }
        });

        actualizar.setText("Actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        jLabel7.setText("Nombre");

        jLabel8.setText("Edad");

        jLabel9.setText("Salario");

        jLabel10.setText("Bonificación");

        jLabel11.setText("Comisión");

        jLabel12.setText("Zona");

        editZona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Zona 1", "Zona 2", "Zona 3", "Zona 4", "Zona 5" }));
        editZona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editZonaActionPerformed(evt);
            }
        });

        jLabel13.setText("Seleccione");

        seleccionNombre.setSelectedItem(" ");
        seleccionNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seleccionNombreMouseClicked(evt);
            }
        });
        seleccionNombre.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                seleccionNombrePropertyChange(evt);
            }
        });

        labelTipo.setText(" ");

        editEdad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", " " }));

        javax.swing.GroupLayout frameEditLayout = new javax.swing.GroupLayout(frameEdit.getContentPane());
        frameEdit.getContentPane().setLayout(frameEditLayout);
        frameEditLayout.setHorizontalGroup(
            frameEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(frameEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(seleccionNombre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editNombre)
                    .addComponent(editSalario)
                    .addComponent(editBonificacion)
                    .addComponent(editComision, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editZona, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(frameEditLayout.createSequentialGroup()
                .addGroup(frameEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameEditLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(labelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frameEditLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(atrasEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        frameEditLayout.setVerticalGroup(
            frameEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(frameEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(seleccionNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frameEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(editNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(frameEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameEditLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel8))
                    .addGroup(frameEditLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(editEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frameEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(editSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frameEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBonificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(frameEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editComision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frameEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(editZona, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(frameEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atrasEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(425, 175));
        setResizable(false);
        setSize(new java.awt.Dimension(300, 200));

        texto1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        texto1.setText("Gestión de empleados  XYZ");

        botonGuardar.setLabel("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonToCSV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        botonToCSV.setText("Export CSV");
        botonToCSV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonToCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonToCSVActionPerformed(evt);
            }
        });

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        textoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Edad");

        jLabel3.setText("Salario");

        jLabel4.setText("Tipo");

        cajaTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comercial", "Repartidor" }));
        cajaTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaTipoActionPerformed(evt);
            }
        });

        textoComision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoComisionActionPerformed(evt);
            }
        });

        jLabel5.setText("Comisión");

        jLabel6.setText("Zona");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cajaZona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Zona 1", "Zona 2", "Zona 3", "Zona 4", "Zona 5" }));
        cajaZona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaZonaActionPerformed(evt);
            }
        });

        cajaEdades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cajaEdades, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoComision, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaZona, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cajaEdades, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textoComision, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaZona, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        botonMostrar.setText("Ver data");
        botonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarActionPerformed(evt);
            }
        });

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(texto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(92, 92, 92))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(botonToCSV, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(botonMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(texto1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonToCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editar)
                        .addGap(114, 114, 114))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNombreActionPerformed

    private void cajaTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaTipoActionPerformed
        
        if(cajaTipo.getSelectedItem().equals("Comercial")){
            textoComision.setVisible(true);
            jLabel5.setVisible(true);
            cajaZona.setVisible(false);
            jLabel6.setVisible(false);
        }else{
            if(cajaTipo.getSelectedItem().equals("Repartidor")){
                textoComision.setVisible(false);
                jLabel5.setVisible(false);
                jLabel6.setVisible(true);
                cajaZona.setVisible(true);
            }
        }
    }//GEN-LAST:event_cajaTipoActionPerformed

    private void textoComisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoComisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoComisionActionPerformed

    private void cajaZonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaZonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaZonaActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        
        if (cajaTipo.getSelectedItem().equals("Repartidor")){
            textoComision.setText("0");
        }
        
        try{
            if(cajaTipo.getSelectedItem().equals("Comercial")){
                int bonificacion = 0;
                comercial comercial = new comercial(textoNombre.getText(), 
                Integer.parseInt(cajaEdades.getSelectedItem().toString()), 
                Integer.parseInt(textoSalario.getText()), bonificacion, Integer.parseInt(textoComision.getText()));
                comercial.calcularBonificacion(Integer.parseInt(cajaEdades.getSelectedItem().toString()), Integer.parseInt(textoComision.getText()), "");
                boolean validacion = validarExistencia(textoNombre.getText());
                if (validacion == false){
                    empleados.add(comercial);
                    seleccionNombre.addItem(comercial.getNombre());
                    JOptionPane.showMessageDialog(null, "Se agregó correctamente al comercial con bonificación $"+comercial.getBonificacion());
                    textoNombre.setText("");
                    cajaEdades.setSelectedItem("18");
                    textoSalario.setText("");
                    textoComision.setText("");
                }else{
                    JOptionPane.showMessageDialog(null, "Empleado homónimo, agrege distintivo\nError #2\n");
                }
                
            }else{

                int bonificacion = 0;
                repartidor repartidor = new repartidor(textoNombre.getText(), 
                Integer.parseInt(cajaEdades.getSelectedItem().toString()), 
                Integer.parseInt(textoSalario.getText()), bonificacion, cajaZona.getSelectedItem().toString());
                repartidor.calcularBonificacion(Integer.parseInt(cajaEdades.getSelectedItem().toString()), 0, cajaZona.getSelectedItem().toString());
                boolean validacion = validarExistencia(textoNombre.getText());
                if (validacion == false){
                    empleados.add(repartidor);
                    seleccionNombre.addItem(repartidor.getNombre());
                    JOptionPane.showMessageDialog(null, "Se agregó correctamente al repartidor con bonificación $"+repartidor.getBonificacion());
                    textoNombre.setText("");
                    cajaEdades.setSelectedItem("18");
                    textoSalario.setText("");
                    cajaZona.setSelectedItem("Zona 1");
                }else{
                    JOptionPane.showMessageDialog(null, "Empleado homónimo, agrege distintivo\nError #2\n");
                }
            }
        }catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, "Verifica los datos, Error #1\n"+e);
        }
        
        
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonToCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonToCSVActionPerformed
        crearCSV();
        
    }//GEN-LAST:event_botonToCSVActionPerformed

    private void botonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarActionPerformed
        frameListar.setVisible(true);
        areaMostrar.setText(mostrarDatos());
    }//GEN-LAST:event_botonMostrarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "Estás a punto de eliminar todos los registros\n\n ¿Desea continuar?", 
                "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        
        int cantidad = empleados.size();
        if((cantidad > 0) && (respuesta == JOptionPane.YES_OPTION)){
            empleados.clear();
            seleccionNombre.removeAllItems();
            JOptionPane.showMessageDialog(null, "Se han eliminado "+cantidad+" registros exitosamente");
        }else{
            if(cantidad == 0 && respuesta == JOptionPane.YES_OPTION ){
                JOptionPane.showMessageDialog(null, "No hay registros para eliminar");
            }else{
                JOptionPane.showMessageDialog(null, "Acción cancelada");
            }
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        frameListar.setVisible(false);
    }//GEN-LAST:event_atrasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String t = " ";
        textoNombre.setText(t);
        textoSalario.setText(t);
        textoComision.setText(t);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void editZonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editZonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editZonaActionPerformed

    private void atrasEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasEditActionPerformed
        frameEdit.setVisible(false);
    }//GEN-LAST:event_atrasEditActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        frameEdit.setVisible(true); 
        
    }//GEN-LAST:event_editarActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        String seleccion = seleccionNombre.getSelectedItem().toString();
        for(int i=0; i<empleados.size();i++){
            if(empleados.get(i).getNombre().equals(seleccion)){
                seleccionNombre.removeItem(seleccion);
                seleccionNombre.addItem(editNombre.getText());
                empleados.get(i).setNombre(editNombre.getText());
                empleados.get(i).setEdad(Integer.parseInt(editEdad.getSelectedItem().toString()));
                empleados.get(i).setSalario(Integer.parseInt(editSalario.getText()));
                
                if(labelTipo.equals("Comercial")){
                    empleados.get(i).setComision(Integer.parseInt(editComision.getText()));
                    comercial.calcularBonificacion(Integer.parseInt(editEdad.getSelectedItem().toString()), Integer.parseInt(editComision.getText()), "");
                }else{
                    empleados.get(i).setZona(editZona.getSelectedItem().toString());
                }
            }
            
        }
        
        JOptionPane.showMessageDialog(null, "Se ha editado el registro exitosamente");
    }//GEN-LAST:event_actualizarActionPerformed

    private void seleccionNombrePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_seleccionNombrePropertyChange
        
    }//GEN-LAST:event_seleccionNombrePropertyChange

    private void seleccionNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seleccionNombreMouseClicked
        try{
            
            String seleccion = seleccionNombre.getSelectedItem().toString();
                for(int i=0; i<empleados.size();i++){
                if(empleados.get(i).getNombre().equals(seleccion)){
                    editNombre.setText(empleados.get(i).getNombre());
                    editEdad.setSelectedItem(empleados.get(i).getEdad());
                    editSalario.setText(Integer.toString(empleados.get(i).getSalario()));
                    editBonificacion.setText(Integer.toString(empleados.get(i).getBonificacion()));
                    if(empleados.get(i).getClass().getName().contains("comercial")){
                        labelTipo.setText("Comercial");
                        editComision.enable();
                        editComision.setText(Integer.toString(empleados.get(i).getComision()));
                        editZona.disable();
                        editBonificacion.disable();
                    }else{
                        if(empleados.get(i).getClass().getName().contains("repartidor")){
                            labelTipo.setText("Repartidor");
                            editComision.disable();
                            editComision.setText("N/A");
                            editZona.enable();
                            editZona.setSelectedItem(empleados.get(i).getZona());
                            editBonificacion.disable();
                        }
                    }
                    }
                }
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Sin datos a editar, Error #3\n"+e);
            frameEdit.setVisible(false);
        }
    }//GEN-LAST:event_seleccionNombreMouseClicked

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    public javax.swing.JTextArea areaMostrar;
    public javax.swing.JButton atras;
    private javax.swing.JButton atrasEdit;
    public javax.swing.JButton botonEliminar;
    public javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonMostrar;
    public javax.swing.JButton botonToCSV;
    public javax.swing.JComboBox<String> cajaEdades;
    public javax.swing.JComboBox<String> cajaTipo;
    public javax.swing.JComboBox<String> cajaZona;
    private javax.swing.JTextField editBonificacion;
    private javax.swing.JTextField editComision;
    public javax.swing.JComboBox<String> editEdad;
    private javax.swing.JTextField editNombre;
    private javax.swing.JTextField editSalario;
    public javax.swing.JComboBox<String> editZona;
    private javax.swing.JButton editar;
    public javax.swing.JFrame frameEdit;
    public javax.swing.JFrame frameListar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel labelTipo;
    public javax.swing.JComboBox<String> seleccionNombre;
    public javax.swing.JLabel texto1;
    public javax.swing.JTextField textoComision;
    public java.awt.TextField textoNombre;
    public java.awt.TextField textoSalario;
    // End of variables declaration//GEN-END:variables

    public void crearCSV(){
        
        try{
            PrintWriter pw = new PrintWriter(new File("D:\\new.csv"));
            StringBuilder sb = new StringBuilder();
            String coma = ",";
            String texto = "Nombre,Edad,Salario,Bonificacion,Comision,Tipo,Zona\n";
            
            sb.append(texto);
                
            for(int i=0; i<empleados.size();i++){
                if(empleados.get(i).getClass().getName().contains("comercial")){
                    sb.append(empleados.get(i).getNombre());
                    sb.append(coma);
                    sb.append(empleados.get(i).getEdad());
                    sb.append(coma);
                    sb.append(empleados.get(i).getSalario());
                    sb.append(coma);
                    sb.append(empleados.get(i).getBonificacion());
                    sb.append(coma);
                    sb.append(empleados.get(i).getComision());
                    sb.append(coma);
                    sb.append("Comercial");
                    sb.append(coma);
                    sb.append("#");
                    sb.append("\n");
                }else{
                    sb.append(empleados.get(i).getNombre());
                    sb.append(coma);
                    sb.append(empleados.get(i).getEdad());
                    sb.append(coma);
                    sb.append(empleados.get(i).getSalario());
                    sb.append(coma);
                    sb.append(empleados.get(i).getBonificacion());
                    sb.append(coma);
                    sb.append("#");
                    sb.append(coma);
                    sb.append("Repartidor");
                    sb.append(coma);
                    sb.append(empleados.get(i).getZona());
                    sb.append("\n");
                }
            }
            
            pw.write(sb.toString());
            pw.close();
            JOptionPane.showConfirmDialog(null, "Archivo exportado correctamente","¡!", JOptionPane.CLOSED_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
             
        }catch(Exception e){
            
        }
    }
    
    public String mostrarDatos(){
        String text = "";
        String cadena2 = "";
        for(int i=0; i<empleados.size();i++){
            
            if(empleados.get(i).getClass().getName().contains("comercial")){
                cadena2 = ("{Nombre: "+empleados.get(i).getNombre() + 
                        "   |   edad: " + Integer.toString(empleados.get(i).getEdad()) + 
                        "   |   salario: " + Integer.toString(empleados.get(i).getSalario()) + 
                        "   |   bonificación: " + Integer.toString(empleados.get(i).getBonificacion()) + 
                        "   |   comisión: " + Integer.toString(empleados.get(i).getComision()) + 
                        "   |   tipo: " + "Comercial" + "     |     zona: " + "   #   }" + "\n");
                    text = text + cadena2;
                }else{
                    cadena2 = ("{Nombre: "+empleados.get(i).getNombre() + "     |    edad: " + 
                            Integer.toString(empleados.get(i).getEdad()) + "    |    salario: " + 
                            Integer.toString(empleados.get(i).getSalario()) + " |    bonificación: " + 
                            Integer.toString(empleados.get(i).getBonificacion()) + "    |   comisión: " + 
                            "   #   " + "   |   tipo: " + "Repartidor" + "    |   zona: " + 
                            empleados.get(i).getZona() + "} \n");
                    text = text + cadena2;
                }
                
            }
        return text;
        
    }
    
    private boolean validarExistencia(String text) {
        boolean validado = false;
        for(int i=0;i<empleados.size();i++){
            if (empleados.get(i).getNombre().equalsIgnoreCase(text)){
                validado = true;
            }
        }
        return validado;
    }

    
}
