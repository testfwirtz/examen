/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package cuentas;

/**
 *
 * @author maximiliano.adrian.r
 */
public class Main {

    public static void main(String[] args) {
        operativa_cuenta(null);
    }

    public static void operativa_cuenta(java.lang.Float cuenta) {
        operativa_cuenta(null);
    }

    public static void operativa_cuenta2(Float cantidad) {
        CCuenta miCuenta;
        double saldoActual;
        miCuenta = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual TEST" + saldoActual);
        try {
            miCuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
