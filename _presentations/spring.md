---
layout: presentation
title: Spring
description: Framework Spring
theme: night
transition: slide
---
<section>
    <h1>Plataforma Spring</h1>
</section>
<section data-markdown>
    <script type="text/template">
        ### Cenário <!-- .element class="titlemark" -->
        - #### Aplicações corporativas: Servlets e EJBs
            - #### EJB 2.1
            - #### Estrutura "pesada" e pouco produtiva
    </script>
</section>
<section>
    <h2>Spring</h2>
    <section data-markdown>
        <script type="text/template">
        - #### Criado em 2002 por Rod Johnson
            - ##### Expert One-on-One J2EE Design and Development
        - #### Container de IoC (Inversion of Control)
        - #### Não intrusivo
        - #### Interfaces e POJOs
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
            ### Benefícios <!-- .element class="titlemark" -->
            - #### Mais aplicação, menos infraestrutura
            - #### Componentes leves
            - #### Facilidades para testes automatizados
            - #### Sem essa de reinventar a roda
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
            ### Resumindo...<!-- .element class="titlemark" -->
            <p><b>O foco do Spring é permitir a criação de aplicações utilizando somente POJOs, aplicando a
                eles serviços corporativos de forma não intrusiva.</b></p>
        </script>
    </section>
</section>
<section data-markdown>
    <script type="text/template">
        ## Projetos
        ![SPring Projects]({{site.github.url}}/media/spring_projects.png) <!-- .element width="150%" -->
    </script>
</section>
<section>
    <h2>Spring Framework</h2>
    <section data-markdown>
        <script type="text/template">
            - #### Núcleo do Spring
            - #### Suporte a
                - #### Injeção de Dependência
                - #### Aspectos
                - #### MVC
                - #### JDBC, JPA, JMS, etc
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
            <br />
            ### Módulos <!-- .element class="titlemark" -->
            ![Spring Modulos]({{site.github.url}}/media/spring-modulos.png) <!-- .element width="70%" -->
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
            ### Core Container <!-- .element class="titlemark" -->
            - #### Injeção de Dependência
                - ##### <span class="code">spring-core</span> e <span class="code">spring-beans</span>
            - #### Contexto e acesso aos beans
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
            ### AOP <!-- .element class="titlemark" -->
            - #### Inclusão de responsabilidades ortogonais à aplicação
                - ##### Compatibilidade com AspectJ
            - #### Instrumentação
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
            ### Messaging <!-- .element class="titlemark" -->
            #### Fornece as principais estruturas para aplicações orientadas a mensagem.
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
            ### Data Access <!-- .element class="titlemark" -->
            - #### Abstrações para JDBC
            - #### Contexto transacional de forma programática ou declarativa
            - #### Integração com os principais frameworks ORM
            - #### Mapeamento Objeto / XML
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
            ### Web <!-- .element class="titlemark" -->
            - #### Funcionalidades básicas do mundo Web
            - #### MVC
            - #### Portlets
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
            ### Test <!-- .element class="titlemark" -->
            - #### Testes de unidades e integração
            - #### Suporte JUnit e TestNG
            - #### Cache e Mocks
        </script>
    </section>
</section>
<section>
    <h2>Container de IoC</h2>
</section>
<section>
    <h2>Container</h2>
    <section data-markdown>
        <script type="text/template">
            - #### Gerencia todos os componentes da aplicação usando IoC
            - #### Configurável por meio XML, anotações ou código Java
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
            ### Principais Interfaces <!-- .element class="titlemark" -->
            - #### BeanFactory
                - ##### Container básico para uso de injeção de dependência
            - #### ApplicationContext
                - ##### Acrescenta funcionalidades corporativas ao BeanFactory
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
            <br />
            ![Container]({{site.github.url}}/media/container-magic.png)  <!-- .element width="80%" -->
        </script>
    </section>
    <section>
        <h3 class="titlemark">Exemplo de Configuração</h3>
            <pre><code class="xml">
            &lt;?xml version="1.0" encoding="UTF-8"?&gt;
            &lt;beans xmlns="http://www.springframework.org/schema/beans"
                xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                xmlns:aop="http://www.springframework.org/schema/aop"
                xsi:schemaLocation="..."&gt;
                ...
                &lt;bean id="braveKnight" class="test.dnd.BraveKnight"&gt;
                    &lt;constructor-arg ref="slayQuest"&gt;&lt;/constructor-arg&gt;
                &lt;/bean&gt;
                &lt;bean id="slayQuest" class="test.dnd.SlayDragonQuest"&gt;
                    &lt;constructor-arg value="..."&gt;&lt;/constructor-arg&gt;
                &lt;/bean&gt;
            &lt;/beans&gt;
            </code></pre>
    </section>
