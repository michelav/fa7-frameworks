---
layout: presentation
title: Introduction to CSS
description: The basics of CSS structure
theme: black
transition: slide
---

<section>
  <h2>Introduction to CSS</h2>
  <p class="fragment"><strong>C</strong>ascading <strong>S</strong>tyle<strong>S</strong>heets</p>
</section>

<section>
  <p>CSS = style, layout, appearance</p>
  <p class="fragment">HTML = content, semantics</p>
</section>
 
 
<section>
  <p>Syntax of CSS rule:</p>
  
  <code class="css hljs" data-trim="" contenteditable="">
    <span class="hljs-tag fragment">selector</span>
    <span class="hljs-rules fragment">{
    <span class="hljs-rule"><span class="fragment"><span class="hljs-attribute">property</span><span class="hljs-rule">:</span></span>
    <span class="hljs-value fragment">value</span></span><span class="fragment">;</span>
    }</span>
  </code>
  
  <p class="fragment">A selector identifies a segment (or segments)<br> of an HTML document.</p>
  <p class="fragment">Properties define the appearance of that HTML.</p>
</section>


<section>
  <h2>Selectors</h2>
  <p class="fragment"><code class="css"><span class="hljs-tag">h1</span></code> selector <em>selects</em> an <code class="html"><span class="hljs-tag">&lt;</span><span class="hljs-title">h1</span><span class="hljs-tag">&gt;</span></code> tag</p>
  
  <p class="fragment"><code class="css"><span class="hljs-tag">p</span></code> selector <em>selects</em> an <code class="html"><span class="hljs-tag">&lt;</span><span class="hljs-title">p</span><span class="hljs-tag">&gt;</span></code> tag</p>
  
  <p class="fragment"><code class="css"><span class="hljs-tag">section</span></code> selector <em>selects</em> an <code class="html"><span class="hljs-tag">&lt;</span><span class="hljs-title">section</span><span class="hljs-tag">&gt;</span></code> tag</p>
</section>


<section>
  <h2>Properties</h2>
  <p>
    <code class="css"><span class="hljs-rules"><span class="hljs-rule"><span class="fragment"><span class="hljs-attribute">color</span><span class="hljs-rule">:</span></span>
        <span class="fragment"><span class="hljs-value">red</span>;</span></span></span></code>
  </p>
  
  <p>
    <code class="css"><span class="hljs-rules"><span class="hljs-rule"><span class="fragment"><span class="hljs-attribute">font-family</span><span class="hljs-rule">:</span></span>
        <span class="fragment"><span class="hljs-value">Helvetica, sans-serif</span>;</span></span></span></code>
  </p>
  
  <p>
    <code class="css"><span class="hljs-rules"><span class="hljs-rule"><span class="fragment"><span class="hljs-attribute">margin</span><span class="hljs-rule">:</span></span>
        <span class="fragment"><span class="hljs-value">20px</span>;</span></span></span></code>
  </p>

</section>

<section>
  <div>
    <p>This CSS </p>
    <pre><code class="css" data-trim contenteditable>
    h1 { color: #00ff00;}
    </code></pre>
  </div>
  <div class="fragment">
    <p>makes this HTML</p>
    <pre><code class="html" data-trim contenteditable>
      <h1>Man lands on moon!</h1>
    </code></pre>
  </div>
  <div class="fragment">
    <p>look like this</p>
    <h1 style="color: #00ff00;">Man lands on moon!</h1>
  </div>
</section>

<section>
  <div>
    <p>You can add more than one property like this:</p>
    <pre><code class="css" data-trim contenteditable>
    h1 { color: #00ff00; font-family: serif; }
    </code></pre>
  </div>
  <div class="fragment">
    <p>or this:</p>
    <pre><code class="css" data-trim contenteditable>
h1 { 
  color: #00ff00; 
  font-family: serif;
}
    </code></pre>
  </div>
  <h1 class="fragment" style="color: #00ff00; font-family: serif;">Man lands on moon!</h1>
    
</section>

<section>
  <p>Selectors don't have to be just tags</p>
  
  <div class="fragment">
  <p>HTML can have both <em>class</em> and <em>id</em> attributes</p>
<pre><code class="html" data-trim contenteditable>
<p class="important" id="paragraph-1">
  This paragraph is very important.
</p>
</code></pre>
  </div>
  <p class="fragment">and CSS can use these to select elements</p> 
</section>

<section>
  <p>A class can be selected by placing a period before the name of the class.</p>
  
  <div class="fragment">
    <pre><code class="css" data-trim contenteditable>
    .important { 
    font-weight: bold; 
    text-decoration: underline;
}
    </code></pre>
    <p>This would select any tag with a class of "important"</p>
  </div>
</section>

<section>
  <p>An id can be selected by placing a "#" before the id.</p>
  
  <div class="fragment">
    <pre><code class="css" data-trim contenteditable>
    #paragraph-1 { 
    font-weight: bold; 
    text-decoration: underline;
}
    </code></pre>
    <p>This would select any tag with a id of "paragraph-1"</p>
  </div>
</section>

<section>
  <p>You can also combine tag and class or id selectors</p>
  <div class="fragment">
    <pre><code class="css" data-trim contenteditable>
    h2.important { text-decoration: underline }
    </code></pre>
    <p>This would select any <code>&lt;h2&gt;</code> with a class of "important"</p>
    <pre><code class="html" data-trim contenteditable>
    <h2 class="important">An important heading</h2>
    </code></pre>
    <h2 style="text-decoration:underline">An important heading</h2>
  </div>  
  
</section>

<section>
  <h2>Class or id?</h2>
  <p class="fragment">IDs should only appear once in a document.</p>
  <p class="fragment">Classes can appear many times.</p>
  <p class="fragment"><em>Rule of thumb:</em> Use classes.</p>
</section>

