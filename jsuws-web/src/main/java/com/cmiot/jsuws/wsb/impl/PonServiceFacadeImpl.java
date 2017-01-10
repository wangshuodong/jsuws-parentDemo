package com.cmiot.jsuws.wsb.impl;

import com.cmiot.jsuws.facade.pon.PonServiceFacade;
import com.cmiot.jsuws.facade.pon.model.PonActRequest;
import com.cmiot.jsuws.facade.pon.model.PonActResponse;
import com.cmiot.jsuws.wsb.pon.PonServiceFacadeImplProxy;
import com.cmiot.jsuws.wsb.utils.PropertiesUtils;

import java.rmi.RemoteException;

/**
 * Created by Administrator on 2017/1/3.
 */
public class PonServiceFacadeImpl implements PonServiceFacade {
    public PonActResponse ponActToCms(PonActRequest ponActRequest) throws RemoteException {
        PonActResponse resp = null;
        try {
            resp = new PonServiceFacadeImplProxy(PropertiesUtils.getProperty("jiangsu.web.addr.pon")).ponActToCms(ponActRequest);
        }catch (RemoteException e) {
            new RemoteException("调用江苏webservice异常！" + e.getMessage());
        }
        return resp;
    }

}
