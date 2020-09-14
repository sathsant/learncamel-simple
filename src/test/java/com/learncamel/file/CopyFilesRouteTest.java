package com.learncamel.file;

import java.io.File;

import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

public class CopyFilesRouteTest extends CamelTestSupport{

	protected RoutesBuilder createRouteBuilder() {
		return new CopyFilesRoute();
  }
	
	@Test
	public void checkFileTestOutputDirectory() throws InterruptedException {
		Thread.sleep(5000);
		File file=new File("data/output");
		assertTrue(file.isDirectory());
		assertEquals(2,file.listFiles().length);
	}
}
