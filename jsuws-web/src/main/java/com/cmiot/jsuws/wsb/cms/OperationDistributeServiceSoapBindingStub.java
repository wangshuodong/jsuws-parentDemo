/**
 * OperationDistributeServiceSoapBindingStub.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.wsb.cms;


import com.cmiot.jsuws.facade.cms.model.*;
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

public class OperationDistributeServiceSoapBindingStub extends Stub implements ItmsOrderInterface {
    private Vector cachedSerClasses = new Vector();
    private Vector cachedSerQNames = new Vector();
    private Vector cachedSerFactories = new Vector();
    private Vector cachedDeserFactories = new Vector();

    static OperationDesc[] _operations;

    static {
        _operations = new OperationDesc[21];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1() {
        OperationDesc oper;
        ParameterDesc param;
        oper = new OperationDesc();
        oper.setName("queryCPEID");
        param = new ParameterDesc(new QName("", "strCPEShortID"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "ArrayOf_soapenc_string"));
        oper.setReturnClass(String[].class);
        oper.setReturnQName(new QName("", "queryCPEIDReturn"));
        oper.setStyle(Style.RPC);
        oper.setUse(Use.ENCODED);
        _operations[0] = oper;

        oper = new OperationDesc();
        oper.setName("queryCpeStatus");
        param = new ParameterDesc(new QName("", "cpeId"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new QName("", "queryCpeStatusReturn"));
        oper.setStyle(Style.RPC);
        oper.setUse(Use.ENCODED);
        _operations[1] = oper;

        oper = new OperationDesc();
        oper.setName("queryCpeStatus");
        param = new ParameterDesc(new QName("", "cpeStatus"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "ArrayOf_soapenc_string"));
        oper.setReturnClass(String[].class);
        oper.setReturnQName(new QName("", "queryCpeStatusReturn"));
        oper.setStyle(Style.RPC);
        oper.setUse(Use.ENCODED);
        _operations[2] = oper;

        oper = new OperationDesc();
        oper.setName("queryOrderStatus");
        param = new ParameterDesc(new QName("", "order_No"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new QName("", "queryOrderStatusReturn"));
        oper.setStyle(Style.RPC);
        oper.setUse(Use.ENCODED);
        _operations[3] = oper;

        oper = new OperationDesc();
        oper.setName("queryOrderStatus");
        param = new ParameterDesc(new QName("", "orderStatus"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "ArrayOf_soapenc_string"));
        oper.setReturnClass(String[].class);
        oper.setReturnQName(new QName("", "queryOrderStatusReturn"));
        oper.setStyle(Style.RPC);
        oper.setUse(Use.ENCODED);
        _operations[4] = oper;

        oper = new OperationDesc();
        oper.setName("queryServiceStatus");
        param = new ParameterDesc(new QName("", "req"), ParameterDesc.IN, new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "ArrayOfServiceStatusReqStruct"), ServiceStatusReqStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "ArrayOfServiceStatusRespStruct"));
        oper.setReturnClass(ServiceStatusRespStruct[].class);
        oper.setReturnQName(new QName("", "queryServiceStatusReturn"));
        oper.setStyle(Style.RPC);
        oper.setUse(Use.ENCODED);
        _operations[5] = oper;

        oper = new OperationDesc();
        oper.setName("dealOrder");
        param = new ParameterDesc(new QName("", "order"), ParameterDesc.IN, new QName("OperationDistributeService", "Order"), Order.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "OrderResponse"));
        oper.setReturnClass(OrderResponse.class);
        oper.setReturnQName(new QName("", "dealOrderReturn"));
        oper.setStyle(Style.RPC);
        oper.setUse(Use.ENCODED);
        _operations[6] = oper;

        oper = new OperationDesc();
        oper.setName("populateOrderServiceStruct");
        param = new ParameterDesc(new QName("", "newServiceCode"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "servName"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "servFlag"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "argsValue"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://order.idl.itms.zznode.com", "OrderServiceStruct"));
        oper.setReturnClass(OrderServiceStruct.class);
        oper.setReturnQName(new QName("", "populateOrderServiceStructReturn"));
        oper.setStyle(Style.RPC);
        oper.setUse(Use.ENCODED);
        _operations[7] = oper;

        oper = new OperationDesc();
        oper.setName("bindInterface");
        param = new ParameterDesc(new QName("", "command"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "cpeId"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "adAccounts"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "nasPortId"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "nasIP"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "areaNum"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "vlanId"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new QName("", "bindInterfaceReturn"));
        oper.setStyle(Style.RPC);
        oper.setUse(Use.ENCODED);
        _operations[8] = oper;

        oper = new OperationDesc();
        oper.setName("createService");
        param = new ParameterDesc(new QName("", "req"), ParameterDesc.IN, new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "CreatServiceReq"), CreatServiceReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new QName("", "createServiceReturn"));
        oper.setStyle(Style.RPC);
        oper.setUse(Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2() {
        OperationDesc oper;
        ParameterDesc param;
        oper = new OperationDesc();
        oper.setName("dealOrderWithReply");
        param = new ParameterDesc(new QName("", "order"), ParameterDesc.IN, new QName("OperationDistributeService", "Order"), Order.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "replyURL"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new QName("", "dealOrderWithReplyReturn"));
        oper.setStyle(Style.RPC);
        oper.setUse(Use.ENCODED);
        _operations[10] = oper;

        oper = new OperationDesc();
        oper.setName("dealOrderWithoutReply");
        param = new ParameterDesc(new QName("", "order"), ParameterDesc.IN, new QName("OperationDistributeService", "Order"), Order.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new QName("", "dealOrderWithoutReplyReturn"));
        oper.setStyle(Style.RPC);
        oper.setUse(Use.ENCODED);
        _operations[11] = oper;

        oper = new OperationDesc();
        oper.setName("getAlarmInformationByTimeSegment");
        param = new ParameterDesc(new QName("", "startTime"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "endTime"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "startAlarmID"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "ArrayOfAlarmStruct"));
        oper.setReturnClass(AlarmStruct[].class);
        oper.setReturnQName(new QName("", "getAlarmInformationByTimeSegmentReturn"));
        oper.setStyle(Style.RPC);
        oper.setUse(Use.ENCODED);
        _operations[12] = oper;

        oper = new OperationDesc();
        oper.setName("getCPEMsg");
        param = new ParameterDesc(new QName("", "seqnbr"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "ID"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "iFlg"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "CPEMsg"));
        oper.setReturnClass(CPEMsg.class);
        oper.setReturnQName(new QName("", "getCPEMsgReturn"));
        oper.setStyle(Style.RPC);
        oper.setUse(Use.ENCODED);
        _operations[13] = oper;

        oper = new OperationDesc();
        oper.setName("queryCpeStatusConfirm");
        param = new ParameterDesc(new QName("", "cpeID"), ParameterDesc.IN, new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "ArrayOf_soapenc_string"), String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new QName("", "queryCpeStatusConfirmReturn"));
        oper.setStyle(Style.RPC);
        oper.setUse(Use.ENCODED);
        _operations[14] = oper;

        oper = new OperationDesc();
        oper.setName("queryOrderStatusConfirm");
        param = new ParameterDesc(new QName("", "orderNO"), ParameterDesc.IN, new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "ArrayOf_soapenc_string"), String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new QName("", "queryOrderStatusConfirmReturn"));
        oper.setStyle(Style.RPC);
        oper.setUse(Use.ENCODED);
        _operations[15] = oper;

        oper = new OperationDesc();
        oper.setName("queryOrderStatusWithReply");
        param = new ParameterDesc(new QName("", "order"), ParameterDesc.IN, new QName("OperationDistributeService", "Order"), Order.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "replyURL"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new QName("", "queryOrderStatusWithReplyReturn"));
        oper.setStyle(Style.RPC);
        oper.setUse(Use.ENCODED);
        _operations[16] = oper;

        oper = new OperationDesc();
        oper.setName("queryUserDetail");
        param = new ParameterDesc(new QName("", "iParaType"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "value"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "ArrayOfUserDetail"));
        oper.setReturnClass(UserDetail[].class);
        oper.setReturnQName(new QName("", "queryUserDetailReturn"));
        oper.setStyle(Style.RPC);
        oper.setUse(Use.ENCODED);
        _operations[17] = oper;

        oper = new OperationDesc();
        oper.setName("routeCPECharge");
        param = new ParameterDesc(new QName("", "prodNo"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "accounts"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "password"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new QName("", "routeCPEChargeReturn"));
        oper.setStyle(Style.RPC);
        oper.setUse(Use.ENCODED);
        _operations[18] = oper;

        oper = new OperationDesc();
        oper.setName("serviceChange");
        param = new ParameterDesc(new QName("", "adAcount"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "LSHNo"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "orderType"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "newPassWord"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new QName("", "serviceChangeReturn"));
        oper.setStyle(Style.RPC);
        oper.setUse(Use.ENCODED);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3() {
        OperationDesc oper;
        ParameterDesc param;
        oper = new OperationDesc();
        oper.setName("truncateString");
        param = new ParameterDesc(new QName("", "str"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new QName("", "truncateStringReturn"));
        oper.setStyle(Style.RPC);
        oper.setUse(Use.ENCODED);
        _operations[20] = oper;

    }

    public OperationDistributeServiceSoapBindingStub() throws AxisFault {
        this(null);
    }

    public OperationDistributeServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws AxisFault {
        this(service);
        super.cachedEndpoint = endpointURL;
    }

    public OperationDistributeServiceSoapBindingStub(javax.xml.rpc.Service service) throws AxisFault {
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
        qName = new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "AlarmStruct");
        cachedSerQNames.add(qName);
        cls = AlarmStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "ArrayOf_soapenc_string");
        cachedSerQNames.add(qName);
        cls = String[].class;
        cachedSerClasses.add(cls);
        qName = new QName("http://schemas.xmlsoap.org/soap/encoding/", "string");
        qName2 = null;
        cachedSerFactories.add(new ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new ArrayDeserializerFactory());

        qName = new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "ArrayOf_xsd_anyType");
        cachedSerQNames.add(qName);
        cls = Object[].class;
        cachedSerClasses.add(cls);
        qName = new QName("http://www.w3.org/2001/XMLSchema", "anyType");
        qName2 = null;
        cachedSerFactories.add(new ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new ArrayDeserializerFactory());

        qName = new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "ArrayOfAlarmStruct");
        cachedSerQNames.add(qName);
        cls = AlarmStruct[].class;
        cachedSerClasses.add(cls);
        qName = new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "AlarmStruct");
        qName2 = null;
        cachedSerFactories.add(new ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new ArrayDeserializerFactory());

        qName = new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "ArrayOfPVCMsg");
        cachedSerQNames.add(qName);
        cls = PVCMsg[].class;
        cachedSerClasses.add(cls);
        qName = new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "PVCMsg");
        qName2 = null;
        cachedSerFactories.add(new ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new ArrayDeserializerFactory());

        qName = new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "ArrayOfServiceStatusReqStruct");
        cachedSerQNames.add(qName);
        cls = ServiceStatusReqStruct[].class;
        cachedSerClasses.add(cls);
        qName = new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "ServiceStatusReqStruct");
        qName2 = null;
        cachedSerFactories.add(new ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new ArrayDeserializerFactory());

        qName = new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "ArrayOfServiceStatusRespStruct");
        cachedSerQNames.add(qName);
        cls = ServiceStatusRespStruct[].class;
        cachedSerClasses.add(cls);
        qName = new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "ServiceStatusRespStruct");
        qName2 = null;
        cachedSerFactories.add(new ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new ArrayDeserializerFactory());

        qName = new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "ArrayOfUserDetail");
        cachedSerQNames.add(qName);
        cls = UserDetail[].class;
        cachedSerClasses.add(cls);
        qName = new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "UserDetail");
        qName2 = null;
        cachedSerFactories.add(new ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new ArrayDeserializerFactory());

        qName = new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "CPEMsg");
        cachedSerQNames.add(qName);
        cls = CPEMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "CreatServiceReq");
        cachedSerQNames.add(qName);
        cls = CreatServiceReq.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "OrderResponse");
        cachedSerQNames.add(qName);
        cls = OrderResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "PVCMsg");
        cachedSerQNames.add(qName);
        cls = PVCMsg.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "ServiceStatusReqStruct");
        cachedSerQNames.add(qName);
        cls = ServiceStatusReqStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "ServiceStatusRespStruct");
        cachedSerQNames.add(qName);
        cls = ServiceStatusRespStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "UserDetail");
        cachedSerQNames.add(qName);
        cls = UserDetail.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://order.idl.itms.zznode.com", "OrderServiceStruct");
        cachedSerQNames.add(qName);
        cls = OrderServiceStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("OperationDistributeService", "DisctsReq");
        cachedSerQNames.add(qName);
        cls = DisctsReq.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("OperationDistributeService", "Order");
        cachedSerQNames.add(qName);
        cls = Order.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("OperationDistributeService", "ParaMeter");
        cachedSerQNames.add(qName);
        cls = ParaMeter.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("OperationDistributeService", "SubServiceReq");
        cachedSerQNames.add(qName);
        cls = SubServiceReq.class;
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
                        } else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
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

    public String[] queryCPEID(String strCPEShortID) throws RemoteException {
        if (super.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://order.itms.zznode.com", "queryCPEID"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{strCPEShortID});

            if (_resp instanceof RemoteException) {
                throw (RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String[]) _resp;
                } catch (Exception _exception) {
                    return (String[]) JavaUtils.convert(_resp, String[].class);
                }
            }
        } catch (AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int queryCpeStatus(String cpeId) throws RemoteException {
        if (super.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://order.itms.zznode.com", "queryCpeStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{cpeId});

            if (_resp instanceof RemoteException) {
                throw (RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((Integer) _resp).intValue();
                } catch (Exception _exception) {
                    return ((Integer) JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String[] queryCpeStatus(int cpeStatus) throws RemoteException {
        if (super.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://order.itms.zznode.com", "queryCpeStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{new Integer(cpeStatus)});

            if (_resp instanceof RemoteException) {
                throw (RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String[]) _resp;
                } catch (Exception _exception) {
                    return (String[]) JavaUtils.convert(_resp, String[].class);
                }
            }
        } catch (AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int queryOrderStatus(String order_No) throws RemoteException {
        if (super.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://order.itms.zznode.com", "queryOrderStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{order_No});

            if (_resp instanceof RemoteException) {
                throw (RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((Integer) _resp).intValue();
                } catch (Exception _exception) {
                    return ((Integer) JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String[] queryOrderStatus(int orderStatus) throws RemoteException {
        if (super.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://order.itms.zznode.com", "queryOrderStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{new Integer(orderStatus)});

            if (_resp instanceof RemoteException) {
                throw (RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String[]) _resp;
                } catch (Exception _exception) {
                    return (String[]) JavaUtils.convert(_resp, String[].class);
                }
            }
        } catch (AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public ServiceStatusRespStruct[] queryServiceStatus(ServiceStatusReqStruct[] req) throws RemoteException {
        if (super.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://order.itms.zznode.com", "queryServiceStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{req});

            if (_resp instanceof RemoteException) {
                throw (RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (ServiceStatusRespStruct[]) _resp;
                } catch (Exception _exception) {
                    return (ServiceStatusRespStruct[]) JavaUtils.convert(_resp, ServiceStatusRespStruct[].class);
                }
            }
        } catch (AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public OrderResponse dealOrder(Order order) throws RemoteException {
        if (super.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://order.itms.zznode.com", "dealOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{order});

            if (_resp instanceof RemoteException) {
                throw (RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (OrderResponse) _resp;
                } catch (Exception _exception) {
                    return (OrderResponse) JavaUtils.convert(_resp, OrderResponse.class);
                }
            }
        } catch (AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public OrderServiceStruct populateOrderServiceStruct(String newServiceCode, String servName, String servFlag, String argsValue) throws RemoteException {
        if (super.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://order.itms.zznode.com", "populateOrderServiceStruct"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{newServiceCode, servName, servFlag, argsValue});

            if (_resp instanceof RemoteException) {
                throw (RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (OrderServiceStruct) _resp;
                } catch (Exception _exception) {
                    return (OrderServiceStruct) JavaUtils.convert(_resp, OrderServiceStruct.class);
                }
            }
        } catch (AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int bindInterface(int command, String cpeId, String adAccounts, String nasPortId, String nasIP, String areaNum, String vlanId) throws RemoteException {
        if (super.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://order.itms.zznode.com", "bindInterface"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{new Integer(command), cpeId, adAccounts, nasPortId, nasIP, areaNum, vlanId});

            if (_resp instanceof RemoteException) {
                throw (RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((Integer) _resp).intValue();
                } catch (Exception _exception) {
                    return ((Integer) JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int createService(CreatServiceReq req) throws RemoteException {
        if (super.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://order.itms.zznode.com", "createService"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{req});

            if (_resp instanceof RemoteException) {
                throw (RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((Integer) _resp).intValue();
                } catch (Exception _exception) {
                    return ((Integer) JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int dealOrderWithReply(Order order, String replyURL) throws RemoteException {
        if (super.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://order.itms.zznode.com", "dealOrderWithReply"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{order, replyURL});

            if (_resp instanceof RemoteException) {
                throw (RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((Integer) _resp).intValue();
                } catch (Exception _exception) {
                    return ((Integer) JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int dealOrderWithoutReply(Order order) throws RemoteException {
        if (super.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://order.itms.zznode.com", "dealOrderWithoutReply"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{order});

            if (_resp instanceof RemoteException) {
                throw (RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((Integer) _resp).intValue();
                } catch (Exception _exception) {
                    return ((Integer) JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public AlarmStruct[] getAlarmInformationByTimeSegment(String startTime, String endTime, int startAlarmID) throws RemoteException {
        if (super.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://order.itms.zznode.com", "getAlarmInformationByTimeSegment"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{startTime, endTime, new Integer(startAlarmID)});

            if (_resp instanceof RemoteException) {
                throw (RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (AlarmStruct[]) _resp;
                } catch (Exception _exception) {
                    return (AlarmStruct[]) JavaUtils.convert(_resp, AlarmStruct[].class);
                }
            }
        } catch (AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public CPEMsg getCPEMsg(String seqnbr, String ID, int iFlg) throws RemoteException {
        if (super.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://order.itms.zznode.com", "getCPEMsg"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{seqnbr, ID, new Integer(iFlg)});

            if (_resp instanceof RemoteException) {
                throw (RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (CPEMsg) _resp;
                } catch (Exception _exception) {
                    return (CPEMsg) JavaUtils.convert(_resp, CPEMsg.class);
                }
            }
        } catch (AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int queryCpeStatusConfirm(String[] cpeID) throws RemoteException {
        if (super.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://order.itms.zznode.com", "queryCpeStatusConfirm"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{cpeID});

            if (_resp instanceof RemoteException) {
                throw (RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((Integer) _resp).intValue();
                } catch (Exception _exception) {
                    return ((Integer) JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int queryOrderStatusConfirm(String[] orderNO) throws RemoteException {
        if (super.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://order.itms.zznode.com", "queryOrderStatusConfirm"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{orderNO});

            if (_resp instanceof RemoteException) {
                throw (RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((Integer) _resp).intValue();
                } catch (Exception _exception) {
                    return ((Integer) JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int queryOrderStatusWithReply(Order order, String replyURL) throws RemoteException {
        if (super.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://order.itms.zznode.com", "queryOrderStatusWithReply"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{order, replyURL});

            if (_resp instanceof RemoteException) {
                throw (RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((Integer) _resp).intValue();
                } catch (Exception _exception) {
                    return ((Integer) JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public UserDetail[] queryUserDetail(int iParaType, String value) throws RemoteException {
        if (super.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://order.itms.zznode.com", "queryUserDetail"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{new Integer(iParaType), value});

            if (_resp instanceof RemoteException) {
                throw (RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (UserDetail[]) _resp;
                } catch (Exception _exception) {
                    return (UserDetail[]) JavaUtils.convert(_resp, UserDetail[].class);
                }
            }
        } catch (AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int routeCPECharge(String prodNo, String accounts, String password) throws RemoteException {
        if (super.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://order.itms.zznode.com", "routeCPECharge"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{prodNo, accounts, password});

            if (_resp instanceof RemoteException) {
                throw (RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((Integer) _resp).intValue();
                } catch (Exception _exception) {
                    return ((Integer) JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int serviceChange(String adAcount, String LSHNo, String orderType, String newPassWord) throws RemoteException {
        if (super.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://order.itms.zznode.com", "serviceChange"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{adAcount, LSHNo, orderType, newPassWord});

            if (_resp instanceof RemoteException) {
                throw (RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((Integer) _resp).intValue();
                } catch (Exception _exception) {
                    return ((Integer) JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String truncateString(String str) throws RemoteException {
        if (super.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://order.itms.zznode.com", "truncateString"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{str});

            if (_resp instanceof RemoteException) {
                throw (RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

}
