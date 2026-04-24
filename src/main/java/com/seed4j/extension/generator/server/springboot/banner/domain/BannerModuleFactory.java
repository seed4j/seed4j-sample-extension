package com.seed4j.extension.generator.server.springboot.banner.domain;

import static com.seed4j.module.domain.Seed4JModule.*;

import com.seed4j.module.domain.Seed4JModule;
import com.seed4j.module.domain.file.Seed4JDestination;
import com.seed4j.module.domain.file.Seed4JSource;
import com.seed4j.module.domain.properties.Seed4JModuleProperties;
import com.seed4j.shared.error.domain.Assert;

public class BannerModuleFactory {

  private static final String SOURCE_FOLDER = "server/springboot/banner";
  private static final String PROPERTIES = "properties";

  public Seed4JModule buildModuleBannerJHipsterV7(Seed4JModuleProperties properties) {
    Assert.notNull(PROPERTIES, properties);
    return buildModuleBanner(properties, "banner-jhipster-v7.txt");
  }

  public Seed4JModule buildModuleBannerJHipsterV7React(Seed4JModuleProperties properties) {
    Assert.notNull(PROPERTIES, properties);
    return buildModuleBanner(properties, "banner-jhipster-v7-react.txt");
  }

  public Seed4JModule buildModuleBannerJHipsterV7Vue(Seed4JModuleProperties properties) {
    Assert.notNull(PROPERTIES, properties);
    return buildModuleBanner(properties, "banner-jhipster-v7-vue.txt");
  }

  public Seed4JModule buildModuleBannerJHipsterV2(Seed4JModuleProperties properties) {
    Assert.notNull(PROPERTIES, properties);
    return buildModuleBanner(properties, "banner-jhipster-v2.txt");
  }

  public Seed4JModule buildModuleBannerJHipsterV3(Seed4JModuleProperties properties) {
    Assert.notNull(PROPERTIES, properties);
    return buildModuleBanner(properties, "banner-jhipster-v3.txt");
  }

  private Seed4JModule buildModuleBanner(Seed4JModuleProperties properties, String file) {
    // @formatter:off
    return moduleBuilder(properties)
      .files()
      .add(source().file(file), destination())
      .and()
      .build();
    // @formatter:on
  }

  private Seed4JSource source() {
    return from(SOURCE_FOLDER);
  }

  private Seed4JDestination destination() {
    return new Seed4JDestination("src/main/resources").append("banner.txt");
  }
}
