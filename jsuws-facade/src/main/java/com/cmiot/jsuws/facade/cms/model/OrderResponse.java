/**
 * OrderResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.cms.model;

public class OrderResponse  implements java.io.Serializable {
    private String orderId;

    private String finishDate;

    private String orderResult;

    private String finshReason;

    public OrderResponse() {
    }

    public OrderResponse(
           String orderId,
           String finishDate,
           String orderResult,
           String finshReason) {
           this.orderId = orderId;
           this.finishDate = finishDate;
           this.orderResult = orderResult;
           this.finshReason = finshReason;
    }


    /**
     * Gets the orderId value for this OrderResponse.
     * 
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this OrderResponse.
     * 
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the finishDate value for this OrderResponse.
     * 
     * @return finishDate
     */
    public String getFinishDate() {
        return finishDate;
    }


    /**
     * Sets the finishDate value for this OrderResponse.
     * 
     * @param finishDate
     */
    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }


    /**
     * Gets the orderResult value for this OrderResponse.
     * 
     * @return orderResult
     */
    public String getOrderResult() {
        return orderResult;
    }


    /**
     * Sets the orderResult value for this OrderResponse.
     * 
     * @param orderResult
     */
    public void setOrderResult(String orderResult) {
        this.orderResult = orderResult;
    }


    /**
     * Gets the finshReason value for this OrderResponse.
     * 
     * @return finshReason
     */
    public String getFinshReason() {
        return finshReason;
    }


    /**
     * Sets the finshReason value for this OrderResponse.
     * 
     * @param finshReason
     */
    public void setFinshReason(String finshReason) {
        this.finshReason = finshReason;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof OrderResponse)) return false;
        OrderResponse other = (OrderResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.finishDate==null && other.getFinishDate()==null) || 
             (this.finishDate!=null &&
              this.finishDate.equals(other.getFinishDate()))) &&
            ((this.orderResult==null && other.getOrderResult()==null) || 
             (this.orderResult!=null &&
              this.orderResult.equals(other.getOrderResult()))) &&
            ((this.finshReason==null && other.getFinshReason()==null) || 
             (this.finshReason!=null &&
              this.finshReason.equals(other.getFinshReason())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getFinishDate() != null) {
            _hashCode += getFinishDate().hashCode();
        }
        if (getOrderResult() != null) {
            _hashCode += getOrderResult().hashCode();
        }
        if (getFinshReason() != null) {
            _hashCode += getFinshReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://10.40.103.46:6482/NorthInterface/services/OperationDistributeService", "OrderResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finishDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "finishDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finshReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "finshReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OrderResponse{");
        sb.append("orderId='").append(orderId).append('\'');
        sb.append(", finishDate='").append(finishDate).append('\'');
        sb.append(", orderResult='").append(orderResult).append('\'');
        sb.append(", finshReason='").append(finshReason).append('\'');
        sb.append(", __equalsCalc=").append(__equalsCalc);
        sb.append(", __hashCodeCalc=").append(__hashCodeCalc);
        sb.append('}');
        return sb.toString();
    }
}
