
package vista;

import java.awt.Color;


public class UIMenu extends javax.swing.JFrame {
  
    public UIMenu() {
        initComponents();
        
        this.setTitle("GESTOR  DE FARMACIA");
        this.setLocationRelativeTo(null);// para que el formulario aparezca centrado en la pantalla
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        this.PanelEscritorio.setBackground(Color.red);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelEscritorio = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        MenuArticulos = new javax.swing.JMenu();
        categoriaMenu = new javax.swing.JMenuItem();
        productoMenu = new javax.swing.JMenuItem();
        laboratorioMenu = new javax.swing.JMenuItem();
        drogaMenu = new javax.swing.JMenuItem();
        exitMenu = new javax.swing.JMenuItem();
        MenuClientes = new javax.swing.JMenu();
        MenuAmbClientes = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        MenuVentas = new javax.swing.JMenu();
        MenuIngVtas = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuArticulos.setMnemonic('f');
        MenuArticulos.setText("Articulos");

        categoriaMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        categoriaMenu.setMnemonic('o');
        categoriaMenu.setText("Categoria");
        categoriaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaMenuActionPerformed(evt);
            }
        });
        MenuArticulos.add(categoriaMenu);

        productoMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        productoMenu.setMnemonic('a');
        productoMenu.setText("Producto");
        productoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoMenuActionPerformed(evt);
            }
        });
        MenuArticulos.add(productoMenu);

        laboratorioMenu.setText("Laboratorio");
        laboratorioMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laboratorioMenuActionPerformed(evt);
            }
        });
        MenuArticulos.add(laboratorioMenu);

        drogaMenu.setText("Droga");
        drogaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drogaMenuActionPerformed(evt);
            }
        });
        MenuArticulos.add(drogaMenu);

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
        MenuClientes.setText("Clientes");
        MenuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuClientesActionPerformed(evt);
            }
        });

        MenuAmbClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        MenuAmbClientes.setMnemonic('t');
        MenuAmbClientes.setText("Ingreso de Clientes");
        MenuAmbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAmbClientesActionPerformed(evt);
            }
        });
        MenuClientes.add(MenuAmbClientes);

        jMenuItem5.setText("Consulta de Clientes");
        MenuClientes.add(jMenuItem5);

        jMenuItem6.setText("Modificacion de Clientes");
        MenuClientes.add(jMenuItem6);

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

        jMenuItem3.setText("Consulta de Ventas");
        MenuVentas.add(jMenuItem3);

        jMenuItem4.setText("Modificacion de Ventas");
        MenuVentas.add(jMenuItem4);

        menuBar.add(MenuVentas);

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

        UIventas Vta= new UIventas();
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
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem laboratorioMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem productoMenu;
    // End of variables declaration//GEN-END:variables

}
