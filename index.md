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
  - Transações
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
  <td class="date-cell"><date datetime="02-10-2017">02/10</date></td>
  <td class="agenda-cell">
    Desenvolvimento corporativo
    (<a href="{{site.baseurl}}/presentations/intro-desenv.html">HTML</a>)
    (<a href="{{site.baseurl}}/pdfs/intro-desenv.pdf">PDF</a>)
    <ul>
      <li>Histórico</li>
      <li>Principais conceitos</li>
    </ul>
    Plataforma Java EE
    (<a href="{{site.baseurl}}/presentations/javaee_plat.html">HTML</a>)
    (<a href="{{site.baseurl}}/pdfs/javaee_plat.pdf">PDF</a>)
    <ul>
      <li>O que é a plataforma e histórico</li>
      <li>Containers</li>
      <li>Principais serviços</li>
    </ul>
    Enterprise Java Beans
    (<a href="{{site.baseurl}}/presentations/ejbs.html">HTML</a>)
    (<a href="{{site.baseurl}}/pdfs/ejbs.pdf">PDF</a>)
    <ul>
      <li>Conceitos e tipos</li>
      <li>Modelo de componentes e arquitetura</li>
      <li>Session Beans: <em>Stateless</em></li>
    </ul>
  </td>
</tr>
<tr>
  <td class="date-cell"><date datetime="04-10-2017">04/10</date></td>
  <td class="agenda-cell">
    Enterprise Java Beans
    (<a href="{{site.baseurl}}/presentations/ejbs.html">HTML</a>)
    (<a href="{{site.baseurl}}/pdfs/ejbs.pdf">PDF</a>)
    <ul>
      <li>Session Beans</li>
      <ul><li>Stateful e Singletons</li></ul>
      <li>Comunicação Assíncrona</li>
      <ul>
        <li>Modelos</li>
        <li>JMS</li>
      </ul>
    </ul>
    </td>
</tr>
<tr>
  <td class="date-cell"><date datetime="09-10-2017">09/10</date></td>
  <td class="agenda-cell">
    Enterprise Java Beans
    (<a href="{{site.baseurl}}/presentations/ejbs.html">HTML</a>)
    (<a href="{{site.baseurl}}/pdfs/ejbs.pdf">PDF</a>)
      <ul>
        <li>Comunicação Assíncrona</li>
          <ul>
            <li>JMS</li>
            <li>Message Driven Beans</li>
          </ul>
        <li>Web Services</li>
          <ul>
            <li>SOAP vs REST</li>
            <li>Estratégias de implementação</li>
          </ul>
      </ul>
    Entidades
    (<a href="{{site.baseurl}}/presentations/persistencia.html">HTML</a>)
    (<a href="{{site.baseurl}}/pdfs/persistencia.pdf">PDF</a>)
    <ul>
      <li>Entities e JPA</li>
      <li>Transações</li>
    </ul>
  </td>
</tr>
<tr>
  <td class="date-cell"><date datetime="11-10-2017">11/10</date></td>
  <td class="agenda-cell">
    Spring
    (<a href="{{site.baseurl}}/presentations/spring.html">HTML</a>)
    (<a href="{{site.baseurl}}/pdfs/spring.pdf">PDF</a>)
    <ul>
      <li>Injeção de Dependência e Inversão de Controle</li>
      <li>Beans: Ciclo de vida e escopo</li>
      <li>Anotações</li>
    </ul>
  </td>
</tr>
<tr>
  <td class="date-cell"><date datetime="16-10-2017">16/10</date></td>
  <td class="agenda-cell">
    Spring
    (<a href="{{site.baseurl}}/presentations/spring.html">HTML</a>)
    (<a href="{{site.baseurl}}/pdfs/spring.pdf">PDF</a>)
    <ul>
      <li>Anotações</li>
      <li>Serviços: AOP, controle de transações, etc</li>
    </ul>
  </td>
</tr>
<tr>
  <td class="date-cell"><date datetime="18-10-2017">18/10</date></td>
  <td class="agenda-cell">Revisão e apresentação de trabalhos</td>
</tr>
</table>
</div>


# Leitura recomendada
TBD

# Avaliação
<section id='trabalho' />

Durante a disciplina, faremos o design e implementação de um projeto de integração entre aplicações Java EE.

### Projeto e Implementação de Aplicação

O projeto consistirá da implementação de algumas funcionalidades em um grupo de aplicações Java EE. O processo de
avaliação será conduzido pelo [Github Classroom](https://classroom.github.com/). Cada membro das equipes farão sua
inscrição na avaliação por meio do link da [avaliação no classroom](https://classroom.github.com/g/RYhpZNvo). Após isso,
as equipes farão um _fork_ do [repositório inicial](https://github.com/michelav/uni7-frameworks-trab) para trabalho.
A descrição detalhada do trabalho, prazo e formato para entrega estão descritos no README do repositório.

