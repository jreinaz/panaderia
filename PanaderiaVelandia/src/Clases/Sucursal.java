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
public class Sucursal {
    private double ganancia;
    private ArrayList <Proveedor> proveedores;
    private int horainicio;
    private int horafin;
    private ArrayList <Registroventasycompras>registro;

    public Sucursal(double ganancia, ArrayList<Proveedor> proveedores, int horainicio, int horafin) {
        this.ganancia = ganancia;
        this.proveedores = proveedores;
        this.horainicio = horainicio;
        this.horafin = horafin;
        this.registro = new ArrayList<>();
    
    }
    
    public void addRegistro(String tipomovimiento, String cliente, String proveedor, boolean Alpormayor){
        
    }  

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    public ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(ArrayList<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    public void setHorainicio(int horainicio) {
        this.horainicio = horainicio;
    }

    public void setHorafin(int horafin) {
        this.horafin = horafin;
    }

    public void setRegistro(ArrayList<Registroventasycompras> registro) {
        this.registro = registro;
    }
    
    
}
