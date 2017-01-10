/**
 * QueryDeviceBySNRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.ams.model;

public class QueryDeviceBySNRequest implements java.io.Serializable {
    private String requestId;

    private String sn;

    public QueryDeviceBySNRequest() {
    }

    public QueryDeviceBySNRequest(
            String requestId,
            String sn) {
        this.requestId = requestId;
        this.sn = sn;
    }


    /**
     * Gets the requestId value for this QueryDeviceBySNRequest.
     *
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this QueryDeviceBySNRequest.
     *
     * @param requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the sn value for this QueryDeviceBySNRequest.
     *
     * @return sn
     */
    public String getSn() {
        return sn;
    }


    /**
     * Sets the sn value for this QueryDeviceBySNRequest.
     *
     * @param sn
     */
    public void setSn(String sn) {
        this.sn = sn;
    }

}
