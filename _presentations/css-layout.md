---
layout: presentation
title: Introduction to CSS layout
description: The basics of CSS structure
theme: zerozerozero
transition: slide
---

<section>
  <h2>Page layout with CSS</h2>
</section>



<section>

  <section>
    <h2>Display types</h2>
  </section>
  
  <section>
<pre data-trim data-noescape ><code><p>
  <img src="/media/pattern_1.svg" width="50px">
  <img src="/media/pattern_2.svg" width="50px">
  <img src="/media/pattern_3.svg" width="50px">
</p>

<p> Aliquam erat volutpat. Suspendisse varius faucibus lectus 
quis sodales. Pellentesque iaculis feugiat pharetra. Morbi 
nec massa a dui auctor euismod et fringilla quam. Morbi 
iaculis risus vitae nunc vestibulum pharetra.</p>

<p>Donec ultricies nibh tellus, at feugiat urna fringilla ac. 
<em>Sed venenatis ligula sed dui condimentum lobortis.</em> 
Aenean et lorem massa. Curabitur rhoncus, tortor id euismod 
ullamcorper, urna odio euismod turpis, sed tempor ipsum.</p></code></pre>
  </section>
 
  <section data-transition="fade-in">
    <p><span style="visibility: hidden">Block</span></p>
    
    <p style="text-align: left;">
      <img style="vertical-align: bottom;  margin: 0;" src="/media/pattern_1.svg" width="50px">
      <img style="vertical-align: bottom;  margin: 0;" src="/media/pattern_2.svg" width="50px">
      <img style="vertical-align: bottom;  margin: 0;" src="/media/pattern_3.svg" width="50px"> 
    </p>
   
    <p style="text-align: left;"><small> Aliquam erat volutpat. Suspendisse varius faucibus lectus quis sodales. Pellentesque iaculis feugiat pharetra. Morbi nec massa a dui auctor euismod et fringilla
    quam. Morbi iaculis risus vitae nunc vestibulum pharetra.</small></p>
    
    <p style="text-align: left;"><small>Donec ultricies nibh tellus, at feugiat urna fringilla ac. <em style="">Sed venenatis ligula sed dui condimentum lobortis.</em> Aenean et lorem massa. Curabitur rhoncus, tortor id euismod ullamcorper, urna odio euismod turpis, sed tempor ipsum. </small></p>
  </section>
  
  <section data-transition="fade-in">
    <p><span>Block</span></p>
    
    <p style="text-align: left; border: 3px solid #ffff66;">
      <img style="vertical-align: bottom;  margin: 0;" src="/media/pattern_1.svg" width="50px">
      <img style="vertical-align: bottom;  margin: 0;" src="/media/pattern_2.svg" width="50px">
      <img style="vertical-align: bottom;  margin: 0;" src="/media/pattern_3.svg" width="50px"> 
    </p>
   
    <p style="text-align: left; border: 3px solid #ffff66;"><small> Aliquam erat volutpat. Suspendisse varius faucibus lectus quis sodales. Pellentesque iaculis feugiat pharetra. Morbi nec massa a dui auctor euismod et fringilla
    quam. Morbi iaculis risus vitae nunc vestibulum pharetra.</small></p>
    
    <p style="text-align: left; border: 3px solid #ffff66;"><small>Donec ultricies nibh tellus, at feugiat urna fringilla ac. <em style="">Sed venenatis ligula sed dui condimentum lobortis.</em> Aenean et lorem massa. Curabitur rhoncus, tortor id euismod ullamcorper, urna odio euismod turpis, sed tempor ipsum. </small></p>
  </section>
  
  <section data-transition="fade-in">
    <p><span>Inline</span></p>
    
    <p style="text-align: left;">
      <img style="vertical-align: bottom;  margin: 0;" src="/media/pattern_1.svg" width="50px">
      <img style="vertical-align: bottom;  margin: 0;" src="/media/pattern_2.svg" width="50px">
      <img style="vertical-align: bottom;  margin: 0;" src="/media/pattern_3.svg" width="50px"> 
    </p>
   
    <p style="text-align: left;"><small> Aliquam erat volutpat. Suspendisse varius faucibus lectus quis sodales. Pellentesque iaculis feugiat pharetra. Morbi nec massa a dui auctor euismod et fringilla
    quam. Morbi iaculis risus vitae nunc vestibulum pharetra.</small></p>
    
    <p style="text-align: left;"><small>Donec ultricies nibh tellus, at feugiat urna fringilla ac. <em style=" border: 3px solid #ffff66;">Sed venenatis ligula sed dui condimentum lobortis.</em> Aenean et lorem massa. Curabitur rhoncus, tortor id euismod ullamcorper, urna odio euismod turpis, sed tempor ipsum. </small></p>
  </section>
  
  <section data-transition="fade-in">
    <p><span>Inline-Block</span></p>
    
    <p style="text-align: left;">
      <img style="margin: 0; border: 3px solid #ffff66;" src="/media/pattern_1.svg" width="50px">
      <img style="margin: 0; border: 3px solid #ffff66;" src="/media/pattern_2.svg" width="50px">
      <img style="margin: 0; border: 3px solid #ffff66;" src="/media/pattern_3.svg" width="50px"> 
    </p>
   
    <p style="text-align: left;"><small> Aliquam erat volutpat. Suspendisse varius faucibus lectus quis sodales. Pellentesque iaculis feugiat pharetra. Morbi nec massa a dui auctor euismod et fringilla
    quam. Morbi iaculis risus vitae nunc vestibulum pharetra.</small></p>
    
    <p style="text-align: left;"><small>Donec ultricies nibh tellus, at feugiat urna fringilla ac. <em style="">Sed venenatis ligula sed dui condimentum lobortis.</em> Aenean et lorem massa. Curabitur rhoncus, tortor id euismod ullamcorper, urna odio euismod turpis, sed tempor ipsum. </small></p>
  </section>
  
  <section data-transition="fade-in">
    <p><span>Inline-Block</span></p>
    
    <p style="text-align: left;">
      <img style="margin: 0; border: 3px solid #ffff66;" src="/media/pattern_1.svg" width="50px">
      <img style="margin: 0; border: 3px solid #ffff66;" src="/media/pattern_2.svg" width="50px">
      <img style="margin: 0; border: 3px solid #ffff66;" src="/media/pattern_3.svg" width="50px"> 
    </p>
   
    <p style="text-align: left;"><small> Aliquam erat volutpat. Suspendisse varius faucibus lectus quis sodales. Pellentesque iaculis feugiat pharetra. <img style="margin: 0; border: 3px solid #ffff66;" src="/media/pattern_1.svg" width="50px"> Morbi nec massa a dui auctor euismod et fringilla
    quam. Morbi iaculis risus vitae nunc vestibulum pharetra.</small></p>
    
    <p style="text-align: left;"><small>Donec ultricies nibh tellus, at feugiat urna fringilla ac. <em style="">Sed venenatis ligula sed dui condimentum lobortis.</em> Aenean et lorem massa. Curabitur rhoncus, tortor id euismod ullamcorper, urna odio euismod turpis, sed tempor ipsum. </small></p>
  </section>
  
  <section data-transition="fade-in">
    <p><span>None</span></p>
    
    <p style="text-align: left;">
      <img style="vertical-align: bottom;  margin: 0;" src="/media/pattern_1.svg" width="50px">
      <img style="vertical-align: bottom;  margin: 0;" src="/media/pattern_2.svg" width="50px">
      <img style="vertical-align: bottom;  margin: 0;" src="/media/pattern_3.svg" width="50px"> 
    </p>
   
    <p style="text-align: left;"><small> Aliquam erat volutpat. Suspendisse varius faucibus lectus quis sodales. Pellentesque iaculis feugiat pharetra. Morbi nec massa a dui auctor euismod et fringilla
    quam. Morbi iaculis risus vitae nunc vestibulum pharetra.</small></p>
    
    <p style="text-align: left;"><small>Donec ultricies nibh tellus, at feugiat urna fringilla ac. <em style="">Sed venenatis ligula sed dui condimentum lobortis.</em> Aenean et lorem massa. Curabitur rhoncus, tortor id euismod ullamcorper, urna odio euismod turpis, sed tempor ipsum. </small></p>
  </section>

