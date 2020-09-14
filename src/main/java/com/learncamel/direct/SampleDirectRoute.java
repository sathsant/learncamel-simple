package com.learncamel.direct;

import org.apache.camel.builder.RouteBuilder;

public class SampleDirectRoute extends RouteBuilder {

	public void configure() throws Exception {
		from("direct:sampleInput")
		.log("Received message is header ${headers} and body ${body}")
		//.to("file:sampleOutput?filename=output.txt");
		.to("file:data/output");
		
	}

}
