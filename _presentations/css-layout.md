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
 
  <section data-transition="fade-in">
    <p><span style="visibility: hidden">Block</span></p>   
   
    <p style="text-align: left;"><small> Aliquam erat volutpat. Suspendisse varius <img style="vertical-align: bottom;  margin: 0;" src="/media/flower.svg" width="50px"> faucibus lectus quis sodales.  Donec rutrum rutrum risus eget tincidunt. Pellentesque iaculis feugiat pharetra. Morbi nec massa a dui auctor euismod et fringilla quam. Morbi iaculis risus vitae nunc vestibulum pharetra.</small></p>
    
    <p style="text-align: left;"><small>Donec ultricies nibh tellus, at feugiat urna fringilla ac. Vestibulum dapibus fermentum nulla, sed mattis mauris laoreet et. <em style="">Sed venenatis ligula sed dui condimentum lobortis.</em> Aenean et lorem massa. Curabitur rhoncus, tortor id euismod ullamcorper, urna odio euismod turpis, sed tempor ipsum nisi congue risus. </small></p>
  </section>
  
   <section data-transition="fade-in">
    <p>Block</p>   
   
    <p style="text-align: left; border: 1px solid #ffffbb;"><small> Aliquam erat volutpat. Suspendisse varius <img style="vertical-align: bottom;  margin: 0;" src="/media/flower.svg" width="50px"> faucibus lectus quis sodales.  Donec rutrum rutrum risus eget tincidunt. Pellentesque iaculis feugiat pharetra. Morbi nec massa a dui auctor euismod et fringilla quam. Morbi iaculis risus vitae nunc vestibulum pharetra.</small></p>
    
    <p style="text-align: left; border: 1px solid #ffffbb;"><small>Donec ultricies nibh tellus, at feugiat urna fringilla ac. Vestibulum dapibus fermentum nulla, sed mattis mauris laoreet et. <em style="">Sed venenatis ligula sed dui condimentum lobortis.</em> Aenean et lorem massa. Curabitur rhoncus, tortor id euismod ullamcorper, urna odio euismod turpis, sed tempor ipsum nisi congue risus. </small></p>
  </section>
  
  <section data-transition="fade-in">
    <p>Inline</p>   
   
    <p style="text-align: left;"><small> Aliquam erat volutpat. Suspendisse varius <img style="vertical-align: bottom;  margin: 0;" src="/media/flower.svg" width="50px"> faucibus lectus quis sodales.  Donec rutrum rutrum risus eget tincidunt. Pellentesque iaculis feugiat pharetra. Morbi nec massa a dui auctor euismod et fringilla quam. Morbi iaculis risus vitae nunc vestibulum pharetra.</small></p>
    
    <p style="text-align: left;"><small>Donec ultricies nibh tellus, at feugiat urna fringilla ac. Vestibulum dapibus fermentum nulla, sed mattis mauris laoreet et. <em style="border: 1px solid #ffffbb;">Sed venenatis ligula sed dui condimentum lobortis.</em> Aenean et lorem massa. Curabitur rhoncus, tortor id euismod ullamcorper, urna odio euismod turpis, sed tempor ipsum nisi congue risus. </small></p>
  </section>
  
  <section data-transition="fade-in">
    <p>Inline-block</p>   
   
    <p style="text-align: left;"><small> Aliquam erat volutpat. Suspendisse varius <img style="border: 1px solid #ffffbb; vertical-align: bottom;  margin: 0;" src="/media/flower.svg" width="50px"> faucibus lectus quis sodales.  Donec rutrum rutrum risus eget tincidunt. Pellentesque iaculis feugiat pharetra. Morbi nec massa a dui auctor euismod et fringilla quam. Morbi iaculis risus vitae nunc vestibulum pharetra.</small></p>
    
    <p style="text-align: left;"><small>Donec ultricies nibh tellus, at feugiat urna fringilla ac. Vestibulum dapibus fermentum nulla, sed mattis mauris laoreet et. <em style="">Sed venenatis ligula sed dui condimentum lobortis.</em> Aenean et lorem massa. Curabitur rhoncus, tortor id euismod ullamcorper, urna odio euismod turpis, sed tempor ipsum nisi congue risus. </small></p>
  </section>
   
   
  <section data-transition="fade-in">
    <p>None</p>   
   
    <p style="text-align: left;"><small> Aliquam erat volutpat. Suspendisse varius <img style="vertical-align: bottom;  margin: 0;" src="/media/flower.svg" width="50px"> faucibus lectus quis sodales.  Donec rutrum rutrum risus eget tincidunt. Pellentesque iaculis feugiat pharetra. Morbi nec massa a dui auctor euismod et fringilla quam. Morbi iaculis risus vitae nunc vestibulum pharetra.</small></p>
    
    <p style="text-align: left;"><small>Donec ultricies nibh tellus, at feugiat urna fringilla ac. Vestibulum dapibus fermentum nulla, sed mattis mauris laoreet et. <em style="">Sed venenatis ligula sed dui condimentum lobortis.</em> Aenean et lorem massa. Curabitur rhoncus, tortor id euismod ullamcorper, urna odio euismod turpis, sed tempor ipsum nisi congue risus. </small></p>
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