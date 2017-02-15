/**
 * QueryServiceStatusRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.ams.model;

public class QueryServiceStatusRequest implements java.io.Serializable {
    private String requestId;

    private String loid;

    public QueryServiceStatusRequest() {
    }

    public QueryServiceStatusRequest(
            String requestId,
            String loid) {
        this.requestId = requestId;
        this.loid = loid;
    }


    /**
     * Gets the requestId value for this QueryServiceStatusRequest.
     *
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this QueryServiceStatusRequest.
     *
     * @param requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the loid value for this QueryServiceStatusRequest.
     *
     * @return loid
     */
    public String getLoid() {
        return loid;
    }


    /**
     * Sets the loid value for this QueryServiceStatusRequest.
     *
     * @param loid
     */
    public void setLoid(String loid) {
        this.loid = loid;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("QueryServiceStatusRequest{");
        sb.append("requestId='").append(requestId).append('\'');
        sb.append(", loid='").append(loid).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
