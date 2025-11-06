/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class CalculoService {
private static final double IGV = 0.18; // 18%
    private static final double PRECIO_UNITARIO = 10.0; // Precio fijo por simplicidad
    public double calcularSubtotal(int cantidad) {
        return cantidad * PRECIO_UNITARIO;
    }
    public double calcularIGV(double subtotal) {
        return subtotal * IGV;
    }
    public double calcularTotal(double subtotal, double igv) {
        return subtotal + igv;
    }    
}
