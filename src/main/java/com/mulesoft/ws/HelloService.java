package com.mulesoft.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

//Service Implementation
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class HelloService {

    @WebMethod
    public String sayHello(String name) {
        return "Hello " + name;
    }

}