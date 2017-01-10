/**
 * ResetDeviceResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.ams.model;

public class ResetDeviceResponse implements java.io.Serializable {
    private String requestId;

    private String resultCode;

    private String operTaskId;

    public ResetDeviceResponse() {
    }

    public ResetDeviceResponse(
            String requestId,
            String resultCode,
            String operTaskId) {
        this.requestId = requestId;
        this.resultCode = resultCode;
        this.operTaskId = operTaskId;
    }


    /**
     * Gets the requestId value for this ResetDeviceResponse.
     *
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this ResetDeviceResponse.
     *
     * @param requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the resultCode value for this ResetDeviceResponse.
     *
     * @return resultCode
     */
    public String getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this ResetDeviceResponse.
     *
     * @param resultCode
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the operTaskId value for this ResetDeviceResponse.
     *
     * @return operTaskId
     */
    public String getOperTaskId() {
        return operTaskId;
    }


    /**
     * Sets the operTaskId value for this ResetDeviceResponse.
     *
     * @param operTaskId
     */
    public void setOperTaskId(String operTaskId) {
        this.operTaskId = operTaskId;
    }

}
