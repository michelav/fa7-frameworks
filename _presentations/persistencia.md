---
layout: presentation
title: Persistência e Transações
description: Persistência e Transações
theme: night
transition: slide
---
<section>
    <h1>Persistência</h1>
</section>
<section data-markdown>
    <script type="text/template">
        ## Java Persistence API
        - #### Interface comum para *frameworks* de mapeamento OR
        - #### POJOs (Entidades)
        - #### Cada provedor fornece sua implementação (EclipseLink é a implementação de referência)
        - #### Áreas:
            - API propriamente dita
            - Linguagem de consulta
            - API Criteria
            - Metadados para mapeamento objeto-relacional
    </script>
</section>
<section data-markdown>
    <script type="text/template">
    ![JPA]({{site.baseurl}}/media/jpa.png)
    </script>
</section>

<section><h2 class="titlemark">Principais estruturas</h2></section>
<section>
    <h2>Entity</h2>
    <section data-markdown>
        <script type="text/template">
        - #### Objeto persistente que representa um conceito do domínio
        - #### Entidade &#8614; Tabela
        - #### Instância da Entidade &#8614; Linha da Tabela
        - #### POJOs com `get` e `set`
        </script>
    </section>
        <section data-markdown>
        <script type="text/template">
        - #### Persistent fields vs Persistent properties
        - #### Suporta herança e polimorfismo
        - #### Configurável por anotação e / ou metadado
            - #### <span class="code-red">@Entity</span>
            - #### <span class="code-red">Persistence.xml</span>
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
        - #### Quando não indicado, mapeamento adota nome da classe e campos
        - #### Mapeamento Top`-`Down vs Bottom`-`Up
        - #### Relacionamento
            - #### <span class="code-red">@OneToOne</span>
            - #### <span class="code-red">@OneToMany</span>
            - #### <span class="code-red">@ManyToMany</span>
        </script>
    </section>
    <section>
        <h3 class="titlemark">Exemplo</h3>
        <pre><code>
            @Entity
            @NamedQuery(name="f.findAll", query="SELECT f FROM Fornecedor f")
            public class Fornecedor implements Serializable {
                ...
                @Id
                private Integer id;
                private String nome;
                ...
                @ManyToOne
                @JoinColumn(name="id_situacao")
                private SituacaoFornecedor situacaoFornecedor;
            }
        </code></pre>
    </section>
</section>
<section>
    <h2>Entity Manager</h2>
     <section data-markdown>
        <script type="text/template">
        - #### Ǵerencia as entidades
        - #### Principal interface da API JPA
        - #### Oferece uma API simples para inserção, busca e deleção de registros
        </script>
    </section>
     <section data-markdown>
        <script type="text/template">
        ### Principais operações <!-- .element: class="titlemark" -->
        - #### `persist` `-` Salva uma instância transiente tornando-a gerenciada
        - #### `detach` `-` Desassocia uma instância gerenciada de seu contexto
        - #### `merge` `-` Associa uma instância não gerenciada ao contexto
        - #### `remove` `-` Remove a instância do Banco
        - #### `find` `-` Acha um tupla em banco e a associa com instância em memória
        </script>
    </section>
    <section>
        <h3>Ciclo de vida das entidades</h3>
         <img class="stretch" src="{{site.baseurl}}/media/jpa-state-transtition.png">
    </section>
     <section>
        <h3 class="titlemark">Gerenciado pelo Container</h3>
            <ul>
           <li><h4> O container automaticamente propaga o contexto para todas as aplicações</h4></li>
            <li><h4>O contexto transacional é garantido pelo container</h4></li>
            <li><h4>Injetado por meio de <span class="code-red">`@PersitenceContext`</span></h4></li>
            </ul>
    </section>
    <section>
        <h3 class="titlemark">Gerenciado pelo Container</h3>
        <pre><code>
            @Stateless
            public class DistribuidoraAS {
            ...
            @PersistenceContext
            EntityManager em;
            }
        </code></pre>
    </section>
     <section>
        <h3 class="titlemark">Gerenciado pela Aplicação</h3>
            <ul>
           <li><h4> O  contexto não é propagado para as aplicações</h4></li>
            <li><h4>A aplicação deve explicitamente criar e destruir a instância do contexto</h4></li>
            <li><h4>Injetado por meio de <span class="code-red">`@PersistenceUnit`</span></h4></li>
            </ul>
    </section>
    <section>
        <h3 class="titlemark">Gerenciado pela Aplicação</h3>
        <pre><code>
            @Stateless
            public class DistribuidoraAS {
            ...
            @PersistenceUnit
            EntityManagerFactory ef;
            ...
            EntityManager em = ef.createEntityManager();
            }
        </code></pre>
    </section>
