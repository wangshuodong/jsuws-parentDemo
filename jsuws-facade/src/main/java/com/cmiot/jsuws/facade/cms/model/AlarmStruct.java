/**
 * AlarmStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.cms.model;

public class AlarmStruct  implements java.io.Serializable {
    private String strAlarmID;

    private String strLevel;

    private String strSource;

    private String strSourceType;

    private int iAlarmNum;

    private String strCause;

    private String strAdvice;

    private String alarmTime;

    private String content;

    private String solution;

    private String ip;

    public AlarmStruct() {
    }

    public AlarmStruct(
           String strAlarmID,
           String strLevel,
           String strSource,
           String strSourceType,
           int iAlarmNum,
           String strCause,
           String strAdvice,
           String alarmTime,
           String content,
           String solution,
           String ip) {
           this.strAlarmID = strAlarmID;
           this.strLevel = strLevel;
           this.strSource = strSource;
           this.strSourceType = strSourceType;
           this.iAlarmNum = iAlarmNum;
           this.strCause = strCause;
           this.strAdvice = strAdvice;
           this.alarmTime = alarmTime;
           this.content = content;
           this.solution = solution;
           this.ip = ip;
    }


    /**
     * Gets the strAlarmID value for this AlarmStruct.
     * 
     * @return strAlarmID
     */
    public String getStrAlarmID() {
        return strAlarmID;
    }


    /**
     * Sets the strAlarmID value for this AlarmStruct.
     * 
     * @param strAlarmID
     */
    public void setStrAlarmID(String strAlarmID) {
        this.strAlarmID = strAlarmID;
    }


    /**
     * Gets the strLevel value for this AlarmStruct.
     * 
     * @return strLevel
     */
    public String getStrLevel() {
        return strLevel;
    }


    /**
     * Sets the strLevel value for this AlarmStruct.
     * 
     * @param strLevel
     */
    public void setStrLevel(String strLevel) {
        this.strLevel = strLevel;
    }


    /**
     * Gets the strSource value for this AlarmStruct.
     * 
     * @return strSource
     */
    public String getStrSource() {
        return strSource;
    }


    /**
     * Sets the strSource value for this AlarmStruct.
     * 
     * @param strSource
     */
    public void setStrSource(String strSource) {
        this.strSource = strSource;
    }


    /**
     * Gets the strSourceType value for this AlarmStruct.
     * 
     * @return strSourceType
     */
    public String getStrSourceType() {
        return strSourceType;
    }


    /**
     * Sets the strSourceType value for this AlarmStruct.
     * 
     * @param strSourceType
     */
    public void setStrSourceType(String strSourceType) {
        this.strSourceType = strSourceType;
    }


    /**
     * Gets the iAlarmNum value for this AlarmStruct.
     * 
     * @return iAlarmNum
     */
    public int getIAlarmNum() {
        return iAlarmNum;
    }


    /**
     * Sets the iAlarmNum value for this AlarmStruct.
     * 
     * @param iAlarmNum
     */
    public void setIAlarmNum(int iAlarmNum) {
        this.iAlarmNum = iAlarmNum;
    }


    /**
     * Gets the strCause value for this AlarmStruct.
     * 
     * @return strCause
     */
    public String getStrCause() {
        return strCause;
    }


    /**
     * Sets the strCause value for this AlarmStruct.
     * 
     * @param strCause
     */
    public void setStrCause(String strCause) {
        this.strCause = strCause;
    }


    /**
     * Gets the strAdvice value for this AlarmStruct.
     * 
     * @return strAdvice
     */
    public String getStrAdvice() {
        return strAdvice;
    }


    /**
     * Sets the strAdvice value for this AlarmStruct.
     * 
     * @param strAdvice
     */
    public void setStrAdvice(String strAdvice) {
        this.strAdvice = strAdvice;
    }


    /**
     * Gets the alarmTime value for this AlarmStruct.
     * 
     * @return alarmTime
     */
    public String getAlarmTime() {
        return alarmTime;
    }


    /**
     * Sets the alarmTime value for this AlarmStruct.
     * 
     * @param alarmTime
     */
    public void setAlarmTime(String alarmTime) {
        this.alarmTime = alarmTime;
    }


    /**
     * Gets the content value for this AlarmStruct.
     * 
     * @return content
     */
    public String getContent() {
        return content;
    }


    /**
     * Sets the content value for this AlarmStruct.
     * 
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }


    /**
     * Gets the solution value for this AlarmStruct.
     * 
     * @return solution
     */
    public String getSolution() {
        return solution;
    }


    /**
     * Sets the solution value for this AlarmStruct.
     * 
     * @param solution
     */
    public void setSolution(String solution) {
        this.solution = solution;
    }


    /**
     * Gets the ip value for this AlarmStruct.
     * 
     * @return ip
     */
    public String getIp() {
        return ip;
    }


    /**
     * Sets the ip value for this AlarmStruct.
     * 
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AlarmStruct)) return false;
        AlarmStruct other = (AlarmStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strAlarmID==null && other.getStrAlarmID()==null) || 
             (this.strAlarmID!=null &&
              this.strAlarmID.equals(other.getStrAlarmID()))) &&
            ((this.strLevel==null && other.getStrLevel()==null) || 
             (this.strLevel!=null &&
              this.strLevel.equals(other.getStrLevel()))) &&
            ((this.strSource==null && other.getStrSource()==null) || 
             (this.strSource!=null &&
              this.strSource.equals(other.getStrSource()))) &&
            ((this.strSourceType==null && other.getStrSourceType()==null) || 
             (this.strSourceType!=null &&
              this.strSourceType.equals(other.getStrSourceType()))) &&
            this.iAlarmNum == other.getIAlarmNum() &&
            ((this.strCause==null && other.getStrCause()==null) || 
             (this.strCause!=null &&
              this.strCause.equals(other.getStrCause()))) &&
            ((this.strAdvice==null && other.getStrAdvice()==null) || 
             (this.strAdvice!=null &&
              this.strAdvice.equals(other.getStrAdvice()))) &&
            ((this.alarmTime==null && other.getAlarmTime()==null) || 
             (this.alarmTime!=null &&
              this.alarmTime.equals(other.getAlarmTime()))) &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            ((this.solution==null && other.getSolution()==null) || 
             (this.solution!=null &&
              this.solution.equals(other.getSolution()))) &&
            ((this.ip==null && other.getIp()==null) || 
             (this.ip!=null &&
              this.ip.equals(other.getIp())));
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
        if (getStrAlarmID() != null) {
            _hashCode += getStrAlarmID().hashCode();
        }
        if (getStrLevel() != null) {
            _hashCode += getStrLevel().hashCode();
        }
        if (getStrSource() != null) {
            _hashCode += getStrSource().hashCode();
        }
        if (getStrSourceType() != null) {
            _hashCode += getStrSourceType().hashCode();
        }
        _hashCode += getIAlarmNum();
        if (getStrCause() != null) {
            _hashCode += getStrCause().hashCode();
        }
        if (getStrAdvice() != null) {
            _hashCode += getStrAdvice().hashCode();
        }
        if (getAlarmTime() != null) {
            _hashCode += getAlarmTime().hashCode();
        }
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        if (getSolution() != null) {
            _hashCode += getSolution().hashCode();
        }
        if (getIp() != null) {
            _hashCode += getIp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlarmStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://10.40.103.46:6482/NorthInterface/services/OperationDistributeService", "AlarmStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strAlarmID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "strAlarmID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "strLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "strSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strSourceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "strSourceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IAlarmNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iAlarmNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCause");
        elemField.setXmlName(new javax.xml.namespace.QName("", "strCause"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strAdvice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "strAdvice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alarmTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alarmTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("", "content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solution");
        elemField.setXmlName(new javax.xml.namespace.QName("", "solution"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ip"));
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
        final StringBuilder sb = new StringBuilder("AlarmStruct{");
        sb.append("strAlarmID='").append(strAlarmID).append('\'');
        sb.append(", strLevel='").append(strLevel).append('\'');
        sb.append(", strSource='").append(strSource).append('\'');
        sb.append(", strSourceType='").append(strSourceType).append('\'');
        sb.append(", iAlarmNum=").append(iAlarmNum);
        sb.append(", strCause='").append(strCause).append('\'');
        sb.append(", strAdvice='").append(strAdvice).append('\'');
        sb.append(", alarmTime='").append(alarmTime).append('\'');
        sb.append(", content='").append(content).append('\'');
        sb.append(", solution='").append(solution).append('\'');
        sb.append(", ip='").append(ip).append('\'');
        sb.append(", __equalsCalc=").append(__equalsCalc);
        sb.append(", __hashCodeCalc=").append(__hashCodeCalc);
        sb.append('}');
        return sb.toString();
    }
}
