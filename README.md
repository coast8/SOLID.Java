
### 000. SOLID

Design principles SOLID, um acr�nimo para 5 postulados criados por Robert C. Martin (Uncle Bob) escritor do famoso Clean Code.


* [S]ingle Responsibility Principle (Princ�pio da responsabilidade �nica).

* [O]pen/Closed Principle (Princ�pio aberto/fechado).

* [L]iskov Substitution Principle (Princ�pio substitui��o de Liskov).

* [I]nterface Segregation Principle (Princ�pio segrega��o de interfaces).

* [D]ependecy Inversion Principle (Princ�pio da invers�o de depend�ncias).




### 001. Princ�pio da responsabilidade �nica (SRP).

Este princ�pio prega que uma classe deve ter apenas um motivo para mudar. 
Em outras palavras, Uncle Bob est� falando sobre coes�o. Voc� pode entender coes�o como sendo o qu�o forte � a rela��o entre os elementos de uma classe, 
se essa rela��o � forte, os elementos t�m uma alta afinidade entre si. Quanto mais bem definida uma classe �, 
maior a sua coes�o. Quando mais coesa, menos motivos ter� para mudar. Ficou dif�cil? Ent�o vamos para o c�digo.


Obs: O conceito de coes�o � bem diferente de acoplamento. 
Acoplamento � quando voc� tem uma forte depend�ncia entre os elementos, assim alterar um desses vai acarretar mudan�as nos outros tamb�m.

[REFERENCE]

(https://www.zup.com.br/blog/design-principle-solid)

(https://github.com/EduardoPires/SOLID/tree/master/EP.SOLID)




### 002. Princ�pio aberto/fechado (OCP)

Entidades de software (classes, m�dulos, fun��es e etc) devem estar abertas para extens�o, por�m fechadas para modifica��es.

se referindo ao conceito abstrato de extens�o. 
Voc� pode criar extens�es de classes atrav�s de heran�a, classes abstratas e interfaces, por exemplo. 

(https://github.com/EduardoPires/SOLID/tree/master/EP.SOLID)




### 003. Princ�pio da substitui��o de Liskov (LSP)

uma classe derivada deve ser substitu�vel por sua classe base.
O LSP completa o princ�pio aberto/fechado, pois quando criamos subclasses seguindo o LSP, conseguimos fechar ainda mais nossa classe base para modifica��es.

[REFERENCE]

(https://www.zup.com.br/blog/design-principle-solid)

(https://stackoverflow.com/questions/56860/what-is-an-example-of-the-liskov-substitution-principle)

(https://github.com/EduardoPires/SOLID/tree/master/EP.SOLID)




### 004. Princ�pio da segrega��o de interfaces (ISP)

simplesmente nos incentiva a �fatiar� interfaces �gordas� em interfaces mais granulares. 
Ter interfaces mais espec�ficas facilita a manuten��o e legibilidade do c�digo, al�m de uma maior coes�o.

[REFERENCE]

(https://medium.com/xp-inc/os-princ%C3%ADpios-do-solid-isp-princ%C3%ADpio-de-segrega%C3%A7%C3%A3o-da-interface-1822ebc802fd)

(https://www.zup.com.br/blog/design-principle-solid)

(https://www.oodesign.com/interface-segregation-principle.html)

(https://github.com/EduardoPires/SOLID/tree/master/EP.SOLID)




### 005. Princ�pio da invers�o de depend�ncia (DIP)

definiu em duas regras:

1 - M�dulos de alto n�vel n�o devem depender de m�dulos de baixo n�vel. Ambos devem depender da abstra��o.

2 - Abstra��es n�o devem depender de detalhes. Detalhes devem depender de abstra��es.

(https://www.zup.com.br/blog/design-principle-solid)

(https://www.oodesign.com/dependency-inversion-principle.html)

(https://medium.com/xp-inc/os-princ%C3%ADpios-do-solid-dip-princ%C3%ADpio-de-invers%C3%A3o-de-depend%C3%AAncia-7e110cfcc3e5)

(https://github.com/EduardoPires/SOLID/tree/master/EP.SOLID)

