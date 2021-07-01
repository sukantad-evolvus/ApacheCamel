package com.evolvus.example;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class CamelExample {
public static void main(String[] args) {
	
	CamelContext context=new DefaultCamelContext();
	
	try {
		context.addRoutes(new RouteBuilder() {

			@Override
			public void configure() throws Exception {
            from("file:input?noop=true").to("file:output");				
			}
		});
		
		context.start();
		
		Thread.sleep(3000);
		System.out.println("comleted");
		context.stop();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
		

		
	
}
}
