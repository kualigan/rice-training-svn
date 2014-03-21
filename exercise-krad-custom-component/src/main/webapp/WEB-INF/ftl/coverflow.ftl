<#macro coverFlow group>

    <@krad.groupWrap group=group>
    	<#local items=group.items />
    	<#local manager=group.layoutManager />
 		<#local container=group />
 		
 		<#if manager.styleClassesAsString?has_content>
        	<#local styleClass="class=\"${manager.styleClassesAsString}\""/>
        </#if>

	    <#if manager.style?has_content>
    	    <#local style="style=\"${manager.style}\""/>
   		</#if>
	
	<div id="lookup-results-coverflow" class="carousel slide" data-ride="carousel">
	  <!-- Indicators -->
	  <ol class="carousel-indicators">
	  	<#list items as item>
	    <li data-target="#lookup-results-coverflow" data-slide-to="${item_index + 1}"></li>
	    </#list>
	  </ol>
	
	  <!-- Wrapper for slides -->
	  <div class="carousel-inner">
	  	<#list items as item>
	    <div class="item active">
	      <img src="..." alt="...">
	      <div class="carousel-caption">
	      </div>
	    </div>
	    </#list>
	  </div>
	
	  <!-- Controls -->
	  <a class="left carousel-control" href="#lookup-results-coverflow" data-slide="prev">
	    <span class="glyphicon glyphicon-chevron-left"></span>
	  </a>
	  <a class="right carousel-control" href="#lookup-results-coverflow" data-slide="next">
	    <span class="glyphicon glyphicon-chevron-right"></span>
	  </a>
	</div>
    </@krad.groupWrap>

</#macro>
