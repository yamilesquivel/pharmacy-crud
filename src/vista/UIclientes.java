
package vista;
import controlador.AbmClientes;
import javax.swing.JOptionPane;



public class UIclientes extends javax.swing.JInternalFrame {
    AbmClientes ObjClientes;
    AbmClientes ObjClientes2;
    private String NomClientesBorrar = null;
    private String NomViejo = null;
 
    public UIclientes() 
    {
        initComponents();
        this.PnlConsultaItem.setVisible(false); //ocultamosel panel de los items
        this.BtnBuscar.setVisible(false);
        this.BtnCancelar.setVisible(false);
        this.BtnEliminar.setVisible(false);
        this.BtnActualizar.setVisible(false);
        this.BtnModificaciones.setVisible(false);
        this.BtnBajas.setVisible(false);
        this.setLocation(0, 0); 
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPPalCat = new javax.swing.JPanel();
        PanelBtnCat = new javax.swing.JPanel();
        BtnBajas = new javax.swing.JButton();
        BtnModificaciones = new javax.swing.JButton();
        BtnActualizar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        BtnAltas = new javax.swing.JButton();
        BtnConsultas = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        LblCatProd = new javax.swing.JLabel();
        LblNombre = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        PnlConsultaItem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaClientes = new javax.swing.JList<>();

        setBackground(new java.awt.Color(254, 147, 9));
        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Cliente");

        PanelPPalCat.setBackground(new java.awt.Color(254, 147, 9));

        PanelBtnCat.setBackground(new java.awt.Color(204, 255, 204));

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

        BtnActualizar.setText("ACTUALIZAR");
        BtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarActionPerformed(evt);
            }
        });

        BtnCancelar.setText("CANCELAR");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BtnAltas.setText("ALTAS");
        BtnAltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAltasActionPerformed(evt);
            }
        });

        BtnConsultas.setText("CONSULTAS");
        BtnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultasActionPerformed(evt);
            }
        });

        BtnEliminar.setText("ELIMINAR");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnBuscar.setText("BUSCAR");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBtnCatLayout = new javax.swing.GroupLayout(PanelBtnCat);
        PanelBtnCat.setLayout(PanelBtnCatLayout);
        PanelBtnCatLayout.setHorizontalGroup(
            PanelBtnCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBtnCatLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelBtnCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelBtnCatLayout.createSequentialGroup()
                        .addComponent(BtnAltas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelBtnCatLayout.createSequentialGroup()
                        .addComponent(BtnBajas, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnModificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(PanelBtnCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelBtnCatLayout.createSequentialGroup()
                        .addComponent(BtnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnCancelar))
                    .addGroup(PanelBtnCatLayout.createSequentialGroup()
                        .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelBtnCatLayout.setVerticalGroup(
            PanelBtnCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBtnCatLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(PanelBtnCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAltas)
                    .addComponent(BtnConsultas)
                    .addComponent(BtnEliminar)
                    .addComponent(BtnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelBtnCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnBajas)
                    .addComponent(BtnModificaciones)
                    .addComponent(BtnActualizar)
                    .addComponent(BtnCancelar))
                .addGap(29, 29, 29))
        );

        LblCatProd.setFont(new java.awt.Font("Abyssinica SIL", 1, 36)); // NOI18N
        LblCatProd.setForeground(new java.awt.Color(17, 9, 9));
        LblCatProd.setText("CLIENTE");

        LblNombre.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        LblNombre.setForeground(new java.awt.Color(26, 4, 4));
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

        ListaClientes.setBackground(new java.awt.Color(204, 255, 204));
        jScrollPane1.setViewportView(ListaClientes);

        javax.swing.GroupLayout PnlConsultaItemLayout = new javax.swing.GroupLayout(PnlConsultaItem);
        PnlConsultaItem.setLayout(PnlConsultaItemLayout);
        PnlConsultaItemLayout.setHorizontalGroup(
            PnlConsultaItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlConsultaItemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        PnlConsultaItemLayout.setVerticalGroup(
            PnlConsultaItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlConsultaItemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelPPalCatLayout = new javax.swing.GroupLayout(PanelPPalCat);
        PanelPPalCat.setLayout(PanelPPalCatLayout);
        PanelPPalCatLayout.setHorizontalGroup(
            PanelPPalCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPPalCatLayout.createSequentialGroup()
                .addGroup(PanelPPalCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPPalCatLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(LblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPPalCatLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(LblCatProd, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(PnlConsultaItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(PanelPPalCatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelBtnCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelPPalCatLayout.setVerticalGroup(
            PanelPPalCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPPalCatLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(LblCatProd, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPPalCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblNombre)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125)
                .addComponent(PanelBtnCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(PanelPPalCatLayout.createSequentialGroup()
                .addComponent(PnlConsultaItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPPalCat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PanelPPalCat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAltasActionPerformed
        String Nombre = this.TxtNombre.getText();
        ObjClientes = new AbmClientes(Nombre);
        ObjClientes.Alta();
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
        this.ListaClientes.setVisible(true);
        this.BtnCancelar.setVisible(true);
        this.BtnEliminar.setVisible(true);        
        this.BtnBajas.setVisible(false);
        this.PnlConsultaItem.setVisible(true);
        
        NomClientesBorrar = this.ListaClientes.getSelectedValue();
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
            ObjClientes = new AbmClientes();
            ObjClientes2.setNom(NomClientesBorrar); // ENVIO AL EL DATO ELEGIDO AL ATRIBUTO   
            ObjClientes2.Baja(); // EJECTURA LA INSTRUCCION DE BORRAR DE MYSQL
            this.TxtNombre.setText(null);
            ObjClientes2 = new AbmClientes();
            ListaClientes.setModel(ObjClientes2.Muestro());
            Visible();
        }
        
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultasActionPerformed
       this.ListaClientes.setVisible(true);
       this.BtnBajas.setVisible(true);
       this.BtnModificaciones.setVisible(true);
       this.PnlConsultaItem.setVisible(true);
       this.LblNombre.setVisible(false);
       this.BtnAltas.setVisible(false);
       this.TxtNombre.setVisible(false);
       this.BtnEliminar.setVisible(false);
       this.BtnConsultas.setVisible(false);
       
        ObjClientes2 = new AbmClientes();
        //ObjCat2.Muestro();
        this.ListaClientes.setModel(ObjClientes2.Muestro());
    
        
    }//GEN-LAST:event_BtnConsultasActionPerformed

    private void BtnModificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificacionesActionPerformed
      this.BtnBajas.setVisible(false);
      this.BtnCancelar.setVisible(true);
      this.BtnBuscar.setVisible(false);
      this.BtnActualizar.setVisible(true);
      this.BtnModificaciones.setVisible(false);
      this.BtnConsultas.setVisible(false);
      Ocultar ();
      
      NomViejo = this.ListaClientes.getSelectedValue(); // TOMA EL VALOR QUE QUIERE MODIFICAR
      this.TxtNombre.setText(NomViejo); // se lo manda al atributo porque lo necesita para encontrar en la tabla
      this.TxtNombre.setVisible(true); // habilita el label y la tabla
      this.LblNombre.setVisible(true);
        
    }//GEN-LAST:event_BtnModificacionesActionPerformed

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed
        String NomAct = this.TxtNombre.getText();
        ObjClientes2 = new AbmClientes(NomViejo); 
        ObjClientes2.Modif(NomAct);
        
        Limpiar ();
        
        ListaClientes.setModel(ObjClientes2.Muestro());
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
    private javax.swing.JLabel LblCatProd;
    private javax.swing.JLabel LblNombre;
    private javax.swing.JList<String> ListaClientes;
    private javax.swing.JPanel PanelBtnCat;
    private javax.swing.JPanel PanelPPalCat;
    private javax.swing.JPanel PnlConsultaItem;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
