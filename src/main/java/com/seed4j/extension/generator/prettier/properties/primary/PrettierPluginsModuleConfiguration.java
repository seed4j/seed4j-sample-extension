package com.seed4j.extension.generator.prettier.properties.primary;

import static com.seed4j.extension.shared.slug.domain.Seed4jSampleExtensionModuleSlug.*;
import static com.seed4j.shared.slug.domain.Seed4JCoreModuleSlug.PRETTIER;

import com.seed4j.extension.generator.prettier.properties.application.PrettierPluginsApplicationService;
import com.seed4j.module.domain.resource.Seed4JModuleOrganization;
import com.seed4j.module.domain.resource.Seed4JModulePropertiesDefinition;
import com.seed4j.module.domain.resource.Seed4JModuleResource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class PrettierPluginsModuleConfiguration {

  @Bean
  Seed4JModuleResource prettierPropertiesModule(PrettierPluginsApplicationService prettierPlugins) {
    return Seed4JModuleResource.builder()
      .slug(PRETTIER_PLUGIN_PROPERTIES)
      .propertiesDefinition(Seed4JModulePropertiesDefinition.EMPTY)
      .apiDoc("Prettier", "Format .properties files with prettier")
      .organization(Seed4JModuleOrganization.builder().addDependency(PRETTIER).build())
      .tags("prettier")
      .factory(prettierPlugins::buildPropertiesPluginModule);
  }
}
