
/**
 * Escreva a descrição da classe heater aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class heater
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int temperature;
    private int min;
    private int max;
    private int increment;

    /**
     * COnstrutor para objetos da classe heater
     */
    public heater(int minimo, int maximo)
    {
        // inicializa variáveis de instância
        temperature = 15;
        increment = 5;
        
        if(minimo>maximo){
            System.out.println("Impossivel ter valor de minimo maior que valor de maximo! Invertendo valores...");
            min = maximo;
            max = minimo;
        }
        else {
            min = minimo;
            max = maximo;
        }
    }

    public void warmer()
    {
        if(temperature+increment<=max){
            temperature += increment;
        }
        else {
            System.out.println("Impossivel aquecer mais! Sua temperatura maxima eh: " + max);
        }
    }
    public void cooler()
    {
       if(temperature-increment>=min){
            temperature -= increment;
        }
        else {
            System.out.println("Impossivel resfriar mais! Sua temperatura minima eh: " + min);
        }
    }
    
    public int getTemperature(){
        return temperature;
    }
    
    public void showTemperature(){
        System.out.println("A temperatural atual eh " + temperature);
    }
    
    public void setIncrement(int inc){
        if(inc>=0){
            increment = inc;
        }
        else {
            System.out.println("Por favor, passe um numero nao negativo!");
        }
    }
}
