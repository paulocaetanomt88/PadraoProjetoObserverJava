/*
A classe Porteiro representa o subject, que é o responsável por detectar o evento
e notificar todos os interessados (classe Namorada)
 */
package observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

// Porteiro extende Thread e sobrescreve o método run()
public class Porteiro extends Thread {
    private List<ChegadaAniversarianteObserver> observers = new ArrayList<ChegadaAniversarianteObserver>();
    
    public void addChegadaAniversarianteObserver(ChegadaAniversarianteObserver observer) {
        this.observers.add(observer);
    }
    
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int valor = 0;
        System.out.println("Alguém chegou: 1-Aniversariante | 2-outra pessoa");
        try {
            while(valor != 1) {
            
                System.out.println("Digite um número:");
                // Aguarda a entrada de uma tecla e armazena na variável 'valor'
                valor = scanner.nextInt();

                // se o número digitado for 1, significa que o evento ocorreu
                // ou se for outra tecla significa alarme falso
                if (valor == 1) {
                    ChegadaAniversarianteEvent event = new ChegadaAniversarianteEvent(new Date());

                    // Notificar os observers
                    for(ChegadaAniversarianteObserver observer: this.observers) {
                        observer.chegou(event);
                    }
                } else {
                    System.out.println("Alarme falso...");
                }
            } 
        } catch (Exception e) { 
                System.out.println("Tecla inválida: digite um número inteiro que corresponda a alternativa correta.");
            }    
        
    }
}
