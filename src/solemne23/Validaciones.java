/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solemne23;

/**
 *
 * @author dekum
 */
public class Validaciones {
    
 
    public boolean validarCodigo(String codigo) {

        
        if(codigo != "" && codigo.length()== 4 && codigo.matches("[0-9]*")){
            return (true);
        }else{
        //JOptionPane.showMessageDialog(null, "Ingrese código validoooooooo");
        return (false);    
        }
    }
    
    public boolean validarPrecio(int cash) {
         
        if(0>=cash){
        //JOptionPane.showMessageDialog(null, "Ingrese Monto");
        return (false);
        }else{
        return (true);    
        }
    }
     
    public boolean validarDescripcion(String descripcion) {
         
        if(descripcion.equals("")){
        //JOptionPane.showMessageDialog(null, "Ingrese Monto");
        return (false);
        }else{
        return (true);    
        }
    }
      
    public boolean validarAtributoAb(String clasificacion) {
         
        if(clasificacion.equals("")){
        //JOptionPane.showMessageDialog(null, "Ingrese Monto");
        return (false);
        }else{
        return (true);    
        }
    }  
    
    public boolean validarAtributoLiq(int tamanoml) {
         
        if(0==tamanoml){
        //JOptionPane.showMessageDialog(null, "Ingrese Monto");
        return (false);
        }else{
        return (true);    
        }
    }
     
    public boolean validarAtributoAs(String aroma) {
         
        if(aroma.equals("")){
        //JOptionPane.showMessageDialog(null, "Ingrese Monto");
        return (false);
        }else{
        return (true);    
        }
    }
    
    public boolean validarAtributoCo(String carne) {
         
        if(carne.equals("")){
        //JOptionPane.showMessageDialog(null, "Ingrese Monto");
        return (false);
        }else{
        return (true);    
        }
    }
    
    public boolean validarAtributoOf(int newPrecio) {
         
        if(0==newPrecio){
        //JOptionPane.showMessageDialog(null, "Ingrese Monto");
        return (false);
        }else{
        return (true);    
        }
    }
    
    public boolean validarComentario(String comentario){
     
        if(comentario.equals("")){
            return (false);
        }else{
            return(true);
        }
    }
}
