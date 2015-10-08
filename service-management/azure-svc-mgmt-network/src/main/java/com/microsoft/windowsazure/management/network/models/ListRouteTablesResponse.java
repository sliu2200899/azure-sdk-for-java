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

package com.microsoft.windowsazure.management.network.models;

import com.microsoft.windowsazure.core.LazyArrayList;
import com.microsoft.windowsazure.core.OperationResponse;

import java.util.ArrayList;
import java.util.Iterator;

/**
* A standard service response including an HTTP status code and request ID.
*/
public class ListRouteTablesResponse extends OperationResponse implements Iterable<RouteTable> {
    private ArrayList<RouteTable> routeTables;
    
    /**
    * Optional.
    * @return The RouteTables value.
    */
    public ArrayList<RouteTable> getRouteTables() {
        return this.routeTables;
    }
    
    /**
    * Optional.
    * @param routeTablesValue The RouteTables value.
    */
    public void setRouteTables(final ArrayList<RouteTable> routeTablesValue) {
        this.routeTables = routeTablesValue;
    }
    
    /**
    * Initializes a new instance of the ListRouteTablesResponse class.
    *
    */
    public ListRouteTablesResponse() {
        super();
        this.setRouteTables(new LazyArrayList<RouteTable>());
    }
    
    /**
    * Gets the sequence of RouteTables.
    *
    */
    public Iterator<RouteTable> iterator() {
        return this.getRouteTables().iterator();
    }
}
