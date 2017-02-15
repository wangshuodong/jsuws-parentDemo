/**
 * DeviceByHandRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.ams.model;

import java.io.Serializable;

public class DeviceByHandRequest implements Serializable {
    private String requestId;

    private String sn;

    public DeviceByHandRequest() {
    }

    public DeviceByHandRequest(
            String requestId,
            String sn) {
        this.requestId = requestId;
        this.sn = sn;
    }


    /**
     * Gets the requestId value for this DeviceByHandRequest.
     *
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this DeviceByHandRequest.
     *
     * @param requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the sn value for this DeviceByHandRequest.
     *
     * @return sn
     */
    public String getSn() {
        return sn;
    }


    /**
     * Sets the sn value for this DeviceByHandRequest.
     *
     * @param sn
     */
    public void setSn(String sn) {
        this.sn = sn;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DeviceByHandRequest{");
        sb.append("requestId='").append(requestId).append('\'');
        sb.append(", sn='").append(sn).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
