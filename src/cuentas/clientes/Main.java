package cuentas.clientes;

public class Main {

    public static void main(String[] args) {
        operativa_cuenta(1);
    }

    private static void operativa_cuenta(float cantidad) {
        Cuenta cuenta1;
        double saldoActual;

        cuenta1 = new Cuenta("Rafael Nadal Parera","1000-2365-85-1230456789",2500,0);
        System.out.println("Esta es la cuenta de Rafael Nadal Parera");
        System.out.println("El saldo actual es:"+ cuenta1.estado() );

        try {
            cuenta1.retirar(3000);
            System.out.println("El saldo actual es:"+ cuenta1.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(-200);
            System.out.println("El saldo actual es:"+ cuenta1.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
