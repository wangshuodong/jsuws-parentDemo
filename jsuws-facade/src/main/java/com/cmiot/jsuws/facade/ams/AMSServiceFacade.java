package com.cmiot.jsuws.facade.ams;

import com.cmiot.jsuws.facade.ams.model.*;

import java.rmi.RemoteException;

/**
 * Created by ZJL on 2016/12/30.
 */
public interface AMSServiceFacade {
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
