/*
Classe responsável por executar o nosso exemplo
*/

package observer;

public class AniversarioSurpresa {

    public static void main(String[] args) {
        Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();
        
        // faz a solicitação da notificação quando o evento ocorrer
        porteiro.addChegadaAniversarianteObserver(namorada);
        
        // porteiro passa a monitorar os eventos
        porteiro.start();
    }
    
}
