
package Vista;


import Controlador.ModeloCarroController;
import Controlador.ModeloRepuestoCarroController;
import Controlador.RepuestoCarroController;
import Controlador.RepuestoXModeloController;
import Modelo.TBLMarcaVo;
import Modelo.TBLModeloVo;
import Modelo.TBLModeloXRepuestoVo;
import Modelo.TBLRepuestoVo;
import Modelo.impl.DropBoxImpl;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Elias ,Daniel
 */
public class FrmCrearRepuestoxRepuestoCarro extends javax.swing.JFrame {

    /**
     * Creates new form FrmCrearModeloCarrro
     */
    public String Ruta = "";
    private static RepuestoCarroController repuesto;
    private DropBoxImpl dropBoxImpl;
    private TBLMarcaVo marcas;
    private TBLRepuestoVo dtoRepuesto;
    private static ModeloCarroController model;
    private List<TBLModeloXRepuestoVo> ltsModeloXRepuestoVo;
    private RepuestoXModeloController control;
    private ModeloRepuestoCarroController modeloRepuestoCarroController;
 
    public FrmCrearRepuestoxRepuestoCarro() {
        //repuesto = new RepuestoController();
        repuesto = new RepuestoCarroController();
        dropBoxImpl = new DropBoxImpl();
        model = new ModeloCarroController();
        ltsModeloXRepuestoVo = new ArrayList<>();
        modeloRepuestoCarroController = new ModeloRepuestoCarroController();
        
        control = new RepuestoXModeloController();
        initComponents();
         setTitle("Autopartes Leon");
         this.getContentPane().setBackground(Color.WHITE);
         getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        
        this.jLabel6.setText("FORMULARIO PARA GESTIONAR REPUESTOS ");
        setIconImage(new ImageIcon(dropBoxImpl.getFileDrobox("/AutopartesLeon/recusos_app/logoAutopartes.PNG")).getImage());
       repuesto.loadDataModeloXrepuesto(tbGetDatosRepuesto,"");  
       
       
        //oculta modelos
        tbGetDatosModelo.setVisible(false);
        tbGetDatosModelo.getTableHeader().setVisible(false);
        jScrollPane3.setVisible(false);
        jLabel9.setVisible(false);
        txtFilterTable1.setVisible(false);
        BotonBuscarModelo.setVisible(false);
        txtFilterTable1.setVisible(false);
        jLabel8.setVisible(false);
        
        // oculta modelo x repuesto
        jLabel10.setVisible(false);
        txtFilterTable2.setVisible(false);
        tbGetDatosRepuestoxModelo.setVisible(false);
        jScrollPane4.setVisible(false);
         BotonFiltrarRepuestoxmodelo.setVisible(false);
         BotonGuardarRepuestoxmodelo.setVisible(false);
         
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
        labelIdRegistro = new javax.swing.JLabel();
        BotonGuardarRepuestoxmodelo = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbGetDatosRepuestoxModelo = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txtFilterTable2 = new javax.swing.JTextField();
        BotonFiltrarRepuestoxmodelo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbGetDatosRepuesto = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtFilterTable = new javax.swing.JTextField();
        BotonFiltrarRepuesto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbGetDatosModelo = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtFilterTable1 = new javax.swing.JTextField();
        BotonBuscarModelo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        labelselecionDelRepuesto = new javax.swing.JLabel();

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

        labelIdRegistro.setEnabled(false);

        BotonGuardarRepuestoxmodelo.setBackground(new java.awt.Color(209, 37, 29));
        BotonGuardarRepuestoxmodelo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotonGuardarRepuestoxmodelo.setForeground(new java.awt.Color(255, 255, 255));
        BotonGuardarRepuestoxmodelo.setText("Guardar Datos");
        BotonGuardarRepuestoxmodelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarRepuestoxmodeloActionPerformed(evt);
            }
        });

        tbGetDatosRepuestoxModelo.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        tbGetDatosRepuestoxModelo.setModel(new javax.swing.table.DefaultTableModel(
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
        tbGetDatosRepuestoxModelo.setRowHeight(30);
        tbGetDatosRepuestoxModelo.setRowMargin(10);
        tbGetDatosRepuestoxModelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGetDatosRepuestoxModeloMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbGetDatosRepuestoxModeloMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(tbGetDatosRepuestoxModelo);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Filtro");

        txtFilterTable2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFilterTable2KeyReleased(evt);
            }
        });

        BotonFiltrarRepuestoxmodelo.setBackground(new java.awt.Color(209, 37, 29));
        BotonFiltrarRepuestoxmodelo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotonFiltrarRepuestoxmodelo.setForeground(new java.awt.Color(255, 255, 255));
        BotonFiltrarRepuestoxmodelo.setText("Buscar");
        BotonFiltrarRepuestoxmodelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFiltrarRepuestoxmodeloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelModeloCarroLayout = new javax.swing.GroupLayout(jpanelModeloCarro);
        jpanelModeloCarro.setLayout(jpanelModeloCarroLayout);
        jpanelModeloCarroLayout.setHorizontalGroup(
            jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFilterTable2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonFiltrarRepuestoxmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelIdRegistro)
                .addContainerGap())
            .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                .addGap(456, 456, 456)
                .addComponent(BotonGuardarRepuestoxmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelModeloCarroLayout.setVerticalGroup(
            jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtFilterTable2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelModeloCarroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonFiltrarRepuestoxmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(labelIdRegistro)
                        .addGap(884, 884, 884))
                    .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonGuardarRepuestoxmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jLabel6.setBackground(new java.awt.Color(204, 204, 0));
        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(209, 37, 29));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(" FORMULARIO PARA AGREGAR UN REPUESTO AL MODELO");
        jLabel6.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel6.setDoubleBuffered(true);
        jLabel6.setFocusCycleRoot(true);

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
        tbGetDatosRepuesto.setRowHeight(30);
        tbGetDatosRepuesto.setRowMargin(10);
        tbGetDatosRepuesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGetDatosRepuestoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbGetDatosRepuestoMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tbGetDatosRepuesto);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Filtro");

        txtFilterTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFilterTableKeyReleased(evt);
            }
        });

        BotonFiltrarRepuesto.setBackground(new java.awt.Color(209, 37, 29));
        BotonFiltrarRepuesto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotonFiltrarRepuesto.setForeground(new java.awt.Color(255, 255, 255));
        BotonFiltrarRepuesto.setText("Buscar");
        BotonFiltrarRepuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFiltrarRepuestoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Repuestos");

        tbGetDatosModelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbGetDatosModelo.setRowHeight(30);
        tbGetDatosModelo.setRowMargin(10);
        tbGetDatosModelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGetDatosModeloMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbGetDatosModeloMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(tbGetDatosModelo);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Filtro");

        txtFilterTable1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFilterTable1ActionPerformed(evt);
            }
        });
        txtFilterTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFilterTable1KeyReleased(evt);
            }
        });

        BotonBuscarModelo.setBackground(new java.awt.Color(209, 37, 29));
        BotonBuscarModelo.setForeground(new java.awt.Color(255, 255, 255));
        BotonBuscarModelo.setText("Buscar");
        BotonBuscarModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarModeloActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Modelos");

        labelselecionDelRepuesto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpanelModeloCarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1012, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(txtFilterTable, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonFiltrarRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFilterTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(BotonBuscarModelo))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelselecionDelRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFilterTable, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BotonFiltrarRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelselecionDelRepuesto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFilterTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBuscarModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanelModeloCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFilterTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilterTableKeyReleased
       
    }//GEN-LAST:event_txtFilterTableKeyReleased

    private void tbGetDatosRepuestoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGetDatosRepuestoMouseClicked
        List<TBLModeloXRepuestoVo> lt = new ArrayList<>();
        
        model.loadDataModelXRepuesto(tbGetDatosModelo,"", lt);
    }//GEN-LAST:event_tbGetDatosRepuestoMouseClicked

    private void listEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listEstadoActionPerformed

    private void tbGetDatosRepuestoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGetDatosRepuestoMousePressed
        dtoRepuesto = new TBLRepuestoVo();


                
        int fila = tbGetDatosRepuesto.rowAtPoint(evt.getPoint());
        int colunm = tbGetDatosRepuesto.getColumnModel().getColumnIndexAtX(evt.getX());

        
        Object value = tbGetDatosRepuesto.getValueAt(fila, colunm);
        if (value instanceof JButton) {
            ((JButton) value).doClick();
            JButton btn = (JButton) value;
            if (btn.getName().equals("id_visualizar")) {

                Ruta = tbGetDatosRepuesto.getValueAt(fila, 3).toString();
                String imagen = dropBoxImpl.getFileDrobox(Ruta);
                Image img3 = new ImageIcon(imagen).getImage();
                Dimension size = new Dimension(img3.getWidth(null), img3.getHeight(null));
                ImageIcon img2 = new ImageIcon(img3);

                FramImagen.getContentPane().setLayout(new BorderLayout());

                Labelimagenes.setIcon(img2);
                FramImagen.getContentPane().add(Labelimagenes, BorderLayout.CENTER);

                FramImagen.getContentPane().setBackground(Color.WHITE);
                FramImagen.setSize(new Dimension(img3.getWidth(this) + 50, img3.getWidth(this) + 50));
                FramImagen.setIconImage(new ImageIcon(dropBoxImpl.getFileDrobox("/AutopartesLeon/recusos_app/logoAutopartes.PNG")).getImage());
                FramImagen.getRootPane().setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(209, 37, 29)));
                FramImagen.setVisible(true);
                FramImagen.setLocationRelativeTo(null);
                FramImagen.setResizable(false);
            }
        }else{
        
            tbGetDatosModelo.setVisible(true);
            tbGetDatosModelo.getTableHeader().setVisible(true);
            jScrollPane3.setVisible(true);
            jLabel9.setVisible(true);
            txtFilterTable1.setVisible(true);
            BotonBuscarModelo.setVisible(true);
            txtFilterTable1.setVisible(true);
            jLabel8.setVisible(true);
            Integer id = Integer.parseInt(tbGetDatosRepuesto.getValueAt(fila, 5).toString());
            dtoRepuesto.setNombre(tbGetDatosRepuesto.getValueAt(fila, 1).toString());
            dtoRepuesto.setIdRepuesto(id);
            labelselecionDelRepuesto.setText("Selecione los modelos para el repuesto de: "+dtoRepuesto.getNombre());
            model.loadDataModelXRepuesto(tbGetDatosModelo,"", ltsModeloXRepuestoVo);
        }

    }//GEN-LAST:event_tbGetDatosRepuestoMousePressed

    private void BotonFiltrarRepuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFiltrarRepuestoActionPerformed
        repuesto.loadData(tbGetDatosRepuesto, txtFilterTable.getText());
    }//GEN-LAST:event_BotonFiltrarRepuestoActionPerformed

    List<TBLModeloXRepuestoVo> ltt = new ArrayList<>();
    private void tbGetDatosModeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGetDatosModeloMouseClicked
        int fila = tbGetDatosModelo.rowAtPoint(evt.getPoint());
        int colunm = tbGetDatosModelo.getColumnModel().getColumnIndexAtX(evt.getX());  
        
        
        
        if(fila >= 0){
            TBLModeloXRepuestoVo mr = new TBLModeloXRepuestoVo();
            TBLModeloVo m = new TBLModeloVo();
            TBLMarcaVo ma = new TBLMarcaVo();
            ma.setNombre(tbGetDatosModelo.getValueAt(fila, 6).toString());
            m.setNombre(tbGetDatosModelo.getValueAt(fila, 1).toString());
            m.setDescripcion(tbGetDatosModelo.getValueAt(fila, 3).toString());
            m.setPathImagen(tbGetDatosModelo.getValueAt(fila, 4).toString());
            m.setCilindraje(tbGetDatosModelo.getValueAt(fila, 5).toString());
            m.setAnio(tbGetDatosModelo.getValueAt(fila, 6).toString());
            m.setId(Integer.parseInt(tbGetDatosModelo.getValueAt(fila, 7).toString()));
            
            m.setIsCheck(Boolean.parseBoolean(tbGetDatosModelo.getValueAt(fila, 8).toString()));
            m.setIdMarca(ma);
            
            mr.setModelo(m);
            mr.setRepuesto(dtoRepuesto);
           Boolean value = Boolean.parseBoolean(tbGetDatosModelo.getValueAt(fila, 8).toString());
              if(value){
                if(control.getAllByIDmodeloIDRepuesto(mr.getRepuesto().getIdRepuesto(),mr.getModelo().getId())){
                    JOptionPane.showMessageDialog(null, "El Registro ya existe", "Registro existente", JOptionPane.INFORMATION_MESSAGE);
                    model.loadDataModelXRepuesto(tbGetDatosModelo,"", new ArrayList<>());
                }else{
                    ltt.add(mr);
                }
                 
              }else{
              ltt.removeIf(obj -> obj.getModelo().getNombre().equals(mr.getModelo().getNombre()) && 
                                  obj.getRepuesto().getNombre().equals(mr.getRepuesto().getNombre()));
              }   
              
              Object valueModelo = tbGetDatosModelo.getValueAt(fila, colunm);
               if (valueModelo instanceof JButton) {
                   ((JButton) valueModelo).doClick();
                   JButton btn = (JButton) valueModelo;
                   if (btn.getName().equals("id_visualizar_modelo")) {

                       Ruta = tbGetDatosModelo.getValueAt(fila, 3).toString();
                       String imagen = dropBoxImpl.getFileDrobox(Ruta);
                       Image img3 = new ImageIcon(imagen).getImage();
                       Dimension size = new Dimension(img3.getWidth(null), img3.getHeight(null));
                       ImageIcon img2 = new ImageIcon(img3);

                       FramImagen.getContentPane().setLayout(new BorderLayout());

                       Labelimagenes.setIcon(img2);
                       FramImagen.getContentPane().add(Labelimagenes, BorderLayout.CENTER);

                       FramImagen.getContentPane().setBackground(Color.WHITE);
                       FramImagen.setSize(new Dimension(img3.getWidth(this) + 50, img3.getWidth(this) + 50));
                       FramImagen.setIconImage(new ImageIcon(dropBoxImpl.getFileDrobox("/AutopartesLeon/recusos_app/logoAutopartes.PNG")).getImage());
                       FramImagen.getRootPane().setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(209, 37, 29)));
                       FramImagen.setVisible(true);
                       FramImagen.setLocationRelativeTo(null);
                       FramImagen.setResizable(false);
                   }
               }
        }
        
          if(!ltt.isEmpty()){
            jLabel10.setVisible(true);
            txtFilterTable2.setVisible(true);
            tbGetDatosRepuestoxModelo.setVisible(true);
            jScrollPane4.setVisible(true);
            BotonFiltrarRepuestoxmodelo.setVisible(true);
            BotonGuardarRepuestoxmodelo.setVisible(true);
            ltsModeloXRepuestoVo = new ArrayList<>();
            ltt.stream().forEach(oj ->{
                List<TBLModeloXRepuestoVo> lt = ltt.stream().filter(obj -> obj.getModelo().getNombre().equals(oj.getModelo().getNombre()) && 
                                  obj.getRepuesto().getNombre().equals(oj.getRepuesto().getNombre())).collect(Collectors.toList());
                if(lt.size()==1){
                    ltsModeloXRepuestoVo.add(oj);
                }
            });
              modeloRepuestoCarroController.loadDataModeloXRepuesto(tbGetDatosRepuestoxModelo, "", ltsModeloXRepuestoVo);
               
          }
    }//GEN-LAST:event_tbGetDatosModeloMouseClicked

    private void tbGetDatosModeloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGetDatosModeloMousePressed
        

    }//GEN-LAST:event_tbGetDatosModeloMousePressed

    private void txtFilterTable1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFilterTable1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFilterTable1ActionPerformed

    private void txtFilterTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilterTable1KeyReleased

    }//GEN-LAST:event_txtFilterTable1KeyReleased

    private void BotonBuscarModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarModeloActionPerformed
 
        model.loadDataModelXRepuesto(tbGetDatosModelo,txtFilterTable1.getText(),ltsModeloXRepuestoVo);        // TODO add your handling code here:
    }//GEN-LAST:event_BotonBuscarModeloActionPerformed

    private void tbGetDatosRepuestoxModeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGetDatosRepuestoxModeloMouseClicked
       int fila = tbGetDatosRepuestoxModelo.rowAtPoint(evt.getPoint());
        int colunm = tbGetDatosRepuestoxModelo.getColumnModel().getColumnIndexAtX(evt.getX());
         Object value = tbGetDatosRepuestoxModelo.getValueAt(fila, colunm);
        if (value instanceof JButton) {
            ((JButton) value).doClick();
            JButton btn = (JButton) value;
            if (btn.getName().equals("elimnar_btn")) {
                 String nombreRepuesto = tbGetDatosRepuestoxModelo.getValueAt(fila, 1).toString();
                String nombreModelo = tbGetDatosRepuestoxModelo.getValueAt(fila, 2).toString();
                
                ltsModeloXRepuestoVo.removeIf(obj -> obj.getModelo().getNombre().equals(nombreModelo) && 
                                  obj.getRepuesto().getNombre().equals(nombreRepuesto));
                
               modeloRepuestoCarroController.loadDataModeloXRepuesto(tbGetDatosRepuestoxModelo, "", ltsModeloXRepuestoVo);
               model.loadDataModelXRepuesto(tbGetDatosModelo,"",new ArrayList<>()); 
               ltt.clear();
               
               if(ltsModeloXRepuestoVo.isEmpty()){
                       // oculta modelo x repuesto
                jLabel10.setVisible(false);
                txtFilterTable2.setVisible(false);
                tbGetDatosRepuestoxModelo.setVisible(false);
                jScrollPane4.setVisible(false);
                BotonFiltrarRepuestoxmodelo.setVisible(false);
                BotonGuardarRepuestoxmodelo.setVisible(false);
               }
               ltt.addAll(ltsModeloXRepuestoVo);
            }}
    }//GEN-LAST:event_tbGetDatosRepuestoxModeloMouseClicked

    private void tbGetDatosRepuestoxModeloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGetDatosRepuestoxModeloMousePressed

    }//GEN-LAST:event_tbGetDatosRepuestoxModeloMousePressed

    private void txtFilterTable2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilterTable2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFilterTable2KeyReleased

    private void BotonGuardarRepuestoxmodeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarRepuestoxmodeloActionPerformed
      if(control.insert(ltsModeloXRepuestoVo)){
        JOptionPane.showMessageDialog(null, "Registro Creado Exitoso", "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
        ltsModeloXRepuestoVo.clear();
        ltt.clear();
        modeloRepuestoCarroController.loadDataModeloXRepuesto(tbGetDatosRepuestoxModelo, "", ltsModeloXRepuestoVo);
        // oculta modelo x repuesto
        jLabel10.setVisible(false);
        txtFilterTable2.setVisible(false);
        tbGetDatosRepuestoxModelo.setVisible(false);
        jScrollPane4.setVisible(false);
         BotonFiltrarRepuestoxmodelo.setVisible(false);
         BotonGuardarRepuestoxmodelo.setVisible(false);
      }
    }//GEN-LAST:event_BotonGuardarRepuestoxmodeloActionPerformed

    private void BotonFiltrarRepuestoxmodeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFiltrarRepuestoxmodeloActionPerformed
         modeloRepuestoCarroController.loadDataModeloXRepuesto(tbGetDatosRepuestoxModelo, txtFilterTable2.getText(), ltsModeloXRepuestoVo);
    }//GEN-LAST:event_BotonFiltrarRepuestoxmodeloActionPerformed

    
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
            java.util.logging.Logger.getLogger(FrmCrearRepuestoxRepuestoCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCrearRepuestoxRepuestoCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCrearRepuestoxRepuestoCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCrearRepuestoxRepuestoCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new FrmCrearRepuestoCarro().setVisible(true);
            }
        });
    }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscarModelo;
    private javax.swing.JButton BotonFiltrarRepuesto;
    private javax.swing.JButton BotonFiltrarRepuestoxmodelo;
    private javax.swing.JButton BotonGuardarRepuestoxmodelo;
    private javax.swing.JFrame FramImagen;
    private javax.swing.JLabel Labelimagenes;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel jpanelModeloCarro;
    public javax.swing.JLabel labelIdRegistro;
    private javax.swing.JLabel labelselecionDelRepuesto;
    private javax.swing.ButtonGroup rdbGrupoEliminar_Actualizar;
    public javax.swing.JTable tbGetDatosModelo;
    public javax.swing.JTable tbGetDatosRepuesto;
    public javax.swing.JTable tbGetDatosRepuestoxModelo;
    private javax.swing.JTextField txtFilterTable;
    private javax.swing.JTextField txtFilterTable1;
    private javax.swing.JTextField txtFilterTable2;
    // End of variables declaration//GEN-END:variables
}