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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;

public class AMSServiceSoapBindingImpl implements AMSService {
    public static Logger logger = LoggerFactory.getLogger(AMSServiceSoapBindingImpl.class);

    private JsAMSServiceFacade jsAMSServiceFacade = SpringContextUtils.getBean("jsAMSServiceFacade", JsAMSServiceFacade.class);


    public ReplaceDeviceResponse replaceDevice(ReplaceDeviceRequest parameters) throws RemoteException {
        logger.info("外部调用=》HOA=》RMS入参：{}",parameters);
        return jsAMSServiceFacade.replaceDevice(parameters);
    }

    public QueryOrderResponse queryOrder(QueryOrderRequest parameters) throws RemoteException {
        logger.info("外部调用=》HOA=》RMS入参：{}",parameters);
        return jsAMSServiceFacade.queryOrder(parameters);
    }

    public QueryDeviceByLoidResponse queryDeviceByLoid(QueryDeviceByLoidRequest parameters) throws RemoteException {
        logger.info("外部调用=》HOA=》RMS入参：{}",parameters);
        return jsAMSServiceFacade.queryDeviceByLoid(parameters);
    }

    public QueryDeviceBySNResponse queryDeviceBySN(QueryDeviceBySNRequest parameters) throws RemoteException {
        logger.info("外部调用=》HOA=》RMS入参：{}",parameters);
        return jsAMSServiceFacade.queryDeviceBySN(parameters);
    }

    public QueryDevicePasswordResponse queryDevicePassword(QueryDevicePasswordRequest parameters) throws RemoteException {
        logger.info("外部调用=》HOA=》RMS入参：{}",parameters);
        return jsAMSServiceFacade.queryDevicePassword(parameters);
    }

    public QueryServiceStatusResponse queryServiceStatus(QueryServiceStatusRequest parameters) throws RemoteException {
        logger.info("外部调用=》HOA=》RMS入参：{}",parameters);
        return jsAMSServiceFacade.queryServiceStatus(parameters);
    }

    public DeviceByHandResponse deviceByHand(DeviceByHandRequest parameters) throws RemoteException {
        logger.info("外部调用=》HOA=》RMS入参：{}",parameters);
        return jsAMSServiceFacade.deviceByHand(parameters);
    }

    public SendImplementedInfoResponse sendImplementedInfo(SendImplementedInfoRequest parameters) throws RemoteException {
        logger.info("外部调用=》HOA=》RMS入参：{}",parameters);
        return jsAMSServiceFacade.sendImplementedInfo(parameters);
    }

    public ResetServicesResponse resetServices(ResetServicesRequest parameters) throws RemoteException {
        logger.info("外部调用=》HOA=》RMS入参：{}",parameters);
        return jsAMSServiceFacade.resetServices(parameters);
    }

    public ResetDeviceResponse resetDevice(ResetDeviceRequest parameters) throws RemoteException {
        logger.info("外部调用=》HOA=》RMS入参：{}",parameters);
        return jsAMSServiceFacade.resetDevice(parameters);
    }

    public GetRemoteOperationResultResponse getRemoteOperationResult(GetRemoteOperationResultRequest parameters) throws RemoteException {
        logger.info("外部调用=》HOA=》RMS入参：{}",parameters);
        return jsAMSServiceFacade.getRemoteOperationResult(parameters);
    }

}
