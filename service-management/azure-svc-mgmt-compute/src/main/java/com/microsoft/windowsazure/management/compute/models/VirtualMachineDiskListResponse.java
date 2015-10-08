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
import com.microsoft.windowsazure.core.OperationResponse;

import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;

/**
* The List Disks operation response.
*/
public class VirtualMachineDiskListResponse extends OperationResponse implements Iterable<VirtualMachineDiskListResponse.VirtualMachineDisk> {
    private ArrayList<VirtualMachineDiskListResponse.VirtualMachineDisk> disks;
    
    /**
    * Optional. The virtual machine disks associated with your subscription.
    * @return The Disks value.
    */
    public ArrayList<VirtualMachineDiskListResponse.VirtualMachineDisk> getDisks() {
        return this.disks;
    }
    
    /**
    * Optional. The virtual machine disks associated with your subscription.
    * @param disksValue The Disks value.
    */
    public void setDisks(final ArrayList<VirtualMachineDiskListResponse.VirtualMachineDisk> disksValue) {
        this.disks = disksValue;
    }
    
    /**
    * Initializes a new instance of the VirtualMachineDiskListResponse class.
    *
    */
    public VirtualMachineDiskListResponse() {
        super();
        this.setDisks(new LazyArrayList<VirtualMachineDiskListResponse.VirtualMachineDisk>());
    }
    
    /**
    * Gets the sequence of Disks.
    *
    */
    public Iterator<VirtualMachineDiskListResponse.VirtualMachineDisk> iterator() {
        return this.getDisks().iterator();
    }
    
    /**
    * A virtual machine disk associated with your subscription.
    */
    public static class VirtualMachineDisk {
        private String affinityGroup;
        
        /**
        * Optional. The affinity group in which the disk is located. The
        * AffinityGroup value is derived from storage account that contains
        * the blob in which the media is located. If the storage account does
        * not belong to an affinity group the value is NULL.
        * @return The AffinityGroup value.
        */
        public String getAffinityGroup() {
            return this.affinityGroup;
        }
        
        /**
        * Optional. The affinity group in which the disk is located. The
        * AffinityGroup value is derived from storage account that contains
        * the blob in which the media is located. If the storage account does
        * not belong to an affinity group the value is NULL.
        * @param affinityGroupValue The AffinityGroup value.
        */
        public void setAffinityGroup(final String affinityGroupValue) {
            this.affinityGroup = affinityGroupValue;
        }
        
        private String iOType;
        
        /**
        * Optional. Gets or sets the IO type.
        * @return The IOType value.
        */
        public String getIOType() {
            return this.iOType;
        }
        
        /**
        * Optional. Gets or sets the IO type.
        * @param iOTypeValue The IOType value.
        */
        public void setIOType(final String iOTypeValue) {
            this.iOType = iOTypeValue;
        }
        
        private Boolean isCorrupted;
        
        /**
        * Optional. Specifies thether the disk is known to be corrupt.
        * @return The IsCorrupted value.
        */
        public Boolean isCorrupted() {
            return this.isCorrupted;
        }
        
        /**
        * Optional. Specifies thether the disk is known to be corrupt.
        * @param isCorruptedValue The IsCorrupted value.
        */
        public void setIsCorrupted(final Boolean isCorruptedValue) {
            this.isCorrupted = isCorruptedValue;
        }
        
        private Boolean isPremium;
        
        /**
        * Optional. Specifies whether or not the disk contains a premium
        * virtual machine image.
        * @return The IsPremium value.
        */
        public Boolean isPremium() {
            return this.isPremium;
        }
        
        /**
        * Optional. Specifies whether or not the disk contains a premium
        * virtual machine image.
        * @param isPremiumValue The IsPremium value.
        */
        public void setIsPremium(final Boolean isPremiumValue) {
            this.isPremium = isPremiumValue;
        }
        
        private String label;
        
        /**
        * Optional. The friendly name of the disk.
        * @return The Label value.
        */
        public String getLabel() {
            return this.label;
        }
        
        /**
        * Optional. The friendly name of the disk.
        * @param labelValue The Label value.
        */
        public void setLabel(final String labelValue) {
            this.label = labelValue;
        }
        
        private String location;
        
        /**
        * Optional. The geo-location in which the disk is located. The Location
        * value is derived from storage account that contains the blob in
        * which the disk is located. If the storage account belongs to an
        * affinity group the value is NULL.
        * @return The Location value.
        */
        public String getLocation() {
            return this.location;
        }
        
        /**
        * Optional. The geo-location in which the disk is located. The Location
        * value is derived from storage account that contains the blob in
        * which the disk is located. If the storage account belongs to an
        * affinity group the value is NULL.
        * @param locationValue The Location value.
        */
        public void setLocation(final String locationValue) {
            this.location = locationValue;
        }
        
        private int logicalSizeInGB;
        
        /**
        * Optional. The size, in GB, of the disk.
        * @return The LogicalSizeInGB value.
        */
        public int getLogicalSizeInGB() {
            return this.logicalSizeInGB;
        }
        
        /**
        * Optional. The size, in GB, of the disk.
        * @param logicalSizeInGBValue The LogicalSizeInGB value.
        */
        public void setLogicalSizeInGB(final int logicalSizeInGBValue) {
            this.logicalSizeInGB = logicalSizeInGBValue;
        }
        
