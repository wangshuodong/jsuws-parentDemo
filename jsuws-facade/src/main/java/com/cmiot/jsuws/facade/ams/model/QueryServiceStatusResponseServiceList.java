/**
 * QueryServiceStatusResponseServiceList.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.ams.model;

public class QueryServiceStatusResponseServiceList implements java.io.Serializable {
    private String serviceCode;

    private String serviceStatus;

    private String serviceDescr;

    public QueryServiceStatusResponseServiceList() {
    }

    public QueryServiceStatusResponseServiceList(
            String serviceCode,
            String serviceStatus,
            String serviceDescr) {
        this.serviceCode = serviceCode;
        this.serviceStatus = serviceStatus;
        this.serviceDescr = serviceDescr;
    }


    /**
     * Gets the serviceCode value for this QueryServiceStatusResponseServiceList.
     *
     * @return serviceCode
     */
    public String getServiceCode() {
        return serviceCode;
    }


    /**
     * Sets the serviceCode value for this QueryServiceStatusResponseServiceList.
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * Gets the serviceStatus value for this QueryServiceStatusResponseServiceList.
     *
     * @return serviceStatus
     */
    public String getServiceStatus() {
        return serviceStatus;
    }


    /**
     * Sets the serviceStatus value for this QueryServiceStatusResponseServiceList.
     *
     * @param serviceStatus
     */
    public void setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
    }


    /**
     * Gets the serviceDescr value for this QueryServiceStatusResponseServiceList.
     *
     * @return serviceDescr
     */
    public String getServiceDescr() {
        return serviceDescr;
    }


    /**
     * Sets the serviceDescr value for this QueryServiceStatusResponseServiceList.
     *
     * @param serviceDescr
     */
    public void setServiceDescr(String serviceDescr) {
        this.serviceDescr = serviceDescr;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("QueryServiceStatusResponseServiceList{");
        sb.append("serviceCode='").append(serviceCode).append('\'');
        sb.append(", serviceStatus='").append(serviceStatus).append('\'');
        sb.append(", serviceDescr='").append(serviceDescr).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
