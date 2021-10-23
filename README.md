<h1>Padrão de Projeto Observer em Java</h1>
<p>O Observer é um padrão de projeto de software que define uma dependência um-para-muitos entre objetos de modo que quando um objeto muda o estado, todos seus dependentes são notificados e atualizados automaticamente. Permite que objetos interessados sejam avisados da mudança de estado ou outros eventos ocorrendo num outro objeto.</p>
<p><b>Aplicabilidade:</b> o padrão Observer pode ser usado quando uma abstração tem dois aspectos, um dependente do outro. Encapsular tais aspectos em objetos separados permite que variem e sejam reusados separadamente. Quando uma mudança a um objeto requer mudanças a outros e você não sabe quantos outros objetos devem mudar ou quando um objeto deve ser capaz de avisar outros sem fazer suposições sobre quem são os objetos. Em outras palavras, sem criar um acoplamento forte entre os objetos. (Wikipedia)</p
<h2>Exemplo de implementação do padrão observer em Java</h2>
<h3>"Aniversário Surpresa"</h3>

<b>Artefatos:</b>
<ul>
  <li>5 Classes</li>
  <li>1 Interface</li>
</ul>

<p><b>Interface ChegadaAniversarianteObserver:</b> todos os interessados ou observadores devem implementar o método definido
nesta interface: método chegou().</p>
<p><b>Classe ChegadaAniversarianteEvent:</b> esta classe define todas as informações relevantes do evento, ou seja, ela carrega os dados do evento.</p>
<p><b>Classe Porteiro:</b>A classe Porteiro representa o subject, que é o responsável por detectar o evento e notificar todos os interessados (classe Namorada).
 <br />Porteiro extende Thread e sobrescreve o método run(). 
 <br />Aguarda a entrada de uma tecla e armazena na variável 'valor' <br />
                valor = scanner.nextInt(); <br />
Se o número digitado for 1, significa que o evento ocorreu 
                // ou se for outra tecla significa alarme falso</p>
<p><b>Classe Namorada:</b> a classe Namorada implementa a interface ChegadaAniversarianteObserver.</p>
p><b>Classe VizinhaFofoqueira:</b> a classe VizinhaFofoqueira implementa a interface ChegadaAniversarianteObserver.</p>

<h4>Exemplo de execução:</h4>
run:<br />
Alguém chegou: 1-Aniversariante | 2-outra pessoa<br />
Digite um número:<br />
2<br />
Alarme falso...<br />
Digite um número:<br />
1<br />
Data: Sat Oct 23 15:06:24 AMST 2021<br />
Chegou! Apagar as luzes...<br />
Fazer silêncio...<br />
Surpresa!<br />
Olha lá! Olha lá!<br />
Já vai ter bagunça de novo!<br />
Não aguento mais esse povo barulhento!<br />
CONSTRUÍDO COM SUCESSO (tempo total: 5 segundos)<br />

