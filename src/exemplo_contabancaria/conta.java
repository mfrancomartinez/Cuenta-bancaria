/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo_contabancaria;

/**
 *
 * @author mfrancomartinez
 */
public class conta {
    private String nome, numero_de_conta;
    private double saldo;
    
    public conta (){
        
    }
    public conta (String nom, String num, double sal){
        nome = nom;
        numero_de_conta = num;
        saldo = sal;
    }
    
    public String getnom (){
        return nome;
    }
    public void setnum (String num){
        numero_de_conta = num;
    }
    public void setsal (double sal){
        saldo = sal;
    }
    public double getsal (){
        return saldo;
    }
    
    public double ingresar (double ing){
        System.out.println("Indique la cantidad a ingresar:");
        saldo  = ing + saldo;
        return saldo;
    }
    public double retirar (double ret){
        System.out.println("Indique la cantidad que desee retirar:");
        saldo = saldo-ret;
        return saldo;
    }
    
    @Override
    public String toString(){
        return ("nome="+nome+"Numero Conta="+numero_de_conta+"Saldo="+saldo);
    }
    public void anularConta(){
        nome = "null";
        numero_de_conta = "null";
        saldo = 0.0;
    } 
//Commit de Joshua
}