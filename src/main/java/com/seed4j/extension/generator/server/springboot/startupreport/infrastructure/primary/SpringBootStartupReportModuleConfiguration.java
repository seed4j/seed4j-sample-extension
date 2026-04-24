package com.seed4j.extension.generator.server.springboot.startupreport.infrastructure.primary;

import static com.seed4j.extension.shared.slug.domain.Seed4jSampleExtensionModuleSlug.*;
import static com.seed4j.shared.slug.domain.Seed4JCoreModuleSlug.*;

import com.seed4j.extension.generator.server.springboot.startupreport.application.SpringBootStartupReportApplicationService;
import com.seed4j.module.domain.resource.Seed4JModuleOrganization;
import com.seed4j.module.domain.resource.Seed4JModuleResource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class SpringBootStartupReportModuleConfiguration {

  @Bean
  Seed4JModuleResource springBootStartupReportResource(SpringBootStartupReportApplicationService springBootStartupReport) {
    return Seed4JModuleResource.builder()
      .slug(SPRING_BOOT_STARTUP_REPORT)
      .withoutProperties()
      .apiDoc(
        "Spring Boot",
        "Generates an interactive Spring Boot application startup report that lets you understand what contributes to the application startup time and perhaps helps to optimize it"
      )
      .organization(Seed4JModuleOrganization.builder().addDependency(SPRING_BOOT).build())
      .tags("server", "spring", "spring-boot")
      .factory(springBootStartupReport::buildModule);
  }
}
