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
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.kuali.rice.krad.uif.container.CollectionGroup;

import org.apache.commons.lang.StringEscapeUtils;
import org.kuali.rice.krad.uif.UifConstants;
import org.kuali.rice.krad.uif.component.Component;
import org.kuali.rice.krad.uif.component.ComponentBase;
import org.kuali.rice.krad.uif.container.CollectionGroup;
import org.kuali.rice.krad.uif.container.Group;
import org.kuali.rice.krad.uif.layout.LayoutManager;
import org.kuali.rice.krad.uif.layout.StackedLayoutManager;
import org.kuali.rice.krad.uif.widget.Disclosure;
import org.kuali.rice.krad.uif.widget.Pager;
import org.kuali.rice.krad.uif.widget.Tooltip;
import org.springframework.util.StringUtils;

import freemarker.core.Environment;
import freemarker.core.InlineTemplateAdaptor;
import freemarker.core.InlineTemplateUtils;
import freemarker.core.Macro;
import freemarker.ext.beans.BeansWrapper;
import freemarker.template.ObjectWrapper;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;

import org.kuali.rice.krad.uif.freemarker.FreeMarkerInlineRenderUtils;

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
        final CollectionGroup group = FreeMarkerInlineRenderUtils.resolve(env, "group", CollectionGroup.class);

        final Macro fmMacro = (Macro) env.getMainNamespace().get("coverFlow");
        final Map<String, Object> args = new java.util.HashMap<String, Object>();
        args.put("group", group);
        InlineTemplateUtils.invokeMacro(env, fmMacro, args, null); 
   }
}
