---
layout: presentation
title: Desenvolvimento com frameworks e componentes
description: Introdução ao desenvolvimento corporativo
theme: night
transition: slide
---

<section data-markdown>
    # Dev com frameworks e componentes
</section>
<section><h2>Apresentações</h2></section>
<section>
    <h2>Objetivos</h2>
    <section>
        <h3>Entender a demanda e os conceitos que originaram as "aplicações corporativas"</h3>
    </section>
    <section>
        <h3>Perceber a importância de componentização e quais as consequências dessa prática</h3>
    </section>
    <section>
        <h3>Entender o que são containers e como eles interagem com os componentes</h3>
    </section>
    <section>
        <h3>Conhecer a especificação JEE e seus principais elementos</h3>
    </section>
    <section>
        <h3>Implementar exemplos das principais estruturas da arquitetura JEE: session beans,
        MDBs e entidades.</h3>
    </section>
    <section>
        <h3>Conhecer a proposta do <em>framework</em> Spring e seus principais elementos</h3>
    </section>
    <section>
        <h3>Implementar exemplos de aplicações utilizando Spring.</h3>
    </section>
    <section><h3 class="titlemark">E o mais importante...</h3></section>
</section>
<section><h2>Divertir-se!</h2><img class='stretch' src="{{site.github.url}}/media/programmer_matrix.jpg" /></section>
<section>
    <h2>Informações</h2>
    <section>
        <h4 align="left">As informações sobre o curso estarão disponíveis no meu repositório GitHub</h4>
        <h4 align="left"><a href="https://github.com/michelav/uni7-frameworks">
        https://github.com/michelav/uni7-frameworks</a></h4>
    </section>
    <section><h4 align="left">A avaliação será feita por meio de um trabalho e seminário. Ambos serão definidos
     oportunamente</h4></section>
    <section>
    <h3 class="titlemark">Referências</h3>
        <ul>
            <li>Mastering EJBs</li>
            <li>EJB in Action</li>
            <li>Spring in Action</li>
            <li>Stack Overflow</li>
            <li>Google is your friend...</li>
        </ul>
    </section>
</section>
<section>
    <h2>Boom dos anos 80 e 90...</h2>
    <img class='stretch' src="{{site.github.url}}/media/client-server.jpg" />
    <aside class="notes">Falar sobre downsizing e como isso impactou o desenvolvimento das aplicações. Aplicações
    centralizadas em um Mainframe vs Aplicações em PC</aside>
</section>
<section>
    <h3><p>Aplicações <span class="fragment highlight-red" data-fragment-index="1">monolíticas</span> e
    <span class="fragment highlight-red" data-fragment-index="1">"departamentalizadas"</span> proliferavam nas grandes
    empresas</p></h3>
</section>
<section>
    <h2>Principais características</h2>
    <section>
        <h3 class="titlemark">Coesão e encapsulamento...</h3>
        <p>Código que trata dos procedimentos de negócio é implementado em conjunto
        com aqueles que realizam tarefas de "infraestrutura".</p>
        <aside class="notes">Ressaltar a diferença de abstração entre os tipos de procedimentos.
        Negócio: mais abstrato. Infra: Menos abstrato. Conceituar tarefas de Infraestrutura. Ex: Abrir arquivos,
        conectar com BD, abrir sockets.</aside>
    </section>
    <section>
        <h3 class="titlemark">Reuso...</h3>
        <p>Por meio de dados e comportamento duplicados.</p>
    </section>
    <section>
        <h3 class="titlemark">Escalabilidade...</h3>
        <p>Vertical, por meio de aumento de hardware.</p>
    </section>
    <section>
        <h3 class="titlemark">Interoperabilidade...</h3>
        <p align="left">Quase inexistente, prevalecendo o compartilhamento  de dados. Ex.:</p>
        <ul>
            <li>Troca de arquivos</li>
            <li>visões em BD</li>
        </ul>
        <p  align="left" class="titlemark">Aplicações eram verdadeiras "ilhas".</p>
    </section>
</section>
<section>
    <h2> E agora... Como escalar e interoperar?</h2>
</section>
<section>
    <h2>Componentização</h2>
    <img class="stretch" src="{{site.github.url}}/media/components.png" />
</section>
<section>
    <h2>Componente</h2>
    <section>
        <h3 class="titlemark">Definição</h3>
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
</section>
<section>
        <img class="stretch" src="{{site.github.url}}/media/circuit-board.png">
</section>
<section>
    <h3>Componentes de software demandam</h3>
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
<section>
    <h2>Recapitulando...</h2>
    <section>
        <h3 class="titlemark">Proliferação de aplicações</h3>
        <p>O crescimento da TI nas décadas de 80 e 90 alavancaram a criação de aplicações monolíticas.
        Os procedimentos, antes manuais, foram automatizados na forma de sistemas.</p>
    </section>
    <section>
        <h3 class="titlemark">Críticas ao modelo arquitetural</h3>
        <p>Novos requisitos não funcionais foram propostos. Escalabilidade e integração plena
        não era mais um luxo e sim necessidade básica. Dessa forma, surgiu
        a necessidade de uma nova arquitetura que promovesse o reuso, integração
        e escalabilidade.</p>
    </section>
    <section>
        <h3 class="titlemark">Novo modelo arquitetural</h3>
        <p>A ideia de agrupar código / comportamento / procedimentos em componentes permitiu
        tratar esses artefatos de forma separada, distribuindo-os, reusando-os e escalando-os
        de forma a atender os requisitos impostos pelos usuários das aplicações.</p>
    </section>
    <section>
        <h3 class="titlemark">E o que Java tem com isso?!</h3>
        <p>A plataforma JEE tornou-se a proposta adequada para desenvolvimento de aplicações
        corporativas em Java.</p>
        <a href="{{site.github.url}}/presentations/javaee_plat.html">
        <img width="15%" src="{{site.github.url}}/media/javaee_logo.png"></a>
    </section>
</section>
