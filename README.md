# Sistemas Operacionais I

Conteúdo das aulas e exercícios propostos na matéria Sistemas Operacionais I ministrada pelo professor Leandro Colevati, cursada no 3º semestre no curso de análise e desenvolvimento de sistemas da Faculdade de Tecnologia da Zona Leste (FATEC-ZL).

# Exercícios propostos

## [Aula1SOI](https://github.com/Maicaoxd/Sistemas-Operacionais-I/tree/main/Aula1SOI)

### [PDF]()

## [Exercicio01](https://github.com/Maicaoxd/Sistemas-Operacionais-I/tree/main/Exercicio01)

### [PDF]()

## [AulaProcessos](https://github.com/Maicaoxd/Sistemas-Operacionais-I/tree/main/AulaProcessos)

### [PDF]()

## [ExerciciosProcessos](https://github.com/Maicaoxd/Sistemas-Operacionais-I/tree/main/ExerciciosProcessos)

### [PDF]()



## [AulaThreads](https://github.com/Maicaoxd/Sistemas-Operacionais-I/tree/main/AulaThreads)

### [PDF](https://leandrocolevati.com.br/downloadmateriais?idFile=0ByaHylR4Cic0RnYtVE5fbmUyWjA&arquivo=03_-_Threads.pdf)

## [ExerciciosThreads](https://github.com/Maicaoxd/Sistemas-Operacionais-I/tree/main/ExerciciosThreads)

### [PDF](https://leandrocolevati.com.br/downloadmateriais?idFile=0ByaHylR4Cic0alJBNWJkV3J5dU0&arquivo=04_-_Exemplos_e_Exercicios_Threads.pdf)

### [Exercício 0](https://github.com/Maicaoxd/Sistemas-Operacionais-I/blob/main/ExerciciosThreads/src/controller/Exercicio0.java)

Criar em java um projeto com uma Thread chamada ThreadVetor, que receba um valor numérico e vetor como parâmetros. Caso o valor numérico seja par, a thread deve percorrer o vetor utilizando uma estrutura for (int i = 0 ; i < vet.length; i++) e contar o tempo para percorrer o vetor. Caso o valor numérico seja ímpar, a thread deve percorrer o vetor utilizando uma estrutura foreach e contar o tempo para percorrer o vetor. No final, ambas as possibilidades devem apresentar o tempo em segundos. A operação main deve gerar um vetor de 1000 posições com valores aleatórios de 1 a 100. Deve iniciar 2 ThreadVetor e para uma passar o número 1 e o vetor e para a outra, passar o número 2 e o mesmo vetor.

### [Exercício 1](https://github.com/Maicaoxd/Sistemas-Operacionais-I/blob/main/ExerciciosThreads/src/controller/Exercicio1.java)

Fazer uma aplicação que rode 5 Threads que cada uma delas imprima no console o seu número.

### [Exercício 2](https://github.com/Maicaoxd/Sistemas-Operacionais-I/blob/main/ExerciciosThreads/src/controller/Exercicio2.java)

Fazer uma aplicação que insira números aleatórios em uma matriz 3 x 5 e tenha 3 chamadas de Threads, onde cada uma calcula a soma dos valores de cada linha, imprimindo a identificação da linha e o resultado da soma.

### [Exercício 3](https://github.com/Maicaoxd/Sistemas-Operacionais-I/blob/main/ExerciciosThreads/src/controller/Exercicio3.java)

Fazer uma aplicação de uma corrida de sapos, com 5 Threads, cada Thread controlando 1 sapo. Deve haver um tamanho máximo para cada pulo do sapo (em metros) e a distância máxima para que os sapos percorram. A cada salto, um sapo pode dar uma salto de 0 até o tamanho máximo do salto (valor aleatório). Após dar um salto, a Thread, para cada sapo, deve mostrar no console, qual foi o tamanho do salto e quanto o sapo percorreu. Assim que o sapo percorrer a distância máxima, a Thread deve apresentar que o sapo chegou e qual sua colocação.

## [AulaSemaforos](https://github.com/Maicaoxd/Sistemas-Operacionais-I/tree/main/AulaSemaforos)

### [PDF pag. 35](https://leandrocolevati.com.br/downloadmateriais?idFile=0ByaHylR4Cic0UUlCRTRXT0lDNmM&arquivo=05_-_Semaforos.pdf)

Considere que 10 automóveis se deslocam de lugares distintos, distantes de 1Km a 2km de um estacionamento. Todos pretendem estacionar nesse estacionamento que tem 3 vagas. Os carros se deslocam em velocidade de 100 m/s e, quando estacionam, pretendem ficar de 1 a 3 segundos estacionados. Ao chegar e ao sair do estacionamento, deve-se fazer uma notificação. Ao estacionar, também deve-se fazer uma notificação. Os carros que chegam e não conseguem estacionar, devem aguardar em fila por ordem de chegada.

