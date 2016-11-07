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
    <section><h3 class="titlemark">Tipos de Session Beans</h3></section>
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
    <h2>Exercício 2</h2><br />
    <h4 align="left">Atualize o projeto distribuidora para executar uma ação de reserva em um Estoque em memória
        utilizando EJBs.</h4>
</section>
<section>
    <h3 class="titlemark">Dicas</h3>
    <ol>
        <li>Não será necessário criar projeto ejbclient, nem interfaces no momento</li>
        <li>No projeto EJB crie uma classe do tipo Estoque que possa ser injetada no EJB. Essa classe
        terá os dados do estoque</li>
        <li>Use os parâmetros do request para indicar a mercadoria e quantidade a ser reservada</li>
        <li>Utilize as anotações características do bean: <code style="color: red;">@Stateless</code> para
        o Session e <code style="color: red;">@EJB</code> para injeção no servlet</li>
    </ol>
</section>
<section>
    <h2>Stateful Sesion Bean</h2>
    <section data-markdown>
        <script type="text/template">
        - #### Mantém o estado conversacional durante as interações com o cliente
            <!-- .element: class="fragment" data-fragment-index="1" -->
        - ####Thread-safe <!-- .element: class="fragment" data-fragment-index="2" -->
        - #### Cada cliente é associado a sua instância até que a sessão termine
            <!-- .element: class="fragment" data-fragment-index="3" -->
        - #### Anotação <!-- .element: class="fragment" data-fragment-index="4" -->
            - <!-- .element: style="color: red;" class="fragment" data-fragment-index="4" --> `@Stateful` <!-- .element: style="color: red;" class="fragment" data-fragment-index="4" -->
            - <!-- .element: style="color: red;" class="fragment" data-fragment-index="4" --> `@Remove` <!-- .element: style="color: red;" class="fragment" data-fragment-index="4" -->
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
        ### Quando utilizar? <!-- .element: class="titlemark" -->
        - #### O componente deve guardar o estado do cliente durante várias chamadas <!-- .element: class="fragment" data-fragment-index="0" -->
        - #### O componente gerencia um fluxo de trabalho para o cliente <!-- .element: class="fragment" data-fragment-index="1" -->
            - ####  Exemplo clássico: _wizards_
            <!-- .element: class="fragment" data-fragment-index="2" -->
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
            ![Stateful Session Bean Pool]({{site.github.url}}/media/sfsb_pool.jpg)
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
            #### Stateful Bean <!-- .element: class="titlemark" -->
            ```java
            @Stateful
            public class ComprasBean {

                public void adicionarItem(Item item) {...}

                @Remove
                public Compra processarCompra(...) {...}
            }
            ```
        </script>
    </section>
</section>
<section data-background-image="{{site.github.url}}/media/pills.png" data-background-size="cover">
    <h2>Stateless vs Stateful</h2>
    <section>
        <h3>
            <span class="fragment fade-in">
            <span class="fragment highlight-dark-red">Escalabilidade</span>
            </span>
        </h3>
    </section>
    <section>
        <h3 class="fragment highlight-dark-red">Desempenho</h3>
    </section>
    <section>
        <h3 class="fragment highlight-dark-red">Uso de Memória</h3>
    </section>
    <section>
        <h3 class="fragment highlight-dark-blue">Tráfego de Dados</h3>
    </section>
