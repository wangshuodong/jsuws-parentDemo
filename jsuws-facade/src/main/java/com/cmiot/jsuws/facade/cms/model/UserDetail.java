/**
 * UserDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.cms.model;

public class UserDetail  implements java.io.Serializable {
    private String user_name;

    private String user_address;

    private String ad_account;

    private String cpe_id;

    private String cpe_status;

    private String online_status;

    private String version_status;

    private String cpe_version;

    private String wifi_status;

    private String last_connect;

    private String cpe_domain;

    private String cpe_service;

    public UserDetail() {
    }

    public UserDetail(
           String user_name,
           String user_address,
           String ad_account,
           String cpe_id,
           String cpe_status,
           String online_status,
           String version_status,
           String cpe_version,
           String wifi_status,
           String last_connect,
           String cpe_domain,
           String cpe_service) {
           this.user_name = user_name;
           this.user_address = user_address;
           this.ad_account = ad_account;
           this.cpe_id = cpe_id;
           this.cpe_status = cpe_status;
           this.online_status = online_status;
           this.version_status = version_status;
           this.cpe_version = cpe_version;
           this.wifi_status = wifi_status;
           this.last_connect = last_connect;
           this.cpe_domain = cpe_domain;
           this.cpe_service = cpe_service;
    }


    /**
     * Gets the user_name value for this UserDetail.
     * 
     * @return user_name
     */
    public String getUser_name() {
        return user_name;
    }


    /**
     * Sets the user_name value for this UserDetail.
     * 
     * @param user_name
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }


    /**
     * Gets the user_address value for this UserDetail.
     * 
     * @return user_address
     */
    public String getUser_address() {
        return user_address;
    }


    /**
     * Sets the user_address value for this UserDetail.
     * 
     * @param user_address
     */
    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }


    /**
     * Gets the ad_account value for this UserDetail.
     * 
     * @return ad_account
     */
    public String getAd_account() {
        return ad_account;
    }


    /**
     * Sets the ad_account value for this UserDetail.
     * 
     * @param ad_account
     */
    public void setAd_account(String ad_account) {
        this.ad_account = ad_account;
    }


    /**
     * Gets the cpe_id value for this UserDetail.
     * 
     * @return cpe_id
     */
    public String getCpe_id() {
        return cpe_id;
    }


    /**
     * Sets the cpe_id value for this UserDetail.
     * 
     * @param cpe_id
     */
    public void setCpe_id(String cpe_id) {
        this.cpe_id = cpe_id;
    }


    /**
     * Gets the cpe_status value for this UserDetail.
     * 
     * @return cpe_status
     */
    public String getCpe_status() {
        return cpe_status;
    }


    /**
     * Sets the cpe_status value for this UserDetail.
     * 
     * @param cpe_status
     */
    public void setCpe_status(String cpe_status) {
        this.cpe_status = cpe_status;
    }


    /**
     * Gets the online_status value for this UserDetail.
     * 
     * @return online_status
     */
    public String getOnline_status() {
        return online_status;
    }


    /**
     * Sets the online_status value for this UserDetail.
     * 
     * @param online_status
     */
    public void setOnline_status(String online_status) {
        this.online_status = online_status;
    }


    /**
     * Gets the version_status value for this UserDetail.
     * 
     * @return version_status
     */
    public String getVersion_status() {
        return version_status;
    }


    /**
     * Sets the version_status value for this UserDetail.
     * 
     * @param version_status
     */
    public void setVersion_status(String version_status) {
        this.version_status = version_status;
    }


    /**
     * Gets the cpe_version value for this UserDetail.
     * 
     * @return cpe_version
     */
    public String getCpe_version() {
        return cpe_version;
    }


    /**
     * Sets the cpe_version value for this UserDetail.
     * 
     * @param cpe_version
     */
    public void setCpe_version(String cpe_version) {
        this.cpe_version = cpe_version;
    }


    /**
     * Gets the wifi_status value for this UserDetail.
     * 
     * @return wifi_status
     */
    public String getWifi_status() {
        return wifi_status;
    }


    /**
     * Sets the wifi_status value for this UserDetail.
     * 
     * @param wifi_status
     */
    public void setWifi_status(String wifi_status) {
        this.wifi_status = wifi_status;
    }


    /**
     * Gets the last_connect value for this UserDetail.
     * 
     * @return last_connect
     */
    public String getLast_connect() {
        return last_connect;
    }


    /**
     * Sets the last_connect value for this UserDetail.
     * 
     * @param last_connect
     */
    public void setLast_connect(String last_connect) {
        this.last_connect = last_connect;
    }


    /**
     * Gets the cpe_domain value for this UserDetail.
     * 
     * @return cpe_domain
     */
    public String getCpe_domain() {
        return cpe_domain;
    }


    /**
     * Sets the cpe_domain value for this UserDetail.
     * 
     * @param cpe_domain
     */
    public void setCpe_domain(String cpe_domain) {
        this.cpe_domain = cpe_domain;
    }


    /**
     * Gets the cpe_service value for this UserDetail.
     * 
     * @return cpe_service
     */
    public String getCpe_service() {
        return cpe_service;
    }


    /**
     * Sets the cpe_service value for this UserDetail.
     * 
     * @param cpe_service
     */
    public void setCpe_service(String cpe_service) {
        this.cpe_service = cpe_service;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UserDetail)) return false;
        UserDetail other = (UserDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.user_name==null && other.getUser_name()==null) || 
             (this.user_name!=null &&
              this.user_name.equals(other.getUser_name()))) &&
            ((this.user_address==null && other.getUser_address()==null) || 
             (this.user_address!=null &&
              this.user_address.equals(other.getUser_address()))) &&
            ((this.ad_account==null && other.getAd_account()==null) || 
             (this.ad_account!=null &&
              this.ad_account.equals(other.getAd_account()))) &&
            ((this.cpe_id==null && other.getCpe_id()==null) || 
             (this.cpe_id!=null &&
              this.cpe_id.equals(other.getCpe_id()))) &&
            ((this.cpe_status==null && other.getCpe_status()==null) || 
             (this.cpe_status!=null &&
              this.cpe_status.equals(other.getCpe_status()))) &&
            ((this.online_status==null && other.getOnline_status()==null) || 
             (this.online_status!=null &&
              this.online_status.equals(other.getOnline_status()))) &&
            ((this.version_status==null && other.getVersion_status()==null) || 
             (this.version_status!=null &&
              this.version_status.equals(other.getVersion_status()))) &&
            ((this.cpe_version==null && other.getCpe_version()==null) || 
             (this.cpe_version!=null &&
              this.cpe_version.equals(other.getCpe_version()))) &&
            ((this.wifi_status==null && other.getWifi_status()==null) || 
             (this.wifi_status!=null &&
              this.wifi_status.equals(other.getWifi_status()))) &&
            ((this.last_connect==null && other.getLast_connect()==null) || 
             (this.last_connect!=null &&
              this.last_connect.equals(other.getLast_connect()))) &&
            ((this.cpe_domain==null && other.getCpe_domain()==null) || 
             (this.cpe_domain!=null &&
              this.cpe_domain.equals(other.getCpe_domain()))) &&
            ((this.cpe_service==null && other.getCpe_service()==null) || 
             (this.cpe_service!=null &&
              this.cpe_service.equals(other.getCpe_service())));
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
        if (getUser_name() != null) {
            _hashCode += getUser_name().hashCode();
        }
        if (getUser_address() != null) {
            _hashCode += getUser_address().hashCode();
        }
        if (getAd_account() != null) {
            _hashCode += getAd_account().hashCode();
        }
        if (getCpe_id() != null) {
            _hashCode += getCpe_id().hashCode();
        }
        if (getCpe_status() != null) {
            _hashCode += getCpe_status().hashCode();
        }
        if (getOnline_status() != null) {
            _hashCode += getOnline_status().hashCode();
        }
        if (getVersion_status() != null) {
            _hashCode += getVersion_status().hashCode();
        }
        if (getCpe_version() != null) {
            _hashCode += getCpe_version().hashCode();
        }
        if (getWifi_status() != null) {
            _hashCode += getWifi_status().hashCode();
        }
        if (getLast_connect() != null) {
            _hashCode += getLast_connect().hashCode();
        }
        if (getCpe_domain() != null) {
            _hashCode += getCpe_domain().hashCode();
        }
        if (getCpe_service() != null) {
            _hashCode += getCpe_service().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://10.40.103.46:6482/NorthInterface/services/OperationDistributeService", "UserDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ad_account");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ad_account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpe_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpe_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpe_status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpe_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("online_status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "online_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version_status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpe_version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpe_version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wifi_status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wifi_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last_connect");
        elemField.setXmlName(new javax.xml.namespace.QName("", "last_connect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpe_domain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpe_domain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpe_service");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpe_service"));
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
        final StringBuilder sb = new StringBuilder("UserDetail{");
        sb.append("user_name='").append(user_name).append('\'');
        sb.append(", user_address='").append(user_address).append('\'');
        sb.append(", ad_account='").append(ad_account).append('\'');
        sb.append(", cpe_id='").append(cpe_id).append('\'');
        sb.append(", cpe_status='").append(cpe_status).append('\'');
        sb.append(", online_status='").append(online_status).append('\'');
        sb.append(", version_status='").append(version_status).append('\'');
        sb.append(", cpe_version='").append(cpe_version).append('\'');
        sb.append(", wifi_status='").append(wifi_status).append('\'');
        sb.append(", last_connect='").append(last_connect).append('\'');
        sb.append(", cpe_domain='").append(cpe_domain).append('\'');
        sb.append(", cpe_service='").append(cpe_service).append('\'');
        sb.append(", __equalsCalc=").append(__equalsCalc);
        sb.append(", __hashCodeCalc=").append(__hashCodeCalc);
        sb.append('}');
        return sb.toString();
    }
}
