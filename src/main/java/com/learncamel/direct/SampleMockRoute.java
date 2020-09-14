package com.learncamel.direct;

import org.apache.camel.builder.RouteBuilder;

public class SampleMockRoute extends RouteBuilder
{

	@Override
	public void configure() throws Exception {
		from("direct:sampleInput")
		.log("Received message is header ${headers} and body ${body}")
		.to("mock:sampleOutput");
		
	}

}
