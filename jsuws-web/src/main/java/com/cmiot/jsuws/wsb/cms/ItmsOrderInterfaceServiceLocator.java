/**
 * ItmsOrderInterfaceServiceLocator.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.wsb.cms;

import org.apache.axis.client.Service;
import org.apache.axis.client.Stub;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;
import java.net.URL;

public class ItmsOrderInterfaceServiceLocator extends Service implements ItmsOrderInterfaceService {

    public ItmsOrderInterfaceServiceLocator() {
    }


    public ItmsOrderInterfaceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ItmsOrderInterfaceServiceLocator(String wsdlLoc, QName sName) throws ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for OperationDistributeService
    private String OperationDistributeService_address = "http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService";

    public String getOperationDistributeServiceAddress() {
        return OperationDistributeService_address;
    }

    // The WSDD service name defaults to the port name.
    private String OperationDistributeServiceWSDDServiceName = "OperationDistributeService";

    public String getOperationDistributeServiceWSDDServiceName() {
        return OperationDistributeServiceWSDDServiceName;
    }

    public void setOperationDistributeServiceWSDDServiceName(String name) {
        OperationDistributeServiceWSDDServiceName = name;
    }

    public ItmsOrderInterface getOperationDistributeService() throws ServiceException {
        URL endpoint;
        try {
            endpoint = new URL(OperationDistributeService_address);
        } catch (MalformedURLException e) {
            throw new ServiceException(e);
        }
        return getOperationDistributeService(endpoint);
    }

    public ItmsOrderInterface getOperationDistributeService(URL portAddress) throws ServiceException {
        try {
            OperationDistributeServiceSoapBindingStub _stub = new OperationDistributeServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getOperationDistributeServiceWSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOperationDistributeServiceEndpointAddress(String address) {
        OperationDistributeService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws ServiceException {
        try {
            if (ItmsOrderInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                OperationDistributeServiceSoapBindingStub _stub = new OperationDistributeServiceSoapBindingStub(new URL(OperationDistributeService_address), this);
                _stub.setPortName(getOperationDistributeServiceWSDDServiceName());
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
        if ("OperationDistributeService".equals(inputPortName)) {
            return getOperationDistributeService();
        } else {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public QName getServiceName() {
        return new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "ItmsOrderInterfaceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "OperationDistributeService"));
        }
        return ports.iterator();
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(String portName, String address) throws ServiceException {

        if ("OperationDistributeService".equals(portName)) {
            setOperationDistributeServiceEndpointAddress(address);
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
