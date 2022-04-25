/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareacuentahabiente;

/**
 *
 * @author ikero
 */
public class CuentaHabiente {
    
    String idCliente;
    String nombre;
    float balance;

    public CuentaHabiente() {
    }

    public CuentaHabiente(String idCliente, String nombre, float balance) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.balance = balance;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CuentaHabiente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", balance=" + balance + '}';
    }
   
    public void retirarDinero( float monto ){
            if(monto<=this.balance){
                this.balance-=monto;
            }else{
                System.out.println("No puedes retirar mas dinero del que tiene");
            }
}
    public void evaluarNivelCliente(){
        
        if(this.balance<=50000){
            System.out.println("“Cliente Regular”"); 
        }else{
            System.out.println("“Cliente Premium”"); 
        }
}
}
