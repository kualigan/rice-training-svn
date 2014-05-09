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

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Test service exposed through REST and connected to a {@link org.kuali.rice.krad.uif.element.DataTable}
 * component in the UIF
 *
 * @author Kuali Rice Team (rice.collab@kuali.org)
 */
@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class CoverServiceImpl {

    /**
     * Returns a string of data in JSON format for populating the table
     *
     * @return String json data string
     */
    @GET
    @Path("/Covers")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTableData() {
    	    	
    	return Response.ok(new Results()).build();
    }
    
    @XmlRootElement
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"covers"})
    static final class Results {
    	@XmlElement
    	protected List<Cover> covers;
    	
    	public Results() {
        	covers = new ArrayList<Cover>();
        	covers.add(new Cover(1L, "/trnapp/images/cover1.png"));
        	covers.add(new Cover(2L, "/trnapp/images/cover2.png"));
        	covers.add(new Cover(3L, "/trnapp/images/cover3.png"));
        	covers.add(new Cover(4L, "/trnapp/images/cover4.png"));
        	covers.add(new Cover(5L, "/trnapp/images/cover5.png"));
        	covers.add(new Cover(6L, "/trnapp/images/cover6.png"));
    	}

		public List<Cover> getCovers() {
			return covers;
		}

		public void setCovers(List<Cover> covers) {
			this.covers = covers;
		}
    	
    }
}