</section>
<section>
    <h2>Singleton</h2>
        <section data-markdown>
        <script type="text/template">
        - #### Instanciado uma única vez e mantido durante todo o ciclo de vida da aplicação
            <!-- .element: class="fragment" data-fragment-index="1" -->
        - #### Mantém o estado durante as chamadas <!-- .element: class="fragment" data-fragment-index="2" -->
        - #### Alternativa a variáveis estáticas e servlets de inicialização
            <!-- .element: class="fragment" data-fragment-index="3" -->
        - #### Também executa ações de "limpeza" durante o encerramento da aplicação
            <!-- .element: class="fragment" data-fragment-index="4" -->
        - #### Anotações <!-- .element: class="fragment" data-fragment-index="5" -->
            - <!-- .element: class="fragment" data-fragment-index="5" --> `@Stateful` <!-- .element: style="color: red;" class="fragment" data-fragment-index="4" -->
            - <!-- .element: class="fragment" data-fragment-index="5" --> `@Startup` <!-- .element: style="color: red;" class="fragment" data-fragment-index="4" -->
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
        ### Quando utilizar? <!-- .element: class="titlemark" -->
        - #### Quando uma informação precisa ser compartilhada por toda a aplicação, durante todo o seu ciclo de vida
            <!-- .element: class="fragment" data-fragment-index="0" -->
        - #### A aplicação necessita executar alguma ação durante sua inicialização ou encerramento
            <!-- .element: class="fragment" data-fragment-index="1" -->
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
            ![Singleton Session Bean Pool]({{site.github.url}}/media/singleton_pool.png)
                <!-- .element: width="65%" -->
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
            #### Singleton Bean <!-- .element: class="titlemark" -->
            ```java
                @Singleton
                @Startup
                public class DefaultFeaturedItem implements FeaturedItem {
                    private Connection connection;
                    ...
                }
            ```
        </script>
    </section>
</section>
<section>
    <h2>Exercício 3</h2><br />
    <h4 align="left">O projeto da distribuidora necessita carregar informações de domínio sobre os fornecedores
    e situação de produtos nos fornecedores. Crie um singleton session bean que carregue essas informações.</h4>
</section>
<section>
    <h1>Beans e Interfaces</h1>
</section>
<section>
    <h2>Beans e Interfaces</h2>
    <section data-markdown>
        <script type="text/template">
            ## Formas de acesso <!-- .element: class="titlemark" -->
            - #### Métodos públicos da classe vs Interfaces
                - ##### Porque usar interfaces?
            - #### Interface local vs Remota
                - ##### Quando utilizar?
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
            ## Formas de acesso <!-- .element: class="titlemark" -->
            * #### Métodos públicos da classe do bean
                * ##### `@EJB`
            * #### Interface Local
                - ##### `@local`
            * #### Interface Remota
                - ##### `@remote`
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
            ## Interface Local <!-- .element: class="titlemark" -->
            ```java
                @local
                public interface MyInterface {...}
                ...
                @Stateless
                public class MyClass implements MyInterface {...}
            ```
            ```java
                public interface MyInterface {...}
                ...
                @local(MyInterface.class)
                @Stateless
                public class MyClass implements MyInterface {...}
            ```
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
            ## Interface Remota <!-- .element: class="titlemark" -->
            ```java
                @Remote
                public interface MyRemoteInterface {...}
                ...
                @Stateful
                public class MyClass implements MyRemoteInterface {...}
            ```
            ```java
                public interface MyRemoteInterface {...}
                ...
                @local(MyRemoteInterface.class)
                @Stateful
                public class MyClass implements MyRemoteInterface {...}
            ```
        </script>
    </section>
        <section data-markdown>
        <script type="text/template">
            ## Como localizar ou injetar beans que só estão disponíveis remotamente?
        </script>
    </section>
</section>
<section data-markdown>
    <script type="text/template">
        ## Acessando beans
        ### JNDI <!-- .element: class="titlemark" -->
        ![JNDI Context]({{site.github.url}}/media/jndi_contexts.jpg) <!-- .element: width="stretch" -->
    </script>
</section>
<section>
     <h2>JNDI</h2>
     <h3 class="titlemark">Sintaxe da Localização</h3>
    <code>
        java:[namespace]/[app]/[modulo]/[bean][!interface]
    </code>
</section>
<section data-markdown>
    <script type="text/template">
        ## Namespaces
        **Namespace** | **Descrição**
         ------------ | -------------
         global | Compartilhado por todos os módulos e componentes do ambiente
         app    | Nomes compartilhados dentro da mesma aplicação (EAR)
         module | Nomes compartilhados dentro do mesmo módulo (EJBs e WARs)
    </script>
</section>
<section data-markdown>
    <script type="text/template">
        ## Nomeando Beans
        ### `@Stateless` <!-- .element: class="titlemark" --> / `@Stateful` <!-- .element: class="titlemark" -->
        **Atributo** | **Descrição**
         ------------ | -------------
         name | Nome do Bean. Quando não indicado é usado o nome da classe.
         mappedName    | Nome global atribuído ao Bean. Não é portável.
         description | Descrição do Bean.
    </script>
