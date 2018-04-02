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
public class Registroventasycompras {
   private String tipoMovimiento; 
    private String cliente;
    private String proveedor;
    private boolean alPorMayor;
    private ArrayList <Producto> productos;

    public Registroventasycompras(String tipoMovimiento, String cliente, String proveedor, boolean alPorMayor, ArrayList<Producto> productos) {
        this.tipoMovimiento = tipoMovimiento;
        this.cliente = cliente;
        this.proveedor = proveedor;
        this.alPorMayor = alPorMayor;
        this.productos = new ArrayList<Producto>();
    }
    
    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public boolean isAlPorMayor() {
        return alPorMayor;
    }

    public void setAlPorMayor(boolean alPorMayor) {
        this.alPorMayor = alPorMayor;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    
    
    
    
    
}
