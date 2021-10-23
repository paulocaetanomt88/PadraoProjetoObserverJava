<h1>Padrão de Projeto Observer em Java</h1>
<p>O Observer é um padrão de projeto de software que define uma dependência um-para-muitos entre objetos de modo que quando um objeto muda o estado, todos seus dependentes são notificados e atualizados automaticamente. Permite que objetos interessados sejam avisados da mudança de estado ou outros eventos ocorrendo num outro objeto.</p>
<p><b>Aplicabilidade:</b> o padrão Observer pode ser usado quando uma abstração tem dois aspectos, um dependente do outro. Encapsular tais aspectos em objetos separados permite que variem e sejam reusados separadamente. Quando uma mudança a um objeto requer mudanças a outros e você não sabe quantos outros objetos devem mudar ou quando um objeto deve ser capaz de avisar outros sem fazer suposições sobre quem são os objetos. Em outras palavras, sem criar um acoplamento forte entre os objetos. (Wikipedia)</p
<h2>Exemplo de implementação do padrão observer em Java</h2>
<h3>"Aniversário Surpresa"</h3>

<b>Artefatos:</b>
<ul>
  <li>4 Classes</li>
  <li>1 Interface</li>
</ul>

<p><b>Classe ChegadaAniversarianteEvent:</b> esta classe define todas as informações relevantes do evento, ou seja, ela carrega os dados do evento.</p>
