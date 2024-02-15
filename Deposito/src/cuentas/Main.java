package cuentas;

/**
 * Clase principal que contiene el método main para probar la clase CCuenta.
 * @author Ana Carnero
 * @version 1.0
 * @since 2024-02-14
 */
public class Main {

    /**
     * Método principal que crea una instancia de CCuenta y llama al método operativa_cuenta para realizar operaciones en la cuenta.
     * @param args Argumentos de la línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {
        CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        operativa_cuenta(cuenta1, 695);
    }

    /**
     * Método que realiza operaciones en una cuenta, como consultar saldo, retirar dinero e ingresar dinero.
     * @param cuenta1 Objeto CCuenta en el que se realizarán las operaciones.
     * @param cantidad Cantidad a ingresar en la cuenta.
     */
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        double saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.println("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            System.out.println("Fallo al ingresar");
        }
    }
}


