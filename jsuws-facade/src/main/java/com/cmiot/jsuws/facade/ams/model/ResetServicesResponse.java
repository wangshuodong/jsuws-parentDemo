/**
 * ResetServicesResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.ams.model;

public class ResetServicesResponse implements java.io.Serializable {
    private String requestId;

    private String loid;

    private String resultCode;

    private ResetServicesResponseServiceCodeList[] serviceCodeList;

    public ResetServicesResponse() {
    }

    public ResetServicesResponse(
            String requestId,
            String loid,
            String resultCode,
            ResetServicesResponseServiceCodeList[] serviceCodeList) {
        this.requestId = requestId;
        this.loid = loid;
        this.resultCode = resultCode;
        this.serviceCodeList = serviceCodeList;
    }


    /**
     * Gets the requestId value for this ResetServicesResponse.
     *
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this ResetServicesResponse.
     *
     * @param requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the loid value for this ResetServicesResponse.
     *
     * @return loid
     */
    public String getLoid() {
        return loid;
    }


    /**
     * Sets the loid value for this ResetServicesResponse.
     *
     * @param loid
     */
    public void setLoid(String loid) {
        this.loid = loid;
    }


    /**
     * Gets the resultCode value for this ResetServicesResponse.
     *
     * @return resultCode
     */
    public String getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this ResetServicesResponse.
     *
     * @param resultCode
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the serviceCodeList value for this ResetServicesResponse.
     *
     * @return serviceCodeList
     */
    public ResetServicesResponseServiceCodeList[] getServiceCodeList() {
        return serviceCodeList;
    }


    /**
     * Sets the serviceCodeList value for this ResetServicesResponse.
     *
     * @param serviceCodeList
     */
    public void setServiceCodeList(ResetServicesResponseServiceCodeList[] serviceCodeList) {
        this.serviceCodeList = serviceCodeList;
    }

    public ResetServicesResponseServiceCodeList getServiceCodeList(int i) {
        return this.serviceCodeList[i];
    }

    public void setServiceCodeList(int i, ResetServicesResponseServiceCodeList _value) {
        this.serviceCodeList[i] = _value;
    }

}
