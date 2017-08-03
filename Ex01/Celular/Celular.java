
/**
 * Escreva a descrição da classe Celular aqui.
 * 
 * @author luanpereira
 * @version 1.0
 */

//Classe que define o objeto Celular
public class Celular{
    private int creditos;

    //Construtor padrao
    public Celular(){
        creditos = 1000;
    }

    //Construtor parametrizado
    public Celular(int credit){
        if(credit>=0){
            creditos = credit;
        }
        else {
            System.out.println("Impossivel criar celular com valor de creditos negativos! Definindo zero por default...");
            creditos =0;
        }
    }
    
    //Metodos de acesso

    public int getCreditos(){
        return creditos;
    }

    public void setCreditos(int credit){
        if(credit>=0){
            creditos = credit;
        }
        else {
            creditos =0;
        }
    }


    //Metodo de recarga
    public void topUp(int credit){
        if(credit>=0) {
            creditos+=credit;
            saldoAtual();
        }
        else {
            System.out.println("Impossivel adicionar creditos negativos!");
        }
    }
        
    //Metodo para ver saldo
    public void saldoAtual(){
        System.out.println("Saldo atual: " + getCreditos() + " centavos de creditos");
    }
    
    //Metodo de decrescimo de saldo
    public void topDown(int credit){
        if(credit>=0) {
            if(credit<=creditos){
                creditos-=credit;
                saldoAtual();
            }
            else {
                System.out.println("Saldo Insuficiente!");
                saldoAtual();
            }
        }   
        else {
            System.out.println("Por favor, passe um valor positivo para a operacao!");
        }
    }
}
