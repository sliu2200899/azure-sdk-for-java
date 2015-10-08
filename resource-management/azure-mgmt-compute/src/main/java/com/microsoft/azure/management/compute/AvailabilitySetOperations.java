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

package com.microsoft.azure.management.compute;

import com.microsoft.azure.management.compute.models.AvailabilitySet;
import com.microsoft.azure.management.compute.models.AvailabilitySetCreateOrUpdateResponse;
import com.microsoft.azure.management.compute.models.AvailabilitySetGetResponse;
import com.microsoft.azure.management.compute.models.AvailabilitySetListResponse;
import com.microsoft.azure.management.compute.models.VirtualMachineSizeListResponse;
import com.microsoft.windowsazure.core.OperationResponse;
import com.microsoft.windowsazure.exception.ServiceException;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
* Operations for managing the availability sets in compute management.
*/
public interface AvailabilitySetOperations {
    /**
    * The operation to create or update the availability set.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param parameters Required. Parameters supplied to the Create
    * Availability Set operation.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @return The Create Availability Set operation response.
    */
    AvailabilitySetCreateOrUpdateResponse createOrUpdate(String resourceGroupName, AvailabilitySet parameters) throws IOException, ServiceException, InterruptedException, ExecutionException;
    
    /**
    * The operation to create or update the availability set.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param parameters Required. Parameters supplied to the Create
    * Availability Set operation.
    * @return The Create Availability Set operation response.
    */
    Future<AvailabilitySetCreateOrUpdateResponse> createOrUpdateAsync(String resourceGroupName, AvailabilitySet parameters);
    
    /**
    * The operation to delete the availability set.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param availabilitySetName Required. The name of the availability set.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse delete(String resourceGroupName, String availabilitySetName) throws IOException, ServiceException, InterruptedException, ExecutionException;
    
    /**
    * The operation to delete the availability set.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param availabilitySetName Required. The name of the availability set.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> deleteAsync(String resourceGroupName, String availabilitySetName);
    
    /**
    * The operation to get the availability set.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param availabilitySetName Required. The name of the availability set.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return GET Availability Set operation response.
    */
    AvailabilitySetGetResponse get(String resourceGroupName, String availabilitySetName) throws IOException, ServiceException, URISyntaxException;
    
    /**
    * The operation to get the availability set.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param availabilitySetName Required. The name of the availability set.
    * @return GET Availability Set operation response.
    */
    Future<AvailabilitySetGetResponse> getAsync(String resourceGroupName, String availabilitySetName);
    
    /**
    * The operation to list the availability sets.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return The List Availability Set operation response.
    */
    AvailabilitySetListResponse list(String resourceGroupName) throws IOException, ServiceException, URISyntaxException;
    
    /**
    * The operation to list the availability sets.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @return The List Availability Set operation response.
    */
    Future<AvailabilitySetListResponse> listAsync(String resourceGroupName);
    
    /**
    * Lists virtual-machine-sizes available to be used for an availability set.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param availabilitySetName Required. The name of the availability set.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return The List Virtual Machine operation response.
    */
    VirtualMachineSizeListResponse listAvailableSizes(String resourceGroupName, String availabilitySetName) throws IOException, ServiceException;
    
    /**
    * Lists virtual-machine-sizes available to be used for an availability set.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param availabilitySetName Required. The name of the availability set.
    * @return The List Virtual Machine operation response.
    */
    Future<VirtualMachineSizeListResponse> listAvailableSizesAsync(String resourceGroupName, String availabilitySetName);
}
