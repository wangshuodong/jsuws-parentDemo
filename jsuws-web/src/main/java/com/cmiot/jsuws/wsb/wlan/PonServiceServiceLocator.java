/**
 * PonServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.wsb.wlan;

import org.apache.axis.EngineConfiguration;
import org.apache.axis.client.Service;
import org.apache.axis.client.Stub;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;
import java.rmi.Remote;

public class PonServiceServiceLocator extends Service implements PonServiceService {

    public PonServiceServiceLocator() {
    }


    public PonServiceServiceLocator(EngineConfiguration config) {
        super(config);
    }

    public PonServiceServiceLocator(String wsdlLoc, QName sName) throws ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PonService
    private String PonService_address = "http://183.207.194.218:6482/NorthInterface/services/PonService";

    public String getPonServiceAddress() {
        return PonService_address;
    }

    // The WSDD service name defaults to the port name.
    private String PonServiceWSDDServiceName = "PonService";

    public String getPonServiceWSDDServiceName() {
        return PonServiceWSDDServiceName;
    }

    public void setPonServiceWSDDServiceName(String name) {
        PonServiceWSDDServiceName = name;
    }

    public PonService getPonService() throws ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PonService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPonService(endpoint);
    }

    public PonService getPonService(java.net.URL portAddress) throws ServiceException {
        try {
            PonServiceSoapBindingStub _stub = new PonServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPonServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPonServiceEndpointAddress(String address) {
        PonService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public Remote getPort(Class serviceEndpointInterface) throws ServiceException {
        try {
            if (PonService.class.isAssignableFrom(serviceEndpointInterface)) {
                PonServiceSoapBindingStub _stub = new PonServiceSoapBindingStub(new java.net.URL(PonService_address), this);
                _stub.setPortName(getPonServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new ServiceException(t);
        }
        throw new ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("PonService".equals(inputPortName)) {
            return getPonService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public QName getServiceName() {
        return new QName("http://183.207.194.218:6482/NorthInterface/services/PonService", "PonServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new QName("http://183.207.194.218:6482/NorthInterface/services/PonService", "PonService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws ServiceException {
        
if ("PonService".equals(portName)) {
            setPonServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
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