</section>
<section>
    <h2>Persistence Unit</h2>
    <section data-markdown>
        <script type="text/template">
        - #### Define as entidades gerenciadas por um EntityManager
        - #### É definida no `persistence.xml`
        - #### Empacotado no WAR ou EJB-JAR
        </script>
    </section>
    <section>
        <pre><code class="xml">
        <persistence-unit name="DistribuidoraEJB">
            <jta-data-source>java:/DistribuidoraDS</jta-data-source>
            <class>fa7.distribuidora.persistence.Estoque</class>
            <class>fa7.distribuidora.persistence.Fornecedor</class>
            <class>fa7.distribuidora.persistence.Mercadoria</class>
            <class>fa7.distribuidora.persistence.Reserva</class>
            <class>fa7.distribuidora.persistence.SituacaoFornecedor</class>
        </persistence-unit>
        </code></pre>
    </section>
</section>
<section>
    <h2>Sumário</h2>
    <img class="stretch" src="{{site.baseurl}}/media/conceitos_jpa.png" >
</section>
<section>
    <h2>Consultas</h2>
    <section data-markdown>
        <script type="text/template">
        ### JPQL <!-- .element: class="titlemark" -->
        - #### Evolução do EJBQL
        - #### Consultas operam em objetos ao invés de tabelas relacionais
        - #### Permite junções, projeções e  outras funcionalidades existentes no SQL
        - #### Suporte parâmetros posicionais e nomeados
            - <span class="code-red">?1</span> e <span class="code-red">:param</span>
            - <span class="code-red">setParameter(posicao, valor)</span>
            - <span class="code-red">setParameter(nome, valor)</span>
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
            ## Consulta nomeada vs Consulta Dinâmica
        </script>
    </section>
    <section>
            <h3 class="titlemark">Consulta Dinâmica</h3>
            <h4>Uma consulta passada para o método createQuery do EntityManager no código da aplicação.</h4>
            <pre><code>
                public long queryEmpSalary(String deptName, String empName) {
                    String query = "SELECT e.salary " +
                    "FROM Employee e " +
                    "WHERE e.department.name = '" + deptName +
                    "' AND " + "e.name = '" + empName + "'";
                return em.createQuery(query, Long.class).getSingleResult();
                }
            </code></pre>
    </section>
    <section>
        <h3 class="titlemark">Consultas Nomeadas</h3>
        <h4>Consulta associada a um nome e localizada na definição de uma classe \ entidade
        da aplicação.</h4>
        <pre><code>
            @Entity
            @NamedQuery(name="findSalaryForNameAndDepartment",
                query="SELECT e.salary " +
                "FROM Employee e " +
                "WHERE e.department.name = :deptName AND " +
                "e.name = :empName")
            public Department implements Serializable {...}
        </code></pre>
    </section>
    <section>
        <h3 class="titlemark">Consultas Nomeadas</h3>
        <h4>Multiplas consultas nomeadas requerem a anotação <span class="code-red">@NamedQueries</span>.</h4>
        <pre><code>
            @Entity
            @NamedQueries({
                @NamedQuery(name="Employee.findAll",
                    query="SELECT e FROM Employee e"),
                @NamedQuery(name="Employee.findByPrimaryKey",
                    query="SELECT e FROM Employee e WHERE e.id = :id"),
                @NamedQuery(name="Employee.findByName",
                    query="SELECT e FROM Employee e WHERE e.name = :name")
            })
        </code></pre>
    </section>
    <section>
    <h3 class="titlemark">Uso</h3>
        <pre><code>
            @Entity
            @NamedQueries({
                @NamedQuery(name="Employee.findAll",
                    query="SELECT e FROM Employee e"),
                @NamedQuery(name="Employee.findByName",
                    query="SELECT e FROM Employee e WHERE e.name = :name")
            })
            public EMployee {...}
        </code></pre>
        <pre><code>
            public class EmployeeService {
                @PersistenceContext
                EntityManager em;
                ...
                public Employee findEmployeeByName(String name) {
                    return em.createNamedQuery("Employee.findByName",
                    Employee.class).setParameter("name", name).getSingleResult();
                }
            }
        </code></pre>
    </section>
    <section data-markdown>
        <script type="text/template">
        ### Resultados <!-- .element: class="titlemark" -->
        - #### Tipos básicos
        - #### Entidades da aplicação
        - #### Array de objetos
        - #### Tipos definidos pelo usuário
        </script>
    </section>
    <section>
        <h3 class="titlemark">Array de Objetos</h3>
        <pre><code class="java">
            public void displayProjectEmployees(String projectName) {
                List result = em.createQuery(
                "SELECT e.name, e.department.name " +
                "FROM Project p JOIN p.employees e " +
                "WHERE p.name = ?1 " +
                "ORDER BY e.name")
                .setParameter(1, projectName)
                .getResultList();
                int count = 0;
                for (Iterator i = result.iterator(); i.hasNext();) {
                Object[] values = (Object[]) i.next();
                System.out.println(++count + ": " +
                values[0] + ", " + values[1]);
            }
        </code></pre>
    </section>
    <section>
        <h3 class="titlemark">Tipos definidos pelo usuário</h3>
        <pre><code class="java">
        public void displayProjectEmployees(String projectName) {
            List&lt;EmpMenu&gt; result =
                em.createQuery("SELECT NEW example.EmpMenu(" +
                    "e.name, e.department.name) " +
                    "FROM Project p JOIN p.employees e " +
                    "WHERE p.name = ?1 " +
                    "ORDER BY e.name", EmpMenu.class)
                .setParameter(1, projectName)
                .getResultList();
            for (EmpMenu menu : result) {
            System.out.println(menu.getEmployeeName() + ", " +
                menu.getDepartmentName());
            }
        }
        </code></pre>
    </section>
    <section>
        <h3 class="titlemark">Boas práticas</h3>
        <ul>
            <li><h4>Usar DAOs somente quando necessário</h4></li>
                <ul><li>DAO vs Repository</li></ul>
            <li><h4>As máximas do mundo SQL valem para as consultas JPQL</h4></li>
            <li><h4>Cuidado com as funcionalidades específicas do Provedor</h4></li>
            <li><h4>Tente usar NamedQuery sempre que possível</h4></li>
        </ul>
    </section>
</section>
<section>
    <h2>Java Transaction API</h2>
</section>
<section>
    <h2>JTA</h2>
    <section>
        <h3 class="titlemark">O que é transação?</h3>
        <h4 class="fragment">Sequência de ações que devem ser executadas de forma atômica. Do contrário,
        elas são revertidas.</h4>
    </section>
    <section>
        <h3 class="titlemark">Transações Locais vs Transações Distribuídas</h3>
        <ul>
            <li><h4>JDBC</h4></li>
            <li><h4>JTA</h4></li>
        </ul>
    </section>
    <section data-markdown>
        <script type="text/template">
            - #### API de acesso às transações independente de implementações
            - #### Permite o controle de transações distribuídas pelo Container ou Aplicação
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
        <br /><br />
        ![jta]({{site.baseurl}}/media/jta.png) <!-- .element: width="60%" -->
        </script>
    </section>
    <section><h2>E no mundo do container?</h2></section>
    <section>
        <h3>Aplicações JavaEE podem fazer uso das transações gerenciadas pelo container (CMT)
        ou elas mesmo gerenciarem as transações (BMT)</h3>
    </section>
    <section data-markdown>
        <script type="text/template">
            ### CMT <!-- .element: class="titlemark" -->
            - #### Demarcadas por anotações em classes ou métodos.
            - <span class="code">@TransactionAttribute</span> vs <span class="code">@Transactional</span>
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
            ### TransactionAttribute <!-- .element: class="titlemark" -->
            ![jta_scope]({{site.baseurl}}/media/jta_scope.png) <!-- .element: width="70%" -->
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
            ### TransactionAttribute <!-- .element: class="titlemark" -->
            - #### Required **(Padrão)**
            - #### RequiresNew
            - #### Mandatory
            - #### NotSupported
            - #### Supports
            - #### Never
        </script>
    </section>
    <section>
        <h3 class="titlemark">Exemplo</h3>
        <pre><code class="java">
            @TransactionAttribute(NOT_SUPPORTED)
            @Stateful
            public class MeuBean {
            ...
                @TransactionAttribute(REQUIRES_NEW)
                public void firstMethod() {...}
                ...
                @TransactionAttribute(REQUIRED)
                public void secondMethod() {...}
                ...
                public void thirdMethod() {...}
                ...
                public void fourthMethod() {...}
            }
        </code></pre>
    </section>
    <section data-markdown>
    <script type="text/template">
        ### Rollback <!-- .element: class="titlemark" -->
        - #### Uma exceção de sistema é lançada
        - #### <span class="code">EJBContext.setRollbackOnly</span>
        - #### <span class="code-red">@ApplicationException(rollback=true)</span>
    </script>
    </section>
</section>
<section data-markdown>
    <script type="text/template">
     **Atributo**    | **Cliente (B1)**   | ** M. Negócio (B2)**
    ---------------- | --------------|--------------------------------
    Required  | Nenhuma | T2
    Required  | T1 | T1
    RequiresNew  | Nenhuma | T2
    RequiresNew  | T1 | T2
    Mandatory  | Nenhuma | Erro
    Mandatory  | T1 | T1
    NotSupported | Nenhuma | Nenhuma
    NotSupported | T1 | Nenhuma
    Supports | Nenhuma | T1
    Supports | T1 | T1
    Never | Nenhuma | Nenhuma
    Never | T1 | Erro
    </script>
</section>

<section>
    <h2>JTA</h2>
    <section data-markdown>
        <script type="text/template">
            ### BMT <!-- .element: class="titlemark" -->
            - #### O Bean comanda a transação
            - #### <span class="code">javax.transaction.UserTransaction</span>
                - `begin`
                - `commit`
                - `rollback`
        </script>
    </section>
    <section data-markdown>
        <script type="text/template">
            ### BMT <!-- .element: class="titlemark" -->
            - #### Stateless Session Bean não pode concluir o método sem realizar commit ou rollback
                - #### Não se aplica a Stateful Session Beans
        </script>
    </section>
    <section>
        <h3 class="titlemark">UT via Injeção</h3>
        <pre><code class="java">
            @Stateless
            public class ExampleBean {
                @Resource
                private UserTransaction utx;
                ...
                public void executaAlgo() {
                    // Inicia a transacao
                    utx.begin();
                    ...
                    // Acao
                    utx.commit();
                }
            }
        </code></pre>
    </section>
    <section>
        <h3 class="titlemark">UT via Contexto</h3>
        <pre><code class="java">
            @Stateless
            public class ExampleBean {
                @Resource
                private SessionContext ctx;
                ...
                public void executaAlgo() {
                    UserTransaction utx = ctx.getUserTransaction();
                    utx.begin();
                    // Fazendo algo
                    utx.commit();
                }
            }
        </code></pre>
    </section>
</section>
<section>
    <h2>Bizus</h2>
    <ul>
        <li><h4>Use JTA quando possível, principalmente CMT;</h4></li>
        <li><h4>Use transações locais (JDBC) em cenários que há necessidade de alto desempenho.</h4></li>
    </ul>
</section>
<section>
    <h2>Exercício 9</h2>
    <h4 align="left">Implementar as seguintes funções na aplicação distribuidora:</h4>
    <ul>
        <li><h4>Uma listagem dos fornecedores e das mercadorias disponíveis;</h4></li>
        <li><h4>Uma ordem de reserva de mercadorias utilizando um stateful session bean</h4></li>
        <ul>
            <li>O SFSB concentra os pedidos do cliente checando se há estoque disponível. Se não houver estoque disponível,
            o SSB elenca um dos distribuidores e envia uma mensagem via fila solicitando a quantidade faltante de produto
            </li>
        </ul>
        <li><h4>Crie uma aplicação FornecedorApp que implementa um MDB responsável por receber pedidos de mercadorias
        e processá-los.</h4></li>
    </ul>
</section>
<section>
    <h2>Exercício 9</h2>
    <h3 class="titlemark">Dicas</h3>
    <ul>
        <li><h4>Usem o script de criação das tabelas que está disponível no material da aula</h4></li>
        <li><h4>Lembrem-se de configurar os serviços adequados para a execução da aplicação</h4></li>
        <ul>
            <li>ActiveMQ</li>
            <li>Postgresql e seus DataSources</li>
        </ul>
    </ul>
</section>

