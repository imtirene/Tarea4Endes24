/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;

import entidadFinanciera.CCuenta;


public class Main {

    public static void main(String[] args) {
        CCuenta objectoCuenta;
        double saldoActual;
        

        objectoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objectoCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
    
    }
}
