
package Controlador;

import Modelo.TBLModeloVo;
import Modelo.TBLRepuestoVo;
import Modelo.impl.TBLModeloImpl;
import Modelo.impl.TBLRepuestoImpl;
import Vista.FrmCrearModeloCarrro;
import Vista.FrmCrearRepuestoCarro;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Elias
 */
public class RepuestoCarroController{

    private TBLRepuestoImpl impl;
    private TBLRepuestoVo repuesto;
    private FrmCrearRepuestoCarro frm;
    private TBLModeloImpl modelo;
    private final PrincipalController principaCtr;
    private  List<TBLRepuestoVo> ltsRepuesto;
    
    public RepuestoCarroController(){
        this.modelo = new TBLModeloImpl();
        this.impl = new TBLRepuestoImpl();
        this.principaCtr = new PrincipalController();
        this.ltsRepuesto = new ArrayList<>();
    }

    
    

    public void save(String nombre,String referencia,String descripcion,String img, TBLModeloVo modelo) {      
        impl.insertarRepuesto(TBLRepuestoVo
                           .builder()
                           .nombre(nombre)          
                           .referencia(referencia)
                           .descripcion(descripcion)
                           .pathImagen(img)
                           .idmodelo(modelo)
                           .build());
    }
    
    public void loadData(JTable jt, int id_modelo,String params){
     DefaultTableModel repuestoT = new DefaultTableModel();
     List<TBLRepuestoVo> ltsTem = new ArrayList<>();
     String param = params.toUpperCase();
     if(params.isEmpty()){
         ltsRepuesto = principaCtr.getAllRepuesto(id_modelo);
         ltsTem = ltsRepuesto;
     }else{
       ltsTem =  ltsRepuesto.stream().filter(registro -> 
                                             registro.getNombre().toUpperCase().contains(param)||
                                             registro.getReferencia().toUpperCase().contains(param) ||
                                             registro.getDescripcion().toUpperCase().contains(param) ||
                                             registro.getIdmodelo().getNombre().toUpperCase().contains(param) 
                                             ).collect(Collectors.toList());
     }
    jt.setModel(repuestoT);
    repuestoT.addColumn("#");
    repuestoT.addColumn("Nombre");
    repuestoT.addColumn("Referencia");
    repuestoT.addColumn("Descripcion");
    repuestoT.addColumn("Imagen");
    repuestoT.addColumn("Modelo");
    repuestoT.addColumn("Codigo");
    
    Object[] columna = new Object [7];
    AtomicReference<Integer> counter = new AtomicReference<>(1);
    ltsTem.stream().forEach(obj ->{
      
      columna[0] = counter.get();
      columna[1] = obj.getNombre();
      columna[2] = obj.getReferencia();
      columna[3] = obj.getDescripcion();
      columna[4] = obj.getPathImagen();
      columna[5] = obj.getIdmodelo();
      columna[6] = obj.getIdRepuesto();
      counter.getAndUpdate(value -> value + 1);
      repuestoT.addRow(columna);
    });
            TableColumnModel columnModel = jt.getColumnModel();
        
        columnModel.getColumn(0).setMaxWidth(30);
        columnModel.getColumn(1).setPreferredWidth(100);
        columnModel.getColumn(2).setPreferredWidth(50);
        columnModel.getColumn(3).setPreferredWidth(200);
         columnModel.getColumn(4).setPreferredWidth(200);
         columnModel.getColumn(5).setPreferredWidth(50);
         columnModel.getColumn(6).setPreferredWidth(1);
         
         
         DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        jt.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(5).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(6).setCellRenderer( centerRenderer );
        
        jt.getTableHeader().setFont(new Font("Cooper Black", 1, 14));
        jt.getTableHeader().setBackground(new Color(209,37,29));
        jt.getTableHeader().setForeground(Color.white);
        jt.getTableHeader().setPreferredSize(new Dimension(100, 50));
   }
    
    public boolean loadDataModeloXrepuesto(JTable jt, int id_modelo,String params){
     DefaultTableModel repuestoT = new DefaultTableModel();
      ltsRepuesto = principaCtr.getAllRepuestoByIdRepuestoModelo(id_modelo);
     AtomicReference<Boolean> validacion = new AtomicReference<>(false);
    jt.setModel(repuestoT);
    repuestoT.addColumn("#");
    repuestoT.addColumn("Nombre");
    repuestoT.addColumn("Referencia");
    repuestoT.addColumn("Descripcion");
    repuestoT.addColumn("Imagen");
    repuestoT.addColumn("Modelo");
    repuestoT.addColumn("Codigo");
    
    Object[] columna = new Object [7];
    AtomicReference<Integer> counter = new AtomicReference<>(1);
    ltsRepuesto.stream().forEach(obj ->{
      columna[0] = counter.get();
      columna[1] = obj.getNombre();
      columna[2] = obj.getReferencia();
      columna[3] = obj.getDescripcion();
      columna[4] = obj.getPathImagen();
      columna[5] = obj.getIdmodelo();
      columna[6] = obj.getIdRepuesto();
      counter.getAndUpdate(value -> value + 1);
      repuestoT.addRow(columna);
      validacion.set(Boolean.TRUE);
    });
    
        TableColumnModel columnModel = jt.getColumnModel();
        
        columnModel.getColumn(0).setMaxWidth(30);
        columnModel.getColumn(1).setPreferredWidth(100);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setPreferredWidth(200);
         columnModel.getColumn(4).setPreferredWidth(80);
         columnModel.getColumn(5).setPreferredWidth(50);
         columnModel.getColumn(6).setPreferredWidth(1);
         
         
         DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        jt.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(5).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(6).setCellRenderer( centerRenderer );
        
        jt.getTableHeader().setFont(new Font("Cooper Black", 1, 14));
        jt.getTableHeader().setBackground(new Color(209,37,29));
        jt.getTableHeader().setForeground(Color.white);
        jt.getTableHeader().setPreferredSize(new Dimension(100, 50));
    return validacion.get();
   }
   
    public void updateRepuesto(int id,String nombre,String referencia,String descripcion,String img, TBLModeloVo modelo){
    impl.update(TBLRepuestoVo
                           .builder()
                           .idRepuesto(id)
                           .nombre(nombre)
                           .referencia(referencia)
                           .descripcion(descripcion)                       
                           .pathImagen(img)
                           .idmodelo(modelo)
                           .build());
    }
     public void deleteRepuesto(String text) {
        impl.delete(Integer.parseInt(text));
    }
     public List<TBLModeloVo> ltsModelos(int id_marca){
      return modelo.allModelo(id_marca);
     }
     
    
   
}
