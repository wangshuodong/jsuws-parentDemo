/**
 * AMSServiceServiceLocator.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.wsb.ams;

import org.apache.axis.client.Service;
import org.apache.axis.client.Stub;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Remote;
import java.util.HashSet;
import java.util.Iterator;

public class AMSServiceServiceLocator extends Service implements AMSServiceService {

    public AMSServiceServiceLocator() {
    }


    public AMSServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AMSServiceServiceLocator(String wsdlLoc, QName sName) throws ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AMSService
    private String AMSService_address = "http://10.40.103.47:5482/NorthInterface/services/AMSService";

    public String getAMSServiceAddress() {
        return AMSService_address;
    }

    // The WSDD service name defaults to the port name.
    private String AMSServiceWSDDServiceName = "AMSService";

    public String getAMSServiceWSDDServiceName() {
        return AMSServiceWSDDServiceName;
    }

    public void setAMSServiceWSDDServiceName(String name) {
        AMSServiceWSDDServiceName = name;
    }

    public AMSService getAMSService() throws ServiceException {
        URL endpoint;
        try {
            endpoint = new URL(AMSService_address);
        } catch (MalformedURLException e) {
            throw new ServiceException(e);
        }
        return getAMSService(endpoint);
    }

    public AMSService getAMSService(URL portAddress) throws ServiceException {
        try {
            AMSServiceSoapBindingStub _stub = new AMSServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getAMSServiceWSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAMSServiceEndpointAddress(String address) {
        AMSService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public Remote getPort(Class serviceEndpointInterface) throws ServiceException {
        try {
            if (AMSService.class.isAssignableFrom(serviceEndpointInterface)) {
                AMSServiceSoapBindingStub _stub = new AMSServiceSoapBindingStub(new URL(AMSService_address), this);
                _stub.setPortName(getAMSServiceWSDDServiceName());
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
    public Remote getPort(QName portName, Class serviceEndpointInterface) throws ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("AMSService".equals(inputPortName)) {
            return getAMSService();
        } else {
            Remote _stub = getPort(serviceEndpointInterface);
            ((Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public QName getServiceName() {
        return new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "AMSServiceService");
    }

    private HashSet ports = null;

    public Iterator getPorts() {
        if (ports == null) {
            ports = new HashSet();
            ports.add(new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "AMSService"));
        }
        return ports.iterator();
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(String portName, String address) throws ServiceException {

        if ("AMSService".equals(portName)) {
            setAMSServiceEndpointAddress(address);
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
