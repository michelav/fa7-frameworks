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
<section data-markdown>
    <script type="text/template">
        ## Problemas

        - Integração entre aplicações <!-- .element: class="fragment" data-fragment-index="1" -->
            - Dados e comportamento duplicados <!-- .element: class="fragment" data-fragment-index="2" -->
        - Serviços básicos implementados em cada aplicação separadamente <!-- .element: class="fragment" data-fragment-index="3" -->
        - Verdadeiras 'ilhas' <!-- .element: class="fragment" data-fragment-index="4" -->
    </script>
</section>
<section>
        <h2>Como escalar e interoperar?</h2>
        <img width='60%' src="{{site.github.url}}/media/interoperability.jpg" />
</section>
<section>
    <h2>Componentização</h2>
    <section>
        <img width='60%' height="60%" src="{{site.github.url}}/media/componentization.jpg" />
    </section>
    <section>
        <h3 style="color: orange">Componente</h3>
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
    <section data-markdown>
        ### Componentes demandam...
        - Chamada Remota
        - Balanceamento
        - Integração
        - Controle Transacional
        - Auditoria
        - Threading
        - Assincronia
        - Pooling
        - Segurança
        - Caching
    </section>
    <section tagcloud>
        <h3>Componente</h3>
        <span style="padding-left: 0.35em; padding-right: 0.35em; line-height: 90%;" tagcloud-weight='80'>EJB</span>
        <span style="padding-left: 0.35em; padding-right: 0.35em; line-height: 90%;" tagcloud-weight='15'>DCOM</span>
        <span style="padding-left: 0.35em; padding-right: 0.35em; line-height: 90%;" tagcloud-weight='25'>ActiveX</span>
        <span style="padding-left: 0.35em; padding-right: 0.35em; line-height: 90%;" tagcloud-weight='35'>Corba</span>
        <span style="padding-left: 0.35em; padding-right: 0.35em; line-height: 90%;" tagcloud-weight='55'>OLE</span>
        <span style="padding-left: 0.35em; padding-right: 0.35em; line-height: 90%;" tagcloud-weight='40'>Servlets</span>
    </section>
</section>