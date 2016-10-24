---
layout: presentation
title: Enterprise Java Beans
description: Introdução aos EJBs
theme: black
transition: slide
---

<section>
    <h2>Relembrando...</h2>
    <section>
        <h3>Proliferação de aplicações</h3>
        <p>O crescimento da TI nas décadas de 80 e 90 alavancaram a criação de aplicações monolíticas.
        Os procedimentos, antes manuais, foram automatizados na forma de sistemas.</p>
    </section>
    <section>
        <h3>Críticas ao modelo arquitetural</h3>
        <p>Com a necessidade de integração entre os sistemas começou-se a perceber
        a necessidade de uma nova arquitetura que promovesse o reuso, integração
        e escalabilidade.</p>
    </section>
    <section>
        <h3>Plataforma JEE</h3>
        <p>A plataforma JEE foi concebida para fornecer um ambiente onde componentes
        distribuídos colaboram entre si para atender os requisitos funcionais e
        não funcionais dos usuários.</p>
    </section>
    <section>
        <h3>Containers</h3>
        <p>Para que esses componentes executem, eles necessitam de um ambiente propício que
        forneça serviços como segurança, localização, controle transacional, etc.</p>
    </section>
</section>
<section>
    <h1>EJBs</h1>
</section>
<section>
    <h2>EJBs</h2>
    <section>
        <h3>O que são?!</h3>
    </section>
    <section>
        Componentes corporativos que executam no lado servidor...
    </section>
    <section>
        Podendo ser disparados local ou remotamente...
    </section>
    <section>
        Com todo seu ciclo de vida gerenciado por um container EJB...
    </section>
    <section>
         e que implementam regras de negócio, colaborando entre si para entregar
         valor para o usuário final.
    </section>
    <section>
        <h3>Importância</h3>
    </section>
    <section>
        "Venda casada": componentes de fácil implementação (POJOs) e uma variedade de serviços.
    </section>
    <section>
        Permitem que o desenvolvedor foque no que é importante para o negócio.
    </section>
    <section>
        <h3>Quando usar?</h3>
    </section>
    <section>
        Aplicação necessita de:
        <ul>
            <li>Escalabilidade</li>
            <li>Múltiplos clientes com origem variada</li>
            <li>Consistência mantida entre diversas transações</li>
        </ul>
    </section>
    <section>
        <h3>Principais componentes</h3>
    </section>
    <section>
        <h3>Session Beans</h3>
        Encapsula a lógica de negócio da aplicação podendo guardar ou não o "estado conversacional"
        entre cliente e o servidor.
    </section>
    <section>
        <h3>Message Driven Beans (MDBs)</h3>
        Permitem o processamento assíncrono de mensagens pela aplicação.
    </section>
    <section>
        <h3>Entidades</h3>
        Responsáveis pela persistência dos dados.
    </section>
    <section>
          Além dessas estruturas o container EJB fornece diversos serviços básicos
          para o bom funcionamento dos EJBs e entidades. Vamos detalhar um pouco os
          serviços mais importantes!
    </section>
</section>
<section>
    <h1>EJB - Serviços Básicos</h1>
</section>>