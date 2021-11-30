
package Controlador;

import Modelo.TBLMarcaVo;
import Modelo.TBLModeloVo;
import Modelo.TBLTipoCombustibleVo;
import Modelo.impl.TBLCombustibleImpl;
import Modelo.impl.TBLMarcaImpl;
import Modelo.impl.TBLModeloImpl;
import Vista.FrmCrearModeloCarrro;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author Elias
 */
public class ModeloCarroController{

    private final TBLModeloImpl impl;
    private TBLModeloVo model;
    private FrmCrearModeloCarrro frm;
    private final TBLCombustibleImpl combustible;
    private final TBLMarcaImpl marca;
    private final PrincipalController principaCtr;
    private  List<TBLModeloVo> ltsModelo;
    
    public ModeloCarroController(){
      this.impl = new TBLModeloImpl();
      this.combustible = new TBLCombustibleImpl();
      this.marca = new TBLMarcaImpl();
      this.principaCtr = new PrincipalController();
      this.ltsModelo = new ArrayList<>();
    }

    
    

    public void save(String nombre,String ano,String cilindraje,TBLTipoCombustibleVo tipoCombustible,String descripcion,String img, TBLMarcaVo marca) {      
        impl.insertaModelo(TBLModeloVo
                           .builder()
                           .nombre(nombre)
                           .anio(ano)
                           .cilindraje(cilindraje)
                           .tipoCombustible(tipoCombustible)
                           .descripcion(descripcion)
                           .pathImagen(img)
                           .idMarca(marca)
                           .build());
    }
   
 

    
    public void loadData(JTable jt,int id, String params){
     DefaultTableModel modeloT = new DefaultTableModel();
     List<TBLModeloVo> ltsTem = new ArrayList<>();
     String param = params.toUpperCase();
     if(params.isEmpty()){
         ltsModelo = principaCtr.listaModelo(id);
         ltsTem = ltsModelo;
     } else{
       ltsTem =  ltsModelo.stream().filter(registro -> 
                                             registro.getNombre().toUpperCase().contains(param)||
                                             registro.getCilindraje().contains(param) ||
                                             registro.getAnio().contains(param) ||
                                             registro.getDescripcion().toUpperCase().contains(param) ||
                                             registro.getIdMarca().getNombre().toUpperCase().contains(param) ||
                                             registro.getTipoCombustible().getNombre().toUpperCase().contains(param)
                                             ).collect(Collectors.toList());
     }
    jt.setModel(modeloT);
    modeloT.addColumn("#");
    modeloT.addColumn("Nombre");
    modeloT.addColumn("Descripcion");
    modeloT.addColumn("Imagen");
    modeloT.addColumn("Tipo Combustible");
    modeloT.addColumn("Cilindraje");
    modeloT.addColumn("Año Modelo");
    modeloT.addColumn("Marca");
    modeloT.addColumn("Codigo");

    
    Object[] columna = new Object [9];
    AtomicReference<Integer> counter = new AtomicReference<>(1);
    ltsTem.stream().forEach(obj ->{
      columna[0] = counter.get();
      columna[1] = obj.getNombre();
      columna[2] = obj.getDescripcion();
      columna[3] = obj.getPathImagen();
      columna[4] = obj.getTipoCombustible().getNombre();
      columna[5] = obj.getCilindraje();
      columna[6] = obj.getAnio();
      columna[7] = obj.getIdMarca().getNombre();
      columna[8] =obj.getId();
      counter.getAndUpdate(value -> value + 1);
      modeloT.addRow(columna);
    });
   }
    

    public void updateModel(int id,String nombre,String ano,String cilindraje,TBLTipoCombustibleVo tipoCombustible,String descripcion,String img, TBLMarcaVo marca){
    impl.update(TBLModeloVo
                           .builder()
                           .id(id)
                           .nombre(nombre)
                           .anio(ano)
                           .cilindraje(cilindraje)
                           .tipoCombustible(tipoCombustible)
                           .descripcion(descripcion)
                           .pathImagen(img)
                           .idMarca(marca)
                           .build());
    }
     public void deleteModelo(String text) {
        impl.delete(Integer.parseInt(text));
    }
     public List<TBLTipoCombustibleVo> ltsTipoCombustible(){
      return combustible.getAllTipoCpmbustible();
     }
     
      public List<TBLMarcaVo> ltsMarca(){
      return marca.getMarcaAll();
     }
 
    public int mes(String mes){
     int mesT = 0;
    switch(mes){
        case "enero": mesT =1; break;
        case "febrero": mesT =2; break;
        case "marzo": mesT =3; break;
        case "abril": mesT =4; break;
        case "mayo": mesT =5; break;
        case "junio": mesT =6; break;
        case "julio": mesT =7; break;
        case "agosto": mesT =8; break;
        case "septiembre": mesT =9; break;
        case "octubre": mesT =10; break;
        case "noviembre": mesT =11; break;
        case "diciembre": mesT =12; break;
    }
    return mesT-1;
    }
   public String mesStr(int mes){
     String mesT = "";
    switch(mes){
        case 1:  mesT ="Enero"; break;
        case 2: mesT = "Febrero"; break;
        case 3: mesT ="Marzo"; break;
        case 4: mesT ="Abril"; break;
        case 5: mesT ="Mayo"; break;
        case 6: mesT ="Junio"; break;
        case 7: mesT ="Julio"; break;
        case 8: mesT ="Agosto"; break;
        case 9: mesT ="Septiembre"; break;
        case 10: mesT ="Octubre"; break;
        case 11: mesT ="Noviembre"; break;
        case 12: mesT ="Diciembre"; break;
    }
    return mesT;
    }
}