## [ExerciciosSemaforos](https://github.com/Maicaoxd/Sistemas-Operacionais-I/tree/main/ExerciciosSemaforos)

### [PDF pag. 37 adiante](https://leandrocolevati.com.br/downloadmateriais?idFile=0ByaHylR4Cic0UUlCRTRXT0lDNmM&arquivo=05_-_Semaforos.pdf)

### [Exercício 01](https://github.com/Maicaoxd/Sistemas-Operacionais-I/blob/main/ExerciciosSemaforos/src/controller/Exercicio01.java)

Fazer uma aplicação que gerencie a figura abaixo:

[(Imagem PDF pag.37)](https://leandrocolevati.com.br/downloadmateriais?idFile=0ByaHylR4Cic0UUlCRTRXT0lDNmM&arquivo=05_-_Semaforos.pdf)

Para tal, usar uma variável sentido, que será alterado pela Thread que controla cada carro com a movimentação do carro. Quando a Thread tiver a possibilidade de ser executada, ela deve imprimir em console o sentido que o carro está passando. Só pode passar um carro por vez no cruzamento.

### [Exercício 02](https://github.com/Maicaoxd/Sistemas-Operacionais-I/blob/main/ExerciciosSemaforos/src/controller/Exercicio02.java)

4 pessoas caminham, cada uma em um corredor diferente. Os 4 corredores terminam em uma única porta. Apenas 1 pessoa pode cruzar a porta, por vez. Considere que cada corredor tem 200m. e cada pessoa anda de 4 a 6 m/s. Cada pessoa leva de 1 a 2 segundos para abrir e cruzar a porta. Faça uma aplicação em java que simule essa situação.

### [Exercício 03](https://github.com/Maicaoxd/Sistemas-Operacionais-I/blob/main/ExerciciosSemaforos/src/controller/Exercicio03.java)

Você foi contratado para automatizar um treino de Fórmula 1. As regras estabelecidas pela direção da provas são simples:

“No máximo 5 carros das 7 escuderias (14 carros no total) presentes podem entrar na pista simultaneamente, mas apenas um carro de cada equipe. O segundo carro deve ficar à espera, caso um companheiro de equipe já esteja na pista. Cada piloto deve dar 3 voltas na pista. O tempo de cada volta deverá ser exibido e a volta mais rápida de cada piloto deve ser armazenada para, ao final, exibir o grid de largada, ordenado do menor tempo para o maior.”

### [Exercício 04](https://github.com/Maicaoxd/Sistemas-Operacionais-I/blob/main/ExerciciosSemaforos/src/controller/Exercicio04.java)

Um banco deve controlar Saques e Depósitos.

O sistema pode permitir um Saque e um Depósito Simultâneos, mas nunca 2 Saques ou 2 Depósitos Simultâneos.

Para calcular a transação (Saque ou Depósito), o método deve receber o código da conta, o saldo da conta e o valor a ser transacionado.

Deve-se montar um sistema que deve considerar que 20 transações simultâneas serão enviadas ao sistema (aleatoriamente essas transações podem ser qualquer uma das opções) e tratar todas as transações, de acordo com as regras acima.

## [ExerciciosSemaforos2](https://github.com/Maicaoxd/Sistemas-Operacionais-I/tree/main/ExerciciosSemaforos2)

### [PDF Bilheteria](https://leandrocolevati.com.br/downloadmateriais?idFile=0ByaHylR4Cic0VS1HcUlZa2RvWGM&arquivo=Exercicio_Threads_Semaforo_Bilheteria.pdf)

### [PDF Aeroporto](https://leandrocolevati.com.br/downloadmateriais?idFile=0ByaHylR4Cic0RmRjMnYtb1dQbG8&arquivo=Exercicio_Revisao_Threads_Semaforos.pdf)

### [Bilheteria](https://github.com/Maicaoxd/Sistemas-Operacionais-I/blob/main/ExerciciosSemaforos2/src/controller/Bilheteria.java)

Considere o seguinte cenário:

Um grande show acontecerá no Brasil, em uma casa com capacidade para 100 pessoas. A venda será feita excluisvamente pelo sistema. Simultaneamente, 300 pessoas, no primeiro instante acessam o sistema de compra. As pessoas podem comprar de 1 a 4 ingressos por compra, sendo que isso é uma condição aleatória. 

Os passos para a compra são:
1) Login no sistema: Processo que pode demorar de 50 ms a 2 s, sendo que, se o tempo passar de 1s, ao final do tempo de espera de login, o comprador recebe uma mensagem de timeout e, por não
conseguir fazer o login, não poderá fazer a compra.

2) Processo de compra: Processo que pode demorar de 1 s a 3 s, sendo que, se o tempo passar de 2,5s, ao final do tempo de espera da compra, o comprador recebe uma mensagem de final de tempo de sessão e, por estourar o tempo de sessão, não poderá fazer a compra.

