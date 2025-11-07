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
    private RegistroService registro;
    private ComprobanteService comprobante;
    private FacturaService facturaService;  // Usará el Adapter
   public PedidoFacade() {
        this.validacion = new ValidacionService();
        this.calculo = new CalculoService();
        this.registro = new RegistroService();
        this.comprobante = new ComprobanteService();
        this.facturaService = new FacturaAdapter();  // Inyecta el Adapter  
}
}
