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

package com.microsoft.windowsazure.management.compute.models;

import com.microsoft.windowsazure.core.LazyArrayList;

import java.util.ArrayList;

/**
* Parameters supplied to the Replicate Virtual Machine Image operation.
*/
public class VirtualMachineOSImageReplicateParameters {
    private ComputeImageAttributes computeImageAttributes;
    
    /**
    * Required. The compute image attributes. Metadata which is required for
    * this image to be useablein the Microsoft.Compute Provider.The
    * combination of values provided for Offer, Sku, and Verison must be
    * unique for a publisher.
    * @return The ComputeImageAttributes value.
    */
    public ComputeImageAttributes getComputeImageAttributes() {
        return this.computeImageAttributes;
    }
    
    /**
    * Required. The compute image attributes. Metadata which is required for
    * this image to be useablein the Microsoft.Compute Provider.The
    * combination of values provided for Offer, Sku, and Verison must be
    * unique for a publisher.
    * @param computeImageAttributesValue The ComputeImageAttributes value.
    */
    public void setComputeImageAttributes(final ComputeImageAttributes computeImageAttributesValue) {
        this.computeImageAttributes = computeImageAttributesValue;
    }
    
    private MarketplaceImageAttributes marketplaceImageAttributes;
    
    /**
    * Optional. The market place image attributes.Metadata which is required
    * for VM Marketplace sourced imagesto be useable in the Microsoft.Compute
    * Provider.
    * @return The MarketplaceImageAttributes value.
    */
    public MarketplaceImageAttributes getMarketplaceImageAttributes() {
        return this.marketplaceImageAttributes;
    }
    
    /**
    * Optional. The market place image attributes.Metadata which is required
    * for VM Marketplace sourced imagesto be useable in the Microsoft.Compute
    * Provider.
    * @param marketplaceImageAttributesValue The MarketplaceImageAttributes
    * value.
    */
    public void setMarketplaceImageAttributes(final MarketplaceImageAttributes marketplaceImageAttributesValue) {
        this.marketplaceImageAttributes = marketplaceImageAttributesValue;
    }
    
    private ArrayList<String> targetLocations;
    
    /**
    * Optional. The replication target regional locations.Note: The regions in
    * the request body are not additive. If an OS Image has already been
    * replicated to Regions A, B, and C, and a request is made to replicate to
    * Regions A and D, the VM Image will remain in Region A, will be
    * replicated in Region D, and will be unreplicated from Regions B and C.
    * @return The TargetLocations value.
    */
    public ArrayList<String> getTargetLocations() {
        return this.targetLocations;
    }
    
    /**
    * Optional. The replication target regional locations.Note: The regions in
    * the request body are not additive. If an OS Image has already been
    * replicated to Regions A, B, and C, and a request is made to replicate to
    * Regions A and D, the VM Image will remain in Region A, will be
    * replicated in Region D, and will be unreplicated from Regions B and C.
    * @param targetLocationsValue The TargetLocations value.
    */
    public void setTargetLocations(final ArrayList<String> targetLocationsValue) {
        this.targetLocations = targetLocationsValue;
    }
    
    /**
    * Initializes a new instance of the
    * VirtualMachineOSImageReplicateParameters class.
    *
    */
    public VirtualMachineOSImageReplicateParameters() {
        this.setTargetLocations(new LazyArrayList<String>());
    }
    
    /**
    * Initializes a new instance of the
    * VirtualMachineOSImageReplicateParameters class with required arguments.
    *
    * @param computeImageAttributes The compute image attributes. Metadata
    * which is required for this image to be useablein the Microsoft.Compute
    * Provider.The combination of values provided for Offer, Sku, and Verison
    * must be unique for a publisher.
    */
    public VirtualMachineOSImageReplicateParameters(ComputeImageAttributes computeImageAttributes) {
        this();
        if (computeImageAttributes == null) {
            throw new NullPointerException("computeImageAttributes");
        }
        this.setComputeImageAttributes(computeImageAttributes);
    }
}
