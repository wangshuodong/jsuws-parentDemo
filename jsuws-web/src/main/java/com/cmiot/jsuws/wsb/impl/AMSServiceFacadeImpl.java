package com.cmiot.jsuws.wsb.impl;

import com.cmiot.jsuws.facade.ams.AMSServiceFacade;
import com.cmiot.jsuws.facade.ams.model.*;
import com.cmiot.jsuws.wsb.ams.AMSServiceProxy;
import com.cmiot.jsuws.wsb.utils.PropertiesUtils;

import java.rmi.RemoteException;

/**
 * Created by ZJL on 2016/12/30.
 */
public class AMSServiceFacadeImpl implements AMSServiceFacade {

    @Override
    public ReplaceDeviceResponse replaceDevice(ReplaceDeviceRequest parameters) throws RemoteException {
        ReplaceDeviceResponse resp = null;
        try {
            resp = new AMSServiceProxy(PropertiesUtils.getProperty("jiangsu.web.addr.ams")).replaceDevice(parameters);
        }catch (RemoteException e) {
            new RemoteException("调用江苏webservice异常！" + e.getMessage());
        }
        return resp;
    }

    @Override
    public QueryOrderResponse queryOrder(QueryOrderRequest parameters) throws RemoteException {
        QueryOrderResponse resp = null;
        try {
            resp = new AMSServiceProxy(PropertiesUtils.getProperty("jiangsu.web.addr.ams")).queryOrder(parameters);
        }catch (RemoteException e) {
            new RemoteException("调用江苏webservice异常！" + e.getMessage());
        }
        return resp;
    }

    @Override
    public QueryDeviceByLoidResponse queryDeviceByLoid(QueryDeviceByLoidRequest parameters) throws RemoteException {
        QueryDeviceByLoidResponse resp = null;
        try {
            resp = new AMSServiceProxy(PropertiesUtils.getProperty("jiangsu.web.addr.ams")).queryDeviceByLoid(parameters);
        }catch (RemoteException e) {
            new RemoteException("调用江苏webservice异常！" + e.getMessage());
        }
        return resp;
    }

    @Override
    public QueryDeviceBySNResponse queryDeviceBySN(QueryDeviceBySNRequest parameters) throws RemoteException {
        QueryDeviceBySNResponse resp = null;
        try {
            resp = new AMSServiceProxy(PropertiesUtils.getProperty("jiangsu.web.addr.ams")).queryDeviceBySN(parameters);
        }catch (RemoteException e) {
            new RemoteException("调用江苏webservice异常！" + e.getMessage());
        }
        return resp;
    }

    @Override
    public QueryDevicePasswordResponse queryDevicePassword(QueryDevicePasswordRequest parameters) throws RemoteException {
        QueryDevicePasswordResponse resp = null;
        try {
            resp = new AMSServiceProxy(PropertiesUtils.getProperty("jiangsu.web.addr.ams")).queryDevicePassword(parameters);
        }catch (RemoteException e) {
            new RemoteException("调用江苏webservice异常！" + e.getMessage());
        }
        return resp;
    }

    @Override
    public QueryServiceStatusResponse queryServiceStatus(QueryServiceStatusRequest parameters) throws RemoteException {
        QueryServiceStatusResponse resp = null;
        try {
            resp = new AMSServiceProxy(PropertiesUtils.getProperty("jiangsu.web.addr.ams")).queryServiceStatus(parameters);
        }catch (RemoteException e) {
            new RemoteException("调用江苏webservice异常！" + e.getMessage());
        }
        return resp;
    }

    @Override
    public DeviceByHandResponse deviceByHand(DeviceByHandRequest parameters) throws RemoteException {
        DeviceByHandResponse resp = null;
        try {
            resp = new AMSServiceProxy(PropertiesUtils.getProperty("jiangsu.web.addr.ams")).deviceByHand(parameters);
        }catch (RemoteException e) {
            new RemoteException("调用江苏webservice异常！" + e.getMessage());
        }
        return resp;
    }

    @Override
    public SendImplementedInfoResponse sendImplementedInfo(SendImplementedInfoRequest parameters) throws RemoteException {
        SendImplementedInfoResponse resp = null;
        try {
            resp = new AMSServiceProxy(PropertiesUtils.getProperty("jiangsu.web.addr.ams")).sendImplementedInfo(parameters);
        }catch (RemoteException e) {
            new RemoteException("调用江苏webservice异常！" + e.getMessage());
        }
        return resp;
    }

    @Override
    public ResetServicesResponse resetServices(ResetServicesRequest parameters) throws RemoteException {
        ResetServicesResponse resp = null;
        try {
            resp = new AMSServiceProxy(PropertiesUtils.getProperty("jiangsu.web.addr.ams")).resetServices(parameters);
        }catch (RemoteException e) {
            new RemoteException("调用江苏webservice异常！" + e.getMessage());
        }
        return resp;
    }

    @Override
    public ResetDeviceResponse resetDevice(ResetDeviceRequest parameters) throws RemoteException {
        ResetDeviceResponse resp = null;
        try {
            resp = new AMSServiceProxy(PropertiesUtils.getProperty("jiangsu.web.addr.ams")).resetDevice(parameters);
        }catch (RemoteException e) {
            new RemoteException("调用江苏webservice异常！" + e.getMessage());
        }
        return resp;
    }

    @Override
    public GetRemoteOperationResultResponse getRemoteOperationResult(GetRemoteOperationResultRequest parameters) throws RemoteException {
        return null;
    }
}
