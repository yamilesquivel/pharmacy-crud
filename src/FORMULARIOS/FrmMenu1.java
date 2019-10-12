
package FORMULARIOS;


public class FrmMenu1 extends javax.swing.JFrame {
  
    public FrmMenu1() {
        initComponents();
        
        this.setTitle("ROMPECABEZAS");
        this.setLocationRelativeTo(null);// para que el formulario ap'arezca centrado en la pantalla
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelEscritorio = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        MenuArticulos = new javax.swing.JMenu();
        MenuCategoria = new javax.swing.JMenuItem();
        MenuProducto = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        MenuClientes = new javax.swing.JMenu();
        MenuAmbClientes = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        MenuVentas = new javax.swing.JMenu();
        MenuIngVtas = new javax.swing.JMenuItem();
        SALIR = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuArticulos.setMnemonic('f');
        MenuArticulos.setText("Articulos");

        MenuCategoria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        MenuCategoria.setMnemonic('o');
        MenuCategoria.setText("Categoria");
        MenuCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCategoriaActionPerformed(evt);
            }
        });
        MenuArticulos.add(MenuCategoria);

        MenuProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        MenuProducto.setMnemonic('a');
        MenuProducto.setText("Producto");
        MenuProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProductoActionPerformed(evt);
            }
        });
        MenuArticulos.add(MenuProducto);

        jMenuItem1.setText("Laboratorio");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenuArticulos.add(jMenuItem1);

        jMenuItem2.setText("Droga");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        MenuArticulos.add(jMenuItem2);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        MenuArticulos.add(exitMenuItem);

        menuBar.add(MenuArticulos);

        MenuClientes.setMnemonic('e');
        MenuClientes.setText("Clientes");
        MenuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuClientesActionPerformed(evt);
            }
        });

        MenuAmbClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        MenuAmbClientes.setMnemonic('t');
        MenuAmbClientes.setText("ABM Clientes");
        MenuAmbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAmbClientesActionPerformed(evt);
            }
        });
        MenuClientes.add(MenuAmbClientes);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        MenuClientes.add(deleteMenuItem);

        menuBar.add(MenuClientes);

        MenuVentas.setMnemonic('h');
        MenuVentas.setText("Ventas");

        MenuIngVtas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        MenuIngVtas.setMnemonic('c');
        MenuIngVtas.setText("Ingreso de Ventas");
        MenuIngVtas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuIngVtasActionPerformed(evt);
            }
        });
        MenuVentas.add(MenuIngVtas);

        menuBar.add(MenuVentas);

        SALIR.setText("Salir");
        menuBar.add(SALIR);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1018, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuIngVtasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuIngVtasActionPerformed

        FrmFecha Vta= new FrmFecha();
        PanelEscritorio.add(Vta);
        Vta.show();
        /*FrmVenta Vta= new FrmVenta();
        PanelEscritorio.add(Vta);
        Vta.show();*/

    }//GEN-LAST:event_MenuIngVtasActionPerformed

    private void MenuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuClientesActionPerformed
        FrmClientes Cliente = new FrmClientes ();
        PanelEscritorio.add(Cliente);
        Cliente.show();
    }//GEN-LAST:event_MenuClientesActionPerformed

    private void MenuAmbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAmbClientesActionPerformed

        FrmClientes Cliente= new FrmClientes();
        PanelEscritorio.add(Cliente);
        Cliente.show();
    }//GEN-LAST:event_MenuAmbClientesActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
        //this.dispose();

    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        FrmDroga Droga = new FrmDroga ();
        PanelEscritorio.add(Droga);
        Droga.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FrmLaboratorio Lab = new FrmLaboratorio ();
        PanelEscritorio.add(Lab);
        Lab.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void MenuProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuProductoActionPerformed

        FrmProductos Producto = new FrmProductos ();
        PanelEscritorio.add(Producto);
        Producto.show();

    }//GEN-LAST:event_MenuProductoActionPerformed

    private void MenuCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCategoriaActionPerformed

        FrmCategorias Cat= new FrmCategorias();
        PanelEscritorio.add(Cat);
        Cat.show();

    }//GEN-LAST:event_MenuCategoriaActionPerformed

    private void jMenuClientesActionPerformed(java.awt.event.ActionEvent evt) {                                             
       
        FrmCategorias Cli= new FrmCategorias();
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
            java.util.logging.Logger.getLogger(FrmMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuAmbClientes;
    private javax.swing.JMenu MenuArticulos;
    private javax.swing.JMenuItem MenuCategoria;
    private javax.swing.JMenu MenuClientes;
    private javax.swing.JMenuItem MenuIngVtas;
    private javax.swing.JMenuItem MenuProducto;
    private javax.swing.JMenu MenuVentas;
    private javax.swing.JDesktopPane PanelEscritorio;
    private javax.swing.JMenu SALIR;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
