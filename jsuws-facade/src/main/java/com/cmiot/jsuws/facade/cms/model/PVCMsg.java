/**
 * PVCMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.cms.model;

public class PVCMsg  implements java.io.Serializable {
    private String PVCEnable;

    private String PVCName;

    private String PVCService;

    private String PVCStatus;

    private String PVCType;

    public PVCMsg() {
    }

    public PVCMsg(
           String PVCEnable,
           String PVCName,
           String PVCService,
           String PVCStatus,
           String PVCType) {
           this.PVCEnable = PVCEnable;
           this.PVCName = PVCName;
           this.PVCService = PVCService;
           this.PVCStatus = PVCStatus;
           this.PVCType = PVCType;
    }


    /**
     * Gets the PVCEnable value for this PVCMsg.
     * 
     * @return PVCEnable
     */
    public String getPVCEnable() {
        return PVCEnable;
    }


    /**
     * Sets the PVCEnable value for this PVCMsg.
     * 
     * @param PVCEnable
     */
    public void setPVCEnable(String PVCEnable) {
        this.PVCEnable = PVCEnable;
    }


    /**
     * Gets the PVCName value for this PVCMsg.
     * 
     * @return PVCName
     */
    public String getPVCName() {
        return PVCName;
    }


    /**
     * Sets the PVCName value for this PVCMsg.
     * 
     * @param PVCName
     */
    public void setPVCName(String PVCName) {
        this.PVCName = PVCName;
    }


    /**
     * Gets the PVCService value for this PVCMsg.
     * 
     * @return PVCService
     */
    public String getPVCService() {
        return PVCService;
    }


    /**
     * Sets the PVCService value for this PVCMsg.
     * 
     * @param PVCService
     */
    public void setPVCService(String PVCService) {
        this.PVCService = PVCService;
    }


    /**
     * Gets the PVCStatus value for this PVCMsg.
     * 
     * @return PVCStatus
     */
    public String getPVCStatus() {
        return PVCStatus;
    }


    /**
     * Sets the PVCStatus value for this PVCMsg.
     * 
     * @param PVCStatus
     */
    public void setPVCStatus(String PVCStatus) {
        this.PVCStatus = PVCStatus;
    }


    /**
     * Gets the PVCType value for this PVCMsg.
     * 
     * @return PVCType
     */
    public String getPVCType() {
        return PVCType;
    }


    /**
     * Sets the PVCType value for this PVCMsg.
     * 
     * @param PVCType
     */
    public void setPVCType(String PVCType) {
        this.PVCType = PVCType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PVCMsg)) return false;
        PVCMsg other = (PVCMsg) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PVCEnable==null && other.getPVCEnable()==null) || 
             (this.PVCEnable!=null &&
              this.PVCEnable.equals(other.getPVCEnable()))) &&
            ((this.PVCName==null && other.getPVCName()==null) || 
             (this.PVCName!=null &&
              this.PVCName.equals(other.getPVCName()))) &&
            ((this.PVCService==null && other.getPVCService()==null) || 
             (this.PVCService!=null &&
              this.PVCService.equals(other.getPVCService()))) &&
            ((this.PVCStatus==null && other.getPVCStatus()==null) || 
             (this.PVCStatus!=null &&
              this.PVCStatus.equals(other.getPVCStatus()))) &&
            ((this.PVCType==null && other.getPVCType()==null) || 
             (this.PVCType!=null &&
              this.PVCType.equals(other.getPVCType())));
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
        if (getPVCEnable() != null) {
            _hashCode += getPVCEnable().hashCode();
        }
        if (getPVCName() != null) {
            _hashCode += getPVCName().hashCode();
        }
        if (getPVCService() != null) {
            _hashCode += getPVCService().hashCode();
        }
        if (getPVCStatus() != null) {
            _hashCode += getPVCStatus().hashCode();
        }
        if (getPVCType() != null) {
            _hashCode += getPVCType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PVCMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://10.40.103.46:6482/NorthInterface/services/OperationDistributeService", "PVCMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PVCEnable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PVCEnable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PVCName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PVCName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PVCService");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PVCService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PVCStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PVCStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PVCType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PVCType"));
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
        final StringBuilder sb = new StringBuilder("PVCMsg{");
        sb.append("PVCEnable='").append(PVCEnable).append('\'');
        sb.append(", PVCName='").append(PVCName).append('\'');
        sb.append(", PVCService='").append(PVCService).append('\'');
        sb.append(", PVCStatus='").append(PVCStatus).append('\'');
        sb.append(", PVCType='").append(PVCType).append('\'');
        sb.append(", __equalsCalc=").append(__equalsCalc);
        sb.append(", __hashCodeCalc=").append(__hashCodeCalc);
        sb.append('}');
        return sb.toString();
    }
}
