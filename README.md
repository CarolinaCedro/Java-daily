# Design Patterns: Observer Pattern

O padrão Observer é um dos padrões comportamentais mais utilizados em desenvolvimento de software. Ele define uma relação de um-para-muitos entre objetos, de modo que quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente. Isso é útil em situações onde um objeto precisa notificar outros objetos sobre mudanças sem que eles estejam fortemente acoplados.

## Conceito

- **Subject (ou Observable)**: É o objeto que é observado. Ele mantém uma lista de observadores e fornece métodos para que os observadores se registrem e cancelem a inscrição, bem como para notificar os observadores sobre as mudanças de estado.

- **Observer**: É o objeto que observa o estado do objeto observável. Os observadores se registram com o objeto observável para receber notificações sobre as mudanças de estado. Quando o objeto observável muda de estado, ele notifica todos os seus observadores, permitindo que eles tomem medidas apropriadas com base nessas mudanças.

## Exemplo de Estudos

Clique -> <a href="https://github.com/CarolinaCedro/Java-daily/tree/master/Java-daily/Design-Patterns/src/main/java/observer" target="_blank"> Aqui</a>


