/**
 * AMSServiceSoapBindingStub.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.wsb.ams;


import com.cmiot.jsuws.facade.ams.model.*;
import org.apache.axis.AxisFault;
import org.apache.axis.Constants;
import org.apache.axis.NoEndPointException;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.client.Stub;
import org.apache.axis.constants.Style;
import org.apache.axis.constants.Use;
import org.apache.axis.description.OperationDesc;
import org.apache.axis.description.ParameterDesc;
import org.apache.axis.encoding.DeserializerFactory;
import org.apache.axis.encoding.SerializerFactory;
import org.apache.axis.encoding.ser.*;
import org.apache.axis.soap.SOAPConstants;
import org.apache.axis.utils.JavaUtils;

import javax.xml.namespace.QName;
import java.rmi.RemoteException;
import java.util.Enumeration;
import java.util.Vector;

public class AMSServiceSoapBindingStub extends Stub implements AMSService {
    private Vector cachedSerClasses = new Vector();
    private Vector cachedSerQNames = new Vector();
    private Vector cachedSerFactories = new Vector();
    private Vector cachedDeserFactories = new Vector();

    static OperationDesc[] _operations;

    static {
        _operations = new OperationDesc[11];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1() {
        OperationDesc oper;
        ParameterDesc param;
        oper = new OperationDesc();
        oper.setName("replaceDevice");
        param = new ParameterDesc(new QName("", "parameters"), ParameterDesc.IN, new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "ReplaceDeviceRequest"), ReplaceDeviceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "ReplaceDeviceResponse"));
        oper.setReturnClass(ReplaceDeviceResponse.class);
        oper.setReturnQName(new QName("", "replaceDeviceReturn"));
        oper.setStyle(Style.RPC);
        oper.setUse(Use.ENCODED);
        _operations[0] = oper;

        oper = new OperationDesc();
        oper.setName("queryOrder");
        param = new ParameterDesc(new QName("", "parameters"), ParameterDesc.IN, new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "QueryOrderRequest"), QueryOrderRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "QueryOrderResponse"));
        oper.setReturnClass(QueryOrderResponse.class);
        oper.setReturnQName(new QName("", "queryOrderReturn"));
        oper.setStyle(Style.RPC);
        oper.setUse(Use.ENCODED);
        _operations[1] = oper;

        oper = new OperationDesc();
        oper.setName("queryDeviceByLoid");
        param = new ParameterDesc(new QName("", "parameters"), ParameterDesc.IN, new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "QueryDeviceByLoidRequest"), QueryDeviceByLoidRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "QueryDeviceByLoidResponse"));
        oper.setReturnClass(QueryDeviceByLoidResponse.class);
        oper.setReturnQName(new QName("", "queryDeviceByLoidReturn"));
        oper.setStyle(Style.RPC);
        oper.setUse(Use.ENCODED);
        _operations[2] = oper;

        oper = new OperationDesc();
        oper.setName("queryDeviceBySN");
        param = new ParameterDesc(new QName("", "parameters"), ParameterDesc.IN, new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "QueryDeviceBySNRequest"), QueryDeviceBySNRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "QueryDeviceBySNResponse"));
        oper.setReturnClass(QueryDeviceBySNResponse.class);
        oper.setReturnQName(new QName("", "queryDeviceBySNReturn"));
        oper.setStyle(Style.RPC);
        oper.setUse(Use.ENCODED);
        _operations[3] = oper;

        oper = new OperationDesc();
        oper.setName("queryDevicePassword");
        param = new ParameterDesc(new QName("", "parameters"), ParameterDesc.IN, new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "QueryDevicePasswordRequest"), QueryDevicePasswordRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "QueryDevicePasswordResponse"));
        oper.setReturnClass(QueryDevicePasswordResponse.class);
        oper.setReturnQName(new QName("", "queryDevicePasswordReturn"));
        oper.setStyle(Style.RPC);
        oper.setUse(Use.ENCODED);
        _operations[4] = oper;

        oper = new OperationDesc();
        oper.setName("queryServiceStatus");
        param = new ParameterDesc(new QName("", "parameters"), ParameterDesc.IN, new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "QueryServiceStatusRequest"), QueryServiceStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "QueryServiceStatusResponse"));
        oper.setReturnClass(QueryServiceStatusResponse.class);
        oper.setReturnQName(new QName("", "queryServiceStatusReturn"));
        oper.setStyle(Style.RPC);
        oper.setUse(Use.ENCODED);
        _operations[5] = oper;

        oper = new OperationDesc();
        oper.setName("deviceByHand");
        param = new ParameterDesc(new QName("", "parameters"), ParameterDesc.IN, new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "DeviceByHandRequest"), DeviceByHandRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "DeviceByHandResponse"));
        oper.setReturnClass(DeviceByHandResponse.class);
        oper.setReturnQName(new QName("", "deviceByHandReturn"));
        oper.setStyle(Style.RPC);
        oper.setUse(Use.ENCODED);
        _operations[6] = oper;

        oper = new OperationDesc();
        oper.setName("sendImplementedInfo");
        param = new ParameterDesc(new QName("", "parameters"), ParameterDesc.IN, new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "SendImplementedInfoRequest"), SendImplementedInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "SendImplementedInfoResponse"));
        oper.setReturnClass(SendImplementedInfoResponse.class);
        oper.setReturnQName(new QName("", "sendImplementedInfoReturn"));
        oper.setStyle(Style.RPC);
        oper.setUse(Use.ENCODED);
        _operations[7] = oper;

        oper = new OperationDesc();
        oper.setName("resetServices");
        param = new ParameterDesc(new QName("", "parameters"), ParameterDesc.IN, new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "ResetServicesRequest"), ResetServicesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "ResetServicesResponse"));
        oper.setReturnClass(ResetServicesResponse.class);
        oper.setReturnQName(new QName("", "resetServicesReturn"));
        oper.setStyle(Style.RPC);
        oper.setUse(Use.ENCODED);
        _operations[8] = oper;

        oper = new OperationDesc();
        oper.setName("resetDevice");
        param = new ParameterDesc(new QName("", "parameters"), ParameterDesc.IN, new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "ResetDeviceRequest"), ResetDeviceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "ResetDeviceResponse"));
        oper.setReturnClass(ResetDeviceResponse.class);
        oper.setReturnQName(new QName("", "resetDeviceReturn"));
        oper.setStyle(Style.RPC);
        oper.setUse(Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2() {
        OperationDesc oper;
        ParameterDesc param;
        oper = new OperationDesc();
        oper.setName("getRemoteOperationResult");
        param = new ParameterDesc(new QName("", "parameters"), ParameterDesc.IN, new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "GetRemoteOperationResultRequest"), GetRemoteOperationResultRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "GetRemoteOperationResultResponse"));
        oper.setReturnClass(GetRemoteOperationResultResponse.class);
        oper.setReturnQName(new QName("", "getRemoteOperationResultReturn"));
        oper.setStyle(Style.RPC);
        oper.setUse(Use.ENCODED);
        _operations[10] = oper;

    }

    public AMSServiceSoapBindingStub() throws AxisFault {
        this(null);
    }

    public AMSServiceSoapBindingStub(java.net.URL endpointURL, Service service) throws AxisFault {
        this(service);
        super.cachedEndpoint = endpointURL;
    }

    public AMSServiceSoapBindingStub(Service service) throws AxisFault {
        if (service == null) {
            super.service = new Service();
        } else {
            super.service = service;
        }
        ((Service) super.service).setTypeMappingVersion("1.2");
        Class cls;
        QName qName;
        QName qName2;
        Class beansf = BeanSerializerFactory.class;
        Class beandf = BeanDeserializerFactory.class;
        Class enumsf = EnumSerializerFactory.class;
        Class enumdf = EnumDeserializerFactory.class;
        Class arraysf = ArraySerializerFactory.class;
        Class arraydf = ArrayDeserializerFactory.class;
        Class simplesf = SimpleSerializerFactory.class;
        Class simpledf = SimpleDeserializerFactory.class;
        Class simplelistsf = SimpleListSerializerFactory.class;
        Class simplelistdf = SimpleListDeserializerFactory.class;
        qName = new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "DeviceByHandRequest");
        cachedSerQNames.add(qName);
        cls = DeviceByHandRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "DeviceByHandResponse");
        cachedSerQNames.add(qName);
        cls = DeviceByHandResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "GetRemoteOperationResultRequest");
        cachedSerQNames.add(qName);
        cls = GetRemoteOperationResultRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "GetRemoteOperationResultResponse");
        cachedSerQNames.add(qName);
        cls = GetRemoteOperationResultResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "QueryDeviceByLoidRequest");
        cachedSerQNames.add(qName);
        cls = QueryDeviceByLoidRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "QueryDeviceByLoidResponse");
        cachedSerQNames.add(qName);
        cls = QueryDeviceByLoidResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "QueryDeviceBySNRequest");
        cachedSerQNames.add(qName);
        cls = QueryDeviceBySNRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "QueryDeviceBySNResponse");
        cachedSerQNames.add(qName);
        cls = QueryDeviceBySNResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "QueryDevicePasswordRequest");
        cachedSerQNames.add(qName);
        cls = QueryDevicePasswordRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "QueryDevicePasswordResponse");
        cachedSerQNames.add(qName);
        cls = QueryDevicePasswordResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "QueryOrderRequest");
        cachedSerQNames.add(qName);
        cls = QueryOrderRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "QueryOrderResponse");
        cachedSerQNames.add(qName);
        cls = QueryOrderResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "QueryOrderResponseOrderList");
        cachedSerQNames.add(qName);
        cls = QueryOrderResponseOrderList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "QueryServiceStatusRequest");
        cachedSerQNames.add(qName);
        cls = QueryServiceStatusRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "QueryServiceStatusResponse");
        cachedSerQNames.add(qName);
        cls = QueryServiceStatusResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "QueryServiceStatusResponseServiceList");
        cachedSerQNames.add(qName);
        cls = QueryServiceStatusResponseServiceList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "ReplaceDeviceRequest");
        cachedSerQNames.add(qName);
        cls = ReplaceDeviceRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "ReplaceDeviceResponse");
        cachedSerQNames.add(qName);
        cls = ReplaceDeviceResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "ReplaceDeviceResponseServiceCodeList");
        cachedSerQNames.add(qName);
        cls = ReplaceDeviceResponseServiceCodeList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "ResetDeviceRequest");
        cachedSerQNames.add(qName);
        cls = ResetDeviceRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "ResetDeviceResponse");
        cachedSerQNames.add(qName);
        cls = ResetDeviceResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "ResetServicesRequest");
        cachedSerQNames.add(qName);
        cls = ResetServicesRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "ResetServicesResponse");
        cachedSerQNames.add(qName);
        cls = ResetServicesResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "ResetServicesResponseServiceCodeList");
        cachedSerQNames.add(qName);
        cls = ResetServicesResponseServiceCodeList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "SendImplementedInfoRequest");
        cachedSerQNames.add(qName);
        cls = SendImplementedInfoRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "SendImplementedInfoRequestServiceCodeList");
        cachedSerQNames.add(qName);
        cls = SendImplementedInfoRequestServiceCodeList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://10.40.103.47:5482/NorthInterface/services/AMSService", "SendImplementedInfoResponse");
        cachedSerQNames.add(qName);
        cls = SendImplementedInfoResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

    }

    protected Call createCall() throws RemoteException {
        try {
            Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                String key = (String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        Class cls = (Class) cachedSerClasses.get(i);
                        QName qName =
                                (QName) cachedSerQNames.get(i);
                        Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            Class sf = (Class)
                                    cachedSerFactories.get(i);
                            Class df = (Class)
                                    cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        } else if (x instanceof SerializerFactory) {
                            SerializerFactory sf = (SerializerFactory)
                                    cachedSerFactories.get(i);
                            DeserializerFactory df = (DeserializerFactory)
                                    cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        } catch (Throwable _t) {
            throw new AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public ReplaceDeviceResponse replaceDevice(ReplaceDeviceRequest parameters) throws RemoteException {
        if (super.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://ams.itms.zznode.com", "replaceDevice"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{parameters});

            if (_resp instanceof RemoteException) {
                throw (RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (ReplaceDeviceResponse) _resp;
                } catch (Exception _exception) {
                    return (ReplaceDeviceResponse) JavaUtils.convert(_resp, ReplaceDeviceResponse.class);
                }
            }
        } catch (AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public QueryOrderResponse queryOrder(QueryOrderRequest parameters) throws RemoteException {
        if (super.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://ams.itms.zznode.com", "queryOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{parameters});

            if (_resp instanceof RemoteException) {
                throw (RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (QueryOrderResponse) _resp;
                } catch (Exception _exception) {
                    return (QueryOrderResponse) JavaUtils.convert(_resp, QueryOrderResponse.class);
                }
            }
        } catch (AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public QueryDeviceByLoidResponse queryDeviceByLoid(QueryDeviceByLoidRequest parameters) throws RemoteException {
        if (super.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://ams.itms.zznode.com", "queryDeviceByLoid"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{parameters});

            if (_resp instanceof RemoteException) {
                throw (RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (QueryDeviceByLoidResponse) _resp;
                } catch (Exception _exception) {
                    return (QueryDeviceByLoidResponse) JavaUtils.convert(_resp, QueryDeviceByLoidResponse.class);
                }
            }
        } catch (AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public QueryDeviceBySNResponse queryDeviceBySN(QueryDeviceBySNRequest parameters) throws RemoteException {
        if (super.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://ams.itms.zznode.com", "queryDeviceBySN"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{parameters});

            if (_resp instanceof RemoteException) {
                throw (RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (QueryDeviceBySNResponse) _resp;
                } catch (Exception _exception) {
                    return (QueryDeviceBySNResponse) JavaUtils.convert(_resp, QueryDeviceBySNResponse.class);
                }
            }
        } catch (AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public QueryDevicePasswordResponse queryDevicePassword(QueryDevicePasswordRequest parameters) throws RemoteException {
        if (super.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://ams.itms.zznode.com", "queryDevicePassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{parameters});

            if (_resp instanceof RemoteException) {
                throw (RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (QueryDevicePasswordResponse) _resp;
                } catch (Exception _exception) {
                    return (QueryDevicePasswordResponse) JavaUtils.convert(_resp, QueryDevicePasswordResponse.class);
                }
            }
        } catch (AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public QueryServiceStatusResponse queryServiceStatus(QueryServiceStatusRequest parameters) throws RemoteException {
        if (super.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://ams.itms.zznode.com", "queryServiceStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{parameters});

            if (_resp instanceof RemoteException) {
                throw (RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (QueryServiceStatusResponse) _resp;
                } catch (Exception _exception) {
                    return (QueryServiceStatusResponse) JavaUtils.convert(_resp, QueryServiceStatusResponse.class);
                }
            }
        } catch (AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public DeviceByHandResponse deviceByHand(DeviceByHandRequest parameters) throws RemoteException {
        if (super.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://ams.itms.zznode.com", "deviceByHand"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{parameters});

            if (_resp instanceof RemoteException) {
                throw (RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (DeviceByHandResponse) _resp;
                } catch (Exception _exception) {
                    return (DeviceByHandResponse) JavaUtils.convert(_resp, DeviceByHandResponse.class);
                }
            }
        } catch (AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public SendImplementedInfoResponse sendImplementedInfo(SendImplementedInfoRequest parameters) throws RemoteException {
        if (super.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://ams.itms.zznode.com", "sendImplementedInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{parameters});

            if (_resp instanceof RemoteException) {
                throw (RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (SendImplementedInfoResponse) _resp;
                } catch (Exception _exception) {
                    return (SendImplementedInfoResponse) JavaUtils.convert(_resp, SendImplementedInfoResponse.class);
                }
            }
        } catch (AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public ResetServicesResponse resetServices(ResetServicesRequest parameters) throws RemoteException {
        if (super.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://ams.itms.zznode.com", "resetServices"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{parameters});

            if (_resp instanceof RemoteException) {
                throw (RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (ResetServicesResponse) _resp;
                } catch (Exception _exception) {
                    return (ResetServicesResponse) JavaUtils.convert(_resp, ResetServicesResponse.class);
                }
            }
        } catch (AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public ResetDeviceResponse resetDevice(ResetDeviceRequest parameters) throws RemoteException {
        if (super.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://ams.itms.zznode.com", "resetDevice"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{parameters});

            if (_resp instanceof RemoteException) {
                throw (RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (ResetDeviceResponse) _resp;
                } catch (Exception _exception) {
                    return (ResetDeviceResponse) JavaUtils.convert(_resp, ResetDeviceResponse.class);
                }
            }
        } catch (AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public GetRemoteOperationResultResponse getRemoteOperationResult(GetRemoteOperationResultRequest parameters) throws RemoteException {
        if (super.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://ams.itms.zznode.com", "getRemoteOperationResult"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{parameters});

            if (_resp instanceof RemoteException) {
                throw (RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (GetRemoteOperationResultResponse) _resp;
                } catch (Exception _exception) {
                    return (GetRemoteOperationResultResponse) JavaUtils.convert(_resp, GetRemoteOperationResultResponse.class);
                }
            }
        } catch (AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

}
