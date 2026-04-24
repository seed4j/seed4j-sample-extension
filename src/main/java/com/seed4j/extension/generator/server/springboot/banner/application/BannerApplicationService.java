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

  public Seed4JModule buildSeed4JV7Banner(Seed4JModuleProperties properties) {
    return factory.buildModuleBannerSeed4JV7(properties);
  }

  public Seed4JModule buildSeed4JV7ReactBanner(Seed4JModuleProperties properties) {
    return factory.buildModuleBannerSeed4JV7React(properties);
  }

  public Seed4JModule buildSeed4JV7VueBanner(Seed4JModuleProperties properties) {
    return factory.buildModuleBannerSeed4JV7Vue(properties);
  }

  public Seed4JModule buildSeed4JV2Banner(Seed4JModuleProperties properties) {
    return factory.buildModuleBannerSeed4JV2(properties);
  }

  public Seed4JModule buildSeed4JV3Banner(Seed4JModuleProperties properties) {
    return factory.buildModuleBannerSeed4JV3(properties);
  }
}
