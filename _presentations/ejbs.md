---
layout: presentation
title: Enterprise Java Beans
description: Introdução aos EJBs
theme: night
transition: slide
---
<section>
<h1>EJBs</h1>
</section>
<section>
    <h2>EJBs</h2>
    <section>
        <h3 class="titlemark">O que são?!</h3>
    </section>
    <section>
        <p align="left">
        Componentes corporativos que executam no
        <span class="fragment grow highlight-red" data-fragment-index="1">lado servidor</span>,
        Podendo ser disparados <span class="fragment highlight-red" data-fragment-index="1">
        local ou remotamente</span> com todo seu
        <span class="fragment highlight-red" data-fragment-index="1">ciclo de vida gerenciado</span>
        por um container EJB e que implementam
        <span class="fragment highlight-red" data-fragment-index="1">regras de negócio</span>,
        colaborando entre si para entregar valor para o usuário final.
        </p>
    </section>
    <section>
        <h3 class="titlemark">Porque usá-los?</h3><br>
        <ul>
            <li class="fragment"><h4>Fácil implementação (POJOs)</h4></li>
            <li class="fragment"><h4>Catálogo de serviços operacionais</h4></li>
            <li class="fragment"><h4>Foco no negócio</h4></li>
        </ul>
    </section>
    <section>
        <h3 class="titlemark">Quando usar?</h3><br>
        <h4 align="left">Quando a aplicação demanda...</h4>
        <ul>
        <li><h5>Escalabilidade</h5></li>
        <li><h5>Segurança</h5></li>
        <li><h5>Controle transacional distribuído e consistente</h5></li>
        <li><h5>E todos os serviços que um container geralmente provê.</h5></li>
        </ul>
    </section>
    <section>
        <h3 class="titlemark">Tipos de Beans</h3>
    </section>
    <section>
        <h3 class="titlemark">Session Beans</h3>
        <h4>Executam uma ação específica para o cliente.</h4>
    </section>
    <section>
        <h3 class="titlemark">Message Driven Beans (MDBs)</h3>
        <h4>Permitem o processamento assíncrono de mensagens pela aplicação.</h4>
    </section>
</section>
<section>
    <h1>Session Beans</h1>
</section>
<section>
    <h2>Session Beans</h2>
    <section>
        <h4>Encapsulam os procedimentos e regras de negócio que são executados
        durante uma sessão</h4>
    </section>
    <section>
        <h4>Podem guardar, se necessário, o estado conversacional entre cliente
        e servidor</h4>
    </section>
    <section>
        <h4>Gerenciados pelo container</h4>
    </section>
    <section>
        <h4>Não são objetos persistentes</h4>
    </section>
</section>
<section>
    <h2>Stateless Session Beans</h2>
    <section>
        <ul>
            <li><h4>Executa procedimento específico sem manter o estado entre chamadas</h4></li>
                <ul><li>Ex.: verificar estoque, emprestar livro, debitar conta</li></ul>
            <li><h4><em>Thread-safe</em></h4></li>
            <li><h4>Podem ser associados a qualquer cliente</h4></li>
            <li><h4>Anotações</h4></li>
                <ul>
                    <li><code style="color: red;">@Stateless</code></li>
                    <li><code style="color: red;">@EJB</code></li>
                </ul>
        </ul>
    </section>
    <section>
        <img width="75%" src="{{site.github.url}}/media/ssb_pool.jpg">
    </section>
    <section>
        <h3 class="titlemark">Exemplo</h3>
    </section>
   <section>
        <br>
        <h4 class="titlemark">Servlet</h4>
        <pre><code class="java">
            @WebServlet("/ReservaMercadoriaServlet")
            public class ReservaMercadoriaServlet extends HttpServlet {
                @EJB ControladorSSB controle;
            protected void doGet(...) {
                String merc = request.getParameter(...);
                int reservado = controle.obterQuantidade(merc);
                ...
            }
            </code></pre>
        <h4 class="titlemark">Stateless Session Bean</h4>
        <pre><code class="java">
            @Stateless
            public class ControladorSSB {
                @Inject private Estoque meuEstoque;
                public int obterQuantidade(String merc) {
                    int qtdeEstoque = meuEstoque.obterQuantidade(merc);
                    ...
                } }
        </code></pre>
    </section>
</section>
<section>
    <h2>Exercício 2</h2>
</section>
<section>
    <h4 align="left">Atualize o projeto distribuidora para executar uma ação de reserva em um Estoque em memória
        utilizando EJBs.</h4>
</section>
<section>
    <h3 class="titlemark">Dicas</h3>
    <ol>
        <li>Não será necessário criar projeto ejbclient, nem interfaces no momento</li>
        <li>No projeto EJB crie uma classe do tipo Estoque que possa ser injetada no EJB. Essa classe
        terá os dados do estoque</li>
        <li>Use os parametros do request para indicar a mercadoria e quantidade a ser reservada</li>
        <li>Utilize as anotações características do bean: <code style="color: red;">@Stateless</code> para
        o Session e <code style="color: red;">@EJB</code> para injeção no servlet</li>
    </ol>
</section>