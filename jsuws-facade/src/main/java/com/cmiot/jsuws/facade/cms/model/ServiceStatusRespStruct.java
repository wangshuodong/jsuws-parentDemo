/**
 * ServiceStatusRespStruct.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.cms.model;

public class ServiceStatusRespStruct implements java.io.Serializable {
    private String userId;

    private String serviceCode;

    private String serviceStatus;

    private String desp;

    public ServiceStatusRespStruct() {
    }

    public ServiceStatusRespStruct(
            String userId,
            String serviceCode,
            String serviceStatus,
            String desp) {
        this.userId = userId;
        this.serviceCode = serviceCode;
        this.serviceStatus = serviceStatus;
        this.desp = desp;
    }


    /**
     * Gets the userId value for this ServiceStatusRespStruct.
     *
     * @return userId
     */
    public String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this ServiceStatusRespStruct.
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }


    /**
     * Gets the serviceCode value for this ServiceStatusRespStruct.
     *
     * @return serviceCode
     */
    public String getServiceCode() {
        return serviceCode;
    }


    /**
     * Sets the serviceCode value for this ServiceStatusRespStruct.
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * Gets the serviceStatus value for this ServiceStatusRespStruct.
     *
     * @return serviceStatus
     */
    public String getServiceStatus() {
        return serviceStatus;
    }


    /**
     * Sets the serviceStatus value for this ServiceStatusRespStruct.
     *
     * @param serviceStatus
     */
    public void setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
    }


    /**
     * Gets the desp value for this ServiceStatusRespStruct.
     *
     * @return desp
     */
    public String getDesp() {
        return desp;
    }


    /**
     * Sets the desp value for this ServiceStatusRespStruct.
     *
     * @param desp
     */
    public void setDesp(String desp) {
        this.desp = desp;
    }

}
