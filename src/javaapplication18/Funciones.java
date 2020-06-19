/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

/**
 *
 * @author Informatica
 */
public class Funciones {
    private int numero1;
    private int numero2;

    public Funciones(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Funciones() {
    }

    
    /**
     * @return the numero1
     */
    public int getNumero1() {
        return numero1;
    }

    /**
     * @param numero1 the numero1 to set
     */
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    /**
     * @return the numero2
     */
    public int getNumero2() {
        return numero2;
    }

    /**
     * @param numero2 the numero2 to set
     */
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public String Sumar(){
        int res = numero1+numero2;
        return String.valueOf(res);
    }
    
    public String Restar(){
        int res = numero1-numero2;
        return String.valueOf(res);
    }
    
    public String Multiplicar(){
        int res = numero1*numero2;
        return String.valueOf(res);
    }
    
    public String Dividir(){
        int res = numero1/numero2;
        return String.valueOf(res);
    }
}