</section>
<section>
    <h2>Beans</h2>
</section>
<section>
    <h2>Beans</h2>
    <section data-markdown>
        <script type="text/template">
            ### O que são? <!-- .element class="titlemark" -->
            - #### Objetos que formam a essência da aplicação
            - #### Instanciados, conectados e gerenciados pelo container
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
            ### Definição \ Configuração <!-- .element class="titlemark" -->
            - #### Como criar o bean
            - #### Detalhes do seu ciclo de vida
            - #### Dependências
        </script>
    </section>
    <section data-markdown>
    <script type="text/template">
            <br />

            **Propriedade** | **Descrição**
            ----------------|--------------
            class           | Classe usada para criação do bean
            id \ name       | Identifica unicamente o bean
            scope           | Escopo do bean
            constructor-arg | Argumentos do construtor bean
            property        | Injeta dependências por meio de métodos `'set'`
            autowire        | Modo de _autowiring_
            init-method     | Método executado logo após a atribuição das propriedades necessárias do bean
            destroy-method  | Método executado quando o container é destruído
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
            ### Formas de Instanciação <!-- .element class="titlemark" -->
            - #### Construtor
            - #### Fábrica
                - ##### Método estático vs instância
        </script>
    </section>
    <section>
        <h3 class="titlemark">Construtor</h3>
            <pre><code class="xml">
            &lt;?xml version="1.0" encoding="UTF-8"?&gt;
            &lt;beans xmlns="http://www.springframework.org/schema/beans"&gt;
                ...
                &lt;bean id="braveKnight" class="test.dnd.BraveKnight"&gt;
                    &lt;constructor-arg ref="slayQuest"&gt;&lt;/constructor-arg&gt;
                &lt;/bean&gt;
                &lt;bean id="slayQuest" class="test.dnd.SlayDragonQuest"&gt;
                    &lt;constructor-arg value="..."&gt;&lt;/constructor-arg&gt;
                &lt;/bean&gt;
            &lt;/beans&gt;
            </code></pre>
    </section>
    <section>
        <h3 class="titlemark">Fábrica - método estático</h3>
            <pre><code class="xml">
                &lt;bean id="clientService" class="examples.ClientService"
                    factory-method="createInstance"/&gt;
            </code></pre>
            <pre><code class="java">
                public class ClientService {
                    private static ClientService clientService =
                        new ClientService();
                    private ClientService() {}
                    ...
                    public static ClientService createInstance() {
                        return clientService;
                    }
                }
        </code></pre>
    </section>
    <section>
        <h3 class="titlemark">Fábrica - método de instância</h3>
            <pre><code class="xml">
                &lt;bean id="serviceLocator" class="examples.DefaultServiceLocator"&gt;
                &lt;!-- inject any dependencies required by this locator bean --&gt;
                &lt;/bean&gt;
                ...
                &lt;bean id="client" factory-bean="serviceLocator"
                    factory-method="createClientServiceInstance"/&gt;
            </code></pre>
            <pre><code class="java">
                public class DefaultServiceLocator {
                    ...
                    private static ClientService clientService =
                        new ClientServiceImpl();
                    private DefaultServiceLocator() {}
                    ...
                    public ClientService createClientServiceInstance() {
                        return clientService;
                    }
                }
        </code></pre>
    </section>
