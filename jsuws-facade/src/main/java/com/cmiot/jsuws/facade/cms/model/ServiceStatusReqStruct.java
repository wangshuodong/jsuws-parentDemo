/**
 * ServiceStatusReqStruct.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.cms.model;

public class ServiceStatusReqStruct implements java.io.Serializable {
    private String userId;

    private String serviceCode;

    public ServiceStatusReqStruct() {
    }

    public ServiceStatusReqStruct(
            String userId,
            String serviceCode) {
        this.userId = userId;
        this.serviceCode = serviceCode;
    }


    /**
     * Gets the userId value for this ServiceStatusReqStruct.
     *
     * @return userId
     */
    public String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this ServiceStatusReqStruct.
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }


    /**
     * Gets the serviceCode value for this ServiceStatusReqStruct.
     *
     * @return serviceCode
     */
    public String getServiceCode() {
        return serviceCode;
    }


    /**
     * Sets the serviceCode value for this ServiceStatusReqStruct.
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

}
