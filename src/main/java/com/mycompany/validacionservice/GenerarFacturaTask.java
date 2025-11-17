/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.validacionservice;

/**
 *
 * @author Usuario
 */
public class GenerarFacturaTask {
private FacturaService facturaService;
    private ComprobanteService comprobante;
    private String nombre, producto;
    private int cantidad;
    private double total;
    public GenerarFacturaTask(FacturaService facturaService, ComprobanteService comprobante, String nombre, String producto, int cantidad, double total) {
        this.facturaService = facturaService;
        this.comprobante = comprobante;
        this.nombre = nombre;
        this.producto = producto;
        this.cantidad = cantidad;
        this.total = total;
    }
    
    public void run() {
        System.out.println("[Hilo " + Thread.currentThread().getId() + "] Iniciando generación de factura para " + nombre);
        facturaService.generarFactura(nombre, producto, cantidad, total);
        comprobante.generarComprobante(nombre, producto, cantidad, total * 0.826, total * 0.174, total);  // Simula cálculo inverso
        System.out.println("[Hilo " + Thread.currentThread().getId() + "] Factura y comprobante generados para " + nombre);
    }    
}