</section>
<section>
        <h2>Exemplos</h2>
        <section>
            Todos os exemplos mencionados tratam de uma aplicação <code style="color: red;">MyApp</code> com módulo
            <code style="color: red;">MyModule</code>.
        </section>
        <section>
            <pre><code>
                package fa7.test;
                ...
                @Stateful
                public class MyBean {...}
            </code></pre>
            <h5 class="titlemark">Nome JNDI</h5>
            <p align="left" class="fragment" style="margin: 0;"><code>java:global/MyApp/MyModule/MyBean</code></p>
            <p align="left" class="fragment" style="margin: 0;"><code>java:global/MyApp/MyModule/MyBean!fa7.test.MyBean</code></p>
            <p align="left" class="fragment" style="margin: 0;"><code style="align-content: left;">java:app/MyModule/MyBean</code></p>
            <p align="left" class="fragment" style="margin: 0;"><code style="align-content: left;">java:app/MyModule/MyBean!fa7.test.MyBean</code></p>
            <p align="left" class="fragment" style="margin: 0;"><code style="align-content: left;">java:module/MyBean</code></p>
            <p align="left" class="fragment" style="margin: 0;"><code style="align-content: left;">java:module/MyBean!fa7.test.MyBean</code></p>
        </section>
        <section>
            <pre><code>
                package fa7.test;
                ...
                @Remote(RemoteInterface.class)
                @Stateless(name="RemoteBean")
                public class MyBean implements RemoteInterface {...}
            </code></pre>
            <h5 class="titlemark">Nome JNDI</h5>
            <p align="left" class="fragment" style="margin: 0;"><code>java:global/MyApp/MyModule/RemoteBean</code></p>
            <p align="left" class="fragment" style="margin: 0;"><code>java:global/MyApp/MyModule/RemoteBean!fa7.test.RemoteInterface</code></p>
            <p align="left" class="fragment" style="margin: 0;"><code>java:app/MyModule/RemoteBean</code></p>
            <p align="left" class="fragment" style="margin: 0;"><code>java:app/MyModule/RemoteBean!fa7.test.RemoteInterface</code></p>
            <p align="left" class="fragment" style="margin: 0;"><code>java:module/RemoteBean</code></p>
            <p align="left" class="fragment" style="margin: 0;"><code>java:module/RemoteBean!fa7.test.RemoteInterface</code></p>
        </section>
        <section>
            <br /><br /><h3 class="titlemark">Session Bean</h3>
            <pre><code>
                package fa7.test;
                ...
                @Remote(RemoteInterface.class)
                @Stateless(name="RemoteBean")
                public class MyBean implements RemoteInterface {...}
            </code></pre><br>
            <h3 class="titlemark">Cliente</h3>
                <pre><code>
                ...
                @WebServlet("/MyServlet")
                public class MyServlet extends HttpServlet {
                    @EJB(lookup="java:global/MyApp/MyModule/RemoteBean")
                    RemoteInterface bean;
                   ...
                }
            </code></pre>
        </section>
</section>
<section>
    <h2>Exercício 4</h2><br />
    <h4 align="left">
    Forneça um Stateful Session Bean para controle de um "carrinho de reservas" de mercadorias onde
    o cliente possa incluir ou retirar produtos. O Bean deve prover uma operação para conclusão da reserva. Crie um
    Servlet em uma aplicação Web que não seja distribuída junto com o componente de negócio e acesse o Bean remotamente.
    </h4>
</section>
<section>
    <h2>Ciclo de Vida dos Beans de Sessão</h2>
</section>
<section>
    <h2>Stateless Session Beans</h2>
    <section>
        <img width="100%" src="{{site.github.url}}/media/ssb_lifecycle.png">
    </section>
    <section>
        <h3 class="titlemark"><code>@PostConstruct</code></h3>
        <h4 align="left">Executado logo após a construção do Bean e a injeção dos recursos.
        Alocam-se todos os recursos necessários para a execução.</h4>
    </section>
    <section>
        <h3 class="titlemark"><code>@PreDestroy</code></h3>
        <h4 align="left">Executado logo antes da finalização do Bean. Liberam-se todos os recursos alocados previamente.
        Após isso, o bean está elegível para o <em>"garbage collector"</em>.</h4>
    </section>
