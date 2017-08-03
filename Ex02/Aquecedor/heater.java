
/**
 * @author luanpereira00
 * @version 1.0
 */

//Definicao da classe heater
public class heater
{
    //variaveis da classe heater
    private int temperature;
    private int min;
    private int max;
    private int increment;

    /**
     * Construtor parametrizado
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

    //Metodo para aquecer
    public void warmer()
    {
        if(temperature+increment<=max){
            temperature += increment;
        }
        else {
            System.out.println("Impossivel aquecer mais! Sua temperatura maxima eh: " + max);
        }
    }

    //Metodo para resfriar
    public void cooler()
    {
       if(temperature-increment>=min){
            temperature -= increment;
        }
        else {
            System.out.println("Impossivel resfriar mais! Sua temperatura minima eh: " + min);
        }
    }
    
    //Metodos de acesso

    public int getTemperature(){
        return temperature;
    }
    
    public void setIncrement(int inc){
        if(inc>=0){
            increment = inc;
        }
        else {
            System.out.println("Por favor, passe um numero nao negativo!");
        }
    }

    //Metodo que exibe a temperatura atual
    public void showTemperature(){
        System.out.println("A temperatural atual eh " + temperature);
    }
    
   
}
