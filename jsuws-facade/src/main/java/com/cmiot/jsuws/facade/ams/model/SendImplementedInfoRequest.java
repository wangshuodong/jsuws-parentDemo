/**
 * SendImplementedInfoRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.ams.model;

public class SendImplementedInfoRequest implements java.io.Serializable {
    private String requestId;

    private String loid;

    private String orderId;

    private String orderKind;

    private String orderType;

    private SendImplementedInfoRequestServiceCodeList[] serviceCodeList;

    private String companyName;

    private String companyID;

    private String className;

    private String classID;

    public SendImplementedInfoRequest() {
    }

    public SendImplementedInfoRequest(
            String requestId,
            String loid,
            String orderId,
            String orderKind,
            String orderType,
            SendImplementedInfoRequestServiceCodeList[] serviceCodeList,
            String companyName,
            String companyID,
            String className,
            String classID) {
        this.requestId = requestId;
        this.loid = loid;
        this.orderId = orderId;
        this.orderKind = orderKind;
        this.orderType = orderType;
        this.serviceCodeList = serviceCodeList;
        this.companyName = companyName;
        this.companyID = companyID;
        this.className = className;
        this.classID = classID;
    }


    /**
     * Gets the requestId value for this SendImplementedInfoRequest.
     *
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this SendImplementedInfoRequest.
     *
     * @param requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the loid value for this SendImplementedInfoRequest.
     *
     * @return loid
     */
    public String getLoid() {
        return loid;
    }


    /**
     * Sets the loid value for this SendImplementedInfoRequest.
     *
     * @param loid
     */
    public void setLoid(String loid) {
        this.loid = loid;
    }


    /**
     * Gets the orderId value for this SendImplementedInfoRequest.
     *
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this SendImplementedInfoRequest.
     *
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the orderKind value for this SendImplementedInfoRequest.
     *
     * @return orderKind
     */
    public String getOrderKind() {
        return orderKind;
    }


    /**
     * Sets the orderKind value for this SendImplementedInfoRequest.
     *
     * @param orderKind
     */
    public void setOrderKind(String orderKind) {
        this.orderKind = orderKind;
    }


    /**
     * Gets the orderType value for this SendImplementedInfoRequest.
     *
     * @return orderType
     */
    public String getOrderType() {
        return orderType;
    }


    /**
     * Sets the orderType value for this SendImplementedInfoRequest.
     *
     * @param orderType
     */
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }


    /**
     * Gets the serviceCodeList value for this SendImplementedInfoRequest.
     *
     * @return serviceCodeList
     */
    public SendImplementedInfoRequestServiceCodeList[] getServiceCodeList() {
        return serviceCodeList;
    }


    /**
     * Sets the serviceCodeList value for this SendImplementedInfoRequest.
     *
     * @param serviceCodeList
     */
    public void setServiceCodeList(SendImplementedInfoRequestServiceCodeList[] serviceCodeList) {
        this.serviceCodeList = serviceCodeList;
    }

    public SendImplementedInfoRequestServiceCodeList getServiceCodeList(int i) {
        return this.serviceCodeList[i];
    }

    public void setServiceCodeList(int i, SendImplementedInfoRequestServiceCodeList _value) {
        this.serviceCodeList[i] = _value;
    }


    /**
     * Gets the companyName value for this SendImplementedInfoRequest.
     *
     * @return companyName
     */
    public String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this SendImplementedInfoRequest.
     *
     * @param companyName
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the companyID value for this SendImplementedInfoRequest.
     *
     * @return companyID
     */
    public String getCompanyID() {
        return companyID;
    }


    /**
     * Sets the companyID value for this SendImplementedInfoRequest.
     *
     * @param companyID
     */
    public void setCompanyID(String companyID) {
        this.companyID = companyID;
    }


    /**
     * Gets the className value for this SendImplementedInfoRequest.
     *
     * @return className
     */
    public String getClassName() {
        return className;
    }


    /**
     * Sets the className value for this SendImplementedInfoRequest.
     *
     * @param className
     */
    public void setClassName(String className) {
        this.className = className;
    }


    /**
     * Gets the classID value for this SendImplementedInfoRequest.
     *
     * @return classID
     */
    public String getClassID() {
        return classID;
    }


    /**
     * Sets the classID value for this SendImplementedInfoRequest.
     *
     * @param classID
     */
    public void setClassID(String classID) {
        this.classID = classID;
    }

}
