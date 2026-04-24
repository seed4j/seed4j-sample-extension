package com.seed4j.extension.generator.server.springboot.startupreport.domain;

import static com.seed4j.module.domain.Seed4JModule.javaDependency;
import static com.seed4j.module.domain.Seed4JModule.moduleBuilder;

import com.seed4j.module.domain.Seed4JModule;
import com.seed4j.module.domain.javadependency.JavaDependency;
import com.seed4j.module.domain.properties.Seed4JModuleProperties;
import com.seed4j.shared.error.domain.Assert;

public class SpringBootStartupReportModuleFactory {

  public Seed4JModule buildModule(Seed4JModuleProperties properties) {
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
