/**
 * OperationDistributeServiceSoapBindingImpl.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.wsb.cms;

import com.cmiot.hoa.facade.jiangsu.JsCMSServiceFacade;
import com.cmiot.jsuws.facade.cms.model.*;
import com.cmiot.jsuws.wsb.spring.SpringContextUtils;
import com.cmiot.jsuws.wsb.utils.AxisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;

public class OperationDistributeServiceSoapBindingImpl implements ItmsOrderInterface {

    public static Logger logger = LoggerFactory.getLogger(OperationDistributeServiceSoapBindingImpl.class);

    private JsCMSServiceFacade jsCMSServiceFacade = SpringContextUtils.getBean("jsCMSServiceFacade", JsCMSServiceFacade.class);

    public String[] queryCPEID(String strCPEShortID) throws RemoteException {
        return null;
    }

    public int queryCpeStatus(String cpeId) throws RemoteException {
        return -3;
    }

    public String[] queryCpeStatus(int cpeStatus) throws RemoteException {
        return null;
    }

    public int queryOrderStatus(String order_No) throws RemoteException {
        return -3;
    }

    public String[] queryOrderStatus(int orderStatus) throws RemoteException {
        return null;
    }

    public ServiceStatusRespStruct[] queryServiceStatus(ServiceStatusReqStruct[] req) throws RemoteException {
        logger.info("外部调用=》HOA=》RMS入参：{}",req);
        return jsCMSServiceFacade.queryServiceStatus(req);
    }

    public OrderResponse dealOrder(Order order) throws RemoteException {
        logger.info("外部调用=》HOA=》RMS入参：{}",order);
        String ip = AxisUtil.getClientIpAxis();
        return jsCMSServiceFacade.dealOrder(order, ip);
    }

    public OrderServiceStruct populateOrderServiceStruct(String newServiceCode, String servName, String servFlag, String argsValue) throws RemoteException {
        return null;
    }

    public int bindInterface(int command, String cpeId, String adAccounts, String nasPortId, String nasIP, String areaNum, String vlanId) throws RemoteException {
        return -3;
    }

    public int createService(CreatServiceReq req) throws RemoteException {
        return -3;
    }

    public int dealOrderWithReply(Order order, String replyURL) throws RemoteException {
        return -3;
    }

    public int dealOrderWithoutReply(Order order) throws RemoteException {
        return -3;
    }

    public AlarmStruct[] getAlarmInformationByTimeSegment(String startTime, String endTime, int startAlarmID) throws RemoteException {
        return null;
    }

    public CPEMsg getCPEMsg(String seqnbr, String ID, int iFlg) throws RemoteException {
        return null;
    }

    public int queryCpeStatusConfirm(String[] cpeID) throws RemoteException {
        return -3;
    }

    public int queryOrderStatusConfirm(String[] orderNO) throws RemoteException {
        return -3;
    }

    public int queryOrderStatusWithReply(Order order, String replyURL) throws RemoteException {
        return -3;
    }

    public UserDetail[] queryUserDetail(int iParaType, String value) throws RemoteException {
        return null;
    }

    public int routeCPECharge(String prodNo, String accounts, String password) throws RemoteException {
        return -3;
    }

    public int serviceChange(String adAcount, String LSHNo, String orderType, String newPassWord) throws RemoteException {
        return -3;
    }
}
