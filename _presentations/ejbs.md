---
layout: presentation
title: Enterprise Java Beans
description: Introdução aos EJBs
theme: black
transition: slide
---

<section>
    <h1>Plataforma JEE</h1>
</section>
<section>
    <h2>Plataforma JEE</h2>
    <section>
        <h3>O que é?</h3>
    </section>
    <section>
        <p>Especificação concebida pela comunidade e industria para fornecer um ambiente onde
        componentes distribuídos colaboram entre si.</p>
    </section>
    <section>
        <h3>Histórico</h3>
    </section>
    <section>
        <img width='80%' height="80%" src="{{site.github.url}}/media/jee_history.png">
    </section>
    <section>
        <h3>Organização</h3>
    </section>
    <section>
        <img width="45%" src="{{site.github.url}}/media/jee_tiers.png" />
    </section>
    <section>
        <p>Quem é o responsável por implementar a especificação na prática?</p>
    </section>
</section>
<section>
    <h2>Containers</h2>
    <section>
            <p>Fornecem o ambiente propício para a execução de aplicações JEE. Estão para
            os componentes da plataforma JEE assim como o S.O. está para as aplicações ou
            como a placa está para seus CIs.</p>
    </section>
    <section>
        <h3>Principais serviços</h3>
    </section>
    <section>
        <ul>
            <span class="fragment" data-fragment-index="1"><li>Localização</li></span>
            <span class="fragment" data-fragment-index="2"><li>Invocação remota</li></span>
            <span class="fragment" data-fragment-index="3"><li>Controle Transacional</li></span>
            <span class="fragment" data-fragment-index="4"><li>Segurança</li></span>
            <span class="fragment" data-fragment-index="4"><li>Escalonamento de recursos</li></span>
        </ul>
    </section>
    <section>
        <img width="20%" src="{{site.github.url}}/media/was.jpg" />
        <img width="20%" src="{{site.github.url}}/media/wildfly.png" />
        <img width="20%" src="{{site.github.url}}/media/jboss.svg" />
        <img width="20%" src="{{site.github.url}}/media/glassfish.jpg" />
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
</section>
<section>
    <h1>Session Beans</h1>
</section>
<section>
    <section><p>Encapsulam os procedimentos e regras de negócio que são executados
    durante uma sessão</p></section>
    <section><p></p></section>
</section>
<section>
    <section><h3>Algumas questões importantes sobre EJBs</h3></section>
    <section><p>Um EJB é apenas um objeto comum?</p></section>
    <section><p>Como eu posso instanciá-lo se ele é gerenciado pelo container?</p></section>
    <section><p>Como acioná-lo remotamente?</p></section>
    <section><img width="40%" src="{{site.github.url}}/media/duvida.png" /></section>
</section>
