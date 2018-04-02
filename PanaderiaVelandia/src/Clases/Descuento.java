/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Sebastian
 */
public class Descuento {
    private Fecha fechafinal;
    private double cantidad;

    public Descuento(Fecha fechafinal, double cantidad) {
        this.fechafinal = fechafinal;
        this.cantidad = cantidad;
    }

    public Fecha getFechafinal() {
        return fechafinal;
    }

    public void setFechafinal(Fecha fechafinal) {
        this.fechafinal = fechafinal;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }



}
