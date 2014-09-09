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

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.kuali.rice.krad.datadictionary.parse.BeanTag;
import org.kuali.rice.krad.datadictionary.parse.BeanTagAttribute;
import org.kuali.rice.krad.datadictionary.validator.ValidationTrace;
import org.kuali.rice.krad.datadictionary.validator.Validator;
import org.kuali.rice.krad.service.KRADServiceLocatorWeb;
import org.kuali.rice.krad.uif.UifConstants;
import org.kuali.rice.krad.uif.component.Component;
import org.kuali.rice.krad.uif.lifecycle.ViewLifecycleRestriction;
import org.kuali.rice.krad.uif.util.ComponentFactory;
import org.kuali.rice.krad.uif.util.LifecycleElement;
import org.kuali.rice.krad.util.KRADConstants;
import org.kuali.rice.krad.uif.element.ContentElementBase;

/**
 *
 * @author Kuali Rice Team (rice.collab@kuali.org)
 */
@BeanTag(name = "card-bean", parent = "Uif-Card")
public class Card  extends ContentElementBase {
    private static final long serialVersionUID = -6491546893195180115L;

    private String labelText;
    private String url;

    public Card() {
    }

    public void setLabelText(final String labelText) {
	this.labelText = labelText;
    }

    public String getLabelText() {
	return labelText;
    }

    public void setUrl(final String url) {
	this.url = url;
    }
    
    public String getUrl() {
	return url;
    }
}
