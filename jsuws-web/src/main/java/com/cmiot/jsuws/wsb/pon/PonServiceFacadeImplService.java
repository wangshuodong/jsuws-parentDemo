/**
 * PonServiceFacadeImplService.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.wsb.pon;

import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;
import java.net.URL;

public interface PonServiceFacadeImplService extends Service {
    public java.lang.String getPonServiceFacadeImplAddress();

    public PonServiceFacadeImpl getPonServiceFacadeImpl() throws ServiceException;

    public PonServiceFacadeImpl getPonServiceFacadeImpl(URL portAddress) throws ServiceException;
}
