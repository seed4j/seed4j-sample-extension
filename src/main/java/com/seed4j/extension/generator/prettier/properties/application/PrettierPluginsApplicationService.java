package com.seed4j.extension.generator.prettier.properties.application;

import com.seed4j.extension.generator.prettier.properties.domain.PrettierPluginsModuleFactory;
import com.seed4j.module.domain.Seed4JModule;
import com.seed4j.module.domain.properties.Seed4JModuleProperties;
import org.springframework.stereotype.Service;

@Service
public class PrettierPluginsApplicationService {

  private final PrettierPluginsModuleFactory factory;

  public PrettierPluginsApplicationService() {
    factory = new PrettierPluginsModuleFactory();
  }

  public Seed4JModule buildPropertiesPluginModule(Seed4JModuleProperties properties) {
    return factory.buildPropertiesPluginModule(properties);
  }
}
