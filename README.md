JAX-WS Server
============

Web Service created using Jax-WS

If you want to run this app, you should:
1. Run "mvn clean install". This will generate a WAR file.
2. Deploy the WAR file using Apache tomcat.
3. The path of the web service will be http://localhost:8080/webserver/test
    WSDL path: http://localhost:8080/webserver/test?wsdl

Echo:

Request example:
```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.mulesoft.com/">
   <soapenv:Header/>
   <soapenv:Body>
      <ws:sayHello>
         <arg0>Fede</arg0>
      </ws:sayHello>
   </soapenv:Body>
</soapenv:Envelope>
```
Response example:
```xml
<S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/">
   <S:Body>
      <ns2:sayHelloResponse xmlns:ns2="http://ws.mulesoft.com/">
         <return>Fede</return>
      </ns2:sayHelloResponse>
   </S:Body>
</S:Envelope>
```

Random delay:

Request example:
```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.mulesoft.com/">
   <soapenv:Header/>
   <soapenv:Body>
      <ws:randomdelay>
         <arg0>400</arg0>
      </ws:randomdelay>
   </soapenv:Body>
</soapenv:Envelope>
```

Response example:
```xml
<S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/">
   <S:Body>
      <ns2:randomdelayResponse xmlns:ns2="http://ws.mulesoft.com/">
         <return>Waited for 163 miliseconds</return>
      </ns2:randomdelayResponse>
   </S:Body>
</S:Envelope>
```

Strict delay:

Request example:
```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.mulesoft.com/">
   <soapenv:Header/>
   <soapenv:Body>
      <ws:strictdelay>
         <arg0>400</arg0>
      </ws:strictdelay>
   </soapenv:Body>
</soapenv:Envelope>
```

Response example:
```xml
<S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/">
   <S:Body>
      <ns2:strictdelayResponse xmlns:ns2="http://ws.mulesoft.com/">
         <return>Waited for 400 miliseconds</return>
      </ns2:strictdelayResponse>
   </S:Body>
</S:Envelope>
```