
package FORMULARIOS;
import Desarrollo.AbmLoguin;

import javax.swing.JOptionPane;


public class FrmLoguin extends javax.swing.JFrame {

    
   AbmLoguin ObLogueo;
   AbmLoguin ObLogueo2;
   AbmLoguin ObLogueo3;
   
   
   public FrmLoguin() {
        initComponents();
        this.ButtonEliminar.setVisible(false);
        this.ButtonCancelar.setVisible(false);
        this.ButtonActualizar.setVisible(false);
        this.ButtonBuscar.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoEstado = new javax.swing.ButtonGroup();
        GrupoCategoria = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        PanelCuerpo = new javax.swing.JPanel();
        LblNombre = new org.edisoncor.gui.label.LabelCustom();
        LblUsuario = new org.edisoncor.gui.label.LabelHeader();
        LblClave = new org.edisoncor.gui.label.LabelHeader();
        LblEstado = new org.edisoncor.gui.label.LabelMetric();
        LblCategoria = new org.edisoncor.gui.label.LabelRect();
        TxtNombre = new org.edisoncor.gui.textField.TextField();
        TxtUsuario = new org.edisoncor.gui.textField.TextField();
        TxtClave = new org.edisoncor.gui.passwordField.PasswordField();
        RdbActivo = new javax.swing.JRadioButton();
        RdbInactivo = new javax.swing.JRadioButton();
        RdbVendedor = new javax.swing.JRadioButton();
        RdbAdministrador = new javax.swing.JRadioButton();
        PanelTitulo = new javax.swing.JPanel();
        LblLoguin = new org.edisoncor.gui.label.LabelMetric();
        PanelButtoms = new javax.swing.JPanel();
        ButtonAlta = new javax.swing.JButton();
        ButtonModificacion = new javax.swing.JButton();
        ButtonBaja = new javax.swing.JButton();
        ButtonEliminar = new javax.swing.JButton();
        ButtonSalir = new javax.swing.JButton();
        ButtonCancelar = new javax.swing.JButton();
        ButtonBuscar = new javax.swing.JButton();
        ButtonActualizar = new javax.swing.JButton();
        PanelLegajo = new javax.swing.JPanel();
        TxtLegajo = new org.edisoncor.gui.textField.TextField();
        labelRect2 = new org.edisoncor.gui.label.LabelRect();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));
        setResizable(false);

        PanelCuerpo.setBackground(new java.awt.Color(102, 102, 255));

        LblNombre.setText("NOMBRE");

        LblUsuario.setText("USUARIO");

        LblClave.setText("Clave");

        LblEstado.setText("estado");

        LblCategoria.setText("Categoria");

        TxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreActionPerformed(evt);
            }
        });
        TxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNombreKeyTyped(evt);
            }
        });

        TxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsuarioActionPerformed(evt);
            }
        });
        TxtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtUsuarioKeyTyped(evt);
            }
        });

        TxtClave.setText("passwordField1");

        GrupoEstado.add(RdbActivo);
        RdbActivo.setSelected(true);
        RdbActivo.setText("Activo");

        GrupoEstado.add(RdbInactivo);
        RdbInactivo.setText("inactivo");

        GrupoCategoria.add(RdbVendedor);
        RdbVendedor.setSelected(true);
        RdbVendedor.setText("Vendedor");

        GrupoCategoria.add(RdbAdministrador);
        RdbAdministrador.setText("Administrador");

        javax.swing.GroupLayout PanelCuerpoLayout = new javax.swing.GroupLayout(PanelCuerpo);
        PanelCuerpo.setLayout(PanelCuerpoLayout);
        PanelCuerpoLayout.setHorizontalGroup(
            PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCuerpoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelCuerpoLayout.createSequentialGroup()
                            .addComponent(LblClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelCuerpoLayout.createSequentialGroup()
                            .addComponent(LblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addComponent(LblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCuerpoLayout.createSequentialGroup()
                                .addComponent(LblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RdbActivo)
                                    .addComponent(RdbInactivo)))
                            .addGroup(PanelCuerpoLayout.createSequentialGroup()
                                .addComponent(LblCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RdbVendedor)
                                    .addComponent(RdbAdministrador))))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        PanelCuerpoLayout.setVerticalGroup(
            PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCuerpoLayout.createSequentialGroup()
                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RdbActivo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RdbInactivo)
                        .addGap(12, 12, 12)
                        .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(LblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RdbAdministrador))
                        .addGap(18, 18, 18)
                        .addComponent(RdbVendedor))
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelTitulo.setBackground(new java.awt.Color(102, 102, 255));

        LblLoguin.setText("LOGUIN");
        LblLoguin.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        javax.swing.GroupLayout PanelTituloLayout = new javax.swing.GroupLayout(PanelTitulo);
        PanelTitulo.setLayout(PanelTituloLayout);
        PanelTituloLayout.setHorizontalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloLayout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(LblLoguin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTituloLayout.setVerticalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTituloLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(LblLoguin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        PanelButtoms.setBackground(new java.awt.Color(102, 102, 255));

        ButtonAlta.setText("ALTA");
        ButtonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAltaActionPerformed(evt);
            }
        });

        ButtonModificacion.setText("MODIFICACION");
        ButtonModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonModificacionActionPerformed(evt);
            }
        });

        ButtonBaja.setText("BAJA");
        ButtonBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBajaActionPerformed(evt);
            }
        });

        ButtonEliminar.setText("ELIMINAR");
        ButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEliminarActionPerformed(evt);
            }
        });

        ButtonSalir.setText("SALIR");
        ButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalirActionPerformed(evt);
            }
        });

        ButtonCancelar.setText("CANCELAR");
        ButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarActionPerformed(evt);
            }
        });

        ButtonBuscar.setText("BUSCAR");
        ButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscarActionPerformed(evt);
            }
        });

        ButtonActualizar.setText("ACTUALIZAR");
        ButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelButtomsLayout = new javax.swing.GroupLayout(PanelButtoms);
        PanelButtoms.setLayout(PanelButtomsLayout);
        PanelButtomsLayout.setHorizontalGroup(
            PanelButtomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelButtomsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonAlta)
                .addGap(18, 18, 18)
                .addComponent(ButtonBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(ButtonModificacion)
                .addGap(18, 18, 18)
                .addComponent(ButtonBaja)
                .addGap(18, 18, 18)
                .addComponent(ButtonEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonActualizar)
                .addGap(18, 18, 18)
                .addComponent(ButtonCancelar)
                .addGap(15, 15, 15)
                .addComponent(ButtonSalir)
                .addGap(18, 18, 18))
        );
        PanelButtomsLayout.setVerticalGroup(
            PanelButtomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelButtomsLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(PanelButtomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonBaja)
                    .addComponent(ButtonEliminar)
                    .addComponent(ButtonModificacion)
                    .addComponent(ButtonAlta)
                    .addComponent(ButtonSalir)
                    .addComponent(ButtonCancelar)
                    .addComponent(ButtonBuscar)
                    .addComponent(ButtonActualizar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelLegajo.setBackground(new java.awt.Color(102, 102, 255));

        TxtLegajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtLegajoActionPerformed(evt);
            }
        });
        TxtLegajo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtLegajoKeyTyped(evt);
            }
        });

        labelRect2.setText("Legajo");

        javax.swing.GroupLayout PanelLegajoLayout = new javax.swing.GroupLayout(PanelLegajo);
        PanelLegajo.setLayout(PanelLegajoLayout);
        PanelLegajoLayout.setHorizontalGroup(
            PanelLegajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLegajoLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(labelRect2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelLegajoLayout.setVerticalGroup(
            PanelLegajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLegajoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelLegajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRect2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelButtoms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelLegajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelCuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelLegajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelButtoms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAltaActionPerformed
      
       String Nom = this.TxtNombre.getText();
       String Usu = this.TxtUsuario.getText();
       String Clave = new String (this.TxtClave.getPassword());
       int Legajo = Integer.parseInt(this.TxtLegajo.getText());
        
       System.out.println(Clave);
       
       //estado 
       char Estado = 'j';
        if (this.RdbInactivo.isSelected()) 
        {
             Estado = 'I';
        }
        else 
        {
             Estado = 'A';
        }
        
        //categoria
        char Categoria = 'z';
        
        if (this.RdbAdministrador.isSelected()) 
        {
        Categoria = 'A';   
        } 
        else 
        {
            Categoria = 'V';
        }
        
        
        ObLogueo = new AbmLoguin (Legajo,Nom,Estado,Categoria,Usu,Clave);
        ObLogueo.Alta();
        Limpiar ();
       
    }//GEN-LAST:event_ButtonAltaActionPerformed

    private void TxtLegajoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtLegajoKeyTyped
       SoloNumeros (evt);
    }//GEN-LAST:event_TxtLegajoKeyTyped

    private void TxtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNombreKeyTyped
        SoloLetras (evt);
    }//GEN-LAST:event_TxtNombreKeyTyped

    private void TxtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtUsuarioKeyTyped
        SoloLetras (evt);
    }//GEN-LAST:event_TxtUsuarioKeyTyped

    private void TxtLegajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtLegajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtLegajoActionPerformed

    private void ButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEliminarActionPerformed
       int z = JOptionPane.showConfirmDialog(null, " Esta seguro ?");
       
        if (z == 0) 
        {
            int Legajo = Integer.parseInt(this.TxtLegajo.getText());
            ObLogueo2 = new AbmLoguin ();
            ObLogueo2.setNroLeg(Legajo);
            ObLogueo2.Baja();
            this.TxtLegajo.setText(null);
            Visible();
         
        }
    }//GEN-LAST:event_ButtonEliminarActionPerformed

    private void ButtonModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonModificacionActionPerformed
       /*
       OCULTAR TODOS LOS DATOS Y DEJAR SOLO VISIBLE EL LEGAJO
       debene aparecer dos botones, (Actualizar y Cancelar)
       => Si cancela,no hace nada, pone todo visible y va derecho al metodo limpiar
       => Si actualiza hace todo lo que esta escrito abajo.
        */
        Ocultar();
       this.ButtonModificacion.setVisible(false);
       this.ButtonEliminar.setVisible(false);
       this.ButtonActualizar.setVisible(false);
       this.ButtonBuscar.setVisible(true);
      
  
    }//GEN-LAST:event_ButtonModificacionActionPerformed

    private void Actualizar ()
    {
       String Nom = this.TxtNombre.getText();
       String Usu = this.TxtUsuario.getText();
       String Clave = new String (this.TxtClave.getPassword());
       int Legajo = Integer.parseInt(this.TxtLegajo.getText());
        
       
       
       //estado 
       char Estado = 'j';
        if (this.RdbInactivo.isSelected()) 
        {
             Estado = 'I';
        }
        else 
        {
             Estado = 'A';
        }
        
        //categoria
        char Categoria = 'z';
        
        if (this.RdbAdministrador.isSelected()) 
        {
        Categoria = 'A';   
        } 
        else 
        {
            Categoria = 'V';
        }
        
        
        ObLogueo = new AbmLoguin (Legajo,Nom,Estado,Categoria,Usu,Clave);
        ObLogueo.Modificacion(Legajo);
        Limpiar ();

    }
    private void ButtonBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBajaActionPerformed
       /*
        Ocultar todo menos legajo
        aparecer un boton eliminar
        y que al presionarlo pregunte si esta seguro, de ser asi que haga lo que tenemos
        escrito,caso contrario (CANCELAR) no hace nada.
        
        */
       Ocultar ();
       
       
       
    }//GEN-LAST:event_ButtonBajaActionPerformed

    private void ButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_ButtonSalirActionPerformed

    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed
      
        Visible();
        this.ButtonActualizar.setVisible(false);
       this.ButtonBuscar.setVisible(false);
        this.TxtLegajo.setText(null);
      
    }//GEN-LAST:event_ButtonCancelarActionPerformed

    private void ButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscarActionPerformed
        int Legajo = Integer.parseInt(this.TxtLegajo.getText());
        ObLogueo3 = new AbmLoguin ();
        
      boolean z1= ObLogueo3.BuscarLegajo(Legajo);
      
        if ( z1 == true) 
        {
            Visible ();
            
            this.TxtNombre.setText(ObLogueo3.getNom());
            this.TxtUsuario.setText(ObLogueo3.getUsu());
            this.TxtClave.setText(ObLogueo3.getClave());
            
            if (ObLogueo3.getEstado() == 'A') 
            {
                this.RdbActivo.isSelected();
            }
            
            else 
            {
                this.RdbInactivo.isSelected();
            }
            
            this.ButtonActualizar.setVisible(true);
            this.ButtonCancelar.setVisible(true);
            
            this.ButtonModificacion.setVisible(false);
            this.ButtonAlta.setVisible(false);
            this.ButtonBaja.setVisible(false);
            this.ButtonEliminar.setVisible(false);
            this.ButtonBuscar.setVisible(false);
             this.ButtonSalir.setVisible(false);
           
            
            
            
        }
    }//GEN-LAST:event_ButtonBuscarActionPerformed

    private void ButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActualizarActionPerformed
        Actualizar ();
    }//GEN-LAST:event_ButtonActualizarActionPerformed

    private void TxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreActionPerformed

    private void TxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUsuarioActionPerformed

    private void Visible ()
    {
       this.ButtonAlta.setVisible(true);
       this.ButtonBaja.setVisible(true);
       this.ButtonEliminar.setVisible(false);
       this.ButtonCancelar.setVisible(false);
       this.LblCategoria.setVisible(true);
       this.LblClave.setVisible(true);
       this.LblNombre.setVisible(true);
       this.LblUsuario.setVisible(true);
       this.RdbActivo.setVisible(true);
       this.RdbAdministrador.setVisible(true);
       this.RdbInactivo.setVisible(true);
       this.RdbVendedor.setVisible(true);
       this.TxtClave.setVisible(true);
       this.TxtNombre.setVisible(true);
       this.TxtUsuario.setVisible(true);
       this.LblEstado.setVisible(true);
       this.ButtonModificacion.setVisible(true);
       this.ButtonSalir.setVisible(true);
    }
    private void Ocultar ()
    {
       this.ButtonAlta.setVisible(false);
       this.ButtonBaja.setVisible(false);
       this.ButtonActualizar.setVisible(false);
       this.ButtonBuscar.setVisible(false);
       this.ButtonEliminar.setVisible(true);
       this.ButtonCancelar.setVisible(true);
       this.LblCategoria.setVisible(false);
       this.LblClave.setVisible(false);
       this.LblNombre.setVisible(false);
       this.LblUsuario.setVisible(false);
       this.RdbActivo.setVisible(false);
       this.RdbAdministrador.setVisible(false);
       this.RdbInactivo.setVisible(false);
       this.RdbVendedor.setVisible(false);
       this.TxtClave.setVisible(false);
       this.TxtNombre.setVisible(false);
       this.TxtUsuario.setVisible(false);
       this.LblEstado.setVisible(false);
       this.ButtonModificacion.setVisible(false);
       this.ButtonSalir.setVisible(false);
    }
    private void Limpiar ()
    {
        char asterisco = '*';
        this.TxtNombre.setText(null);
        this.TxtClave.setEchoChar(asterisco);
        this.TxtLegajo.setText(null);
        this.TxtUsuario.setText(null);
    }
    private void SoloLetras (java.awt.event.KeyEvent evt)
    {
        char letra = evt.getKeyChar();
         int BarraEspaciadora = (int) evt.getKeyChar();
        
        if (!Character.isLetter(letra) && (BarraEspaciadora != 32) && (BarraEspaciadora != 8)) 
        {
            
            JOptionPane.showMessageDialog(null, "Debe ingresar solamente letras !!!");
            evt.consume();
        }        
    }
    private void SoloNumeros (java.awt.event.KeyEvent evt)
    {
        int BarraEspaciadora = (int) evt.getKeyChar();
        char nro = evt.getKeyChar();
        if ( !Character.isDigit(nro) && BarraEspaciadora != 8) 
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, " Debe ingresar un numero ");
            
        }
    }
   
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
            java.util.logging.Logger.getLogger(FrmLoguin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLoguin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLoguin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLoguin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLoguin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonActualizar;
    private javax.swing.JButton ButtonAlta;
    private javax.swing.JButton ButtonBaja;
    private javax.swing.JButton ButtonBuscar;
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JButton ButtonEliminar;
    private javax.swing.JButton ButtonModificacion;
    private javax.swing.JButton ButtonSalir;
    private javax.swing.ButtonGroup GrupoCategoria;
    private javax.swing.ButtonGroup GrupoEstado;
    private org.edisoncor.gui.label.LabelRect LblCategoria;
    private org.edisoncor.gui.label.LabelHeader LblClave;
    private org.edisoncor.gui.label.LabelMetric LblEstado;
    private org.edisoncor.gui.label.LabelMetric LblLoguin;
    private org.edisoncor.gui.label.LabelCustom LblNombre;
    private org.edisoncor.gui.label.LabelHeader LblUsuario;
    private javax.swing.JPanel PanelButtoms;
    private javax.swing.JPanel PanelCuerpo;
    private javax.swing.JPanel PanelLegajo;
    private javax.swing.JPanel PanelTitulo;
    private javax.swing.JRadioButton RdbActivo;
    private javax.swing.JRadioButton RdbAdministrador;
    private javax.swing.JRadioButton RdbInactivo;
    private javax.swing.JRadioButton RdbVendedor;
    private org.edisoncor.gui.passwordField.PasswordField TxtClave;
    private org.edisoncor.gui.textField.TextField TxtLegajo;
    private org.edisoncor.gui.textField.TextField TxtNombre;
    private org.edisoncor.gui.textField.TextField TxtUsuario;
    private javax.swing.JDialog jDialog1;
    private org.edisoncor.gui.label.LabelRect labelRect2;
    // End of variables declaration//GEN-END:variables
}