</section>
<section>
    <h2>Exercício 1</h2>
    <section>
    <h4 align="left">
        Uma distribuidora coordenadora ações de reserva e compra de mercadorias para vários
        clientes. Ela pode interagir com vários fornecedores e decidir qual o melhor para
        realizar a reserva.
        A classe que representa os distribuidores interage com a abstração de fornecedor
        por meio da interface `Fornecedor`. Enquanto a classe `Distribuidora` expõe uma
        operação de `comprarMercadoria`, ela dispara uma avaliação de preço e após isso
        faz a reserva efetivamente. Implementar a aplicação utilizando o Spring Framework.
    </h4>
    </section>
    <section data-markdown>
        <script type="text/template">
            <br />
            ![Ex1]({{site.github.url}}/media/spring_ex1_classes.png) <!-- .element width="90%" -->
        </script>
    </section>
    <section data-markdown>
    <script type="text/template">
        ### Dicas <!-- .element class="titlemark" -->
        - #### Crie um projeto legado  (Spring + Maven) do Spring no STS
        - #### Crie um XML para definir os beans e suas relações
        - #### Utilize as propriedades constructor-arg e ref para passar as informações adequadas para os construtores
        - #### Utilize a classe `ClassPathXmlApplicationContext` como Contexto passando o xml adequadamente
    </script>
    </section>
</section>
<section><h2>Injeção de Dependência</h2></section>
<section>
    <h2>Injeção de Dependência</h2>
    <section data-markdown>
        <script type="text/template">
            ### Tipos <!-- .element class="titlemark" -->
            - #### Construtores
            - #### Métodos `set`
        </script>
    </section>
    <section>
    <br />
    <h3 class="titlemark">Construtor</h3>
        <pre><code class="xml">
            &lt;beans&gt;
                &lt;bean id="foo" class="x.y.Foo"&gt;
                    &lt;constructor-arg ref="bar"/&gt;
                    &lt;constructor-arg ref="baz"/&gt;
                &lt;/bean&gt;
                ...
                &lt;bean id="bar" class="x.y.Bar"/&gt;
                &lt;bean id="baz" class="x.y.Baz"/&gt;
            &lt;/beans&gt;
        </code></pre>
        <pre><code class="java">
            package x.y;
            ...
            public class Foo {
                ...
                public Foo(Bar bar, Baz baz) {...}
            }
        </code></pre>
    </section>
    <section>
    <br /><br />
    <h3 class="titlemark">Construtor</h3>
        <pre><code class="xml">
            &lt;bean id="exampleBean" class="examples.ExampleBean"&gt;
                &lt;constructor-arg type="int" value="7500000"/&gt;
                &lt;constructor-arg type="java.lang.String" value="42"/&gt;
            </bean>
        </code></pre>
        <pre><code class="xml">
            &lt;bean id="exampleBean" class="examples.ExampleBean"&gt;
                &lt;constructor-arg index="0" value="7500000"/&gt;
                &lt;constructor-arg index="1" value="42"/&gt;
            </bean>
        </code></pre>
        <pre><code class="java">
            public class ExampleBean {
                ...
                public ExampleBean(int years, String ultimateAnswer) {
                    this.years = years;
                    this.ultimateAnswer = ultimateAnswer;
                }
            }
        </code></pre>
    </section>
    <section>
    <br /><br />
    <h3 class="titlemark">Método <code>Set</code></h3>
        <pre><code class="xml">
            &lt;bean id="exampleBean" class="examples.ExampleBean"&gt;
                &lt;property name="beanOne"&gt;
                    &lt;ref bean="anotherExampleBean"/&gt;
                &lt;/property&gt;
                &lt;property name="beanTwo" ref="yetAnotherBean"/&gt;
                &lt;property name="integerProperty" value="1"/&gt;
            &lt;/bean&gt;
            ...
            &lt;bean id="anotherExampleBean" class="examples.AnotherBean"/&gt;
            &lt;bean id="yetAnotherBean" class="examples.YetAnotherBean"/&gt;
        </code></pre>
        <pre><code class="java">
            public class ExampleBean {
                private AnotherBean beanOne;
                private YetAnotherBean beanTwo;
                private int i;
                ...
                public void setBeanOne(AnotherBean beanOne) {...}
                ...
                public void setBeanTwo(YetAnotherBean beanTwo) {...}
                ...
                public void setIntegerProperty(int i) {...}
            }
        </code></pre>
    </section>
    <section>
        <h3>Injeção por Construtor vs Método</h3>
    </section>
    <section data-markdown>
    <script type="text/template">
        ### Coleções  <!-- .element class="titlemark" -->
        - #### É possível injetar coleções utilizando os seguintes elementos:
            - ##### &lt;list/&gt;
            - ##### &lt;set/&gt;
            - ##### &lt;map/&gt;
            - ##### &lt;props/&gt;
    </script>
    </section>
    <section>
    <h3 class="titlemark">Setando Coleções</h3>
        <pre><code class="xml">
            &lt;bean id="moreComplexObject" class="example.ComplexObject"&gt;
                &lt;property name="adminEmails"&gt;
                    &lt;props&gt;
                        &lt;prop key="administrator"&gt;administrator@example.org&lt;/prop&gt;
                        &lt;prop key="support"&gt;support@example.org&lt;/prop&gt;
                    &lt;/props&gt;
                &lt;/property&gt;
                &lt;property name="someList"&gt;
                    &lt;list&gt;
                        &lt;value&gt;a list element followed by a reference&lt;/value&gt;
                        &lt;ref bean="myDataSource" /&gt;
                    &lt;/list&gt;
                &lt;/property&gt;
                &lt;property name="someMap"&gt;
                    &lt;map&gt;
                        &lt;entry key="an entry" value="just some string"/&gt;
                        &lt;entry key ="a ref" value-ref="myDataSource"/&gt;
                    &lt;/map&gt;
                &lt;/property&gt;
            &lt;/bean&gt;
        </code></pre>
    </section>
