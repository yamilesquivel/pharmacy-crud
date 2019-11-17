
package vista;

import java.awt.Color;


public class UIMenu extends javax.swing.JFrame {
  
    public UIMenu() {
        initComponents();
        
        this.setTitle("::::::::::::::GESTOR  DE FARMACIA::::::::::::::::::::::::::::");
        this.setLocationRelativeTo(null);// para que el formulario aparezca centrado en la pantalla
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.PanelEscritorio.setBackground(Color.red);
        PanelEscritorio.setSize(imagen.getSize());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelEscritorio = new javax.swing.JDesktopPane();
        imagen = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        MenuArticulos = new javax.swing.JMenu();
        productoMenu = new javax.swing.JMenuItem();
        laboratorioMenu = new javax.swing.JMenuItem();
        drogaMenu = new javax.swing.JMenuItem();
        categoriaMenu = new javax.swing.JMenuItem();
        exitMenu = new javax.swing.JMenuItem();
        MenuClientes = new javax.swing.JMenu();
        MenuAmbClientes = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        MenuVentas = new javax.swing.JMenu();
        MenuIngVtas = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/tostadodecafe.duckduckgo.com.png"))); // NOI18N

        PanelEscritorio.setLayer(imagen, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout PanelEscritorioLayout = new javax.swing.GroupLayout(PanelEscritorio);
        PanelEscritorio.setLayout(PanelEscritorioLayout);
        PanelEscritorioLayout.setHorizontalGroup(
            PanelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelEscritorioLayout.setVerticalGroup(
            PanelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEscritorioLayout.createSequentialGroup()
                .addComponent(imagen)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        menuBar.setBackground(new java.awt.Color(13, 27, 247));
        menuBar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(115, 108, 108))); // NOI18N
        menuBar.setForeground(new java.awt.Color(161, 0, 0));

        MenuArticulos.setMnemonic('f');
        MenuArticulos.setText("ITEMS FARMACIA");

        productoMenu.setMnemonic('a');
        productoMenu.setText("PRODUCTO");
        productoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoMenuActionPerformed(evt);
            }
        });
        MenuArticulos.add(productoMenu);

        laboratorioMenu.setText("LABORATORIO");
        laboratorioMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laboratorioMenuActionPerformed(evt);
            }
        });
        MenuArticulos.add(laboratorioMenu);

        drogaMenu.setText("DROGA");
        drogaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drogaMenuActionPerformed(evt);
            }
        });
        MenuArticulos.add(drogaMenu);

        categoriaMenu.setMnemonic('o');
        categoriaMenu.setText("CATEGORIA");
        categoriaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaMenuActionPerformed(evt);
            }
        });
        MenuArticulos.add(categoriaMenu);

        exitMenu.setMnemonic('x');
        exitMenu.setText("Exit");
        exitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuActionPerformed(evt);
            }
        });
        MenuArticulos.add(exitMenu);

        menuBar.add(MenuArticulos);

        MenuClientes.setMnemonic('e');
        MenuClientes.setText("CLIENTES");
        MenuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuClientesActionPerformed(evt);
            }
        });

        MenuAmbClientes.setMnemonic('t');
        MenuAmbClientes.setText("INGRESAR");
        MenuAmbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAmbClientesActionPerformed(evt);
            }
        });
        MenuClientes.add(MenuAmbClientes);

        jMenuItem1.setText("ELIMINAR");
        MenuClientes.add(jMenuItem1);

        jMenuItem2.setText("MODIFICAR");
        MenuClientes.add(jMenuItem2);

        menuBar.add(MenuClientes);

        MenuVentas.setMnemonic('h');
        MenuVentas.setText("VENTAS");

        MenuIngVtas.setMnemonic('c');
        MenuIngVtas.setText("INGRESO");
        MenuIngVtas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuIngVtasActionPerformed(evt);
            }
        });
        MenuVentas.add(MenuIngVtas);

        jMenuItem3.setText("MODIFICAR");
        MenuVentas.add(jMenuItem3);

        jMenuItem4.setText("ELIMINAR");
        MenuVentas.add(jMenuItem4);

        menuBar.add(MenuVentas);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuIngVtasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuIngVtasActionPerformed

        UIventasIns Vta= new UIventasIns();
        PanelEscritorio.add(Vta);
        Vta.show();
        /*FrmVenta Vta= new FrmVenta();
        PanelEscritorio.add(Vta);
        Vta.show();*/

    }//GEN-LAST:event_MenuIngVtasActionPerformed

    private void MenuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuClientesActionPerformed
        UIclientes Cliente = new UIclientes ();
        PanelEscritorio.add(Cliente);
        Cliente.show();
    }//GEN-LAST:event_MenuClientesActionPerformed

    private void MenuAmbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAmbClientesActionPerformed

        UIclientes Cliente= new UIclientes();
        PanelEscritorio.add(Cliente);
        Cliente.show();
    }//GEN-LAST:event_MenuAmbClientesActionPerformed

    private void exitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuActionPerformed
        System.exit(0);
        //this.dispose();

    }//GEN-LAST:event_exitMenuActionPerformed

    private void drogaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drogaMenuActionPerformed
        UIdroga Droga = new UIdroga ();
        PanelEscritorio.add(Droga);
        Droga.show();
    }//GEN-LAST:event_drogaMenuActionPerformed

    private void laboratorioMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laboratorioMenuActionPerformed
        UIlaboratorio Laboratorio = new UIlaboratorio ();
        PanelEscritorio.add(Laboratorio);
        Laboratorio.show();
    }//GEN-LAST:event_laboratorioMenuActionPerformed

    private void productoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoMenuActionPerformed

        UIproductos Producto = new UIproductos ();
        PanelEscritorio.add(Producto);
        Producto.show();

    }//GEN-LAST:event_productoMenuActionPerformed

    private void categoriaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaMenuActionPerformed

        UIcategorias Cat= new UIcategorias();
        PanelEscritorio.add(Cat);
        Cat.show();

    }//GEN-LAST:event_categoriaMenuActionPerformed

    private void jMenuClientesActionPerformed(java.awt.event.ActionEvent evt) {                                             
       
        UIcategorias Cli= new UIcategorias();
        PanelEscritorio.add(Cli);
        Cli.show();
   
    }       
    /*

    private void MenuVentasActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // CUAL DE LOS DOS VA: ¿MenuVentasActionPerformed 
                                        o
                                MenuIngVtasActionPerformed?

        FrmCategoria Vta= new FrmCategoria();
        PanelEscritorio.add(Vta);
        Vta.show();
    }                                          

    private void MenuArticulosActionPerformed(java.awt.event.ActionEvent evt) {                                              
          
    // QUÉ PASA CON ESTE?  ==> MenuArticulosActionPerformed?  // XQ ES EL TÍTULO DE CATEGORÍA Y PRODUCTO?
                               

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
            java.util.logging.Logger.getLogger(UIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuAmbClientes;
    private javax.swing.JMenu MenuArticulos;
    private javax.swing.JMenu MenuClientes;
    private javax.swing.JMenuItem MenuIngVtas;
    private javax.swing.JMenu MenuVentas;
    private javax.swing.JDesktopPane PanelEscritorio;
    private javax.swing.JMenuItem categoriaMenu;
    private javax.swing.JMenuItem drogaMenu;
    private javax.swing.JMenuItem exitMenu;
    private javax.swing.JLabel imagen;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem laboratorioMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem productoMenu;
    // End of variables declaration//GEN-END:variables

}
