---
layout: presentation
title: Enterprise Java Beans
description: Introdução aos EJBs
theme: night
transition: slide
---

<section>
    <h1>Plataforma JEE</h1>
</section>
<section>
    <h2>Plataforma JEE</h2>
    <section>
        <h3 class="titlemark">O que é?</h3>
    </section>
    <section>
        <p align="left">Conjunto de especificações concebidas pela comunidade (JCP) e industria para fornecer um ambiente onde
            componentes distribuídos colaboram entre si.</p>
    </section>
    <section>
        <p align="left">O objetivo da plataforma é reduzir o
        <span class="fragment highlight-red" data-fragment-index="1">tempo de desenvolvimento</span>
        e <span class="fragment highlight-red" data-fragment-index="1">complexidade das aplicações</span>
        enquanto maximiza o seu
        <span class="fragment highlight-red" data-fragment-index="1">desempenho</span>.</p>
        <aside class="notes">Reforçar o tempo que se perde implementando código de infraestrutura.</aside>
    </section>
</section>
<section>
        <h2>Especificações</h2>
        <img class="stretch" src="{{site.baseurl}}/media/javaee7-specs.png">
</section>
<section>
        <h2>Histórico</h2>
        <img class="stretch" src="{{site.baseurl}}/media/jee_history.png">
        <aside class="notes">Início da plataforma exigia muitas classes e interfaces para entregar um
        comportamento. Falar sobre o benefício do modelo usado com anotações. Classes de Framework vs POJOs.</aside>
</section>
<section>
        <h2>Camadas</h2>
        <img class="stretch" src="{{site.baseurl}}/media/jee_tiers.png" />
        <aside class="notes">O foco do curso é na camada de negócio.</aside>
</section>
<!-- section>
    <h2>Camada de Negócio</h2>
    <section>
        <h4 >Onde processos e regras do domínio da aplicação são implementados</h4>
    </section>
    <section>
        <h3 class="titlemark">Por exemplo...</h3>
        <br>
        <ul>
            <li class="fragment">Carrinho de compras da loja virtual</li>
            <li class="fragment">O controle do inventário de uma distribuidora</li>
            <li class="fragment">As regras de compra de ações na corretora</li>
        </ul>
    </section>
</section -->
<section>
    <h3>Na prática, quem junta essa <em>"salada"</em> de especificações?</h3>
</section>
<section>
    <h2>Container</h2>
        <br>
        <ul>
        <li><h4>Ambiente propício para a execução de aplicações JEE.</h4></li>
        <li><h4>Conjunto de serviços básicos (operacionais) para as aplicações</h4></li>
        <li><h4>Componentes focam na implementação da lógica de negócio</h4></li>
        </ul>
</section>
<section>
    <h2>Organização</h2>
    <img class="stretch" src="{{site.baseurl}}/media/jeett_container.png">
</section>
<section>
    <h2>APIs</h2>
    <img class="stretch" src="{{site.baseurl}}/media/jeett_apis.png">
</section>
<section>
    <h2>Alguns Fornecedores</h2>
    <img width="20%" src="{{site.baseurl}}/media/glassfish.jpg">
    <img width="20%" src="{{site.baseurl}}/media/jboss.svg">
    <img width="20%" src="{{site.baseurl}}/media/was.jpg">
    <img width="20%" src="{{site.baseurl}}/media/wildfly.png">
</section>
<section><h2>Serviços Básicos</h2></section>
<section>
    <h2>Invocação Remota</h2>
    <section>
        <h4 >Uma aplicação distribuída necessita disparar execuções em componentes
        que não estão disponíveis localmente.</h4>
    </section>
    <section>
        <br><br>
        <h3 class="titlemark">RPC</h3>
        <img width="75%" src="{{site.baseurl}}/media/local_rpc.jpg" />
    </section>
    <section>
        <h3 class="titlemark">RMI/IIOP</h3><br><br>
        <ul>
            <li>Protocolo que permite comunicação remota entre objetos</li>
            <li>Objeto remoto acessado via proxy</li>
            <li>Permite interoperar Java e Corba</li>
        </ul>
        <aside class="notes">Falar sobre a importância do RMI. Mencionar a facilidade de implementação quando
        comparado com Corba. Não necesita de IDL.Comparar com outros tipos de chamada remota.</aside>
    </section>
</section>
<section>
    <h2>Localização</h2>
    <section>
        <h4>
            Aplicações distribuídas necessitam acessar recursos e componentes para
            executar suas ações.
        </h4>
    </section>
    <section>
        <h4>
            A aplicação pode estar diretamente "ligada" ao recurso ou acessá-lo
            de outra forma.
        </h4>
    </section>
    <section>
    <h3 class="titlemark">Serviço de Nomes</h3>
    <img width="90%" src="{{site.baseurl}}/media/naming_service.gif" />
    <aside class="notes">Fazer paralelo com DNS.</aside>
    </section>
    <section>
    <br><br>
    <h3 class="titlemark">JNDI</h3>
    <img width="60%" src="{{site.baseurl}}/media/jndiarch.jpg" />
    </section>
    <section>
        <h3>Localização</h3>
        <pre>
        <code class="java">
            // Lookup the remote object via JNDI
            Context ctx = new InitialContext(System.getProperties());
            Object remoteObject = ctx.lookup(“MyObj”);
            // Cast the remote object, RMI-IIOP style
            MyRemoteObj generator = (MyRemoteObj)
                PortableRemoteObject.narrow(remoteObject, MyRemoteObj.class);
            generator.doSomething();
        </code>
        </pre>
    </section>
