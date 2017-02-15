package com.cmiot.jsuws.wsb.cms;

import com.cmiot.jsuws.facade.cms.model.*;

public class ItmsOrderInterfaceProxy implements ItmsOrderInterface {
  private String _endpoint = null;
  private ItmsOrderInterface itmsOrderInterface = null;
  
  public ItmsOrderInterfaceProxy() {
    _initItmsOrderInterfaceProxy();
  }
  
  public ItmsOrderInterfaceProxy(String endpoint) {
    _endpoint = endpoint;
    _initItmsOrderInterfaceProxy();
  }
  
  private void _initItmsOrderInterfaceProxy() {
    try {
      itmsOrderInterface = (new ItmsOrderInterfaceServiceLocator()).getOperationDistributeService();
      if (itmsOrderInterface != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)itmsOrderInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)itmsOrderInterface)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (itmsOrderInterface != null)
      ((javax.xml.rpc.Stub)itmsOrderInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ItmsOrderInterface getItmsOrderInterface() {
    if (itmsOrderInterface == null)
      _initItmsOrderInterfaceProxy();
    return itmsOrderInterface;
  }
  
  public String[] queryCPEID(String strCPEShortID) throws java.rmi.RemoteException{
    if (itmsOrderInterface == null)
      _initItmsOrderInterfaceProxy();
    return itmsOrderInterface.queryCPEID(strCPEShortID);
  }
  
  public int queryCpeStatus(String cpeId) throws java.rmi.RemoteException{
    if (itmsOrderInterface == null)
      _initItmsOrderInterfaceProxy();
    return itmsOrderInterface.queryCpeStatus(cpeId);
  }
  
  public String[] queryCpeStatus(int cpeStatus) throws java.rmi.RemoteException{
    if (itmsOrderInterface == null)
      _initItmsOrderInterfaceProxy();
    return itmsOrderInterface.queryCpeStatus(cpeStatus);
  }
  
  public int queryOrderStatus(String order_No) throws java.rmi.RemoteException{
    if (itmsOrderInterface == null)
      _initItmsOrderInterfaceProxy();
    return itmsOrderInterface.queryOrderStatus(order_No);
  }
  
  public String[] queryOrderStatus(int orderStatus) throws java.rmi.RemoteException{
    if (itmsOrderInterface == null)
      _initItmsOrderInterfaceProxy();
    return itmsOrderInterface.queryOrderStatus(orderStatus);
  }
  
  public ServiceStatusRespStruct[] queryServiceStatus(ServiceStatusReqStruct[] req) throws java.rmi.RemoteException{
    if (itmsOrderInterface == null)
      _initItmsOrderInterfaceProxy();
    return itmsOrderInterface.queryServiceStatus(req);
  }
  
  public OrderResponse dealOrder(Order order) throws java.rmi.RemoteException{
    if (itmsOrderInterface == null)
      _initItmsOrderInterfaceProxy();
    return itmsOrderInterface.dealOrder(order);
  }
  
  public OrderServiceStruct populateOrderServiceStruct(String newServiceCode, String servName, String servFlag, String argsValue) throws java.rmi.RemoteException{
    if (itmsOrderInterface == null)
      _initItmsOrderInterfaceProxy();
    return itmsOrderInterface.populateOrderServiceStruct(newServiceCode, servName, servFlag, argsValue);
  }
  
  public int bindInterface(int command, String cpeId, String adAccounts, String nasPortId, String nasIP, String areaNum, String vlanId) throws java.rmi.RemoteException{
    if (itmsOrderInterface == null)
      _initItmsOrderInterfaceProxy();
    return itmsOrderInterface.bindInterface(command, cpeId, adAccounts, nasPortId, nasIP, areaNum, vlanId);
  }
  
  public int createService(CreatServiceReq req) throws java.rmi.RemoteException{
    if (itmsOrderInterface == null)
      _initItmsOrderInterfaceProxy();
    return itmsOrderInterface.createService(req);
  }
  
  public int dealOrderWithReply(Order order, String replyURL) throws java.rmi.RemoteException{
    if (itmsOrderInterface == null)
      _initItmsOrderInterfaceProxy();
    return itmsOrderInterface.dealOrderWithReply(order, replyURL);
  }
  
  public int dealOrderWithoutReply(Order order) throws java.rmi.RemoteException{
    if (itmsOrderInterface == null)
      _initItmsOrderInterfaceProxy();
    return itmsOrderInterface.dealOrderWithoutReply(order);
  }
  
  public AlarmStruct[] getAlarmInformationByTimeSegment(String startTime, String endTime, int startAlarmID) throws java.rmi.RemoteException{
    if (itmsOrderInterface == null)
      _initItmsOrderInterfaceProxy();
    return itmsOrderInterface.getAlarmInformationByTimeSegment(startTime, endTime, startAlarmID);
  }
  
  public CPEMsg getCPEMsg(String seqnbr, String ID, int iFlg) throws java.rmi.RemoteException{
    if (itmsOrderInterface == null)
      _initItmsOrderInterfaceProxy();
    return itmsOrderInterface.getCPEMsg(seqnbr, ID, iFlg);
  }
  
  public int queryCpeStatusConfirm(String[] cpeID) throws java.rmi.RemoteException{
    if (itmsOrderInterface == null)
      _initItmsOrderInterfaceProxy();
    return itmsOrderInterface.queryCpeStatusConfirm(cpeID);
  }
  
  public int queryOrderStatusConfirm(String[] orderNO) throws java.rmi.RemoteException{
    if (itmsOrderInterface == null)
      _initItmsOrderInterfaceProxy();
    return itmsOrderInterface.queryOrderStatusConfirm(orderNO);
  }
  
  public int queryOrderStatusWithReply(Order order, String replyURL) throws java.rmi.RemoteException{
    if (itmsOrderInterface == null)
      _initItmsOrderInterfaceProxy();
    return itmsOrderInterface.queryOrderStatusWithReply(order, replyURL);
  }
  
  public UserDetail[] queryUserDetail(int iParaType, String value) throws java.rmi.RemoteException{
    if (itmsOrderInterface == null)
      _initItmsOrderInterfaceProxy();
    return itmsOrderInterface.queryUserDetail(iParaType, value);
  }
  
  public int routeCPECharge(String prodNo, String accounts, String password) throws java.rmi.RemoteException{
    if (itmsOrderInterface == null)
      _initItmsOrderInterfaceProxy();
    return itmsOrderInterface.routeCPECharge(prodNo, accounts, password);
  }
  
  public int serviceChange(String adAcount, String LSHNo, String orderType, String newPassWord) throws java.rmi.RemoteException{
    if (itmsOrderInterface == null)
      _initItmsOrderInterfaceProxy();
    return itmsOrderInterface.serviceChange(adAcount, LSHNo, orderType, newPassWord);
  }
  
  
}