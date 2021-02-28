
### 000. SOLID

Design principles SOLID, um acrônimo para 5 postulados criados por Robert C. Martin (Uncle Bob) escritor do famoso Clean Code.


* [S]ingle Responsibility Principle (Princípio da responsabilidade Única).

* [O]pen/Closed Principle (Princípio aberto/fechado).

* [L]iskov Substitution Principle (Princípio substituição de Liskov).

* [I]nterface Segregation Principle (Princípio segregação de interfaces).

* [D]ependecy Inversion Principle (Princípio da inversão de dependências).




### 001. Princípio da responsabilidade Única (SRP).

Este princípio prega que uma classe deve ter apenas um motivo para mudar. 
Em outras palavras, Uncle Bob está falando sobre coesão. Você pode entender coesão como sendo o quão forte é a relação entre os elementos de uma classe, 
se essa relação é forte, os elementos têm uma alta afinidade entre si. Quanto mais bem definida uma classe é, 
maior a sua coesão. Quando mais coesa, menos motivos terá para mudar. Ficou difícil? Então vamos para o código.


Obs: O conceito de coesão é bem diferente de acoplamento. 
Acoplamento é quando você tem uma forte dependência entre os elementos, assim alterar um desses vai acarretar mudanças nos outros também.

[REFERENCE]

(https://www.zup.com.br/blog/design-principle-solid)

(https://github.com/EduardoPires/SOLID/tree/master/EP.SOLID)




### 002. Princípio aberto/fechado (OCP)

Entidades de software (classes, módulos, funções e etc) devem estar abertas para extensão, porém fechadas para modificações.

se referindo ao conceito abstrato de extensão. 
Você pode criar extensões de classes através de herança, classes abstratas e interfaces, por exemplo. 

(https://github.com/EduardoPires/SOLID/tree/master/EP.SOLID)




### 003. Princípio da substituição de Liskov (LSP)

uma classe derivada deve ser substituível por sua classe base.
O LSP completa o princípio aberto/fechado, pois quando criamos subclasses seguindo o LSP, conseguimos fechar ainda mais nossa classe base para modificações.

[REFERENCE]

(https://www.zup.com.br/blog/design-principle-solid)

(https://stackoverflow.com/questions/56860/what-is-an-example-of-the-liskov-substitution-principle)

(https://github.com/EduardoPires/SOLID/tree/master/EP.SOLID)




### 004. Princípio da segregação de interfaces (ISP)

simplesmente nos incentiva a “fatiar” interfaces “gordas” em interfaces mais granulares. 
Ter interfaces mais específicas facilita a manutenção e legibilidade do código, além de uma maior coesão.

[REFERENCE]

(https://medium.com/xp-inc/os-princ%C3%ADpios-do-solid-isp-princ%C3%ADpio-de-segrega%C3%A7%C3%A3o-da-interface-1822ebc802fd)

(https://www.zup.com.br/blog/design-principle-solid)

(https://www.oodesign.com/interface-segregation-principle.html)

(https://github.com/EduardoPires/SOLID/tree/master/EP.SOLID)




### 005. Princípio da inversão de dependência (DIP)

definiu em duas regras:

1 - Módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender da abstração.

2 - Abstrações não devem depender de detalhes. Detalhes devem depender de abstrações.

(https://www.zup.com.br/blog/design-principle-solid)

(https://www.oodesign.com/dependency-inversion-principle.html)

(https://medium.com/xp-inc/os-princ%C3%ADpios-do-solid-dip-princ%C3%ADpio-de-invers%C3%A3o-de-depend%C3%AAncia-7e110cfcc3e5)

(https://github.com/EduardoPires/SOLID/tree/master/EP.SOLID)

