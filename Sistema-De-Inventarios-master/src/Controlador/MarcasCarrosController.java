/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Consultaproducto;
import Modelo.impl.TBLMarcaImpl;
import Modelo.producto;
import Vista.FrmCrearMarcaCarro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Julito
 */
public class MarcasCarrosController implements ActionListener {
    
    private producto mod;
    private Consultaproducto modC;
    
    
    private FrmCrearMarcaCarro frm;
    private TBLMarcaImpl impl;
    public MarcasCarrosController ()
    {
        this.impl = new TBLMarcaImpl();
        this.frm = new FrmCrearMarcaCarro();
        this.frm.btnGuardar.addActionListener(this);
        this.frm.btnModificar.addActionListener(this);
        this.frm.btnEliminar.addActionListener(this);
        this.frm.btnBuscar.addActionListener(this);
        this.frm.btnLimpiar.addActionListener(this);
              
    }
    
    public void iniciar ()
    {
     frm.setTitle("Producto");
     frm.setLocale(null);
     }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
       if (e.getSource()== frm.btnGuardar) 
       {
           mod.setIdproducto(frm.txtIdProducto.getText());
           mod.setNombre(frm.txtNombre.getText());
           mod.setPrecio(Double.parseDouble(frm.txtPrecio.getText()));
           //mod.setUnidadDeMedida(frm.txtUnidaddeMedida.getText());
           
           if (modC.Registrar(mod))
           {
               JOptionPane.showMessageDialog(null, "Dato Guardado");
               Limpiar ();
           } else {
               JOptionPane.showMessageDialog(null, "No se pudo Guardar");
               Limpiar ();
           }
               
           
    }       
    }   
    public void Limpiar ()
    {
        frm.txtIdProducto.setText(null);
        frm.txtNombre.setText(null);
        frm.txtPrecio.setText(null);
        //frm.txtUnidaddeMedida.setText(null);
    }
}