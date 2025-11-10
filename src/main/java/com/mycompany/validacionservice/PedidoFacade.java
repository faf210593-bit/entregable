/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.validacionservice;

/**
 *
 * @author Usuario
 */
public class PedidoFacade {
private ValidacionService validacion;
    private CalculoService calculo;
    private PedidoRepository repository;  // Nuevo: usa Repository 
    private RegistroService registro;
    private ComprobanteService comprobante;
    private FacturaService facturaService;  // Usará el Adapter
    private ImpuestoStrategy impuestoStrategy;  // Nuevo: estrategia seleccionable
    
public PedidoFacade() {
        this.validacion = new ValidacionService();
        this.calculo = new CalculoService();
        this.repository = new PedidoRepository();  // Instancia Repository
        this.registro = new RegistroService();
        this.comprobante = new ComprobanteService();
        this.facturaService = new FacturaAdapter();  // Inyecta el Adapter
        this.impuestoStrategy = new IGV18Strategy();  // Por defecto: IGV 18%
}
public void setImpuestoStrategy(ImpuestoStrategy strategy) {
        this.impuestoStrategy = strategy;
}

 public void procesarPedido(String nombre, String producto, int cantidad) {
        // 1. Validar
        if (!validacion.validar(cantidad)) {
            System.out.println("Error: Cantidad inválida o sin stock.");
            return;
        
double subtotal = calculo.calcularSubtotal(cantidad);
        double igv = calculo.calcularIGV(subtotal);
        double total = calculo.calcularTotal(subtotal, igv);
Pedido pedido = new Pedido(nombre, producto, cantidad, subtotal, igv, total);
        repository.guardar(pedido);
        facturaService.generarFactura(nombre, producto, cantidad, total);
        comprobante.generarComprobante(nombre, producto, cantidad, subtotal, igv, total);
    }
}
}