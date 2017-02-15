/**
 * OrderServiceStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.cms.model;

public class OrderServiceStruct  implements java.io.Serializable {
    private long orderServiceId;

    private long orderId;

    private String servName;

    private String servFlag;

    private String argsName;

    private String argsValueNew;

    private String argsValueOld;

    public OrderServiceStruct() {
    }

    public OrderServiceStruct(
           long orderServiceId,
           long orderId,
           String servName,
           String servFlag,
           String argsName,
           String argsValueNew,
           String argsValueOld) {
           this.orderServiceId = orderServiceId;
           this.orderId = orderId;
           this.servName = servName;
           this.servFlag = servFlag;
           this.argsName = argsName;
           this.argsValueNew = argsValueNew;
           this.argsValueOld = argsValueOld;
    }


    /**
     * Gets the orderServiceId value for this OrderServiceStruct.
     * 
     * @return orderServiceId
     */
    public long getOrderServiceId() {
        return orderServiceId;
    }


    /**
     * Sets the orderServiceId value for this OrderServiceStruct.
     * 
     * @param orderServiceId
     */
    public void setOrderServiceId(long orderServiceId) {
        this.orderServiceId = orderServiceId;
    }


    /**
     * Gets the orderId value for this OrderServiceStruct.
     * 
     * @return orderId
     */
    public long getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this OrderServiceStruct.
     * 
     * @param orderId
     */
    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the servName value for this OrderServiceStruct.
     * 
     * @return servName
     */
    public String getServName() {
        return servName;
    }


    /**
     * Sets the servName value for this OrderServiceStruct.
     * 
     * @param servName
     */
    public void setServName(String servName) {
        this.servName = servName;
    }


    /**
     * Gets the servFlag value for this OrderServiceStruct.
     * 
     * @return servFlag
     */
    public String getServFlag() {
        return servFlag;
    }


    /**
     * Sets the servFlag value for this OrderServiceStruct.
     * 
     * @param servFlag
     */
    public void setServFlag(String servFlag) {
        this.servFlag = servFlag;
    }


    /**
     * Gets the argsName value for this OrderServiceStruct.
     * 
     * @return argsName
     */
    public String getArgsName() {
        return argsName;
    }


    /**
     * Sets the argsName value for this OrderServiceStruct.
     * 
     * @param argsName
     */
    public void setArgsName(String argsName) {
        this.argsName = argsName;
    }


    /**
     * Gets the argsValueNew value for this OrderServiceStruct.
     * 
     * @return argsValueNew
     */
    public String getArgsValueNew() {
        return argsValueNew;
    }


    /**
     * Sets the argsValueNew value for this OrderServiceStruct.
     * 
     * @param argsValueNew
     */
    public void setArgsValueNew(String argsValueNew) {
        this.argsValueNew = argsValueNew;
    }


    /**
     * Gets the argsValueOld value for this OrderServiceStruct.
     * 
     * @return argsValueOld
     */
    public String getArgsValueOld() {
        return argsValueOld;
    }


    /**
     * Sets the argsValueOld value for this OrderServiceStruct.
     * 
     * @param argsValueOld
     */
    public void setArgsValueOld(String argsValueOld) {
        this.argsValueOld = argsValueOld;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof OrderServiceStruct)) return false;
        OrderServiceStruct other = (OrderServiceStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.orderServiceId == other.getOrderServiceId() &&
            this.orderId == other.getOrderId() &&
            ((this.servName==null && other.getServName()==null) || 
             (this.servName!=null &&
              this.servName.equals(other.getServName()))) &&
            ((this.servFlag==null && other.getServFlag()==null) || 
             (this.servFlag!=null &&
              this.servFlag.equals(other.getServFlag()))) &&
            ((this.argsName==null && other.getArgsName()==null) || 
             (this.argsName!=null &&
              this.argsName.equals(other.getArgsName()))) &&
            ((this.argsValueNew==null && other.getArgsValueNew()==null) || 
             (this.argsValueNew!=null &&
              this.argsValueNew.equals(other.getArgsValueNew()))) &&
            ((this.argsValueOld==null && other.getArgsValueOld()==null) || 
             (this.argsValueOld!=null &&
              this.argsValueOld.equals(other.getArgsValueOld())));
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
        _hashCode += new Long(getOrderServiceId()).hashCode();
        _hashCode += new Long(getOrderId()).hashCode();
        if (getServName() != null) {
            _hashCode += getServName().hashCode();
        }
        if (getServFlag() != null) {
            _hashCode += getServFlag().hashCode();
        }
        if (getArgsName() != null) {
            _hashCode += getArgsName().hashCode();
        }
        if (getArgsValueNew() != null) {
            _hashCode += getArgsValueNew().hashCode();
        }
        if (getArgsValueOld() != null) {
            _hashCode += getArgsValueOld().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderServiceStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://order.idl.itms.zznode.com", "OrderServiceStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("argsName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "argsName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("argsValueNew");
        elemField.setXmlName(new javax.xml.namespace.QName("", "argsValueNew"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("argsValueOld");
        elemField.setXmlName(new javax.xml.namespace.QName("", "argsValueOld"));
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
        final StringBuilder sb = new StringBuilder("OrderServiceStruct{");
        sb.append("orderServiceId=").append(orderServiceId);
        sb.append(", orderId=").append(orderId);
        sb.append(", servName='").append(servName).append('\'');
        sb.append(", servFlag='").append(servFlag).append('\'');
        sb.append(", argsName='").append(argsName).append('\'');
        sb.append(", argsValueNew='").append(argsValueNew).append('\'');
        sb.append(", argsValueOld='").append(argsValueOld).append('\'');
        sb.append(", __equalsCalc=").append(__equalsCalc);
        sb.append(", __hashCodeCalc=").append(__hashCodeCalc);
        sb.append('}');
        return sb.toString();
    }
}
