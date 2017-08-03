
/**
 * @author luanpereira00
 * @version 1.0
 */
public class Clock
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int horas;
    private int minutos;
    private boolean morning;

    //Construtor padrao
    public Clock()
    {
        // inicializa variáveis de instância
        horas = 12;
        minutos = 0;
        morning = true;
    }

    //Metodo que exibe a hora atual
    public void horaAtual()
    {
        System.out.println("Hora atual: " + horas + ":" + minutos + " " + getAMPM());
    }
    
    //Metodo que retorna AM/PM
    public String getAMPM(){
        if(morning==true){
            return "AM";
        }
        else {
            return "PM";
        }
    }
    
    //Metodos modificadores
    public void setHoras(int h){
        if(h>12 || h<1){
            System.out.println("Valor de horas invalido!");
        }
        else {
            horas = h;
        }
    }
    
    public void setMinutos(int m){
        if(m>=60 || m<0){
            System.out.println("Valor de minutos invalido!");
        }
        else {
            minutos = m;
        }
    }
    
    public void setAMPM(String AMPM){
        if(AMPM == "AM" || AMPM == "am"){
            morning = true;
        } else if (AMPM == "PM" || AMPM == "pm"){
            morning = false;
        } else {
            System.out.println("Nao foi possivel identificar o valor de AM/PM passado! Mantendo como estava...");
        }
    }
    
    //Metodo que atualiza para uma hora especifica
    public void updateHoursTo(int h){
        if(h>12 || h<1){
            System.out.println("Impossivel atualizar para a hora informada! Nada a fazer...");
        }
        else {
            horas = h;
        }
    }
    
    
    //Metodo que atualiza para um minuto especifico
    public void updateMinTo(int m){
        if(minutos>=60 || minutos<0){
            System.out.println("Impossivel atualizar para os minutos informados! Nada a fazer...");
        }
        else {
            minutos = m;
        }
    }
    
    //Metodo que atualiza para AM ou PM
    public void updateAMPMTo(String AMPM){
        if(AMPM == "AM" || AMPM == "am"){
            morning = true;
        } else if (AMPM == "PM" || AMPM == "pm"){
            morning = false;
        } else {
            System.out.println("Impossivel atualizar para os valores de AM/PM informados! Nada a fazer...");
        }
    }
   
}
