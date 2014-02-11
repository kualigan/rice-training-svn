<%--
 Copyright 2007-2009 The Kuali Foundation
 
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
<%@ include file="/rice-portal/jsp/sys/riceTldHeader.jsp"%>

<channel:portalChannelTop channelTitle="Bookstore" />
<div class="body">
  
  <ul class="chan">
     <li><portal:portalLink displayTitle="true" title="Book Order" url="${ConfigProperties.application.url}/bookOrder.do?methodToCall=docHandler&command=initiate&docTypeName=BookOrderDocumentType" /></li>
  	 <li><portal:portalLink displayTitle="true" title="Author Lookup" url="${ConfigProperties.kr.url}/lookup.do?methodToCall=start&businessObjectClassName=train.bookstore.bo.Author&returnLocation=${ConfigProperties.application.url}/portal.do&hideReturnLink=true&docFormKey=88888888" /></li>
  	 <li><portal:portalLink displayTitle="true" title="Book Lookup" url="${ConfigProperties.kr.url}/lookup.do?methodToCall=start&businessObjectClassName=train.bookstore.bo.Book&returnLocation=${ConfigProperties.application.url}/portal.do&hideReturnLink=true&docFormKey=88888888" /></li>
  </ul>

  
</div>
<channel:portalChannelBottom />
