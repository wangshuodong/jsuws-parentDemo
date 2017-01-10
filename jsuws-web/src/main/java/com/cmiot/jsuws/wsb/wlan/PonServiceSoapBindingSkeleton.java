/**
 * PonServiceSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.wsb.wlan;

import com.cmiot.jsuws.facade.wlan.model.PonActToCms_request;
import com.cmiot.jsuws.facade.wlan.model.PonActToCms_response;
import org.apache.axis.description.FaultDesc;
import org.apache.axis.description.OperationDesc;
import org.apache.axis.description.ParameterDesc;
import org.apache.axis.wsdl.Skeleton;

import javax.xml.namespace.QName;
import java.rmi.RemoteException;
import java.util.*;

public class PonServiceSoapBindingSkeleton implements PonService, Skeleton {
    private PonService impl;
    private static Map _myOperations = new Hashtable();
    private static Collection _myOperationsList = new ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        OperationDesc _oper;
        FaultDesc _fault;
        ParameterDesc[] _params;
        _params = new ParameterDesc [] {
            new ParameterDesc(new QName("", "Order_Id"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
            new ParameterDesc(new QName("", "Cvlan"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
        };
        _oper = new OperationDesc("update", _params, new QName("", "updateReturn"));
        _oper.setReturnType(new QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        _oper.setElementQName(new QName("http://pon.itms.zznode.com", "update"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("update") == null) {
            _myOperations.put("update", new ArrayList());
        }
        ((List)_myOperations.get("update")).add(_oper);
        _params = new ParameterDesc [] {
            new ParameterDesc(new QName("", "parameters"), ParameterDesc.IN, new QName("http://183.207.194.218:6482/NorthInterface/services/PonService", "PonActToCms_request"), PonActToCms_request.class, false, false),
        };
        _oper = new OperationDesc("ponActToCms", _params, new QName("", "ponActToCmsReturn"));
        _oper.setReturnType(new QName("http://183.207.194.218:6482/NorthInterface/services/PonService", "PonActToCms_response"));
        _oper.setElementQName(new QName("http://pon.itms.zznode.com", "ponActToCms"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("ponActToCms") == null) {
            _myOperations.put("ponActToCms", new ArrayList());
        }
        ((List)_myOperations.get("ponActToCms")).add(_oper);
        _params = new ParameterDesc [] {
            new ParameterDesc(new QName("", "OrderId"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
        };
        _oper = new OperationDesc("selectOrderId", _params, new QName("", "SelectOrderIdReturn"));
        _oper.setReturnType(new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        _oper.setElementQName(new QName("http://pon.itms.zznode.com", "SelectOrderId"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("selectOrderId") == null) {
            _myOperations.put("selectOrderId", new ArrayList());
        }
        ((List)_myOperations.get("selectOrderId")).add(_oper);
        _params = new ParameterDesc [] {
            new ParameterDesc(new QName("", "Order_Id"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
        };
        _oper = new OperationDesc("selectVlan", _params, new QName("", "SelectVlanReturn"));
        _oper.setReturnType(new QName("http://xml.apache.org/xml-soap", "Map"));
        _oper.setElementQName(new QName("http://pon.itms.zznode.com", "SelectVlan"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("selectVlan") == null) {
            _myOperations.put("selectVlan", new ArrayList());
        }
        ((List)_myOperations.get("selectVlan")).add(_oper);
        _params = new ParameterDesc [] {
            new ParameterDesc(new QName("", "Order_Id"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
            new ParameterDesc(new QName("", "SERVICE"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
            new ParameterDesc(new QName("", "SERVICE_ID"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
            new ParameterDesc(new QName("", "SERVICE_FLAG"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
            new ParameterDesc(new QName("", "Cvlan"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
        };
        _oper = new OperationDesc("addVlan", _params, new QName("", "AddVlanReturn"));
        _oper.setReturnType(new QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        _oper.setElementQName(new QName("http://pon.itms.zznode.com", "AddVlan"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("addVlan") == null) {
            _myOperations.put("addVlan", new ArrayList());
        }
        ((List)_myOperations.get("addVlan")).add(_oper);
    }

    public PonServiceSoapBindingSkeleton() {
        this.impl = new PonServiceSoapBindingImpl();
    }

    public PonServiceSoapBindingSkeleton(PonService impl) {
        this.impl = impl;
    }
    public Boolean update(String order_Id, String cvlan) throws RemoteException
    {
        Boolean ret = impl.update(order_Id, cvlan);
        return ret;
    }

    public PonActToCms_response ponActToCms(PonActToCms_request parameters) throws RemoteException
    {
        PonActToCms_response ret = impl.ponActToCms(parameters);
        return ret;
    }

    public String selectOrderId(String orderId) throws RemoteException
    {
        String ret = impl.selectOrderId(orderId);
        return ret;
    }

    public HashMap selectVlan(String order_Id) throws RemoteException
    {
        HashMap ret = impl.selectVlan(order_Id);
        return ret;
    }

    public Boolean addVlan(String order_Id, String SERVICE, String SERVICE_ID, String SERVICE_FLAG, String cvlan) throws RemoteException
    {
        Boolean ret = impl.addVlan(order_Id, SERVICE, SERVICE_ID, SERVICE_FLAG, cvlan);
        return ret;
    }

}
