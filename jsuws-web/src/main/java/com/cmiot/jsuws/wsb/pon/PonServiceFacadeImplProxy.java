package com.cmiot.jsuws.wsb.pon;

import com.cmiot.jsuws.facade.pon.model.PonActRequest;
import com.cmiot.jsuws.facade.pon.model.PonActResponse;

import javax.xml.rpc.ServiceException;
import javax.xml.rpc.Stub;
import java.rmi.RemoteException;

public class PonServiceFacadeImplProxy implements PonServiceFacadeImpl {
  private String _endpoint = null;
  private PonServiceFacadeImpl ponServiceFacadeImpl = null;
  
  public PonServiceFacadeImplProxy() {
    _initPonServiceFacadeImplProxy();
  }
  
  public PonServiceFacadeImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initPonServiceFacadeImplProxy();
  }
  
  private void _initPonServiceFacadeImplProxy() {
    try {
      ponServiceFacadeImpl = (new PonServiceFacadeImplServiceLocator()).getPonServiceFacadeImpl();
      if (ponServiceFacadeImpl != null) {
        if (_endpoint != null)
          ((Stub)ponServiceFacadeImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((Stub)ponServiceFacadeImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (ponServiceFacadeImpl != null)
      ((Stub)ponServiceFacadeImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public PonServiceFacadeImpl getPonServiceFacadeImpl() {
    if (ponServiceFacadeImpl == null)
      _initPonServiceFacadeImplProxy();
    return ponServiceFacadeImpl;
  }
  
  public PonActResponse ponActToCms(PonActRequest ponActRequest) throws RemoteException {
    if (ponServiceFacadeImpl == null)
      _initPonServiceFacadeImplProxy();
    return ponServiceFacadeImpl.ponActToCms(ponActRequest);
  }
  
  
}