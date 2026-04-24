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

  public Seed4JModule buildModuleBannerSeed4JV7(Seed4JModuleProperties properties) {
    Assert.notNull(PROPERTIES, properties);
    return buildModuleBanner(properties, "banner-seed4j-v7.txt");
  }

  public Seed4JModule buildModuleBannerSeed4JV7React(Seed4JModuleProperties properties) {
    Assert.notNull(PROPERTIES, properties);
    return buildModuleBanner(properties, "banner-seed4j-v7-react.txt");
  }

  public Seed4JModule buildModuleBannerSeed4JV7Vue(Seed4JModuleProperties properties) {
    Assert.notNull(PROPERTIES, properties);
    return buildModuleBanner(properties, "banner-seed4j-v7-vue.txt");
  }

  public Seed4JModule buildModuleBannerSeed4JV2(Seed4JModuleProperties properties) {
    Assert.notNull(PROPERTIES, properties);
    return buildModuleBanner(properties, "banner-seed4j-v2.txt");
  }

  public Seed4JModule buildModuleBannerSeed4JV3(Seed4JModuleProperties properties) {
    Assert.notNull(PROPERTIES, properties);
    return buildModuleBanner(properties, "banner-seed4j-v3.txt");
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
