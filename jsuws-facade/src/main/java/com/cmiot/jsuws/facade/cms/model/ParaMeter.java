/**
 * ParaMeter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.cms.model;

public class ParaMeter  implements java.io.Serializable {
    private String _PARANAME;

    private String _PARAVALUE;

    public ParaMeter() {
    }

    public ParaMeter(
           String _PARANAME,
           String _PARAVALUE) {
           this._PARANAME = _PARANAME;
           this._PARAVALUE = _PARAVALUE;
    }


    /**
     * Gets the _PARANAME value for this ParaMeter.
     * 
     * @return _PARANAME
     */
    public String get_PARANAME() {
        return _PARANAME;
    }


    /**
     * Sets the _PARANAME value for this ParaMeter.
     * 
     * @param _PARANAME
     */
    public void set_PARANAME(String _PARANAME) {
        this._PARANAME = _PARANAME;
    }


    /**
     * Gets the _PARAVALUE value for this ParaMeter.
     * 
     * @return _PARAVALUE
     */
    public String get_PARAVALUE() {
        return _PARAVALUE;
    }


    /**
     * Sets the _PARAVALUE value for this ParaMeter.
     * 
     * @param _PARAVALUE
     */
    public void set_PARAVALUE(String _PARAVALUE) {
        this._PARAVALUE = _PARAVALUE;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ParaMeter)) return false;
        ParaMeter other = (ParaMeter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._PARANAME==null && other.get_PARANAME()==null) || 
             (this._PARANAME!=null &&
              this._PARANAME.equals(other.get_PARANAME()))) &&
            ((this._PARAVALUE==null && other.get_PARAVALUE()==null) || 
             (this._PARAVALUE!=null &&
              this._PARAVALUE.equals(other.get_PARAVALUE())));
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
        if (get_PARANAME() != null) {
            _hashCode += get_PARANAME().hashCode();
        }
        if (get_PARAVALUE() != null) {
            _hashCode += get_PARAVALUE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParaMeter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("OperationDistributeService", "ParaMeter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_PARANAME");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_PARANAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_PARAVALUE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_PARAVALUE"));
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
        final StringBuilder sb = new StringBuilder("ParaMeter{");
        sb.append("_PARANAME='").append(_PARANAME).append('\'');
        sb.append(", _PARAVALUE='").append(_PARAVALUE).append('\'');
        sb.append(", __equalsCalc=").append(__equalsCalc);
        sb.append(", __hashCodeCalc=").append(__hashCodeCalc);
        sb.append('}');
        return sb.toString();
    }
}
