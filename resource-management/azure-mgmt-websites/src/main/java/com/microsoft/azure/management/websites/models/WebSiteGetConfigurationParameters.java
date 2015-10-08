/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.websites.models;

import com.microsoft.windowsazure.core.LazyArrayList;

import java.util.ArrayList;

/**
* The Get Web Site Configuration operation parameters.
*/
public class WebSiteGetConfigurationParameters {
    private ArrayList<String> propertiesToInclude;
    
    /**
    * Optional. Specifies a list of the names of any addtional parameters to
    * return.
    * @return The PropertiesToInclude value.
    */
    public ArrayList<String> getPropertiesToInclude() {
        return this.propertiesToInclude;
    }
    
    /**
    * Optional. Specifies a list of the names of any addtional parameters to
    * return.
    * @param propertiesToIncludeValue The PropertiesToInclude value.
    */
    public void setPropertiesToInclude(final ArrayList<String> propertiesToIncludeValue) {
        this.propertiesToInclude = propertiesToIncludeValue;
    }
    
    /**
    * Initializes a new instance of the WebSiteGetConfigurationParameters class.
    *
    */
    public WebSiteGetConfigurationParameters() {
        this.setPropertiesToInclude(new LazyArrayList<String>());
    }
}
