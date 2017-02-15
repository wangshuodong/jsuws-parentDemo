/**
 * QueryDeviceBySNResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.ams.model;

public class QueryDeviceBySNResponse implements java.io.Serializable {
    private String requestId;

    private String sn;

    private String onLine;

    private String bindStatus;

    public QueryDeviceBySNResponse() {
    }

    public QueryDeviceBySNResponse(
            String requestId,
            String sn,
            String onLine,
            String bindStatus) {
        this.requestId = requestId;
        this.sn = sn;
        this.onLine = onLine;
        this.bindStatus = bindStatus;
    }


    /**
     * Gets the requestId value for this QueryDeviceBySNResponse.
     *
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this QueryDeviceBySNResponse.
     *
     * @param requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the sn value for this QueryDeviceBySNResponse.
     *
     * @return sn
     */
    public String getSn() {
        return sn;
    }


    /**
     * Sets the sn value for this QueryDeviceBySNResponse.
     *
     * @param sn
     */
    public void setSn(String sn) {
        this.sn = sn;
    }


    /**
     * Gets the onLine value for this QueryDeviceBySNResponse.
     *
     * @return onLine
     */
    public String getOnLine() {
        return onLine;
    }


    /**
     * Sets the onLine value for this QueryDeviceBySNResponse.
     *
     * @param onLine
     */
    public void setOnLine(String onLine) {
        this.onLine = onLine;
    }


    /**
     * Gets the bindStatus value for this QueryDeviceBySNResponse.
     *
     * @return bindStatus
     */
    public String getBindStatus() {
        return bindStatus;
    }


    /**
     * Sets the bindStatus value for this QueryDeviceBySNResponse.
     *
     * @param bindStatus
     */
    public void setBindStatus(String bindStatus) {
        this.bindStatus = bindStatus;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("QueryDeviceBySNResponse{");
        sb.append("requestId='").append(requestId).append('\'');
        sb.append(", sn='").append(sn).append('\'');
        sb.append(", onLine='").append(onLine).append('\'');
        sb.append(", bindStatus='").append(bindStatus).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
