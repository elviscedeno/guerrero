
package taller_grupal_4to.sem;

import java.util.Date;

public class Cuenta {
    
    private int id;
    private double saldo;
    private double interes_anual;
    private Date fecha;

   
    public Cuenta() {
        this.id = 0;
        this.saldo = 0;
        this.interes_anual = 0;
    }

    public Cuenta(int id, double saldo) {
        this.id = 12;
        this.saldo = 120;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteres_anual() {
        return interes_anual;
    }

    public void setInteres_anual(double interes_anual) {
        this.interes_anual = interes_anual;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public double getinteres_mensual (){
        System.out.println("EL INTERES MENSUAL ES: ");
        System.out.println("Interes anual / 12");
        return 0;
    }
    
    void retiro(double retiro){
        saldo = saldo - retiro;
    }
    
    void deposito(double deposito){
        saldo = saldo + deposito;
    }
   
    
    public static void main (String[]args){
        Cuenta ct = new Cuenta();
        ct.getinteres_mensual();
        
    }
}
