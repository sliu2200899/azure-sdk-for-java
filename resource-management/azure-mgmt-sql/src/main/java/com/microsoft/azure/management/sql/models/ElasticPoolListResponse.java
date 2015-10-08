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

package com.microsoft.azure.management.sql.models;

import com.microsoft.windowsazure.core.LazyArrayList;
import com.microsoft.windowsazure.core.OperationResponse;

import java.util.ArrayList;
import java.util.Iterator;

/**
* Represents the response to a List Azure Sql Elastic Pool request.
*/
public class ElasticPoolListResponse extends OperationResponse implements Iterable<ElasticPool> {
    private ArrayList<ElasticPool> elasticPools;
    
    /**
    * Optional. Gets or sets the list of Azure Sql Elastic Pools hosted in the
    * server.
    * @return The ElasticPools value.
    */
    public ArrayList<ElasticPool> getElasticPools() {
        return this.elasticPools;
    }
    
    /**
    * Optional. Gets or sets the list of Azure Sql Elastic Pools hosted in the
    * server.
    * @param elasticPoolsValue The ElasticPools value.
    */
    public void setElasticPools(final ArrayList<ElasticPool> elasticPoolsValue) {
        this.elasticPools = elasticPoolsValue;
    }
    
    /**
    * Initializes a new instance of the ElasticPoolListResponse class.
    *
    */
    public ElasticPoolListResponse() {
        super();
        this.setElasticPools(new LazyArrayList<ElasticPool>());
    }
    
    /**
    * Gets the sequence of ElasticPools.
    *
    */
    public Iterator<ElasticPool> iterator() {
        return this.getElasticPools().iterator();
    }
}
