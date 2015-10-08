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

import java.util.ArrayList;

/**
* Represents the properties of a Azure SQL Recommended Elastic Pool being
* upgraded.
*/
public class UpgradeRecommendedElasticPoolProperties {
    private ArrayList<String> databaseCollection;
    
    /**
    * Optional. Gets or sets the list of database names to be put in the Azure
    * SQL Recommended Elastic Pool being upgraded.
    * @return The DatabaseCollection value.
    */
    public ArrayList<String> getDatabaseCollection() {
        return this.databaseCollection;
    }
    
    /**
    * Optional. Gets or sets the list of database names to be put in the Azure
    * SQL Recommended Elastic Pool being upgraded.
    * @param databaseCollectionValue The DatabaseCollection value.
    */
    public void setDatabaseCollection(final ArrayList<String> databaseCollectionValue) {
        this.databaseCollection = databaseCollectionValue;
    }
    
    private int databaseDtuMax;
    
    /**
    * Optional. Gets or sets the DTU cap for database for the Azure SQL
    * Recommended Elastic Pool being upgraded.
    * @return The DatabaseDtuMax value.
    */
    public int getDatabaseDtuMax() {
        return this.databaseDtuMax;
    }
    
    /**
    * Optional. Gets or sets the DTU cap for database for the Azure SQL
    * Recommended Elastic Pool being upgraded.
    * @param databaseDtuMaxValue The DatabaseDtuMax value.
    */
    public void setDatabaseDtuMax(final int databaseDtuMaxValue) {
        this.databaseDtuMax = databaseDtuMaxValue;
    }
    
    private int databaseDtuMin;
    
    /**
    * Optional. Gets or sets the DTU guarantee for database for the Azure SQL
    * Recommended Elastic Pool being upgraded.
    * @return The DatabaseDtuMin value.
    */
    public int getDatabaseDtuMin() {
        return this.databaseDtuMin;
    }
    
    /**
    * Optional. Gets or sets the DTU guarantee for database for the Azure SQL
    * Recommended Elastic Pool being upgraded.
    * @param databaseDtuMinValue The DatabaseDtuMin value.
    */
    public void setDatabaseDtuMin(final int databaseDtuMinValue) {
        this.databaseDtuMin = databaseDtuMinValue;
    }
    
    private int dtu;
    
    /**
    * Optional. Gets or sets the DTU guarantee for the Azure SQL Recommended
    * Elastic Pool being upgraded.
    * @return The Dtu value.
    */
    public int getDtu() {
        return this.dtu;
    }
    
    /**
    * Optional. Gets or sets the DTU guarantee for the Azure SQL Recommended
    * Elastic Pool being upgraded.
    * @param dtuValue The Dtu value.
    */
    public void setDtu(final int dtuValue) {
        this.dtu = dtuValue;
    }
    
    private String edition;
    
    /**
    * Optional. Gets or sets the target edition for the Azure SQL Recommended
    * Elastic Pool being upgraded.
    * @return The Edition value.
    */
    public String getEdition() {
        return this.edition;
    }
    
    /**
    * Optional. Gets or sets the target edition for the Azure SQL Recommended
    * Elastic Pool being upgraded.
    * @param editionValue The Edition value.
    */
    public void setEdition(final String editionValue) {
        this.edition = editionValue;
    }
    
    private Boolean includeAllDatabases;
    
    /**
    * Optional. Gets or sets whether all databases to be put in the Azure SQL
    * Recommended Elastic Pool being upgraded.
    * @return The IncludeAllDatabases value.
    */
    public Boolean isIncludeAllDatabases() {
        return this.includeAllDatabases;
    }
    
    /**
    * Optional. Gets or sets whether all databases to be put in the Azure SQL
    * Recommended Elastic Pool being upgraded.
    * @param includeAllDatabasesValue The IncludeAllDatabases value.
    */
    public void setIncludeAllDatabases(final Boolean includeAllDatabasesValue) {
        this.includeAllDatabases = includeAllDatabasesValue;
    }
    
    private String name;
    
    /**
    * Optional. Gets or sets the name of the Azure SQL Recommended Elastic Pool
    * being upgraded.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Optional. Gets or sets the name of the Azure SQL Recommended Elastic Pool
    * being upgraded.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private int storageMb;
    
    /**
    * Optional. Gets or sets the storage limit in MB for the Azure SQL
    * Recommended Elastic Pool being upgraded.
    * @return The StorageMb value.
    */
    public int getStorageMb() {
        return this.storageMb;
    }
    
    /**
    * Optional. Gets or sets the storage limit in MB for the Azure SQL
    * Recommended Elastic Pool being upgraded.
    * @param storageMbValue The StorageMb value.
    */
    public void setStorageMb(final int storageMbValue) {
        this.storageMb = storageMbValue;
    }
    
    /**
    * Initializes a new instance of the UpgradeRecommendedElasticPoolProperties
    * class.
    *
    */
    public UpgradeRecommendedElasticPoolProperties() {
        this.setDatabaseCollection(new LazyArrayList<String>());
    }
}
