package com.mulesoft.ws;

import java.util.Random;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

//Service Implementation
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class HelloService {

    @WebMethod
    public String sayHello(String name) {
        return name;
    }

    @WebMethod
    public String strictdelay(String miliseconds)
    {
        try
        {
            Thread.sleep(Integer.parseInt(miliseconds));
            return "Waited for " + miliseconds + " miliseconds";
        }
        catch (Exception ex)
        {
            return "Exception thrown while waiting: " + ex.toString();
        }
    }

    @WebMethod
    public String randomdelay(String maxMiliseconds)
    {
        try
        {
            Random r = new Random();
            int wait = r.nextInt(Integer.parseInt(maxMiliseconds));
            Thread.sleep(wait);
            return "Waited for " + wait + " miliseconds";
        }
        catch (Exception ex)
        {
            return "Exception thrown while waiting: " + ex.toString();
        }
    }


}