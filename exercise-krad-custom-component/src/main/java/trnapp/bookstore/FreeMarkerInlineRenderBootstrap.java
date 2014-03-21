/**
 * Copyright 2005-2014 The Kuali Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.opensource.org/licenses/ecl2.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package trnapp.bookstore;

import org.springframework.beans.factory.InitializingBean;

import freemarker.core.InlineTemplateElement;

/**
 * Register inline template processing adaptors for high-traffic KRAD templates.
 * 
 * @author Kuali Rice Team (rice.collab@kuali.org)
 */
public class FreeMarkerInlineRenderBootstrap implements InitializingBean {

    /**
     * Register high-traffic KRAD template adaptors.  
     * 
     * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        InlineTemplateElement.registerAdaptor("coverFlow", new FreeMarkerCoverFlowAdapter());
    }

}