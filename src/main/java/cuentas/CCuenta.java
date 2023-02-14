package cuentas;

/**
 * Clase CCuenta para el programa 'Deposito_ED04'.
 * Tarea 4 de Entornos de Desarrollo.
 * 
 * @author majuanmartinez
 * @since 2023 February 14th
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor sin parámetros.
     */
    public CCuenta()
    {
    }

    /**
     * Constructor de clase con los siguientes parámetros:
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     *
     * @param cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     *
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     *
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     *
     * @return tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     *
     * @param tipoInterés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     *
     * @return getSaldo()
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     *
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     *
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
