/**
 * OrderResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.cms.model;

public class OrderResponse implements java.io.Serializable {
    private String orderId;

    private String finishDate;

    private String orderResult;

    private String finshReason;

    public OrderResponse() {
    }

    public OrderResponse(
            String orderId,
            String finishDate,
            String orderResult,
            String finshReason) {
        this.orderId = orderId;
        this.finishDate = finishDate;
        this.orderResult = orderResult;
        this.finshReason = finshReason;
    }


    /**
     * Gets the orderId value for this OrderResponse.
     *
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this OrderResponse.
     *
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the finishDate value for this OrderResponse.
     *
     * @return finishDate
     */
    public String getFinishDate() {
        return finishDate;
    }


    /**
     * Sets the finishDate value for this OrderResponse.
     *
     * @param finishDate
     */
    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }


    /**
     * Gets the orderResult value for this OrderResponse.
     *
     * @return orderResult
     */
    public String getOrderResult() {
        return orderResult;
    }


    /**
     * Sets the orderResult value for this OrderResponse.
     *
     * @param orderResult
     */
    public void setOrderResult(String orderResult) {
        this.orderResult = orderResult;
    }


    /**
     * Gets the finshReason value for this OrderResponse.
     *
     * @return finshReason
     */
    public String getFinshReason() {
        return finshReason;
    }


    /**
     * Sets the finshReason value for this OrderResponse.
     *
     * @param finshReason
     */
    public void setFinshReason(String finshReason) {
        this.finshReason = finshReason;
    }

}
