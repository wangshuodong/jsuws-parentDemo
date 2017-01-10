/**
 * AMSServiceService.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.wsb.ams;

import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;

public interface AMSServiceService extends Service {
    public String getAMSServiceAddress();

    public AMSService getAMSService() throws ServiceException;

    public AMSService getAMSService(java.net.URL portAddress) throws ServiceException;
}
