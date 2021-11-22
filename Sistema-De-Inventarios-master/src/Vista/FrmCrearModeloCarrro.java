/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.ModeloCarroController;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Elias ,Daniel
 */
public class FrmCrearModeloCarrro extends javax.swing.JFrame {

    /**
     * Creates new form FrmCrearModeloCarrro
     */
    public String Ruta = "";
    private static ModeloCarroController model;
    public FrmCrearModeloCarrro() {
        model = new ModeloCarroController();
        initComponents();
        setTitle("Modelo");
        model.loadData(tbGetDatosModelo, "");
        this.setLocationRelativeTo(null);//centrar formulario
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdbGrupoEliminar_Actualizar = new javax.swing.ButtonGroup();
        jpanelModeloCarro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnGuardarModelo = new javax.swing.JButton();
        ExaminarImagen = new javax.swing.JButton();
        PanelImagen = new javax.swing.JPanel();
        btnActualizarModelo = new javax.swing.JButton();
        btnEliminarModelo = new javax.swing.JButton();
        imgProducto = new javax.swing.JLabel();
        btnLimpiarCampos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbGetDatosModelo = new javax.swing.JTable();
        txtFilterTable = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        labelIdRegistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));

        jpanelModeloCarro.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nombre");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Descripción");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Imagen");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Modelo");

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        txtDescripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDescripcionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txtDescripcion);
        txtDescripcion.getAccessibleContext().setAccessibleParent(this);

        btnGuardarModelo.setText("Guardar Modelo");
        btnGuardarModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarModeloActionPerformed(evt);
            }
        });

        ExaminarImagen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ExaminarImagen.setText("Examinar Imagen");
        ExaminarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExaminarImagenActionPerformed(evt);
            }
        });

        PanelImagen.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout PanelImagenLayout = new javax.swing.GroupLayout(PanelImagen);
        PanelImagen.setLayout(PanelImagenLayout);
        PanelImagenLayout.setHorizontalGroup(
            PanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelImagenLayout.setVerticalGroup(
            PanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );

        btnActualizarModelo.setText("Actualizar Modelo");
        btnActualizarModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarModeloActionPerformed(evt);
            }
        });

        btnEliminarModelo.setText("Eliminar Modelo");
        btnEliminarModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarModeloActionPerformed(evt);
            }
        });

        btnLimpiarCampos.setText("Limpiar Campos");
        btnLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCamposActionPerformed(evt);
            }
        });

        tbGetDatosModelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbGetDatosModelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGetDatosModeloMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbGetDatosModelo);
        if (tbGetDatosModelo.getColumnModel().getColumnCount() > 0) {
            tbGetDatosModelo.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            tbGetDatosModelo.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            tbGetDatosModelo.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            tbGetDatosModelo.getColumnModel().getColumn(3).setHeaderValue("Title 4");
        }

        txtFilterTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFilterTableKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Filtro");

        labelIdRegistro.setText("jLabel6");
        labelIdRegistro.setEnabled(false);

        javax.swing.GroupLayout jpanelModeloCarroLayout = new javax.swing.GroupLayout(jpanelModeloCarro);
        jpanelModeloCarro.setLayout(jpanelModeloCarroLayout);
        jpanelModeloCarroLayout.setHorizontalGroup(
            jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(2, 2, 2)
                        .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PanelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                        .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnLimpiarCampos, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(btnEliminarModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFilterTable, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(labelIdRegistro))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelModeloCarroLayout.createSequentialGroup()
                        .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                                .addComponent(ExaminarImagen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                                .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNombre)
                                    .addComponent(txtModelo))
                                .addGap(133, 133, 133)))
                        .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGuardarModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActualizarModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                        .addGap(68, 68, 68)))
                .addContainerGap())
        );
        jpanelModeloCarroLayout.setVerticalGroup(
            jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ExaminarImagen)))
                    .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnActualizarModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnEliminarModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnLimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(imgProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(32, 32, 32)))
                .addGap(9, 9, 9)
                .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFilterTable, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelIdRegistro))
                    .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
        );

        txtNombre.getAccessibleContext().setAccessibleParent(this);
        txtModelo.getAccessibleContext().setAccessibleParent(this);
        btnGuardarModelo.getAccessibleContext().setAccessibleParent(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanelModeloCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(532, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanelModeloCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void btnGuardarModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarModeloActionPerformed
        model.save(txtNombre.getText(), txtDescripcion.getText(), "src/patch", true, new Date(1L));
        model.loadData(tbGetDatosModelo,"");
    }//GEN-LAST:event_btnGuardarModeloActionPerformed

    private void btnActualizarModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarModeloActionPerformed
        model.updateModel(txtNombre.getText(), txtDescripcion.getText(), "src/patch", true, new Date(1L),labelIdRegistro.getText());
        model.loadData(tbGetDatosModelo,"");
    }//GEN-LAST:event_btnActualizarModeloActionPerformed

    private void ExaminarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExaminarImagenActionPerformed
        JFileChooser jFileChooser = new JFileChooser();
        FileNameExtensionFilter fileNameExtensionFilter = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        jFileChooser.setFileFilter(fileNameExtensionFilter);

        if (jFileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            Ruta = jFileChooser.getSelectedFile().getAbsolutePath();
            Image mImagen = new ImageIcon(Ruta).getImage();
            ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(this.imgProducto.getWidth(), this.imgProducto.getHeight(), Image.SCALE_SMOOTH));
            imgProducto.setIcon(mIcono);
        }
    }//GEN-LAST:event_ExaminarImagenActionPerformed

    private void btnLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCamposActionPerformed
          txtNombre.setText("");
         txtDescripcion.setText("");
        imgProducto.setIcon(null);    }//GEN-LAST:event_btnLimpiarCamposActionPerformed

    private void txtDescripcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescripcionMouseClicked
       
    }//GEN-LAST:event_txtDescripcionMouseClicked

    private void tbGetDatosModeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGetDatosModeloMouseClicked
        modificar();
    }//GEN-LAST:event_tbGetDatosModeloMouseClicked

    private void btnEliminarModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarModeloActionPerformed
        model.deleteModelo(labelIdRegistro.getText());
        model.loadData(tbGetDatosModelo,"");
    }//GEN-LAST:event_btnEliminarModeloActionPerformed

    private void txtFilterTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilterTableKeyReleased
        model.loadData(tbGetDatosModelo, txtFilterTable.getText());
    }//GEN-LAST:event_txtFilterTableKeyReleased

    
        private byte[] getImagen(String ruta) {
        File imagen = new File(ruta);
        try {
            byte[] icono = new byte[(int) imagen.length()];
            InputStream inputStream = new FileInputStream(imagen);
            inputStream.read(icono);
            return icono;

        } catch (Exception e) {
            return null;
        }
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCrearModeloCarrro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCrearModeloCarrro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCrearModeloCarrro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCrearModeloCarrro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCrearModeloCarrro().setVisible(true);
            }
        });
    }
    
   public void modificar(){
     int fila =tbGetDatosModelo.getSelectedRow();
     if(fila >=0){
       txtNombre.setText(tbGetDatosModelo.getValueAt(fila, 1).toString());
       txtModelo.setText(tbGetDatosModelo.getValueAt(fila, 1).toString());
       txtDescripcion.setText(tbGetDatosModelo.getValueAt(fila, 2).toString());
       labelIdRegistro.setText(tbGetDatosModelo.getValueAt(fila, 5).toString());;
     }
 } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExaminarImagen;
    private javax.swing.JPanel PanelImagen;
    public javax.swing.JButton btnActualizarModelo;
    public javax.swing.JButton btnEliminarModelo;
    public javax.swing.JButton btnGuardarModelo;
    public javax.swing.JButton btnLimpiarCampos;
    public javax.swing.JLabel imgProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpanelModeloCarro;
    public javax.swing.JLabel labelIdRegistro;
    private javax.swing.ButtonGroup rdbGrupoEliminar_Actualizar;
    public javax.swing.JTable tbGetDatosModelo;
    public javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtFilterTable;
    public javax.swing.JTextField txtModelo;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
