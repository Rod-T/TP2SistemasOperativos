# TP2SistemasOperativosVersaoBase

O Problema de Corte Unidimensional (Cutting Stock Problem) consiste na realização do corte de
peças pequenas a partir de uma peça de tamanho maior. Este corte deverá respeitar um determinado
padrão de forma a maximizar o número de peças cortadas e minimizar o desperdício.
Neste trabalho iremos assumir que as peças a cortar numa chapa de aço (denominado “placa”), são
retângulos ou quadrados cuja largura é a mesma da placa. Ou seja, será apenas necessário um corte
(vertical) para obter a peça desejada.

Exemplo:
Sendo:
 - m o número de diferentes comprimentos de peças em que se pretende cortar cada uma das placas
 - maxComprimento o comprimento da placa, em metros
 - compPecas um vetor cujos elementos representam o comprimento (em metros) das peças a cortar
 - qtddPecas, um vetor cujos elementos representam as quantidades de peças a cortar de cada comprimento definido no vetor compPecas, respeitando a mesma ordem com os seguintes dados iniciais:
 
 - m = 4
 - maxComprimento = 12
 - compPecas = [3, 4, 5, 6]
 - qtddPecas = [2, 2, 1, 3]

Com esta informação conseguimos saber que se pretende gerar padrões de organização das peças na
placa, que a placa tem 12m de comprimento, que as peças a cortar possuem quatro comprimentos
diferentes (3, 4, 5 e 6 metros), e que pretendemos obter 2 peças de 3m, 2 peças de 4m, 1 peça de
5m, e 3 peças de 6m.

 - Lista items : 5 4 6 3 3 4 6 6
 - Corte em : | | | |
 - Desperdício : 3 0 2 6

O algoritmo AJR-E++ pertence à classe dos algoritmos evolutivos, sendo uma versão de um dos
seus tipos - a Programação Evolutiva (https://en.wikipedia.org/wiki/Evolutionary_programming).
Ao contrário dos algoritmos que trabalham apenas com uma solução, na programação evolutiva
trabalha-se sempre com conjuntos de soluções (denominadas populações).

VERSAO BASE:

1. Criar p threads (número parametrizável) em que cada thread corre o algoritmo AJR-E++.

2. Após um tempo de execução, as threads são interrompidas e cada uma delas atualiza a
memória central com a sua melhor solução. Dado que duas ou mais threads podem aceder
simultaneamente à memória central e corrompê-la, a atualização desta deve ser feita de
forma controlada.

3. Informa-se o utilizador da melhor solução encontrada. Esta informação deve ser feita logo
que todas as threads atualizem a sua melhor estratégia de corte na memória central. Para
garantir que esta atualização seja feita de forma adequada, deve ser feita a sincronização na
atualização e leitura dos resultados.
