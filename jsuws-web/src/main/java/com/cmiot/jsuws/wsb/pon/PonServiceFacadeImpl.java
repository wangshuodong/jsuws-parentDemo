/**
 * PonServiceFacadeImpl.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.wsb.pon;

import com.cmiot.jsuws.facade.pon.model.PonActRequest;
import com.cmiot.jsuws.facade.pon.model.PonActResponse;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PonServiceFacadeImpl extends Remote {
    public PonActResponse ponActToCms(PonActRequest ponActRequest) throws RemoteException;
}
