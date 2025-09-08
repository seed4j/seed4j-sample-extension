package com.seed4j.extension.generator.server.springboot.banner.application;

import com.seed4j.extension.generator.server.springboot.banner.domain.BannerModuleFactory;
import org.springframework.stereotype.Service;
import tech.jhipster.lite.module.domain.JHipsterModule;
import tech.jhipster.lite.module.domain.properties.JHipsterModuleProperties;

@Service
public class BannerApplicationService {

  private final BannerModuleFactory factory;

  public BannerApplicationService() {
    this.factory = new BannerModuleFactory();
  }

  public JHipsterModule buildJHipsterV7Banner(JHipsterModuleProperties properties) {
    return factory.buildModuleBannerJHipsterV7(properties);
  }

  public JHipsterModule buildJHipsterV7ReactBanner(JHipsterModuleProperties properties) {
    return factory.buildModuleBannerJHipsterV7React(properties);
  }

  public JHipsterModule buildJHipsterV7VueBanner(JHipsterModuleProperties properties) {
    return factory.buildModuleBannerJHipsterV7Vue(properties);
  }

  public JHipsterModule buildJHipsterV2Banner(JHipsterModuleProperties properties) {
    return factory.buildModuleBannerJHipsterV2(properties);
  }

  public JHipsterModule buildJHipsterV3Banner(JHipsterModuleProperties properties) {
    return factory.buildModuleBannerJHipsterV3(properties);
  }
}
