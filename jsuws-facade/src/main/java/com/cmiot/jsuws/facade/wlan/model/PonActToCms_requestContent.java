package com.cmiot.jsuws.facade.wlan.model;

import java.io.Serializable;

/**
 * PonActToCms_requestContent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */


public class PonActToCms_requestContent  implements Serializable {
    private java.lang.String accountId;

    private java.lang.String siteName;

    private java.lang.String gimsUserType;

    private java.lang.String onuManufacturer;

    private java.lang.String onuMac;

    private java.lang.String loid;

    private java.lang.String AUTH;

    private java.lang.String onuType;

    private java.lang.String oltIp;

    private java.lang.String oltPonPort;

    private java.lang.String ponType;

    private java.lang.String UPBW;

    private java.lang.String DOWNBW;

    private java.lang.String subFc;

    private java.lang.String cvlan;

    private java.lang.String svlan;

    public PonActToCms_requestContent() {
    }

    public PonActToCms_requestContent(
            java.lang.String accountId,
            java.lang.String siteName,
            java.lang.String gimsUserType,
            java.lang.String onuManufacturer,
            java.lang.String onuMac,
            java.lang.String loid,
            java.lang.String AUTH,
            java.lang.String onuType,
            java.lang.String oltIp,
            java.lang.String oltPonPort,
            java.lang.String ponType,
            java.lang.String UPBW,
            java.lang.String DOWNBW,
            java.lang.String subFc,
            java.lang.String cvlan,
            java.lang.String svlan) {
        this.accountId = accountId;
        this.siteName = siteName;
        this.gimsUserType = gimsUserType;
        this.onuManufacturer = onuManufacturer;
        this.onuMac = onuMac;
        this.loid = loid;
        this.AUTH = AUTH;
        this.onuType = onuType;
        this.oltIp = oltIp;
        this.oltPonPort = oltPonPort;
        this.ponType = ponType;
        this.UPBW = UPBW;
        this.DOWNBW = DOWNBW;
        this.subFc = subFc;
        this.cvlan = cvlan;
        this.svlan = svlan;
    }


    /**
     * Gets the accountId value for this PonActToCms_requestContent.
     *
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this PonActToCms_requestContent.
     *
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the siteName value for this PonActToCms_requestContent.
     *
     * @return siteName
     */
    public java.lang.String getSiteName() {
        return siteName;
    }


    /**
     * Sets the siteName value for this PonActToCms_requestContent.
     *
     * @param siteName
     */
    public void setSiteName(java.lang.String siteName) {
        this.siteName = siteName;
    }


    /**
     * Gets the gimsUserType value for this PonActToCms_requestContent.
     *
     * @return gimsUserType
     */
    public java.lang.String getGimsUserType() {
        return gimsUserType;
    }


    /**
     * Sets the gimsUserType value for this PonActToCms_requestContent.
     *
     * @param gimsUserType
     */
    public void setGimsUserType(java.lang.String gimsUserType) {
        this.gimsUserType = gimsUserType;
    }


    /**
     * Gets the onuManufacturer value for this PonActToCms_requestContent.
     *
     * @return onuManufacturer
     */
    public java.lang.String getOnuManufacturer() {
        return onuManufacturer;
    }


    /**
     * Sets the onuManufacturer value for this PonActToCms_requestContent.
     *
     * @param onuManufacturer
     */
    public void setOnuManufacturer(java.lang.String onuManufacturer) {
        this.onuManufacturer = onuManufacturer;
    }


    /**
     * Gets the onuMac value for this PonActToCms_requestContent.
     *
     * @return onuMac
     */
    public java.lang.String getOnuMac() {
        return onuMac;
    }


    /**
     * Sets the onuMac value for this PonActToCms_requestContent.
     *
     * @param onuMac
     */
    public void setOnuMac(java.lang.String onuMac) {
        this.onuMac = onuMac;
    }


    /**
     * Gets the loid value for this PonActToCms_requestContent.
     *
     * @return loid
     */
    public java.lang.String getLoid() {
        return loid;
    }


    /**
     * Sets the loid value for this PonActToCms_requestContent.
     *
     * @param loid
     */
    public void setLoid(java.lang.String loid) {
        this.loid = loid;
    }


    /**
     * Gets the AUTH value for this PonActToCms_requestContent.
     *
     * @return AUTH
     */
    public java.lang.String getAUTH() {
        return AUTH;
    }


