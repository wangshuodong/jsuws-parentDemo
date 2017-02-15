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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;

public class PonServiceFacadeImplSoapBindingImpl implements PonServiceFacadeImpl {

    public static Logger logger = LoggerFactory.getLogger(PonServiceFacadeImplSoapBindingImpl.class);

    private JsPonServiceFacade jsPonServiceFacade = SpringContextUtils.getBean("jsPonServiceFacade", JsPonServiceFacade.class);

    public PonActResponse ponActToCms(PonActRequest ponActRequest) throws RemoteException {
        logger.info("外部调用=》HOA=》RMS入参：{}",ponActRequest);
        return jsPonServiceFacade.ponActToCms(ponActRequest);
    }

}
