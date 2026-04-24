package com.seed4j.extension.generator.prettier.properties.domain;

import static com.seed4j.extension.shared.dependencies.domain.Seed4jSampleExtensionNodePackagesVersionSource.SEED4J_SAMPLE_EXTENSION;
import static com.seed4j.module.domain.Seed4JModule.*;

import com.seed4j.module.domain.Seed4JModule;
import com.seed4j.module.domain.properties.Seed4JModuleProperties;

public class PrettierPluginsModuleFactory {

  public Seed4JModule buildPropertiesPluginModule(Seed4JModuleProperties properties) {
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
