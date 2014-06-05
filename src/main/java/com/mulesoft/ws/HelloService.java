package com.mulesoft.ws;


import java.util.Random;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.apache.commons.lang.StringUtils;

//Service Implementation
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class HelloService {

    @WebMethod
    public String echo(@WebParam(name = "name") String name) {
        return name;
    }

    @WebMethod
    public String strictDelayEcho(@WebParam (name = "RequestEcho") RequestEcho request)
    {
        try
        {
            Thread.sleep(Integer.parseInt(request.getMiliseconds()));

            if (request.getContent() != null)
            {
                return request.getContent();
            }
            return "Waited for " + request.getMiliseconds() + " seconds";
        }
        catch (Exception ex)
        {
            return "Exception thrown while waiting: " + ex.toString();
        }
    }
    @WebMethod
    public String strictDelayLetters(@WebParam (name = "RequestLetter") RequestLetter request)
    {
        try
        {
            Thread.sleep(Integer.parseInt(request.getMiliseconds()));

            if (request.getLetters() != null)
            {
                return StringUtils.repeat("f", Integer.parseInt(request.getLetters()));
            }
            return "Waited for " + request.getMiliseconds() + " seconds";
        }
        catch (Exception ex)
        {
            return "Exception thrown while waiting: " + ex.toString();
        }
    }
    @WebMethod
         public String randomDelayLetters(@WebParam (name = "RequestLetter") RequestLetter request)
    {
        try
        {
            Random r = new Random();
            int wait = r.nextInt(Integer.parseInt(request.getMiliseconds()));
            Thread.sleep(wait);

            if (request.getLetters() != null)
            {
                return StringUtils.repeat("f", Integer.parseInt(request.getLetters()));
            }
            return "Waited for " + wait + " seconds";
        }
        catch (Exception ex)
        {
            return "Exception thrown while waiting: " + ex.toString();
        }
    }

    @WebMethod
    public String randomDelayEcho(@WebParam (name = "RequestEcho") RequestEcho request)
    {
        try
        {
            Random r = new Random();
            int wait = r.nextInt(Integer.parseInt(request.getMiliseconds()));
            Thread.sleep(wait);

            if (request.getContent() != null)
            {
                return request.getContent();
            }
            return "Waited for " + wait + " seconds";
        }
        catch (Exception ex)
        {
            return "Exception thrown while waiting: " + ex.toString();
        }
    }
}