package ejercicioanalisis003;

public class CuentaAhorro extends CuentaBancaria {
    private double cuotaMantenimiento;
    private double interesAnual; // as percentage, e.g., 2.5 means 2.5%

    public CuentaAhorro(String numeroCuenta, double saldoInicial, Titular primerTitular, double cuotaMantenimiento, double interesAnual) {
        super(numeroCuenta, saldoInicial, primerTitular);
        this.cuotaMantenimiento = cuotaMantenimiento;
        this.interesAnual = interesAnual;
    }

    public double getCuotaMantenimiento() {
        return cuotaMantenimiento;
    }

    public void setCuotaMantenimiento(double cuotaMantenimiento) {
        this.cuotaMantenimiento = cuotaMantenimiento;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }

    public void aplicarInteresAnual() {
        if (interesAnual <= 0) return;
        double incremento = saldo * (interesAnual / 100.0);
        saldo += incremento;
    }

    public boolean cobrarMantenimiento() {
        saldo -= cuotaMantenimiento;
        return saldo >= 0;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", cuotaMantenimiento=" + cuotaMantenimiento +
                ", interesAnual=" + interesAnual +
                ", titulares=" + java.util.Arrays.toString(titulares) +
                '}';
    }
}
