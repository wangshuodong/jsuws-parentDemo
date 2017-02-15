package com.cmiot.jsuws.wsb.cms;

import com.cmiot.jsuws.facade.cms.model.*;

/**
 * OperationDistributeServiceSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */


public class OperationDistributeServiceSoapBindingSkeleton implements ItmsOrderInterface, org.apache.axis.wsdl.Skeleton {
    private ItmsOrderInterface impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
     * Returns List of OperationDesc objects with this name
     */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
     * Returns Collection of OperationDescs
     */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "strCPEShortID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false),
        };
        _oper = new org.apache.axis.description.OperationDesc("queryCPEID", _params, new javax.xml.namespace.QName("", "queryCPEIDReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://10.40.103.46:6482/NorthInterface/services/OperationDistributeService", "ArrayOf_soapenc_string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://order.itms.zznode.com", "queryCPEID"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("queryCPEID") == null) {
            _myOperations.put("queryCPEID", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("queryCPEID")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cpeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false),
        };
        _oper = new org.apache.axis.description.OperationDesc("queryCpeStatus", _params, new javax.xml.namespace.QName("", "queryCpeStatusReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://order.itms.zznode.com", "queryCpeStatus"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("queryCpeStatus") == null) {
            _myOperations.put("queryCpeStatus", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("queryCpeStatus")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cpeStatus"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false),
        };
        _oper = new org.apache.axis.description.OperationDesc("queryCpeStatus", _params, new javax.xml.namespace.QName("", "queryCpeStatusReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://10.40.103.46:6482/NorthInterface/services/OperationDistributeService", "ArrayOf_soapenc_string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://order.itms.zznode.com", "queryCpeStatus"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("queryCpeStatus") == null) {
            _myOperations.put("queryCpeStatus", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("queryCpeStatus")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "order_No"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false),
        };
        _oper = new org.apache.axis.description.OperationDesc("queryOrderStatus", _params, new javax.xml.namespace.QName("", "queryOrderStatusReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://order.itms.zznode.com", "queryOrderStatus"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("queryOrderStatus") == null) {
            _myOperations.put("queryOrderStatus", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("queryOrderStatus")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "orderStatus"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false),
        };
        _oper = new org.apache.axis.description.OperationDesc("queryOrderStatus", _params, new javax.xml.namespace.QName("", "queryOrderStatusReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://10.40.103.46:6482/NorthInterface/services/OperationDistributeService", "ArrayOf_soapenc_string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://order.itms.zznode.com", "queryOrderStatus"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("queryOrderStatus") == null) {
            _myOperations.put("queryOrderStatus", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("queryOrderStatus")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://10.40.103.46:6482/NorthInterface/services/OperationDistributeService", "ArrayOfServiceStatusReqStruct"), ServiceStatusReqStruct[].class, false, false),
        };
        _oper = new org.apache.axis.description.OperationDesc("queryServiceStatus", _params, new javax.xml.namespace.QName("", "queryServiceStatusReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://10.40.103.46:6482/NorthInterface/services/OperationDistributeService", "ArrayOfServiceStatusRespStruct"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://order.itms.zznode.com", "queryServiceStatus"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("queryServiceStatus") == null) {
            _myOperations.put("queryServiceStatus", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("queryServiceStatus")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "order"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("OperationDistributeService", "Order"), Order.class, false, false),
        };
        _oper = new org.apache.axis.description.OperationDesc("dealOrder", _params, new javax.xml.namespace.QName("", "dealOrderReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://10.40.103.46:6482/NorthInterface/services/OperationDistributeService", "OrderResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://order.itms.zznode.com", "dealOrder"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("dealOrder") == null) {
            _myOperations.put("dealOrder", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("dealOrder")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "newServiceCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false),
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "servName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false),
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "servFlag"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false),
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "argsValue"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false),
        };
        _oper = new org.apache.axis.description.OperationDesc("populateOrderServiceStruct", _params, new javax.xml.namespace.QName("", "populateOrderServiceStructReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://order.idl.itms.zznode.com", "OrderServiceStruct"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://order.itms.zznode.com", "populateOrderServiceStruct"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("populateOrderServiceStruct") == null) {
            _myOperations.put("populateOrderServiceStruct", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("populateOrderServiceStruct")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "command"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false),
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cpeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false),
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "adAccounts"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false),
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nasPortId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false),
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nasIP"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false),
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "areaNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false),
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "vlanId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false),
        };
        _oper = new org.apache.axis.description.OperationDesc("bindInterface", _params, new javax.xml.namespace.QName("", "bindInterfaceReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://order.itms.zznode.com", "bindInterface"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("bindInterface") == null) {
            _myOperations.put("bindInterface", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("bindInterface")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://10.40.103.46:6482/NorthInterface/services/OperationDistributeService", "CreatServiceReq"), CreatServiceReq.class, false, false),
        };
        _oper = new org.apache.axis.description.OperationDesc("createService", _params, new javax.xml.namespace.QName("", "createServiceReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://order.itms.zznode.com", "createService"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("createService") == null) {
            _myOperations.put("createService", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("createService")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "order"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("OperationDistributeService", "Order"), Order.class, false, false),
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "replyURL"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false),
        };
        _oper = new org.apache.axis.description.OperationDesc("dealOrderWithReply", _params, new javax.xml.namespace.QName("", "dealOrderWithReplyReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://order.itms.zznode.com", "dealOrderWithReply"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("dealOrderWithReply") == null) {
            _myOperations.put("dealOrderWithReply", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("dealOrderWithReply")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "order"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("OperationDistributeService", "Order"), Order.class, false, false),
        };
        _oper = new org.apache.axis.description.OperationDesc("dealOrderWithoutReply", _params, new javax.xml.namespace.QName("", "dealOrderWithoutReplyReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://order.itms.zznode.com", "dealOrderWithoutReply"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("dealOrderWithoutReply") == null) {
            _myOperations.put("dealOrderWithoutReply", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("dealOrderWithoutReply")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "startTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false),
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "endTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false),
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "startAlarmID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false),
        };
        _oper = new org.apache.axis.description.OperationDesc("getAlarmInformationByTimeSegment", _params, new javax.xml.namespace.QName("", "getAlarmInformationByTimeSegmentReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://10.40.103.46:6482/NorthInterface/services/OperationDistributeService", "ArrayOfAlarmStruct"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://order.itms.zznode.com", "getAlarmInformationByTimeSegment"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getAlarmInformationByTimeSegment") == null) {
            _myOperations.put("getAlarmInformationByTimeSegment", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getAlarmInformationByTimeSegment")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "seqnbr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false),
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false),
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "iFlg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false),
        };
        _oper = new org.apache.axis.description.OperationDesc("getCPEMsg", _params, new javax.xml.namespace.QName("", "getCPEMsgReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://10.40.103.46:6482/NorthInterface/services/OperationDistributeService", "CPEMsg"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://order.itms.zznode.com", "getCPEMsg"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getCPEMsg") == null) {
            _myOperations.put("getCPEMsg", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getCPEMsg")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cpeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://10.40.103.46:6482/NorthInterface/services/OperationDistributeService", "ArrayOf_soapenc_string"), java.lang.String[].class, false, false),
        };
        _oper = new org.apache.axis.description.OperationDesc("queryCpeStatusConfirm", _params, new javax.xml.namespace.QName("", "queryCpeStatusConfirmReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://order.itms.zznode.com", "queryCpeStatusConfirm"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("queryCpeStatusConfirm") == null) {
            _myOperations.put("queryCpeStatusConfirm", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("queryCpeStatusConfirm")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "orderNO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://10.40.103.46:6482/NorthInterface/services/OperationDistributeService", "ArrayOf_soapenc_string"), java.lang.String[].class, false, false),
        };
        _oper = new org.apache.axis.description.OperationDesc("queryOrderStatusConfirm", _params, new javax.xml.namespace.QName("", "queryOrderStatusConfirmReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://order.itms.zznode.com", "queryOrderStatusConfirm"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("queryOrderStatusConfirm") == null) {
            _myOperations.put("queryOrderStatusConfirm", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("queryOrderStatusConfirm")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "order"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("OperationDistributeService", "Order"), Order.class, false, false),
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "replyURL"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false),
        };
        _oper = new org.apache.axis.description.OperationDesc("queryOrderStatusWithReply", _params, new javax.xml.namespace.QName("", "queryOrderStatusWithReplyReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://order.itms.zznode.com", "queryOrderStatusWithReply"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("queryOrderStatusWithReply") == null) {
            _myOperations.put("queryOrderStatusWithReply", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("queryOrderStatusWithReply")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "iParaType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false),
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false),
        };
        _oper = new org.apache.axis.description.OperationDesc("queryUserDetail", _params, new javax.xml.namespace.QName("", "queryUserDetailReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://10.40.103.46:6482/NorthInterface/services/OperationDistributeService", "ArrayOfUserDetail"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://order.itms.zznode.com", "queryUserDetail"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("queryUserDetail") == null) {
            _myOperations.put("queryUserDetail", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("queryUserDetail")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "prodNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false),
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "accounts"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false),
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false),
        };
        _oper = new org.apache.axis.description.OperationDesc("routeCPECharge", _params, new javax.xml.namespace.QName("", "routeCPEChargeReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://order.itms.zznode.com", "routeCPECharge"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("routeCPECharge") == null) {
            _myOperations.put("routeCPECharge", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("routeCPECharge")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "adAcount"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false),
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "LSHNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false),
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "orderType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false),
                new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "newPassWord"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false),
        };
        _oper = new org.apache.axis.description.OperationDesc("serviceChange", _params, new javax.xml.namespace.QName("", "serviceChangeReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://order.itms.zznode.com", "serviceChange"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("serviceChange") == null) {
            _myOperations.put("serviceChange", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("serviceChange")).add(_oper);
    }

    public OperationDistributeServiceSoapBindingSkeleton() {
        this.impl = new OperationDistributeServiceSoapBindingImpl();
    }

    public OperationDistributeServiceSoapBindingSkeleton(ItmsOrderInterface impl) {
        this.impl = impl;
    }
    public java.lang.String[] queryCPEID(java.lang.String strCPEShortID) throws java.rmi.RemoteException
    {
        java.lang.String[] ret = impl.queryCPEID(strCPEShortID);
        return ret;
    }

    public int queryCpeStatus(java.lang.String cpeId) throws java.rmi.RemoteException
    {
        int ret = impl.queryCpeStatus(cpeId);
        return ret;
    }

    public java.lang.String[] queryCpeStatus(int cpeStatus) throws java.rmi.RemoteException
    {
        java.lang.String[] ret = impl.queryCpeStatus(cpeStatus);
        return ret;
    }

    public int queryOrderStatus(java.lang.String order_No) throws java.rmi.RemoteException
    {
        int ret = impl.queryOrderStatus(order_No);
        return ret;
    }

    public java.lang.String[] queryOrderStatus(int orderStatus) throws java.rmi.RemoteException
    {
        java.lang.String[] ret = impl.queryOrderStatus(orderStatus);
        return ret;
    }

    public ServiceStatusRespStruct[] queryServiceStatus(ServiceStatusReqStruct[] req) throws java.rmi.RemoteException
    {
        ServiceStatusRespStruct[] ret = impl.queryServiceStatus(req);
        return ret;
    }

    public OrderResponse dealOrder(Order order) throws java.rmi.RemoteException
    {
        OrderResponse ret = impl.dealOrder(order);
        return ret;
    }

    public OrderServiceStruct populateOrderServiceStruct(java.lang.String newServiceCode, java.lang.String servName, java.lang.String servFlag, java.lang.String argsValue) throws java.rmi.RemoteException
    {
        OrderServiceStruct ret = impl.populateOrderServiceStruct(newServiceCode, servName, servFlag, argsValue);
        return ret;
    }

    public int bindInterface(int command, java.lang.String cpeId, java.lang.String adAccounts, java.lang.String nasPortId, java.lang.String nasIP, java.lang.String areaNum, java.lang.String vlanId) throws java.rmi.RemoteException
    {
        int ret = impl.bindInterface(command, cpeId, adAccounts, nasPortId, nasIP, areaNum, vlanId);
        return ret;
    }

    public int createService(CreatServiceReq req) throws java.rmi.RemoteException
    {
        int ret = impl.createService(req);
        return ret;
    }

    public int dealOrderWithReply(Order order, java.lang.String replyURL) throws java.rmi.RemoteException
    {
        int ret = impl.dealOrderWithReply(order, replyURL);
        return ret;
    }

    public int dealOrderWithoutReply(Order order) throws java.rmi.RemoteException
    {
        int ret = impl.dealOrderWithoutReply(order);
        return ret;
    }

    public AlarmStruct[] getAlarmInformationByTimeSegment(java.lang.String startTime, java.lang.String endTime, int startAlarmID) throws java.rmi.RemoteException
    {
        AlarmStruct[] ret = impl.getAlarmInformationByTimeSegment(startTime, endTime, startAlarmID);
        return ret;
    }

    public CPEMsg getCPEMsg(java.lang.String seqnbr, java.lang.String ID, int iFlg) throws java.rmi.RemoteException
    {
        CPEMsg ret = impl.getCPEMsg(seqnbr, ID, iFlg);
        return ret;
    }

    public int queryCpeStatusConfirm(java.lang.String[] cpeID) throws java.rmi.RemoteException
    {
        int ret = impl.queryCpeStatusConfirm(cpeID);
        return ret;
    }

    public int queryOrderStatusConfirm(java.lang.String[] orderNO) throws java.rmi.RemoteException
    {
        int ret = impl.queryOrderStatusConfirm(orderNO);
        return ret;
    }

    public int queryOrderStatusWithReply(Order order, java.lang.String replyURL) throws java.rmi.RemoteException
    {
        int ret = impl.queryOrderStatusWithReply(order, replyURL);
        return ret;
    }

    public UserDetail[] queryUserDetail(int iParaType, java.lang.String value) throws java.rmi.RemoteException
    {
        UserDetail[] ret = impl.queryUserDetail(iParaType, value);
        return ret;
    }

    public int routeCPECharge(java.lang.String prodNo, java.lang.String accounts, java.lang.String password) throws java.rmi.RemoteException
    {
        int ret = impl.routeCPECharge(prodNo, accounts, password);
        return ret;
    }

    public int serviceChange(java.lang.String adAcount, java.lang.String LSHNo, java.lang.String orderType, java.lang.String newPassWord) throws java.rmi.RemoteException
    {
        int ret = impl.serviceChange(adAcount, LSHNo, orderType, newPassWord);
        return ret;
    }

}
