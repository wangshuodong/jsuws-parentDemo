/**
 * QueryDeviceByLoidResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.ams.model;

public class QueryDeviceByLoidResponse implements java.io.Serializable {
    private String requestId;

    private String loid;

    private String onLine;

    private String bindStatus;

    public QueryDeviceByLoidResponse() {
    }

    public QueryDeviceByLoidResponse(
            String requestId,
            String loid,
            String onLine,
            String bindStatus) {
        this.requestId = requestId;
        this.loid = loid;
        this.onLine = onLine;
        this.bindStatus = bindStatus;
    }


    /**
     * Gets the requestId value for this QueryDeviceByLoidResponse.
     *
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this QueryDeviceByLoidResponse.
     *
     * @param requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the loid value for this QueryDeviceByLoidResponse.
     *
     * @return loid
     */
    public String getLoid() {
        return loid;
    }


    /**
     * Sets the loid value for this QueryDeviceByLoidResponse.
     *
     * @param loid
     */
    public void setLoid(String loid) {
        this.loid = loid;
    }


    /**
     * Gets the onLine value for this QueryDeviceByLoidResponse.
     *
     * @return onLine
     */
    public String getOnLine() {
        return onLine;
    }


    /**
     * Sets the onLine value for this QueryDeviceByLoidResponse.
     *
     * @param onLine
     */
    public void setOnLine(String onLine) {
        this.onLine = onLine;
    }


    /**
     * Gets the bindStatus value for this QueryDeviceByLoidResponse.
     *
     * @return bindStatus
     */
    public String getBindStatus() {
        return bindStatus;
    }


    /**
     * Sets the bindStatus value for this QueryDeviceByLoidResponse.
     *
     * @param bindStatus
     */
    public void setBindStatus(String bindStatus) {
        this.bindStatus = bindStatus;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("QueryDeviceByLoidResponse{");
        sb.append("requestId='").append(requestId).append('\'');
        sb.append(", loid='").append(loid).append('\'');
        sb.append(", onLine='").append(onLine).append('\'');
        sb.append(", bindStatus='").append(bindStatus).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
