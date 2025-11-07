/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.validacionservice;

interface FacturaService {
    void generarFactura(String nombre, String producto, int cantidad, double total);
}
public class FacturaAdapter {
private LegacyBillingSystem legacySystem;
    public FacturaAdapter() {
        this.legacySystem = new LegacyBillingSystem();
    }
    
    public void generarFactura(String nombre, String producto, int cantidad, double total) {
        // Adapta: convierte los parámetros en un String que LegacyBillingSystem entienda
        String data = nombre + " - " + producto + " x" + cantidad + " Total: " + total;
        legacySystem.generateBill(data);  // Llama al método antiguo
    }    
}
