---
layout: default
title: Home
---

<section id='inicio'/>
# Desenvolvimento com _frameworks_ e componentes

Disciplina obrigatória do curso de especialização em desenvolvimento e arquitetura
de _software_ cujo objetivo é preparar os alunos para o desenvolvimento de aplicações
corporativas utilizando _frameworks_ conhecidos como EJB e Spring.

<section id='programa' />
# Programa

Durante a disciplina abordaremos os conceitos básicos do desenvolvimento de soluções
corporativas utilizando _frameworks_ de mercado. Os tópicos programados para a disciplina são:

- Desenvolvimento corporativo
  - Histórico
  - Principais conceitos
- Enterprise Java Beans
  - Conceitos e tipos
  - Modelo de componentes e arquitetura
  - Containers que suportam EJBs
  - Session Beans: _Stateless_ e _Stateful_
  - Message Driven Beans
  - Acesso a dados: JPA
  - Outros serviços
- Introdução ao Spring
  - Injeção de Dependência e Inversão de Controle
  - Beans: Ciclo de vida e escopo
  - Anotações
  - Serviços: AOP, controle de transações, etc


<section id='agenda' />
# Agenda

<div class="col-md-8">
<table class="table table-hover table-condensed">
<tr>
  <th class="col-xs-2">Data</th>
  <th>Tópicos</th>
</tr>
<tr>
  <td class="date-cell"><date datetime="31-10-2016">31/10</date></td>
  <td class="agenda-cell">
    <a href="{{site.github.url}}/presentations/intro-desenv.html">Desenvolvimento corporativo</a>
    <a href="{{site.github.url}}/pdfs/intro-desenv.pdf">(PDF)</a>
    <ul>
      <li>Histórico</li>
      <li>Principais conceitos</li>
    </ul>
    <a href="{{site.github.url}}/presentations/javaee_plat.html">Plataforma Java EE</a>
    <a href="{{site.github.url}}/pdfs/javaee_plat.pdf">(PDF)</a>
    <ul>
      <li>O que é a plataforma e histórico</li>
      <li>Containers</li>
      <li>Principais serviços</li>
    </ul>
    <a href="{{site.github.url}}/presentations/ejbs.html">Enterprise Java Beans</a>
    <a href="{{site.github.url}}/pdfs/ejbs.pdf">(PDF)</a>
    <ul>
      <li>Conceitos e tipos</li>
      <li>Modelo de componentes e arquitetura</li>
      <li>Session Beans: <em>Stateless</em></li>
    </ul>
  </td>
</tr>
<tr>
  <td class="date-cell"><date datetime="07-11-2016">07/11</date></td>
  <td class="agenda-cell">
    Enterprise Java Beans
    <ul>
      <li>Session Beans</li>
    </ul>
    Comunicação Assíncrona
      <ul>
        <li>Modelos de comunicação</li>
        <li>JMS</li>
        <li>Message Driven Beans</li>
      </ul>
  </td>
</tr>
<tr>
  <td class="date-cell"><date datetime="09-11-2016">09/11</date></td>
  <td class="agenda-cell">
    Enterprise Java Beans
    <ul>
      <li>Message Driven Beans</li>
    </ul>
    Java EE - Persistência
    <ul>
      <li>Entities e JPA</li>
      <li>Frameworks de Persistência</li>
    </ul>
    Java EE - Outros Serviços
  </td>
</tr>
<tr>
  <td class="date-cell"><date datetime="16-11-2016">16/11</date></td>
  <td class="agenda-cell">
    Introdução ao Spring
    <ul>
      <li>Injeção de Dependência e Inversão de Controle</li>
      <li>Beans: Ciclo de vida e escopo</li>
      <li>Anotações</li>
    </ul>
  </td>
</tr>
<tr>
  <td class="date-cell"><date datetime="21-11-2016">21/11</date></td>
  <td class="agenda-cell">
    Introdução ao Spring
    <ul>
      <li>Anotações</li>
      <li>Serviços: AOP, controle de transações, etc</li>
    </ul>
  </td>
</tr>
<tr>
  <td class="date-cell"><date datetime="23-11-2016">23/11</date></td>
  <td class="agenda-cell">Revisão e apresentação de trabalhos</td>
</tr>
</table>
</div>


# Leitura recomendada
TBD

# Avaliação
<section id='trabalho' />
Durante a disciplina, faremos duas avaliações da seguinte forma:

1. Um seminário, a ser realizado em 23/11, em que discutiremos sobre tecnologias Server Side diversas;
2. O design e implementação de um projeto de integração entre aplicações Java.

### Seminário
O objetivo é entender basicamente os conceitos que existem naquela tecnologia \ framework e compará-la
com outras existentes. É obrigatório implementar um exemplo mínimo. O seminário deverá
ser feito aos pares conforme o quadro.

**Framework**  | **Grupo**
---------------| -------------
Play Framework |
Node.Js        |
Grails         |
Spring Boot    |
Django         |
Express.Js     |
Backbone.Js    |
Rails          |
ASP.NET MVC    |
Flask          |
Symfony        |

### Projeto e Implementação de Aplicação
TBD


<!-- <div class="posts">
  {% for post in paginator.posts %}
  <div class="post">
    <h1 class="post-title">
      <a href="{{ post.url }}">
        {{ post.title }}
      </a>
    </h1>

    <span class="post-date">{{ post.date | date_to_string }}</span>

    {{ post.content }}
  </div>
  {% endfor %}
</div>

<div class="pagination">
  {% if paginator.next_page %}
    <a class="pagination-item older" href="{{ site.baseurl }}page{{paginator.next_page}}">Older</a>
  {% else %}
    <span class="pagination-item older">Older</span>
  {% endif %}
  {% if paginator.previous_page %}
    {% if paginator.page == 2 %}
      <a class="pagination-item newer" href="{{ site.baseurl }}">Newer</a>
    {% else %}
      <a class="pagination-item newer" href="{{ site.baseurl }}page{{paginator.previous_page}}">Newer</a>
    {% endif %}
  {% else %}
    <span class="pagination-item newer">Newer</span>
  {% endif %}
</div> -->