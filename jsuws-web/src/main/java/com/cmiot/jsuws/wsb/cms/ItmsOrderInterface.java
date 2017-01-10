/**
 * ItmsOrderInterface.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.wsb.cms;


import com.cmiot.jsuws.facade.cms.model.*;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ItmsOrderInterface extends Remote {
    public String[] queryCPEID(String strCPEShortID) throws RemoteException;

    public int queryCpeStatus(String cpeId) throws RemoteException;

    public String[] queryCpeStatus(int cpeStatus) throws RemoteException;

    public int queryOrderStatus(String order_No) throws RemoteException;

    public String[] queryOrderStatus(int orderStatus) throws RemoteException;

    public ServiceStatusRespStruct[] queryServiceStatus(ServiceStatusReqStruct[] req) throws RemoteException;

    public OrderResponse dealOrder(Order order) throws RemoteException;

    public OrderServiceStruct populateOrderServiceStruct(String newServiceCode, String servName, String servFlag, String argsValue) throws RemoteException;

    public int bindInterface(int command, String cpeId, String adAccounts, String nasPortId, String nasIP, String areaNum, String vlanId) throws RemoteException;

    public int createService(CreatServiceReq req) throws RemoteException;

    public int dealOrderWithReply(Order order, String replyURL) throws RemoteException;

    public int dealOrderWithoutReply(Order order) throws RemoteException;

    public AlarmStruct[] getAlarmInformationByTimeSegment(String startTime, String endTime, int startAlarmID) throws RemoteException;

    public CPEMsg getCPEMsg(String seqnbr, String ID, int iFlg) throws RemoteException;

    public int queryCpeStatusConfirm(String[] cpeID) throws RemoteException;

    public int queryOrderStatusConfirm(String[] orderNO) throws RemoteException;

    public int queryOrderStatusWithReply(Order order, String replyURL) throws RemoteException;

    public UserDetail[] queryUserDetail(int iParaType, String value) throws RemoteException;

    public int routeCPECharge(String prodNo, String accounts, String password) throws RemoteException;

    public int serviceChange(String adAcount, String LSHNo, String orderType, String newPassWord) throws RemoteException;

    public String truncateString(String str) throws RemoteException;
}
