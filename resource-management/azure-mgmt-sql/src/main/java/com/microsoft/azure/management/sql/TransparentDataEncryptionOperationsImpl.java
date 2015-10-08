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

package com.microsoft.azure.management.sql;

import com.microsoft.azure.management.sql.models.TransparentDataEncryption;
import com.microsoft.azure.management.sql.models.TransparentDataEncryptionActivity;
import com.microsoft.azure.management.sql.models.TransparentDataEncryptionActivityListResponse;
import com.microsoft.azure.management.sql.models.TransparentDataEncryptionActivityProperties;
import com.microsoft.azure.management.sql.models.TransparentDataEncryptionCreateOrUpdateParameters;
import com.microsoft.azure.management.sql.models.TransparentDataEncryptionGetResponse;
import com.microsoft.azure.management.sql.models.TransparentDataEncryptionProperties;
import com.microsoft.windowsazure.core.ServiceOperations;
import com.microsoft.windowsazure.core.utils.CollectionStringBuilder;
import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.tracing.CloudTracing;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.NullNode;
import org.codehaus.jackson.node.ObjectNode;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
* Represents all the operations of Azure SQL Database Transparent Data
* Encryption.  Contains operations to: Retrieve, and Update Transparent Data
* Encryption.
*/
public class TransparentDataEncryptionOperationsImpl implements ServiceOperations<SqlManagementClientImpl>, TransparentDataEncryptionOperations {
    /**
    * Initializes a new instance of the TransparentDataEncryptionOperationsImpl
    * class.
    *
    * @param client Reference to the service client.
    */
    TransparentDataEncryptionOperationsImpl(SqlManagementClientImpl client) {
        this.client = client;
    }
    
    private SqlManagementClientImpl client;
    
    /**
    * Gets a reference to the
    * microsoft.azure.management.sql.SqlManagementClientImpl.
    * @return The Client value.
    */
    public SqlManagementClientImpl getClient() {
        return this.client;
    }
    
    /**
    * Creates or updates an Azure SQL Database Transparent Data Encryption
    * Operation.
    *
    * @param resourceGroupName Required. The name of the Resource Group to
    * which the server belongs.
    * @param serverName Required. The name of the Azure SQL Database Server on
    * which the database is hosted.
    * @param databaseName Required. The name of the Azure SQL Database for
    * which setting the Transparent Data Encryption applies.
    * @param parameters Required. The required parameters for creating or
    * updating transparent data encryption.
    * @return Represents the response to a Get for a Azure Sql Database
    * Transparent Data Encryption request.
    */
    @Override
    public Future<TransparentDataEncryptionGetResponse> createOrUpdateAsync(final String resourceGroupName, final String serverName, final String databaseName, final TransparentDataEncryptionCreateOrUpdateParameters parameters) {
        return this.getClient().getExecutorService().submit(new Callable<TransparentDataEncryptionGetResponse>() { 
            @Override
            public TransparentDataEncryptionGetResponse call() throws Exception {
                return createOrUpdate(resourceGroupName, serverName, databaseName, parameters);
            }
         });
    }
    
