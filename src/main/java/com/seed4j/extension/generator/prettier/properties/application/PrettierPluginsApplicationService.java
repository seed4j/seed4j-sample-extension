package com.seed4j.extension.generator.prettier.properties.application;

import com.seed4j.extension.generator.prettier.properties.domain.PrettierPluginsModuleFactory;
import org.springframework.stereotype.Service;
import tech.jhipster.lite.module.domain.JHipsterModule;
import tech.jhipster.lite.module.domain.properties.JHipsterModuleProperties;

@Service
public class PrettierPluginsApplicationService {

  private final PrettierPluginsModuleFactory factory;

  public PrettierPluginsApplicationService() {
    factory = new PrettierPluginsModuleFactory();
  }

  public JHipsterModule buildPropertiesPluginModule(JHipsterModuleProperties properties) {
    return factory.buildPropertiesPluginModule(properties);
  }
}
