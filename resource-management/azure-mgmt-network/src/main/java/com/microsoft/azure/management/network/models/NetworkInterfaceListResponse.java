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

package com.microsoft.azure.management.network.models;

import com.microsoft.windowsazure.core.LazyArrayList;
import com.microsoft.windowsazure.core.OperationResponse;

import java.util.ArrayList;

/**
* Response for ListNetworkInterface Api service call
*/
public class NetworkInterfaceListResponse extends OperationResponse {
    private ArrayList<NetworkInterface> networkInterfaces;
    
    /**
    * Optional. Gets or sets list of NetworkInterfaces in a resource group
    * @return The NetworkInterfaces value.
    */
    public ArrayList<NetworkInterface> getNetworkInterfaces() {
        return this.networkInterfaces;
    }
    
    /**
    * Optional. Gets or sets list of NetworkInterfaces in a resource group
    * @param networkInterfacesValue The NetworkInterfaces value.
    */
    public void setNetworkInterfaces(final ArrayList<NetworkInterface> networkInterfacesValue) {
        this.networkInterfaces = networkInterfacesValue;
    }
    
    private String nextLink;
    
    /**
    * Optional. Gets the URL to get the next set of results.
    * @return The NextLink value.
    */
    public String getNextLink() {
        return this.nextLink;
    }
    
    /**
    * Optional. Gets the URL to get the next set of results.
    * @param nextLinkValue The NextLink value.
    */
    public void setNextLink(final String nextLinkValue) {
        this.nextLink = nextLinkValue;
    }
    
    /**
    * Initializes a new instance of the NetworkInterfaceListResponse class.
    *
    */
    public NetworkInterfaceListResponse() {
        super();
        this.setNetworkInterfaces(new LazyArrayList<NetworkInterface>());
    }
}
