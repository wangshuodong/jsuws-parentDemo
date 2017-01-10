/**
 * PonActRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.pon.model;

import java.io.Serializable;

public class PonActRequest  implements Serializable {

    private String AUTH;

    private String DOWNBW;

    private String UPBW;

    private String accountId;

    private String content;

    private String cvlan;

    private String description;

    private String gimsUserType;

    private String loid;

    private String oltIp;

    private String oltPonPort;

    private String onuMac;

    private String onuManufacturer;

    private String onuType;

    private String orderId;

    private String ponType;

    private String returnCode;

    private String siteName;

    private String subFc;

    private String svlan;

    private String taskId;

    public PonActRequest() {
    }

    public PonActRequest(
           String AUTH,
           String DOWNBW,
           String UPBW,
           String accountId,
           String content,
           String cvlan,
           String description,
           String gimsUserType,
           String loid,
           String oltIp,
           String oltPonPort,
           String onuMac,
           String onuManufacturer,
           String onuType,
           String orderId,
           String ponType,
           String returnCode,
           String siteName,
           String subFc,
           String svlan,
           String taskId) {
           this.AUTH = AUTH;
           this.DOWNBW = DOWNBW;
           this.UPBW = UPBW;
           this.accountId = accountId;
           this.content = content;
           this.cvlan = cvlan;
           this.description = description;
           this.gimsUserType = gimsUserType;
           this.loid = loid;
           this.oltIp = oltIp;
           this.oltPonPort = oltPonPort;
           this.onuMac = onuMac;
           this.onuManufacturer = onuManufacturer;
           this.onuType = onuType;
           this.orderId = orderId;
           this.ponType = ponType;
           this.returnCode = returnCode;
           this.siteName = siteName;
           this.subFc = subFc;
           this.svlan = svlan;
           this.taskId = taskId;
    }

    /**
     * Gets the AUTH value for this PonActRequest.
     * 
     * @return AUTH
     */
    public String getAUTH() {
        return AUTH;
    }


    /**
     * Sets the AUTH value for this PonActRequest.
     * 
     * @param AUTH
     */
    public void setAUTH(String AUTH) {
        this.AUTH = AUTH;
    }


    /**
     * Gets the DOWNBW value for this PonActRequest.
     * 
     * @return DOWNBW
     */
    public String getDOWNBW() {
        return DOWNBW;
    }


    /**
     * Sets the DOWNBW value for this PonActRequest.
     * 
     * @param DOWNBW
     */
    public void setDOWNBW(String DOWNBW) {
        this.DOWNBW = DOWNBW;
    }


    /**
     * Gets the UPBW value for this PonActRequest.
     * 
     * @return UPBW
     */
    public String getUPBW() {
        return UPBW;
    }


    /**
     * Sets the UPBW value for this PonActRequest.
     * 
     * @param UPBW
     */
    public void setUPBW(String UPBW) {
        this.UPBW = UPBW;
    }


    /**
     * Gets the accountId value for this PonActRequest.
     * 
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this PonActRequest.
     * 
     * @param accountId
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the content value for this PonActRequest.
     * 
     * @return content
     */
    public String getContent() {
        return content;
    }


    /**
     * Sets the content value for this PonActRequest.
     * 
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }


    /**
     * Gets the cvlan value for this PonActRequest.
     * 
     * @return cvlan
     */
    public String getCvlan() {
        return cvlan;
    }


    /**
     * Sets the cvlan value for this PonActRequest.
     * 
     * @param cvlan
     */
    public void setCvlan(String cvlan) {
        this.cvlan = cvlan;
    }


    /**
     * Gets the description value for this PonActRequest.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PonActRequest.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the gimsUserType value for this PonActRequest.
     * 
     * @return gimsUserType
     */
    public String getGimsUserType() {
        return gimsUserType;
    }


    /**
     * Sets the gimsUserType value for this PonActRequest.
     * 
     * @param gimsUserType
     */
    public void setGimsUserType(String gimsUserType) {
        this.gimsUserType = gimsUserType;
    }


    /**
     * Gets the loid value for this PonActRequest.
     * 
     * @return loid
     */
    public String getLoid() {
        return loid;
    }


    /**
     * Sets the loid value for this PonActRequest.
     * 
     * @param loid
     */
    public void setLoid(String loid) {
        this.loid = loid;
    }


    /**
     * Gets the oltIp value for this PonActRequest.
     * 
     * @return oltIp
     */
    public String getOltIp() {
        return oltIp;
    }


    /**
     * Sets the oltIp value for this PonActRequest.
     * 
     * @param oltIp
     */
    public void setOltIp(String oltIp) {
        this.oltIp = oltIp;
    }


    /**
     * Gets the oltPonPort value for this PonActRequest.
     * 
     * @return oltPonPort
     */
    public String getOltPonPort() {
        return oltPonPort;
    }


    /**
     * Sets the oltPonPort value for this PonActRequest.
     * 
     * @param oltPonPort
     */
    public void setOltPonPort(String oltPonPort) {
        this.oltPonPort = oltPonPort;
    }


    /**
     * Gets the onuMac value for this PonActRequest.
     * 
     * @return onuMac
     */
    public String getOnuMac() {
        return onuMac;
    }


    /**
     * Sets the onuMac value for this PonActRequest.
     * 
     * @param onuMac
     */
    public void setOnuMac(String onuMac) {
        this.onuMac = onuMac;
    }


    /**
     * Gets the onuManufacturer value for this PonActRequest.
     * 
     * @return onuManufacturer
     */
    public String getOnuManufacturer() {
        return onuManufacturer;
    }


    /**
     * Sets the onuManufacturer value for this PonActRequest.
     * 
     * @param onuManufacturer
     */
    public void setOnuManufacturer(String onuManufacturer) {
        this.onuManufacturer = onuManufacturer;
    }


    /**
     * Gets the onuType value for this PonActRequest.
     * 
     * @return onuType
     */
    public String getOnuType() {
        return onuType;
    }


    /**
     * Sets the onuType value for this PonActRequest.
     * 
     * @param onuType
     */
    public void setOnuType(String onuType) {
        this.onuType = onuType;
    }


    /**
     * Gets the orderId value for this PonActRequest.
     * 
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this PonActRequest.
     * 
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the ponType value for this PonActRequest.
     * 
     * @return ponType
     */
    public String getPonType() {
        return ponType;
    }


    /**
     * Sets the ponType value for this PonActRequest.
     * 
     * @param ponType
     */
    public void setPonType(String ponType) {
        this.ponType = ponType;
    }


    /**
     * Gets the returnCode value for this PonActRequest.
     * 
     * @return returnCode
     */
    public String getReturnCode() {
        return returnCode;
    }


    /**
     * Sets the returnCode value for this PonActRequest.
     * 
     * @param returnCode
     */
    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }


    /**
     * Gets the siteName value for this PonActRequest.
     * 
     * @return siteName
     */
    public String getSiteName() {
        return siteName;
    }


    /**
     * Sets the siteName value for this PonActRequest.
     * 
     * @param siteName
     */
    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }


    /**
     * Gets the subFc value for this PonActRequest.
     * 
     * @return subFc
     */
    public String getSubFc() {
        return subFc;
    }


    /**
     * Sets the subFc value for this PonActRequest.
     * 
     * @param subFc
     */
    public void setSubFc(String subFc) {
        this.subFc = subFc;
    }


    /**
     * Gets the svlan value for this PonActRequest.
     * 
     * @return svlan
     */
    public String getSvlan() {
        return svlan;
    }


    /**
     * Sets the svlan value for this PonActRequest.
     * 
     * @param svlan
     */
    public void setSvlan(String svlan) {
        this.svlan = svlan;
    }


    /**
     * Gets the taskId value for this PonActRequest.
     * 
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }


    /**
     * Sets the taskId value for this PonActRequest.
     * 
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PonActRequest{");
        sb.append(", AUTH='").append(AUTH).append('\'');
        sb.append(", DOWNBW='").append(DOWNBW).append('\'');
        sb.append(", UPBW='").append(UPBW).append('\'');
        sb.append(", accountId='").append(accountId).append('\'');
        sb.append(", content='").append(content).append('\'');
        sb.append(", cvlan='").append(cvlan).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", gimsUserType='").append(gimsUserType).append('\'');
        sb.append(", loid='").append(loid).append('\'');
        sb.append(", oltIp='").append(oltIp).append('\'');
        sb.append(", oltPonPort='").append(oltPonPort).append('\'');
        sb.append(", onuMac='").append(onuMac).append('\'');
        sb.append(", onuManufacturer='").append(onuManufacturer).append('\'');
        sb.append(", onuType='").append(onuType).append('\'');
        sb.append(", orderId='").append(orderId).append('\'');
        sb.append(", ponType='").append(ponType).append('\'');
        sb.append(", returnCode='").append(returnCode).append('\'');
        sb.append(", siteName='").append(siteName).append('\'');
        sb.append(", subFc='").append(subFc).append('\'');
        sb.append(", svlan='").append(svlan).append('\'');
        sb.append(", taskId='").append(taskId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
