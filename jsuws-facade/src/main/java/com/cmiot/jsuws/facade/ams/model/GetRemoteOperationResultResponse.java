/**
 * GetRemoteOperationResultResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.ams.model;

public class GetRemoteOperationResultResponse implements java.io.Serializable {
    private String requestId;

    private String loid;

    private String startTime;

    private String endTime;

    private String state;

    public GetRemoteOperationResultResponse() {
    }

    public GetRemoteOperationResultResponse(
            String requestId,
            String loid,
            String startTime,
            String endTime,
            String state) {
        this.requestId = requestId;
        this.loid = loid;
        this.startTime = startTime;
        this.endTime = endTime;
        this.state = state;
    }


    /**
     * Gets the requestId value for this GetRemoteOperationResultResponse.
     *
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this GetRemoteOperationResultResponse.
     *
     * @param requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the loid value for this GetRemoteOperationResultResponse.
     *
     * @return loid
     */
    public String getLoid() {
        return loid;
    }


    /**
     * Sets the loid value for this GetRemoteOperationResultResponse.
     *
     * @param loid
     */
    public void setLoid(String loid) {
        this.loid = loid;
    }


    /**
     * Gets the startTime value for this GetRemoteOperationResultResponse.
     *
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this GetRemoteOperationResultResponse.
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this GetRemoteOperationResultResponse.
     *
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this GetRemoteOperationResultResponse.
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the state value for this GetRemoteOperationResultResponse.
     *
     * @return state
     */
    public String getState() {
        return state;
    }


    /**
     * Sets the state value for this GetRemoteOperationResultResponse.
     *
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetRemoteOperationResultResponse{");
        sb.append("requestId='").append(requestId).append('\'');
        sb.append(", loid='").append(loid).append('\'');
        sb.append(", startTime='").append(startTime).append('\'');
        sb.append(", endTime='").append(endTime).append('\'');
        sb.append(", state='").append(state).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
