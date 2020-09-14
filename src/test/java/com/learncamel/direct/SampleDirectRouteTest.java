package com.learncamel.direct;

import java.io.File;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

public class SampleDirectRouteTest extends CamelTestSupport {

	@Override
	public RouteBuilder createRouteBuilder() {
		return new SampleDirectRoute();
	}
	
	@Test
	public void sampleRouteTest() throws InterruptedException {
		template.sendBody("direct:sampleInput","123,santhosh,developer");
		Thread.sleep(5000);
		File file=new File("data/output");
		assertTrue(file.isDirectory());
	}
	
  }
	
	
