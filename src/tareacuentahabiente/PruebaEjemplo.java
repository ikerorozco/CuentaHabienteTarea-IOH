/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareacuentahabiente;

/**
 *
 * @author ikero
 */
public class PruebaEjemplo {
    public static void main(String args[]){
         
        CuentaHabiente[] cuentas = new CuentaHabiente[5];   
        cuentas[0]=new CuentaHabiente("oofd21345","Iker Orozco", 75000);
        cuentas[1]=new CuentaHabiente("uids10234","Miguel Hernandez", 43000);
        cuentas[2]=new CuentaHabiente("yusa09123","Jonathan Joestar", 50000);
        cuentas[3]=new CuentaHabiente("tyal98012","Joseph Joestar", 49999);
        cuentas[4]=new CuentaHabiente("rtlk87901","Jotaro Kuhjo", 50001);
        
        for (int i = 0; i < cuentas.length; i++) {
            
            cuentas[i].retirarDinero(10000);
            System.out.println(cuentas[i]);
            if(cuentas[i].getBalance()<=50000){
                System.out.println("La cuenta de " +cuentas[i].nombre);
                System.out.println(" es REGULAR");
            }else{
                System.out.println("La cuenta de " +cuentas[i].nombre);
                System.out.println(" es PREMIUM");               
            }
        }
}
}
