/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

interface Observer {
    void update(Pedido pedido);
}

public class PedidoSubject {
 private List<Observer> observers = new ArrayList<>();
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers(Pedido pedido) {
        for (Observer observer : observers) {
            observer.update(pedido);
        }
    }    
}
class ClienteObserver implements Observer {
    @Override
    public void update(Pedido pedido) {
        System.out.println("[Observer - Cliente] Enviando email a " + pedido.getNombre() + " por pedido de " + pedido.getProducto());
    }
}
class InventarioObserver implements Observer {
    @Override
    public void update(Pedido pedido) {
        System.out.println("[Observer - Inventario] Actualizando stock: restando " + pedido.getCantidad() + " de " + pedido.getProducto());
    }
}