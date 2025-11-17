/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.validacionservice;

/**
 *
 * @author Usuario
 */
public class ProcesarPedidoTask {
private PedidoFacade facade;
    private String nombre, producto;
    private int cantidad;
    public ProcesarPedidoTask(PedidoFacade facade, String nombre, String producto, int cantidad) {
        this.facade = facade;
        this.nombre = nombre;
        this.producto = producto;
        this.cantidad = cantidad;
    }
    
    public void run() {
        System.out.println("[Hilo " + Thread.currentThread().getId() + "] Iniciando procesamiento de pedido para " + nombre);
       
        facade.procesarPedido(nombre, producto, cantidad);
        System.out.println("[Hilo " + Thread.currentThread().getId() + "] Procesamiento completado para " + nombre);
    }    
}
