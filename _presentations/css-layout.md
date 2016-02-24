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
  <h2>Float, clear and overflow</h2>
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