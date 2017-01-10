/**
 * PonService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.wsb.wlan;

import com.cmiot.jsuws.facade.wlan.model.PonActToCms_request;
import com.cmiot.jsuws.facade.wlan.model.PonActToCms_response;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.HashMap;

public interface PonService extends Remote {
    public Boolean update(String order_Id, String cvlan) throws RemoteException;
    public PonActToCms_response ponActToCms(PonActToCms_request parameters) throws RemoteException;
    public String selectOrderId(String orderId) throws RemoteException;
    public HashMap selectVlan(String order_Id) throws RemoteException;
    public Boolean addVlan(String order_Id, String SERVICE, String SERVICE_ID, String SERVICE_FLAG, String cvlan) throws RemoteException;
}
