JAX-WS Server
============

Web Service created using Jax-WS

If you want to run this app, you should:
1. Run "mvn clean install". This will generate a WAR file.
2. Deploy the WAR file using Apache tomcat.
3. The path of the web service will be http://localhost:8080/webserver/test
    WSDL path: http://localhost:8080/webserver/test?wsdl

Request example:
'<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.mulesoft.com/">
   <soapenv:Header/>
   <soapenv:Body>
      <ws:getHelloWorldAsString>
         <arg0>Fede</arg0>
      </ws:getHelloWorldAsString>
   </soapenv:Body>
</soapenv:Envelope>'

Response example:
'<S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/">
   <S:Body>
      <ns2:getHelloWorldAsStringResponse xmlns:ns2="http://ws.mulesoft.com/">
         <return>Hello Fede</return>
      </ns2:getHelloWorldAsStringResponse>
   </S:Body>
</S:Envelope>'
