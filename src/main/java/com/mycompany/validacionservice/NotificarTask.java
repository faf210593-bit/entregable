/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.validacionservice;

/**
 *
 * @author Usuario
 */
public class NotificarTask {
private PedidoSubject subject;
    private Pedido pedido;
    public NotificarTask(PedidoSubject subject, Pedido pedido) {
        this.subject = subject;
        this.pedido = pedido;
    }
    
    public void run() {
        System.out.println("[Hilo " + Thread.currentThread().getId() + "] Iniciando notificaciones para " + pedido.getNombre());
        subject.notifyObservers(pedido);
        System.out.println("[Hilo " + Thread.currentThread().getId() + "] Notificaciones completadas para " + pedido.getNombre());
    }    
}
