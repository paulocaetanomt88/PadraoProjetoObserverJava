/*
Como regra,
a classe Namorada implementa a interface ChegadaAniversarianteObserver
 */
package observer;

public class Namorada implements ChegadaAniversarianteObserver{
    
    /*
    O método chegou será chamado sempre que um evento ocorrer
    */
    @Override
    public void chegou(ChegadaAniversarianteEvent event) {
        System.out.println("Data: " + event.getHoraDaChegada());
        System.out.println("Chegou! Apagar as luzes...");
        System.out.println("Fazer silêncio...");
        System.out.println("Surpresa!");
    }
}
