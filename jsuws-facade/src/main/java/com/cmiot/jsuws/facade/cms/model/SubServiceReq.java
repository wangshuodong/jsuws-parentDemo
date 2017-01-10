/**
 * SubServiceReq.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.cms.model;

public class SubServiceReq implements java.io.Serializable {
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

}
