/**
 * ReplaceDeviceResponseServiceCodeList.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.ams.model;

public class ReplaceDeviceResponseServiceCodeList implements java.io.Serializable {
    private String serviceCode;

    public ReplaceDeviceResponseServiceCodeList() {
    }

    public ReplaceDeviceResponseServiceCodeList(
            String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * Gets the serviceCode value for this ReplaceDeviceResponseServiceCodeList.
     *
     * @return serviceCode
     */
    public String getServiceCode() {
        return serviceCode;
    }


    /**
     * Sets the serviceCode value for this ReplaceDeviceResponseServiceCodeList.
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ReplaceDeviceResponseServiceCodeList{");
        sb.append("serviceCode='").append(serviceCode).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