</section>
<section>
    <h2>Stateful Session Beans</h2>
    <section>
        <br>
        <img width="80%" src="{{site.github.url}}/media/sfssb_lifecycle.png">
    </section>
    <section>
        <h3 class="titlemark"><code>@PostConstruct</code> / <code>@PreDestroy</code></h3>
        <h4 align="left">São executados nos mesmos cenários e de forma similar aos Stateless Session Beans.</h4>
    </section>
    <section>
        <h3 class="titlemark"><code>@PrePassivate</code></h3>
        <h4 align="left">Executado logo antes do bean ser passivado pelo Container.
        De maneira análoga ao Pre Destroy, este é o momento para liberação de recursos alocados.</h4>
    </section>
    <section>
        <h3 class="titlemark"><code>@PostActivate</code></h3>
        <h4 align="left">Executado logo após a ativação do Bean e antes dele responder as chamadas de seu cliente.
        Alocam-se os recursos necessários.</h4>
    </section>
    <section>
        <h3 class="titlemark"><code>@Remove</code></h3>
        <h4 align="left">Executado logo após a expiração do Bean
        (bean passivado e sem responder chamadas de seu cliente) ou quando o cliente invoca algum método marcado
        com a anotação. O bean é marcado para a "coleta de lixo".</h4>
    </section>
</section>
<section>
    <h2>SIngleton Session Beans</h2>
    <section>
        <img width="100%" src="{{site.github.url}}/media/ssb_lifecycle.png">
    </section>
</section>
<section>
    <h2>Para Pensar...</h2>
</section>
<section>
    <h3 class="titlemark">Qual o melhor <em>design</em> para o problema</h3>
    <section>
        <h4 align="left">
            Uma aplicação corporativa não apresente gargalos em memória, mas o cliente comenta sobre
            o tempo de espera ao exibir as telas mais complexas da aplicação.</h4>
            <h4 align="left">As telas são formadas
            por diversos componentes visuais que contém dados de domínio da aplicação (por exemplo,
            listas dos estados, cidades, situações de um produto, etc).</h4>
        <h4 align="left">Esses dados são oriundos de um sistema
            legado e estão armazenados em arquivos de forma sequencial. Qual a sua sugestão para
            melhorar o desempenho da aplicação?
        </h4>
    </section>
    <section>
        <h4 align="left">
            Sua empresa está substituindo o antigo sistema de e-commerce por uma solução em Java EE.
            Um dos requisitos do novo sistema é atender a uma vasta demanda de compras online na Internet.</h4>
        <h4 align="left">
            Quanto a essa demanda, a indicação é que o sistema poderá ter vários clientes de tipos diferente
            (browser, aplicações desktop, etc) gerando um número alto de transações por segundo.</h4>
        <h4 align="left">
            Um dos problemas do sistema anterior era o controle da banda, já que o link disponível para esse acesso
            não é de alta velocidade. Qual a sua proposta de solução para esse problema específico?</h4>
    </section>
</section>
<section>
    <h2>Exercício 5</h2>
    <h4 align="left">Ajuste o singleton bean do exercício 3 para carregar as informações de domínio no início
    da aplicação.</h4>
</section>

<section>
    <h2>Assincronia na Plataforma Java EE</h2>
</section>
<section>
    <h2>Síncrono vs Assíncrono</h2>
    <img class="stretch" src="{{site.github.url}}/media/syncAsync.gif">
</section>
<section data-markdown>
    <script type="text/template">
    ## Quando usar


        - #### Procedimentos de longa duração em que você não precisa acompanhar sua execução;
        - #### Procedimentos de longa duração em que você precisa conferir o resultado final;
        - #### Aumentar a taxa de processamento da aplicação;
        - #### Melhorar o tempo de resposta da aplicação.
    </script>
</section>
<section>
    <h2>Como implementar</h2>
    <ol>
        <li><h4>Utilizar a anotação <span class="code-red">@Asynchronous</span></h4></li>
        <li>
            <h4>O resultado estará disponível na forma de uma implementação de
                <span class="code-red">java.util.concurrent.Future&lt;V&gt;</span>
            </h4>
        </li>
    </ol>
