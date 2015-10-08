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

package com.microsoft.azure.management.websites.models;

import com.microsoft.windowsazure.core.LazyArrayList;

import java.util.ArrayList;
import java.util.Calendar;

/**
* The Get Web Site Historical Usage Metrics parameters.
*/
public class WebSiteGetHistoricalUsageMetricsParameters {
    private Calendar endTime;
    
    /**
    * Optional. The ending time of the metrics to return. If this parameter is
    * not specified, the current time is used.
    * @return The EndTime value.
    */
    public Calendar getEndTime() {
        return this.endTime;
    }
    
    /**
    * Optional. The ending time of the metrics to return. If this parameter is
    * not specified, the current time is used.
    * @param endTimeValue The EndTime value.
    */
    public void setEndTime(final Calendar endTimeValue) {
        this.endTime = endTimeValue;
    }
    
    private boolean includeInstanceBreakdown;
    
    /**
    * Optional. Flag which specifies if the metrics for each machine instance
    * should be included. For sites that run on more than one machine this
    * could be useful to identify a bad machine.
    * @return The IncludeInstanceBreakdown value.
    */
    public boolean isIncludeInstanceBreakdown() {
        return this.includeInstanceBreakdown;
    }
    
    /**
    * Optional. Flag which specifies if the metrics for each machine instance
    * should be included. For sites that run on more than one machine this
    * could be useful to identify a bad machine.
    * @param includeInstanceBreakdownValue The IncludeInstanceBreakdown value.
    */
    public void setIncludeInstanceBreakdown(final boolean includeInstanceBreakdownValue) {
        this.includeInstanceBreakdown = includeInstanceBreakdownValue;
    }
    
    private ArrayList<String> metricNames;
    
    /**
    * Optional. Specifies a comma-separated list of the names of the metrics to
    * return. If the names parameter is not specified, then all available
    * metrics are returned.
    * @return The MetricNames value.
    */
    public ArrayList<String> getMetricNames() {
        return this.metricNames;
    }
    
    /**
    * Optional. Specifies a comma-separated list of the names of the metrics to
    * return. If the names parameter is not specified, then all available
    * metrics are returned.
    * @param metricNamesValue The MetricNames value.
    */
    public void setMetricNames(final ArrayList<String> metricNamesValue) {
        this.metricNames = metricNamesValue;
    }
    
    private boolean slotView;
    
    /**
    * Optional. Flag which specifies if the metrics returned should reflect
    * slot swaps. Let's take for example following case: if production slot
    * has hostname www.contos.com and take traffic for 12 hours and later is
    * swapped with staging slot. Getting metrics with SlotView=false will
    * reflect the swap - e.g. there will be a increase on the staging slot
    * metrics after it goes to production.If SlotView=true is used it will
    * show the metrics for the www.contoso.com regardless which slot was
    * serving at the moment.
    * @return The SlotView value.
    */
    public boolean isSlotView() {
        return this.slotView;
    }
    
    /**
    * Optional. Flag which specifies if the metrics returned should reflect
    * slot swaps. Let's take for example following case: if production slot
    * has hostname www.contos.com and take traffic for 12 hours and later is
    * swapped with staging slot. Getting metrics with SlotView=false will
    * reflect the swap - e.g. there will be a increase on the staging slot
    * metrics after it goes to production.If SlotView=true is used it will
    * show the metrics for the www.contoso.com regardless which slot was
    * serving at the moment.
    * @param slotViewValue The SlotView value.
    */
    public void setSlotView(final boolean slotViewValue) {
        this.slotView = slotViewValue;
    }
    
    private Calendar startTime;
    
    /**
    * Optional. The starting time of the metrics to return. If this parameter
    * is not specified, the beginning of the current hour is used.
    * @return The StartTime value.
    */
    public Calendar getStartTime() {
        return this.startTime;
    }
    
    /**
    * Optional. The starting time of the metrics to return. If this parameter
    * is not specified, the beginning of the current hour is used.
    * @param startTimeValue The StartTime value.
    */
    public void setStartTime(final Calendar startTimeValue) {
        this.startTime = startTimeValue;
    }
    
    private String timeGrain;
    
    /**
    * Optional. The grain at which the metrics are returned. Supported values
    * are PT1M (minute), PT1H (hour), P1D (day).
    * @return The TimeGrain value.
    */
    public String getTimeGrain() {
        return this.timeGrain;
    }
    
    /**
    * Optional. The grain at which the metrics are returned. Supported values
    * are PT1M (minute), PT1H (hour), P1D (day).
    * @param timeGrainValue The TimeGrain value.
    */
    public void setTimeGrain(final String timeGrainValue) {
        this.timeGrain = timeGrainValue;
    }
    
    /**
    * Initializes a new instance of the
    * WebSiteGetHistoricalUsageMetricsParameters class.
    *
    */
    public WebSiteGetHistoricalUsageMetricsParameters() {
        this.setMetricNames(new LazyArrayList<String>());
    }
}
