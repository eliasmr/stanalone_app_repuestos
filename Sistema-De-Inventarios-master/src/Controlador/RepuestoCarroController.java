
package Controlador;

import Modelo.TBLModeloVo;
import Modelo.TBLRepuestoVo;
import Modelo.impl.TBLModeloImpl;
import Modelo.impl.TBLRepuestoImpl;
import Vista.FrmCrearModeloCarrro;
import Vista.FrmCrearRepuestoCarro;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
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
    
    public void loadData(JTable jt, String params){
     DefaultTableModel repuestoT = new DefaultTableModel();
     List<TBLRepuestoVo> ltsTem = new ArrayList<>();
     String param = params.toUpperCase();
     if(params.isEmpty()){
         ltsRepuesto = principaCtr.getAllRepuesto();
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
