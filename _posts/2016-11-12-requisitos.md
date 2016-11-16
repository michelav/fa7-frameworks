---
layout: post
title:  "Trabalho de Implementação"
date:   2016-11-12 16:00:00 -0500
categories: trabalho
permalink: /:categories/:title.html
---

## FA7 Biblio

A Faculdade 7 de Setembro está implementando um novo sistema para sua biblioteca. O sistema
será acessado por todos os alunos em sua intranet e também por meio da internet.
Usando o sistema, os alunos poderão listar os livros, realizar reservas ou mesmo sugerir aquisição
de novos livros.

### Reserva de livros
No procedimento para reserva de livros o usuário adiciona um ou mais livros para a sua lista de reservas.
A lista continua ativa até que ele a submeta para o sistema. Após a submissão, o sistema verifica se todos
os livros estão disponíveis na biblioteca. Caso haja algum caso de indisponibilidade, a reserva é concluída
sem o livro em questão.

### O processo de aquisição
O processo de aquisição de novos livros é realizado em duas etapas. Na primeira etapa,
os usuários do sistema indicam suas sugestões de novos livros a serem adquiridos.
Após isso, os administradores do sistema avaliam a lista de livros sugeridos, indicam quantas unidades
serão adquiridas de cada livro e submetem o pedido para a distribuidora.
Zero unidades significa que aquele livro não constará do pedido.
Como o processamento do pedido pode se tornar demorado, ele não deve estar em sincronia com
o processo de submissão. Após o processamento do pedido, a distribuidora informa a situação do
pedido para cada livro. Zero unidades significa que aquele livro não está disponível
para aquisição. A confirmação do pedido significa disponibilidade imediata do livro para
empréstimo. Vejam o exemplo na tabela abaixo:

**Pedido**

Livro | Quantidade
----- | -----------
Livro 1 | 5
Livro 2 | 4
Livro 3 | 2
Livro 4 | 2

**Confirmação**

Livro | Quantidade
----- | ----------
Livro 1 | 3
Livro 2 | 4
Livro 3 | 2
Livro 4 | 0


<br />

## Trabalho

#### Descrição

1. Implementar, utilizando as tecnologias da especificação JavaEE, as seguintes
funcionalidades:
    - Listagem básica de livros e suas quantidades (2 pt);
    - Procedimento de reserva de livros (3 pt);
    - Procedimento sugestão e pedido de aquisição de livros (5 pt).

2. Implementar, utilizando o _framework_ Spring, o processo de aquisição de livros
que compete à distribuidora.

3. Para cada funcionalidade:
    - Desenhar um diagrama de classes sucinto denotando as principais estruturas
    envolvidas;
    - Explicar as decisões de design tomadas no procedimento de reserva;
    - Explicar as decisões de design tomadas no procedimento de aquisição.

#### Ferramentas
- Servidor de aplicação Wildfly
- Serviço de mensagens: ActiveMQ
- Banco de Dados: Postgresql
- Eclipse Neon e STS

#### Entrega

O trabalho poderá ser enviado na forma de um arquivo zip por e-mail para
[michel.vasconcelos@gmail.com](mailto:michel.vasconcelos@gmail.com) ou  um repositório github. O projeto
deverá ser organizado da seguinte forma:

- Pasta docs contendo os pdfs com os diagramas e decisões de design das 3 funcionalidades
(listagem, reserva e aquisição);
- Pasta projs contendo os projetos de implementação.

Vale ressaltar que qualquer estrutura (filas, BDs, tabelas, etc) que precise ser criada deverá
ser denotada em um arquivo README na pasta projs. Por exemplo, se for
necessário criar uma fila para transferência de mensagens, indicar o nome físico e JNDI da fila.

#### Datas

O Trabalho deverá ser feito por equipes de (no máximo e desejável) duas pessoas.
**A data / hora máxima de entrega será 09/12/2016 23:59:59** .