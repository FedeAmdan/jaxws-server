JAX-WS Server
============

Web Service created using Jax-WS

If you want to run this app, you should:
1. Run "mvn clean install". This will generate a WAR file.
2. Deploy the WAR file using Apache tomcat.
3. The path of the web service will be http://localhost:8080/webserver/test
    WSDL path: http://localhost:8080/webserver/test?wsdl

####Echo:

######Request example:
```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.mulesoft.com/">
   <soapenv:Header/>
   <soapenv:Body>
      <ws:echo>
         <name>Fede</name>
      </ws:echo>
   </soapenv:Body>
</soapenv:Envelope>
```
######Response example:
```xml
<S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/">
   <S:Body>
      <ns2:sayHelloResponse xmlns:ns2="http://ws.mulesoft.com/" xmlns:ns3="http://mulesoft.com/schemas/performance">
         <return>Fede</return>
      </ns2:sayHelloResponse>
   </S:Body>
</S:Envelope>
```
---

####Random delay with content:

Parameters:
Miliseconds: miliseconds that will wait.
Content: content that will be returned.

######Request example:
```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.mulesoft.com/" xmlns:per="http://mulesoft.com/schemas/performance">
   <soapenv:Header/>
   <soapenv:Body>
      <ws:randomDelayEcho>
         <RequestEcho>
            <per:miliseconds>30</per:miliseconds>
            <!--Optional:-->
            <per:content>Hello everybody!</per:content>
         </RequestEcho>
      </ws:randomDelayEcho>
   </soapenv:Body>
</soapenv:Envelope>
```

######Response example:
```xml
<S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/">
   <S:Body>
      <ns2:randomdelayResponse xmlns:ns2="http://ws.mulesoft.com/">
         <return>Hello everybody!</return>
      </ns2:randomdelayResponse>
   </S:Body>
</S:Envelope>
```
---

####Random delay with letters:

Parameters:
Miliseconds: miliseconds that will wait.
Letters: amount of letters that will be returned.

######Request example:
```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.mulesoft.com/" xmlns:per="http://mulesoft.com/schemas/performance">
   <soapenv:Header/>
   <soapenv:Body>
      <ws:randomDelayLetters>
         <RequestLetter>
            <per:miliseconds>300</per:miliseconds>
            <!--Optional:-->
            <per:letters>4</per:letters>
         </RequestLetter>
      </ws:randomDelayLetters>
   </soapenv:Body>
</soapenv:Envelope>
```

######Response example:
```xml
<S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/">
   <S:Body>
      <ns2:randomDelayLettersResponse xmlns:ns2="http://ws.mulesoft.com/" xmlns:ns3="http://mulesoft.com/schemas/performance">
         <return>ffff</return>
      </ns2:randomDelayLettersResponse>
   </S:Body>
</S:Envelope>
```
---

####Strict delay with content:

Parameters:
Miliseconds: miliseconds that will wait.
Content: content that will return.

######Request example:
```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.mulesoft.com/" xmlns:per="http://mulesoft.com/schemas/performance">
   <soapenv:Header/>
   <soapenv:Body>
      <ws:strictDelayEcho>
         <RequestEcho>
            <per:miliseconds>400</per:miliseconds>
            <!--Optional:-->
            <per:content>Hello everybody!</per:content>
         </RequestEcho>
      </ws:strictDelayEcho>
   </soapenv:Body>
</soapenv:Envelope>
```

######Response example:
```xml
<S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/">
   <S:Body>
      <ns2:strictDelayEchoResponse xmlns:ns2="http://ws.mulesoft.com/" xmlns:ns3="http://mulesoft.com/schemas/performance">
         <return>Hello everybody!</return>
      </ns2:strictDelayEchoResponse>
   </S:Body>
</S:Envelope>
```

####Strict delay with letters:

Parameters:
Miliseconds: miliseconds that will wait.
Letters: amount of letters that will be returned.

######Request example:
```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.mulesoft.com/" xmlns:per="http://mulesoft.com/schemas/performance">
   <soapenv:Header/>
   <soapenv:Body>
      <ws:strictDelayLetters>
         <RequestLetter>
            <per:miliseconds>300</per:miliseconds>
            <!--Optional:-->
            <per:letters>5</per:letters>
         </RequestLetter>
      </ws:strictDelayLetters>
   </soapenv:Body>
</soapenv:Envelope>
```

######Response example:
```xml
<S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/">
   <S:Body>
      <ns2:strictDelayLettersResponse xmlns:ns2="http://ws.mulesoft.com/" xmlns:ns3="http://mulesoft.com/schemas/performance">
         <return>fffff</return>
      </ns2:strictDelayLettersResponse>
   </S:Body>
</S:Envelope>
```