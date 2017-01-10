package com.cmiot.jsuws.wsb;


import com.cmiot.jsuws.facade.wlan.model.PonActToCms_request;
import com.cmiot.jsuws.wsb.wlan.PonServiceProxy;

import java.rmi.RemoteException;

public class Test {

    public static void main(String[] args) throws RemoteException {
        String url = "http://localhost:5555/services/PonService";
//        QueryOrderRequest rest = new QueryOrderRequest();
//        rest.setOrderId("123");
//        rest.setRequestId("abc");
//        QueryOrderResponse resp = new AMSServiceProxy("http://localhost:9090/services/AMSService").queryOrder(rest);
//        System.out.println(resp.getOrderId());

//        new AMSServiceProxy("http://localhost:9090/services/AMSService").queryOrder(null);
        PonActToCms_request rest = new PonActToCms_request();
        rest.setOrderId("123");
        rest.setTaskId("abc");
		new PonServiceProxy("http://localhost:9090/services/PonService").ponActToCms(rest);

//        new PonServiceFacadeImplProxy("http://localhost:9090/services/PonServiceFacadeImpl").ponActToCms(null);
    }

}
