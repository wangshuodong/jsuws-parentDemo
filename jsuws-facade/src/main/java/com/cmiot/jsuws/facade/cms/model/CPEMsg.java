/**
 * CPEMsg.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.cms.model;

public class CPEMsg implements java.io.Serializable {
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

}
