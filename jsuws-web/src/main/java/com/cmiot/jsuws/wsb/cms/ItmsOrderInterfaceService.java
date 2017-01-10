/**
 * ItmsOrderInterfaceService.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.wsb.cms;

import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;

public interface ItmsOrderInterfaceService extends Service {
    public String getOperationDistributeServiceAddress();

    public ItmsOrderInterface getOperationDistributeService() throws ServiceException;

    public ItmsOrderInterface getOperationDistributeService(java.net.URL portAddress) throws ServiceException;
}
