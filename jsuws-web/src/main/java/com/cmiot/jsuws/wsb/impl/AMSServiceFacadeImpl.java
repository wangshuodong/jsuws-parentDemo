package com.cmiot.jsuws.wsb.impl;

import com.cmiot.jsuws.facade.ams.AMSServiceFacade;
import com.cmiot.jsuws.facade.ams.model.*;
import com.cmiot.jsuws.wsb.ams.AMSServiceProxy;
import com.cmiot.jsuws.wsb.utils.SysConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;

/**
 * Created by ZJL on 2016/12/30.
 */
public class AMSServiceFacadeImpl implements AMSServiceFacade {
    public static Logger logger = LoggerFactory.getLogger(AMSServiceFacadeImpl.class);

    @Override
    public ReplaceDeviceResponse replaceDevice(ReplaceDeviceRequest parameters) throws RemoteException {
        logger.info("RMS=》HOA=》JSWS入参=》replaceDevice()：{}",parameters);
        ReplaceDeviceResponse resp = null;
        try {
            resp = new AMSServiceProxy(SysConfig.AMS_QNAME).replaceDevice(parameters);
        }catch (RemoteException e) {
            new RemoteException("调用江苏webservice异常！" + e.getMessage());
        }
        logger.info("RMS=》HOA=》JSWS出参=》replaceDevice()：{}",resp);
        return resp;
    }

    @Override
    public QueryOrderResponse queryOrder(QueryOrderRequest parameters) throws RemoteException {
        logger.info("RMS=》HOA=》JSWS入参=》queryOrder()：{}",parameters);
        QueryOrderResponse resp = null;
        try {
            resp = new AMSServiceProxy(SysConfig.AMS_QNAME).queryOrder(parameters);
        }catch (RemoteException e) {
            new RemoteException("调用江苏webservice异常！" + e.getMessage());
        }
        logger.info("RMS=》HOA=》JSWS出参=》queryOrder()：{}",resp);
        return resp;
    }

    @Override
    public QueryDeviceByLoidResponse queryDeviceByLoid(QueryDeviceByLoidRequest parameters) throws RemoteException {
        logger.info("RMS=》HOA=》JSWS入参=》queryDeviceByLoid()：{}",parameters);
        QueryDeviceByLoidResponse resp = null;
        try {
            resp = new AMSServiceProxy(SysConfig.AMS_QNAME).queryDeviceByLoid(parameters);
        }catch (RemoteException e) {
            new RemoteException("调用江苏webservice异常！" + e.getMessage());
        }
        logger.info("RMS=》HOA=》JSWS出参=》queryDeviceByLoid()：{}",resp);
        return resp;
    }

    @Override
    public QueryDeviceBySNResponse queryDeviceBySN(QueryDeviceBySNRequest parameters) throws RemoteException {
        logger.info("RMS=》HOA=》JSWS入参=》queryDeviceBySN()：{}",parameters);
        QueryDeviceBySNResponse resp = null;
        try {
            resp = new AMSServiceProxy(SysConfig.AMS_QNAME).queryDeviceBySN(parameters);
        }catch (RemoteException e) {
            new RemoteException("调用江苏webservice异常！" + e.getMessage());
        }
        logger.info("RMS=》HOA=》JSWS出参=》queryDeviceBySN()：{}",resp);
        return resp;
    }

    @Override
    public QueryDevicePasswordResponse queryDevicePassword(QueryDevicePasswordRequest parameters) throws RemoteException {
        logger.info("RMS=》HOA=》JSWS入参=》queryDevicePassword()：{}",parameters);
        QueryDevicePasswordResponse resp = null;
        try {
            resp = new AMSServiceProxy(SysConfig.AMS_QNAME).queryDevicePassword(parameters);
        }catch (RemoteException e) {
            new RemoteException("调用江苏webservice异常！" + e.getMessage());
        }
        logger.info("RMS=》HOA=》JSWS出参=》queryDevicePassword()：{}",resp);
        return resp;
    }

    @Override
    public QueryServiceStatusResponse queryServiceStatus(QueryServiceStatusRequest parameters) throws RemoteException {
        logger.info("RMS=》HOA=》JSWS入参=》queryServiceStatus()：{}",parameters);
        QueryServiceStatusResponse resp = null;
        try {
            resp = new AMSServiceProxy(SysConfig.AMS_QNAME).queryServiceStatus(parameters);
        }catch (RemoteException e) {
            new RemoteException("调用江苏webservice异常！" + e.getMessage());
        }
        logger.info("RMS=》HOA=》JSWS出参=》queryServiceStatus()：{}",resp);
        return resp;
    }

    @Override
    public DeviceByHandResponse deviceByHand(DeviceByHandRequest parameters) throws RemoteException {
        logger.info("RMS=》HOA=》JSWS入参=》deviceByHand()：{}",parameters);
        DeviceByHandResponse resp = null;
        try {
            resp = new AMSServiceProxy(SysConfig.AMS_QNAME).deviceByHand(parameters);
        }catch (RemoteException e) {
            new RemoteException("调用江苏webservice异常！" + e.getMessage());
        }
        logger.info("RMS=》HOA=》JSWS出参=》deviceByHand()：{}",resp);
        return resp;
    }

    @Override
    public SendImplementedInfoResponse sendImplementedInfo(SendImplementedInfoRequest parameters) throws RemoteException {
        logger.info("RMS=》HOA=》JSWS入参=》sendImplementedInfo()：{}",parameters);
        SendImplementedInfoResponse resp = null;
        try {
            resp = new AMSServiceProxy(SysConfig.AMS_QNAME).sendImplementedInfo(parameters);
        }catch (RemoteException e) {
            new RemoteException("调用江苏webservice异常！" + e.getMessage());
        }
        logger.info("RMS=》HOA=》JSWS出参=》sendImplementedInfo()：{}",resp);
        return resp;
    }

    @Override
    public ResetServicesResponse resetServices(ResetServicesRequest parameters) throws RemoteException {
        logger.info("RMS=》HOA=》JSWS入参=》resetServices()：{}",parameters);
        ResetServicesResponse resp = null;
        try {
            resp = new AMSServiceProxy(SysConfig.AMS_QNAME).resetServices(parameters);
        }catch (RemoteException e) {
            new RemoteException("调用江苏webservice异常！" + e.getMessage());
        }
        logger.info("RMS=》HOA=》JSWS出参=》resetServices()：{}",resp);
        return resp;
    }

    @Override
    public ResetDeviceResponse resetDevice(ResetDeviceRequest parameters) throws RemoteException {
        logger.info("RMS=》HOA=》JSWS入参=》resetDevice()：{}",parameters);
        ResetDeviceResponse resp = null;
        try {
            resp = new AMSServiceProxy(SysConfig.AMS_QNAME).resetDevice(parameters);
        }catch (RemoteException e) {
            new RemoteException("调用江苏webservice异常！" + e.getMessage());
        }
        logger.info("RMS=》HOA=》JSWS出参=》resetDevice()：{}",resp);
        return resp;
    }

    @Override
    public GetRemoteOperationResultResponse getRemoteOperationResult(GetRemoteOperationResultRequest parameters) throws RemoteException {
        return null;
    }
}
