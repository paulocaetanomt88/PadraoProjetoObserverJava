package observer;

public class VizinhaFofoqueira implements ChegadaAniversarianteObserver{
    
    /*
    O método chegou será chamado sempre que um evento ocorrer
    */
    @Override
    public void chegou(ChegadaAniversarianteEvent event) {
        System.out.println("Olha lá! Olha lá!");
        System.out.println("Já vai ter bagunça de novo!");
        System.out.println("Não aguento mais esse povo barulhento!");
    }
}
