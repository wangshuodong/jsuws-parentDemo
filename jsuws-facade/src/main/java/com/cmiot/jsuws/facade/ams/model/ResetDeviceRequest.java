/**
 * ResetDeviceRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.ams.model;

public class ResetDeviceRequest implements java.io.Serializable {
    private String requestId;

    private String loid;

    private String sn;

    public ResetDeviceRequest() {
    }

    public ResetDeviceRequest(
            String requestId,
            String loid,
            String sn) {
        this.requestId = requestId;
        this.loid = loid;
        this.sn = sn;
    }


    /**
     * Gets the requestId value for this ResetDeviceRequest.
     *
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this ResetDeviceRequest.
     *
     * @param requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the loid value for this ResetDeviceRequest.
     *
     * @return loid
     */
    public String getLoid() {
        return loid;
    }


    /**
     * Sets the loid value for this ResetDeviceRequest.
     *
     * @param loid
     */
    public void setLoid(String loid) {
        this.loid = loid;
    }


    /**
     * Gets the sn value for this ResetDeviceRequest.
     *
     * @return sn
     */
    public String getSn() {
        return sn;
    }


    /**
     * Sets the sn value for this ResetDeviceRequest.
     *
     * @param sn
     */
    public void setSn(String sn) {
        this.sn = sn;
    }

}
