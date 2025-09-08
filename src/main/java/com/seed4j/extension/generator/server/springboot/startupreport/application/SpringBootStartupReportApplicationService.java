package com.seed4j.extension.generator.server.springboot.startupreport.application;

import com.seed4j.extension.generator.server.springboot.startupreport.domain.SpringBootStartupReportModuleFactory;
import org.springframework.stereotype.Service;
import tech.jhipster.lite.module.domain.JHipsterModule;
import tech.jhipster.lite.module.domain.properties.JHipsterModuleProperties;

@Service
public class SpringBootStartupReportApplicationService {

  private final SpringBootStartupReportModuleFactory factory;

  public SpringBootStartupReportApplicationService() {
    this.factory = new SpringBootStartupReportModuleFactory();
  }

  public JHipsterModule buildModule(JHipsterModuleProperties properties) {
    return factory.buildModule(properties);
  }
}
