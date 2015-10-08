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

package com.microsoft.windowsazure.management.sql.models;

import com.microsoft.windowsazure.core.LazyArrayList;

import java.util.ArrayList;

/**
* Contains all the information pertaining to a service objective.
*/
public class ServiceObjective extends SqlModelCommon {
    private String description;
    
    /**
    * Optional. Gets the description of this service objective.
    * @return The Description value.
    */
    public String getDescription() {
        return this.description;
    }
    
    /**
    * Optional. Gets the description of this service objective.
    * @param descriptionValue The Description value.
    */
    public void setDescription(final String descriptionValue) {
        this.description = descriptionValue;
    }
    
    private ArrayList<ServiceObjective.DimensionSettingResponse> dimensionSettings;
    
    /**
    * Optional. Gets or sets the service objective dimension settings.
    * @return The DimensionSettings value.
    */
    public ArrayList<ServiceObjective.DimensionSettingResponse> getDimensionSettings() {
        return this.dimensionSettings;
    }
    
    /**
    * Optional. Gets or sets the service objective dimension settings.
    * @param dimensionSettingsValue The DimensionSettings value.
    */
    public void setDimensionSettings(final ArrayList<ServiceObjective.DimensionSettingResponse> dimensionSettingsValue) {
        this.dimensionSettings = dimensionSettingsValue;
    }
    
    private boolean enabled;
    
    /**
    * Optional. Gets whether or not the service objective is enabled.
    * @return The Enabled value.
    */
    public boolean isEnabled() {
        return this.enabled;
    }
    
    /**
    * Optional. Gets whether or not the service objective is enabled.
    * @param enabledValue The Enabled value.
    */
    public void setEnabled(final boolean enabledValue) {
        this.enabled = enabledValue;
    }
    
    private String id;
    
    /**
    * Optional. Gets the unique Guid that identifies this service objective.
    * @return The Id value.
    */
    public String getId() {
        return this.id;
    }
    
    /**
    * Optional. Gets the unique Guid that identifies this service objective.
    * @param idValue The Id value.
    */
    public void setId(final String idValue) {
        this.id = idValue;
    }
    
    private boolean isDefault;
    
    /**
    * Optional. Gets whether or not the service objective is the default
    * objective.
    * @return The IsDefault value.
    */
    public boolean isDefault() {
        return this.isDefault;
    }
    
    /**
    * Optional. Gets whether or not the service objective is the default
    * objective.
    * @param isDefaultValue The IsDefault value.
    */
    public void setIsDefault(final boolean isDefaultValue) {
        this.isDefault = isDefaultValue;
    }
    
    private boolean isSystem;
    
    /**
    * Optional. Gets whether or not the service objective is a system objective.
    * @return The IsSystem value.
    */
    public boolean isSystem() {
        return this.isSystem;
    }
    
    /**
    * Optional. Gets whether or not the service objective is a system objective.
    * @param isSystemValue The IsSystem value.
    */
    public void setIsSystem(final boolean isSystemValue) {
        this.isSystem = isSystemValue;
    }
    
    /**
    * Initializes a new instance of the ServiceObjective class.
    *
    */
    public ServiceObjective() {
        super();
        this.setDimensionSettings(new LazyArrayList<ServiceObjective.DimensionSettingResponse>());
    }
    
    /**
    * Dimension setting.
    */
    public static class DimensionSettingResponse extends SqlModelCommon {
        private String description;
        
        /**
        * Optional. Gets the description of the dimension setting.
        * @return The Description value.
        */
        public String getDescription() {
            return this.description;
        }
        
        /**
        * Optional. Gets the description of the dimension setting.
        * @param descriptionValue The Description value.
        */
        public void setDescription(final String descriptionValue) {
            this.description = descriptionValue;
        }
        
        private String id;
        
        /**
        * Optional. Gets the unique Guid that identifies the dimension setting.
        * @return The Id value.
        */
        public String getId() {
            return this.id;
        }
        
        /**
        * Optional. Gets the unique Guid that identifies the dimension setting.
        * @param idValue The Id value.
        */
        public void setId(final String idValue) {
            this.id = idValue;
        }
        
        private boolean isDefault;
        
        /**
        * Optional. Indicates whether the dimension setting is the default
        * setting.
        * @return The IsDefault value.
        */
        public boolean isDefault() {
            return this.isDefault;
        }
        
        /**
        * Optional. Indicates whether the dimension setting is the default
        * setting.
        * @param isDefaultValue The IsDefault value.
        */
        public void setIsDefault(final boolean isDefaultValue) {
            this.isDefault = isDefaultValue;
        }
        
        private byte ordinal;
        
        /**
        * Optional. Gets the dimension setting ordinal position.
        * @return The Ordinal value.
        */
        public byte getOrdinal() {
            return this.ordinal;
        }
        
        /**
        * Optional. Gets the dimension setting ordinal position.
        * @param ordinalValue The Ordinal value.
        */
        public void setOrdinal(final byte ordinalValue) {
            this.ordinal = ordinalValue;
        }
    }
}
