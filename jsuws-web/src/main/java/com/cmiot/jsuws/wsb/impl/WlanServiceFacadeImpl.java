package com.cmiot.jsuws.wsb.impl;

import com.cmiot.jsuws.facade.wlan.WlanServiceFacade;
import com.cmiot.jsuws.facade.wlan.model.PonActToCms_request;
import com.cmiot.jsuws.facade.wlan.model.PonActToCms_response;
import com.cmiot.jsuws.wsb.utils.SysConfig;
import com.cmiot.jsuws.wsb.wlan.PonServiceProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;
import java.util.HashMap;

/**
 * Created by Administrator on 2017/1/6.
 */
public class WlanServiceFacadeImpl implements WlanServiceFacade {

    public static Logger logger = LoggerFactory.getLogger(AMSServiceFacadeImpl.class);

    @Override
    public Boolean update(String order_Id, String cvlan) throws RemoteException {
        return null;
    }

    @Override
    public PonActToCms_response ponActToCms(PonActToCms_request parameters) throws RemoteException {
        logger.info("RMS=》HOA=》JSWS入参=》ponActToCms()：{}",parameters);
        PonActToCms_response resp = null;
        try {
            resp = new PonServiceProxy(SysConfig.WLAN_QNAME).ponActToCms(parameters);
        }catch (RemoteException e) {
            new RemoteException("调用江苏webservice异常！" + e.getMessage());
        }
        logger.info("RMS=》HOA=》JSWS出参=》ponActToCms()：{}",resp);
        return resp;
    }

    @Override
    public String selectOrderId(String orderId) throws RemoteException {
        return null;
    }

    @Override
    public HashMap selectVlan(String order_Id) throws RemoteException {
        return null;
    }

    @Override
    public Boolean addVlan(String order_Id, String SERVICE, String SERVICE_ID, String SERVICE_FLAG, String cvlan) throws RemoteException {
        return null;
    }
}
