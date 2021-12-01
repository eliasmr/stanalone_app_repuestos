
package Vista;

import Controlador.ModeloCarroController;
import Controlador.ModeloRepuestoCarroController;
import Modelo.TBLMarcaVo;
import Modelo.impl.DropBoxImpl;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.ImageIcon;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Elias ,Daniel
 */
public class FrmListarModelosRepuestos extends javax.swing.JFrame {

    /**
     * Creates new form FrmCrearModeloCarrro
     */
    public String Ruta = "";
    
    private static ModeloRepuestoCarroController model;
    private TBLMarcaVo marcas;
    private DropBoxImpl dropBoxImpl;
    private int id;
    DefaultTableModel modelo;

    public FrmListarModelosRepuestos(TBLMarcaVo marcas) {
        model = new ModeloRepuestoCarroController();
        dropBoxImpl = new DropBoxImpl();
        initComponents();
        setTitle("Modelo");
        this.marcas = marcas;
        model.loadData(tbGetDatosModelo, marcas.getIdMarca(),"");
        
        this.listAno(0);
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
        jpanelModeloCarro = new javax.swing.JPanel();
        imgProducto = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbGetDatosModelo = new javax.swing.JTable();
        labelIdRegistro = new javax.swing.JLabel();
        labelRutaImagen = new javax.swing.JLabel();
        BotonFiltrar = new javax.swing.JButton();
        txtFilterTable = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout FramImagenLayout = new javax.swing.GroupLayout(FramImagen.getContentPane());
        FramImagen.getContentPane().setLayout(FramImagenLayout);
        FramImagenLayout.setHorizontalGroup(
            FramImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FramImagenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Labelimagenes, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                .addContainerGap())
        );
        FramImagenLayout.setVerticalGroup(
            FramImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FramImagenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Labelimagenes, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));

        jpanelModeloCarro.setBackground(new java.awt.Color(255, 255, 255));

        imgProducto.setBackground(new java.awt.Color(255, 255, 255));

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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbGetDatosModelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGetDatosModeloMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbGetDatosModeloMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tbGetDatosModelo);

        labelIdRegistro.setEnabled(false);

        BotonFiltrar.setBackground(new java.awt.Color(209, 37, 29));
        BotonFiltrar.setForeground(new java.awt.Color(255, 255, 255));
        BotonFiltrar.setText("Buscar");
        BotonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFiltrarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Filtro");

        javax.swing.GroupLayout jpanelModeloCarroLayout = new javax.swing.GroupLayout(jpanelModeloCarro);
        jpanelModeloCarro.setLayout(jpanelModeloCarroLayout);
        jpanelModeloCarroLayout.setHorizontalGroup(
            jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFilterTable, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonFiltrar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 919, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                        .addComponent(imgProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelRutaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelIdRegistro))))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jpanelModeloCarroLayout.setVerticalGroup(
            jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(labelRutaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelIdRegistro)
                        .addGap(259, 259, 259))
                    .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imgProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpanelModeloCarroLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jpanelModeloCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtFilterTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        jLabel6.setBackground(new java.awt.Color(204, 204, 0));
        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(209, 37, 29));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("FORMULARIO PARA LISTAR MODELOS Y REPUESTOS DE lAS MARCAS");
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
                        .addGap(118, 118, 118)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpanelModeloCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanelModeloCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  private void limpiarCampos(){
   
         imgProducto.setIcon(null);
         labelRutaImagen.setText("");
    }
       public boolean modeloEsValido(String nombre , String cilindraje  , String tipoCombstible, String anio ,String rutaImagen, String descripcion) {
        return !nombre.isEmpty() && !cilindraje.isEmpty() && !tipoCombstible.isEmpty()  && !anio.isEmpty() && !rutaImagen.isEmpty() && !descripcion.isEmpty();
    }
    private void listEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listEstadoActionPerformed

    private void tbGetDatosModeloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGetDatosModeloMousePressed
        
        int fila =tbGetDatosModelo.getSelectedRow();
        Ruta = tbGetDatosModelo.getValueAt(fila, 3).toString();
        String imagen = dropBoxImpl.getFileDrobox(Ruta);
        Image img= new ImageIcon(imagen).getImage();
        ImageIcon img2=new ImageIcon(img.getScaledInstance(600, 600,
            Image.SCALE_SMOOTH));
        Labelimagenes.setIcon(img2);
        FramImagen.setLocationRelativeTo(null);
         FramImagen.setVisible(true);
        FramImagen.setSize(600, 600);
    }//GEN-LAST:event_tbGetDatosModeloMousePressed

    private void tbGetDatosModeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGetDatosModeloMouseClicked
        modificar();

    }//GEN-LAST:event_tbGetDatosModeloMouseClicked

    private void BotonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFiltrarActionPerformed
        // TODO add your handling code here:
        model.loadData(tbGetDatosModelo,this.marcas.getIdMarca(), txtFilterTable.getText());
    }//GEN-LAST:event_BotonFiltrarActionPerformed

 
    
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
            java.util.logging.Logger.getLogger(FrmListarModelosRepuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmListarModelosRepuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmListarModelosRepuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmListarModelosRepuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmListarModelosRepuestos(new TBLMarcaVo()).setVisible(true);
            }
        });
    }
    
   public void modificar(){
     int fila =tbGetDatosModelo.getSelectedRow();
     //String anio = (String) listAnio.getSelectedItem();
     if(fila >=0){      
       Ruta="";
      // txtNombre.setText(tbGetDatosModelo.getValueAt(fila, 1).toString());
      // txtDescripcion.setText(tbGetDatosModelo.getValueAt(fila, 2).toString());
        Ruta = tbGetDatosModelo.getValueAt(fila, 3).toString();
       labelRutaImagen.setText(splitPAthImg(Ruta));
      // txtCilindraje.setText(tbGetDatosModelo.getValueAt(fila, 5).toString());     
     //  this.listAno(Integer.parseInt(anio));
       //marcas
       labelIdRegistro.setText(tbGetDatosModelo.getValueAt(fila, 8).toString());
       
       //imagen
        String img = dropBoxImpl.getFileDrobox(Ruta);
        Image mImagen = new ImageIcon(img).getImage();
        ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(this.imgProducto.getWidth(), this.imgProducto.getHeight(), Image.SCALE_SMOOTH));
        imgProducto.setIcon(mIcono);
            

     }
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
     //  listAnio.addItem(String.valueOf(i));
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
    private javax.swing.JButton BotonFiltrar;
    private javax.swing.JFrame FramImagen;
    private javax.swing.JLabel Labelimagenes;
    public javax.swing.JLabel imgProducto;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpanelModeloCarro;
    public javax.swing.JLabel labelIdRegistro;
    private javax.swing.JLabel labelRutaImagen;
    private javax.swing.ButtonGroup rdbGrupoEliminar_Actualizar;
    public javax.swing.JTable tbGetDatosModelo;
    private javax.swing.JTextField txtFilterTable;
    // End of variables declaration//GEN-END:variables

   
}