</section>

<section>
  <section data-transition="fade-in">
    <h2>Box model</h2>
  </section> 
 
  <section data-transition="fade-in">
    <p>Box model</p>
    <img class="plain" src="/media/20160223_boxModel.svg">
  </section>
  
  <section data-transition="fade-in">
    <p>Width</p>
    <img class="plain" src="/media/20160223_boxModel_width.svg">
  </section>
  
  <section data-transition="fade-in">
    <p>box-sizing attribute</p>
    <img class="plain" src="/media/20160223_boxModel_boxsizing.svg">
  </section>
</section>

<section>
 
  <section data-transition="fade-in">
    <h2>Positioning</h2>
  </section>
  
  <section data-transition="fade-in">
    <p>Static (default)</p>
    <img src="/media/20160224_Position_Static.svg" alt="Illustration of static positioning.">
  </section>
  
  <section data-transition="fade-in">
    <p>Relative</p>
    <img src="/media/20160224_Position_RelativeNoOffset.svg" alt="Illustration of relative positioning with no offset.">
  </section>
  
  <section data-transition="fade-in">
    <p>Relative with offset</p>
    <img src="/media/20160224_Position_Relative.svg" alt="Illustration of relative positioning.">
  </section>
  
  <section data-transition="fade-in">
    <p>Fixed</p>
    <img src="/media/20160224_Position_Fixed.svg" alt="Illustration of fixed positioning.">
  </section>
  
  <section data-transition="fade-in">
    <p>Absolute</p>
    <img src="/media/20160224_Position_Absolute.svg" alt="Illustration of absolute positioning.">
  </section>
  
  <section data-transition="fade-in">
    <p>Absolute inside a positioned element.</p>
    <img src="/media/20160224_Position_AbsoluteInRelative.svg" alt="Illustration of absolute positioning inside positioned element.">
  </section>
  
