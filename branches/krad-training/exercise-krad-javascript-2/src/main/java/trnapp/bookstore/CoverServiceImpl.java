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

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Test service exposed through REST and connected to a {@link org.kuali.rice.krad.uif.element.DataTable}
 * component in the UIF
 *
 * @author Kuali Rice Team (rice.collab@kuali.org)
 */
@Path("/")
public class CoverServiceImpl {

    /**
     * Returns a string of data in JSON format for populating the table
     *
     * @return String json data string
     */
    @GET
    @Path("/TableData")
    public String getTableData() {
        StringBuilder sb = new StringBuilder();

        return sb.toString();
    }
}