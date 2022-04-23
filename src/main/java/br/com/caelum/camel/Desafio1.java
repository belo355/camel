package br.com.caelum.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.http4.HttpMethods;
import org.apache.camel.impl.DefaultCamelContext;

public class Desafio1 {

    public void runn() throws Exception {
//        CamelContext context = new DefaultCamelContext();
//        context.addRoutes(new RouteBuilder() {
//            @Override
//            public void configure() throws Exception {
//                from("timer://negociacoes?fixedRate=true&delay=1s&period=360s")
//                        .setHeader(Exchange.HTTP_METHOD, HttpMethods.GET)
//                        .to("http4://argentumws-spring.herokuapp.com/negociacoes")
//                        .setProperty("teste", xpath("/list/negociacao/preco/text()"))
//                        .marshal().xmljson()
//                        .log("${property.teste}");
//
//            }
//        });
//        context.start();
//        context.stop();
    }
}
