/**
 * QueryDevicePasswordRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.ams.model;

public class QueryDevicePasswordRequest implements java.io.Serializable {
    private String requestId;

    private String sn;

    public QueryDevicePasswordRequest() {
    }

    public QueryDevicePasswordRequest(
            String requestId,
            String sn) {
        this.requestId = requestId;
        this.sn = sn;
    }


    /**
     * Gets the requestId value for this QueryDevicePasswordRequest.
     *
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this QueryDevicePasswordRequest.
     *
     * @param requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the sn value for this QueryDevicePasswordRequest.
     *
     * @return sn
     */
    public String getSn() {
        return sn;
    }


    /**
     * Sets the sn value for this QueryDevicePasswordRequest.
     *
     * @param sn
     */
    public void setSn(String sn) {
        this.sn = sn;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("QueryDevicePasswordRequest{");
        sb.append("requestId='").append(requestId).append('\'');
        sb.append(", sn='").append(sn).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
