/**
 * PVCMsg.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.cms.model;

public class PVCMsg implements java.io.Serializable {
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

}
