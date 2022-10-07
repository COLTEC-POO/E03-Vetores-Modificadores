# E03: Vetores & Modificadores

Nesta lista daremos continuidade a implementação de nosso sistema bancário.
Para isso, você pode (e deve) aproveitar o código desenvolvido nos exercícios anteriores.

## 01: Registro de Operações

Nós iremos estender nosso sistema implementando uma nova funcionalidade: Registro de Operações. Para cada conta, nós iremos armazenar um histórico com todas as operações de depósitos e saques realizados desde sua criação.

Para isso, lhe foi fornecida uma nova classe já implementada (consulte o arquivo anexo presente na atividade), denominada `Operacao`. Essa classe possui dois atributos:

* `operacao`: tipo caractere, possuindo apenas dois possíveis valores 'd' para depósito, e 's' para saques;
* `valor`: tipo double, contendo o valor da operação;
* `dataOperacao`: Tipo DateTime, contendo a data e hora da realização da operação;

Para que a funcionalidade de registro de operações funcione corretamente, você deverá atualizar a classe `Conta` da seguinte forma:

* Declarar um novo atributo denominado `operacoes`, que deverá armazenar até 1000 operações realizadas na conta;
* Alterar os métodos `sacar` e `depositar` para inserir uma nova operação no atributo `operacoes` toda vez que um dos métodos seja chamado.


OBS: Você deverá controlar qual posição do atributo `operacoes` estará disponível no momento da chamada de cada método, para isso muito provavelmente você precisará de um atributo auxiliar cuja finalidade será manter a posição da última inserção, por exemplo.

## 02: Extrato de Conta

Implemente um método chamado `extrato` que imprima o histórico das operações realizadas para uma determinada conta. A impressão deverá seguir o formato `"DATA\tOPERACAO\tVALOR"`. Veja um exemplo abaixo:

````language=java
Conta c1 = new Conta();

c1.depositar(2500);
c1.depositar(1500);
c1.sacar(200);
c1.sacar(3000);
c1.depositar(150);
c1.sacar(50);

c1.imprimirExtrato();
````

Esses comandos produziram a seguinte saída:

````
Sat Jan 16 19:56:54 BRST 2021	d	2500.0
Sat Jan 16 19:56:54 BRST 2021	d	1500.0
Sat Jan 16 19:56:54 BRST 2021	s	200.0
Sat Jan 16 19:56:54 BRST 2021	s	3000.0
Sat Jan 16 19:56:54 BRST 2021	d	150.0
Sat Jan 16 19:56:54 BRST 2021	s	50.0
````

OBS: Fique atento pois nem todos os elementos do vetor são operações válidas. Portanto poderá ser necessário fazer uma verificação antes.

## 03: Ajuste de Visibilidade

Organize os membros das classes existentes no seu sistema (`Conta` e `Operacao`) de modo que seus atributos sejam todos privados.

Você deverá ainda implementar os getters e setters dos atributos conforme instruções abaixo:

Classe `Conta`:
* `dono`: getter & setter
* `numero`: getter & setter
* `saldo`: getter
* `limite`: getter & setter (definir limite como zero se valor passado for negativo)


Classe `Operacao`:
* `dataOperacao`: getter
* `tipo`: getter & setter (restringir a apenas dois caracteres: `'d'` ou `'s'`)
* `valor`: getter & setter

## 04: Total de Contas e Total de Operações

Declare variáveis estáticas que sejam capazes de armazenar o total de contas criadas, bem como o total de operações realizadas.

Seguindo os princípios de POO, a variável `totalContas` deverá pertencer a classe `Conta`, já a variável `totalOperacoes` deverá pertencer a classe `Operacao`. Ambas deverão ser incrementadas toda vez que uma classe tenha sido instanciada.

Com essas duas informações, imprima no programa a média de operações realizadas em relação ao número de contas.

