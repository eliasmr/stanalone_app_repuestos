
package Controlador;

import Modelo.TBLModeloVo;
import Modelo.TBLRepuestoVo;
import Modelo.impl.TBLModeloImpl;
import Modelo.impl.TBLRepuestoImpl;
import Vista.FrmCrearModeloCarrro;
import Vista.FrmCrearRepuestoCarro;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elias
 */
public class RepuestoCarroController{

    private TBLRepuestoImpl impl;
    private TBLRepuestoVo repuesto;
    private FrmCrearRepuestoCarro frm;
    private TBLModeloImpl modelo;
    //private TBLMarcaImpl marca;
    
    public RepuestoCarroController(){
        this.modelo = new TBLModeloImpl();
        this.impl = new TBLRepuestoImpl();
     // this.marca = new TBLMarcaImpl();
    }
    public RepuestoCarroController(FrmCrearModeloCarrro frm,TBLModeloImpl impl,TBLModeloVo model){
    /*DropBoxImpl im =  new DropBoxImpl();
   // im.dropbox();
    this.impl = impl;
    this.model = model;
    this.frm = frm;*/
    //this.frm.btnGuardarModelo.addActionListener(this);
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
    
    public void loadData(JTable jt, String param){
     DefaultTableModel repuestoT = new DefaultTableModel();
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
    impl.getAllRepuesto(param).stream().forEach(obj ->{
      
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
     public List<TBLModeloVo> ltsModelos(){
      return modelo.allModelos();
     }
     
    
   
}
