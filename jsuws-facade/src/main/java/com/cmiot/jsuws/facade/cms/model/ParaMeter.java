/**
 * ParaMeter.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.cms.model;

public class ParaMeter implements java.io.Serializable {
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

}