</section>
<section>
    <h2>Exercício 2</h2>
    <section>
        <h4 align="left">Refatore a aplicação da Distribuidora para compreender os seguintes requisitos:</h4>
        <ul>
            <li>O cálculo da reserva de mercadoria é baseado em uma taxa:</li>
                <ul><li><span class="code-red">valor = preço x quantidade x taxa</span></li></ul>
            <li>A distribuidora contará com dois fornecedores:</li>
                <ul>
                <li>Simples: A taxa é informada por um método setter</li>
                <li>Aleatorio: Calcula a taxa de forma randômica baseado em um limite máximo e mínimo</li>
                </ul>
            <li>A distribuidora consultará o valor da reserva em todos os fornecedores e selecionará o quem
            tem menor custo</li>
        </ul>
    </section>
    <section data-markdown>
        <script type="text/template">
            <br />
            ![Ex2]({{site.github.url}}/media/spring_ex2_classes.png) <!-- .element width="90%" -->
        </script>
    </section>
</section>
<section>
    <h2>Autowiring</h2>
</section>
<section>
    <h2>Autowiring</h2>
    <section><h3 class="titlemark">O que é isso?!</h3></section>
    <section data-markdown>
        <script type="text/template">
            ### Vantagens <!-- .element class="titlemark" -->
            - #### Redução de declarações de propriedades e afins no XML de configuração
            - #### Dinamicidade e adaptabilidade aos objetos enquanto eles evoluem
        </script>
    </section>
    <section>
        <h3 class="titlemark">Como utilizar?</h3>
        <h4>Atributo <span class="code-red">autowire</span> da tag <span class="code-red">&lt;bean&gt;</span>.</h4>
    </section>
    <section data-markdown>
        <script type="text/template">
            **Modo** | **Descrição**
            -------|--------------
            no     | Padrão. Sem autowire.
            byName | Faz a ligação por nome da propriedade
            byType | Faz a ligação por tipo da propriedade
            constructor | Exatamente como byType mas acontece no construtor
        </script>
    </section>
     <section data-markdown>
        <script type="text/template">
            ### Limitações <!-- .element class="titlemark" -->
            - #### Dependências explícitas sobrescrevem a ligação automática
            - #### Não resolve dependências para tipos simples: primitivos, Strings, Doubles, etc
            - #### Por não ser tão exata como a ligação explícita, pode gerar resultados inesperados
            - #### Caso haja múltiplas definições para um mesmo tipo de bean, o container não consegue resolver a dependência quando o componente aguarda um valor \ referência único
        </script>
    </section>
</section>
<section>
    <h2>Exercício 3</h2>
    <h4>Modificar o projeto da Distribuidora para que os fornecedores sejam injetados por meio de autowiring</h4>.
