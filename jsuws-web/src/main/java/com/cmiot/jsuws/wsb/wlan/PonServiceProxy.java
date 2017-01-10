package com.cmiot.jsuws.wsb.wlan;

import com.cmiot.jsuws.facade.wlan.model.PonActToCms_request;
import com.cmiot.jsuws.facade.wlan.model.PonActToCms_response;

import javax.xml.rpc.ServiceException;
import javax.xml.rpc.Stub;
import java.rmi.RemoteException;

public class PonServiceProxy implements PonService {
  private String _endpoint = null;
  private PonService ponService = null;
  
  public PonServiceProxy() {
    _initPonServiceProxy();
  }
  
  public PonServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initPonServiceProxy();
  }
  
  private void _initPonServiceProxy() {
    try {
      ponService = (new PonServiceServiceLocator()).getPonService();
      if (ponService != null) {
        if (_endpoint != null)
          ((Stub)ponService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((Stub)ponService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (ponService != null)
      ((Stub)ponService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public PonService getPonService() {
    if (ponService == null)
      _initPonServiceProxy();
    return ponService;
  }
  
  public Boolean update(String order_Id, String cvlan) throws RemoteException {
    if (ponService == null)
      _initPonServiceProxy();
    return ponService.update(order_Id, cvlan);
  }
  
  public PonActToCms_response ponActToCms(PonActToCms_request parameters) throws RemoteException{
    if (ponService == null)
      _initPonServiceProxy();
    return ponService.ponActToCms(parameters);
  }
  
  public String selectOrderId(String orderId) throws RemoteException{
    if (ponService == null)
      _initPonServiceProxy();
    return ponService.selectOrderId(orderId);
  }
  
  public java.util.HashMap selectVlan(String order_Id) throws RemoteException{
    if (ponService == null)
      _initPonServiceProxy();
    return ponService.selectVlan(order_Id);
  }
  
  public Boolean addVlan(String order_Id, String SERVICE, String SERVICE_ID, String SERVICE_FLAG, String cvlan) throws RemoteException{
    if (ponService == null)
      _initPonServiceProxy();
    return ponService.addVlan(order_Id, SERVICE, SERVICE_ID, SERVICE_FLAG, cvlan);
  }
  
  
}