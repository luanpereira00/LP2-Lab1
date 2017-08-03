
/**
 * Escreva a descrição da classe Celular aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Celular{
    private int creditos;

    public Celular(){
        creditos = 1000;
    }

    public Celular(int credit){
        if(credit>=0){
            creditos = credit;
        }
        else {
            System.out.println("Impossivel criar celular com valor de creditos negativos! Definindo zero por default...");
            creditos =0;
        }
    }
    
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

    public void topUp(int credit){
        if(credit>=0) {
            creditos+=credit;
            saldoAtual();
        }
        else {
            System.out.println("Impossivel adicionar creditos negativos!");
        }
    }
    
    public void saldoAtual(){
        System.out.println("Saldo atual: " + getCreditos() + " centavos de creditos");
    }
    
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
