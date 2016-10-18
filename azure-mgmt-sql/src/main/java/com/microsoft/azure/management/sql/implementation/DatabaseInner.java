/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.implementation;

import org.joda.time.DateTime;
import java.util.UUID;
import com.microsoft.azure.management.sql.DatabaseEditions;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Represents an Azure SQL Database.
 */
@JsonFlatten
public class DatabaseInner extends Resource {
    /**
     * Gets the collation of the Azure SQL Database.
     */
    @JsonProperty(value = "properties.collation")
    private String collation;

    /**
     * Gets the creation date of the Azure SQL Database.
     */
    @JsonProperty(value = "properties.creationDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationDate;

    /**
     * Gets the current Service Level Objective Id of the Azure SQL Database.
     * This is the Id of the Service Level Objective that is currently active.
     */
    @JsonProperty(value = "properties.currentServiceObjectiveId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID currentServiceObjectiveId;

    /**
     * Gets the Id of the Azure SQL Database.
     */
    @JsonProperty(value = "properties.databaseId", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseId;

    /**
     * Gets the recovery period starte date of the Azure SQL Database. This
     * records the start date and time when recovery is available for this
     * Azure SQL Database.
     */
    @JsonProperty(value = "properties.earliestRestoreDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime earliestRestoreDate;

    /**
     * Gets the edition of the Azure SQL Database.  The DatabaseEditions
     * enumeration contains all the valid editions. Possible values include:
     * 'Web', 'Business', 'Basic', 'Standard', 'Premium', 'Free', 'Stretch',
     * 'DataWarehouse'.
     */
    @JsonProperty(value = "properties.edition")
    private DatabaseEditions edition;

    /**
     * Gets the max size of the Azure SQL Database expressed in bytes.
     */
    @JsonProperty(value = "properties.maxSizeBytes")
    private Long maxSizeBytes;

    /**
     * Gets the configured Service Level Objective Id of the Azure SQL
     * Database. This is the Service Level Objective that is being applied to
     * the Azure SQL Database.
     */
    @JsonProperty(value = "properties.requestedServiceObjectiveId")
    private UUID requestedServiceObjectiveId;

    /**
     * Gets the name of the configured Service Level Objective of the Azure
     * SQL Database. This is the Service Level Objective that is being
     * applied to the Azure SQL Database.
     */
    @JsonProperty(value = "properties.requestedServiceObjectiveName")
    private String requestedServiceObjectiveName;

    /**
     * Gets the Service Level Objective of the Azure SQL Database.
     */
    @JsonProperty(value = "properties.serviceLevelObjective", access = JsonProperty.Access.WRITE_ONLY)
    private UUID serviceLevelObjective;

    /**
     * Gets the status of the Azure SQL Database.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /**
     * Gets the name of the Azure SQL Elastic Pool the database is in.
     */
    @JsonProperty(value = "properties.elasticPoolName")
    private String elasticPoolName;

    /**
     * Gets the default secondary region for this database.
     */
    @JsonProperty(value = "properties.defaultSecondaryLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String defaultSecondaryLocation;

    /**
     * Gets the list of service tier advisors for this database. Expanded
     * property.
     */
    @JsonProperty(value = "properties.serviceTierAdvisors", access = JsonProperty.Access.WRITE_ONLY)
    private List<ServiceTierAdvisorInner> serviceTierAdvisors;

    /**
     * Gets the upgrade hint for this database.
     */
    @JsonProperty(value = "properties.upgradeHint", access = JsonProperty.Access.WRITE_ONLY)
    private UpgradeHintInner upgradeHint;

    /**
     * Gets the schemas from this database.
     */
    @JsonProperty(value = "properties.schemas", access = JsonProperty.Access.WRITE_ONLY)
    private List<SchemaInner> schemas;

    /**
     * Gets the transparent data encryption info for this database.
     */
    @JsonProperty(value = "properties.transparentDataEncryption", access = JsonProperty.Access.WRITE_ONLY)
    private List<TransparentDataEncryptionInner> transparentDataEncryption;

    /**
     * Gets the recommended indices for this database.
     */
    @JsonProperty(value = "properties.recommendedIndex", access = JsonProperty.Access.WRITE_ONLY)
    private List<RecommendedIndexInner> recommendedIndex;

    /**
     * Get the collation value.
     *
     * @return the collation value
     */
    public String collation() {
        return this.collation;
    }

    /**
     * Set the collation value.
     *
     * @param collation the collation value to set
     * @return the DatabaseInner object itself.
     */
    public DatabaseInner withCollation(String collation) {
        this.collation = collation;
        return this;
    }

    /**
     * Get the creationDate value.
     *
     * @return the creationDate value
     */
    public DateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Get the currentServiceObjectiveId value.
     *
     * @return the currentServiceObjectiveId value
     */
    public UUID currentServiceObjectiveId() {
        return this.currentServiceObjectiveId;
    }

    /**
     * Get the databaseId value.
     *
     * @return the databaseId value
     */
    public String databaseId() {
        return this.databaseId;
    }

    /**
     * Get the earliestRestoreDate value.
     *
     * @return the earliestRestoreDate value
     */
    public DateTime earliestRestoreDate() {
        return this.earliestRestoreDate;
    }

    /**
     * Get the edition value.
     *
     * @return the edition value
     */
    public DatabaseEditions edition() {
        return this.edition;
    }

    /**
     * Set the edition value.
     *
     * @param edition the edition value to set
     * @return the DatabaseInner object itself.
     */
    public DatabaseInner withEdition(DatabaseEditions edition) {
        this.edition = edition;
        return this;
    }

    /**
     * Get the maxSizeBytes value.
     *
     * @return the maxSizeBytes value
     */
    public Long maxSizeBytes() {
        return this.maxSizeBytes;
    }

    /**
     * Set the maxSizeBytes value.
     *
     * @param maxSizeBytes the maxSizeBytes value to set
     * @return the DatabaseInner object itself.
     */
    public DatabaseInner withMaxSizeBytes(Long maxSizeBytes) {
        this.maxSizeBytes = maxSizeBytes;
        return this;
    }

    /**
     * Get the requestedServiceObjectiveId value.
     *
     * @return the requestedServiceObjectiveId value
     */
    public UUID requestedServiceObjectiveId() {
        return this.requestedServiceObjectiveId;
    }

    /**
     * Set the requestedServiceObjectiveId value.
     *
     * @param requestedServiceObjectiveId the requestedServiceObjectiveId value to set
     * @return the DatabaseInner object itself.
     */
    public DatabaseInner withRequestedServiceObjectiveId(UUID requestedServiceObjectiveId) {
        this.requestedServiceObjectiveId = requestedServiceObjectiveId;
        return this;
    }

    /**
     * Get the requestedServiceObjectiveName value.
     *
     * @return the requestedServiceObjectiveName value
     */
    public String requestedServiceObjectiveName() {
        return this.requestedServiceObjectiveName;
    }

    /**
     * Set the requestedServiceObjectiveName value.
     *
     * @param requestedServiceObjectiveName the requestedServiceObjectiveName value to set
     * @return the DatabaseInner object itself.
     */
    public DatabaseInner withRequestedServiceObjectiveName(String requestedServiceObjectiveName) {
        this.requestedServiceObjectiveName = requestedServiceObjectiveName;
        return this;
    }

    /**
     * Get the serviceLevelObjective value.
     *
     * @return the serviceLevelObjective value
     */
    public UUID serviceLevelObjective() {
        return this.serviceLevelObjective;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the elasticPoolName value.
     *
     * @return the elasticPoolName value
     */
    public String elasticPoolName() {
        return this.elasticPoolName;
    }

    /**
     * Set the elasticPoolName value.
     *
     * @param elasticPoolName the elasticPoolName value to set
     * @return the DatabaseInner object itself.
     */
    public DatabaseInner withElasticPoolName(String elasticPoolName) {
        this.elasticPoolName = elasticPoolName;
        return this;
    }

    /**
     * Get the defaultSecondaryLocation value.
     *
     * @return the defaultSecondaryLocation value
     */
    public String defaultSecondaryLocation() {
        return this.defaultSecondaryLocation;
    }

    /**
     * Get the serviceTierAdvisors value.
     *
     * @return the serviceTierAdvisors value
     */
    public List<ServiceTierAdvisorInner> serviceTierAdvisors() {
        return this.serviceTierAdvisors;
    }

    /**
     * Get the upgradeHint value.
     *
     * @return the upgradeHint value
     */
    public UpgradeHintInner upgradeHint() {
        return this.upgradeHint;
    }

    /**
     * Get the schemas value.
     *
     * @return the schemas value
     */
    public List<SchemaInner> schemas() {
        return this.schemas;
    }

    /**
     * Get the transparentDataEncryption value.
     *
     * @return the transparentDataEncryption value
     */
    public List<TransparentDataEncryptionInner> transparentDataEncryption() {
        return this.transparentDataEncryption;
    }

    /**
     * Get the recommendedIndex value.
     *
     * @return the recommendedIndex value
     */
    public List<RecommendedIndexInner> recommendedIndex() {
        return this.recommendedIndex;
    }

}