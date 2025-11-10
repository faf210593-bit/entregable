/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.validacionservice;

/**
 *
 * @author Usuario
 */
public class PedidoRepository {

class PedidoRepository {
    private List<Pedido> pedidos = new ArrayList<>();
    public void guardar(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido guardado en repositorio: " + pedido);
    }
    public List<Pedido> obtenerTodos() {
        return pedidos;
    }
    // Método opcional para buscar por nombre (simple)
    public Pedido obtenerPorNombre(String nombre) {
        for (Pedido p : pedidos) {
            if (p.getNombre().equals(nombre)) {
                return p;
            }
        }
        return null;
    }    

}
}