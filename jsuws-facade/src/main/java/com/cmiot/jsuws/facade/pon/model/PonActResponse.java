/**
 * PonActResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.pon.model;

import java.io.Serializable;

public class PonActResponse  implements Serializable {
    private String description;

    private String orderId;

    private String returnCode;

    private String taskId;

    public PonActResponse() {
    }

    public PonActResponse(
           String description,
           String orderId,
           String returnCode,
           String taskId) {
           this.description = description;
           this.orderId = orderId;
           this.returnCode = returnCode;
           this.taskId = taskId;
    }


    /**
     * Gets the description value for this PonActResponse.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PonActResponse.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the orderId value for this PonActResponse.
     * 
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this PonActResponse.
     * 
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the returnCode value for this PonActResponse.
     * 
     * @return returnCode
     */
    public String getReturnCode() {
        return returnCode;
    }


    /**
     * Sets the returnCode value for this PonActResponse.
     * 
     * @param returnCode
     */
    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }


    /**
     * Gets the taskId value for this PonActResponse.
     * 
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }


    /**
     * Sets the taskId value for this PonActResponse.
     * 
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PonActResponse{");
        sb.append("description='").append(description).append('\'');
        sb.append(", orderId='").append(orderId).append('\'');
        sb.append(", returnCode='").append(returnCode).append('\'');
        sb.append(", taskId='").append(taskId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
