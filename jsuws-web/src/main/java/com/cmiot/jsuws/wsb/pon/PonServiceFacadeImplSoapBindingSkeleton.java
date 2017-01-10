/**
 * PonServiceFacadeImplSoapBindingSkeleton.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.wsb.pon;

import com.cmiot.jsuws.facade.pon.model.PonActRequest;
import com.cmiot.jsuws.facade.pon.model.PonActResponse;
import org.apache.axis.description.FaultDesc;
import org.apache.axis.description.OperationDesc;
import org.apache.axis.description.ParameterDesc;
import org.apache.axis.wsdl.Skeleton;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PonServiceFacadeImplSoapBindingSkeleton implements PonServiceFacadeImpl, Skeleton {
    private PonServiceFacadeImpl impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
     * Returns List of OperationDesc objects with this name
     */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List) _myOperations.get(methodName);
    }

    /**
     * Returns Collection of OperationDescs
     */
    public static Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        OperationDesc _oper;
        FaultDesc _fault;
        ParameterDesc[] _params;
        _params = new ParameterDesc[]{
                new ParameterDesc(new javax.xml.namespace.QName("http://pon.wsb.jsuws.cmiot.com", "ponActRequest"), ParameterDesc.IN, new javax.xml.namespace.QName("http://model.pon.facade.jsuws.cmiot.com", "PonActRequest"), PonActRequest.class, false, false),
        };
        _oper = new OperationDesc("ponActToCms", _params, new javax.xml.namespace.QName("http://pon.wsb.jsuws.cmiot.com", "PonActToCmsReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://model.pon.facade.jsuws.cmiot.com", "PonActResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://pon.wsb.jsuws.cmiot.com", "PonActToCms"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("ponActToCms") == null) {
            _myOperations.put("ponActToCms", new ArrayList());
        }
        ((List) _myOperations.get("ponActToCms")).add(_oper);
    }

    public PonServiceFacadeImplSoapBindingSkeleton() {
        this.impl = new PonServiceFacadeImplSoapBindingImpl();
    }

    public PonServiceFacadeImplSoapBindingSkeleton(PonServiceFacadeImpl impl) {
        this.impl = impl;
    }

    public PonActResponse ponActToCms(PonActRequest ponActRequest) throws RemoteException {
        PonActResponse ret = impl.ponActToCms(ponActRequest);
        return ret;
    }

}
