package org.springboot.camel.ex421;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.spi.DataFormat;
import org.springboot.camel.ex421.model.Customer;
import org.springframework.stereotype.Component;
@Component
public class TimersAndMarshallersJavaDsl extends RouteBuilder {

	
	DataFormat jackson = new JacksonDataFormat(org.springboot.camel.ex421.model.Customer.class);

	
    @Override
    public void configure() {

    	from("timer:helloTimer?fixedRate=false&period=1000")
    	.id("jsonMarshallerTimer")
    	.log("Hello world")
    	.setBody()
    		.constant(new Customer())
    	.marshal(jackson)
    	.log("${body}");
    }

}
