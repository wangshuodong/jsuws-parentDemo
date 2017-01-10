/**
 * PonServiceFacadeImplSoapBindingImpl.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.wsb.pon;

import com.cmiot.hoa.facade.jiangsu.JsPonServiceFacade;
import com.cmiot.jsuws.facade.pon.model.PonActRequest;
import com.cmiot.jsuws.facade.pon.model.PonActResponse;
import com.cmiot.jsuws.wsb.spring.SpringContextUtils;

import java.rmi.RemoteException;

public class PonServiceFacadeImplSoapBindingImpl implements PonServiceFacadeImpl {

    private JsPonServiceFacade jsPonServiceFacade = SpringContextUtils.getBean("jsPonServiceFacade", JsPonServiceFacade.class);

    public PonActResponse ponActToCms(PonActRequest ponActRequest) throws RemoteException {
        return jsPonServiceFacade.ponActToCms(ponActRequest);
    }

}
