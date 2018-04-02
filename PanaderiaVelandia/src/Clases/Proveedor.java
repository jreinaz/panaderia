/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.util.ArrayList;
/**
 *
 * @author Sebastian
 */
public class Proveedor {
    private String name;
    private ArrayList<Producto> productos;

    public Proveedor(String name, ArrayList<Producto> productos) {
        this.name = name;
        this.productos = productos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    
    
    
}
