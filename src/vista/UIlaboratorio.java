
package vista;
import controlador.AbmLaboratorio;
import javax.swing.JOptionPane;



public class UIlaboratorio extends javax.swing.JInternalFrame {
    AbmLaboratorio ObjLab;
    AbmLaboratorio ObjLab2;
    private String NomLabBorrar = null;
    private String NomViejo = null;
 
    public UIlaboratorio() 
    {
        initComponents();
        this.PnlConsultaItem.setVisible(false); //ocultamosel panel de los items
        this.BtnBuscar.setVisible(false);
        this.BtnCancelar.setVisible(false);
        this.BtnEliminar.setVisible(false);
        this.BtnActualizar.setVisible(false);
        this.BtnModificaciones.setVisible(false);
        this.BtnBajas.setVisible(false);
      //  this.setLocationRelativeto(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPPalCat = new javax.swing.JPanel();
        PanelBtnCat = new javax.swing.JPanel();
        BtnAltas = new javax.swing.JButton();
        BtnBajas = new javax.swing.JButton();
        BtnModificaciones = new javax.swing.JButton();
        BtnConsultas = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnActualizar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        LblCatProd = new javax.swing.JLabel();
        LblNombre = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        PnlConsultaItem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaLaboratorios = new javax.swing.JList<>();

        setBackground(new java.awt.Color(254, 147, 9));
        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Laboratorio");

        PanelPPalCat.setBackground(new java.awt.Color(254, 147, 9));

        PanelBtnCat.setBackground(new java.awt.Color(204, 255, 204));

        BtnAltas.setText("ALTAS");
        BtnAltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAltasActionPerformed(evt);
            }
        });

        BtnBajas.setText("BAJAS");
        BtnBajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBajasActionPerformed(evt);
            }
        });

        BtnModificaciones.setText("MODIFICACIONES");
        BtnModificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificacionesActionPerformed(evt);
            }
        });

        BtnConsultas.setText("CONSULTAS");
        BtnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultasActionPerformed(evt);
            }
        });

        BtnSalir.setText("SALIR");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnEliminar.setText("ELIMINAR");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnActualizar.setText("ACTUALIZAR");
        BtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarActionPerformed(evt);
            }
        });

        BtnBuscar.setText("BUSCAR");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        BtnCancelar.setText("CANCELAR");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBtnCatLayout = new javax.swing.GroupLayout(PanelBtnCat);
        PanelBtnCat.setLayout(PanelBtnCatLayout);
        PanelBtnCatLayout.setHorizontalGroup(
            PanelBtnCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBtnCatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBtnCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBtnCatLayout.createSequentialGroup()
                        .addComponent(BtnEliminar)
                        .addGap(74, 74, 74)
                        .addComponent(BtnActualizar))
                    .addGroup(PanelBtnCatLayout.createSequentialGroup()
                        .addComponent(BtnAltas)
                        .addGap(56, 56, 56)
                        .addComponent(BtnBajas)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelBtnCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnBuscar)
                    .addComponent(BtnModificaciones))
                .addGroup(PanelBtnCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBtnCatLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(BtnConsultas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnSalir))
                    .addGroup(PanelBtnCatLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(BtnCancelar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelBtnCatLayout.setVerticalGroup(
            PanelBtnCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBtnCatLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PanelBtnCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnBajas)
                    .addComponent(BtnConsultas)
                    .addComponent(BtnSalir)
                    .addComponent(BtnModificaciones)
                    .addComponent(BtnAltas))
                .addGap(18, 18, 18)
                .addGroup(PanelBtnCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBtnCatLayout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addGroup(PanelBtnCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnActualizar)
                            .addComponent(BtnBuscar)))
                    .addGroup(PanelBtnCatLayout.createSequentialGroup()
                        .addGroup(PanelBtnCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnEliminar)
                            .addComponent(BtnCancelar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        LblCatProd.setFont(new java.awt.Font("Abyssinica SIL", 1, 24)); // NOI18N
        LblCatProd.setForeground(new java.awt.Color(25, 13, 13));
        LblCatProd.setText("LABORATORIOS DE PRODUCTOS");

        LblNombre.setText("NOMBRE");

        TxtNombre.setText("ingrese el nombre aqui");
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

        PnlConsultaItem.setBackground(new java.awt.Color(0, 255, 204));

        ListaLaboratorios.setBackground(new java.awt.Color(204, 255, 204));
        jScrollPane1.setViewportView(ListaLaboratorios);

        javax.swing.GroupLayout PnlConsultaItemLayout = new javax.swing.GroupLayout(PnlConsultaItem);
        PnlConsultaItem.setLayout(PnlConsultaItemLayout);
        PnlConsultaItemLayout.setHorizontalGroup(
            PnlConsultaItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlConsultaItemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PnlConsultaItemLayout.setVerticalGroup(
            PnlConsultaItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlConsultaItemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelPPalCatLayout = new javax.swing.GroupLayout(PanelPPalCat);
        PanelPPalCat.setLayout(PanelPPalCatLayout);
        PanelPPalCatLayout.setHorizontalGroup(
            PanelPPalCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPPalCatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPPalCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPPalCatLayout.createSequentialGroup()
                        .addComponent(PanelBtnCat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPPalCatLayout.createSequentialGroup()
                        .addComponent(LblNombre)
                        .addGap(41, 41, 41)
                        .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PnlConsultaItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(PanelPPalCatLayout.createSequentialGroup()
                        .addComponent(LblCatProd)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PanelPPalCatLayout.setVerticalGroup(
            PanelPPalCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPPalCatLayout.createSequentialGroup()
                .addGroup(PanelPPalCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPPalCatLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(PnlConsultaItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPPalCatLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(LblCatProd)
                        .addGap(54, 54, 54)
                        .addGroup(PanelPPalCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblNombre)
                            .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(PanelBtnCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPPalCat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPPalCat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        // TODO add your handling code here:
        
        dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnAltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAltasActionPerformed
        String Nombre = this.TxtNombre.getText();
        ObjLab = new AbmLaboratorio(Nombre);
        ObjLab.Alta();
        Limpiar();
        
    }//GEN-LAST:event_BtnAltasActionPerformed

    private void TxtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNombreKeyTyped
        // TODO add your handling code here:
        SoloLetras(evt);
        
    }//GEN-LAST:event_TxtNombreKeyTyped

    private void BtnBajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBajasActionPerformed
      
        
        this.BtnModificaciones.setVisible(false);
        this.BtnConsultas.setVisible(false);
        Ocultar();
        this.ListaLaboratorios.setVisible(true);
        this.BtnCancelar.setVisible(true);
        this.BtnEliminar.setVisible(true);        
        this.BtnBajas.setVisible(false);
        this.PnlConsultaItem.setVisible(true);
        
        NomLabBorrar = this.ListaLaboratorios.getSelectedValue();
    }//GEN-LAST:event_BtnBajasActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        this.PnlConsultaItem.setVisible(false);
        this.TxtNombre.setText(null);
         Visible();
         
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        // TODO add your handling code here:
        int z = JOptionPane.showConfirmDialog(null, "Esta seguro ?");
        if ( z == 0) 
        
        {
            ObjLab = new AbmLaboratorio();
            ObjLab.setNom(NomLabBorrar); // ENVIO AL EL DATO ELEGIDO AL ATRIBUTO   
            ObjLab.Baja(); // EJECTURA LA INSTRUCCION DE BORRAR DE MYSQL
            this.TxtNombre.setText(null);
            ObjLab = new AbmLaboratorio();
            ListaLaboratorios.setModel(ObjLab.Muestro());
            Visible();
        }
        
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultasActionPerformed
       this.ListaLaboratorios.setVisible(true);
       this.BtnSalir.setVisible(true);
       this.BtnBajas.setVisible(true);
       this.BtnModificaciones.setVisible(true);
       this.PnlConsultaItem.setVisible(true);
       this.LblNombre.setVisible(false);
       this.BtnAltas.setVisible(false);
       this.TxtNombre.setVisible(false);
       this.BtnEliminar.setVisible(false);
       this.BtnConsultas.setVisible(false);
       
        ObjLab2 = new AbmLaboratorio();
        //ObjCat2.Muestro();
        this.ListaLaboratorios.setModel(ObjLab2.Muestro());
    
        
    }//GEN-LAST:event_BtnConsultasActionPerformed

    private void BtnModificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificacionesActionPerformed
      this.BtnBajas.setVisible(false);
      this.BtnCancelar.setVisible(true);
      this.BtnBuscar.setVisible(false);
      this.BtnActualizar.setVisible(true);
      this.BtnModificaciones.setVisible(false);
      this.BtnConsultas.setVisible(false);
      Ocultar ();
      
      NomViejo = this.ListaLaboratorios.getSelectedValue(); // TOMA EL VALOR QUE QUIERE MODIFICAR
      this.TxtNombre.setText(NomViejo); // se lo manda al atributo porque lo necesita para encontrar en la tabla
      this.TxtNombre.setVisible(true); // habilita el label y la tabla
      this.LblNombre.setVisible(true);
        
    }//GEN-LAST:event_BtnModificacionesActionPerformed

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed
        String NomAct = this.TxtNombre.getText();
        ObjLab2 = new AbmLaboratorio(NomViejo); 
        ObjLab2.Modif(NomAct);
        
        Limpiar ();
        
        ListaLaboratorios.setModel(ObjLab2.Muestro());
        Visible();
        
    }//GEN-LAST:event_BtnActualizarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void TxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreActionPerformed

 private void Ocultar()
    {
        this.BtnAltas.setVisible(false);
        this.BtnSalir.setVisible(false);
        
        //abrir el panel de consulta y luego borrar desde ahi.
        this.LblNombre.setVisible(false);
        this.TxtNombre.setVisible(false);  
    }
    
 private void Limpiar()
    {
        this.TxtNombre.setText(null);
       // this.TxtNroLegajo.setText(null);
       // this.TxtUsuario.setText(null);
        char asterisco = '*';
       // this.TxtClave.setEchoChar(asterisco);
    }
 
 private void SoloLetras(java.awt.event.KeyEvent evt)
    {
        char Letra = evt.getKeyChar();
        int Bs = (int) evt.getKeyChar();
        if ( !Character.isLetter(Letra) && Bs != 32  && Bs != 8 ) 
        {
            JOptionPane.showMessageDialog(null, "Debe ingresar una letra");
            evt.consume();
            
        }
    }
 
  private void Visible()
    {
        this.BtnActualizar.setVisible(false);
        this.BtnModificaciones.setVisible(false);
        this.BtnCancelar.setVisible(false);
        this.BtnEliminar.setVisible(false);        
        this.BtnBajas.setVisible(false);
        this.BtnAltas.setVisible(true);
        this.BtnSalir.setVisible(true); 
        this.LblNombre.setVisible(true);
        this.TxtNombre.setVisible(true);
        this.BtnConsultas.setVisible(true);
        
        
        
    }
 public void Modificacion(int Legajo)
    {
      
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnAltas;
    private javax.swing.JButton BtnBajas;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnConsultas;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnModificaciones;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel LblCatProd;
    private javax.swing.JLabel LblNombre;
    private javax.swing.JList<String> ListaLaboratorios;
    private javax.swing.JPanel PanelBtnCat;
    private javax.swing.JPanel PanelPPalCat;
    private javax.swing.JPanel PnlConsultaItem;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
