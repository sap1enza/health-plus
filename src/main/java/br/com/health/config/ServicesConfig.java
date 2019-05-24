package br.com.health.config;

import org.glassfish.jersey.server.ResourceConfig;

public class ServicesConfig extends ResourceConfig  {
	public ServicesConfig() {
		packages("br.com.health.service");
  }
}