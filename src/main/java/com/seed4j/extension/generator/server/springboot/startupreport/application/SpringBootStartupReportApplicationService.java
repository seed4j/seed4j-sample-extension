package com.seed4j.extension.generator.server.springboot.startupreport.application;

import com.seed4j.extension.generator.server.springboot.startupreport.domain.SpringBootStartupReportModuleFactory;
import com.seed4j.module.domain.Seed4JModule;
import com.seed4j.module.domain.properties.Seed4JModuleProperties;
import org.springframework.stereotype.Service;

@Service
public class SpringBootStartupReportApplicationService {

  private final SpringBootStartupReportModuleFactory factory;

  public SpringBootStartupReportApplicationService() {
    this.factory = new SpringBootStartupReportModuleFactory();
  }

  public Seed4JModule buildModule(Seed4JModuleProperties properties) {
    return factory.buildModule(properties);
  }
}
