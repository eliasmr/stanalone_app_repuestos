
package Controlador;
import Vista.FrmUnidadDeMedida;
import Modelo.UnidadDeMedida;
import Modelo.UnidadDeMedidaSQL;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CtrlUnidadDeMedida implements ActionListener{
    private UnidadDeMedida mod;
    private UnidadDeMedidaSQL modC;
    private FrmUnidadDeMedida frm;
    
    public CtrlUnidadDeMedida(UnidadDeMedida mod, UnidadDeMedidaSQL modC, FrmUnidadDeMedida frm)
    {
        this.mod = mod;
        this.modC = modC;
        this.frm = frm;
        
        this.frm.btnGuardar.addActionListener(this);
        this.frm.btnModificar.addActionListener(this);
        this.frm.btnEliminar.addActionListener(this);
        this.frm.btnLimpiar.addActionListener(this);
        this.frm.btnBuscar.addActionListener(this);
    }
    
    public void Iniciar()
    {
        frm.setTitle("Unidad De Medida");
        frm.setLocationRelativeTo(null);
    }
    
    public void Limpiar()
    {
        frm.txtUnidadDeMedida.setText(null);
        frm.txtDescripcion.setText(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==frm.btnGuardar)
        {
            mod.setUnidadDeMedida(frm.txtUnidadDeMedida.getText());
            mod.setDescripcion(frm.txtDescripcion.getText());
            
            if(modC.Registrar(mod))
            {
                JOptionPane.showMessageDialog(null, "Registro guardado.");
                Limpiar();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error al guardar.");
                Limpiar();
            }
        }
        
        if(e.getSource()==frm.btnModificar)
        {
            mod.setUnidadDeMedida(frm.txtUnidadDeMedida.getText());
            mod.setDescripcion(frm.txtDescripcion.getText());
            
            if(modC.Modificar(mod))
            {
                JOptionPane.showMessageDialog(null, "Registro Modificado.");
                Limpiar();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error al modificar.");
                Limpiar();
            }
        }
        
        if(e.getSource()==frm.btnEliminar)
        {
            mod.setUnidadDeMedida(frm.txtUnidadDeMedida.getText());
            
            if(modC.Eliminar(mod))
            {
                JOptionPane.showMessageDialog(null, "Registro eliminado.");
                Limpiar();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error al eliminar.");
                Limpiar();
            }
        }
        
        if(e.getSource()==frm.btnBuscar)
        {
            mod.setUnidadDeMedida(frm.txtUnidadDeMedida.getText());
            
            if(modC.Buscar(mod))
            {
                frm.txtUnidadDeMedida.setText(mod.getUnidadDeMedida());
                frm.txtDescripcion.setText(mod.getDescripcion());
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error al bucar.");
                Limpiar();
            }
        }
        
         if(e.getSource()==frm.btnLimpiar)
        {
  
            Limpiar();
        }
    }
}