</section>
<section data-markdown>
    <script type="text/template">
    ## Escopo
    **Escopo** | **Descrição**
    -----------|----------------
    singleton  | Padrão. Uma única instância criada por definição
    prototype  | Uma definição pode gerar diversas instâncias
    request | Uma definição por requisição HTTP
    session | Uma definição por sessão HTTP
    globalSession | Uma definição por sessão global HTTP. Válido no contexto de portlets
    application | Definido por todo o ciclo de vida de um ServletContext
    websocket | Definido por todo o ciclo de vida de um WebSocket
</script>
</section>
<section data-markdown>
    <script type="text/template">
        ## Escopo
        ### Singleton <!-- .element class="titlemark" -->
        ![escopo_singleton]({{site.github.url}}/media/spring_singleton.png)
    </script>
</section>
<section data-markdown>
    <script type="text/template">
        ## Escopo
        ### Prototype <!-- .element class="titlemark" -->
        ![escopo_singleton]({{site.github.url}}/media/spring_prototype.png)
    </script>
</section>
<section>
    <h3 class="titlemark">Singleton vs Prototype</h3>
</section>
<section>
    <h2>Exercício 4</h2>
    <h4>Importem e executem o projeto escopo disponível no repositório ou pasta da rede.</h4>
</section>
<section>
    <h2>Ciclo de Vida</h2>
</section>
<section>
    <h2>Ciclo de Vida</h2>
    <section data-markdown>
        <script type="text/template">
        <br /><br />
            ![ciclo de vida]({{site.github.url}}/media/spring_lifecycle.png) <!-- .element class="stretch" -->
        </script>
    </section>
</section>
<section>
    <h2>Anotações</h2>
</section>
<section>
    <h2>Anotações</h2>
    <section>
        <h4>Devem ser habilitadas usando o elemento
        <span class="code-red">context:annotation-config</span> </h4>
        <pre><code class="xml">
            &lt;beans
              xmlns="http://www.springframework.org/schema/beans"
              xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
              xmlns:context="http://www.springframework.org/schema/context"
              xsi:schemaLocation="http://www.springframework.org/schema/beans
              http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
              http://www.springframework.org/schema/context ..."&gt;
                &lt;context:annotation-config/&gt;
            </beans>
        </code></pre>
    </section>
    <section>
        <h3 class="titlemark"><span class="code">@Autowired</span></h3>
        <h4>Pode ser usada em construtores e métodos Set</h4>
        <pre><code class="java">
            public class Distribuidora {
                ...
                List&lt;Fornecedor&gt; meusFornecedores;
                ...
                @Autowired
                public Distribuidora(List&lt;Fornecedor&gt; fornecedores) {
                    meusFornecedores = fornecedores;
                }
            }
        </code></pre>
    </section>
    <section>
        <h3 class="titlemark"><span class="code">@Required</span></h3>
        <h4>Utilizada em métodos Set</h4>
        <pre><code class="java">
             public class SimpleMovieLister {
                ...
                private MovieFinder movieFinder;
                ...
                @Required
                public void setMovieFinder(MovieFinder movieFinder) {
                    this.movieFinder = movieFinder;
                }
            }
        </code></pre>
    </section>
    <section>
        <h3 class="titlemark"><span class="code">@Component</span></h3>
        <h4>Forma genérica para definir uma classe como Bean</h4>
        <pre><code class="java">
            @Component
            public class Distribuidora {
                ...
                @Autowired
                Fornecedor meuFornecedor;
                ...
            }
        </code></pre>
    </section>
    <section data-markdown>
        <script type="text/template">
            ### <span class="code">@Component</span> <!-- .element class="titlemark" -->
            - #### Outras formas de declarar um bean como gerenciado:
                - ##### <span class="code">@Service</span>
                - ##### <span class="code">@Controller</span>
                - ##### <span class="code">@Repository</span>
        </script>
    </section>
    <section>
        <h3 class="titlemark"><span class="code">@Scope</span></h3>
        <h4>Informa o escopo do bean</h4>
        <pre><code class="java">
            @Scope("prototype")
            @Component
            public class Distribuidora {
                ...
                @Autowired
                Fornecedor meuFornecedor;
                ...
            }
        </code></pre>
    </section>
</section>
<section>
    <h2>Exercício 5</h2>
    <h4>Modifique o projeto da distribuidora para utilizar anotações durante o autowiring.</h4>
</section>