package com.seed4j.extension.generator.server.springboot.startupreport.infrastructure.primary;

import static com.seed4j.extension.shared.slug.domain.JhliteExtensionSampleModuleSlug.*;
import static tech.jhipster.lite.shared.slug.domain.JHLiteModuleSlug.SPRING_BOOT;

import com.seed4j.extension.generator.server.springboot.startupreport.application.SpringBootStartupReportApplicationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.jhipster.lite.module.domain.resource.JHipsterModuleOrganization;
import tech.jhipster.lite.module.domain.resource.JHipsterModuleResource;

@Configuration
class SpringBootStartupReportModuleConfiguration {

  @Bean
  JHipsterModuleResource springBootStartupReportResource(SpringBootStartupReportApplicationService springBootStartupReport) {
    return JHipsterModuleResource.builder()
      .slug(SPRING_BOOT_STARTUP_REPORT)
      .withoutProperties()
      .apiDoc(
        "Spring Boot",
        "Generates an interactive Spring Boot application startup report that lets you understand what contributes to the application startup time and perhaps helps to optimize it"
      )
      .organization(JHipsterModuleOrganization.builder().addDependency(SPRING_BOOT).build())
      .tags("server", "spring", "spring-boot")
      .factory(springBootStartupReport::buildModule);
  }
}