</section>
<section>
    <h5 class="titlemark">Cliente</h5>
        <pre><code>
            public class MyServlet extends HttpServlet {
                @EJB
                MailerBean bean;
                ...
                public void processSomething(...) {
                    ... // Processando algo no metodo
                    Future&lt;String&gt; status = bean.sendMessage(email);
                    ... // Continua processando
                    status.get() // Checa status
                }
            }
    </code></pre>
    <h5 class="titlemark">Bean</h5>
        <pre><code>
            @Stateless
            public class MailerBean {
                ...
                @Asynchronous
                public Future&lt;String&gt; sendMessage(String email) {
                    try {
                        // Faça Algo...
                        status = "Enviado";
                    } catch (MessagingException ex) {
                        status = "Erro no envio: " + ex.getMessage();
                    }
                    return new AsyncResult&lt;&gt;(status);
                }
            }
        </code></pre>
</section>
<section data-markdown>
    <script type="text/template">
        ## Sobre a Abordagem

        ### Pontos Relevantes <!-- .element: class="titlemark" -->

        - #### O contexto transacional não é propagado ao usar a invocação assíncrona
        - #### Pode ser usado em qualquer tipo de bean de sessão
        - #### O cliente pode cancelar a execução via API da interface <span class="code-red">Future</span>
        - #### Essa abordagem não é tolerante à falhas ou quedas do container
    </script>
</section>
<section data-markdown>
    <script type="text/template">
        ## Exercício 6


        O procedimento de submissão das reservas da distribuidora necessita ser alterado para realizar
        verificações de estoque entre os vários fornecedores. Ajuste-o para ser executado de forma assíncrona.
        Confirme o resultado. <!-- .element: align="justify" -->
    </script>
</section>
<section>
    <h2>Mensageria, JMS e MDBs</h2>
</section>
<section data-markdown>
    <script type="text/template">
        ## Tópicos

        - #### Arquitetura orientada a mensagens
        - #### Modelos de troca de mensagem
        - #### JMS
        - #### MDBs
    </script>
</section>
<section>
    <h2>Arquitetura</h2>
    <section data-markdown>
        <script type="text/template">
            - Mensagens integram os diversos componentes da aplicação
            - Assincronia
            - Facilita a distribuição
            - Dificulta a lógica de programação e debug
            - Centrado em um middleware (MOM)
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
        ![MoA]({{site.github.url}}/media/moa.png) <!-- .element: width="90%" -->
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
        ### Message Oriented Middleware (MOM) <!-- .element: class="titlemark" -->
        ![Middleware]({{site.github.url}}/media/middleware.jpg) <!-- .element: width="90%" -->
        </script>
    </section>
</section>
<section>
    <h2>Conceitos</h2>
    <section>
        <h3 class="titlemark">Emitente \ Produtor \ Publicador</h3><br />
        <h4>Gerador de informação que será encaminhada para algum destino.</h4>
    </section>
    <section>
        <h3 class="titlemark">Destinatário \ Consumidor \ Subscritor</h3><br />
        <h4>Consumidor ou interessado em informação que é trafegada por um meio.</h4>
    </section>
    <section>
        <h3 class="titlemark">Mensagem \ Evento</h3><br />
        <h4>É estrutura que carrega a informação trafegada pelo meio de comunicação.</h4>
    </section>
    <section>
        <h3 class="titlemark">Canal</h3><br />
        <h4>Meio pelo qual a mensagem ou evento é trafegado entre o produtor, consumidor e as outras
        estruturas do meio de comunicação.</h4>
    </section>
    <section>
        <h3 class="titlemark">Fila</h3><br />
        <h4>Estrutura capaz de abstrair a interação entre produtor e consumidor
        armazenando mensagens para posterior consumo. Desassocia o envio do momento
        do consumo da mensagem.</h4>
    </section>
    <section>
        <h3 class="titlemark">Tópico</h3><br />
        <h4>Estrutura lógica que relaciona um assunto a diversos consumidores desta informação.
            Enquanto a fila se propõe (naturalmente) a uma relação <code>um - um</code> , o tópico
            favorece um modelo <code>um - muitos .</code>.
         </h4>
    </section>