    /**
     * Sets the AUTH value for this PonActToCms_requestContent.
     *
     * @param AUTH
     */
    public void setAUTH(java.lang.String AUTH) {
        this.AUTH = AUTH;
    }


    /**
     * Gets the onuType value for this PonActToCms_requestContent.
     *
     * @return onuType
     */
    public java.lang.String getOnuType() {
        return onuType;
    }


    /**
     * Sets the onuType value for this PonActToCms_requestContent.
     *
     * @param onuType
     */
    public void setOnuType(java.lang.String onuType) {
        this.onuType = onuType;
    }


    /**
     * Gets the oltIp value for this PonActToCms_requestContent.
     *
     * @return oltIp
     */
    public java.lang.String getOltIp() {
        return oltIp;
    }


    /**
     * Sets the oltIp value for this PonActToCms_requestContent.
     *
     * @param oltIp
     */
    public void setOltIp(java.lang.String oltIp) {
        this.oltIp = oltIp;
    }


    /**
     * Gets the oltPonPort value for this PonActToCms_requestContent.
     *
     * @return oltPonPort
     */
    public java.lang.String getOltPonPort() {
        return oltPonPort;
    }


    /**
     * Sets the oltPonPort value for this PonActToCms_requestContent.
     *
     * @param oltPonPort
     */
    public void setOltPonPort(java.lang.String oltPonPort) {
        this.oltPonPort = oltPonPort;
    }


    /**
     * Gets the ponType value for this PonActToCms_requestContent.
     *
     * @return ponType
     */
    public java.lang.String getPonType() {
        return ponType;
    }


    /**
     * Sets the ponType value for this PonActToCms_requestContent.
     *
     * @param ponType
     */
    public void setPonType(java.lang.String ponType) {
        this.ponType = ponType;
    }


    /**
     * Gets the UPBW value for this PonActToCms_requestContent.
     *
     * @return UPBW
     */
    public java.lang.String getUPBW() {
        return UPBW;
    }


    /**
     * Sets the UPBW value for this PonActToCms_requestContent.
     *
     * @param UPBW
     */
    public void setUPBW(java.lang.String UPBW) {
        this.UPBW = UPBW;
    }


    /**
     * Gets the DOWNBW value for this PonActToCms_requestContent.
     *
     * @return DOWNBW
     */
    public java.lang.String getDOWNBW() {
        return DOWNBW;
    }


    /**
     * Sets the DOWNBW value for this PonActToCms_requestContent.
     *
     * @param DOWNBW
     */
    public void setDOWNBW(java.lang.String DOWNBW) {
        this.DOWNBW = DOWNBW;
    }


    /**
     * Gets the subFc value for this PonActToCms_requestContent.
     *
     * @return subFc
     */
    public java.lang.String getSubFc() {
        return subFc;
    }


    /**
     * Sets the subFc value for this PonActToCms_requestContent.
     *
     * @param subFc
     */
    public void setSubFc(java.lang.String subFc) {
        this.subFc = subFc;
    }


    /**
     * Gets the cvlan value for this PonActToCms_requestContent.
     *
     * @return cvlan
     */
    public java.lang.String getCvlan() {
        return cvlan;
    }


    /**
     * Sets the cvlan value for this PonActToCms_requestContent.
     *
     * @param cvlan
     */
    public void setCvlan(java.lang.String cvlan) {
        this.cvlan = cvlan;
    }


    /**
     * Gets the svlan value for this PonActToCms_requestContent.
     *
     * @return svlan
     */
    public java.lang.String getSvlan() {
        return svlan;
    }


