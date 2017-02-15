/**
 * QueryOrderRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.ams.model;

public class QueryOrderRequest implements java.io.Serializable {
    private String requestId;

    private String orderId;

    private String serviceCode;

    public QueryOrderRequest() {
    }

    public QueryOrderRequest(
            String requestId,
            String orderId,
            String serviceCode) {
        this.requestId = requestId;
        this.orderId = orderId;
        this.serviceCode = serviceCode;
    }


    /**
     * Gets the requestId value for this QueryOrderRequest.
     *
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this QueryOrderRequest.
     *
     * @param requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the orderId value for this QueryOrderRequest.
     *
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this QueryOrderRequest.
     *
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the serviceCode value for this QueryOrderRequest.
     *
     * @return serviceCode
     */
    public String getServiceCode() {
        return serviceCode;
    }


    /**
     * Sets the serviceCode value for this QueryOrderRequest.
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("QueryOrderRequest{");
        sb.append("requestId='").append(requestId).append('\'');
        sb.append(", orderId='").append(orderId).append('\'');
        sb.append(", serviceCode='").append(serviceCode).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
