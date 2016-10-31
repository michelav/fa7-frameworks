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
    </section>
</section>
<section>
        <h2>Especificações</h2>
        <img class="stretch" src="{{site.github.url}}/media/javaee7-specs.png">
</section>
<section>
        <h2>Histórico</h2>
        <img class="stretch" src="{{site.github.url}}/media/jee_history.png">
</section>
<section>
        <h2>Camadas</h2>
        <img class="stretch" src="{{site.github.url}}/media/jee_tiers.png" />
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
    <section>
        <h4>Ambiente propício para a execução de aplicações JEE.</h4>
    </section>
    <section>
        <h4>Conjunto de serviços básicos (operacionais) para as aplicações</h4>
    </section>
    <section>
        <h4>Componentes focam na implementação da lógica de negócio</h4>
    </section>
</section>
<section>
    <h2>Organização</h2>
    <img class="stretch" src="{{site.github.url}}/media/jeett_container.png">
</section>
<section>
    <h2>APIs</h2>
    <img class="stretch" src="{{site.github.url}}/media/jeett_apis.png">
</section>
<section>
    <h2>Alguns Fornecedores</h2>
    <img width="20%" src="{{site.github.url}}/media/glassfish.jpg">
    <img width="20%" src="{{site.github.url}}/media/jboss.svg">
    <img width="20%" src="{{site.github.url}}/media/was.jpg">
    <img width="20%" src="{{site.github.url}}/media/wildfly.png">
</section>
<section>
    <h2>Glassfish</h2><br>
    <img class="stretch" src="{{site.github.url}}/media/glassfish_admin.png">
</section>

<section><h2>Serviços Básicos</h2></section>
<section>
    <h2>Invocação Remota</h2>
    <section>
        <h4>Uma aplicação distribuída necessita disparar execuções em componentes
        que não estão disponíveis localmente.</h4>
    </section>
    <section>
        <br><br>
        <h3 class="titlemark">RPC</h3>
        <img width="75%" src="{{site.github.url}}/media/local_rpc.jpg" />
    </section>
    <section>
        <h3 class="titlemark">RMI/IIOP</h3><br><br>
        <ul>
            <li>Protocolo que permite comunicação remota entre objetos</li>
            <li>Objeto remoto acessado via proxy</li>
            <li>Permite interoperar Java e Corba</li>
        </ul>
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
    <img width="90%" src="{{site.github.url}}/media/naming_service.gif" />
    </section>
    <section>
    <br><br>
    <h3 class="titlemark">JNDI</h3>
    <img width="60%" src="{{site.github.url}}/media/jndiarch.jpg" />
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
    <section>
        <h3>Injeção do Recurso</h3>
                <pre>
        <code class="java">
            public class LibraryServlet extends HttpServlet {
                private javax.sql.DataSource dsc;
                ...
                @Resource(name="java:comp/SQLiteDataSource")
                public void setDsc(java.sql.DataSource ds) {
                    dsc = ds;
                }
            }
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
        <h4 class="fragment">Código de infraestrutura misturado ao código útil (negócio).</h4>
        <h4 class="fragment">Aplicação conhece como construir o recurso. Logo, está acoplado a ele.</h4>
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
        <img class="fragment" width="55%" src="{{site.github.url}}/media/ioc.gif">
    </section>
    <section>
        <h4>Injeção de Dependência é uma forma de implementar a inversão de controle</h4>
    </section>
    <section>
        <h4>Nesse cenário, a aplicação declara para um elemento externo suas dependências
        que são preenchidas.</h4>
    </section>
    <section>
        <img width="90%" src="{{site.github.url}}/media/di.png">
    </section>
    <section><h3 class="titlemark">Tipos de Injeção</h3></section>
</section>
<section>
    <h2>Container</h2><br>
    <section>
    <h3 class="titlemark">Principais serviços</h3><br>
    <ul>
        <span class="fragment" data-fragment-index="1"><li>Invocação remota</li></span>
        <span class="fragment" data-fragment-index="2"><li>Localização</li></span>
        <span class="fragment" data-fragment-index="3"><li>Resolução de dependências</li></span>
        <span class="fragment" data-fragment-index="4"><li>Controle Transacional</li></span>
        <span class="fragment" data-fragment-index="5"><li>Segurança</li></span>
        <span class="fragment" data-fragment-index="6"><li>Escalonamento de recursos</li></span>
        <span class="fragment" data-fragment-index="7"><li>Logs e auditoria</li></span>
    </ul>
    </section>
</section>
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
        Componentes corporativos que executam no <span class="fragment grow highlight-red">lado servidor</span>,
        Podendo ser disparados <span class="fragment highlight-red">local ou remotamente</span>
        Com todo seu <span class="fragment highlight-red">ciclo de vida gerenciado</span> por um container EJB e
        que implementam <span class="fragment highlight-red">regras de negócio</span>, colaborando entre si para
        entregar valor para o usuário final.
        </p>
    </section>
    <section>
        <h3 class="titlemark">Porque usá-los?</h3>
    </section>
    <section>
        <h4>Componentes de fácil implementação (POJOs)</h4>
    </section>
    <section>
        <h4>Variedade de serviços inclusos</h4>
    </section>
    <section>
        <h4>Permitem o foco no que é importante para o negócio</h4>
    </section>
    <section>
        <h3 class="titlemark">Quando usar?</h3>
    </section>
    <section>
        <h4>Quando a aplicação demanda...</h4>
    </section>
    <section>
        <h5>Escalabilidade</h5>
    </section>
    <section>
        <h5>Controle transacional distribuído e consistente</h5>
    </section>
    <section>
        <h5>Segurança</h5>
    </section>
    <section>
        <h5>E todos os serviços que um container geralmente provê.</h5>
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
    <section><h3 class="titlemark">Tipos</h3></section>
    <section>
        <h3 class="titlemark">Stateless</h3>
        <h4>Executam um procedimento específico sem manter o estado entre chamadas.</h4>
    </section>
</section>
<section>
    <section><h3>Algumas questões importantes sobre EJBs</h3></section>
    <section><p>Um EJB é apenas um objeto comum?</p></section>
    <section><p>Como eu posso instanciá-lo se ele é gerenciado pelo container?</p></section>
    <section><p>Como acioná-lo remotamente?</p></section>
    <section><img width="40%" src="{{site.github.url}}/media/duvida.png" /></section>
</section>


