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
public class Abarrote extends Producto {
    
//Atributos
   
  String tpclasificacion;
  
//Constructores
  
  public Abarrote(String categoria, String codigo, String descripcion, int precio,String tpclasificacion) {
        super(categoria, codigo, descripcion, precio);
        this.tpclasificacion = tpclasificacion;
    }
  
//Métodos

    public String getTpclasificacion() {
        return tpclasificacion;
    }

    public void setTpclasificacion(String tpclasificacion) {
        this.tpclasificacion = tpclasificacion;
    }

//To String
    
    @Override
    public String toString() {
        return super.toString() + "/" + tpclasificacion;
    }
   
    
}
