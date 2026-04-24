package com.seed4j.extension.generator.server.springboot.banner.application;

import com.seed4j.extension.generator.server.springboot.banner.domain.BannerModuleFactory;
import com.seed4j.module.domain.Seed4JModule;
import com.seed4j.module.domain.properties.Seed4JModuleProperties;
import org.springframework.stereotype.Service;

@Service
public class BannerApplicationService {

  private final BannerModuleFactory factory;

  public BannerApplicationService() {
    this.factory = new BannerModuleFactory();
  }

  public Seed4JModule buildJHipsterV7Banner(Seed4JModuleProperties properties) {
    return factory.buildModuleBannerJHipsterV7(properties);
  }

  public Seed4JModule buildJHipsterV7ReactBanner(Seed4JModuleProperties properties) {
    return factory.buildModuleBannerJHipsterV7React(properties);
  }

  public Seed4JModule buildJHipsterV7VueBanner(Seed4JModuleProperties properties) {
    return factory.buildModuleBannerJHipsterV7Vue(properties);
  }

  public Seed4JModule buildJHipsterV2Banner(Seed4JModuleProperties properties) {
    return factory.buildModuleBannerJHipsterV2(properties);
  }

  public Seed4JModule buildJHipsterV3Banner(Seed4JModuleProperties properties) {
    return factory.buildModuleBannerJHipsterV3(properties);
  }
}
