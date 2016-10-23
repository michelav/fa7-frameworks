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
    <ul>
      <li>Histórico</li>
      <li>Principais conceitos</li>
    </ul>

    <a href="{{site.github.url}}/presentations/ejbs.html">Enterprise Java Beans</a>
    <ul>
      <li>Conceitos e tipos</li>
      <li>Modelo de componentes e arquitetura</li>
      <li>Containers que suportam EJBs</li>
      <li>Session Beans: _Stateless_ e _Stateful_</li>
    </ul>
  </td>
</tr>
<tr>
  <td class="date-cell"><date datetime="07-11-2016">07/11</date></td>
  <td class="agenda-cell">
    <a href="{{site.github.url}}/presentations/course-intro.html">Enterprise Java Beans</a>
    <ul>
      <li>Message Driven Beans</li>
      <li>Acesso a Dados: JPA</li>
    </ul>
  </td>
</tr>
<tr>
  <td class="date-cell"><date datetime="09-11-2016">09/11</date></td>
  <td class="agenda-cell">
    <a href="{{site.github.url}}/presentations/course-intro.html">Enterprise Java Beans</a>
    <ul>
      <li>Outros serviços</li>
    </ul>

    <a href="{{site.github.url}}/presentations/course-intro.html">Introdução ao Spring</a>
    <ul>
      <li>Injeção de Dependência e Inversão de Controle</li>
      <li>Beans: Ciclo de vida e escopo</li>
    </ul>
  </td>
</tr>
<tr>
  <td class="date-cell"><date datetime="16-11-2016">16/11</date></td>
  <td class="agenda-cell">
    <a href="{{site.github.url}}/presentations/course-intro.html">Introdução ao Spring</a>
    <ul>
      <li>Beans: Ciclo de vida e escopo</li>
      <li>Anotações</li>
    </ul>
  </td>
</tr>
<tr>
  <td class="date-cell"><date datetime="21-11-2016">21/11</date></td>
  <td class="agenda-cell">
    <a href="{{site.github.url}}/presentations/course-intro.html">Introdução ao Spring</a>
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

# Apresentações

  * [Course Overview]({{site.github.url}}/presentations/course-intro.html)
  * [Intro to HTML]({{site.github.url}}/presentations/html-intro.html)


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