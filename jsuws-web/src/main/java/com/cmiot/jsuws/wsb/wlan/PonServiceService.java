/**
 * PonServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.wsb.wlan;

import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;

public interface PonServiceService extends Service {
    public String getPonServiceAddress();

    public PonService getPonService() throws ServiceException;

    public PonService getPonService(java.net.URL portAddress) throws ServiceException;
}
