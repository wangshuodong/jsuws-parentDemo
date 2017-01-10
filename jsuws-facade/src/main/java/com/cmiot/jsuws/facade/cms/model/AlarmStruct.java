/**
 * AlarmStruct.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.facade.cms.model;

public class AlarmStruct implements java.io.Serializable {
    private String strAlarmID;

    private String strLevel;

    private String strSource;

    private String strSourceType;

    private int iAlarmNum;

    private String strCause;

    private String strAdvice;

    private String alarmTime;

    private String content;

    private String solution;

    private String ip;

    public AlarmStruct() {
    }

    public AlarmStruct(
            String strAlarmID,
            String strLevel,
            String strSource,
            String strSourceType,
            int iAlarmNum,
            String strCause,
            String strAdvice,
            String alarmTime,
            String content,
            String solution,
            String ip) {
        this.strAlarmID = strAlarmID;
        this.strLevel = strLevel;
        this.strSource = strSource;
        this.strSourceType = strSourceType;
        this.iAlarmNum = iAlarmNum;
        this.strCause = strCause;
        this.strAdvice = strAdvice;
        this.alarmTime = alarmTime;
        this.content = content;
        this.solution = solution;
        this.ip = ip;
    }


    /**
     * Gets the strAlarmID value for this AlarmStruct.
     *
     * @return strAlarmID
     */
    public String getStrAlarmID() {
        return strAlarmID;
    }


    /**
     * Sets the strAlarmID value for this AlarmStruct.
     *
     * @param strAlarmID
     */
    public void setStrAlarmID(String strAlarmID) {
        this.strAlarmID = strAlarmID;
    }


    /**
     * Gets the strLevel value for this AlarmStruct.
     *
     * @return strLevel
     */
    public String getStrLevel() {
        return strLevel;
    }


    /**
     * Sets the strLevel value for this AlarmStruct.
     *
     * @param strLevel
     */
    public void setStrLevel(String strLevel) {
        this.strLevel = strLevel;
    }


    /**
     * Gets the strSource value for this AlarmStruct.
     *
     * @return strSource
     */
    public String getStrSource() {
        return strSource;
    }


    /**
     * Sets the strSource value for this AlarmStruct.
     *
     * @param strSource
     */
    public void setStrSource(String strSource) {
        this.strSource = strSource;
    }


    /**
     * Gets the strSourceType value for this AlarmStruct.
     *
     * @return strSourceType
     */
    public String getStrSourceType() {
        return strSourceType;
    }


    /**
     * Sets the strSourceType value for this AlarmStruct.
     *
     * @param strSourceType
     */
    public void setStrSourceType(String strSourceType) {
        this.strSourceType = strSourceType;
    }


    /**
     * Gets the iAlarmNum value for this AlarmStruct.
     *
     * @return iAlarmNum
     */
    public int getIAlarmNum() {
        return iAlarmNum;
    }


    /**
     * Sets the iAlarmNum value for this AlarmStruct.
     *
     * @param iAlarmNum
     */
    public void setIAlarmNum(int iAlarmNum) {
        this.iAlarmNum = iAlarmNum;
    }


    /**
     * Gets the strCause value for this AlarmStruct.
     *
     * @return strCause
     */
    public String getStrCause() {
        return strCause;
    }


    /**
     * Sets the strCause value for this AlarmStruct.
     *
     * @param strCause
     */
    public void setStrCause(String strCause) {
        this.strCause = strCause;
    }


    /**
     * Gets the strAdvice value for this AlarmStruct.
     *
     * @return strAdvice
     */
    public String getStrAdvice() {
        return strAdvice;
    }


    /**
     * Sets the strAdvice value for this AlarmStruct.
     *
     * @param strAdvice
     */
    public void setStrAdvice(String strAdvice) {
        this.strAdvice = strAdvice;
    }


    /**
     * Gets the alarmTime value for this AlarmStruct.
     *
     * @return alarmTime
     */
    public String getAlarmTime() {
        return alarmTime;
    }


    /**
     * Sets the alarmTime value for this AlarmStruct.
     *
     * @param alarmTime
     */
    public void setAlarmTime(String alarmTime) {
        this.alarmTime = alarmTime;
    }


    /**
     * Gets the content value for this AlarmStruct.
     *
     * @return content
     */
    public String getContent() {
        return content;
    }


    /**
     * Sets the content value for this AlarmStruct.
     *
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }


    /**
     * Gets the solution value for this AlarmStruct.
     *
     * @return solution
     */
    public String getSolution() {
        return solution;
    }


    /**
     * Sets the solution value for this AlarmStruct.
     *
     * @param solution
     */
    public void setSolution(String solution) {
        this.solution = solution;
    }


    /**
     * Gets the ip value for this AlarmStruct.
     *
     * @return ip
     */
    public String getIp() {
        return ip;
    }


    /**
     * Sets the ip value for this AlarmStruct.
     *
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

}