</section>
<section>
    <section><h2>Modelos de Comunicação</h2></section>
    <section data-markdown>
        <script type="text/template">
            ### Ponto a Ponto <!-- .element: class="titlemark" -->
            ![Middleware]({{site.github.url}}/media/ponto_ponto.jpg) <!-- .element: width="90%" -->
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
            ### Publicação \ Subscrição <!-- .element: class="titlemark" -->
            ![Middleware]({{site.github.url}}/media/pub_sub.jpg) <!-- .element: width="90%" -->
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
            ### Implementações <!-- .element: class="titlemark" -->

            - #### Request `-` Reply
            - #### Master `-` Worker
            - #### Scatter `-` Gather
            - #### Map `-` Reduce
        </script>
    </section>
</section>
<section data-markdown>
    <script type="text/template">
        ## Exercício 7
        ### Identifique as estruturas e o modelo de comunicação nos exemplos a seguir:
        1. #### Estabelecimento de uma conexão FTP entre sua máquina e um servidor
        2. #### O broadcast de pacotes UDP na sua LAN
        3. #### A troca de um segredo entre duas amigas confidentes
    </script>
</section>
<section data-markdown>
    <script type="text/template">
        ## JMS<br />
        - #### Permite criar, enviar e receber mensagens <!-- .element: class="fragment" -->
        - #### API define um conjunto de interfaces que desacoplam as aplicações dos provedores do serviço
            <!-- .element: class="fragment" -->
        - #### Garante assincronia e confiabilidade <!-- .element: class="fragment" -->
        - #### Transacional <!-- .element: class="fragment" -->
    </script>
</section>
<section data-markdown>
    <script type="text/template">
        ## JMS
        ### Arquitetura <!-- .element: class="titlemark" -->
        ![Middleware]({{site.github.url}}/media/jms.jpg) <!-- .element: width="60%" -->
    </script>
</section>
<section>
    <h2>JMS</h2>
    <section data-markdown>
        <script type="text/template">
            ### Principais Conceitos <!-- .element: class="titlemark" -->
            - #### Cliente JMS
            - #### Provedor JMS
            - #### Mensagem
            - #### Objetos
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
            ### Modelo de Comunicação <!-- .element: class="titlemark" -->
            - #### Ponto a Ponto
            - #### Publicação / Subscrição
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
            ### Consumo de Mensagens <!-- .element: class="titlemark" -->
            - #### Síncrono
            - #### Assíncrono
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
            ### Estruturas de Programação <!-- .element: class="titlemark" -->
            - #### `ConnectionFactory`
            - #### `Connection`
            - #### `Context`
            - #### `Message Producers`
            - #### `Message Consumers`
            - #### `Queue` e `Topic`
            - #### `Message`
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
            <br />
            ### Estruturas de Programação <!-- .element: class="titlemark" -->
            ![jms_pm]({{site.github.url}}/media/jms_pm.png) <!-- .element: width="70%" -->
        </script>
    </section>
    <section>
        <h3 class="titlemark">Produzindo mensagens</h3>
    </section>
    <section data-markdown>
        <script type="text/template">
            ### APIs anteriores <!-- .element: class="titlemark" -->
            ```java
                ...
                @Resource("jms/Qcf")
                QueueConnectionFactory factory;
                ...
                @Resource(lookup = "java:/jms/myQueue")
                private Queue myQueue;
                ...
                Connection conn = factory.createConnection(...);
                Session session = conn.createSesion(...);
                session.createMessage(...);
                session.CreateMessageProducer(...);
                producer.sendMessage(message);
            ```
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
            ## Java EE 7 <!-- .element: class="titlemark" -->
            ```java
                @Inject
                @JMSConnectionFactory("java:/ConnectionFactory")
                private JMSContext ctx;
                ...
                @Resource(lookup = "java:/jms/myQueue")
                private Queue myQueue;
                ...
                ObjectMessage message = context.createObjectMessage();
                // Faça algo com a mensagem
            ```
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
            ## Resumindo... <!-- .element: class="titlemark" -->
            1. #### Crie as estruturas JMS (filas, tópicos, fábricas, etc);
            2. #### Injete o contexto JMS no seu Bean indicando a fábrica;
            3. #### Use o contexto para criar a mensagem e o respectivo produtor;
            4. #### Envie a mensagem para o destino adequado.
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
            <br>
            ### Mensagem <!-- .element: class="titlemark" -->
            ![jms_msg]({{site.github.url}}/media/jms_msg.jpg) <!-- .element: width="60%" -->
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
            ### Tipos de Mensagem <!-- .element: class="titlemark" -->
             **Tipo**    | **Descrição**
            ------------ | -------------
            TextMessage  | Mensagem é um texto do tipo java.lang.String
            MapMessage   | Um conjunto de pares chave - valor
            ByteMessage  | Mensagem formada por bytes
            ObjectMessage| Mensagem é um objeto serializado
            StreamMessage| Mensagem é uma stream
            Message      | Mensagem sem conteúdo
        </script>
    </section>
