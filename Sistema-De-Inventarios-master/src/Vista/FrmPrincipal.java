/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import Controlador.CtrlProveedor;
import Controlador.CtrlTiposDeMovimiento;
import Controlador.CtrlUnidadDeMedida;
import Controlador.Ctrlclientes;
import Modelo.ConsultasClientes;
import Modelo.ConsultasProveedor;
import Modelo.TiposDeMovimiento;
import Modelo.TiposDeMovimientoSQL;
import Modelo.UnidadDeMedida;
import Modelo.UnidadDeMedidaSQL;
import Modelo.clientes;
import Modelo.proveedor;
import Controlador.MarcasCarrosController;
import Controlador.ModeloCarroController;
import Modelo.TBLModelo;
import Modelo.impl.TBLModeloImpl;


/**
 *
 * @author ialonzo
 */
public class FrmPrincipal extends javax.swing.JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
        PanelImage fondo = new PanelImage();


    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        this.setContentPane(fondo);
        initComponents();
       
      }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        BotonMitsubitshi = new javax.swing.JButton();
        BotonToyota = new javax.swing.JButton();
        BotonDihatsu = new javax.swing.JButton();
        BotonNissan = new javax.swing.JButton();
        jPanel1 = new PanelImageLogo();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuProductos = new javax.swing.JMenuItem();
        opcionCrearModelo = new javax.swing.JMenuItem();
        MnuClientes = new javax.swing.JMenuItem();
        MnuProveedores = new javax.swing.JMenuItem();
        MnuTiposdeMovimiento = new javax.swing.JMenuItem();
        mnuTransportista = new javax.swing.JMenuItem();
        MnuSalir = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        BotonMitsubitshi.setBackground(new java.awt.Color(255, 255, 255));
        BotonMitsubitshi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconmitsubishi.png"))); // NOI18N
        BotonMitsubitshi.setText("jButton3");
        BotonMitsubitshi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMitsubitshiActionPerformed(evt);
            }
        });

        BotonToyota.setBackground(new java.awt.Color(255, 255, 255));
        BotonToyota.setForeground(new java.awt.Color(255, 255, 255));
        BotonToyota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icontoyota.png"))); // NOI18N
        BotonToyota.setText("jButton3");
        BotonToyota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonToyotaActionPerformed(evt);
            }
        });

        BotonDihatsu.setBackground(new java.awt.Color(255, 255, 255));
        BotonDihatsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icondaihatsu.png"))); // NOI18N
        BotonDihatsu.setText("jButton1");
        BotonDihatsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDihatsuActionPerformed(evt);
            }
        });

        BotonNissan.setBackground(new java.awt.Color(255, 255, 255));
        BotonNissan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconnissan.jpg"))); // NOI18N
        BotonNissan.setText("jButton2");
        BotonNissan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNissanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(BotonToyota, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(BotonMitsubitshi, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonDihatsu, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(BotonNissan, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonToyota, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonMitsubitshi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonDihatsu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonNissan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 217, Short.MAX_VALUE)
        );

        jMenu1.setText("Menu");

        mnuProductos.setText("Crear Marca");
        mnuProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProductosActionPerformed(evt);
            }
        });
        jMenu1.add(mnuProductos);

        opcionCrearModelo.setLabel("Crear Modelo");
        opcionCrearModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionCrearModeloActionPerformed(evt);
            }
        });
        jMenu1.add(opcionCrearModelo);

        MnuClientes.setText("Clientes");
        MnuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuClientesActionPerformed(evt);
            }
        });
        jMenu1.add(MnuClientes);

        MnuProveedores.setText("Proveedores");
        MnuProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuProveedoresActionPerformed(evt);
            }
        });
        jMenu1.add(MnuProveedores);

        MnuTiposdeMovimiento.setText("Tipos de Movimientos");
        MnuTiposdeMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuTiposdeMovimientoActionPerformed(evt);
            }
        });
        jMenu1.add(MnuTiposdeMovimiento);

        mnuTransportista.setText("Transportistas");
        mnuTransportista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTransportistaActionPerformed(evt);
            }
        });
        jMenu1.add(mnuTransportista);

        jMenuBar1.add(jMenu1);

        MnuSalir.setText("Salir");
        MnuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MnuSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(MnuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcionCrearModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionCrearModeloActionPerformed
        TBLModeloImpl impl = new TBLModeloImpl();
        TBLModelo model = new TBLModelo();
        FrmCrearModeloCarrro frm = new FrmCrearModeloCarrro();
        ModeloCarroController ctr = new ModeloCarroController(frm,impl,model);
        frm.setVisible(true);
    }//GEN-LAST:event_opcionCrearModeloActionPerformed

    private void MnuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MnuSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_MnuSalirMouseClicked

    private void MnuProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuProveedoresActionPerformed
       Modelo.proveedor pro = new proveedor();
        Modelo.ConsultasProveedor modC = new ConsultasProveedor();
        frmProveedor frm = new frmProveedor();
        
        Controlador.CtrlProveedor ctrl = new CtrlProveedor(pro, modC, frm);
        ctrl.iniciar();
        frm.setVisible(true);
    }//GEN-LAST:event_MnuProveedoresActionPerformed

    private void MnuTiposdeMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuTiposdeMovimientoActionPerformed
        // TODO add your handling code here:
        TiposDeMovimiento tdm = new TiposDeMovimiento();
        TiposDeMovimientoSQL modC = new TiposDeMovimientoSQL();
        FrmTiposDeMovimiento frm = new FrmTiposDeMovimiento();

        CtrlTiposDeMovimiento ctrl = new CtrlTiposDeMovimiento(tdm, modC, frm);
        ctrl.Iniciar();
        frm.setVisible(true);
    }//GEN-LAST:event_MnuTiposdeMovimientoActionPerformed

    /**
     menu desplegable
     **/
    private void mnuProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProductosActionPerformed
        FrmCrearMarcaCarro frm = new FrmCrearMarcaCarro();
        MarcasCarrosController ctrl = new MarcasCarrosController();
        ctrl.iniciar();
        frm.setVisible(true);
    }//GEN-LAST:event_mnuProductosActionPerformed

    private void MnuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuClientesActionPerformed
        clientes cl = new clientes();
        ConsultasClientes modC = new ConsultasClientes();
        frmclientes1 frm = new frmclientes1();
        
        Ctrlclientes ctrl = new Ctrlclientes(cl, modC, frm);
        ctrl.Iniciar();
        frm.setVisible(true);
    }//GEN-LAST:event_MnuClientesActionPerformed

    private void mnuTransportistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTransportistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuTransportistaActionPerformed

    private void BotonToyotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonToyotaActionPerformed
         /*FrmCrearMarcaCarro frm = new FrmCrearMarcaCarro();
        
                TBLModeloImpl tbl = new TBLModeloImpl();
                tbl.insertaModelo(TBLModelo.builder()
                .nombre("prueba")
                .descripcion("prueba")
                .pathImagen("ruta")
                .estado(true)
                .fechaModelo(new Date(12112L))
                .build());
        MarcasCarrosController ctrl = new MarcasCarrosController();
        ctrl.iniciar();
        frm.setVisible(true);*/
        
        TBLModeloImpl impl = new TBLModeloImpl();
        TBLModelo model = new TBLModelo();
        FrmCrearModeloCarrro frm = new FrmCrearModeloCarrro();
        ModeloCarroController ctr = new ModeloCarroController(frm,impl,model);
        frm.setVisible(true);

    }//GEN-LAST:event_BotonToyotaActionPerformed

    
    private void BotonMitsubitshiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMitsubitshiActionPerformed
        FrmCrearMarcaCarro frm = new FrmCrearMarcaCarro();
        
        MarcasCarrosController ctrl = new MarcasCarrosController();
        ctrl.iniciar();
        frm.setVisible(true);
    }//GEN-LAST:event_BotonMitsubitshiActionPerformed

    private void BotonDihatsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDihatsuActionPerformed
        FrmCrearMarcaCarro frm = new FrmCrearMarcaCarro();
        
        MarcasCarrosController ctrl = new MarcasCarrosController();
        ctrl.iniciar();
        frm.setVisible(true);
    }//GEN-LAST:event_BotonDihatsuActionPerformed

    private void BotonNissanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNissanActionPerformed
        FrmCrearMarcaCarro frm = new FrmCrearMarcaCarro();
        
        MarcasCarrosController ctrl = new MarcasCarrosController();
        ctrl.iniciar();
        frm.setVisible(true);    }//GEN-LAST:event_BotonNissanActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonDihatsu;
    private javax.swing.JButton BotonMitsubitshi;
    private javax.swing.JButton BotonNissan;
    private javax.swing.JButton BotonToyota;
    private javax.swing.JMenuItem MnuClientes;
    private javax.swing.JMenuItem MnuProveedores;
    private javax.swing.JMenu MnuSalir;
    private javax.swing.JMenuItem MnuTiposdeMovimiento;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem mnuProductos;
    private javax.swing.JMenuItem mnuTransportista;
    private javax.swing.JMenuItem opcionCrearModelo;
    // End of variables declaration//GEN-END:variables
}
