---
layout: presentation
title: Introduction to HTML
description: The basics of HTML structure
theme: black
transition: slide
---

<section data-markdown>

## Introduction to HTML

</section>

<section>
  <h2>What is HTML?</h2>

  <p>
    <span class="fragment"><strong>H</strong>yper</span><span class="fragment"><strong>T</strong>ext</span> 
    <span class="fragment"><strong>M</strong>arkup</span> 
    <span class="fragment"><strong>L</strong>anguage</span>
  </p>
</section>

<section>
  <h2>Hypertext</h2>
  <p class="fragment">Hyper="over or more"</p>
  <p class="fragment"><a href="#">Links!</a></p>
</section>

<section>
  <h2>Markup</h2>
  <p class="fragment">We use <strong>tags</strong> to <em>markup</em> <strong>content.</strong></p>
</section>

<section>
  <h2>Language</h2>
  <p class="fragment">Languages have grammars.</p>
  <p class="fragment">Rules.</p>
</section>

<section>
  <p>Rule defining a tag:</p>
  <code class="hljs html xml">
   <span class="hljs-tag fragment">&lt;</span><span class="hljs-title fragment">tag-name</span><span class="hljs-tag fragment">&gt;</span>
  </code> 
</section>

<section>
  <p>Rule defining how a tag marks content:</p>
  <code class="hljs html xml">
    <span class="hljs-tag">&lt;</span><span class="hljs-title">tag-name</span><span class="hljs-tag">&gt;</span>
    <span class="fragment">Content of tag.</span>
    <span class="fragment"><span class="hljs-tag">&lt;/</span><span class="hljs-title">tag-name</span><span class="hljs-tag">&gt;</span></span>
  </code>
</section>

<section>
  <pre><code class="html" data-trim contenteditable>
    <h1>This is the most important heading!</h1>
  </code></pre>
  <h1>This is the most important heading!</h1>
</section>


<section>
  <pre><code class="html" data-trim contenteditable>
    <h2>This is the second most important heading!</h2>
  </code></pre>
  <h2>This is the second most important heading!</h2>
</section>


<section>
  <pre><code class="html" data-trim contenteditable>
    <p>This is a paragraph!</p>
  </code></pre>
  <p>This is a paragraph!</p>
</section>

<section>
  <p>Some tags don't need end tags</p>
  <p class="fragment">&lt;br&gt; tags define where to break the text.</p>
  <p class="fragment">&lt;hr&gt; tags add a horizontal rules</p>
  <p class="fragment">&lt;img&gt; add images to the page</p>
</section>


<section>
  <p>Tags can nest inside each other...</p>
  <pre><code class="html" data-trim contenteditable>
    <p>This <em>word</em> is emphasized.</p>
  </code></pre>
  
  <div class="fragment">
  <p>But should never straddle each other</p>
  <pre><code class="html" data-trim contenteditable>
    &lt;p&gt;This &lt;em&gt;word&lt;/p&gt; is emphasized.&lt;/em&gt;
  </code></pre>
  </div>
</section>

<section>
  <p>Some tags need more information</p>
  <div class="fragment">
    <pre><code class="html" data-trim contenteditable>
      <a>Click here!</a>
    </code></pre>
  </div>
  
  <div class="fragment">
    <p>They use attributes</p>
    <pre><code class="html" data-trim contenteditable>
      <a href="http://google.com">Click here!</a>
    </code></pre>
  </div>
</section>

<section>
  <p>Rule defining attributes:</p>
  <code class="hljs html xml">
    <span class="hljs-tag">&lt;</span><span class="hljs-title">tag</span>
    <span class="hljs-attribute fragment">attribute</span><span class="hljs-tag fragment">=</span><span class="hljs-value fragment">"value"</span><span class="hljs-tag fragment">&gt;</span>
    <span class="fragment">Content
    <span class="hljs-tag">&lt;/</span><span class="hljs-title">tag</span><span class="hljs-tag">&gt;</span></span>
  </code>
</section>

<section>
  <div>
    <pre><code class="html" data-trim contenteditable>
      <a href="http://google.com">Click here!</a>
    </code></pre>
  </div>
  
  <div class="fragment">
    <pre><code class="html" data-trim contenteditable>
      <h1 class="site-title">My website</h1>
    </code></pre>
  </div>
</section>
  
<section>
    <p>Tags can have more than one attribute</p>
    <pre><code class="html" data-trim contenteditable>
      <img src="dog.jpg" alt="This is a dog.">
    </code></pre> 
</section>

<section>
  <h2>Recap</h2>
</section>

<section>
    <pre><code class="html" data-trim contenteditable>
      &lt;tag-name&gt;
    </code></pre>
    
    <pre class="fragment"><code class="html" data-trim contenteditable>
      <tag-name>Content</tag-name>
    </code></pre>
  
    <pre class="fragment"><code class="html" data-trim contenteditable>
      <br>
    </code></pre>
    
    <pre class="fragment"><code class="html" data-trim contenteditable>
      <p>This <em>is</em> ok to do.</p>
    </code></pre>
    
    <pre class="fragment"><code class="html" data-trim contenteditable>
      &lt;p&gt;This &lt;em&gt;is&lt;/p&gt; NOT ok to do&lt;/em&gt;
    </code></pre>
    
    <pre class="fragment"><code class="html" data-trim contenteditable>
      <tag-name attribute="value">Content.</tag-name>
    </code></pre>
</section>

<section>
  <h2>Ready to try?</h2>
  <p>Link to in-class exercise</p>
  <p><a href="http://www.w3schools.com/">http://www.w3schools.com/</a></p>
</section>