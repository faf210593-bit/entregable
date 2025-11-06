/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class ComprobanteService {
 public void generarComprobante(String nombre, String producto, int cantidad, double subtotal, double igv, double total) {
        System.out.println("=== COMPROBANTE ===");
        System.out.println("Cliente: " + nombre);
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("IGV (18%): " + igv);
        System.out.println("Total: " + total);
        System.out.println("===================");
    }    
}
