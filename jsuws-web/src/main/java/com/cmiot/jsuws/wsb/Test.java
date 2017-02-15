package com.cmiot.jsuws.wsb;


import com.cmiot.jsuws.facade.ams.model.QueryDeviceByLoidRequest;
import com.cmiot.jsuws.facade.ams.model.QueryDeviceByLoidResponse;
import com.cmiot.jsuws.wsb.ams.AMSServiceProxy;

import java.rmi.RemoteException;

public class Test {

    public static void main(String[] args) throws RemoteException {
        String url = "http://183.207.194.218:6482/NorthInterface/services/AMSService";
        QueryDeviceByLoidRequest rest = new QueryDeviceByLoidRequest();
        rest.setLoid("1111");
        rest.setRequestId("abc");
        QueryDeviceByLoidResponse resp = new AMSServiceProxy(url).queryDeviceByLoid(rest);
        System.out.println(resp);




//        Order o = new Order();
//        o.setOrderId("20170119112523002");
//        o.setOrderTime("20170119112523");
//        o.setOrderType("wband-1");
//        o.setServiceCode("wband");
//        o.setDeviceWan("1");
//        o.setUserType("0");
//        o.setDeviceId("test123");
//        o.setUserName("13851995087");
//        o.setUserAddress("Jiangsu of China");
//        o.setPppoeAccount("13851995087");
//        o.setUserMainid("test111111");
//        o.setUserId("test111111");
//        o.setAreaCode("0011");
//        o.setSubAreaCode("0011");
//        o.setContactPerson("13851995087");
//        o.setPhoneNumber("13851995087");
//        o.setVectorArgues("wband_mode=1^wband_pppoeAccount=13851995087^wband_pppoePassword=217598");
//        o.setOrderKind("SG");
//        o.setCpeType("0");
//        o.setSupplyName("5");
//        o.setTerminalClass("1");
//        o.setClassName("yidong");
//        o.setCompanyID("yidong");
//        o.setClassID("yidong");
//        o.setClassName("yidong");
//        new ItmsOrderInterfaceProxy("http://localhost:5555/services/OperationDistributeService").dealOrder(o);
    }

}
