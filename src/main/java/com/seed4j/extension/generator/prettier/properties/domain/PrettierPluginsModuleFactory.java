package com.seed4j.extension.generator.prettier.properties.domain;

import static com.seed4j.extension.shared.dependencies.domain.Seed4jSampleExtensionNodePackagesVersionSource.SEED4J_SAMPLE_EXTENSION;
import static tech.jhipster.lite.module.domain.JHipsterModule.*;

import tech.jhipster.lite.module.domain.JHipsterModule;
import tech.jhipster.lite.module.domain.properties.JHipsterModuleProperties;

public class PrettierPluginsModuleFactory {

  public JHipsterModule buildPropertiesPluginModule(JHipsterModuleProperties properties) {
    //@formatter:off
    return moduleBuilder(properties)
      .packageJson()
        .addDevDependency(packageName("prettier-plugin-properties"), SEED4J_SAMPLE_EXTENSION)
        .and()
      .preCommitActions(stagedFilesFilter("*.properties"), preCommitCommands("prettier --write"))
      .build();
    //@formatter:on
  }
}
