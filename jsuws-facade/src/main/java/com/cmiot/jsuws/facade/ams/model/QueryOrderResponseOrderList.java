/**
 * QueryOrderResponseOrderList.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.ams.model;

public class QueryOrderResponseOrderList implements java.io.Serializable {
    private String orderKind;

    private String orderDate;

    private String resultCode;

    private String resultDescr;

    public QueryOrderResponseOrderList() {
    }

    public QueryOrderResponseOrderList(
            String orderKind,
            String orderDate,
            String resultCode,
            String resultDescr) {
        this.orderKind = orderKind;
        this.orderDate = orderDate;
        this.resultCode = resultCode;
        this.resultDescr = resultDescr;
    }


    /**
     * Gets the orderKind value for this QueryOrderResponseOrderList.
     *
     * @return orderKind
     */
    public String getOrderKind() {
        return orderKind;
    }


    /**
     * Sets the orderKind value for this QueryOrderResponseOrderList.
     *
     * @param orderKind
     */
    public void setOrderKind(String orderKind) {
        this.orderKind = orderKind;
    }


    /**
     * Gets the orderDate value for this QueryOrderResponseOrderList.
     *
     * @return orderDate
     */
    public String getOrderDate() {
        return orderDate;
    }


    /**
     * Sets the orderDate value for this QueryOrderResponseOrderList.
     *
     * @param orderDate
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }


    /**
     * Gets the resultCode value for this QueryOrderResponseOrderList.
     *
     * @return resultCode
     */
    public String getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this QueryOrderResponseOrderList.
     *
     * @param resultCode
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the resultDescr value for this QueryOrderResponseOrderList.
     *
     * @return resultDescr
     */
    public String getResultDescr() {
        return resultDescr;
    }


    /**
     * Sets the resultDescr value for this QueryOrderResponseOrderList.
     *
     * @param resultDescr
     */
    public void setResultDescr(String resultDescr) {
        this.resultDescr = resultDescr;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("QueryOrderResponseOrderList{");
        sb.append("orderKind='").append(orderKind).append('\'');
        sb.append(", orderDate='").append(orderDate).append('\'');
        sb.append(", resultCode='").append(resultCode).append('\'');
        sb.append(", resultDescr='").append(resultDescr).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