3) Validação da compra: O sistema deve verificar se há ingressos suficientes para finalizar a compra. Se houver, faz a compra e subtrai do total de ingressos disponíveis. O sistema comunica a venda da quantidade de ingressos para o usuário e a quantidade de ingressos ainda disponíveis. Se não houver a totalidade dos ingressos disponibiliados, o comprador recebe mensagem sobre a indisponibilidade dos ingressos e, como não é possível fracionar a quantidade pedida, este perde a possibilidade de compra na sessão.

Simular em Java essa situação

** O processo de validação da compra, apenas 1 comprador por vez,
pois a finalização do processo depende da disponibilidade de ingressos.

*** Os processos de Login e escolha da quantidade de ingressos, por não depender de mais nada, devem ser feito simultaneamente entre todos os compradores.

### [Aeroporto](https://github.com/Maicaoxd/Sistemas-Operacionais-I/blob/main/ExerciciosSemaforos2/src/controller/Aeroporto.java)

Um aeroporto tem 2 pistas (norte e sul) e, em cada pista, apenas um avião pode fazer a decolagem. 

O procedimento de decolagem tem 4 fases (manobra, taxiar, decolagem e afastamento da área). 

A fase de manobra pode durar de 3 a 7 segundos. A fase de taxiar, de 5 a 10 segundo. A fase de decolagem, de 1 a 4 segundos. A fase de afastamento, de 3 a 8 segundos.

O aeroporto reúne, por ciclo, 12 aeronaves que podem decolar pela pista norte ou pela pista sul (decisão aleatória). Mas, apenas 2 aviões podem circular pela área de decolagem ao mesmo tempo.

Fazer uma aplicação em Java que resolva o problema.

## [ExerciciosSemaforos3](https://github.com/Maicaoxd/Sistemas-Operacionais-I/tree/main/ExerciciosSemaforos3)

### [PDF]((https://drive.google.com/file/d/1LzF0hRy06DqfmdWKa2msKErOMnyLh1nR/view))

### [Exercício 01](https://github.com/Maicaoxd/Sistemas-Operacionais-I/blob/main/ExerciciosSemaforos3/src/controller/Exercicio01.java)

Um servidor com multiprocessamento recebe requisições que envolve realizar cálculos e fazer transações com bancos de dados. Por ter uma quantidade grande de núcleos de processamentos e threads, além de um bom algoritmo de escalonamento de threads, enquanto as threads fazem cálculos, estes podem ocorrer simultaneamente, mas quando se faz a transação no banco de dados, esta deve ser apenas uma thread por vez. Considere um conjunto de threads com IDs definidas na própria aplicação com números iniciando em 1 e incrementando de um em um. As threads tem comportamento como segue:

a) Threads com ID dividido por 3 resultando em resto igual a um fazem as transações:
- Cálculos de 0,2 a 1,0 segundos
- Transação de BD por 1 segundo
- Cálculos de 0,2 a 1,0 segundos
- Transação de BD por 1 segundo

b) Threads com ID dividido por 3 resultando em resto igual a dois fazem as transações:
- Cálculos de 0,5 a 1,5 segundos
- Transação de BD por 1,5 segundo
- Cálculos de 0,5 a 1,5 segundos
- Transação de BD por 1,5 segundo
- Cálculos de 0,5 a 1,5 segundos
- Transação de BD por 1,5 segundo

c) Threads com ID dividido por 3 resultando em resto igual a zero fazem as transações:
- Cálculos de 1 a 2 segundos
- Transação de BD por 1,5 segundo
- Cálculos de 1 a 2 segundos
- Transação de BD por 1,5 segundo
- Cálculos de 1 a 2 segundos
- Transação de BD por 1,5 segundo

Faça uma aplicação em Java que simule a situação de 21 Threads simultâneas, com exibição em console de cada passo que a Thread está realizando.

### [Exercício 02](https://github.com/Maicaoxd/Sistemas-Operacionais-I/blob/main/ExerciciosSemaforos3/src/controller/Exercicio02.java)

Existem diversos jogos de simulação. Um deles simula a participação de cozinheiros em uma cozinha profissional realizando pratos. Numa das fases, o cozinheiro precisa realizar o cozimento de 5 pratos simultâneos, onde cada cozimento não depende da interação do jogador. Pratos de ID ímpar, são chamados de Sopa de Cebola e levam de 0,5 a 0,8 segundos para ficar prontos. Pratos de ID par, são chamados de Lasanha a Bolonhesa e levam de 0,6 a 1,2 segundos para ficar prontos. Quando um prato inicia, é necessário comunicar, em console, que se iniciou e, a cada 0,1 segundos, deve-se exibir o percentual de cozimento (O percentual é definido pelo tempo total dividido por 0,1 segundos). Quando um prato fica pronto, é necessário comunicar em console o final e fazer a entrega, que leva 0,5 segundos. O jogador só pode entregar um prato por vez e deve comunicar a entrega. Simular a situação em Java.