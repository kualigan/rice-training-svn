<%--

    Copyright 2005-2012 The Kuali Foundation

    Licensed under the Educational Community License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.opensource.org/licenses/ecl2.php

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

--%>
<%@ include file="/krad/WEB-INF/jsp/tldHeader.jsp"%>

<tiles:useAttribute name="widget" classname="org.kuali.rice.krad.uif.widget.Disclosure"/>
<tiles:useAttribute name="parent" classname="org.kuali.rice.krad.uif.container.Group"/>

<%--
    Invokes JS method to setup collapse/expand script for group
 --%>
 
<c:set var="isOpen" value="${widget.defaultOpen}"/>
 
<krad:script value="
  createDisclosure('${parent.id}', '${parent.header.id}', '${widget.id}', ${isOpen},
  		          '${widget.collapseImageSrc}', '${widget.expandImageSrc}', ${widget.animationSpeed}, ${widget.renderImage});
"/>
