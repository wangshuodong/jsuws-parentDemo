/**
 * AMSServiceSoapBindingSkeleton.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.wsb.ams;

import com.cmiot.jsuws.facade.ams.model.*;
import org.apache.axis.description.FaultDesc;
import org.apache.axis.description.OperationDesc;
import org.apache.axis.description.ParameterDesc;

import javax.xml.namespace.QName;
import java.rmi.RemoteException;
import java.util.*;

public class AMSServiceSoapBindingSkeleton implements AMSService, org.apache.axis.wsdl.Skeleton {
    private AMSService impl;
    private static Map _myOperations = new Hashtable();
    private static Collection _myOperationsList = new ArrayList();

    /**
     * Returns List of OperationDesc objects with this name
     */
    public static List getOperationDescByName(String methodName) {
        return (List) _myOperations.get(methodName);
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
                new ParameterDesc(new QName("", "parameters"), ParameterDesc.IN, new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "ReplaceDeviceRequest"), ReplaceDeviceRequest.class, false, false),
        };
        _oper = new OperationDesc("replaceDevice", _params, new QName("", "replaceDeviceReturn"));
        _oper.setReturnType(new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "ReplaceDeviceResponse"));
        _oper.setElementQName(new QName("http://ams.itms.zznode.com", "replaceDevice"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("replaceDevice") == null) {
            _myOperations.put("replaceDevice", new ArrayList());
        }
        ((List) _myOperations.get("replaceDevice")).add(_oper);
        _params = new ParameterDesc[]{
                new ParameterDesc(new QName("", "parameters"), ParameterDesc.IN, new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "QueryOrderRequest"), QueryOrderRequest.class, false, false),
        };
        _oper = new OperationDesc("queryOrder", _params, new QName("", "queryOrderReturn"));
        _oper.setReturnType(new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "QueryOrderResponse"));
        _oper.setElementQName(new QName("http://ams.itms.zznode.com", "queryOrder"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("queryOrder") == null) {
            _myOperations.put("queryOrder", new ArrayList());
        }
        ((List) _myOperations.get("queryOrder")).add(_oper);
        _params = new ParameterDesc[]{
                new ParameterDesc(new QName("", "parameters"), ParameterDesc.IN, new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "QueryDeviceByLoidRequest"), QueryDeviceByLoidRequest.class, false, false),
        };
        _oper = new OperationDesc("queryDeviceByLoid", _params, new QName("", "queryDeviceByLoidReturn"));
        _oper.setReturnType(new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "QueryDeviceByLoidResponse"));
        _oper.setElementQName(new QName("http://ams.itms.zznode.com", "queryDeviceByLoid"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("queryDeviceByLoid") == null) {
            _myOperations.put("queryDeviceByLoid", new ArrayList());
        }
        ((List) _myOperations.get("queryDeviceByLoid")).add(_oper);
        _params = new ParameterDesc[]{
                new ParameterDesc(new QName("", "parameters"), ParameterDesc.IN, new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "QueryDeviceBySNRequest"), QueryDeviceBySNRequest.class, false, false),
        };
        _oper = new OperationDesc("queryDeviceBySN", _params, new QName("", "queryDeviceBySNReturn"));
        _oper.setReturnType(new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "QueryDeviceBySNResponse"));
        _oper.setElementQName(new QName("http://ams.itms.zznode.com", "queryDeviceBySN"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("queryDeviceBySN") == null) {
            _myOperations.put("queryDeviceBySN", new ArrayList());
        }
        ((List) _myOperations.get("queryDeviceBySN")).add(_oper);
        _params = new ParameterDesc[]{
                new ParameterDesc(new QName("", "parameters"), ParameterDesc.IN, new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "QueryDevicePasswordRequest"), QueryDevicePasswordRequest.class, false, false),
        };
        _oper = new OperationDesc("queryDevicePassword", _params, new QName("", "queryDevicePasswordReturn"));
        _oper.setReturnType(new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "QueryDevicePasswordResponse"));
        _oper.setElementQName(new QName("http://ams.itms.zznode.com", "queryDevicePassword"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("queryDevicePassword") == null) {
            _myOperations.put("queryDevicePassword", new ArrayList());
        }
        ((List) _myOperations.get("queryDevicePassword")).add(_oper);
        _params = new ParameterDesc[]{
                new ParameterDesc(new QName("", "parameters"), ParameterDesc.IN, new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "QueryServiceStatusRequest"), QueryServiceStatusRequest.class, false, false),
        };
        _oper = new OperationDesc("queryServiceStatus", _params, new QName("", "queryServiceStatusReturn"));
        _oper.setReturnType(new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "QueryServiceStatusResponse"));
        _oper.setElementQName(new QName("http://ams.itms.zznode.com", "queryServiceStatus"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("queryServiceStatus") == null) {
            _myOperations.put("queryServiceStatus", new ArrayList());
        }
        ((List) _myOperations.get("queryServiceStatus")).add(_oper);
        _params = new ParameterDesc[]{
                new ParameterDesc(new QName("", "parameters"), ParameterDesc.IN, new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "DeviceByHandRequest"), DeviceByHandRequest.class, false, false),
        };
        _oper = new OperationDesc("deviceByHand", _params, new QName("", "deviceByHandReturn"));
        _oper.setReturnType(new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "DeviceByHandResponse"));
        _oper.setElementQName(new QName("http://ams.itms.zznode.com", "deviceByHand"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deviceByHand") == null) {
            _myOperations.put("deviceByHand", new ArrayList());
        }
        ((List) _myOperations.get("deviceByHand")).add(_oper);
        _params = new ParameterDesc[]{
                new ParameterDesc(new QName("", "parameters"), ParameterDesc.IN, new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "SendImplementedInfoRequest"), SendImplementedInfoRequest.class, false, false),
        };
        _oper = new OperationDesc("sendImplementedInfo", _params, new QName("", "sendImplementedInfoReturn"));
        _oper.setReturnType(new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "SendImplementedInfoResponse"));
        _oper.setElementQName(new QName("http://ams.itms.zznode.com", "sendImplementedInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("sendImplementedInfo") == null) {
            _myOperations.put("sendImplementedInfo", new ArrayList());
        }
        ((List) _myOperations.get("sendImplementedInfo")).add(_oper);
        _params = new ParameterDesc[]{
                new ParameterDesc(new QName("", "parameters"), ParameterDesc.IN, new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "ResetServicesRequest"), ResetServicesRequest.class, false, false),
        };
        _oper = new OperationDesc("resetServices", _params, new QName("", "resetServicesReturn"));
        _oper.setReturnType(new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "ResetServicesResponse"));
        _oper.setElementQName(new QName("http://ams.itms.zznode.com", "resetServices"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("resetServices") == null) {
            _myOperations.put("resetServices", new ArrayList());
        }
        ((List) _myOperations.get("resetServices")).add(_oper);
        _params = new ParameterDesc[]{
                new ParameterDesc(new QName("", "parameters"), ParameterDesc.IN, new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "ResetDeviceRequest"), ResetDeviceRequest.class, false, false),
        };
        _oper = new OperationDesc("resetDevice", _params, new QName("", "resetDeviceReturn"));
        _oper.setReturnType(new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "ResetDeviceResponse"));
        _oper.setElementQName(new QName("http://ams.itms.zznode.com", "resetDevice"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("resetDevice") == null) {
            _myOperations.put("resetDevice", new ArrayList());
        }
        ((List) _myOperations.get("resetDevice")).add(_oper);
        _params = new ParameterDesc[]{
                new ParameterDesc(new QName("", "parameters"), ParameterDesc.IN, new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "GetRemoteOperationResultRequest"), GetRemoteOperationResultRequest.class, false, false),
        };
        _oper = new OperationDesc("getRemoteOperationResult", _params, new QName("", "getRemoteOperationResultReturn"));
        _oper.setReturnType(new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "GetRemoteOperationResultResponse"));
        _oper.setElementQName(new QName("http://ams.itms.zznode.com", "getRemoteOperationResult"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getRemoteOperationResult") == null) {
            _myOperations.put("getRemoteOperationResult", new ArrayList());
        }
        ((List) _myOperations.get("getRemoteOperationResult")).add(_oper);
    }

    public AMSServiceSoapBindingSkeleton() {
        this.impl = new AMSServiceSoapBindingImpl();
    }

    public AMSServiceSoapBindingSkeleton(AMSService impl) {
        this.impl = impl;
    }

    public ReplaceDeviceResponse replaceDevice(ReplaceDeviceRequest parameters) throws RemoteException {
        ReplaceDeviceResponse ret = impl.replaceDevice(parameters);
        return ret;
    }

    public QueryOrderResponse queryOrder(QueryOrderRequest parameters) throws RemoteException {
        QueryOrderResponse ret = impl.queryOrder(parameters);
        return ret;
    }

    public QueryDeviceByLoidResponse queryDeviceByLoid(QueryDeviceByLoidRequest parameters) throws RemoteException {
        QueryDeviceByLoidResponse ret = impl.queryDeviceByLoid(parameters);
        return ret;
    }

    public QueryDeviceBySNResponse queryDeviceBySN(QueryDeviceBySNRequest parameters) throws RemoteException {
        QueryDeviceBySNResponse ret = impl.queryDeviceBySN(parameters);
        return ret;
    }

    public QueryDevicePasswordResponse queryDevicePassword(QueryDevicePasswordRequest parameters) throws RemoteException {
        QueryDevicePasswordResponse ret = impl.queryDevicePassword(parameters);
        return ret;
    }

    public QueryServiceStatusResponse queryServiceStatus(QueryServiceStatusRequest parameters) throws RemoteException {
        QueryServiceStatusResponse ret = impl.queryServiceStatus(parameters);
        return ret;
    }

    public DeviceByHandResponse deviceByHand(DeviceByHandRequest parameters) throws RemoteException {
        DeviceByHandResponse ret = impl.deviceByHand(parameters);
        return ret;
    }

    public SendImplementedInfoResponse sendImplementedInfo(SendImplementedInfoRequest parameters) throws RemoteException {
        SendImplementedInfoResponse ret = impl.sendImplementedInfo(parameters);
        return ret;
    }

    public ResetServicesResponse resetServices(ResetServicesRequest parameters) throws RemoteException {
        ResetServicesResponse ret = impl.resetServices(parameters);
        return ret;
    }

    public ResetDeviceResponse resetDevice(ResetDeviceRequest parameters) throws RemoteException {
        ResetDeviceResponse ret = impl.resetDevice(parameters);
        return ret;
    }

    public GetRemoteOperationResultResponse getRemoteOperationResult(GetRemoteOperationResultRequest parameters) throws RemoteException {
        GetRemoteOperationResultResponse ret = impl.getRemoteOperationResult(parameters);
        return ret;
    }

}
