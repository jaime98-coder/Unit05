package ejercicioanalisis003;

public abstract class CuentaBancaria {
    protected String numeroCuenta;
    protected double saldo;
    protected Titular[] titulares;
    protected int numeroTitulares;

    public CuentaBancaria(String numeroCuenta, double saldoInicial, Titular primerTitular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.titulares = new Titular[3];
        if (primerTitular != null) {
            this.titulares[0] = primerTitular;
            this.numeroTitulares = 1;
        } else {
            this.numeroTitulares = 0;
        }
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Titular[] getTitulares() {
        return titulares;
    }

    public int getNumeroTitulares() {
        return numeroTitulares;
    }

    public boolean ingresarDinero(double cantidad) {
        if (cantidad <= 0) return false;
        saldo += cantidad;
        return true;
    }

    public boolean retirarDinero(double cantidad) {
        if (cantidad <= 0) return false;
        if (cantidad > saldo) return false;
        saldo -= cantidad;
        return true;
    }

    public boolean anadirTitular(Titular nuevoTitular) {
        if (nuevoTitular == null) return false;
        if (numeroTitulares >= titulares.length) return false;
        // avoid duplicate dni
        for (int i = 0; i < numeroTitulares; i++) {
            if (titulares[i] != null && titulares[i].getDni().equalsIgnoreCase(nuevoTitular.getDni())) {
                return false;
            }
        }
        titulares[numeroTitulares++] = nuevoTitular;
        return true;
    }

    public boolean borrarTitular(String dniABorrar) {
        if (dniABorrar == null) return false;
        for (int i = 0; i < numeroTitulares; i++) {
            if (titulares[i] != null && titulares[i].getDni().equalsIgnoreCase(dniABorrar)) {
                // shift left
                for (int j = i; j < numeroTitulares - 1; j++) {
                    titulares[j] = titulares[j + 1];
                }
                titulares[numeroTitulares - 1] = null;
                numeroTitulares--;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CuentaBancaria{numeroCuenta='").append(numeroCuenta).append("', saldo=").append(saldo).append(", titulares=[");
        for (int i = 0; i < numeroTitulares; i++) {
            if (i > 0) sb.append(", ");
            sb.append(titulares[i].toString());
        }
        sb.append("]}");
        return sb.toString();
    }
}
