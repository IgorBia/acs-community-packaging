/*
 * Copyright (C) 2005 Alfresco, Inc.
 *
 * Licensed under the Mozilla Public License version 1.1 
 * with a permitted attribution clause. You may obtain a
 * copy of the License at
 *
 *   http://www.alfresco.org/legal/license.txt
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the
 * License.
 */
package org.alfresco.web.templating;

import org.w3c.dom.Document;
import java.io.Serializable;
import java.io.Writer;

/**
 * Generates a user interface for inputing data into a template.
 */
public interface TemplateInputMethod
    extends Serializable
{
   
   /////////////////////////////////////////////////////////////////////////////
   
   /**
    * An abstraction layer around the xml content which allows
    * for reseting the xml content being collected by the input method.
    */
   public interface InstanceData
   {
       public Document getContent();
   
       public void setContent(final Document d);
   }

   /////////////////////////////////////////////////////////////////////////////

   /**
    * Generates a user interface for inputing data into this template.
    *
    * @param instanceData provides the xml instance data if available.
    * @param tt the template type to generate for
    * @param out the writer to write the output to.
    */
   public void generate(final TemplateInputMethod.InstanceData instanceData,
                        final TemplateType tt,
                        final Writer out);
}
