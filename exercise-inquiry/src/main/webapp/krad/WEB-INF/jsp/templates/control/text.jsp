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

<tiles:useAttribute name="control" classname="org.kuali.rice.krad.uif.control.TextControl"/>
<tiles:useAttribute name="field" classname="org.kuali.rice.krad.uif.field.InputField"/>

<%--
    Standard HTML Text Input
    
 --%>

<form:input id="${control.id}" path="${field.bindingInfo.bindingPath}" disabled="${control.disabled}"
            size="${control.size}" maxlength="${control.maxLength}" readonly="${control.readOnly}"
            cssClass="${control.styleClassesAsString}" cssStyle="${control.style}"
            tabindex="${control.tabIndex}" minLength="${control.minLength}"/>
<%--
Use double quotes around watermark text to avoid apostrophe trouble
credit - http://rayaspnet.blogspot.com/2011/03/how-to-handle-apostrophe-in-javascript.html
 --%>
<c:if test="${(!empty control.watermarkText)}">
	<krad:script value="createWatermark('${control.id}', \"${control.watermarkText}\");" />
</c:if>

<%-- render date picker widget --%>
<krad:template component="${control.datePicker}" componentId="${control.id}"/>

<c:if test="${control.textExpand}">
	<krad:script value="setupTextPopout('${control.id}', '${field.labelField.labelText}', '${field.instructionalMessageField.messageText}', '${field.constraintMessageField.messageText}', '${ConfigProperties['krad.externalizable.images.url']}');" />
</c:if>
