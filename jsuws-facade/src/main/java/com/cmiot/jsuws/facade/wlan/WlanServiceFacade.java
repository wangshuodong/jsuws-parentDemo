package com.cmiot.jsuws.facade.wlan;

import com.cmiot.jsuws.facade.wlan.model.PonActToCms_request;
import com.cmiot.jsuws.facade.wlan.model.PonActToCms_response;

import java.rmi.RemoteException;
import java.util.HashMap;

/**
 * Created by Administrator on 2017/1/6.
 */
public interface WlanServiceFacade {
    public Boolean update(String order_Id, String cvlan) throws RemoteException;

    public PonActToCms_response ponActToCms(PonActToCms_request parameters) throws RemoteException;

    public String selectOrderId(String orderId) throws RemoteException;

    public HashMap selectVlan(String order_Id) throws RemoteException;

    public Boolean addVlan(String order_Id, String SERVICE, String SERVICE_ID, String SERVICE_FLAG, String cvlan) throws RemoteException;

}
