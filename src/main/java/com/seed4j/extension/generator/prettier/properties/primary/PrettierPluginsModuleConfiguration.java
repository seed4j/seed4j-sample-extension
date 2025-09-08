package com.seed4j.extension.generator.prettier.properties.primary;

import static com.seed4j.extension.shared.slug.domain.JhliteExtensionSampleModuleSlug.PRETTIER_PLUGIN_PROPERTIES;
import static tech.jhipster.lite.shared.slug.domain.JHLiteModuleSlug.PRETTIER;

import com.seed4j.extension.generator.prettier.properties.application.PrettierPluginsApplicationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.jhipster.lite.module.domain.resource.JHipsterModuleOrganization;
import tech.jhipster.lite.module.domain.resource.JHipsterModulePropertiesDefinition;
import tech.jhipster.lite.module.domain.resource.JHipsterModuleResource;

@Configuration
class PrettierPluginsModuleConfiguration {

  @Bean
  JHipsterModuleResource prettierPropertiesModule(PrettierPluginsApplicationService prettierPlugins) {
    return JHipsterModuleResource.builder()
      .slug(PRETTIER_PLUGIN_PROPERTIES)
      .propertiesDefinition(JHipsterModulePropertiesDefinition.EMPTY)
      .apiDoc("Prettier", "Format .properties files with prettier")
      .organization(JHipsterModuleOrganization.builder().addDependency(PRETTIER).build())
      .tags("prettier")
      .factory(prettierPlugins::buildPropertiesPluginModule);
  }
}
