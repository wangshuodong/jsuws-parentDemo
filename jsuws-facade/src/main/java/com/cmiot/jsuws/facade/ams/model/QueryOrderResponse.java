/**
 * QueryOrderResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.ams.model;

import java.util.Arrays;

public class QueryOrderResponse implements java.io.Serializable {
    private String requestId;

    private String orderId;

    private String serviceCode;

    private QueryOrderResponseOrderList[] orderList;

    public QueryOrderResponse() {
    }

    public QueryOrderResponse(
            String requestId,
            String orderId,
            String serviceCode,
            QueryOrderResponseOrderList[] orderList) {
        this.requestId = requestId;
        this.orderId = orderId;
        this.serviceCode = serviceCode;
        this.orderList = orderList;
    }


    /**
     * Gets the requestId value for this QueryOrderResponse.
     *
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this QueryOrderResponse.
     *
     * @param requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the orderId value for this QueryOrderResponse.
     *
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this QueryOrderResponse.
     *
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the serviceCode value for this QueryOrderResponse.
     *
     * @return serviceCode
     */
    public String getServiceCode() {
        return serviceCode;
    }


    /**
     * Sets the serviceCode value for this QueryOrderResponse.
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * Gets the orderList value for this QueryOrderResponse.
     *
     * @return orderList
     */
    public QueryOrderResponseOrderList[] getOrderList() {
        return orderList;
    }


    /**
     * Sets the orderList value for this QueryOrderResponse.
     *
     * @param orderList
     */
    public void setOrderList(QueryOrderResponseOrderList[] orderList) {
        this.orderList = orderList;
    }

    public QueryOrderResponseOrderList getOrderList(int i) {
        return this.orderList[i];
    }

    public void setOrderList(int i, QueryOrderResponseOrderList _value) {
        this.orderList[i] = _value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("QueryOrderResponse{");
        sb.append("requestId='").append(requestId).append('\'');
        sb.append(", orderId='").append(orderId).append('\'');
        sb.append(", serviceCode='").append(serviceCode).append('\'');
        sb.append(", orderList=").append(Arrays.toString(orderList));
        sb.append('}');
        return sb.toString();
    }
}
