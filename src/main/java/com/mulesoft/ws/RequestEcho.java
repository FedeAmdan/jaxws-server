package com.mulesoft.ws;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="RequestEcho", propOrder={"miliseconds","content"})
public class RequestEcho
{
    private String miliseconds;
    private String content;
    @XmlElement(required = false, name="content", namespace = "http://mulesoft.com/schemas/performance")
    public String getContent() {
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }

    @XmlElement(required = true, name="miliseconds", namespace = "http://mulesoft.com/schemas/performance")
    public String getMiliseconds() {
        return miliseconds;
    }

    public void setMiliseconds(String miliseconds){
        this.miliseconds = miliseconds;
    }
}
