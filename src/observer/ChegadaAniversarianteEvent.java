/*
Classe ChegadaAniversarianteEvent
esta classe define todas as informações relevantes do evento, ou seja, ela carrega os dados do evento.

*/

package observer;

import java.util.Date;

public class ChegadaAniversarianteEvent {
    private final Date horaDaChegada;

    // Método construtor recebe horaDaChegada como parâmetro
    public ChegadaAniversarianteEvent(Date horaDaChegada) {
        this.horaDaChegada = horaDaChegada;
    }

    // Método Get responsável por retornar a hora da chegada
    public Date getHoraDaChegada() {
        return horaDaChegada;
    }  
}
