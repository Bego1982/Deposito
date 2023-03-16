/*
 * Proyecto Depósito
 * and open the template in the editor.
 */
package cuentas;

public class CCuenta {

    /**
     * @author Begoña Campocosio Gonzalez
     */
    /**
     * Declaración de los atributos de la clase CCuenta De tipo privado Los de
     * tipo cadena almacenan el nombre y cuenta Los de tipo double almacenan el
     * saldo y el tipo de interés
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor vacío de la clase CCuenta.
     */
    public CCuenta() {
    }

    /**
     * Constructor con todos los parámetros de la clase CCuenta
     *
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */

    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Método setter asignarNombre, en el cual se establece un nombre y
     * se almacena en el parámetro nom. No devuelve ningún valor.
     *
     * @param nom 
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    /**
     * Método getter obtenerNombre devuelve una cadena
     *
     * @return String con el nombre
     */
    public String obtenerNombre() {
        return getNombre();
    }

    /**
     * Método getter estado devuelve un valor de tipo double
     *
     * @return double con el saldo
     */

    public double estado() {
        return getSaldo();
    }

    /**
     * Método de tipo público ingresar, el cual establece que si la cantidad es
     * menor que 0 saltará la excepción de que no se puede ingresar una cantidad
     * negativa Este método es llamado desde el método operativa_cuenta de la
     * clase Main No devuelve ningún valor
     *
     * @param cantidad valor que se va a ingresar
     * @throws Exception mensaje de error
     */

    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método de tipo público retirar, el cual establece que si la cantidad es
     * menor que 0 saltará la excepción de que no se puede retirar una cantidad
     * negativa El segundo condicional llama al método estado, en el cual se
     * establece el saldo, por lo que si el saldo es menor que la cantidad que
     * se quiere retirar, saltará la excepción de que no hay suficiente saldo
     * Si no ocurren ninguna de las dos condiciones, establece el nuevo saldo
     * con el método getSaldo y restando la cantidad retirada.
     *
     * @param cantidad valor que se va a retirar
     * @throws Exception mensaje de error
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }
/**
 * Método de tipo público ObtenerCuenta, devuelve el número de cuenta
 * @return un String con el número de cuenta
 */
    public String obtenerCuenta() {
        return getCuenta();
    }
/**
 * Método getter para el nombre 
 * @return String con el nombre
 */
    public String getNombre() {
        return nombre;
    }
/**
 * Método setter para establecer el nombre, no devuelve nada
 * @param nombre donde se almacena el valor
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * Método getter para el tipo de interés
 * @return double con el tipo de interés
 */
    public double getTipoInterés() {
        return tipoInterés;
    }
/**
 * Método setter para establecer el tipo de interés, no devuelve nada
 * @param tipoInterés donde se almacena el valor
 */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
/**
 * Método getter para Cuenta
 * @return String con la cuenta
 */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método setter para establecer la cuenta, no devuelve nada
     * @param cuenta donde se almacena el valor
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método getter para Saldo
     * @return double con el saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método setter para establecer el saldo, no devuelve nada
     * @param saldo donde se almacena el valor
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
