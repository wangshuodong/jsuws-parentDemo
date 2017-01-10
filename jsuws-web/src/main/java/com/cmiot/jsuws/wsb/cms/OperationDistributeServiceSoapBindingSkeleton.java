/**
 * OperationDistributeServiceSoapBindingSkeleton.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmiot.jsuws.wsb.cms;

import com.cmiot.jsuws.facade.cms.model.*;
import org.apache.axis.description.FaultDesc;
import org.apache.axis.description.OperationDesc;
import org.apache.axis.description.ParameterDesc;
import org.apache.axis.wsdl.Skeleton;

import javax.xml.namespace.QName;
import java.rmi.RemoteException;
import java.util.*;

public class OperationDistributeServiceSoapBindingSkeleton implements ItmsOrderInterface, Skeleton {
    private ItmsOrderInterface impl;
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
                new ParameterDesc(new QName("", "strCPEShortID"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
        };
        _oper = new OperationDesc("queryCPEID", _params, new QName("", "queryCPEIDReturn"));
        _oper.setReturnType(new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "ArrayOf_soapenc_string"));
        _oper.setElementQName(new QName("http://order.itms.zznode.com", "queryCPEID"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("queryCPEID") == null) {
            _myOperations.put("queryCPEID", new ArrayList());
        }
        ((List) _myOperations.get("queryCPEID")).add(_oper);
        _params = new ParameterDesc[]{
                new ParameterDesc(new QName("", "cpeId"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
        };
        _oper = new OperationDesc("queryCpeStatus", _params, new QName("", "queryCpeStatusReturn"));
        _oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new QName("http://order.itms.zznode.com", "queryCpeStatus"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("queryCpeStatus") == null) {
            _myOperations.put("queryCpeStatus", new ArrayList());
        }
        ((List) _myOperations.get("queryCpeStatus")).add(_oper);
        _params = new ParameterDesc[]{
                new ParameterDesc(new QName("", "cpeStatus"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false),
        };
        _oper = new OperationDesc("queryCpeStatus", _params, new QName("", "queryCpeStatusReturn"));
        _oper.setReturnType(new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "ArrayOf_soapenc_string"));
        _oper.setElementQName(new QName("http://order.itms.zznode.com", "queryCpeStatus"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("queryCpeStatus") == null) {
            _myOperations.put("queryCpeStatus", new ArrayList());
        }
        ((List) _myOperations.get("queryCpeStatus")).add(_oper);
        _params = new ParameterDesc[]{
                new ParameterDesc(new QName("", "order_No"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
        };
        _oper = new OperationDesc("queryOrderStatus", _params, new QName("", "queryOrderStatusReturn"));
        _oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new QName("http://order.itms.zznode.com", "queryOrderStatus"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("queryOrderStatus") == null) {
            _myOperations.put("queryOrderStatus", new ArrayList());
        }
        ((List) _myOperations.get("queryOrderStatus")).add(_oper);
        _params = new ParameterDesc[]{
                new ParameterDesc(new QName("", "orderStatus"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false),
        };
        _oper = new OperationDesc("queryOrderStatus", _params, new QName("", "queryOrderStatusReturn"));
        _oper.setReturnType(new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "ArrayOf_soapenc_string"));
        _oper.setElementQName(new QName("http://order.itms.zznode.com", "queryOrderStatus"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("queryOrderStatus") == null) {
            _myOperations.put("queryOrderStatus", new ArrayList());
        }
        ((List) _myOperations.get("queryOrderStatus")).add(_oper);
        _params = new ParameterDesc[]{
                new ParameterDesc(new QName("", "req"), ParameterDesc.IN, new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "ArrayOfServiceStatusReqStruct"), ServiceStatusReqStruct[].class, false, false),
        };
        _oper = new OperationDesc("queryServiceStatus", _params, new QName("", "queryServiceStatusReturn"));
        _oper.setReturnType(new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "ArrayOfServiceStatusRespStruct"));
        _oper.setElementQName(new QName("http://order.itms.zznode.com", "queryServiceStatus"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("queryServiceStatus") == null) {
            _myOperations.put("queryServiceStatus", new ArrayList());
        }
        ((List) _myOperations.get("queryServiceStatus")).add(_oper);
        _params = new ParameterDesc[]{
                new ParameterDesc(new QName("", "order"), ParameterDesc.IN, new QName("OperationDistributeService", "Order"), Order.class, false, false),
        };
        _oper = new OperationDesc("dealOrder", _params, new QName("", "dealOrderReturn"));
        _oper.setReturnType(new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "OrderResponse"));
        _oper.setElementQName(new QName("http://order.itms.zznode.com", "dealOrder"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("dealOrder") == null) {
            _myOperations.put("dealOrder", new ArrayList());
        }
        ((List) _myOperations.get("dealOrder")).add(_oper);
        _params = new ParameterDesc[]{
                new ParameterDesc(new QName("", "newServiceCode"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
                new ParameterDesc(new QName("", "servName"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
                new ParameterDesc(new QName("", "servFlag"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
                new ParameterDesc(new QName("", "argsValue"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
        };
        _oper = new OperationDesc("populateOrderServiceStruct", _params, new QName("", "populateOrderServiceStructReturn"));
        _oper.setReturnType(new QName("http://order.idl.itms.zznode.com", "OrderServiceStruct"));
        _oper.setElementQName(new QName("http://order.itms.zznode.com", "populateOrderServiceStruct"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("populateOrderServiceStruct") == null) {
            _myOperations.put("populateOrderServiceStruct", new ArrayList());
        }
        ((List) _myOperations.get("populateOrderServiceStruct")).add(_oper);
        _params = new ParameterDesc[]{
                new ParameterDesc(new QName("", "command"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false),
                new ParameterDesc(new QName("", "cpeId"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
                new ParameterDesc(new QName("", "adAccounts"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
                new ParameterDesc(new QName("", "nasPortId"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
                new ParameterDesc(new QName("", "nasIP"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
                new ParameterDesc(new QName("", "areaNum"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
                new ParameterDesc(new QName("", "vlanId"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
        };
        _oper = new OperationDesc("bindInterface", _params, new QName("", "bindInterfaceReturn"));
        _oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new QName("http://order.itms.zznode.com", "bindInterface"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("bindInterface") == null) {
            _myOperations.put("bindInterface", new ArrayList());
        }
        ((List) _myOperations.get("bindInterface")).add(_oper);
        _params = new ParameterDesc[]{
                new ParameterDesc(new QName("", "req"), ParameterDesc.IN, new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "CreatServiceReq"), CreatServiceReq.class, false, false),
        };
        _oper = new OperationDesc("createService", _params, new QName("", "createServiceReturn"));
        _oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new QName("http://order.itms.zznode.com", "createService"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("createService") == null) {
            _myOperations.put("createService", new ArrayList());
        }
        ((List) _myOperations.get("createService")).add(_oper);
        _params = new ParameterDesc[]{
                new ParameterDesc(new QName("", "order"), ParameterDesc.IN, new QName("OperationDistributeService", "Order"), Order.class, false, false),
                new ParameterDesc(new QName("", "replyURL"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
        };
        _oper = new OperationDesc("dealOrderWithReply", _params, new QName("", "dealOrderWithReplyReturn"));
        _oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new QName("http://order.itms.zznode.com", "dealOrderWithReply"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("dealOrderWithReply") == null) {
            _myOperations.put("dealOrderWithReply", new ArrayList());
        }
        ((List) _myOperations.get("dealOrderWithReply")).add(_oper);
        _params = new ParameterDesc[]{
                new ParameterDesc(new QName("", "order"), ParameterDesc.IN, new QName("OperationDistributeService", "Order"), Order.class, false, false),
        };
        _oper = new OperationDesc("dealOrderWithoutReply", _params, new QName("", "dealOrderWithoutReplyReturn"));
        _oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new QName("http://order.itms.zznode.com", "dealOrderWithoutReply"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("dealOrderWithoutReply") == null) {
            _myOperations.put("dealOrderWithoutReply", new ArrayList());
        }
        ((List) _myOperations.get("dealOrderWithoutReply")).add(_oper);
        _params = new ParameterDesc[]{
                new ParameterDesc(new QName("", "startTime"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
                new ParameterDesc(new QName("", "endTime"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
                new ParameterDesc(new QName("", "startAlarmID"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false),
        };
        _oper = new OperationDesc("getAlarmInformationByTimeSegment", _params, new QName("", "getAlarmInformationByTimeSegmentReturn"));
        _oper.setReturnType(new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "ArrayOfAlarmStruct"));
        _oper.setElementQName(new QName("http://order.itms.zznode.com", "getAlarmInformationByTimeSegment"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getAlarmInformationByTimeSegment") == null) {
            _myOperations.put("getAlarmInformationByTimeSegment", new ArrayList());
        }
        ((List) _myOperations.get("getAlarmInformationByTimeSegment")).add(_oper);
        _params = new ParameterDesc[]{
                new ParameterDesc(new QName("", "seqnbr"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
                new ParameterDesc(new QName("", "ID"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
                new ParameterDesc(new QName("", "iFlg"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false),
        };
        _oper = new OperationDesc("getCPEMsg", _params, new QName("", "getCPEMsgReturn"));
        _oper.setReturnType(new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "CPEMsg"));
        _oper.setElementQName(new QName("http://order.itms.zznode.com", "getCPEMsg"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getCPEMsg") == null) {
            _myOperations.put("getCPEMsg", new ArrayList());
        }
        ((List) _myOperations.get("getCPEMsg")).add(_oper);
        _params = new ParameterDesc[]{
                new ParameterDesc(new QName("", "cpeID"), ParameterDesc.IN, new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "ArrayOf_soapenc_string"), String[].class, false, false),
        };
        _oper = new OperationDesc("queryCpeStatusConfirm", _params, new QName("", "queryCpeStatusConfirmReturn"));
        _oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new QName("http://order.itms.zznode.com", "queryCpeStatusConfirm"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("queryCpeStatusConfirm") == null) {
            _myOperations.put("queryCpeStatusConfirm", new ArrayList());
        }
        ((List) _myOperations.get("queryCpeStatusConfirm")).add(_oper);
        _params = new ParameterDesc[]{
                new ParameterDesc(new QName("", "orderNO"), ParameterDesc.IN, new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "ArrayOf_soapenc_string"), String[].class, false, false),
        };
        _oper = new OperationDesc("queryOrderStatusConfirm", _params, new QName("", "queryOrderStatusConfirmReturn"));
        _oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new QName("http://order.itms.zznode.com", "queryOrderStatusConfirm"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("queryOrderStatusConfirm") == null) {
            _myOperations.put("queryOrderStatusConfirm", new ArrayList());
        }
        ((List) _myOperations.get("queryOrderStatusConfirm")).add(_oper);
        _params = new ParameterDesc[]{
                new ParameterDesc(new QName("", "order"), ParameterDesc.IN, new QName("OperationDistributeService", "Order"), Order.class, false, false),
                new ParameterDesc(new QName("", "replyURL"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
        };
        _oper = new OperationDesc("queryOrderStatusWithReply", _params, new QName("", "queryOrderStatusWithReplyReturn"));
        _oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new QName("http://order.itms.zznode.com", "queryOrderStatusWithReply"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("queryOrderStatusWithReply") == null) {
            _myOperations.put("queryOrderStatusWithReply", new ArrayList());
        }
        ((List) _myOperations.get("queryOrderStatusWithReply")).add(_oper);
        _params = new ParameterDesc[]{
                new ParameterDesc(new QName("", "iParaType"), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false),
                new ParameterDesc(new QName("", "value"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
        };
        _oper = new OperationDesc("queryUserDetail", _params, new QName("", "queryUserDetailReturn"));
        _oper.setReturnType(new QName("http://183.207.194.211:5482/NorthInterface/services/OperationDistributeService", "ArrayOfUserDetail"));
        _oper.setElementQName(new QName("http://order.itms.zznode.com", "queryUserDetail"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("queryUserDetail") == null) {
            _myOperations.put("queryUserDetail", new ArrayList());
        }
        ((List) _myOperations.get("queryUserDetail")).add(_oper);
        _params = new ParameterDesc[]{
                new ParameterDesc(new QName("", "prodNo"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
                new ParameterDesc(new QName("", "accounts"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
                new ParameterDesc(new QName("", "password"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
        };
        _oper = new OperationDesc("routeCPECharge", _params, new QName("", "routeCPEChargeReturn"));
        _oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new QName("http://order.itms.zznode.com", "routeCPECharge"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("routeCPECharge") == null) {
            _myOperations.put("routeCPECharge", new ArrayList());
        }
        ((List) _myOperations.get("routeCPECharge")).add(_oper);
        _params = new ParameterDesc[]{
                new ParameterDesc(new QName("", "adAcount"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
                new ParameterDesc(new QName("", "LSHNo"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
                new ParameterDesc(new QName("", "orderType"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
                new ParameterDesc(new QName("", "newPassWord"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
        };
        _oper = new OperationDesc("serviceChange", _params, new QName("", "serviceChangeReturn"));
        _oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new QName("http://order.itms.zznode.com", "serviceChange"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("serviceChange") == null) {
            _myOperations.put("serviceChange", new ArrayList());
        }
        ((List) _myOperations.get("serviceChange")).add(_oper);
        _params = new ParameterDesc[]{
                new ParameterDesc(new QName("", "str"), ParameterDesc.IN, new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
        };
        _oper = new OperationDesc("truncateString", _params, new QName("", "truncateStringReturn"));
        _oper.setReturnType(new QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        _oper.setElementQName(new QName("http://order.itms.zznode.com", "truncateString"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("truncateString") == null) {
            _myOperations.put("truncateString", new ArrayList());
        }
        ((List) _myOperations.get("truncateString")).add(_oper);
    }

    public OperationDistributeServiceSoapBindingSkeleton() {
        this.impl = new OperationDistributeServiceSoapBindingImpl();
    }

    public OperationDistributeServiceSoapBindingSkeleton(ItmsOrderInterface impl) {
        this.impl = impl;
    }

    public String[] queryCPEID(String strCPEShortID) throws RemoteException {
        String[] ret = impl.queryCPEID(strCPEShortID);
        return ret;
    }

    public int queryCpeStatus(String cpeId) throws RemoteException {
        int ret = impl.queryCpeStatus(cpeId);
        return ret;
    }

    public String[] queryCpeStatus(int cpeStatus) throws RemoteException {
        String[] ret = impl.queryCpeStatus(cpeStatus);
        return ret;
    }

    public int queryOrderStatus(String order_No) throws RemoteException {
        int ret = impl.queryOrderStatus(order_No);
        return ret;
    }

    public String[] queryOrderStatus(int orderStatus) throws RemoteException {
        String[] ret = impl.queryOrderStatus(orderStatus);
        return ret;
    }

    public ServiceStatusRespStruct[] queryServiceStatus(ServiceStatusReqStruct[] req) throws RemoteException {
        ServiceStatusRespStruct[] ret = impl.queryServiceStatus(req);
        return ret;
    }

    public OrderResponse dealOrder(Order order) throws RemoteException {
        OrderResponse ret = impl.dealOrder(order);
        return ret;
    }

    public OrderServiceStruct populateOrderServiceStruct(String newServiceCode, String servName, String servFlag, String argsValue) throws RemoteException {
        OrderServiceStruct ret = impl.populateOrderServiceStruct(newServiceCode, servName, servFlag, argsValue);
        return ret;
    }

    public int bindInterface(int command, String cpeId, String adAccounts, String nasPortId, String nasIP, String areaNum, String vlanId) throws RemoteException {
        int ret = impl.bindInterface(command, cpeId, adAccounts, nasPortId, nasIP, areaNum, vlanId);
        return ret;
    }

    public int createService(CreatServiceReq req) throws RemoteException {
        int ret = impl.createService(req);
        return ret;
    }

    public int dealOrderWithReply(Order order, String replyURL) throws RemoteException {
        int ret = impl.dealOrderWithReply(order, replyURL);
        return ret;
    }

    public int dealOrderWithoutReply(Order order) throws RemoteException {
        int ret = impl.dealOrderWithoutReply(order);
        return ret;
    }

    public AlarmStruct[] getAlarmInformationByTimeSegment(String startTime, String endTime, int startAlarmID) throws RemoteException {
        AlarmStruct[] ret = impl.getAlarmInformationByTimeSegment(startTime, endTime, startAlarmID);
        return ret;
    }

    public CPEMsg getCPEMsg(String seqnbr, String ID, int iFlg) throws RemoteException {
        CPEMsg ret = impl.getCPEMsg(seqnbr, ID, iFlg);
        return ret;
    }

    public int queryCpeStatusConfirm(String[] cpeID) throws RemoteException {
        int ret = impl.queryCpeStatusConfirm(cpeID);
        return ret;
    }

    public int queryOrderStatusConfirm(String[] orderNO) throws RemoteException {
        int ret = impl.queryOrderStatusConfirm(orderNO);
        return ret;
    }

    public int queryOrderStatusWithReply(Order order, String replyURL) throws RemoteException {
        int ret = impl.queryOrderStatusWithReply(order, replyURL);
        return ret;
    }

    public UserDetail[] queryUserDetail(int iParaType, String value) throws RemoteException {
        UserDetail[] ret = impl.queryUserDetail(iParaType, value);
        return ret;
    }

    public int routeCPECharge(String prodNo, String accounts, String password) throws RemoteException {
        int ret = impl.routeCPECharge(prodNo, accounts, password);
        return ret;
    }

    public int serviceChange(String adAcount, String LSHNo, String orderType, String newPassWord) throws RemoteException {
        int ret = impl.serviceChange(adAcount, LSHNo, orderType, newPassWord);
        return ret;
    }

    public String truncateString(String str) throws RemoteException {
        String ret = impl.truncateString(str);
        return ret;
    }

}
