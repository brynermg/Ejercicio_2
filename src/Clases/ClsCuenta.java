/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Bryner
 */
public class ClsCuenta {
 Double saldo;
 int numero;

    public ClsCuenta(Double saldo, int numero) {
        this.saldo = saldo;
        this.numero = numero;
        
        
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    

   public void recibir(double monto){
    this.setSaldo(this.getSaldo()+monto);
}
 public void pagar(double monto){
    this.setSaldo(this.getSaldo()- monto);
}

        
        
}
