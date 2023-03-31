# [ExerciciosThreads](https://github.com/Maicaoxd/Sistemas-Operacionais-I/tree/main/ExerciciosThreads)

## [PDF](https://leandrocolevati.com.br/downloadmateriais?idFile=0ByaHylR4Cic0alJBNWJkV3J5dU0&arquivo=04_-_Exemplos_e_Exercicios_Threads.pdf)

## [Exercício 0](https://github.com/Maicaoxd/Sistemas-Operacionais-I/blob/main/ExerciciosThreads/src/controller/Exercicio0.java)

Criar em java um projeto com uma Thread chamada ThreadVetor, que receba um valor numérico e vetor como parâmetros. Caso o valor numérico seja par, a thread deve percorrer o vetor utilizando uma estrutura for (int i = 0 ; i < vet.length; i++) e contar o tempo para percorrer o vetor. Caso o valor numérico seja ímpar, a thread deve percorrer o vetor utilizando uma estrutura foreach e contar o tempo para percorrer o vetor. No final, ambas as possibilidades devem apresentar o tempo em segundos. A operação main deve gerar um vetor de 1000 posições com valores aleatórios de 1 a 100. Deve iniciar 2 ThreadVetor e para uma passar o número 1 e o vetor e para a outra, passar o número 2 e o mesmo vetor.

## [Exercício 1](https://github.com/Maicaoxd/Sistemas-Operacionais-I/blob/main/ExerciciosThreads/src/controller/Exercicio1.java)

Fazer uma aplicação que rode 5 Threads que cada uma delas imprima no console o seu número.

## [Exercício 2](https://github.com/Maicaoxd/Sistemas-Operacionais-I/blob/main/ExerciciosThreads/src/controller/Exercicio2.java)

Fazer uma aplicação que insira números aleatórios em uma matriz 3 x 5 e tenha 3 chamadas de Threads, onde cada uma calcula a soma dos valores de cada linha, imprimindo a identificação da linha e o resultado da soma.

## [Exercício 3](https://github.com/Maicaoxd/Sistemas-Operacionais-I/blob/main/ExerciciosThreads/src/controller/Exercicio3.java)

Fazer uma aplicação de uma corrida de sapos, com 5 Threads, cada Thread controlando 1 sapo. Deve haver um tamanho máximo para cada pulo do sapo (em metros) e a distância máxima para que os sapos percorram. A cada salto, um sapo pode dar uma salto de 0 até o tamanho máximo do salto (valor aleatório). Após dar um salto, a Thread, para cada sapo, deve mostrar no console, qual foi o tamanho do salto e quanto o sapo percorreu. Assim que o sapo percorrer a distância máxima, a Thread deve apresentar que o sapo chegou e qual sua colocação.