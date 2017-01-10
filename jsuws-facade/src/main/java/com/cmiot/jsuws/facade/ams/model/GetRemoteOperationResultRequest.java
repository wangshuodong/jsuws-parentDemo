/**
 * GetRemoteOperationResultRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.ams.model;

public class GetRemoteOperationResultRequest implements java.io.Serializable {
    private String requestId;

    private String loid;

    private String sn;

    private String actionName;

    private String operTaskId;

    public GetRemoteOperationResultRequest() {
    }

    public GetRemoteOperationResultRequest(
            String requestId,
            String loid,
            String sn,
            String actionName,
            String operTaskId) {
        this.requestId = requestId;
        this.loid = loid;
        this.sn = sn;
        this.actionName = actionName;
        this.operTaskId = operTaskId;
    }


    /**
     * Gets the requestId value for this GetRemoteOperationResultRequest.
     *
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this GetRemoteOperationResultRequest.
     *
     * @param requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the loid value for this GetRemoteOperationResultRequest.
     *
     * @return loid
     */
    public String getLoid() {
        return loid;
    }


    /**
     * Sets the loid value for this GetRemoteOperationResultRequest.
     *
     * @param loid
     */
    public void setLoid(String loid) {
        this.loid = loid;
    }


    /**
     * Gets the sn value for this GetRemoteOperationResultRequest.
     *
     * @return sn
     */
    public String getSn() {
        return sn;
    }


    /**
     * Sets the sn value for this GetRemoteOperationResultRequest.
     *
     * @param sn
     */
    public void setSn(String sn) {
        this.sn = sn;
    }


    /**
     * Gets the actionName value for this GetRemoteOperationResultRequest.
     *
     * @return actionName
     */
    public String getActionName() {
        return actionName;
    }


    /**
     * Sets the actionName value for this GetRemoteOperationResultRequest.
     *
     * @param actionName
     */
    public void setActionName(String actionName) {
        this.actionName = actionName;
    }


    /**
     * Gets the operTaskId value for this GetRemoteOperationResultRequest.
     *
     * @return operTaskId
     */
    public String getOperTaskId() {
        return operTaskId;
    }


    /**
     * Sets the operTaskId value for this GetRemoteOperationResultRequest.
     *
     * @param operTaskId
     */
    public void setOperTaskId(String operTaskId) {
        this.operTaskId = operTaskId;
    }

}
