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

import java.io.IOException;
import java.io.Serializable;

import org.kuali.rice.krad.uif.container.CollectionGroup;

import freemarker.core.Environment;
import freemarker.core.InlineTemplateAdaptor;
import freemarker.template.TemplateException;

/**
 * Inline FreeMarker template adaptor for supporting collectionGroup.ftl 
 * 
 * @author Leo Przybylski
 */
public class FreeMarkerCoverFlowAdapter implements InlineTemplateAdaptor, Serializable {


    /**
     * Render a collection group component inline.
     * 
     * @see freemarker.core.InlineKradAdaptor#accept(freemarker.core.Environment)
     */
    @Override
    public void accept(Environment env) throws TemplateException, IOException {
        final CollectionGroup group = FreeMarkerInlineRenderUtils.resolve(env, "coverFlow", CollectionGroup.class);
        FreeMarkerInlineRenderUtils.renderCollectionGroup(env, group);
    }
}
