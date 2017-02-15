/**
 * QueryServiceStatusResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.ams.model;

import java.util.Arrays;

public class QueryServiceStatusResponse implements java.io.Serializable {
    private String requestId;

    private String loid;

    private QueryServiceStatusResponseServiceList[] serviceList;

    public QueryServiceStatusResponse() {
    }

    public QueryServiceStatusResponse(
            String requestId,
            String loid,
            QueryServiceStatusResponseServiceList[] serviceList) {
        this.requestId = requestId;
        this.loid = loid;
        this.serviceList = serviceList;
    }


    /**
     * Gets the requestId value for this QueryServiceStatusResponse.
     *
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this QueryServiceStatusResponse.
     *
     * @param requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the loid value for this QueryServiceStatusResponse.
     *
     * @return loid
     */
    public String getLoid() {
        return loid;
    }


    /**
     * Sets the loid value for this QueryServiceStatusResponse.
     *
     * @param loid
     */
    public void setLoid(String loid) {
        this.loid = loid;
    }


    /**
     * Gets the serviceList value for this QueryServiceStatusResponse.
     *
     * @return serviceList
     */
    public QueryServiceStatusResponseServiceList[] getServiceList() {
        return serviceList;
    }


    /**
     * Sets the serviceList value for this QueryServiceStatusResponse.
     *
     * @param serviceList
     */
    public void setServiceList(QueryServiceStatusResponseServiceList[] serviceList) {
        this.serviceList = serviceList;
    }

    public QueryServiceStatusResponseServiceList getServiceList(int i) {
        return this.serviceList[i];
    }

    public void setServiceList(int i, QueryServiceStatusResponseServiceList _value) {
        this.serviceList[i] = _value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("QueryServiceStatusResponse{");
        sb.append("requestId='").append(requestId).append('\'');
        sb.append(", loid='").append(loid).append('\'');
        sb.append(", serviceList=").append(Arrays.toString(serviceList));
        sb.append('}');
        return sb.toString();
    }
}