        private URI mediaLinkUri;
        
        /**
        * Optional. The location of the blob in the blob store in which the
        * media for the disk is located. The blob location belongs to a
        * storage account in the subscription specified by the SubscriptionId
        * value in the operation call. Example:
        * http://example.blob.core.windows.net/disks/mydisk.vhd.
        * @return The MediaLinkUri value.
        */
        public URI getMediaLinkUri() {
            return this.mediaLinkUri;
        }
        
        /**
        * Optional. The location of the blob in the blob store in which the
        * media for the disk is located. The blob location belongs to a
        * storage account in the subscription specified by the SubscriptionId
        * value in the operation call. Example:
        * http://example.blob.core.windows.net/disks/mydisk.vhd.
        * @param mediaLinkUriValue The MediaLinkUri value.
        */
        public void setMediaLinkUri(final URI mediaLinkUriValue) {
            this.mediaLinkUri = mediaLinkUriValue;
        }
        
        private String name;
        
        /**
        * Optional. The name of the disk. This is the name that is used when
        * creating one or more virtual machines using the disk.
        * @return The Name value.
        */
        public String getName() {
            return this.name;
        }
        
        /**
        * Optional. The name of the disk. This is the name that is used when
        * creating one or more virtual machines using the disk.
        * @param nameValue The Name value.
        */
        public void setName(final String nameValue) {
            this.name = nameValue;
        }
        
        private String operatingSystemType;
        
        /**
        * Optional. The operating system type of the OS image. Possible Values
        * are: Linux, Windows, or NULL.
        * @return The OperatingSystemType value.
        */
        public String getOperatingSystemType() {
            return this.operatingSystemType;
        }
        
        /**
        * Optional. The operating system type of the OS image. Possible Values
        * are: Linux, Windows, or NULL.
        * @param operatingSystemTypeValue The OperatingSystemType value.
        */
        public void setOperatingSystemType(final String operatingSystemTypeValue) {
            this.operatingSystemType = operatingSystemTypeValue;
        }
        
        private String sourceImageName;
        
        /**
        * Optional. The name of the OS Image from which the disk was created.
        * This property is populated automatically when a disk is created from
        * an OS image by calling the Add Role, Create Deployment, or Provision
        * Disk operations.
        * @return The SourceImageName value.
        */
        public String getSourceImageName() {
            return this.sourceImageName;
        }
        
        /**
        * Optional. The name of the OS Image from which the disk was created.
        * This property is populated automatically when a disk is created from
        * an OS image by calling the Add Role, Create Deployment, or Provision
        * Disk operations.
        * @param sourceImageNameValue The SourceImageName value.
        */
        public void setSourceImageName(final String sourceImageNameValue) {
            this.sourceImageName = sourceImageNameValue;
        }
        
        private VirtualMachineDiskListResponse.VirtualMachineDiskUsageDetails usageDetails;
        
        /**
        * Optional. Contains properties that specify a virtual machine that
        * currently using the disk. A disk cannot be deleted as long as it is
        * attached to a virtual machine.
        * @return The UsageDetails value.
        */
        public VirtualMachineDiskListResponse.VirtualMachineDiskUsageDetails getUsageDetails() {
            return this.usageDetails;
        }
        
        /**
        * Optional. Contains properties that specify a virtual machine that
        * currently using the disk. A disk cannot be deleted as long as it is
        * attached to a virtual machine.
        * @param usageDetailsValue The UsageDetails value.
        */
        public void setUsageDetails(final VirtualMachineDiskListResponse.VirtualMachineDiskUsageDetails usageDetailsValue) {
            this.usageDetails = usageDetailsValue;
        }
    }
    
    /**
    * Contains properties that specify a virtual machine that currently using
    * the disk. A disk cannot be deleted as long as it is attached to a
    * virtual machine.
    */
    public static class VirtualMachineDiskUsageDetails {
        private String deploymentName;
        
        /**
        * Optional. The deployment in which the disk is being used.
        * @return The DeploymentName value.
        */
        public String getDeploymentName() {
            return this.deploymentName;
        }
        
        /**
        * Optional. The deployment in which the disk is being used.
        * @param deploymentNameValue The DeploymentName value.
        */
        public void setDeploymentName(final String deploymentNameValue) {
            this.deploymentName = deploymentNameValue;
        }
        
        private String hostedServiceName;
        
        /**
        * Optional. The hosted service in which the disk is being used.
        * @return The HostedServiceName value.
        */
        public String getHostedServiceName() {
            return this.hostedServiceName;
        }
        
        /**
        * Optional. The hosted service in which the disk is being used.
        * @param hostedServiceNameValue The HostedServiceName value.
        */
        public void setHostedServiceName(final String hostedServiceNameValue) {
            this.hostedServiceName = hostedServiceNameValue;
        }
        
        private String roleName;
        
        /**
        * Optional. The virtual machine that the disk is attached to.
        * @return The RoleName value.
        */
        public String getRoleName() {
            return this.roleName;
        }
        
        /**
        * Optional. The virtual machine that the disk is attached to.
        * @param roleNameValue The RoleName value.
        */
        public void setRoleName(final String roleNameValue) {
            this.roleName = roleNameValue;
        }
    }
}
