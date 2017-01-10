/**
 * QueryDeviceByLoidRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.ams.model;

public class QueryDeviceByLoidRequest implements java.io.Serializable {
    private String requestId;

    private String loid;

    public QueryDeviceByLoidRequest() {
    }

    public QueryDeviceByLoidRequest(
            String requestId,
            String loid) {
        this.requestId = requestId;
        this.loid = loid;
    }


    /**
     * Gets the requestId value for this QueryDeviceByLoidRequest.
     *
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this QueryDeviceByLoidRequest.
     *
     * @param requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the loid value for this QueryDeviceByLoidRequest.
     *
     * @return loid
     */
    public String getLoid() {
        return loid;
    }


    /**
     * Sets the loid value for this QueryDeviceByLoidRequest.
     *
     * @param loid
     */
    public void setLoid(String loid) {
        this.loid = loid;
    }

}
