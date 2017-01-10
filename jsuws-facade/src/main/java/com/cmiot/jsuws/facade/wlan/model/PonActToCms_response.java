package com.cmiot.jsuws.facade.wlan.model;

import java.io.Serializable;

/**
 * PonActToCms_response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */


public class PonActToCms_response  implements Serializable {
    private String orderId;

    private String taskId;

    private String returnCode;

    private String description;

    public PonActToCms_response() {
    }

    public PonActToCms_response(
            String orderId,
            String taskId,
            String returnCode,
            String description) {
        this.orderId = orderId;
        this.taskId = taskId;
        this.returnCode = returnCode;
        this.description = description;
    }


    /**
     * Gets the orderId value for this PonActToCms_response.
     *
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this PonActToCms_response.
     *
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the taskId value for this PonActToCms_response.
     *
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }


    /**
     * Sets the taskId value for this PonActToCms_response.
     *
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }


    /**
     * Gets the returnCode value for this PonActToCms_response.
     *
     * @return returnCode
     */
    public String getReturnCode() {
        return returnCode;
    }


    /**
     * Sets the returnCode value for this PonActToCms_response.
     *
     * @param returnCode
     */
    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }


    /**
     * Gets the description value for this PonActToCms_response.
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PonActToCms_response.
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PonActToCms_response)) return false;
        PonActToCms_response other = (PonActToCms_response) obj;
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
                ((this.taskId==null && other.getTaskId()==null) ||
                        (this.taskId!=null &&
                                this.taskId.equals(other.getTaskId()))) &&
                ((this.returnCode==null && other.getReturnCode()==null) ||
                        (this.returnCode!=null &&
                                this.returnCode.equals(other.getReturnCode()))) &&
                ((this.description==null && other.getDescription()==null) ||
                        (this.description!=null &&
                                this.description.equals(other.getDescription())));
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
        if (getTaskId() != null) {
            _hashCode += getTaskId().hashCode();
        }
        if (getReturnCode() != null) {
            _hashCode += getReturnCode().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PonActToCms_response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://183.207.194.218:6482/NorthInterface/services/PonService", "PonActToCms_response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaskId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReturnCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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

}
