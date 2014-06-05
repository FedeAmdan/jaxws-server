package com.mulesoft.ws;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="RequestLetter", propOrder={"miliseconds","letters"})
public class RequestLetter
{
    private String letters;
    private String miliseconds;
    private String content;
    @XmlElement(required = false, name="letters", namespace = "http://mulesoft.com/schemas/performance")
    public String getLetters() {
        return letters;
    }

    public void setLetters(String letters){
        this.letters = letters;
    }

    @XmlElement(required = true, name="miliseconds", namespace = "http://mulesoft.com/schemas/performance")
    public String getMiliseconds() {
        return miliseconds;
    }

    public void setMiliseconds(String miliseconds){
        this.miliseconds = miliseconds;
    }
}
