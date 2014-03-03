<%@ include file="/kr/WEB-INF/jsp/tldHeader.jsp"%>

<%@ attribute name="editingMode" required="true" description="used to decide if items may be edited" type="java.util.Map"%>
<c:set var="readOnly" value="${!KualiForm.documentActions[Constants.KUALI_ACTION_CAN_EDIT]}" />

<kul:tab tabTitle="Book Order Entries" defaultOpen="true">
<c:set var="boeAttributes" value="${DataDictionary.BookOrderEntry.attributes}" />
 <div class="tab-container" align=center>
	<h3>Entries</h3>
	<table cellpadding=0 class="datatable" summary="Book Order Entries">
		<tr>
            <kul:htmlAttributeHeaderCell literalLabel="&nbsp;"/>
            <kul:htmlAttributeHeaderCell attributeEntry="${boeAttributes.bookId}"/>
            <kul:htmlAttributeHeaderCell attributeEntry="${boeAttributes.quantity}"/>
            <c:if test="${not readOnly}">
                <kul:htmlAttributeHeaderCell literalLabel="Actions"/>
            </c:if>
		</tr>
        <c:if test="${not readOnly}">
            <tr>
                <kul:htmlAttributeHeaderCell literalLabel="add:" scope="row"/>
                <td class="infoline">
                  <kul:htmlControlAttribute 
                  	attributeEntry="${boeAttributes.bookId}"
                  	property="newBookOrderEntry.bookId"
                  	readOnly="${readOnly}"/>
                  <c:if test="${not readOnly}">
      				&nbsp;
      				<kul:lookup boClassName="train.bookstore.bo.Book" fieldConversions="id:newBookOrderEntry.bookId" />
			      </c:if>
                </td>
                <td class="infoline">
                	<kul:htmlControlAttribute attributeEntry="${boeAttributes.quantity}" property="newBookOrderEntry.quantity" readOnly="${readOnly}"/>
                </td>
                <td class="infoline">
                	<div align="center">
                		<html:image property="methodToCall.addBookOrderEntry" src="${ConfigProperties.kr.externalizable.images.url}tinybutton-add1.gif" alt="Add a Book Order Entry" title="Add a Book Order Entry" styleClass="tinybutton"/>
                	</div>
                </td>
            </tr>
        </c:if>
        <logic:iterate id="bookOrderEntry" name="KualiForm" property="document.bookOrderEntries" indexId="ctr">
            <tr>
                <kul:htmlAttributeHeaderCell literalLabel="${ctr+1}:" scope="row"/>
                
                <td class="datacell">
                  <kul:htmlControlAttribute 
                  	attributeEntry="${boeAttributes.bookId}"
                  	property="document.bookOrderEntries[${ctr}].bookId"
                  	readOnly="${readOnly}"/>
    			  <c:if test="${not readOnly}">
      				&nbsp;
      				<kul:lookup boClassName="train.bookstore.bo.Book" fieldConversions="id:document.bookOrderEntries[${ctr}].bookId" />
			      </c:if>
                </td>
                <td class="datacell">
                	<kul:htmlControlAttribute attributeEntry="${boeAttributes.quantity}" property="document.bookOrderEntries[${ctr}].quantity" readOnly="${readOnly}"/>
                </td>
                <c:if test="${not readOnly}">
                    <td class="datacell">
                    	<div align="center">
                    		<html:image property="methodToCall.deleteBookOrderEntry.line${ctr}" src="${ConfigProperties.kr.externalizable.images.url}tinybutton-delete1.gif" alt="Delete a Book Order Entry" title="Delete a Book Order Entry" styleClass="tinybutton"/>
                    	</div>
                    </td>
                </c:if>
            </tr>
        </logic:iterate>
	</table>
  </div>
</kul:tab>
