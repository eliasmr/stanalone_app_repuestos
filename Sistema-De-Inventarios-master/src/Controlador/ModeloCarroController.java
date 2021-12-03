
package Controlador;

import Modelo.TBLMarcaVo;
import Modelo.TBLModeloVo;
import Modelo.TBLTipoCombustibleVo;
import Modelo.impl.DropBoxImpl;
import Modelo.impl.TBLCombustibleImpl;
import Modelo.impl.TBLMarcaImpl;
import Modelo.impl.TBLModeloImpl;
import Vista.FrmCrearModeloCarrro;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

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
    private DropBoxImpl dropBoxImpl;
    
    public ModeloCarroController(){
      this.impl = new TBLModeloImpl();
      this.combustible = new TBLCombustibleImpl();
      this.marca = new TBLMarcaImpl();
      this.principaCtr = new PrincipalController();
      this.ltsModelo = new ArrayList<>();
      this.dropBoxImpl = new DropBoxImpl();
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
     jt.setDefaultRenderer(Object.class, new ButtonRender());
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
     JButton btn = new JButton();
     btn.setName("id_visualizar");
     Image mImagen = new ImageIcon(dropBoxImpl.getFileDrobox("/AutopartesLeon/recusos_app/visualizar.png")).getImage();
     ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(20, 20, Image.SCALE_SMOOTH));
     btn.setIcon(mIcono);
    btn.setOpaque(true);
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
    modeloT.addColumn("ver");

    
    Object[] columna = new Object [10];
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
      columna[9] =btn;
      counter.getAndUpdate(value -> value + 1);
      modeloT.addRow(columna);
    });
    
        TableColumnModel columnModel = jt.getColumnModel();
        
        columnModel.getColumn(0).setMaxWidth(30);
        columnModel.getColumn(1).setPreferredWidth(100);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setPreferredWidth(200);
         columnModel.getColumn(4).setPreferredWidth(100);
         columnModel.getColumn(5).setPreferredWidth(50);
         columnModel.getColumn(6).setPreferredWidth(50);
         columnModel.getColumn(7).setPreferredWidth(30);
         columnModel.getColumn(8).setPreferredWidth(1);
          columnModel.getColumn(9).setPreferredWidth(1);
         
         
         DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        jt.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(5).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(6).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(7).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(8).setCellRenderer( centerRenderer );
        
        jt.getTableHeader().setFont(new Font("Cooper Black", 1, 14));
        jt.getTableHeader().setBackground(new Color(209,37,29));
        jt.getTableHeader().setForeground(Color.white);
        jt.getTableHeader().setPreferredSize(new Dimension(100, 50));
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
     public boolean deleteModelo(String text) {
        return impl.delete(Integer.parseInt(text));
    }
     public List<TBLTipoCombustibleVo> ltsTipoCombustible(){
      return combustible.getAllTipoCpmbustible();
     }
     
      public List<TBLMarcaVo> ltsMarca(){
      return marca.getMarcaAll();
     }
 
}
