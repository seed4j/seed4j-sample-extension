package com.seed4j.extension.generator.server.springboot.startupreport.domain;

import static tech.jhipster.lite.module.domain.JHipsterModule.javaDependency;
import static tech.jhipster.lite.module.domain.JHipsterModule.moduleBuilder;

import tech.jhipster.lite.module.domain.JHipsterModule;
import tech.jhipster.lite.module.domain.javadependency.JavaDependency;
import tech.jhipster.lite.module.domain.properties.JHipsterModuleProperties;
import tech.jhipster.lite.shared.error.domain.Assert;

public class SpringBootStartupReportModuleFactory {

  public JHipsterModule buildModule(JHipsterModuleProperties properties) {
    Assert.notNull("properties", properties);
    return moduleBuilder(properties).javaDependencies().addDependency(startupReportDependency()).and().build();
  }

  private JavaDependency startupReportDependency() {
    return javaDependency()
      .groupId("com.maciejwalkowiak.spring")
      .artifactId("spring-boot-startup-report")
      .versionSlug("spring-boot-startup-report")
      .optional()
      .build();
  }
}
