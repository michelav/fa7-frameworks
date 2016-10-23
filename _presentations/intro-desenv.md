---
layout: presentation
title: Aplicações corporativas e componentes
description: Introdução ao desenvolvimento corporativo
theme: black
transition: slide
---

<section data-markdown>
    # Aplicações corporativas e componentes
</section>
<section data-markdown>
    [http://github.com/michelav](http://github.com/michelav)
</section>
<section>
    <h2>Boom dos anos 80 e 90...</h2>

    <img width='70%' src="{{site.github.url}}/media/client-server.jpg" />
</section>
<section>
    <h2>Aplicações monolíticas cliente servidor</h2>
    <section><h2>Principais características</h2></section>
    <section>
        <h3>Reuso...</h3>
        <p>Por meio de dados e comportamento duplicados.</p>
    </section>
    <section>
        <h3 style="color: orange">Escalabilidade...</h3>
        <p>Vertical, por meio de aumento de hardware.</p>
    </section>
    <section>
        <h3 style="color: orange">Interoperabilidade...</h3>
        <p>Quase inexistente, prevalecendo o compartilhamento  de dados.</p>
        <p class="fragment">Troca de arquivos, visões em BD, etc...</p>
        <h3 class="fragment">Aplicações são verdadeiras "ilhas".</h3>
    </section>
    <section>
        <h3 style="color: orange">Como escalar e interoperar?</h3>
        <img width='40%' src="{{site.github.url}}/media/interoperability.jpg" />

    </section>
</section>
<section>
    <h2>Componentização</h2>
    <img width='60%' height="60%" src="{{site.github.url}}/media/componentization.jpg" />
</section>
<section>
    <h1>Componente</h1>
    <section>
        <h3 style="color: orange">Definição</h3>
        <p>Artefato (ou conjunto de artefatos) que forma uma unidade
        de
        <span class="fragment grow highlight-blue" data-fragment-index="1">
        comportamento</span>
        e <span class="fragment grow highlight-blue" data-fragment-index="1">interface</span>
        bem definidos e pode ser implantado, testado,
        <span class="fragment grow highlight-blue" data-fragment-index="1">composto</span>
        e <span class="fragment grow highlight-blue" data-fragment-index="1">reusado</span>
        de forma independente.</p>
    </section>
    <section>
        <img width='60%' height="60%" src="{{site.github.url}}/media/circuit-board.png">
    </section>
    <section>
        <h3 style="color: orange">Demanda...</h3>
        Chamada Remota &bull;
        Balanceamento &bull;
        Integração &bull;
        Controle Transacional &bull;
        Auditoria &bull;
        Threading &bull;
        Assincronia &bull;
        Pooling &bull;
        Segurança &bull;
        Caching
    </section>
    <section tagcloud>
        <span style="padding-left: 0.35em; padding-right: 0.35em; line-height: 90%;" tagcloud-weight='80'>EJB</span>
        <span style="padding-left: 0.35em; padding-right: 0.35em; line-height: 90%;" tagcloud-weight='15'>DCOM</span>
        <span style="padding-left: 0.35em; padding-right: 0.35em; line-height: 90%;" tagcloud-weight='25'>ActiveX</span>
        <span style="padding-left: 0.35em; padding-right: 0.35em; line-height: 90%;" tagcloud-weight='35'>Corba</span>
        <span style="padding-left: 0.35em; padding-right: 0.35em; line-height: 90%;" tagcloud-weight='55'>OLE</span>
        <span style="padding-left: 0.35em; padding-right: 0.35em; line-height: 90%;" tagcloud-weight='40'>Servlets</span>
        <span style="padding-left: 0.35em; padding-right: 0.35em; line-height: 90%;" tagcloud-weight='80'>Spring</span>
    </section>
</section>
<section>
    <h2>Plataforma JEE</h2>
    <section>
        <p>Plataforma Java para o desenvolvimento de aplicações corporativas utilizando
        <span class="fragment grow highlight-blue">componentes distribuídos</span> com suporte a segurança, escalabilidade e alta
        disponibilidade.</p>
    </section>
    <section>
        <img width='80%' height="80%" src="{{site.github.url}}/media/jee_history.png">
    </section>
    <section>
        <h3>Camadas</h3>
        <img width="40%" src="{{site.github.url}}/media/jee_tiers.png" />
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
            <ul>
                <li>Localização</li>
                <li>Invocação remota</li>
                <li>Controle Transacional</li>
                <li>Segurança</li>
                <li>Escalonamento de recursos</li>
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
    <h2>Resumindo...</h2>
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
    <h2>E quem são esses componentes?</h2>
     <span class="fragment"><a href="{{site.github.url}}/presentations/ejbs.html"><img src="{{site.github.url}}/media/bean-320x290.png"></a></span>
</section>

