/**
 * AMSService.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.wsb.ams;


import com.cmiot.jsuws.facade.ams.model.*;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AMSService extends Remote {
    public ReplaceDeviceResponse replaceDevice(ReplaceDeviceRequest parameters) throws RemoteException;

    public QueryOrderResponse queryOrder(QueryOrderRequest parameters) throws RemoteException;

    public QueryDeviceByLoidResponse queryDeviceByLoid(QueryDeviceByLoidRequest parameters) throws RemoteException;

    public QueryDeviceBySNResponse queryDeviceBySN(QueryDeviceBySNRequest parameters) throws RemoteException;

    public QueryDevicePasswordResponse queryDevicePassword(QueryDevicePasswordRequest parameters) throws RemoteException;

    public QueryServiceStatusResponse queryServiceStatus(QueryServiceStatusRequest parameters) throws RemoteException;

    public DeviceByHandResponse deviceByHand(DeviceByHandRequest parameters) throws RemoteException;

    public SendImplementedInfoResponse sendImplementedInfo(SendImplementedInfoRequest parameters) throws RemoteException;

    public ResetServicesResponse resetServices(ResetServicesRequest parameters) throws RemoteException;

    public ResetDeviceResponse resetDevice(ResetDeviceRequest parameters) throws RemoteException;

    public GetRemoteOperationResultResponse getRemoteOperationResult(GetRemoteOperationResultRequest parameters) throws RemoteException;
}
