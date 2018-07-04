package org.sda.wrapper;

import org.glassfish.jersey.server.ResourceConfig;

public class SemWeb2NLApp extends ResourceConfig {
	public SemWeb2NLApp() {
		packages("test");
	}
}
