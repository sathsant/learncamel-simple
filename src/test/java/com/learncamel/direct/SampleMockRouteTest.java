package com.learncamel.direct;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

public class SampleMockRouteTest extends CamelTestSupport {

	@Override
	public RouteBuilder createRouteBuilder() {
		return new SampleMockRoute();
	}
	
	@Test
	public void sampleMockTest() throws InterruptedException {
		String input="hello";
		MockEndpoint mock=getMockEndpoint("mock:sampleOutput");
		mock.expectedBodiesReceived(input);
		template.sendBody("direct:sampleInput","hello");
		assertMockEndpointsSatisfied();
	}
}
