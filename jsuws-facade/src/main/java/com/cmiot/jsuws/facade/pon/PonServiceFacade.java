package com.cmiot.jsuws.facade.pon;

import com.cmiot.jsuws.facade.pon.model.PonActRequest;
import com.cmiot.jsuws.facade.pon.model.PonActResponse;

import java.rmi.RemoteException;

/**
 * Created by Administrator on 2017/1/3.
 */
public interface PonServiceFacade {
    public PonActResponse ponActToCms(PonActRequest ponActRequest) throws RemoteException;
}
