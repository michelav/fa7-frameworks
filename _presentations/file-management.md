---
layout: presentation
title: File management for the web
description: The basics of HTML structure
theme: zerozerozero
transition: slide
---

<!--

File management on the web
  * How linking works
  * Files to track
  * Moving files around
  * Keep it organized
  * FTP
    * Basics
  * GIT
    * Forking
    * Commiting
    * Branching
    * Push
    * Pull
    * Pull request

-->

<section>

  <h2>File management for the web</h2>

</section>

<section>
  
  <section>
    <h2>Links</h2>
  </section>
  
  <section>
    <h3>Absolute links</h3>
    <p class="fragment" style="text-align: left; width: 45%; margin: 0 auto;">
      Barack Obama<br>
      1600 Pennsylvania Ave.<br>
      Washington DC 20500<br>
      USA
    </p>
  </section>
  
  <section>
    <h3>Relative links</h3>
    <p class="fragment">
      "Go three blocks. Turn right at<br>
      the Washington Monument<br>
      and the White House will be<br>
      right in front of you."
    </p>
  </section>
  
  <section>
    <p>
      <strong>Absolute:</strong><br> 
      <code>http://artist.com/gallery/page1.html</code>
    </p>
    <p class="fragment">
      <strong>Relative:</strong><br>
      <code>gallery/page1.html</code>
    </p>   
  </section>
  
  <section>
    
<svg version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px"
	 viewBox="0 0 960 560" style="enable-background:new 0 0 960 560;" xml:space="preserve">
