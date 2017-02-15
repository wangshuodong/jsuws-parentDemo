/**
 * SendImplementedInfoResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.ams.model;

public class SendImplementedInfoResponse implements java.io.Serializable {
    private String requestId;

    private String loid;

    private String resultCode;

    public SendImplementedInfoResponse() {
    }

    public SendImplementedInfoResponse(
            String requestId,
            String loid,
            String resultCode) {
        this.requestId = requestId;
        this.loid = loid;
        this.resultCode = resultCode;
    }


    /**
     * Gets the requestId value for this SendImplementedInfoResponse.
     *
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this SendImplementedInfoResponse.
     *
     * @param requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the loid value for this SendImplementedInfoResponse.
     *
     * @return loid
     */
    public String getLoid() {
        return loid;
    }


    /**
     * Sets the loid value for this SendImplementedInfoResponse.
     *
     * @param loid
     */
    public void setLoid(String loid) {
        this.loid = loid;
    }


    /**
     * Gets the resultCode value for this SendImplementedInfoResponse.
     *
     * @return resultCode
     */
    public String getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this SendImplementedInfoResponse.
     *
     * @param resultCode
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SendImplementedInfoResponse{");
        sb.append("requestId='").append(requestId).append('\'');
        sb.append(", loid='").append(loid).append('\'');
        sb.append(", resultCode='").append(resultCode).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
