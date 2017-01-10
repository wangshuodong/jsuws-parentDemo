/**
 * AMSServiceSoapBindingImpl.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.wsb.ams;

import com.cmiot.hoa.facade.jiangsu.JsAMSServiceFacade;
import com.cmiot.jsuws.facade.ams.model.*;
import com.cmiot.jsuws.wsb.spring.SpringContextUtils;

import java.rmi.RemoteException;

public class AMSServiceSoapBindingImpl implements AMSService {

    private JsAMSServiceFacade jsAMSServiceFacade = SpringContextUtils.getBean("jsAMSServiceFacade", JsAMSServiceFacade.class);


    public ReplaceDeviceResponse replaceDevice(ReplaceDeviceRequest parameters) throws RemoteException {
        return jsAMSServiceFacade.replaceDevice(parameters);
    }

    public QueryOrderResponse queryOrder(QueryOrderRequest parameters) throws RemoteException {
        return jsAMSServiceFacade.queryOrder(parameters);
    }

    public QueryDeviceByLoidResponse queryDeviceByLoid(QueryDeviceByLoidRequest parameters) throws RemoteException {
        return jsAMSServiceFacade.queryDeviceByLoid(parameters);
    }

    public QueryDeviceBySNResponse queryDeviceBySN(QueryDeviceBySNRequest parameters) throws RemoteException {
        return jsAMSServiceFacade.queryDeviceBySN(parameters);
    }

    public QueryDevicePasswordResponse queryDevicePassword(QueryDevicePasswordRequest parameters) throws RemoteException {
        return jsAMSServiceFacade.queryDevicePassword(parameters);
    }

    public QueryServiceStatusResponse queryServiceStatus(QueryServiceStatusRequest parameters) throws RemoteException {
        return jsAMSServiceFacade.queryServiceStatus(parameters);
    }

    public DeviceByHandResponse deviceByHand(DeviceByHandRequest parameters) throws RemoteException {
        return jsAMSServiceFacade.deviceByHand(parameters);
    }

    public SendImplementedInfoResponse sendImplementedInfo(SendImplementedInfoRequest parameters) throws RemoteException {
        return jsAMSServiceFacade.sendImplementedInfo(parameters);
    }

    public ResetServicesResponse resetServices(ResetServicesRequest parameters) throws RemoteException {
        return jsAMSServiceFacade.resetServices(parameters);
    }

    public ResetDeviceResponse resetDevice(ResetDeviceRequest parameters) throws RemoteException {
        return jsAMSServiceFacade.resetDevice(parameters);
    }

    public GetRemoteOperationResultResponse getRemoteOperationResult(GetRemoteOperationResultRequest parameters) throws RemoteException {
        return jsAMSServiceFacade.getRemoteOperationResult(parameters);
    }

}
