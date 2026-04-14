package ejercicioanalisis003;

public class Main {
    public static void main(String[] args) {
        Titular t1 = new Titular("12345678A", "Juan", "Perez", "600111222");
        Titular t2 = new Titular("87654321B", "Ana", "Lopez", "600333444");
        Titular t3 = new Titular("11111111C", "Luis", "Garcia", "600555666");

        System.out.println("-- Creando cuenta de ahorro --");
        CuentaAhorro ahorro = new CuentaAhorro("ES00-0000-0000-0000-0000", 1000.0, t1, 5.0, 2.5);
        System.out.println(ahorro);

        System.out.println("Ingresar 200: " + ahorro.ingresarDinero(200));
        System.out.println("Retirar 50: " + ahorro.retirarDinero(50));
        System.out.println("Cobrar mantenimiento: " + ahorro.cobrarMantenimiento());
        System.out.println("Aplicar interes anual");
        ahorro.aplicarInteresAnual();
        System.out.println(ahorro);

        System.out.println("\n-- Gestion titulares --");
        System.out.println("Añadir t2: " + ahorro.anadirTitular(t2));
        System.out.println("Añadir t3: " + ahorro.anadirTitular(t3));
        System.out.println("Añadir duplicado t1: " + ahorro.anadirTitular(t1));
        System.out.println(ahorro);
        System.out.println("Borrar t2 by dni: " + ahorro.borrarTitular(t2.getDni()));
        System.out.println(ahorro);

        System.out.println("\n-- Cuenta corriente --");
        CuentaCorriente corriente = new CuentaCorriente("ES11-1111-1111-1111-1111", 500.0, t2, 1.0);
        System.out.println(corriente);
        System.out.println("Ingresar 300 en corriente: " + corriente.ingresarDinero(300));
        System.out.println("Retirar 100 en corriente: " + corriente.retirarDinero(100));
        System.out.println(corriente);

        System.out.println("Registrar transaccion manualmente: " + corriente.registrarTransaccion(new Transaccion(12,4,2026,"Pago", -45.5)));
        System.out.println(corriente);
    }
}
