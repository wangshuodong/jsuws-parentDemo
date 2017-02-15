/**
 * ItmsOrderInterfaceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.wsb.cms;

public class ItmsOrderInterfaceServiceLocator extends org.apache.axis.client.Service implements ItmsOrderInterfaceService {

    public ItmsOrderInterfaceServiceLocator() {
    }


    public ItmsOrderInterfaceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ItmsOrderInterfaceServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for OperationDistributeService
    private String OperationDistributeService_address = "http://10.40.103.46:6482/NorthInterface/services/OperationDistributeService";

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

    public ItmsOrderInterface getOperationDistributeService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(OperationDistributeService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOperationDistributeService(endpoint);
    }

    public ItmsOrderInterface getOperationDistributeService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            OperationDistributeServiceSoapBindingStub _stub = new OperationDistributeServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getOperationDistributeServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
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
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ItmsOrderInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                OperationDistributeServiceSoapBindingStub _stub = new OperationDistributeServiceSoapBindingStub(new java.net.URL(OperationDistributeService_address), this);
                _stub.setPortName(getOperationDistributeServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("OperationDistributeService".equals(inputPortName)) {
            return getOperationDistributeService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://10.40.103.46:6482/NorthInterface/services/OperationDistributeService", "ItmsOrderInterfaceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://10.40.103.46:6482/NorthInterface/services/OperationDistributeService", "OperationDistributeService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("OperationDistributeService".equals(portName)) {
            setOperationDistributeServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