</section>


<section>
 
  <section>
    <h2>Float</h2>
  </section>
  
  <section data-transition="fade-in">
    <!-- Image not floated-->
    <img style="margin: 20px; margin-bottom: 30px;" src="/media/pattern_1.svg" width="200px">
    
    <p style="text-align: left;"> <small style="display: inline;"> Aliquam erat volutpat. Suspendisse varius faucibus lectus quis sodales. Pellentesque iaculis feugiat pharetra. Morbi nec massa a dui auctor euismod et fringilla
    quam. Morbi iaculis risus vitae nunc vestibulum pharetra.</small></p>
    
    <p style="text-align: left;"><small style="display: inline;">Donec ultricies nibh tellus, at feugiat urna fringilla ac. <em style="">Sed venenatis ligula sed dui condimentum lobortis.</em> Aenean et lorem massa. Curabitur rhoncus, tortor id euismod ullamcorper, urna odio euismod turpis, sed tempor ipsum. </small></p>
  </section>
  
  <section data-transition="fade-in">
    <!-- Image floated right-->
    <p>You can use <code>float</code> to wrap text around images</p>
    <img style="margin: 20px; margin-bottom: 30px; float: right;" src="/media/pattern_1.svg" width="200px">
    
    <p style="text-align: left;"> <small style="display: inline;"> Aliquam erat volutpat. Suspendisse varius faucibus lectus quis sodales. Pellentesque iaculis feugiat pharetra. Morbi nec massa a dui auctor euismod et fringilla
    quam. Morbi iaculis risus vitae nunc vestibulum pharetra.</small></p>
    
    <p style="text-align: left;"><small style="display: inline;">Donec ultricies nibh tellus, at feugiat urna fringilla ac. <em style="">Sed venenatis ligula sed dui condimentum lobortis.</em> Aenean et lorem massa. Curabitur rhoncus, tortor id euismod ullamcorper, urna odio euismod turpis, sed tempor ipsum. </small></p>
  </section>
  
  <section data-transition="fade-in">
    <!-- Paragraph floated right-->
    <p>or other elements like this paragraph</p>
    <p style="text-align: left; float: right; width: 200px; margin: 20px; margin-bottom: 30px; line-height: 0.9em;"> <small style="display: inline;"> Curabitur erat volutpat. Suspendisse varius nunc vestibulum iaculis feugiat pharetra.</small></p>
    
    <p style="text-align: left;"> <small style="display: inline;"> Aliquam erat volutpat. Suspendisse varius faucibus lectus quis sodales. Pellentesque iaculis feugiat pharetra. Morbi nec massa a dui auctor euismod et fringilla
    quam. Morbi iaculis risus vitae nunc vestibulum pharetra.</small></p>
    
    <p style="text-align: left;"><small style="display: inline;">Donec ultricies nibh tellus, at feugiat urna fringilla ac. <em style="">Sed venenatis ligula sed dui condimentum lobortis.</em> Aenean et lorem massa. Curabitur rhoncus, tortor id euismod ullamcorper, urna odio euismod turpis, sed tempor ipsum. </small></p>
  </section>
  
  <section data-transition="fade-in">
    <!-- Floated columns -->
    <p>You can also use <code>float</code> to make columns</p>
    <p style="text-align: left; float: left; width: 28%; margin-right: 6%; padding: 0;"><small style="display: inline;">Curabitur erat volutpat. Suspendisse varius iaculis feugiat pharetra. Morbi iaculis risus vitae nunc vestibulum pharetra. Urna odio euismod turpis.</small></p>
    
    <p style="text-align: left; float: left; width: 28%; margin-right: 6%; padding: 0;"><small style="display: inline;">Aliquam erat volutpat. Suspendisse varius faucibus lectus quis sodales. Pellentesque iaculis feugiat pharetra. Morbi nec massa a dui auctor euismod et fringilla sed tempor ipsum quam. </small></p>
    
    <p style="text-align: left; float: left; width: 28%; padding: 0;"><small style="display: inline;">Donec ultricies nibh tellus, at feugiat urna fringilla ac. <em style="">Sed venenatis ligula sed dui condimentum lobortis.</em> Aenean et lorem massa. Curabitur rhoncus, tortor id euismod ullamcorper. </small></p>
  </section>
  
  <section data-transition="fade-in">   
    <p>How do you stop wrapping of floats?</p> 
    <p style="text-align: left; padding: 10px;"> <small style="display: inline;"><img style="margin: 10px; margin-bottom: 30px; float: right;" src="/media/pattern_1.svg" width="200px"> Aliquam erat volutpat. Suspendisse varius faucibus lectus quis sodales. Pellentesque iaculis feugiat pharetra. Morbi nec massa a dui auctor euismod et fringilla
    quam. </small></p>
    
    <p style="text-align: left;"><small style="display: inline;">Donec ultricies nibh tellus, at feugiat urna fringilla ac. <em style="">Sed venenatis ligula sed dui condimentum lobortis.</em> Aenean et lorem massa. Curabitur rhoncus, tortor id euismod ullamcorper, urna odio euismod turpis, sed tempor ipsum.</small></p>
  </section>
  
  <section data-transition="fade-in">
    <p>Use <code>clear</code> to prevent wrapping</p>  
    <p style="text-align: left; padding: 10px;"> <small style="display: inline;"><img style="margin: 10px; margin-bottom: 30px; float: right;" src="/media/pattern_1.svg" width="200px"> Aliquam erat volutpat. Suspendisse varius faucibus lectus quis sodales. Pellentesque iaculis feugiat pharetra. Morbi nec massa a dui auctor euismod et fringilla
    quam. </small></p>
    
    <p style="text-align: left; clear: both;"><small style="display: inline;">Donec ultricies nibh tellus, at feugiat urna fringilla ac. <em style="">Sed venenatis ligula sed dui condimentum lobortis.</em> Aenean et lorem massa. Curabitur rhoncus, tortor id euismod ullamcorper, urna odio euismod turpis, sed tempor ipsum.</small></p>
  </section>
  
  <section data-transition="fade-in">
    <p>Parent box doesn't contain floated item</p>   
    <p style="text-align: left; background: #555; padding: 10px;"> <small style="display: inline;"><img style="margin: 10px; margin-bottom: 30px; float: right;" src="/media/pattern_1.svg" width="200px"> Aliquam erat volutpat. Suspendisse varius faucibus lectus quis sodales. Pellentesque iaculis feugiat pharetra. Morbi nec massa a dui auctor euismod et fringilla
    quam. </small></p>
    
    <p style="text-align: left; clear: both;"><small style="display: inline;">Donec ultricies nibh tellus, at feugiat urna fringilla ac. <em style="">Sed venenatis ligula sed dui condimentum lobortis.</em> Aenean et lorem massa. Curabitur rhoncus, tortor id euismod ullamcorper, urna odio euismod turpis, sed tempor ipsum.</small></p>
  </section>
  
  <section data-transition="fade-in"> 
    <!-- Clear fix using overflow: auto-->
    <p>"Clear fix" using <code>overflow: auto</code></p>  
    <p style="text-align: left; background: #555; padding: 10px; overflow: auto;"> <img style="margin: 10px; margin-bottom: 0px; float: right;" src="/media/pattern_1.svg" width="200px"> <small style="display: inline;">Aliquam erat volutpat. Suspendisse varius faucibus lectus quis sodales. Pellentesque iaculis feugiat pharetra. Morbi nec massa a dui auctor euismod et fringilla
    quam. </small></p>
    
    <p style="text-align: left; clear: both;"><small style="display: inline;">Donec ultricies nibh tellus, at feugiat urna fringilla ac. <em style="">Sed venenatis ligula sed dui condimentum lobortis.</em> Aenean et lorem massa. Curabitur rhoncus, tortor id euismod ullamcorper, urna odio euismod turpis, sed tempor ipsum.</small></p>
  </section>
  
</section>