/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package EntidadFinanciera;

import EntidadFinanciera.CCuenta;


public class Main {

    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;
        

        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
        
       try {
            probarIngresar(objetoCuenta, -100,2500); // Intenta ingresar una cantidad negativa
        } catch (Exception e) {
            System.out.println("Error al intentar ingresar una cantidad negativa: " + e.getMessage());
        }

        try {
            probarRetirar(objetoCuenta, 3000,2500); // Intenta retirar más dinero del disponible
        } catch (Exception e) {
            System.out.println("Error al intentar retirar una cantidad mayor al saldo disponible: " + e.getMessage());
        }
    }

    private static void probarIngresar(CCuenta cuenta,double cantidad,double cantidadEsperada) {
        try {
            cuenta.ingresar(cantidad);
            System.out.println("Ingreso exitoso. Nuevo saldo: " + cuenta.estado());
        } catch (Exception e) {
            System.out.println("Error al intentar ingresar: " + e.getMessage());
        }
    }

    private static void probarRetirar(CCuenta cuenta, double cantidad,double cantidadEsperada) {
        try {
            cuenta.retirar(cantidad);
            System.out.println("Retiro exitoso. Nuevo saldo: " + cuenta.estado());
        } catch (Exception e) {
            System.out.println("Error al intentar retirar: " + e.getMessage());
        }
    }
}