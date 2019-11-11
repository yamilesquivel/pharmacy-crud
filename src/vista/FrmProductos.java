
package vista;
import controlador.AbmProductos;
import javax.swing.JOptionPane;



public class FrmProductos extends javax.swing.JInternalFrame {
  
    AbmProductos ObjProdu=new AbmProductos();
    AbmProductos ObjProdu2=new AbmProductos();
    AbmProductos ObjProdu3=new AbmProductos();
    
    public FrmProductos() 
    {
        initComponents();
        
        ListaLaboratorio.setModel(ObjProdu.MuestroLab());
        ListaDroga.setModel(ObjProdu.MuestroDroga());
    }

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) 
    {                                         
      dispose();
    }                                        

    private void BtnAltaActionPerformed(java.awt.event.ActionEvent evt) {                                        
       
       TxtNombreComercial= this.ListaLaboratorio.getSelectedValue(); //tomo el laboratorio
       
       if (TxtNombreComercial.isEmpty()) //pregunto si no eligio nada
           {
                JOptionPane.showMessageDialog(null,"Debe seleccionarun laboratorio");
            }
        else
         {
              int IdLab= ObjProdu.BuscoId(TxtNombreComercial); //trae el id dellaboratporio elegido
              String Nom = this.TxtNom.getText(); //tomoladrogadel nombre q escribió

         
         if (Nom.isEmpty()) //pregunto si no escribio nada
            {
              JOptionPane.showMessageDialog(null,"Debe ingresar un nombre para poder continuar ");
             }
        else
        {
            ObjProdu= new AbmProductos(Nom);
            ObjDroga.Alta(IdLab);  //voy al metodo alta con el id del laboratorio
            Limpiar();
         }
          }      
        
    }                                       

                                

    private void BtnBajaActionPerformed(java.awt.event.ActionEvent evt) {                                        
        this.ButtonModificar.setVisible(false);
        this.ButtonConsulta.setVisible(false);
        Ocultar();
        this.ButtonCancelar.setVisible(true);
        this.ButtonEliminar.setVisible(true);        
        this.ButtonBaja.setVisible(false);
        
    //    System.out.println("valor " + this.ListaCategorias.getSelectedValue());
        NomDrogaBorrar = this.ListaDrogas.getSelectedValue();
         
    }                                       

    private void Ocultar()
    {
        this.ButtonAlta.setVisible(false);
        this.ButtonSalir.setVisible(false);   
        this.LblNomPersonal.setVisible(false);
        this.TxtNombreComercial.setVisible(false);

        
    }
    private void BtnModifActionPerformed(java.awt.event.ActionEvent evt) {                                         
        this.ButtonBaja.setVisible(false);
        this.ButtonCancelar.setVisible(true);
        this.ButtonConsulta.setVisible(false);
        this.ButtonActualizar.setVisible(true);
        this.ButtonModificar.setVisible(false);
        this.ButtonConsulta.setVisible(false);
        Ocultar();
        NomViejo = this.ListaProductos.getSelectedValue();
        this.TxtNom.setText(NomViejo);
        this.LblNom.setVisible(true);
        this.TxtNom.setVisible(true);
        

    }                                        

    private void ButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {                                              

        String NomAct = this.TxtNom.getText();

        ObjDroga2 = new AbmDroga(NomViejo);
        ObjDroga2.Modif(NomAct);
        Limpiar(); 
        Visible();
    }                                             

    private void ButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        int z = JOptionPane.showConfirmDialog(null, "Esta seguro ?");
        if ( z == 0) 
        {
    //       String Nom = this.TxtNom.getText(); // debe tomar el id y no el nombre
            ObjDroga2 = new AbmDroga();
            ObjDroga2.setNom(NomDrogaBorrar);
            ObjDroga2.Baja();
            this.TxtNom.setText(null);
            ObjDroga2 = new AbmDroga();
            ListaDrogas.setModel(ObjDroga2.Muestro());
            Visible();
        }
    }                                           

   
    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {                                            
       Visible();
    }                                           
   private void Visible()
    {
        this.ButtonActualizar.setVisible(false);
        this.ButtonConsulta.setVisible(true);
        this.BtnModif.setVisible(false);
        this.ButtonCancelar.setVisible(false);
        this.ButtonEliminar.setVisible(false);        
        this.BtnBaja.setVisible(false);
        this.BtnAlta.setVisible(true);
        this.BtnSalir.setVisible(true);
        this.LblNom.setVisible(true);
        this.TxtNom.setVisible(true);
    }
    private void ButtonConsultaActionPerformed(java.awt.event.ActionEvent evt) {                                             
        this.PanelConsulta.setVisible(true);
        this.ListaDrogas.setVisible(true);
        this.BtnModif.setVisible(true);
        this.ButtonCancelar.setVisible(false);
        this.ButtonEliminar.setVisible(false);        
        this.BtnBaja.setVisible(true);
        this.BtnAlta.setVisible(false);
        this.BtnSalir.setVisible(true);
        this.LblNom.setVisible(false);
        this.TxtNom.setVisible(false);
        ObjDroga2 = new AbmDroga();
        ListaDrogas.setModel(ObjDroga2.Muestro()); // error de nullpointer
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
     
    private void Limpiar()
    {
        this.TxtNombreComercial.setText(null);
    }
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        GrupoVenta = new javax.swing.ButtonGroup();
        PanelPrincipal = new javax.swing.JPanel();
        PanelTitulo = new java.awt.Panel();
        LblTitulo = new javax.swing.JLabel();
        PanelCuerpo = new java.awt.Panel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaLaboratorio = new javax.swing.JList<>();
        LblLab = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListaDroga = new javax.swing.JList<>();
        LblNomPersonal = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TxtNombreComercial = new javax.swing.JTextPane();
        LblPrecio = new javax.swing.JLabel();
        LblCantidad = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TxtCosto = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        TxtCant = new javax.swing.JTextPane();
        LblPrecioCosto = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        TxtPrecioCosto = new javax.swing.JTextPane();
        LblEnvase = new javax.swing.JLabel();
        ComBoxEnvase = new javax.swing.JComboBox<>();
        panel1 = new org.edisoncor.gui.panel.Panel();
        BotonGroupLibre = new javax.swing.JRadioButton();
        BotonGroupReceta = new javax.swing.JRadioButton();
        DateFechaVto = new com.toedter.calendar.JDateChooser();
        LblFecha = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listacategoria = new javax.swing.JList<>();
        lblcategoria = new javax.swing.JLabel();
        PanelBottons = new java.awt.Panel();
        ButtonAlta = new javax.swing.JButton();
        ButtonBaja = new javax.swing.JButton();
        ButtonModificar = new javax.swing.JButton();
        ButtonConsulta = new javax.swing.JButton();
        ButtonCancelar = new javax.swing.JButton();
        ButtonEliminar = new javax.swing.JButton();
        ButtonSalir = new javax.swing.JButton();
        ButtonActualizar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        PanelPrincipal.setBackground(java.awt.Color.lightGray);

        PanelTitulo.setBackground(java.awt.Color.lightGray);

        LblTitulo.setText("PRODUCTOS");
        LblTitulo.setToolTipText("");

        javax.swing.GroupLayout PanelTituloLayout = new javax.swing.GroupLayout(PanelTitulo);
        PanelTitulo.setLayout(PanelTituloLayout);
        PanelTituloLayout.setHorizontalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloLayout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addComponent(LblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTituloLayout.setVerticalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblTitulo)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        PanelCuerpo.setBackground(java.awt.Color.lightGray);

        jScrollPane1.setViewportView(ListaLaboratorio);

        LblLab.setText("LABORATORIO");

        jLabel1.setText("DROGA");

        jScrollPane3.setViewportView(ListaDroga);

        LblNomPersonal.setText("Nombre Comercial");

        TxtNombreComercial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNombreComercialKeyTyped(evt);
            }
        });
        jScrollPane4.setViewportView(TxtNombreComercial);

        LblPrecio.setText("PRECIO");

        LblCantidad.setText("CANTIDAD");

        jScrollPane5.setViewportView(TxtCosto);

        jScrollPane6.setViewportView(TxtCant);

        LblPrecioCosto.setText("Precio de costo");
        LblPrecioCosto.setToolTipText("");

        jScrollPane7.setViewportView(TxtPrecioCosto);

        LblEnvase.setText("Envase");

        ComBoxEnvase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        panel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de venta"));
        panel1.setForeground(new java.awt.Color(153, 153, 153));
        panel1.setColorPrimario(new java.awt.Color(204, 204, 204));

        GrupoVenta.add(BotonGroupLibre);
        BotonGroupLibre.setSelected(true);
        BotonGroupLibre.setText("Libre");

        GrupoVenta.add(BotonGroupReceta);
        BotonGroupReceta.setText("Receta");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonGroupReceta)
                    .addComponent(BotonGroupLibre))
                .addGap(18, 18, 18))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(BotonGroupLibre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonGroupReceta)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        LblFecha.setText("Fecha de vencimiento");

        jScrollPane2.setViewportView(listacategoria);

        lblcategoria.setText("CATEGORIA");

        javax.swing.GroupLayout PanelCuerpoLayout = new javax.swing.GroupLayout(PanelCuerpo);
        PanelCuerpo.setLayout(PanelCuerpoLayout);
        PanelCuerpoLayout.setHorizontalGroup(
            PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCuerpoLayout.createSequentialGroup()
                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCuerpoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(LblFecha)
                        .addGap(18, 18, 18)
                        .addComponent(DateFechaVto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelCuerpoLayout.createSequentialGroup()
                                .addComponent(LblLab)
                                .addGap(62, 62, 62)
                                .addComponent(jLabel1)
                                .addGap(89, 89, 89)
                                .addComponent(lblcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelCuerpoLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addComponent(LblEnvase)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComBoxEnvase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCuerpoLayout.createSequentialGroup()
                        .addComponent(LblPrecio)
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane5)
                        .addGap(166, 166, 166))
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addComponent(LblCantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(LblPrecioCosto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addComponent(LblNomPersonal)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PanelCuerpoLayout.setVerticalGroup(
            PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCuerpoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblNomPersonal)
                            .addComponent(LblLab, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(lblcategoria, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelCuerpoLayout.createSequentialGroup()
                                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LblEnvase)
                                    .addComponent(ComBoxEnvase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37))
                            .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(DateFechaVto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LblFecha))))
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelCuerpoLayout.createSequentialGroup()
                                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblPrecio)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LblCantidad)
                                        .addComponent(LblPrecioCosto))
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelBottons.setBackground(java.awt.Color.lightGray);

        ButtonAlta.setLabel("ALTA");

        ButtonBaja.setLabel("BAJA");

        ButtonModificar.setText("MODIFICAR");

        ButtonConsulta.setText("CONSULTA");

        ButtonCancelar.setText("CANCELAR");

        ButtonEliminar.setText("ELIMINAR");

        ButtonSalir.setText("SALIR");
        ButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalirActionPerformed(evt);
            }
        });

        ButtonActualizar.setText("ACTUALIZAR");

        javax.swing.GroupLayout PanelBottonsLayout = new javax.swing.GroupLayout(PanelBottons);
        PanelBottons.setLayout(PanelBottonsLayout);
        PanelBottonsLayout.setHorizontalGroup(
            PanelBottonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBottonsLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(ButtonAlta)
                .addGap(68, 68, 68)
                .addComponent(ButtonBaja)
                .addGap(40, 40, 40)
                .addComponent(ButtonModificar)
                .addGap(27, 27, 27)
                .addGroup(PanelBottonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBottonsLayout.createSequentialGroup()
                        .addComponent(ButtonActualizar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelBottonsLayout.createSequentialGroup()
                        .addComponent(ButtonConsulta)
                        .addGap(41, 41, 41)
                        .addComponent(ButtonCancelar)
                        .addGap(57, 57, 57)
                        .addComponent(ButtonEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonSalir)
                        .addGap(23, 23, 23))))
        );
        PanelBottonsLayout.setVerticalGroup(
            PanelBottonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBottonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBottonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonAlta)
                    .addComponent(ButtonBaja)
                    .addComponent(ButtonModificar)
                    .addComponent(ButtonConsulta)
                    .addComponent(ButtonCancelar)
                    .addComponent(ButtonEliminar)
                    .addComponent(ButtonSalir))
                .addGap(26, 26, 26)
                .addComponent(ButtonActualizar)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelCuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelBottons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addComponent(PanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(PanelCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelBottons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleName("PRODUCTOS");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalirActionPerformed
        // TODO add your handling code here:
        
       this.dispose();
    }//GEN-LAST:event_ButtonSalirActionPerformed

    private void TxtNombreComercialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNombreComercialKeyTyped
        // TODO add your handling code here:
       SoloLetras(java.awt.event.KeyEvent evt); 
        
    }//GEN-LAST:event_TxtNombreComercialKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BotonGroupLibre;
    private javax.swing.JRadioButton BotonGroupReceta;
    private javax.swing.JButton ButtonActualizar;
    private javax.swing.JButton ButtonAlta;
    private javax.swing.JButton ButtonBaja;
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JButton ButtonConsulta;
    private javax.swing.JButton ButtonEliminar;
    private javax.swing.JButton ButtonModificar;
    private javax.swing.JButton ButtonSalir;
    private javax.swing.JComboBox<String> ComBoxEnvase;
    private com.toedter.calendar.JDateChooser DateFechaVto;
    private javax.swing.ButtonGroup GrupoVenta;
    private javax.swing.JLabel LblCantidad;
    private javax.swing.JLabel LblEnvase;
    private javax.swing.JLabel LblFecha;
    private javax.swing.JLabel LblLab;
    private javax.swing.JLabel LblNomPersonal;
    private javax.swing.JLabel LblPrecio;
    private javax.swing.JLabel LblPrecioCosto;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JList<String> ListaDroga;
    private javax.swing.JList<String> ListaLaboratorio;
    private java.awt.Panel PanelBottons;
    private java.awt.Panel PanelCuerpo;
    private javax.swing.JPanel PanelPrincipal;
    private java.awt.Panel PanelTitulo;
    private javax.swing.JTextPane TxtCant;
    private javax.swing.JTextPane TxtCosto;
    private javax.swing.JTextPane TxtNombreComercial;
    private javax.swing.JTextPane TxtPrecioCosto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel lblcategoria;
    private javax.swing.JList<String> listacategoria;
    private org.edisoncor.gui.panel.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
