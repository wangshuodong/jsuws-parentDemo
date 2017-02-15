/**
 * QueryDevicePasswordResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.ams.model;

public class QueryDevicePasswordResponse implements java.io.Serializable {
    private String requestId;

    private String devicePassword;

    public QueryDevicePasswordResponse() {
    }

    public QueryDevicePasswordResponse(
            String requestId,
            String devicePassword) {
        this.requestId = requestId;
        this.devicePassword = devicePassword;
    }


    /**
     * Gets the requestId value for this QueryDevicePasswordResponse.
     *
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this QueryDevicePasswordResponse.
     *
     * @param requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the devicePassword value for this QueryDevicePasswordResponse.
     *
     * @return devicePassword
     */
    public String getDevicePassword() {
        return devicePassword;
    }


    /**
     * Sets the devicePassword value for this QueryDevicePasswordResponse.
     *
     * @param devicePassword
     */
    public void setDevicePassword(String devicePassword) {
        this.devicePassword = devicePassword;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("QueryDevicePasswordResponse{");
        sb.append("requestId='").append(requestId).append('\'');
        sb.append(", devicePassword='").append(devicePassword).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
