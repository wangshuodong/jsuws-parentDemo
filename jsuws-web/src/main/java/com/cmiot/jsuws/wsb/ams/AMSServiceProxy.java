package com.cmiot.jsuws.wsb.ams;

import com.cmiot.jsuws.facade.ams.model.*;

import javax.xml.rpc.ServiceException;
import javax.xml.rpc.Stub;
import java.rmi.RemoteException;

public class AMSServiceProxy implements AMSService {
    private String _endpoint = null;
    private AMSService aMSService = null;

    public AMSServiceProxy() {
        _initAMSServiceProxy();
    }

    public AMSServiceProxy(String endpoint) {
        _endpoint = endpoint;
        _initAMSServiceProxy();
    }

    private void _initAMSServiceProxy() {
        try {
            aMSService = (new AMSServiceServiceLocator()).getAMSService();
            if (aMSService != null) {
                if (_endpoint != null)
                    ((Stub)aMSService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
                else
                    _endpoint = (String)((Stub)aMSService)._getProperty("javax.xml.rpc.service.endpoint.address");
            }

        }
        catch (ServiceException serviceException) {}
    }

    public String getEndpoint() {
        return _endpoint;
    }

    public void setEndpoint(String endpoint) {
        _endpoint = endpoint;
        if (aMSService != null)
            ((Stub)aMSService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);

    }

    public AMSService getAMSService() {
        if (aMSService == null)
            _initAMSServiceProxy();
        return aMSService;
    }

    public ReplaceDeviceResponse replaceDevice(ReplaceDeviceRequest parameters) throws RemoteException{
        if (aMSService == null)
            _initAMSServiceProxy();
        return aMSService.replaceDevice(parameters);
    }

    public QueryOrderResponse queryOrder(QueryOrderRequest parameters) throws RemoteException{
        if (aMSService == null)
            _initAMSServiceProxy();
        return aMSService.queryOrder(parameters);
    }

    public QueryDeviceByLoidResponse queryDeviceByLoid(QueryDeviceByLoidRequest parameters) throws RemoteException{
        if (aMSService == null)
            _initAMSServiceProxy();
        return aMSService.queryDeviceByLoid(parameters);
    }

    public QueryDeviceBySNResponse queryDeviceBySN(QueryDeviceBySNRequest parameters) throws RemoteException{
        if (aMSService == null)
            _initAMSServiceProxy();
        return aMSService.queryDeviceBySN(parameters);
    }

    public QueryDevicePasswordResponse queryDevicePassword(QueryDevicePasswordRequest parameters) throws RemoteException{
        if (aMSService == null)
            _initAMSServiceProxy();
        return aMSService.queryDevicePassword(parameters);
    }

    public QueryServiceStatusResponse queryServiceStatus(QueryServiceStatusRequest parameters) throws RemoteException{
        if (aMSService == null)
            _initAMSServiceProxy();
        return aMSService.queryServiceStatus(parameters);
    }

    public DeviceByHandResponse deviceByHand(DeviceByHandRequest parameters) throws RemoteException {
        if (aMSService == null)
            _initAMSServiceProxy();
        return aMSService.deviceByHand(parameters);
    }

    public SendImplementedInfoResponse sendImplementedInfo(SendImplementedInfoRequest parameters) throws RemoteException{
        if (aMSService == null)
            _initAMSServiceProxy();
        return aMSService.sendImplementedInfo(parameters);
    }

    public ResetServicesResponse resetServices(ResetServicesRequest parameters) throws RemoteException{
        if (aMSService == null)
            _initAMSServiceProxy();
        return aMSService.resetServices(parameters);
    }

    public ResetDeviceResponse resetDevice(ResetDeviceRequest parameters) throws RemoteException{
        if (aMSService == null)
            _initAMSServiceProxy();
        return aMSService.resetDevice(parameters);
    }

    public GetRemoteOperationResultResponse getRemoteOperationResult(GetRemoteOperationResultRequest parameters) throws RemoteException{
        if (aMSService == null)
            _initAMSServiceProxy();
        return aMSService.getRemoteOperationResult(parameters);
    }


}