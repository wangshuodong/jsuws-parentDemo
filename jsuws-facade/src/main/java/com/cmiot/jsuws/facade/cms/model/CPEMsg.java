/**
 * CPEMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.cms.model;

import java.util.Arrays;

public class CPEMsg  implements java.io.Serializable {
    private String CPEType;

    private PVCMsg[] PVCMsg;

    private String SEQNBR;

    private String errorCode;

    private String onlineStatus;

    private String versionStatus;

    public CPEMsg() {
    }

    public CPEMsg(
           String CPEType,
           PVCMsg[] PVCMsg,
           String SEQNBR,
           String errorCode,
           String onlineStatus,
           String versionStatus) {
           this.CPEType = CPEType;
           this.PVCMsg = PVCMsg;
           this.SEQNBR = SEQNBR;
           this.errorCode = errorCode;
           this.onlineStatus = onlineStatus;
           this.versionStatus = versionStatus;
    }


    /**
     * Gets the CPEType value for this CPEMsg.
     * 
     * @return CPEType
     */
    public String getCPEType() {
        return CPEType;
    }


    /**
     * Sets the CPEType value for this CPEMsg.
     * 
     * @param CPEType
     */
    public void setCPEType(String CPEType) {
        this.CPEType = CPEType;
    }


    /**
     * Gets the PVCMsg value for this CPEMsg.
     * 
     * @return PVCMsg
     */
    public PVCMsg[] getPVCMsg() {
        return PVCMsg;
    }


    /**
     * Sets the PVCMsg value for this CPEMsg.
     * 
     * @param PVCMsg
     */
    public void setPVCMsg(PVCMsg[] PVCMsg) {
        this.PVCMsg = PVCMsg;
    }


    /**
     * Gets the SEQNBR value for this CPEMsg.
     * 
     * @return SEQNBR
     */
    public String getSEQNBR() {
        return SEQNBR;
    }


    /**
     * Sets the SEQNBR value for this CPEMsg.
     * 
     * @param SEQNBR
     */
    public void setSEQNBR(String SEQNBR) {
        this.SEQNBR = SEQNBR;
    }


    /**
     * Gets the errorCode value for this CPEMsg.
     * 
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this CPEMsg.
     * 
     * @param errorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the onlineStatus value for this CPEMsg.
     * 
     * @return onlineStatus
     */
    public String getOnlineStatus() {
        return onlineStatus;
    }


    /**
     * Sets the onlineStatus value for this CPEMsg.
     * 
     * @param onlineStatus
     */
    public void setOnlineStatus(String onlineStatus) {
        this.onlineStatus = onlineStatus;
    }


    /**
     * Gets the versionStatus value for this CPEMsg.
     * 
     * @return versionStatus
     */
    public String getVersionStatus() {
        return versionStatus;
    }


    /**
     * Sets the versionStatus value for this CPEMsg.
     * 
     * @param versionStatus
     */
    public void setVersionStatus(String versionStatus) {
        this.versionStatus = versionStatus;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CPEMsg)) return false;
        CPEMsg other = (CPEMsg) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CPEType==null && other.getCPEType()==null) || 
             (this.CPEType!=null &&
              this.CPEType.equals(other.getCPEType()))) &&
            ((this.PVCMsg==null && other.getPVCMsg()==null) || 
             (this.PVCMsg!=null &&
              java.util.Arrays.equals(this.PVCMsg, other.getPVCMsg()))) &&
            ((this.SEQNBR==null && other.getSEQNBR()==null) || 
             (this.SEQNBR!=null &&
              this.SEQNBR.equals(other.getSEQNBR()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.onlineStatus==null && other.getOnlineStatus()==null) || 
             (this.onlineStatus!=null &&
              this.onlineStatus.equals(other.getOnlineStatus()))) &&
            ((this.versionStatus==null && other.getVersionStatus()==null) || 
             (this.versionStatus!=null &&
              this.versionStatus.equals(other.getVersionStatus())));
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
        if (getCPEType() != null) {
            _hashCode += getCPEType().hashCode();
        }
        if (getPVCMsg() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPVCMsg());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPVCMsg(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSEQNBR() != null) {
            _hashCode += getSEQNBR().hashCode();
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getOnlineStatus() != null) {
            _hashCode += getOnlineStatus().hashCode();
        }
        if (getVersionStatus() != null) {
            _hashCode += getVersionStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CPEMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://10.40.103.46:6482/NorthInterface/services/OperationDistributeService", "CPEMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CPEType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CPEType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PVCMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PVCMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://10.40.103.46:6482/NorthInterface/services/OperationDistributeService", "PVCMsg"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SEQNBR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SEQNBR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onlineStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "onlineStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "versionStatus"));
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
        final StringBuilder sb = new StringBuilder("CPEMsg{");
        sb.append("CPEType='").append(CPEType).append('\'');
        sb.append(", PVCMsg=").append(Arrays.toString(PVCMsg));
        sb.append(", SEQNBR='").append(SEQNBR).append('\'');
        sb.append(", errorCode='").append(errorCode).append('\'');
        sb.append(", onlineStatus='").append(onlineStatus).append('\'');
        sb.append(", versionStatus='").append(versionStatus).append('\'');
        sb.append(", __equalsCalc=").append(__equalsCalc);
        sb.append(", __hashCodeCalc=").append(__hashCodeCalc);
        sb.append('}');
        return sb.toString();
    }
}
