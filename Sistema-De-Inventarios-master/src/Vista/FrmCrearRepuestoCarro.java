/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.ModeloCarroController;
import Controlador.RepuestoCarroController;
import Modelo.TBLMarcaVo;
import Modelo.TBLModeloVo;
import Modelo.TBLTipoCombustibleVo;
import Modelo.impl.DropBoxImpl;
import Vista.PanelImage2;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListDataListener;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Elias ,Daniel
 */
public class FrmCrearRepuestoCarro extends javax.swing.JFrame {

    /**
     * Creates new form FrmCrearModeloCarrro
     */
    public String Ruta = "";
    private static RepuestoCarroController repuesto;
    private DropBoxImpl dropBoxImpl;
    private TBLMarcaVo marcas;
    public FrmCrearRepuestoCarro(TBLMarcaVo marcas) {
        //repuesto = new RepuestoController();
        repuesto = new RepuestoCarroController();
        dropBoxImpl = new DropBoxImpl();
        initComponents();
        setTitle("Repuestos");
        this.marcas = marcas;
        this.ltsModelos(this.marcas.getIdMarca());
       repuesto.loadData(tbGetDatosRepuesto, this.marcas.getIdMarca(),"");  
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
        FramImagen = new javax.swing.JFrame();
        Labelimagenes = new javax.swing.JLabel();
        jpanelModeloCarro = new JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtReferencia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnGuardarRepuesto = new javax.swing.JButton();
        ExaminarImagen = new javax.swing.JButton();
        btnActualizarModelo = new javax.swing.JButton();
        btnEliminarRepuesto = new javax.swing.JButton();
        imgProducto = new javax.swing.JLabel();
        btnLimpiarCampos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbGetDatosRepuesto = new javax.swing.JTable();
        txtFilterTable = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        labelIdRegistro = new javax.swing.JLabel();
        labelRutaImagen = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ListModelos = new javax.swing.JComboBox<>();
        BotonFiltrarRepuesto = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout FramImagenLayout = new javax.swing.GroupLayout(FramImagen.getContentPane());
        FramImagen.getContentPane().setLayout(FramImagenLayout);
        FramImagenLayout.setHorizontalGroup(
            FramImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FramImagenLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Labelimagenes, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        FramImagenLayout.setVerticalGroup(
            FramImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FramImagenLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Labelimagenes, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));

        jpanelModeloCarro.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setText("Nombre");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setText("Descripción");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel3.setText("Imagen");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel4.setText("Referencia");

        txtReferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReferenciaActionPerformed(evt);
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

        btnGuardarRepuesto.setBackground(new java.awt.Color(209, 37, 29));
        btnGuardarRepuesto.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        btnGuardarRepuesto.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarRepuesto.setText("Crear Repuesto");
        btnGuardarRepuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRepuestoActionPerformed(evt);
            }
        });

        ExaminarImagen.setBackground(new java.awt.Color(209, 37, 29));
        ExaminarImagen.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        ExaminarImagen.setForeground(new java.awt.Color(255, 255, 255));
        ExaminarImagen.setText("Examinar Imagen");
        ExaminarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExaminarImagenActionPerformed(evt);
            }
        });

        btnActualizarModelo.setBackground(new java.awt.Color(209, 37, 29));
        btnActualizarModelo.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        btnActualizarModelo.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarModelo.setText("Actualizar Repuesto");
        btnActualizarModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarModeloActionPerformed(evt);
            }
        });

        btnEliminarRepuesto.setBackground(new java.awt.Color(209, 37, 29));
        btnEliminarRepuesto.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        btnEliminarRepuesto.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarRepuesto.setText("Eliminar Repuesto");
        btnEliminarRepuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRepuestoActionPerformed(evt);
            }
        });

        imgProducto.setBackground(new java.awt.Color(255, 255, 255));

        btnLimpiarCampos.setBackground(new java.awt.Color(209, 37, 29));
        btnLimpiarCampos.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        btnLimpiarCampos.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarCampos.setText("Limpiar Campos");
        btnLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCamposActionPerformed(evt);
            }
        });

        tbGetDatosRepuesto.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        tbGetDatosRepuesto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbGetDatosRepuesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGetDatosRepuestoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbGetDatosRepuestoMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tbGetDatosRepuesto);

        txtFilterTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFilterTableKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Filtro");

        labelIdRegistro.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel9.setText("Modelo Carro");

        ListModelos.setBackground(new java.awt.Color(209, 37, 29));
        ListModelos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ListModelos.setForeground(new java.awt.Color(255, 255, 255));
        ListModelos.setName(""); // NOI18N
        ListModelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListModelosActionPerformed(evt);
            }
        });

        BotonFiltrarRepuesto.setBackground(new java.awt.Color(209, 37, 29));
        BotonFiltrarRepuesto.setForeground(new java.awt.Color(255, 255, 255));
        BotonFiltrarRepuesto.setText("Buscar");
        BotonFiltrarRepuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFiltrarRepuestoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelModeloCarroLayout = new javax.swing.GroupLayout(jpanelModeloCarro);
        jpanelModeloCarro.setLayout(jpanelModeloCarroLayout);
        jpanelModeloCarroLayout.setHorizontalGroup(
            jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                        .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                                .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(txtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelModeloCarroLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(ExaminarImagen))
                            .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ListModelos, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(274, 274, 274))
                    .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(labelRutaImagen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imgProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActualizarModelo)
                            .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                                .addComponent(btnGuardarRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelIdRegistro))
                            .addComponent(btnEliminarRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                        .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFilterTable, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonFiltrarRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 919, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jpanelModeloCarroLayout.setVerticalGroup(
            jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(labelRutaImagen))
                    .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                        .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ListModelos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelModeloCarroLayout.createSequentialGroup()
                        .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ExaminarImagen))
                        .addGap(2, 2, 2)))
                .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelModeloCarroLayout.createSequentialGroup()
                        .addComponent(imgProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelModeloCarroLayout.createSequentialGroup()
                        .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                                .addComponent(btnGuardarRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnActualizarModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelIdRegistro))
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)))
                .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFilterTable, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BotonFiltrarRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(217, 217, 217))
        );

        txtNombre.getAccessibleContext().setAccessibleParent(this);
        txtReferencia.getAccessibleContext().setAccessibleParent(this);
        btnGuardarRepuesto.getAccessibleContext().setAccessibleParent(this);

        jLabel6.setBackground(new java.awt.Color(204, 204, 0));
        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(209, 37, 29));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("FORMULARIO PARA GESTIONAR REPUESTOS DE LOS VEHICULOS");
        jLabel6.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel6.setDoubleBuffered(true);
        jLabel6.setFocusCycleRoot(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpanelModeloCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanelModeloCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFilterTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilterTableKeyReleased
       
    }//GEN-LAST:event_txtFilterTableKeyReleased

    private void tbGetDatosRepuestoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGetDatosRepuestoMouseClicked
        modificar();
    }//GEN-LAST:event_tbGetDatosRepuestoMouseClicked
  
    private void btnLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCamposActionPerformed
        txtNombre.setText("");
         txtReferencia.setText("");
         txtDescripcion.setText("");
         imgProducto.setIcon(null);
    }//GEN-LAST:event_btnLimpiarCamposActionPerformed
  private void limpiarCampos(){
         txtNombre.setText("");
         txtReferencia.setText("");
         txtDescripcion.setText("");
         imgProducto.setIcon(null);
    }
    private void btnEliminarRepuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRepuestoActionPerformed
           if (!labelIdRegistro.getText().isEmpty()) {
                if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(this,
                        "¿Esta seguro de que desea borrar este repuesto?", "Pregunta", JOptionPane.YES_NO_OPTION)) {
                   try {
                       repuesto.deleteRepuesto(labelIdRegistro.getText());
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, e.getMessage(), "Ocurrio un error al eliminar un repuesto", JOptionPane.ERROR_MESSAGE);
                    }             
                   JOptionPane.showMessageDialog(null,"Repuesto eliminado correctamente", "Repuesto Eliminado",JOptionPane.INFORMATION_MESSAGE);
                }
                    repuesto.loadData(tbGetDatosRepuesto,this.marcas.getIdMarca(),"");
            }else {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado un repuesto para eliminar", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarRepuestoActionPerformed

    private void btnActualizarModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarModeloActionPerformed
        TBLModeloVo modelo = (TBLModeloVo) ListModelos.getSelectedItem();
        if (!labelIdRegistro.getText().isEmpty()) {
            if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(this,
                    "¿Esta seguro de que desea actualizar este Repuesto?", "Pregunta", JOptionPane.YES_NO_OPTION)) {
                try {
                    String path = Ruta;
                    if (!Ruta.contains("/AutopartesLeon/")) {
                        path = dropBoxImpl.uploadFIleDropbox("repuestos", Ruta);
                    }
                    repuesto.updateRepuesto(Integer.parseInt(labelIdRegistro.getText()), txtNombre.getText(), txtReferencia.getText(), txtDescripcion.getText(), path, modelo);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage(), "Ocurrio un error al actualizar un Repuesto", JOptionPane.ERROR_MESSAGE);
                }
                JOptionPane.showMessageDialog(this, "Modelo actualizado correctamente", "Repuesto Actualizado", JOptionPane.INFORMATION_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado un Repuesto para actualizar", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        repuesto.loadData(tbGetDatosRepuesto, this.marcas.getIdMarca(),"");
        limpiarCampos();
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
         labelRutaImagen.setText(splitPAthImg(Ruta));
    }//GEN-LAST:event_ExaminarImagenActionPerformed

    private void btnGuardarRepuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRepuestoActionPerformed
        TBLModeloVo tipoModelo = (TBLModeloVo) ListModelos.getSelectedItem();
        if (RepuestoEsValido(txtNombre.getText(), txtReferencia.getText(), txtDescripcion.getText(), labelRutaImagen.getText(), tipoModelo.getId())) {
                    String path = Ruta;
                    if (!Ruta.contains("/AutopartesLeon/")) {
                        path = dropBoxImpl.uploadFIleDropbox("repuestos", Ruta);
                    }
            repuesto.save(txtNombre.getText(), txtReferencia.getText(), txtDescripcion.getText(), path, tipoModelo);
            repuesto.loadData(tbGetDatosRepuesto,this.marcas.getIdMarca(), "");
            JOptionPane.showMessageDialog(null, "Repuesto creado correctamente", "Repuesto creado", JOptionPane.INFORMATION_MESSAGE);
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnGuardarRepuestoActionPerformed

     public boolean RepuestoEsValido(String nombre, String referencia , String descripcion, String rutaImagen,int tipoModelo) {
        return !nombre.isEmpty() && !referencia.isEmpty() && !descripcion.isEmpty() && !rutaImagen.isEmpty() && tipoModelo!=0;
    }
    private void txtDescripcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescripcionMouseClicked

    }//GEN-LAST:event_txtDescripcionMouseClicked

    private void txtReferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReferenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReferenciaActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void listEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listEstadoActionPerformed

    private void ListModelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListModelosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListModelosActionPerformed

    private void tbGetDatosRepuestoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGetDatosRepuestoMousePressed
        // TODO add your handling code here:
        FramImagen.setVisible(true);
        FramImagen.setSize(500, 500);
  
         int fila =tbGetDatosRepuesto.getSelectedRow();
         Ruta = tbGetDatosRepuesto.getValueAt(fila, 4).toString();  
         String imagen = dropBoxImpl.getFileDrobox(Ruta);
         Image img= new ImageIcon(imagen).getImage();
         ImageIcon img2=new ImageIcon(img.getScaledInstance(Labelimagenes.getWidth(), Labelimagenes.getHeight(),
        Image.SCALE_SMOOTH));

          Labelimagenes.setIcon(img2);   
	FramImagen.setLocationRelativeTo(null);

    }//GEN-LAST:event_tbGetDatosRepuestoMousePressed

    private void BotonFiltrarRepuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFiltrarRepuestoActionPerformed
        repuesto.loadData(tbGetDatosRepuesto,this.marcas.getIdMarca(), txtFilterTable.getText());
    }//GEN-LAST:event_BotonFiltrarRepuestoActionPerformed

    
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
            java.util.logging.Logger.getLogger(FrmCrearRepuestoCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCrearRepuestoCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCrearRepuestoCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCrearRepuestoCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new FrmCrearRepuestoCarro().setVisible(true);
            }
        });
    }
    
   public void modificar(){
     int fila =tbGetDatosRepuesto.getSelectedRow();
     if(fila >=0){ 
         ListModelos.removeAll();
       txtNombre.setText(tbGetDatosRepuesto.getValueAt(fila, 1).toString());
       txtReferencia.setText(tbGetDatosRepuesto.getValueAt(fila, 2).toString());
       txtDescripcion.setText(tbGetDatosRepuesto.getValueAt(fila, 3).toString());
       Ruta = tbGetDatosRepuesto.getValueAt(fila, 4).toString();
       labelRutaImagen.setText(splitPAthImg(Ruta));
       this.ltsModelos(this.marcas.getIdMarca());
       labelIdRegistro.setText(tbGetDatosRepuesto.getValueAt(fila, 6).toString());

        //imagen
        String img = dropBoxImpl.getFileDrobox(Ruta);
        Image mImagen = new ImageIcon(img).getImage();
        ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(this.imgProducto.getWidth(), this.imgProducto.getHeight(), Image.SCALE_SMOOTH));
        imgProducto.setIcon(mIcono);
     }
 } 
   
    public void ltsModelos(int id_marca){       
     repuesto.ltsModelos(id_marca).forEach(obj->{
        ListModelos.addItem(obj);
     });
 }  
 public void listDias(int dia){
  for(int i=1; i<=31;i++){
    if(dia != i){
     //listDia.addItem(String.valueOf(i));
    }
  }
 }
 public void listMes(String mesP){
 String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
  for(String mes: meses)
      if(!mesP.equals(mes)){
//          ListMes.addItem(mes);
      }
    }
 public void listAno(int ano){
     
     for(int i=1900;i<=3000;i++){
       if(ano != i){
       //listAno.addItem(String.valueOf(i));
       }
       
     }
 }
 public String splitPAthImg(String pathImg){
       pathImg = pathImg.replace("\\", "1000001").replace("/", "1000001");
            String spl[] = pathImg.split("1000001");
            int cont = 0;
            for(String st: spl){
                cont +=1;
            }
            return spl[cont-1];
 }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonFiltrarRepuesto;
    private javax.swing.JButton ExaminarImagen;
    private javax.swing.JFrame FramImagen;
    private javax.swing.JLabel Labelimagenes;
    private javax.swing.JComboBox<TBLModeloVo> ListModelos;
    public javax.swing.JButton btnActualizarModelo;
    public javax.swing.JButton btnEliminarRepuesto;
    public javax.swing.JButton btnGuardarRepuesto;
    public javax.swing.JButton btnLimpiarCampos;
    public javax.swing.JLabel imgProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpanelModeloCarro;
    public javax.swing.JLabel labelIdRegistro;
    private javax.swing.JLabel labelRutaImagen;
    private javax.swing.ButtonGroup rdbGrupoEliminar_Actualizar;
    public javax.swing.JTable tbGetDatosRepuesto;
    public javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtFilterTable;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtReferencia;
    // End of variables declaration//GEN-END:variables
}
