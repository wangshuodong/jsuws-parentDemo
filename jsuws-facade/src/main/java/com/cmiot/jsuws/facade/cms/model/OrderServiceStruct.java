/**
 * OrderServiceStruct.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.cms.model;

public class OrderServiceStruct implements java.io.Serializable {
    private long orderServiceId;

    private long orderId;

    private String servName;

    private String servFlag;

    private String argsName;

    private String argsValueNew;

    private String argsValueOld;

    public OrderServiceStruct() {
    }

    public OrderServiceStruct(
            long orderServiceId,
            long orderId,
            String servName,
            String servFlag,
            String argsName,
            String argsValueNew,
            String argsValueOld) {
        this.orderServiceId = orderServiceId;
        this.orderId = orderId;
        this.servName = servName;
        this.servFlag = servFlag;
        this.argsName = argsName;
        this.argsValueNew = argsValueNew;
        this.argsValueOld = argsValueOld;
    }


    /**
     * Gets the orderServiceId value for this OrderServiceStruct.
     *
     * @return orderServiceId
     */
    public long getOrderServiceId() {
        return orderServiceId;
    }


    /**
     * Sets the orderServiceId value for this OrderServiceStruct.
     *
     * @param orderServiceId
     */
    public void setOrderServiceId(long orderServiceId) {
        this.orderServiceId = orderServiceId;
    }


    /**
     * Gets the orderId value for this OrderServiceStruct.
     *
     * @return orderId
     */
    public long getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this OrderServiceStruct.
     *
     * @param orderId
     */
    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the servName value for this OrderServiceStruct.
     *
     * @return servName
     */
    public String getServName() {
        return servName;
    }


    /**
     * Sets the servName value for this OrderServiceStruct.
     *
     * @param servName
     */
    public void setServName(String servName) {
        this.servName = servName;
    }


    /**
     * Gets the servFlag value for this OrderServiceStruct.
     *
     * @return servFlag
     */
    public String getServFlag() {
        return servFlag;
    }


    /**
     * Sets the servFlag value for this OrderServiceStruct.
     *
     * @param servFlag
     */
    public void setServFlag(String servFlag) {
        this.servFlag = servFlag;
    }


    /**
     * Gets the argsName value for this OrderServiceStruct.
     *
     * @return argsName
     */
    public String getArgsName() {
        return argsName;
    }


    /**
     * Sets the argsName value for this OrderServiceStruct.
     *
     * @param argsName
     */
    public void setArgsName(String argsName) {
        this.argsName = argsName;
    }


    /**
     * Gets the argsValueNew value for this OrderServiceStruct.
     *
     * @return argsValueNew
     */
    public String getArgsValueNew() {
        return argsValueNew;
    }


    /**
     * Sets the argsValueNew value for this OrderServiceStruct.
     *
     * @param argsValueNew
     */
    public void setArgsValueNew(String argsValueNew) {
        this.argsValueNew = argsValueNew;
    }


    /**
     * Gets the argsValueOld value for this OrderServiceStruct.
     *
     * @return argsValueOld
     */
    public String getArgsValueOld() {
        return argsValueOld;
    }


    /**
     * Sets the argsValueOld value for this OrderServiceStruct.
     *
     * @param argsValueOld
     */
    public void setArgsValueOld(String argsValueOld) {
        this.argsValueOld = argsValueOld;
    }

}
