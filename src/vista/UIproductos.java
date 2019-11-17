
package vista;
import controlador.AbmProductos;
import javax.swing.JOptionPane;



public class UIproductos extends javax.swing.JInternalFrame {
  
    AbmProductos ObjProdu=new AbmProductos();
    AbmProductos ObjProdu2=new AbmProductos();
    AbmProductos ObjProdu3=new AbmProductos();
    
    public UIproductos() 
    {
        initComponents();
        
     //   ListaLaboratorio.setModel(ObjProdu.MuestroLab());
     //   ListaDroga.setModel(ObjProdu.MuestroDroga());
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

        setBackground(new java.awt.Color(254, 147, 9));
        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        PanelPrincipal.setBackground(java.awt.Color.lightGray);

        PanelTitulo.setBackground(java.awt.Color.gray);

        LblTitulo.setFont(new java.awt.Font("Abyssinica SIL", 1, 48)); // NOI18N
        LblTitulo.setForeground(new java.awt.Color(1, 1, 1));
        LblTitulo.setText("PRODUCTOS");
        LblTitulo.setToolTipText("");

        javax.swing.GroupLayout PanelTituloLayout = new javax.swing.GroupLayout(PanelTitulo);
        PanelTitulo.setLayout(PanelTituloLayout);
        PanelTituloLayout.setHorizontalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(LblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTituloLayout.setVerticalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTituloLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(LblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelCuerpo.setBackground(java.awt.Color.gray);
        PanelCuerpo.setForeground(new java.awt.Color(254, 147, 9));

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

        panel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de venta"));
        panel1.setForeground(new java.awt.Color(153, 153, 153));
        panel1.setToolTipText("");
        panel1.setColorPrimario(new java.awt.Color(204, 204, 204));
        panel1.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N

        GrupoVenta.add(BotonGroupLibre);
        BotonGroupLibre.setSelected(true);
        BotonGroupLibre.setText("Libre");

        GrupoVenta.add(BotonGroupReceta);
        BotonGroupReceta.setText("Receta");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(BotonGroupLibre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(BotonGroupReceta)
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonGroupLibre)
                    .addComponent(BotonGroupReceta)))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                        .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCuerpoLayout.createSequentialGroup()
                                .addComponent(LblNomPersonal)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCuerpoLayout.createSequentialGroup()
                                .addComponent(LblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCuerpoLayout.createSequentialGroup()
                                .addComponent(LblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCuerpoLayout.createSequentialGroup()
                                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LblPrecioCosto)
                                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                                        .addComponent(LblEnvase)
                                        .addGap(25, 25, 25))
                                    .addComponent(LblFecha))
                                .addGap(30, 30, 30)
                                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ComBoxEnvase, 0, 121, Short.MAX_VALUE)
                                    .addComponent(jScrollPane7)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCuerpoLayout.createSequentialGroup()
                        .addContainerGap(601, Short.MAX_VALUE)
                        .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DateFechaVto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        PanelCuerpoLayout.setVerticalGroup(
            PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCuerpoLayout.createSequentialGroup()
                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PanelCuerpoLayout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(LblLab))
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCuerpoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblcategoria)
                                    .addComponent(LblNomPersonal))))
                        .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCuerpoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelCuerpoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(LblPrecio)
                                .addGap(61, 61, 61)
                                .addComponent(LblPrecioCosto))))
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblCantidad)
                            .addGroup(PanelCuerpoLayout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ComBoxEnvase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblEnvase))))))
                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(DateFechaVto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LblFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel1.getAccessibleContext().setAccessibleName("tipode venta");

        PanelBottons.setBackground(java.awt.Color.gray);
        PanelBottons.setForeground(new java.awt.Color(254, 147, 9));

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
                .addContainerGap()
                .addGroup(PanelBottonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonAlta)
                    .addComponent(ButtonBaja))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelBottonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonConsulta)
                    .addComponent(ButtonModificar))
                .addGap(158, 158, 158)
                .addGroup(PanelBottonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonActualizar)
                    .addComponent(ButtonCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelBottonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(168, 168, 168))
        );
        PanelBottonsLayout.setVerticalGroup(
            PanelBottonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBottonsLayout.createSequentialGroup()
                .addGroup(PanelBottonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBottonsLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(PanelBottonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonAlta)
                            .addComponent(ButtonModificar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBottonsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelBottonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonEliminar)
                            .addComponent(ButtonActualizar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelBottonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonBaja)
                    .addComponent(ButtonConsulta)
                    .addComponent(ButtonCancelar)
                    .addComponent(ButtonSalir))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelBottons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelCuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
