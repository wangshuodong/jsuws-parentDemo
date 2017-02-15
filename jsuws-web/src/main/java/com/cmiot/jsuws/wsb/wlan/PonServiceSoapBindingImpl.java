/**
 * PonServiceSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.wsb.wlan;

import com.cmiot.hoa.facade.jiangsu.JsWlanServiceFacade;
import com.cmiot.jsuws.facade.wlan.model.PonActToCms_request;
import com.cmiot.jsuws.facade.wlan.model.PonActToCms_response;
import com.cmiot.jsuws.wsb.spring.SpringContextUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;

public class PonServiceSoapBindingImpl implements PonService{

    public static Logger logger = LoggerFactory.getLogger(PonServiceSoapBindingImpl.class);

    private JsWlanServiceFacade jsWlanServiceFacade = SpringContextUtils.getBean("jsWlanServiceFacade", JsWlanServiceFacade.class);

    public Boolean update(String order_Id, String cvlan) throws RemoteException {
        return null;
    }

    public PonActToCms_response ponActToCms(PonActToCms_request parameters) throws RemoteException {
        logger.info("外部调用=》HOA=》RMS入参：{}",parameters);
        return jsWlanServiceFacade.ponActToCms(parameters);
    }

    public String selectOrderId(String orderId) throws RemoteException {
        return null;
    }

    public java.util.HashMap selectVlan(String order_Id) throws RemoteException {
        return null;
    }

    public Boolean addVlan(String order_Id, String SERVICE, String SERVICE_ID, String SERVICE_FLAG, String cvlan) throws RemoteException {
        return null;
    }

}
