/**
 * ItmsOrderInterface.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.wsb.cms;

import com.cmiot.jsuws.facade.cms.model.*;

public interface ItmsOrderInterface extends java.rmi.Remote {
    public String[] queryCPEID(String strCPEShortID) throws java.rmi.RemoteException;

    public int queryCpeStatus(String cpeId) throws java.rmi.RemoteException;

    public String[] queryCpeStatus(int cpeStatus) throws java.rmi.RemoteException;

    public int queryOrderStatus(String order_No) throws java.rmi.RemoteException;

    public String[] queryOrderStatus(int orderStatus) throws java.rmi.RemoteException;

    public ServiceStatusRespStruct[] queryServiceStatus(ServiceStatusReqStruct[] req) throws java.rmi.RemoteException;

    public OrderResponse dealOrder(Order order) throws java.rmi.RemoteException;

    public OrderServiceStruct populateOrderServiceStruct(String newServiceCode, String servName, String servFlag, String argsValue) throws java.rmi.RemoteException;

    public int bindInterface(int command, String cpeId, String adAccounts, String nasPortId, String nasIP, String areaNum, String vlanId) throws java.rmi.RemoteException;

    public int createService(CreatServiceReq req) throws java.rmi.RemoteException;

    public int dealOrderWithReply(Order order, String replyURL) throws java.rmi.RemoteException;

    public int dealOrderWithoutReply(Order order) throws java.rmi.RemoteException;

    public AlarmStruct[] getAlarmInformationByTimeSegment(String startTime, String endTime, int startAlarmID) throws java.rmi.RemoteException;

    public CPEMsg getCPEMsg(String seqnbr, String ID, int iFlg) throws java.rmi.RemoteException;

    public int queryCpeStatusConfirm(String[] cpeID) throws java.rmi.RemoteException;

    public int queryOrderStatusConfirm(String[] orderNO) throws java.rmi.RemoteException;

    public int queryOrderStatusWithReply(Order order, String replyURL) throws java.rmi.RemoteException;

    public UserDetail[] queryUserDetail(int iParaType, String value) throws java.rmi.RemoteException;

    public int routeCPECharge(String prodNo, String accounts, String password) throws java.rmi.RemoteException;

    public int serviceChange(String adAcount, String LSHNo, String orderType, String newPassWord) throws java.rmi.RemoteException;
}
