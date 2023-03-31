# [ExerciciosSemaforos2](https://github.com/Maicaoxd/Sistemas-Operacionais-I/tree/main/ExerciciosSemaforos2)

## [PDF Bilheteria](https://leandrocolevati.com.br/downloadmateriais?idFile=0ByaHylR4Cic0VS1HcUlZa2RvWGM&arquivo=Exercicio_Threads_Semaforo_Bilheteria.pdf)

## [PDF Aeroporto](https://leandrocolevati.com.br/downloadmateriais?idFile=0ByaHylR4Cic0RmRjMnYtb1dQbG8&arquivo=Exercicio_Revisao_Threads_Semaforos.pdf)

## [Bilheteria](https://github.com/Maicaoxd/Sistemas-Operacionais-I/blob/main/ExerciciosSemaforos2/src/controller/Bilheteria.java)

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

## [Aeroporto](https://github.com/Maicaoxd/Sistemas-Operacionais-I/blob/main/ExerciciosSemaforos2/src/controller/Aeroporto.java)

Um aeroporto tem 2 pistas (norte e sul) e, em cada pista, apenas um avião pode fazer a decolagem. 

O procedimento de decolagem tem 4 fases (manobra, taxiar, decolagem e afastamento da área). 

A fase de manobra pode durar de 3 a 7 segundos. A fase de taxiar, de 5 a 10 segundo. A fase de decolagem, de 1 a 4 segundos. A fase de afastamento, de 3 a 8 segundos.

O aeroporto reúne, por ciclo, 12 aeronaves que podem decolar pela pista norte ou pela pista sul (decisão aleatória). Mas, apenas 2 aviões podem circular pela área de decolagem ao mesmo tempo.

Fazer uma aplicação em Java que resolva o problema.