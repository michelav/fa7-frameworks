---
layout: presentation
title: Desenvolvimento com frameworks e componentes
description: Introdução ao desenvolvimento corporativo
theme: black
transition: slide
---

<section data-markdown>
    # Desenvolvimento com _frameworks_ e componentes
</section>
<section>
    <h2>Introdução</h2>
    <section><h3>Apresentações</h3></section>
    <section><h3>Objetivos</h3></section>
    <section>
        <p>Compreender os conceitos e neccessidades "por trás" das aplicações corporativas</p>
    </section>
    <section>
        <p>Perceber a importância de componentes corporativos</p>
    </section>
    <section>
        <p>Entender o que são containers e como eles interagem com os componentes</p>
    </section>
    <section>
        <p>Conhecer a especificação JEE e seus principais elementos</p>
    </section>
    <section>
        <p>Implementar exemplos das principais estruturas da arquitetura JEE: session beans,
        MDBs e entidades.</p>
    </section>
    <section>
        <p>Conhecer a proposta do <em>framework</em> Spring e seus principais elementos</p>
    </section>
    <section>
        <p>Implementar exemplos de aplicações utilizando Spring.</p>
    </section>
    <section><h3>E o mais importante...</h3></section>
    <section><p>Divertir-se implementando qualquer coisa.</p></section>
    <section><h3>Agenda</h3></section>
    <section>
        <p>Agenda</p>
    </section>
    <section>
        <h3>Informações</h3>
    </section>
    <section data-markdown>
    [http://github.com/michelav](http://github.com/michelav)
    </section>
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
        <h3>Escalabilidade...</h3>
        <p>Vertical, por meio de aumento de hardware.</p>
    </section>
    <section>
        <h3>Interoperabilidade...</h3>
        <p>Quase inexistente, prevalecendo o compartilhamento  de dados.</p>
        <p class="fragment">Troca de arquivos, visões em BD, etc...</p>
        <p class="fragment">Aplicações são verdadeiras "ilhas".</p>
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
        <h3>Definição</h3>
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
        <h3>Demandam...</h3>
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
    <section><h3>Frameworks de componentes conhecidos</h3></section>
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
        <h3>Novo modelo arquitetural</h3>
        <p>Aplicações compostas por componentes distribuídos e reusáveis.</p>
    </section>
    <section>
        <h3>E agora?!</h3>
        <p>A plataforma JEE era a proposta do momento para as aplicações Java.</p>
        <a href="{{site.github.url}}/presentations/ejbs.html">
        <img width="15%" src="{{site.github.url}}/media/javaee_logo.png"></a>
    </section>
</section>
