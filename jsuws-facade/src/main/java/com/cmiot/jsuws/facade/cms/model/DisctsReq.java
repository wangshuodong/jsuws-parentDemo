/**
 * DisctsReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.cms.model;

import java.util.Arrays;

public class DisctsReq  implements java.io.Serializable {
    private String _ACTIONID;

    private String _EFFDATE;

    private String _EXPDATE;

    private String _PACKGROUP;

    private String _PACKNAME;

    private String _PACKNO;

    private Object[] _PARAMETERLIST;

    private String _SUBPRACKESC;

    public DisctsReq() {
    }

    public DisctsReq(
           String _ACTIONID,
           String _EFFDATE,
           String _EXPDATE,
           String _PACKGROUP,
           String _PACKNAME,
           String _PACKNO,
           Object[] _PARAMETERLIST,
           String _SUBPRACKESC) {
           this._ACTIONID = _ACTIONID;
           this._EFFDATE = _EFFDATE;
           this._EXPDATE = _EXPDATE;
           this._PACKGROUP = _PACKGROUP;
           this._PACKNAME = _PACKNAME;
           this._PACKNO = _PACKNO;
           this._PARAMETERLIST = _PARAMETERLIST;
           this._SUBPRACKESC = _SUBPRACKESC;
    }


    /**
     * Gets the _ACTIONID value for this DisctsReq.
     * 
     * @return _ACTIONID
     */
    public String get_ACTIONID() {
        return _ACTIONID;
    }


    /**
     * Sets the _ACTIONID value for this DisctsReq.
     * 
     * @param _ACTIONID
     */
    public void set_ACTIONID(String _ACTIONID) {
        this._ACTIONID = _ACTIONID;
    }


    /**
     * Gets the _EFFDATE value for this DisctsReq.
     * 
     * @return _EFFDATE
     */
    public String get_EFFDATE() {
        return _EFFDATE;
    }


    /**
     * Sets the _EFFDATE value for this DisctsReq.
     * 
     * @param _EFFDATE
     */
    public void set_EFFDATE(String _EFFDATE) {
        this._EFFDATE = _EFFDATE;
    }


    /**
     * Gets the _EXPDATE value for this DisctsReq.
     * 
     * @return _EXPDATE
     */
    public String get_EXPDATE() {
        return _EXPDATE;
    }


    /**
     * Sets the _EXPDATE value for this DisctsReq.
     * 
     * @param _EXPDATE
     */
    public void set_EXPDATE(String _EXPDATE) {
        this._EXPDATE = _EXPDATE;
    }


    /**
     * Gets the _PACKGROUP value for this DisctsReq.
     * 
     * @return _PACKGROUP
     */
    public String get_PACKGROUP() {
        return _PACKGROUP;
    }


    /**
     * Sets the _PACKGROUP value for this DisctsReq.
     * 
     * @param _PACKGROUP
     */
    public void set_PACKGROUP(String _PACKGROUP) {
        this._PACKGROUP = _PACKGROUP;
    }


    /**
     * Gets the _PACKNAME value for this DisctsReq.
     * 
     * @return _PACKNAME
     */
    public String get_PACKNAME() {
        return _PACKNAME;
    }


    /**
     * Sets the _PACKNAME value for this DisctsReq.
     * 
     * @param _PACKNAME
     */
    public void set_PACKNAME(String _PACKNAME) {
        this._PACKNAME = _PACKNAME;
    }


    /**
     * Gets the _PACKNO value for this DisctsReq.
     * 
     * @return _PACKNO
     */
    public String get_PACKNO() {
        return _PACKNO;
    }


    /**
     * Sets the _PACKNO value for this DisctsReq.
     * 
     * @param _PACKNO
     */
    public void set_PACKNO(String _PACKNO) {
        this._PACKNO = _PACKNO;
    }


    /**
     * Gets the _PARAMETERLIST value for this DisctsReq.
     * 
     * @return _PARAMETERLIST
     */
    public Object[] get_PARAMETERLIST() {
        return _PARAMETERLIST;
    }


    /**
     * Sets the _PARAMETERLIST value for this DisctsReq.
     * 
     * @param _PARAMETERLIST
     */
    public void set_PARAMETERLIST(Object[] _PARAMETERLIST) {
        this._PARAMETERLIST = _PARAMETERLIST;
    }


    /**
     * Gets the _SUBPRACKESC value for this DisctsReq.
     * 
     * @return _SUBPRACKESC
     */
    public String get_SUBPRACKESC() {
        return _SUBPRACKESC;
    }


    /**
     * Sets the _SUBPRACKESC value for this DisctsReq.
     * 
     * @param _SUBPRACKESC
     */
    public void set_SUBPRACKESC(String _SUBPRACKESC) {
        this._SUBPRACKESC = _SUBPRACKESC;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DisctsReq)) return false;
        DisctsReq other = (DisctsReq) obj;
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
            ((this._PACKGROUP==null && other.get_PACKGROUP()==null) || 
             (this._PACKGROUP!=null &&
              this._PACKGROUP.equals(other.get_PACKGROUP()))) &&
            ((this._PACKNAME==null && other.get_PACKNAME()==null) || 
             (this._PACKNAME!=null &&
              this._PACKNAME.equals(other.get_PACKNAME()))) &&
            ((this._PACKNO==null && other.get_PACKNO()==null) || 
             (this._PACKNO!=null &&
              this._PACKNO.equals(other.get_PACKNO()))) &&
            ((this._PARAMETERLIST==null && other.get_PARAMETERLIST()==null) || 
             (this._PARAMETERLIST!=null &&
              java.util.Arrays.equals(this._PARAMETERLIST, other.get_PARAMETERLIST()))) &&
            ((this._SUBPRACKESC==null && other.get_SUBPRACKESC()==null) || 
             (this._SUBPRACKESC!=null &&
              this._SUBPRACKESC.equals(other.get_SUBPRACKESC())));
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
        if (get_PACKGROUP() != null) {
            _hashCode += get_PACKGROUP().hashCode();
        }
        if (get_PACKNAME() != null) {
            _hashCode += get_PACKNAME().hashCode();
        }
        if (get_PACKNO() != null) {
            _hashCode += get_PACKNO().hashCode();
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
        if (get_SUBPRACKESC() != null) {
            _hashCode += get_SUBPRACKESC().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DisctsReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("OperationDistributeService", "DisctsReq"));
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
        elemField.setFieldName("_PACKGROUP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_PACKGROUP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_PACKNAME");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_PACKNAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_PACKNO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_PACKNO"));
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
        elemField.setFieldName("_SUBPRACKESC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_SUBPRACKESC"));
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
        final StringBuilder sb = new StringBuilder("DisctsReq{");
        sb.append("_ACTIONID='").append(_ACTIONID).append('\'');
        sb.append(", _EFFDATE='").append(_EFFDATE).append('\'');
        sb.append(", _EXPDATE='").append(_EXPDATE).append('\'');
        sb.append(", _PACKGROUP='").append(_PACKGROUP).append('\'');
        sb.append(", _PACKNAME='").append(_PACKNAME).append('\'');
        sb.append(", _PACKNO='").append(_PACKNO).append('\'');
        sb.append(", _PARAMETERLIST=").append(Arrays.toString(_PARAMETERLIST));
        sb.append(", _SUBPRACKESC='").append(_SUBPRACKESC).append('\'');
        sb.append(", __equalsCalc=").append(__equalsCalc);
        sb.append(", __hashCodeCalc=").append(__hashCodeCalc);
        sb.append('}');
        return sb.toString();
    }
}