</section>
<section>
    <h2>Recursos e Dependência</h2>
    <section>
        <p>Uma aplicação pode localizar ou construir diretamente o recurso que necessita</p>
        <pre class="fragment">
            <code class="java line-numbers">
            protected void doGet(...) {
                String mercadoria = req.getParameter("mercadoria");
                ControladorEstoque control = new ControladorEstoque();
                String status = control.reservaMercadoria(mercadoria);
                resp.getWriter().append("Status da Reserva: ").append(status);
            }
            </code>
        </pre>
    </section>
    <section>
        <h3 class="titlemark">Problemas da abordagem</h3>
        <ul>
        <li><h4 class="fragment">Código de infraestrutura misturado ao código útil (negócio).</h4></li>
        <li><h4 class="fragment">Aplicação conhece como construir o recurso. Logo, está acoplado a ele.</h4></li>
        </ul>
    </section>
    <section>
        <h4>Uma alternativa a essa abordagem, é inverter a ordem das coisas...</h4>
    </section>
    <section>
        <h3 class="titlemark">Injeção de Recurso</h3><br>
        <ul>
            <li class="fragment" data-fragment-index='0'>Permite injetar recursos em um componente</li>
            <li class="fragment" data-fragment-index='1'>Ambos devem ser gerenciados pelo container</li>
            <li class="fragment" data-fragment-index='2'>O recurso é identificado por um nome</li>
                <ul><li class="fragment" data-fragment-index='3'><code style="color: red;">@Resource</code></li></ul>
        </ul>
    </section>
    <section>
        <h3>Exemplo</h3>
        <pre>
        <code class="java">
            public class LibraryServlet extends HttpServlet {
                @Resource(lookup="java:comp/SQLiteDataSource")
                private javax.sql.DataSource dsc;
                ...
            }
        </code>
        </pre>
    </section>
    <section>
        <br><br>
        <h3 class="titlemark">Inversão de Controle</h3>
        <img class="fragment" width="55%" src="{{site.baseurl}}/media/ioc.gif">
    </section>
    <section>
        <img width="90%" src="{{site.baseurl}}/media/di.png">
    </section>
    <section>
        <h3 class="titlemark">Considerações</h3>
        <ul>
            <li><h4>O componente e o objeto devem ser criados pelo container</h4></li>
            <li><h4>O componente é um objeto gerenciado pelo container</h4></li>
            <ul>
                <li>Servlets, Managed Beans, EJBs, etc</li>
            </ul>
            <li><h4>As dependências são declaradas por anotações</h4></li>
            <ul>
                <li><code style="color: red;">@Inject, @EJB, etc</code></li>
            </ul>
            <li><h4>O objeto inserido possui um escopo</h4></li>
            <ul>
                <li><code style="color: red;">@RequestScoped, @SessionScoped, @ApplicationScoped, etc</code></li>
            </ul>
        </ul>
    </section>
    <section>
        <h4 class="titlemark">Objeto</h4>
        <pre><code class="java">
                @RequestScoped
                public class EstoqueSimples implements Estoque {
                ...
                }
        </code></pre>
        <h4 class="titlemark">Componente</h4>
        <pre><code class="java">
            public class ReservaServlet extends HttpServlet {
                @Inject private ControladorEstoque controle;
                ...
                protected void doGet(...) {
                String merc = request.getParameter("mercadoria");
                controle.avaliarPedido(merc));
            }
        </code></pre>
    </section>
</section>
<section>
    <h2>Empacotamento</h2>
    <section>
        <br><br>
        <h3 class="titlemark fragment">Estrutura de uma aplicação</h3>
        <img width="70%" class="fragment" src="{{site.baseurl}}/media/estrutura_ear.png">
    </section>
    <section>
        <br><br>
        <h3 class="titlemark fragment">Estrutura de um componente</h3>
        <img width="60%" class="fragment" src="{{site.baseurl}}/media/estrutura_ejbjar.png">
    </section>
</section>
<section>
    <h2>Exercício 1</h2>
</section>
<section>
    <p align="left">Uma aplicação corporativa reserva de mercadorias por meio de um servlet
    <code style="color: red">ReservaMercadoriaServlet</code> e um objeto do tipo
    <code style="color: red">ControleEstoque</code>.</p>
    <p align="left">Adaptar o servlet e o objeto para que a referência ao objeto seja obtida por meio de
    injeção simples com o escopo de Requisição.</p>
</section>
<section>
    <h3 class="titlemark">Dicas</h3>
    <ol>
        <li>Crie o servidor de aplicação</li>
        <li>Importe o projeto distribuidora que se encontra na pasta de exercícios</li>
        <li>User as anotações <code style="color: red">@Inject</code> e
        <code style="color: red">RequestScoped</code></li>
    </ol>
</section>