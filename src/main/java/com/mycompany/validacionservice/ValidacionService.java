/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.validacionservice;

/**
 *
 * @author Usuario
 */
public class ValidacionService {
public boolean validar(int cantidad) {
        // Simula stock fijo (ej. 100 unidades)
        int stockDisponible = 100;
        return cantidad > 0 && cantidad <= stockDisponible;
    }
   
}
