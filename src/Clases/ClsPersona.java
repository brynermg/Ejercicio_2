/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import Clases.ClsCuenta;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RootPaneContainer;
/**
 *
 * @author Bryner
 */
public class ClsPersona {
   int DNI;
  ArrayList<ClsCuenta> cuentas= new ArrayList<ClsCuenta>();

    public ClsPersona(int DNI) {
        this.DNI = DNI;
    }
   public void agregrar_cuenta(ClsCuenta cuenta){
       int num= cuentas.size();
       if (num<=3) {
               cuentas.add(cuenta);
           }
     
       
        
        
   }
    public void consulta(){
        for (int i = 0; i < 2; i++) {
            
            if (cuentas.get(i).getSaldo()<0) {
                JOptionPane.showMessageDialog(null, "La cuenta se encuentra morosa " + cuentas.get(i).getSaldo() );
            }else {
                JOptionPane.showMessageDialog(null,"Trasnferencia Existosa");
            
            }
        }
    
    }
        
        
    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public ArrayList<ClsCuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<ClsCuenta> cuentas) {
        this.cuentas = cuentas;
    }
}