    /**
    * Creates or updates an Azure SQL Database Transparent Data Encryption
    * Operation.
    *
    * @param resourceGroupName Required. The name of the Resource Group to
    * which the server belongs.
    * @param serverName Required. The name of the Azure SQL Database Server on
    * which the database is hosted.
    * @param databaseName Required. The name of the Azure SQL Database for
    * which setting the Transparent Data Encryption applies.
    * @param parameters Required. The required parameters for creating or
    * updating transparent data encryption.
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @throws IOException Thrown if there was an error setting up tracing for
    * the request.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Represents the response to a Get for a Azure Sql Database
    * Transparent Data Encryption request.
    */
    @Override
    public TransparentDataEncryptionGetResponse createOrUpdate(String resourceGroupName, String serverName, String databaseName, TransparentDataEncryptionCreateOrUpdateParameters parameters) throws InterruptedException, ExecutionException, IOException, ServiceException {
        // Validate
        if (resourceGroupName == null) {
            throw new NullPointerException("resourceGroupName");
        }
        if (serverName == null) {
            throw new NullPointerException("serverName");
        }
        if (databaseName == null) {
            throw new NullPointerException("databaseName");
        }
        if (parameters == null) {
            throw new NullPointerException("parameters");
        }
        if (parameters.getProperties() == null) {
            throw new NullPointerException("parameters.Properties");
        }
        
        // Tracing
        boolean shouldTrace = CloudTracing.getIsEnabled();
        String invocationId = null;
        if (shouldTrace) {
            invocationId = Long.toString(CloudTracing.getNextInvocationId());
            HashMap<String, Object> tracingParameters = new HashMap<String, Object>();
            tracingParameters.put("resourceGroupName", resourceGroupName);
            tracingParameters.put("serverName", serverName);
            tracingParameters.put("databaseName", databaseName);
            tracingParameters.put("parameters", parameters);
            CloudTracing.enter(invocationId, this, "createOrUpdateAsync", tracingParameters);
        }
        
        // Construct URL
        String url = "";
        url = url + "/subscriptions/";
        if (this.getClient().getCredentials().getSubscriptionId() != null) {
            url = url + URLEncoder.encode(this.getClient().getCredentials().getSubscriptionId(), "UTF-8");
        }
        url = url + "/resourceGroups/";
        url = url + URLEncoder.encode(resourceGroupName, "UTF-8");
        url = url + "/providers/";
        url = url + "Microsoft.Sql";
        url = url + "/servers/";
        url = url + URLEncoder.encode(serverName, "UTF-8");
        url = url + "/databases/";
        url = url + URLEncoder.encode(databaseName, "UTF-8");
        url = url + "/transparentDataEncryption/current";
        ArrayList<String> queryParameters = new ArrayList<String>();
        queryParameters.add("api-version=" + "2014-04-01");
        if (queryParameters.size() > 0) {
            url = url + "?" + CollectionStringBuilder.join(queryParameters, "&");
        }
        String baseUrl = this.getClient().getBaseUri().toString();
        // Trim '/' character from the end of baseUrl and beginning of url.
        if (baseUrl.charAt(baseUrl.length() - 1) == '/') {
            baseUrl = baseUrl.substring(0, (baseUrl.length() - 1) + 0);
        }
        if (url.charAt(0) == '/') {
            url = url.substring(1);
        }
        url = baseUrl + "/" + url;
        url = url.replace(" ", "%20");
        
        // Create HTTP transport objects
        HttpPut httpRequest = new HttpPut(url);
        
        // Set Headers
        httpRequest.setHeader("Content-Type", "application/json; charset=utf-8");
        
        // Serialize Request
        String requestContent = null;
        JsonNode requestDoc = null;
        
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectNode transparentDataEncryptionCreateOrUpdateParametersValue = objectMapper.createObjectNode();
        requestDoc = transparentDataEncryptionCreateOrUpdateParametersValue;
        
        ObjectNode propertiesValue = objectMapper.createObjectNode();
        ((ObjectNode) transparentDataEncryptionCreateOrUpdateParametersValue).put("properties", propertiesValue);
        
        if (parameters.getProperties().getState() != null) {
            ((ObjectNode) propertiesValue).put("status", parameters.getProperties().getState());
        }
        
        StringWriter stringWriter = new StringWriter();
        objectMapper.writeValue(stringWriter, requestDoc);
        requestContent = stringWriter.toString();
        StringEntity entity = new StringEntity(requestContent);
        httpRequest.setEntity(entity);
        httpRequest.setHeader("Content-Type", "application/json; charset=utf-8");
        
        // Send Request
        HttpResponse httpResponse = null;
        try {
            if (shouldTrace) {
                CloudTracing.sendRequest(invocationId, httpRequest);
            }
            httpResponse = this.getClient().getHttpClient().execute(httpRequest);
            if (shouldTrace) {
                CloudTracing.receiveResponse(invocationId, httpResponse);
            }
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode != HttpStatus.SC_OK && statusCode != HttpStatus.SC_CREATED) {
                ServiceException ex = ServiceException.createFromJson(httpRequest, requestContent, httpResponse, httpResponse.getEntity());
                if (shouldTrace) {
                    CloudTracing.error(invocationId, ex);
                }
                throw ex;
            }
            
            // Create Result
            TransparentDataEncryptionGetResponse result = null;
            // Deserialize Response
            if (statusCode == HttpStatus.SC_OK || statusCode == HttpStatus.SC_CREATED) {
                InputStream responseContent = httpResponse.getEntity().getContent();
                result = new TransparentDataEncryptionGetResponse();
                JsonNode responseDoc = null;
                String responseDocContent = IOUtils.toString(responseContent);
                if (responseDocContent == null == false && responseDocContent.length() > 0) {
                    responseDoc = objectMapper.readTree(responseDocContent);
                }
                
                if (responseDoc != null && responseDoc instanceof NullNode == false) {
                    TransparentDataEncryption transparentDataEncryptionInstance = new TransparentDataEncryption();
                    result.setTransparentDataEncryption(transparentDataEncryptionInstance);
                    
                    JsonNode propertiesValue2 = responseDoc.get("properties");
                    if (propertiesValue2 != null && propertiesValue2 instanceof NullNode == false) {
                        TransparentDataEncryptionProperties propertiesInstance = new TransparentDataEncryptionProperties();
                        transparentDataEncryptionInstance.setProperties(propertiesInstance);
                        
                        JsonNode statusValue = propertiesValue2.get("status");
                        if (statusValue != null && statusValue instanceof NullNode == false) {
                            String statusInstance;
                            statusInstance = statusValue.getTextValue();
                            propertiesInstance.setState(statusInstance);
                        }
                    }
                    
                    JsonNode idValue = responseDoc.get("id");
                    if (idValue != null && idValue instanceof NullNode == false) {
                        String idInstance;
                        idInstance = idValue.getTextValue();
                        transparentDataEncryptionInstance.setId(idInstance);
                    }
                    
                    JsonNode nameValue = responseDoc.get("name");
                    if (nameValue != null && nameValue instanceof NullNode == false) {
                        String nameInstance;
                        nameInstance = nameValue.getTextValue();
                        transparentDataEncryptionInstance.setName(nameInstance);
                    }
                    
                    JsonNode typeValue = responseDoc.get("type");
                    if (typeValue != null && typeValue instanceof NullNode == false) {
                        String typeInstance;
                        typeInstance = typeValue.getTextValue();
                        transparentDataEncryptionInstance.setType(typeInstance);
                    }
                    
                    JsonNode locationValue = responseDoc.get("location");
                    if (locationValue != null && locationValue instanceof NullNode == false) {
                        String locationInstance;
                        locationInstance = locationValue.getTextValue();
                        transparentDataEncryptionInstance.setLocation(locationInstance);
                    }
                    
                    JsonNode tagsSequenceElement = ((JsonNode) responseDoc.get("tags"));
                    if (tagsSequenceElement != null && tagsSequenceElement instanceof NullNode == false) {
                        Iterator<Map.Entry<String, JsonNode>> itr = tagsSequenceElement.getFields();
                        while (itr.hasNext()) {
                            Map.Entry<String, JsonNode> property = itr.next();
                            String tagsKey = property.getKey();
                            String tagsValue = property.getValue().getTextValue();
                            transparentDataEncryptionInstance.getTags().put(tagsKey, tagsValue);
                        }
                    }
                }
                
            }
            result.setStatusCode(statusCode);
            if (httpResponse.getHeaders("x-ms-request-id").length > 0) {
                result.setRequestId(httpResponse.getFirstHeader("x-ms-request-id").getValue());
            }
            
            if (shouldTrace) {
                CloudTracing.exit(invocationId, result);
            }
            return result;
        } finally {
            if (httpResponse != null && httpResponse.getEntity() != null) {
                httpResponse.getEntity().getContent().close();
            }
        }
    }
    
    /**
    * Returns an Azure SQL Database Transparent Data Encryption Response.
    *
    * @param resourceGroupName Required. The name of the Resource Group to
    * which the server belongs.
    * @param serverName Required. The name of the Azure SQL Database Server on
    * which the database is hosted.
    * @param databaseName Required. The name of the Azure SQL Database for
    * which the Transparent Data Encryption applies.
    * @return Represents the response to a Get for a Azure Sql Database
    * Transparent Data Encryption request.
    */
    @Override
    public Future<TransparentDataEncryptionGetResponse> getAsync(final String resourceGroupName, final String serverName, final String databaseName) {
        return this.getClient().getExecutorService().submit(new Callable<TransparentDataEncryptionGetResponse>() { 
            @Override
            public TransparentDataEncryptionGetResponse call() throws Exception {
                return get(resourceGroupName, serverName, databaseName);
            }
         });
    }
    
    /**
    * Returns an Azure SQL Database Transparent Data Encryption Response.
    *
    * @param resourceGroupName Required. The name of the Resource Group to
    * which the server belongs.
    * @param serverName Required. The name of the Azure SQL Database Server on
    * which the database is hosted.
    * @param databaseName Required. The name of the Azure SQL Database for
    * which the Transparent Data Encryption applies.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Represents the response to a Get for a Azure Sql Database
    * Transparent Data Encryption request.
    */
    @Override
    public TransparentDataEncryptionGetResponse get(String resourceGroupName, String serverName, String databaseName) throws IOException, ServiceException {
        // Validate
        if (resourceGroupName == null) {
            throw new NullPointerException("resourceGroupName");
        }
        if (serverName == null) {
            throw new NullPointerException("serverName");
        }
        if (databaseName == null) {
            throw new NullPointerException("databaseName");
        }
        
        // Tracing
        boolean shouldTrace = CloudTracing.getIsEnabled();
        String invocationId = null;
        if (shouldTrace) {
            invocationId = Long.toString(CloudTracing.getNextInvocationId());
            HashMap<String, Object> tracingParameters = new HashMap<String, Object>();
            tracingParameters.put("resourceGroupName", resourceGroupName);
            tracingParameters.put("serverName", serverName);
            tracingParameters.put("databaseName", databaseName);
            CloudTracing.enter(invocationId, this, "getAsync", tracingParameters);
        }
        
        // Construct URL
        String url = "";
        url = url + "/subscriptions/";
        if (this.getClient().getCredentials().getSubscriptionId() != null) {
            url = url + URLEncoder.encode(this.getClient().getCredentials().getSubscriptionId(), "UTF-8");
        }
        url = url + "/resourceGroups/";
        url = url + URLEncoder.encode(resourceGroupName, "UTF-8");
        url = url + "/providers/";
        url = url + "Microsoft.Sql";
        url = url + "/servers/";
        url = url + URLEncoder.encode(serverName, "UTF-8");
        url = url + "/databases/";
        url = url + URLEncoder.encode(databaseName, "UTF-8");
        url = url + "/transparentDataEncryption/current";
        ArrayList<String> queryParameters = new ArrayList<String>();
        queryParameters.add("api-version=" + "2014-04-01");
        if (queryParameters.size() > 0) {
            url = url + "?" + CollectionStringBuilder.join(queryParameters, "&");
        }
        String baseUrl = this.getClient().getBaseUri().toString();
        // Trim '/' character from the end of baseUrl and beginning of url.
        if (baseUrl.charAt(baseUrl.length() - 1) == '/') {
            baseUrl = baseUrl.substring(0, (baseUrl.length() - 1) + 0);
        }
        if (url.charAt(0) == '/') {
            url = url.substring(1);
        }
        url = baseUrl + "/" + url;
        url = url.replace(" ", "%20");
        
        // Create HTTP transport objects
        HttpGet httpRequest = new HttpGet(url);
        
        // Set Headers
        
        // Send Request
        HttpResponse httpResponse = null;
        try {
            if (shouldTrace) {
                CloudTracing.sendRequest(invocationId, httpRequest);
            }
            httpResponse = this.getClient().getHttpClient().execute(httpRequest);
            if (shouldTrace) {
                CloudTracing.receiveResponse(invocationId, httpResponse);
            }
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode != HttpStatus.SC_OK) {
                ServiceException ex = ServiceException.createFromJson(httpRequest, null, httpResponse, httpResponse.getEntity());
                if (shouldTrace) {
                    CloudTracing.error(invocationId, ex);
                }
                throw ex;
            }
            
            // Create Result
            TransparentDataEncryptionGetResponse result = null;
            // Deserialize Response
            if (statusCode == HttpStatus.SC_OK) {
                InputStream responseContent = httpResponse.getEntity().getContent();
                result = new TransparentDataEncryptionGetResponse();
                ObjectMapper objectMapper = new ObjectMapper();
                JsonNode responseDoc = null;
                String responseDocContent = IOUtils.toString(responseContent);
                if (responseDocContent == null == false && responseDocContent.length() > 0) {
                    responseDoc = objectMapper.readTree(responseDocContent);
                }
                
                if (responseDoc != null && responseDoc instanceof NullNode == false) {
                    TransparentDataEncryption transparentDataEncryptionInstance = new TransparentDataEncryption();
                    result.setTransparentDataEncryption(transparentDataEncryptionInstance);
                    
                    JsonNode propertiesValue = responseDoc.get("properties");
                    if (propertiesValue != null && propertiesValue instanceof NullNode == false) {
                        TransparentDataEncryptionProperties propertiesInstance = new TransparentDataEncryptionProperties();
                        transparentDataEncryptionInstance.setProperties(propertiesInstance);
                        
                        JsonNode statusValue = propertiesValue.get("status");
                        if (statusValue != null && statusValue instanceof NullNode == false) {
                            String statusInstance;
                            statusInstance = statusValue.getTextValue();
                            propertiesInstance.setState(statusInstance);
                        }
                    }
                    
                    JsonNode idValue = responseDoc.get("id");
                    if (idValue != null && idValue instanceof NullNode == false) {
                        String idInstance;
                        idInstance = idValue.getTextValue();
                        transparentDataEncryptionInstance.setId(idInstance);
                    }
                    
                    JsonNode nameValue = responseDoc.get("name");
                    if (nameValue != null && nameValue instanceof NullNode == false) {
                        String nameInstance;
                        nameInstance = nameValue.getTextValue();
                        transparentDataEncryptionInstance.setName(nameInstance);
                    }
                    
                    JsonNode typeValue = responseDoc.get("type");
                    if (typeValue != null && typeValue instanceof NullNode == false) {
                        String typeInstance;
                        typeInstance = typeValue.getTextValue();
                        transparentDataEncryptionInstance.setType(typeInstance);
                    }
                    
                    JsonNode locationValue = responseDoc.get("location");
                    if (locationValue != null && locationValue instanceof NullNode == false) {
                        String locationInstance;
                        locationInstance = locationValue.getTextValue();
                        transparentDataEncryptionInstance.setLocation(locationInstance);
                    }
                    
                    JsonNode tagsSequenceElement = ((JsonNode) responseDoc.get("tags"));
                    if (tagsSequenceElement != null && tagsSequenceElement instanceof NullNode == false) {
                        Iterator<Map.Entry<String, JsonNode>> itr = tagsSequenceElement.getFields();
                        while (itr.hasNext()) {
                            Map.Entry<String, JsonNode> property = itr.next();
                            String tagsKey = property.getKey();
                            String tagsValue = property.getValue().getTextValue();
                            transparentDataEncryptionInstance.getTags().put(tagsKey, tagsValue);
                        }
                    }
                }
                
            }
            result.setStatusCode(statusCode);
            if (httpResponse.getHeaders("x-ms-request-id").length > 0) {
                result.setRequestId(httpResponse.getFirstHeader("x-ms-request-id").getValue());
            }
            
            if (shouldTrace) {
                CloudTracing.exit(invocationId, result);
            }
            return result;
        } finally {
            if (httpResponse != null && httpResponse.getEntity() != null) {
                httpResponse.getEntity().getContent().close();
            }
        }
    }
    
    /**
    * Returns an Azure SQL Database Transparent Data Encryption Activity
    * Response.
    *
    * @param resourceGroupName Required. The name of the Resource Group to
    * which the server belongs.
    * @param serverName Required. The name of the Azure SQL Database Server on
    * which the database is hosted.
    * @param databaseName Required. The name of the Azure SQL Database for
    * which the Transparent Data Encryption applies.
    * @return Represents the response to a List Azure Sql Database Transparent
    * Data Encryption Activity request.
    */
    @Override
    public Future<TransparentDataEncryptionActivityListResponse> listActivityAsync(final String resourceGroupName, final String serverName, final String databaseName) {
        return this.getClient().getExecutorService().submit(new Callable<TransparentDataEncryptionActivityListResponse>() { 
            @Override
            public TransparentDataEncryptionActivityListResponse call() throws Exception {
                return listActivity(resourceGroupName, serverName, databaseName);
            }
         });
    }
    
    /**
    * Returns an Azure SQL Database Transparent Data Encryption Activity
    * Response.
    *
    * @param resourceGroupName Required. The name of the Resource Group to
    * which the server belongs.
    * @param serverName Required. The name of the Azure SQL Database Server on
    * which the database is hosted.
    * @param databaseName Required. The name of the Azure SQL Database for
    * which the Transparent Data Encryption applies.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Represents the response to a List Azure Sql Database Transparent
    * Data Encryption Activity request.
    */
    @Override
    public TransparentDataEncryptionActivityListResponse listActivity(String resourceGroupName, String serverName, String databaseName) throws IOException, ServiceException {
        // Validate
        if (resourceGroupName == null) {
            throw new NullPointerException("resourceGroupName");
        }
        if (serverName == null) {
            throw new NullPointerException("serverName");
        }
        if (databaseName == null) {
            throw new NullPointerException("databaseName");
        }
        
        // Tracing
        boolean shouldTrace = CloudTracing.getIsEnabled();
        String invocationId = null;
        if (shouldTrace) {
            invocationId = Long.toString(CloudTracing.getNextInvocationId());
            HashMap<String, Object> tracingParameters = new HashMap<String, Object>();
            tracingParameters.put("resourceGroupName", resourceGroupName);
            tracingParameters.put("serverName", serverName);
            tracingParameters.put("databaseName", databaseName);
            CloudTracing.enter(invocationId, this, "listActivityAsync", tracingParameters);
        }
        
        // Construct URL
        String url = "";
        url = url + "/subscriptions/";
        if (this.getClient().getCredentials().getSubscriptionId() != null) {
            url = url + URLEncoder.encode(this.getClient().getCredentials().getSubscriptionId(), "UTF-8");
        }
        url = url + "/resourceGroups/";
        url = url + URLEncoder.encode(resourceGroupName, "UTF-8");
        url = url + "/providers/";
        url = url + "Microsoft.Sql";
        url = url + "/servers/";
        url = url + URLEncoder.encode(serverName, "UTF-8");
        url = url + "/databases/";
        url = url + URLEncoder.encode(databaseName, "UTF-8");
        url = url + "/transparentDataEncryption/current/operationResults";
        ArrayList<String> queryParameters = new ArrayList<String>();
        queryParameters.add("api-version=" + "2014-04-01");
        if (queryParameters.size() > 0) {
            url = url + "?" + CollectionStringBuilder.join(queryParameters, "&");
        }
        String baseUrl = this.getClient().getBaseUri().toString();
        // Trim '/' character from the end of baseUrl and beginning of url.
        if (baseUrl.charAt(baseUrl.length() - 1) == '/') {
            baseUrl = baseUrl.substring(0, (baseUrl.length() - 1) + 0);
        }
        if (url.charAt(0) == '/') {
            url = url.substring(1);
        }
        url = baseUrl + "/" + url;
        url = url.replace(" ", "%20");
        
        // Create HTTP transport objects
        HttpGet httpRequest = new HttpGet(url);
        
        // Set Headers
        
        // Send Request
        HttpResponse httpResponse = null;
        try {
            if (shouldTrace) {
                CloudTracing.sendRequest(invocationId, httpRequest);
            }
            httpResponse = this.getClient().getHttpClient().execute(httpRequest);
            if (shouldTrace) {
                CloudTracing.receiveResponse(invocationId, httpResponse);
            }
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode != HttpStatus.SC_OK) {
                ServiceException ex = ServiceException.createFromJson(httpRequest, null, httpResponse, httpResponse.getEntity());
                if (shouldTrace) {
                    CloudTracing.error(invocationId, ex);
                }
                throw ex;
            }
            
            // Create Result
            TransparentDataEncryptionActivityListResponse result = null;
            // Deserialize Response
            if (statusCode == HttpStatus.SC_OK) {
                InputStream responseContent = httpResponse.getEntity().getContent();
                result = new TransparentDataEncryptionActivityListResponse();
                ObjectMapper objectMapper = new ObjectMapper();
                JsonNode responseDoc = null;
                String responseDocContent = IOUtils.toString(responseContent);
                if (responseDocContent == null == false && responseDocContent.length() > 0) {
                    responseDoc = objectMapper.readTree(responseDocContent);
                }
                
                if (responseDoc != null && responseDoc instanceof NullNode == false) {
                    JsonNode valueArray = responseDoc.get("value");
                    if (valueArray != null && valueArray instanceof NullNode == false) {
                        for (JsonNode valueValue : ((ArrayNode) valueArray)) {
                            TransparentDataEncryptionActivity transparentDataEncryptionActivityInstance = new TransparentDataEncryptionActivity();
                            result.getTransparentDataEncryptionActivities().add(transparentDataEncryptionActivityInstance);
                            
                            JsonNode propertiesValue = valueValue.get("properties");
                            if (propertiesValue != null && propertiesValue instanceof NullNode == false) {
                                TransparentDataEncryptionActivityProperties propertiesInstance = new TransparentDataEncryptionActivityProperties();
                                transparentDataEncryptionActivityInstance.setProperties(propertiesInstance);
                                
                                JsonNode statusValue = propertiesValue.get("status");
                                if (statusValue != null && statusValue instanceof NullNode == false) {
                                    String statusInstance;
                                    statusInstance = statusValue.getTextValue();
                                    propertiesInstance.setStatus(statusInstance);
                                }
                                
                                JsonNode percentCompleteValue = propertiesValue.get("percentComplete");
                                if (percentCompleteValue != null && percentCompleteValue instanceof NullNode == false) {
                                    float percentCompleteInstance;
                                    percentCompleteInstance = percentCompleteValue.getNumberValue().floatValue();
                                    propertiesInstance.setPercentComplete(percentCompleteInstance);
                                }
                            }
                            
                            JsonNode idValue = valueValue.get("id");
                            if (idValue != null && idValue instanceof NullNode == false) {
                                String idInstance;
                                idInstance = idValue.getTextValue();
                                transparentDataEncryptionActivityInstance.setId(idInstance);
                            }
                            
                            JsonNode nameValue = valueValue.get("name");
                            if (nameValue != null && nameValue instanceof NullNode == false) {
                                String nameInstance;
                                nameInstance = nameValue.getTextValue();
                                transparentDataEncryptionActivityInstance.setName(nameInstance);
                            }
                            
                            JsonNode typeValue = valueValue.get("type");
                            if (typeValue != null && typeValue instanceof NullNode == false) {
                                String typeInstance;
                                typeInstance = typeValue.getTextValue();
                                transparentDataEncryptionActivityInstance.setType(typeInstance);
                            }
                            
                            JsonNode locationValue = valueValue.get("location");
                            if (locationValue != null && locationValue instanceof NullNode == false) {
                                String locationInstance;
                                locationInstance = locationValue.getTextValue();
                                transparentDataEncryptionActivityInstance.setLocation(locationInstance);
                            }
                            
                            JsonNode tagsSequenceElement = ((JsonNode) valueValue.get("tags"));
                            if (tagsSequenceElement != null && tagsSequenceElement instanceof NullNode == false) {
                                Iterator<Map.Entry<String, JsonNode>> itr = tagsSequenceElement.getFields();
                                while (itr.hasNext()) {
                                    Map.Entry<String, JsonNode> property = itr.next();
                                    String tagsKey = property.getKey();
                                    String tagsValue = property.getValue().getTextValue();
                                    transparentDataEncryptionActivityInstance.getTags().put(tagsKey, tagsValue);
                                }
                            }
                        }
                    }
                }
                
            }
            result.setStatusCode(statusCode);
            if (httpResponse.getHeaders("x-ms-request-id").length > 0) {
                result.setRequestId(httpResponse.getFirstHeader("x-ms-request-id").getValue());
            }
            
            if (shouldTrace) {
                CloudTracing.exit(invocationId, result);
            }
            return result;
        } finally {
            if (httpResponse != null && httpResponse.getEntity() != null) {
                httpResponse.getEntity().getContent().close();
            }
        }
    }
}
