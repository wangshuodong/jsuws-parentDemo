/**
 * DeviceByHandResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.ams.model;

public class DeviceByHandResponse implements java.io.Serializable {
    private String requestId;

    private String sn;

    private String resultCode;

    public DeviceByHandResponse() {
    }

    public DeviceByHandResponse(
            String requestId,
            String sn,
            String resultCode) {
        this.requestId = requestId;
        this.sn = sn;
        this.resultCode = resultCode;
    }


    /**
     * Gets the requestId value for this DeviceByHandResponse.
     *
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this DeviceByHandResponse.
     *
     * @param requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the sn value for this DeviceByHandResponse.
     *
     * @return sn
     */
    public String getSn() {
        return sn;
    }


    /**
     * Sets the sn value for this DeviceByHandResponse.
     *
     * @param sn
     */
    public void setSn(String sn) {
        this.sn = sn;
    }


    /**
     * Gets the resultCode value for this DeviceByHandResponse.
     *
     * @return resultCode
     */
    public String getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this DeviceByHandResponse.
     *
     * @param resultCode
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

}
