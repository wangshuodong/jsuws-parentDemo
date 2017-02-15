/**
 * SubServiceReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.cms.model;

import java.util.Arrays;

public class SubServiceReq  implements java.io.Serializable {
    private String _ACTIONID;

    private String _EFFDATE;

    private String _EXPDATE;

    private Object[] _PARAMETERLIST;

    private String _SUBPRODDESC;

    private String _SUBPRODNAME;

    private String _SUBPRODNO;

    public SubServiceReq() {
    }

    public SubServiceReq(
           String _ACTIONID,
           String _EFFDATE,
           String _EXPDATE,
           Object[] _PARAMETERLIST,
           String _SUBPRODDESC,
           String _SUBPRODNAME,
           String _SUBPRODNO) {
           this._ACTIONID = _ACTIONID;
           this._EFFDATE = _EFFDATE;
           this._EXPDATE = _EXPDATE;
           this._PARAMETERLIST = _PARAMETERLIST;
           this._SUBPRODDESC = _SUBPRODDESC;
           this._SUBPRODNAME = _SUBPRODNAME;
           this._SUBPRODNO = _SUBPRODNO;
    }


    /**
     * Gets the _ACTIONID value for this SubServiceReq.
     * 
     * @return _ACTIONID
     */
    public String get_ACTIONID() {
        return _ACTIONID;
    }


    /**
     * Sets the _ACTIONID value for this SubServiceReq.
     * 
     * @param _ACTIONID
     */
    public void set_ACTIONID(String _ACTIONID) {
        this._ACTIONID = _ACTIONID;
    }


    /**
     * Gets the _EFFDATE value for this SubServiceReq.
     * 
     * @return _EFFDATE
     */
    public String get_EFFDATE() {
        return _EFFDATE;
    }


    /**
     * Sets the _EFFDATE value for this SubServiceReq.
     * 
     * @param _EFFDATE
     */
    public void set_EFFDATE(String _EFFDATE) {
        this._EFFDATE = _EFFDATE;
    }


    /**
     * Gets the _EXPDATE value for this SubServiceReq.
     * 
     * @return _EXPDATE
     */
    public String get_EXPDATE() {
        return _EXPDATE;
    }


    /**
     * Sets the _EXPDATE value for this SubServiceReq.
     * 
     * @param _EXPDATE
     */
    public void set_EXPDATE(String _EXPDATE) {
        this._EXPDATE = _EXPDATE;
    }


    /**
     * Gets the _PARAMETERLIST value for this SubServiceReq.
     * 
     * @return _PARAMETERLIST
     */
    public Object[] get_PARAMETERLIST() {
        return _PARAMETERLIST;
    }


    /**
     * Sets the _PARAMETERLIST value for this SubServiceReq.
     * 
     * @param _PARAMETERLIST
     */
    public void set_PARAMETERLIST(Object[] _PARAMETERLIST) {
        this._PARAMETERLIST = _PARAMETERLIST;
    }


    /**
     * Gets the _SUBPRODDESC value for this SubServiceReq.
     * 
     * @return _SUBPRODDESC
     */
    public String get_SUBPRODDESC() {
        return _SUBPRODDESC;
    }


    /**
     * Sets the _SUBPRODDESC value for this SubServiceReq.
     * 
     * @param _SUBPRODDESC
     */
    public void set_SUBPRODDESC(String _SUBPRODDESC) {
        this._SUBPRODDESC = _SUBPRODDESC;
    }


    /**
     * Gets the _SUBPRODNAME value for this SubServiceReq.
     * 
     * @return _SUBPRODNAME
     */
    public String get_SUBPRODNAME() {
        return _SUBPRODNAME;
    }


    /**
     * Sets the _SUBPRODNAME value for this SubServiceReq.
     * 
     * @param _SUBPRODNAME
     */
    public void set_SUBPRODNAME(String _SUBPRODNAME) {
        this._SUBPRODNAME = _SUBPRODNAME;
    }


    /**
     * Gets the _SUBPRODNO value for this SubServiceReq.
     * 
     * @return _SUBPRODNO
     */
    public String get_SUBPRODNO() {
        return _SUBPRODNO;
    }


    /**
     * Sets the _SUBPRODNO value for this SubServiceReq.
     * 
     * @param _SUBPRODNO
     */
    public void set_SUBPRODNO(String _SUBPRODNO) {
        this._SUBPRODNO = _SUBPRODNO;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SubServiceReq)) return false;
        SubServiceReq other = (SubServiceReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._ACTIONID==null && other.get_ACTIONID()==null) || 
             (this._ACTIONID!=null &&
              this._ACTIONID.equals(other.get_ACTIONID()))) &&
            ((this._EFFDATE==null && other.get_EFFDATE()==null) || 
             (this._EFFDATE!=null &&
              this._EFFDATE.equals(other.get_EFFDATE()))) &&
            ((this._EXPDATE==null && other.get_EXPDATE()==null) || 
             (this._EXPDATE!=null &&
              this._EXPDATE.equals(other.get_EXPDATE()))) &&
            ((this._PARAMETERLIST==null && other.get_PARAMETERLIST()==null) || 
             (this._PARAMETERLIST!=null &&
              java.util.Arrays.equals(this._PARAMETERLIST, other.get_PARAMETERLIST()))) &&
            ((this._SUBPRODDESC==null && other.get_SUBPRODDESC()==null) || 
             (this._SUBPRODDESC!=null &&
              this._SUBPRODDESC.equals(other.get_SUBPRODDESC()))) &&
            ((this._SUBPRODNAME==null && other.get_SUBPRODNAME()==null) || 
             (this._SUBPRODNAME!=null &&
              this._SUBPRODNAME.equals(other.get_SUBPRODNAME()))) &&
            ((this._SUBPRODNO==null && other.get_SUBPRODNO()==null) || 
             (this._SUBPRODNO!=null &&
              this._SUBPRODNO.equals(other.get_SUBPRODNO())));
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
        if (get_ACTIONID() != null) {
            _hashCode += get_ACTIONID().hashCode();
        }
        if (get_EFFDATE() != null) {
            _hashCode += get_EFFDATE().hashCode();
        }
        if (get_EXPDATE() != null) {
            _hashCode += get_EXPDATE().hashCode();
        }
        if (get_PARAMETERLIST() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_PARAMETERLIST());
                 i++) {
                Object obj = java.lang.reflect.Array.get(get_PARAMETERLIST(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (get_SUBPRODDESC() != null) {
            _hashCode += get_SUBPRODDESC().hashCode();
        }
        if (get_SUBPRODNAME() != null) {
            _hashCode += get_SUBPRODNAME().hashCode();
        }
        if (get_SUBPRODNO() != null) {
            _hashCode += get_SUBPRODNO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubServiceReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("OperationDistributeService", "SubServiceReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_ACTIONID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_ACTIONID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_EFFDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_EFFDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_EXPDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_EXPDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_PARAMETERLIST");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_PARAMETERLIST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_SUBPRODDESC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_SUBPRODDESC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_SUBPRODNAME");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_SUBPRODNAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_SUBPRODNO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_SUBPRODNO"));
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
        final StringBuilder sb = new StringBuilder("SubServiceReq{");
        sb.append("_ACTIONID='").append(_ACTIONID).append('\'');
        sb.append(", _EFFDATE='").append(_EFFDATE).append('\'');
        sb.append(", _EXPDATE='").append(_EXPDATE).append('\'');
        sb.append(", _PARAMETERLIST=").append(Arrays.toString(_PARAMETERLIST));
        sb.append(", _SUBPRODDESC='").append(_SUBPRODDESC).append('\'');
        sb.append(", _SUBPRODNAME='").append(_SUBPRODNAME).append('\'');
        sb.append(", _SUBPRODNO='").append(_SUBPRODNO).append('\'');
        sb.append(", __equalsCalc=").append(__equalsCalc);
        sb.append(", __hashCodeCalc=").append(__hashCodeCalc);
        sb.append('}');
        return sb.toString();
    }
}
