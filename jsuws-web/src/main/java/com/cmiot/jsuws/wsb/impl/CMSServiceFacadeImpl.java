package com.cmiot.jsuws.wsb.impl;


import com.cmiot.jsuws.facade.cms.CMSServiceFacade;
import com.cmiot.jsuws.facade.cms.model.*;
import com.cmiot.jsuws.wsb.cms.ItmsOrderInterfaceProxy;
import com.cmiot.jsuws.wsb.utils.SysConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;

/**
 * Created by ZJL on 2016/12/30.
 */
public class CMSServiceFacadeImpl implements CMSServiceFacade {
    public static Logger logger = LoggerFactory.getLogger(CMSServiceFacadeImpl.class);

    @Override
    public String[] queryCPEID(String strCPEShortID) throws RemoteException {
        return new String[0];
    }

    @Override
    public int queryCpeStatus(String cpeId) throws RemoteException {
        return 0;
    }

    @Override
    public String[] queryCpeStatus(int cpeStatus) throws RemoteException {
        return new String[0];
    }

    @Override
    public int queryOrderStatus(String order_No) throws RemoteException {
        return 0;
    }

    @Override
    public String[] queryOrderStatus(int orderStatus) throws RemoteException {
        return new String[0];
    }

    @Override
    public ServiceStatusRespStruct[] queryServiceStatus(ServiceStatusReqStruct[] req) throws RemoteException {
        logger.info("RMS=》HOA=》JSWS入参=》queryServiceStatus()：{}",req);
        ServiceStatusRespStruct[] resp = null;
        try {
            resp = new ItmsOrderInterfaceProxy(SysConfig.CMS_QNAME).queryServiceStatus(req);
        }catch (RemoteException e) {
            new RemoteException("调用江苏webservice异常！" + e.getMessage());
        }
        logger.info("RMS=》HOA=》JSWS出参=》queryServiceStatus()：{}",resp);
        return resp;
    }

    @Override
    public OrderResponse dealOrder(Order order) throws RemoteException {
        logger.info("RMS=》HOA=》JSWS入参=》dealOrder()：{}",order);
        logger.info("wangshuodong=》dealOrder()：{}", SysConfig.CMS_QNAME);
        OrderResponse resp = null;
        try {
            resp = new ItmsOrderInterfaceProxy(SysConfig.CMS_QNAME).dealOrder(order);
        }catch (Exception e) {
            new RemoteException("调用江苏webservice异常！" + e.getMessage());
        }
        logger.info("RMS=》HOA=》JSWS出参=》dealOrder()：{}",resp);
        return resp;
    }

    @Override
    public OrderServiceStruct populateOrderServiceStruct(String newServiceCode, String servName, String servFlag, String argsValue) throws RemoteException {
        return null;
    }

    @Override
    public int bindInterface(int command, String cpeId, String adAccounts, String nasPortId, String nasIP, String areaNum, String vlanId) throws RemoteException {
        return 0;
    }

    @Override
    public int createService(CreatServiceReq req) throws RemoteException {
        return 0;
    }

    @Override
    public int dealOrderWithReply(Order order, String replyURL) throws RemoteException {
        return 0;
    }

    @Override
    public int dealOrderWithoutReply(Order order) throws RemoteException {
        return 0;
    }

    @Override
    public AlarmStruct[] getAlarmInformationByTimeSegment(String startTime, String endTime, int startAlarmID) throws RemoteException {
        return new AlarmStruct[0];
    }

    @Override
    public CPEMsg getCPEMsg(String seqnbr, String ID, int iFlg) throws RemoteException {
        return null;
    }

    @Override
    public int queryCpeStatusConfirm(String[] cpeID) throws RemoteException {
        return 0;
    }

    @Override
    public int queryOrderStatusConfirm(String[] orderNO) throws RemoteException {
        return 0;
    }

    @Override
    public int queryOrderStatusWithReply(Order order, String replyURL) throws RemoteException {
        return 0;
    }

    @Override
    public UserDetail[] queryUserDetail(int iParaType, String value) throws RemoteException {
        return new UserDetail[0];
    }

    @Override
    public int routeCPECharge(String prodNo, String accounts, String password) throws RemoteException {
        return 0;
    }

    @Override
    public int serviceChange(String adAcount, String LSHNo, String orderType, String newPassWord) throws RemoteException {
        return 0;
    }

    @Override
    public String truncateString(String str) throws RemoteException {
        return null;
    }
}
