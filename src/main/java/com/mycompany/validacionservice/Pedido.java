/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.validacionservice;

/**
 *
 * @author Usuario
 */
public class Pedido {
private String nombre;
    private String producto;
    private int cantidad;
    private double subtotal;
    private double igv;
    private double total;
    public Pedido(String nombre, String producto, int cantidad, double subtotal, double igv, double total) {
        this.nombre = nombre;
        this.producto = producto;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.igv = igv;
        this.total = total;
    }
    
    public String getNombre() { return nombre; }
    public String getProducto() { return producto; }
    public int getCantidad() { return cantidad; }
    public double getSubtotal() { return subtotal; }
    public double getIgv() { return igv; }
    public double getTotal() { return total; }   
    
@Override
public String toString() {
        return "Pedido{" + nombre + ", " + producto + ", " + cantidad + ", " + subtotal + ", " + igv + ", " + total + "}";
    }
}