</section>
<section>
    <h2>Qual a abordagem para consumir mensagens em uma aplicação Java EE?</h2>
</section>
<section>
    <h2>Message Driven Beans</h2>
</section>
<section data-markdown>
    <script type="text/template">
        ## MDBs
        ### Definição <!-- .element: class="titlemark" -->
        Bean corporativo que permite a execução de uma ação de forma assíncrona dentro de
        um contexto transacional.
    </script>
</section>
<section data-markdown>
    <script type="text/template">
        ## MDBs
        ### Características <!-- .element: class="titlemark" -->
        - #### Assincronia
        - #### Multithreaded
        - #### Sem estado
        - #### Não são invocados diretamente, mas sim acionados pelo container
        - #### Deve possuir construtor Padrão
        - #### Implementa a interface `MessageListener`
    </script>
</section>
<section data-markdown>
    <script type="text/template">
        ## MDBs
        ### Quando usar? <!-- .element: class="titlemark" -->
        - #### Ganho de taxa de processamento <!-- .element: class="fragment" -->
        - #### Processamentos de longa duração <!-- .element: class="fragment" -->
        - #### Desacoplar processo cliente do servidor <!-- .element: class="fragment" -->
        - #### etc <!-- .element: class="fragment" -->
    </script>
</section>
<section data-markdown>
    <script type="text/template">
        ## MDBs
        ### Ciclo de Vida <!-- .element: class="titlemark" -->
        ![MDB Life Cycle]({{site.github.url}}/media/mdb_lifecycle.png) <!-- .element: width="100%" -->
    </script>
</section>
<section data-markdown>
    <script type="text/template">
        ## MDBs
        ### `@MessageDriven` <!-- .element: class="titlemark" -->
        **Atributo** | **Descrição**
         ------------ | -------------
         ActivationConfigProperty | Propriedades de ativação do Bean.
         mappedName    | Nome global atribuído ao Bean. Não é portável.
         description | Descrição do Bean.
         MessageListenerInterface | Interface acionada quando da chegada de uma mensagem.
         name | Nome atribuído ao EJB.
    </script>
</section>
<section data-markdown>
        <script type="text/template">
            ## MDBs
            ## Implementação <!-- .element: class="titlemark" -->
            ```java
                @MessageDriven(
                    activationConfig = { @ActivationConfigProperty(
                    propertyName = "destination", propertyValue = "myQueue"),
                    @ActivationConfigProperty(
                    propertyName = "destinationType", propertyValue = "javax.jms.Queue")
                    }, mappedName = "myQueue")
                public class ComprasMDB implements MessageListener {

                public ComprasMDB() {...}

                public void onMessage(Message message) {
                    ObjectMessage objMessage = (ObjectMessage) message;
                    // Processar a Mensagem
                }
            }
        ```
        </script>
</section>
<section data-markdown>
    <script type="text/template">
        ## Exercício 8

        Ajuste a comunicação assíncrona implementada no exercício 6 para que ela
        seja realizada pelo MDB. Fique livre para utilizar o tipo de mensagem que desejar.
    </script>
</section>
<!-- section>
    Entities e JPA
</section>
<section>
    Controle Transacional
</section>
<section>
    Beans e Serviços
</section>
<section>
    Segurança
</section-->