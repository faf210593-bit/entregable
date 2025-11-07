/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.validacionservice;

/**
 *
 * @author Usuario
 */
public class Main {
public class Main {
    public static void main(String[] args) {
        PedidoFacade facade = new PedidoFacade();
        // Simula un pedido del cliente
        String nombre = "Juan Perez";
        String producto = "Laptop";
        int cantidad = 2;
        // Llama al Facade: todo se coordina aquí
        facade.procesarPedido(nombre, producto, cantidad);
        // Prueba con cantidad inválida
        facade.procesarPedido("Ana Gomez", "Mouse", -1);
    }
}    
}
