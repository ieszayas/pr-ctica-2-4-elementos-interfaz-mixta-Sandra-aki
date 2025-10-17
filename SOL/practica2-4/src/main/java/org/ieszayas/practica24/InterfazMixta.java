package org.ieszayas.practica24;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.regex.Pattern;
import javax.swing.JSplitPane;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

public class InterfazMixta extends javax.swing.JFrame {

    public InterfazMixta() {
        initComponents();
        inicializarEventosParte1();
        inicializarEventosParte2();
        inicializarEventosParte3();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbOpcion1 = new javax.swing.JRadioButton();
        rbOpcion2 = new javax.swing.JRadioButton();
        rbOpcion3 = new javax.swing.JRadioButton();
        cbCheck1 = new javax.swing.JCheckBox();
        cbCheck2 = new javax.swing.JCheckBox();
        cbCheck3 = new javax.swing.JCheckBox();
        lblCorreo = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtCampo1 = new javax.swing.JTextField();
        pwdContraseña = new javax.swing.JPasswordField();
        btnAceptar = new javax.swing.JButton();
        btnRedondo = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();
        slider = new javax.swing.JSlider();
        cbLista = new javax.swing.JComboBox<>();
        spinner = new javax.swing.JSpinner();
        splitPane = new javax.swing.JSplitPane();
        pane1 = new javax.swing.JPanel();
        pane2 = new javax.swing.JPanel();
        cbCorreoValido = new javax.swing.JCheckBox();
        separator = new javax.swing.JSeparator();
        txtCorreoDup = new javax.swing.JTextField();
        txtCampo1Dup = new javax.swing.JTextField();
        pwdContraseñaDup = new javax.swing.JPasswordField();
        btnAceptarDup = new javax.swing.JButton();
        btnCancelarDup = new javax.swing.JButton();
        btnAyudaDup = new javax.swing.JButton();
        sliderDup = new javax.swing.JSlider();
        rbOpcion1Dup = new javax.swing.JRadioButton();
        rbOpcion2Dup = new javax.swing.JRadioButton();
        rbOpcion3Dup = new javax.swing.JRadioButton();
        cbCheck1Dup = new javax.swing.JCheckBox();
        cbCheck2Dup = new javax.swing.JCheckBox();
        cbCheck3Dup = new javax.swing.JCheckBox();
        lblCorreoDup = new javax.swing.JLabel();
        lblContraseñaDup = new javax.swing.JLabel();
        cbListaDup = new javax.swing.JComboBox<>();
        spinnerDup = new javax.swing.JSpinner();
        jSplitPane1 = new javax.swing.JSplitPane();
        pane1Dup = new javax.swing.JPanel();
        pane2Dup = new javax.swing.JPanel();
        statusPanel = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuEdicion = new javax.swing.JMenu();
        itemBorrarTodo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GUIMixta");

        rbOpcion1.setText("Opción 1");

        rbOpcion2.setText("Opción 2");

        rbOpcion3.setText("Opción 3");

        cbCheck1.setText("Opción 4");

        cbCheck2.setText("Opción 5");

        cbCheck3.setText("Opción 6");

        lblCorreo.setText("Correo");

        lblContraseña.setText("Contraseña");

        pwdContraseña.setText("....");
        pwdContraseña.putClientProperty(FlatClientProperties.STYLE, "showRevealButton:true");

        btnAceptar.setText("Aceptar");

        btnRedondo.setText("Redondo");
        btnRedondo.putClientProperty(FlatClientProperties.BUTTON_TYPE, FlatClientProperties.BUTTON_TYPE_ROUND_RECT);

        btnAyuda.putClientProperty(FlatClientProperties.BUTTON_TYPE, FlatClientProperties.BUTTON_TYPE_HELP);
        btnAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });

        cbLista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        pane1.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout pane1Layout = new javax.swing.GroupLayout(pane1);
        pane1.setLayout(pane1Layout);
        pane1Layout.setHorizontalGroup(
            pane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pane1Layout.setVerticalGroup(
            pane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(pane1);

        pane2.setBackground(new java.awt.Color(0, 102, 153));

        javax.swing.GroupLayout pane2Layout = new javax.swing.GroupLayout(pane2);
        pane2.setLayout(pane2Layout);
        pane2Layout.setHorizontalGroup(
            pane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );
        pane2Layout.setVerticalGroup(
            pane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        splitPane.setLeftComponent(pane2);

        cbCorreoValido.setEnabled(false);

        txtCorreoDup.setEnabled(false);

        txtCampo1Dup.setEnabled(false);

        pwdContraseñaDup.setText("....");
        pwdContraseñaDup.setEnabled(false);
        pwdContraseñaDup.putClientProperty(FlatClientProperties.STYLE, "showRevealButton:true");

        btnAceptarDup.setText("Aceptar");
        btnAceptarDup.setEnabled(false);

        btnCancelarDup.setText("Redondo");
        btnCancelarDup.setEnabled(false);
        btnCancelarDup.putClientProperty(FlatClientProperties.BUTTON_TYPE, FlatClientProperties.BUTTON_TYPE_ROUND_RECT);

        btnAyudaDup.setEnabled(false);
        btnAyudaDup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaDupActionPerformed(evt);
            }
        });
        btnAyudaDup.putClientProperty(FlatClientProperties.BUTTON_TYPE, FlatClientProperties.BUTTON_TYPE_HELP);

        sliderDup.setEnabled(false);

        rbOpcion1Dup.setText("Opción 1");
        rbOpcion1Dup.setEnabled(false);

        rbOpcion2Dup.setText("Opción 2");
        rbOpcion2Dup.setEnabled(false);

        rbOpcion3Dup.setText("Opción 3");
        rbOpcion3Dup.setEnabled(false);

        cbCheck1Dup.setText("Opción 4");
        cbCheck1Dup.setEnabled(false);

        cbCheck2Dup.setText("Opción 5");
        cbCheck2Dup.setEnabled(false);

        cbCheck3Dup.setText("Opción 6");
        cbCheck3Dup.setEnabled(false);

        lblCorreoDup.setText("Correo");
        lblCorreoDup.setEnabled(false);

        lblContraseñaDup.setText("Contraseña");
        lblContraseñaDup.setEnabled(false);

        cbListaDup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbListaDup.setEnabled(false);

        spinnerDup.setEnabled(false);

        pane1Dup.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout pane1DupLayout = new javax.swing.GroupLayout(pane1Dup);
        pane1Dup.setLayout(pane1DupLayout);
        pane1DupLayout.setHorizontalGroup(
            pane1DupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );
        pane1DupLayout.setVerticalGroup(
            pane1DupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        jSplitPane1.setLeftComponent(pane1Dup);

        pane2Dup.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout pane2DupLayout = new javax.swing.GroupLayout(pane2Dup);
        pane2Dup.setLayout(pane2DupLayout);
        pane2DupLayout.setHorizontalGroup(
            pane2DupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pane2DupLayout.setVerticalGroup(
            pane2DupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(pane2Dup);

        lblStatus.setText("jLabel1");

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statusPanelLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(lblStatus))
        );

        menuArchivo.setText("Archivo");
        menuBar.add(menuArchivo);

        menuEdicion.setText("Edit");

        itemBorrarTodo.setText("Borrar Todo");
        itemBorrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBorrarTodoActionPerformed(evt);
            }
        });
        menuEdicion.add(itemBorrarTodo);

        itemBorrarTodo.addActionListener(e -> {
            txtCorreo.setText("");
            pwdContraseña.setText("");
            slider.setValue(50);
            lblStatus.setText("");
        });

        menuBar.add(menuEdicion);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbOpcion1Dup)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbCheck1Dup, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbOpcion3Dup)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbCheck3Dup, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbOpcion2Dup)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbCheck2Dup, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbListaDup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(spinnerDup, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCampo1Dup, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sliderDup, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(28, 28, 28))
                            .addComponent(separator)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(381, 381, 381)
                                        .addComponent(splitPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbOpcion1)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbCheck1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rbOpcion3)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbCheck3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rbOpcion2)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbCheck2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cbLista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(spinner)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblCorreo)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblContraseña)
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(pwdContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(cbCorreoValido, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(74, 74, 74)
                                                    .addComponent(btnAceptar)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(btnRedondo)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblContraseñaDup)
                                    .addComponent(lblCorreoDup))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pwdContraseñaDup, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                    .addComponent(txtCorreoDup))
                                .addGap(221, 221, 221)
                                .addComponent(btnAceptarDup)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelarDup)
                                .addGap(18, 18, 18)
                                .addComponent(btnAyudaDup, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(statusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbOpcion1)
                            .addComponent(cbCheck1)
                            .addComponent(txtCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbOpcion2)
                            .addComponent(cbCheck2)
                            .addComponent(spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbOpcion3)
                            .addComponent(cbCheck3)
                            .addComponent(cbLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(splitPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCorreo)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbCorreoValido))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAceptar)
                            .addComponent(btnRedondo))))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContraseña)
                    .addComponent(pwdContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbOpcion1Dup)
                            .addComponent(cbCheck1Dup)
                            .addComponent(txtCampo1Dup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sliderDup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbOpcion2Dup)
                            .addComponent(cbCheck2Dup)
                            .addComponent(spinnerDup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbOpcion3Dup)
                            .addComponent(cbCheck3Dup)
                            .addComponent(cbListaDup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAyudaDup, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAceptarDup)
                        .addComponent(btnCancelarDup))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCorreoDup)
                        .addComponent(txtCorreoDup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContraseñaDup)
                    .addComponent(pwdContraseñaDup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAyudaActionPerformed

    private void btnAyudaDupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaDupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAyudaDupActionPerformed

    private void itemBorrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBorrarTodoActionPerformed
        // Limpiar campos de texto
        txtCorreo.setText("");
        txtCampo1.setText("");
        pwdContraseña.setText("");

        // Restablecer slider, spinner y combo 
        slider.setValue(50);
        spinner.setValue(0);
        cbLista.setSelectedIndex(0);

        // Desmarcar checkboxes 
        cbCheck1.setSelected(false);
        cbCheck2.setSelected(false);
        cbCheck3.setSelected(false);

        // Desmarcar radio buttons 
        rbOpcion1.setSelected(false);
        rbOpcion2.setSelected(false);
        rbOpcion3.setSelected(false);

        // Limpiar duplicados 
        txtCorreoDup.setText("");
        txtCampo1Dup.setText("");
        pwdContraseñaDup.setText("");
        sliderDup.setValue(50);
        spinnerDup.setValue(0);
        cbListaDup.setSelectedIndex(0);
        cbCheck1Dup.setSelected(false);
        cbCheck2Dup.setSelected(false);
        cbCheck3Dup.setSelected(false);
        rbOpcion1Dup.setSelected(false);
        rbOpcion2Dup.setSelected(false);
        rbOpcion3Dup.setSelected(false);

        // Restablecer validación correo 
        cbCorreoValido.setBorder(new javax.swing.border.LineBorder(Color.GRAY, 1));
        cbCorreoValido.setSelected(false);

        // Actualizar barra de estado
        lblStatus.setText("Campos borrados correctamente");

    }//GEN-LAST:event_itemBorrarTodoActionPerformed
    // METODOS

    private void inicializarEventosParte1() {
        // Campo 1: texto invertido
        txtCampo1.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                actualizarCampo1();
            }

            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                actualizarCampo1();
            }

            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                actualizarCampo1();
            }

            private void actualizarCampo1() {
                String texto = txtCampo1.getText();
                txtCampo1Dup.setText(new StringBuilder(texto).reverse().toString());
            }
        });

        // Campo correo: igual
        txtCorreo.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                txtCorreoDup.setText(txtCorreo.getText());
            }

            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                txtCorreoDup.setText(txtCorreo.getText());
            }

            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                txtCorreoDup.setText(txtCorreo.getText());
            }
        });

        // Contraseña
        pwdContraseña.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                pwdContraseñaDup.setText(new String(pwdContraseña.getPassword()));
            }

            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                pwdContraseñaDup.setText(new String(pwdContraseña.getPassword()));
            }

            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                pwdContraseñaDup.setText(new String(pwdContraseña.getPassword()));
            }
        });

        // Radio Buttons
        javax.swing.ButtonGroup grupo1 = new javax.swing.ButtonGroup();
        grupo1.add(rbOpcion1);
        grupo1.add(rbOpcion2);
        grupo1.add(rbOpcion3);
        javax.swing.ButtonGroup grupo2 = new javax.swing.ButtonGroup();
        grupo2.add(rbOpcion1Dup);
        grupo2.add(rbOpcion2Dup);
        grupo2.add(rbOpcion3Dup);

        rbOpcion1.addActionListener(e -> rbOpcion1Dup.setSelected(true));
        rbOpcion2.addActionListener(e -> rbOpcion2Dup.setSelected(true));
        rbOpcion3.addActionListener(e -> rbOpcion3Dup.setSelected(true));

        // Checkboxes
        cbCheck1.addActionListener(e -> cbCheck1Dup.setSelected(cbCheck1.isSelected()));
        cbCheck2.addActionListener(e -> cbCheck2Dup.setSelected(cbCheck2.isSelected()));
        cbCheck3.addActionListener(e -> cbCheck3Dup.setSelected(cbCheck3.isSelected()));

        // ComboBox
        cbLista.addActionListener(e -> cbListaDup.setSelectedIndex(cbLista.getSelectedIndex()));

        // Spinner
        spinner.addChangeListener(e -> spinnerDup.setValue(spinner.getValue()));

        // Slider
        slider.addChangeListener(e -> sliderDup.setValue(slider.getValue()));
    }

    private void inicializarEventosParte2() {
        // SLIDER: Mostrar porcentaje en tiempo real
        slider.addChangeListener(e -> {
            int valor = slider.getValue();
            lblStatus.setText("Porcentaje: " + valor + "%");
            sliderDup.setValue(valor);
        });

        // VALIDACIÓN DEL CORREO
        txtCorreo.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                validarCorreo();
            }

            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                validarCorreo();
            }

            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                validarCorreo();
            }

            private void validarCorreo() {
                String correo = txtCorreo.getText();
                boolean valido = Pattern.matches("^[\\w._%+-]+@[\\w.-]+\\.[A-Za-z]{2,}$", correo);

                if (valido) {
                    txtCorreo.setBorder(new LineBorder(Color.GREEN, 2));
                    cbCorreoValido.setSelected(true);
                    lblStatus.setText("Correo válido");
                } else {
                    txtCorreo.setBorder(new LineBorder(Color.RED, 2));
                    cbCorreoValido.setSelected(false);
                    lblStatus.setText("Correo inválido");
                }
            }
        });
    }

    private void inicializarEventosParte3() {

        // 1. Botón Aceptar reflejando acción en duplicado
        btnAceptar.addActionListener(e -> {
            // Acción original
            lblStatus.setText("¡Aceptar pulsado!");
            // Reflejar en duplicado
            btnAceptarDup.doClick();
        });

        btnAceptarDup.addActionListener(e -> {
            lblStatus.setText("¡Botón duplicado pulsado!");
        });

        // 2. Botón Ayuda mostrando mensaje
        btnAyuda.addActionListener(e -> {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Este es un mensaje de ayuda",
                    "Ayuda",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        });

        btnAyudaDup.addActionListener(e -> {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Este es un mensaje de ayuda (duplicado)",
                    "Ayuda",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        });

        // 3. Sincronizar JSplitPane
        splitPane.addPropertyChangeListener(JSplitPane.DIVIDER_LOCATION_PROPERTY, e -> {
            int loc = splitPane.getDividerLocation();
            jSplitPane1.setDividerLocation(loc);
        });
    }

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
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazMixta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAceptarDup;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnAyudaDup;
    private javax.swing.JButton btnCancelarDup;
    private javax.swing.JButton btnRedondo;
    private javax.swing.JCheckBox cbCheck1;
    private javax.swing.JCheckBox cbCheck1Dup;
    private javax.swing.JCheckBox cbCheck2;
    private javax.swing.JCheckBox cbCheck2Dup;
    private javax.swing.JCheckBox cbCheck3;
    private javax.swing.JCheckBox cbCheck3Dup;
    private javax.swing.JCheckBox cbCorreoValido;
    private javax.swing.JComboBox<String> cbLista;
    private javax.swing.JComboBox<String> cbListaDup;
    private javax.swing.JMenuItem itemBorrarTodo;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblContraseñaDup;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblCorreoDup;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuEdicion;
    private javax.swing.JPanel pane1;
    private javax.swing.JPanel pane1Dup;
    private javax.swing.JPanel pane2;
    private javax.swing.JPanel pane2Dup;
    private javax.swing.JPasswordField pwdContraseña;
    private javax.swing.JPasswordField pwdContraseñaDup;
    private javax.swing.JRadioButton rbOpcion1;
    private javax.swing.JRadioButton rbOpcion1Dup;
    private javax.swing.JRadioButton rbOpcion2;
    private javax.swing.JRadioButton rbOpcion2Dup;
    private javax.swing.JRadioButton rbOpcion3;
    private javax.swing.JRadioButton rbOpcion3Dup;
    private javax.swing.JSeparator separator;
    private javax.swing.JSlider slider;
    private javax.swing.JSlider sliderDup;
    private javax.swing.JSpinner spinner;
    private javax.swing.JSpinner spinnerDup;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JTextField txtCampo1;
    private javax.swing.JTextField txtCampo1Dup;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCorreoDup;
    // End of variables declaration//GEN-END:variables
}
