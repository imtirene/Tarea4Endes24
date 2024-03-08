/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package EntidadFinanciera;


public class CCuenta {

    /**
     * Nombre de la persona titular
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

   // Atributo constante para el mensaje de error
    private static final String ERROR_CANTIDAD_NEGATIVA = "No se puede ingresar una cantidad negativa";

   
    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
        public double obtenerSaldo() {
        return saldo;
    }

    public void establecerSaldo(double nuevoSaldo) {
        saldo = nuevoSaldo;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    public String obtenerCuenta() {
        return cuenta;
    }

    public void establecerCuenta(String nuevaCuenta) {
        cuenta = nuevaCuenta;
    }

    public double obtenerTipoInteres() {
        return tipoInterés;
    }

    public void establecerTipoInteres(double nuevoTipoInteres) {
        tipoInterés = nuevoTipoInteres;
    }

    
    
    
    
    
    
    public double estado(){
        return this.saldo;
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (saldo < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}


    
   