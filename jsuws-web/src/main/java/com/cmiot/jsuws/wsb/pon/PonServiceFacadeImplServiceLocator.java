/**
 * PonServiceFacadeImplServiceLocator.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.wsb.pon;

import org.apache.axis.EngineConfiguration;
import org.apache.axis.client.Service;
import org.apache.axis.client.Stub;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;

public class PonServiceFacadeImplServiceLocator extends Service implements PonServiceFacadeImplService {

    public PonServiceFacadeImplServiceLocator() {
    }


    public PonServiceFacadeImplServiceLocator(EngineConfiguration config) {
        super(config);
    }

    public PonServiceFacadeImplServiceLocator(String wsdlLoc, QName sName) throws ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PonServiceFacadeImpl
    private String PonServiceFacadeImpl_address = "http://localhost:8080/jsuws/services/PonServiceFacadeImpl";

    public String getPonServiceFacadeImplAddress() {
        return PonServiceFacadeImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private String PonServiceFacadeImplWSDDServiceName = "PonServiceFacadeImpl";

    public String getPonServiceFacadeImplWSDDServiceName() {
        return PonServiceFacadeImplWSDDServiceName;
    }

    public void setPonServiceFacadeImplWSDDServiceName(String name) {
        PonServiceFacadeImplWSDDServiceName = name;
    }

    public PonServiceFacadeImpl getPonServiceFacadeImpl() throws ServiceException {
        URL endpoint;
        try {
            endpoint = new URL(PonServiceFacadeImpl_address);
        } catch (MalformedURLException e) {
            throw new ServiceException(e);
        }
        return getPonServiceFacadeImpl(endpoint);
    }

    public PonServiceFacadeImpl getPonServiceFacadeImpl(URL portAddress) throws ServiceException {
        try {
            PonServiceFacadeImplSoapBindingStub _stub = new PonServiceFacadeImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getPonServiceFacadeImplWSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPonServiceFacadeImplEndpointAddress(String address) {
        PonServiceFacadeImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws ServiceException {
        try {
            if (PonServiceFacadeImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                PonServiceFacadeImplSoapBindingStub _stub = new PonServiceFacadeImplSoapBindingStub(new URL(PonServiceFacadeImpl_address), this);
                _stub.setPortName(getPonServiceFacadeImplWSDDServiceName());
                return _stub;
            }
        } catch (Throwable t) {
            throw new ServiceException(t);
        }
        throw new ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(QName portName, Class serviceEndpointInterface) throws ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("PonServiceFacadeImpl".equals(inputPortName)) {
            return getPonServiceFacadeImpl();
        } else {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public QName getServiceName() {
        return new QName("http://pon.wsb.jsuws.cmiot.com", "PonServiceFacadeImplService");
    }

    private HashSet ports = null;

    public Iterator getPorts() {
        if (ports == null) {
            ports = new HashSet();
            ports.add(new QName("http://pon.wsb.jsuws.cmiot.com", "PonServiceFacadeImpl"));
        }
        return ports.iterator();
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(String portName, String address) throws ServiceException {

        if ("PonServiceFacadeImpl".equals(portName)) {
            setPonServiceFacadeImplEndpointAddress(address);
        } else { // Unknown Port Name
            throw new ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(QName portName, String address) throws ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