    /**
     * Sets the svlan value for this PonActToCms_requestContent.
     *
     * @param svlan
     */
    public void setSvlan(java.lang.String svlan) {
        this.svlan = svlan;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PonActToCms_requestContent)) return false;
        PonActToCms_requestContent other = (PonActToCms_requestContent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.accountId==null && other.getAccountId()==null) ||
                        (this.accountId!=null &&
                                this.accountId.equals(other.getAccountId()))) &&
                ((this.siteName==null && other.getSiteName()==null) ||
                        (this.siteName!=null &&
                                this.siteName.equals(other.getSiteName()))) &&
                ((this.gimsUserType==null && other.getGimsUserType()==null) ||
                        (this.gimsUserType!=null &&
                                this.gimsUserType.equals(other.getGimsUserType()))) &&
                ((this.onuManufacturer==null && other.getOnuManufacturer()==null) ||
                        (this.onuManufacturer!=null &&
                                this.onuManufacturer.equals(other.getOnuManufacturer()))) &&
                ((this.onuMac==null && other.getOnuMac()==null) ||
                        (this.onuMac!=null &&
                                this.onuMac.equals(other.getOnuMac()))) &&
                ((this.loid==null && other.getLoid()==null) ||
                        (this.loid!=null &&
                                this.loid.equals(other.getLoid()))) &&
                ((this.AUTH==null && other.getAUTH()==null) ||
                        (this.AUTH!=null &&
                                this.AUTH.equals(other.getAUTH()))) &&
                ((this.onuType==null && other.getOnuType()==null) ||
                        (this.onuType!=null &&
                                this.onuType.equals(other.getOnuType()))) &&
                ((this.oltIp==null && other.getOltIp()==null) ||
                        (this.oltIp!=null &&
                                this.oltIp.equals(other.getOltIp()))) &&
                ((this.oltPonPort==null && other.getOltPonPort()==null) ||
                        (this.oltPonPort!=null &&
                                this.oltPonPort.equals(other.getOltPonPort()))) &&
                ((this.ponType==null && other.getPonType()==null) ||
                        (this.ponType!=null &&
                                this.ponType.equals(other.getPonType()))) &&
                ((this.UPBW==null && other.getUPBW()==null) ||
                        (this.UPBW!=null &&
                                this.UPBW.equals(other.getUPBW()))) &&
                ((this.DOWNBW==null && other.getDOWNBW()==null) ||
                        (this.DOWNBW!=null &&
                                this.DOWNBW.equals(other.getDOWNBW()))) &&
                ((this.subFc==null && other.getSubFc()==null) ||
                        (this.subFc!=null &&
                                this.subFc.equals(other.getSubFc()))) &&
                ((this.cvlan==null && other.getCvlan()==null) ||
                        (this.cvlan!=null &&
                                this.cvlan.equals(other.getCvlan()))) &&
                ((this.svlan==null && other.getSvlan()==null) ||
                        (this.svlan!=null &&
                                this.svlan.equals(other.getSvlan())));
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
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getSiteName() != null) {
            _hashCode += getSiteName().hashCode();
        }
        if (getGimsUserType() != null) {
            _hashCode += getGimsUserType().hashCode();
        }
        if (getOnuManufacturer() != null) {
            _hashCode += getOnuManufacturer().hashCode();
        }
        if (getOnuMac() != null) {
            _hashCode += getOnuMac().hashCode();
        }
        if (getLoid() != null) {
            _hashCode += getLoid().hashCode();
        }
        if (getAUTH() != null) {
            _hashCode += getAUTH().hashCode();
        }
        if (getOnuType() != null) {
            _hashCode += getOnuType().hashCode();
        }
        if (getOltIp() != null) {
            _hashCode += getOltIp().hashCode();
        }
        if (getOltPonPort() != null) {
            _hashCode += getOltPonPort().hashCode();
        }
        if (getPonType() != null) {
            _hashCode += getPonType().hashCode();
        }
        if (getUPBW() != null) {
            _hashCode += getUPBW().hashCode();
        }
        if (getDOWNBW() != null) {
            _hashCode += getDOWNBW().hashCode();
        }
        if (getSubFc() != null) {
            _hashCode += getSubFc().hashCode();
        }
        if (getCvlan() != null) {
            _hashCode += getCvlan().hashCode();
        }
        if (getSvlan() != null) {
            _hashCode += getSvlan().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PonActToCms_requestContent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://183.207.194.218:6482/NorthInterface/services/PonService", "PonActToCms_requestContent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SiteName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gimsUserType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GimsUserType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onuManufacturer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OnuManufacturer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onuMac");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OnuMac"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Loid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AUTH");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AUTH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onuType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OnuType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oltIp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OltIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oltPonPort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OltPonPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ponType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PonType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UPBW");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UPBW"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOWNBW");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DOWNBW"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subFc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubFc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvlan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Cvlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svlan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Svlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new  org.apache.axis.encoding.ser.BeanSerializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new  org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

}
