package ejercicioanalisis003;

public class CuentaCorriente extends CuentaBancaria {
    private double porcentajeCobrado; // fee percentage applied on withdrawal, e.g., 1.5 means 1.5%
    private Transaccion[] transacciones;
    private int numeroTransacciones;

    public CuentaCorriente(String numeroCuenta, double saldoInicial, Titular primerTitular, double porcentajeCobrado) {
        super(numeroCuenta, saldoInicial, primerTitular);
        this.porcentajeCobrado = porcentajeCobrado;
        this.transacciones = new Transaccion[100]; // arbitrary cap
        this.numeroTransacciones = 0;
    }

    public double getPorcentajeCobrado() {
        return porcentajeCobrado;
    }

    public void setPorcentajeCobrado(double porcentajeCobrado) {
        this.porcentajeCobrado = porcentajeCobrado;
    }

    public boolean registrarTransaccion(Transaccion nuevaTransaccion) {
        if (nuevaTransaccion == null) return false;
        if (numeroTransacciones >= transacciones.length) return false;
        transacciones[numeroTransacciones++] = nuevaTransaccion;
        return true;
    }

    @Override
    public boolean retirarDinero(double cantidad) {
        if (cantidad <= 0) return false;
        double comision = cantidad * (porcentajeCobrado / 100.0);
        double total = cantidad + comision;
        if (total > saldo) return false;
        saldo -= total;
        // record transaction as withdrawal with negative importe
        registrarTransaccion(new Transaccion(1,1,2020,"Retiro", -cantidad));
        return true;
    }

    @Override
    public boolean ingresarDinero(double cantidad) {
        boolean ok = super.ingresarDinero(cantidad);
        if (ok) {
            registrarTransaccion(new Transaccion(1,1,2020,"Ingreso", cantidad));
        }
        return ok;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CuentaCorriente{numeroCuenta='").append(numeroCuenta).append("', saldo=").append(saldo)
                .append(", porcentajeCobrado=").append(porcentajeCobrado).append(", titulares=")
                .append(java.util.Arrays.toString(titulares)).append(", transacciones=[");
        for (int i = 0; i < numeroTransacciones; i++) {
            if (i > 0) sb.append(", ");
            sb.append(transacciones[i].toString());
        }
        sb.append("]}");
        return sb.toString();
    }
}