<style type="text/css">
    * { 
      fill:#FFFFFF;
      font-family:'Helvetica', sans-serif;
    }
    .path-string { font-size:30px; }
    .tree-label { font-size:24px; }
    .blackout { fill: #000000; }
	.arrow-line {fill:none;stroke:#FF0000;stroke-width:3;stroke-miterlimit:10;}
	.arrow-ends {fill:#FF0000;}
	.dashed-line {fill:none;stroke:#FBB03B;stroke-width:2;stroke-miterlimit:10;stroke-dasharray:3,3;}
	.imaginary-files {fill:#FBB03B;}
	.branch-line {fill:none;stroke:#FFFFFF;stroke-width:2;stroke-miterlimit:10;}
</style>

<g id="one" >
	<g id="arrow-1" class="fragment">
		<path class="arrow-line" d="M167.7,64.1c147.7-17.4,213.4,44.3,187.2,194.5"/>
		<ellipse transform="matrix(0.9931 -0.1172 0.1172 0.9931 -6.349 20.1332)" class="arrow-ends" cx="168.1" cy="64.1" rx="7.9" ry="7.9"/>
		<path class="arrow-ends" d="M352.6,271c-1.1-6.3-3.5-14.2-6.6-19.5l9.2,5.4l10.5-1.7C360.9,258.9,355.9,265.5,352.6,271z"/>
	</g>
	<text class="path-string fragment" transform="matrix(1 0 0 1 470.9998 256.1185)" >/stories/goldilock/page1.html</text>
</g>
  
<g id="two" class="fragment">
	<polygon class="blackout" points="895,433.4 380.3,433.4 380.3,271 328,271 328,114 279,86 160,86 160,38 895,38"/>
	<text class="path-string fragment" transform="matrix(1 0 0 1 470.9998 256.1185)" >/image/bears.jpg</text>
	<g id="arrow-2">
		<path class="arrow-line" d="M391.4,282.8c53.4-55.4,23.7-155.8-48.3-152.9"/>
		<ellipse transform="matrix(0.7195 -0.6945 0.6945 0.7195 -86.3358 351.2878)" class="arrow-ends" cx="391.7" cy="282.5" rx="7.9" ry="7.9"/>
		<path class="arrow-ends" d="M330.5,131.4c5.7-2.9,12.6-7.4,16.7-11.9l-2.5,10.3l4.7,9.5C344.5,135.9,336.7,132.9,330.5,131.4z"/>
	</g>
</g>
  
<g id="three" class="fragment">
	<polygon class="blackout" points="895,433.4 380.3,433.4 380.3,271 328,271 328,114 279,86 160,86 160,38 895,38 	"/>
	<text class="path-string fragment" transform="matrix(1 0 0 1 470.9998 256.1185)">/stories/goldilock/page2.html</text>
	<text class="path-string fragment" transform="matrix(1 0 0 1 470.9998 300.2937)" >page2.html</text>
	<g id="arrow-3">
		<path class="arrow-line" d="M392.6,284.4c58.4-29.3,68.8,47.6,8.7,37.6"/>
		<ellipse transform="matrix(0.8778 -0.4791 0.4791 0.8778 -88.1343 222.9754)" class="arrow-ends" cx="392.9" cy="284.2" rx="7.9" ry="7.9"/>
		<path class="arrow-ends" d="M389,319c6.3-0.8,14.4-2.8,19.8-5.6l-5.8,8.9l1.2,10.5C400.6,327.9,394.3,322.5,389,319z"/>
	</g>
</g>
  
<g id="four" class="fragment">
	<polygon class="blackout" points="895,433.4 380.3,433.4 380.3,271 328,271 328,114 279,86 160,86 160,38 895,38 	"/>
	<text class="path-string fragment" transform="matrix(1 0 0 1 470.9998 256.1185)" >threepigs/page1.html</text>
	<g id="arrow-4">
		<path class="arrow-line" d="M340.4,223.9c81.7-8.7,108.5,109,59.2,149.3"/>
		<ellipse transform="matrix(0.9894 -0.145 0.145 0.9894 -28.8552 51.7793)" class="arrow-ends" cx="340.8" cy="223.9" rx="7.9" ry="7.9"/>
		<path class="arrow-ends" d="M389,380c3.8-5.1,7.9-12.3,9.5-18.2l2.5,10.3l8.5,6.4C403.5,377.7,395.2,378.6,389,380z"/>
	</g>
</g>
  
<g id="five" class="fragment">
	<polygon class="blackout" id="blackout" points="895,433.4 380.3,433.4 380.3,271 328,271 328,114 279,86 160,86 160,38 895,38 	"/>
	<text class="path-string fragment" transform="matrix(1 0 0 1 470.9998 256.1185)">/images/wolf.jpg</text>
	<text class="path-string fragment" transform="matrix(1 0 0 1 470.9998 300.2937)">images/wolf.jpg</text>
	<g id="imaginarydir" class="fragment">
		<polyline class="dashed-line" points="262,454 262,474 282,474"/>
        <text transform="matrix(1 0 0 1 285.517 484.3661)" class="imaginary-files tree-label">wolf.jpg</text>
      
        <polyline class="dashed-line" points="227,413 227,438 245,438"/>
		<text transform="matrix(1 0 0 1 250.1836 448.3661)" class="imaginary-files tree-label">images</text>		
	</g>
	<g id="arrow-5">
		<path class="arrow-line" d="M384.8,374.4c62.9-76.2,14.2-194.8-59.1-207.3"/>
		<ellipse transform="matrix(0.6554 -0.7553 0.7553 0.6554 -149.8331 419.6924)" class="arrow-ends" cx="385" cy="374" rx="7.9" ry="7.9"/>
		<path class="arrow-ends" d="M313,166c6.1-1.6,13.9-4.7,18.8-8.3l-4.5,9.6l2.7,10.3C325.7,173.2,318.7,168.8,313,166z"/>
	</g>
</g>
  
<g id="tree">
	<polyline class="branch-line" points="150,88 150,194 170,194 	"/>
	<line class="branch-line" x1="151" y1="102" x2="170" y2="102"/>
	<text transform="matrix(1 0 0 1 141.8331 77.6667)" class="tree-label">/</text>
	<polyline class="branch-line" points="188,120 188,129.5 188,166 207,166 	"/>
	<line class="branch-line" x1="207" y1="138" x2="189" y2="138"/>
	<text transform="matrix(1 0 0 1 177.5169 109.6667)" class="tree-label">images</text>
	<text transform="matrix(1 0 0 1 214.8502 140.3176)" class="tree-label">bears.jpg</text>
	<text transform="matrix(1 0 0 1 214.8502 170.9842)" class="tree-label">wolf.gif</text>
	<line class="branch-line" x1="207" y1="225" x2="189" y2="225"/>
	<line class="branch-line" x1="207" y1="257" x2="189" y2="257"/>
	<polyline class="branch-line" points="228,271 228,319 245,319 	"/>
	<polyline class="branch-line" points="227,363 227,413 245,413 	"/>
	<line class="branch-line" x1="229" y1="288" x2="245" y2="288"/>
	<line class="branch-line" x1="228" y1="380" x2="245" y2="380"/>
	<polyline class="branch-line" points="187,207 187,348 207,348 	"/>
	<text transform="matrix(1 0 0 1 177.5169 199.6667)" class="tree-label">stories</text>
	<text transform="matrix(1 0 0 1 214.8502 231)" class="tree-label">intro.html</text>
	<text transform="matrix(1 0 0 1 214.8502 263)" class="tree-label">goldilocks</text>
	<text transform="matrix(1 0 0 1 214.8502 355.084)" class="tree-label">threepigs</text>
	<text transform="matrix(1 0 0 1 250.1836 294.5)" class="tree-label">page1.html</text>
	<text transform="matrix(1 0 0 1 250.1836 386.9331)" class="tree-label">page1.html</text>
	<text transform="matrix(1 0 0 1 250.1836 324.9331)" class="tree-label">page2.html</text>
	<text transform="matrix(1 0 0 1 250.1836 417.3661)" class="tree-label">page2.html</text>
</g>
  
</svg>
    
  </section>
  
  
  
</section>