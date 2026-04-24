package com.seed4j.extension.server.springboot.banner.domain;

import static com.seed4j.module.domain.Seed4JModulesFixture.*;
import static com.seed4j.module.infrastructure.secondary.Seed4JModulesAssertions.*;

import com.seed4j.UnitTest;
import com.seed4j.extension.generator.server.springboot.banner.domain.BannerModuleFactory;
import com.seed4j.module.domain.Seed4JModule;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@UnitTest
class BannerModuleFactoryTest {

  private static final BannerModuleFactory factory = new BannerModuleFactory();
  private static final String BANNER_TXT = "src/main/resources/banner.txt";

  @Test
  @DisplayName("Seed4J Banner V7")
  void shouldCreateModuleSeed4JBannerV7() {
    Seed4JModule module = factory.buildModuleBannerSeed4JV7(testModuleProperties());

    assertThatModule(module).hasFiles(BANNER_TXT);
  }

  @Test
  @DisplayName("Seed4J Banner V7 React")
  void shouldCreateModuleSeed4JBannerV7React() {
    Seed4JModule module = factory.buildModuleBannerSeed4JV7React(testModuleProperties());

    assertThatModule(module).hasFiles(BANNER_TXT);
  }

  @Test
  @DisplayName("Seed4J Banner V7 Vue")
  void shouldCreateModuleSeed4JBannerV7Vue() {
    Seed4JModule module = factory.buildModuleBannerSeed4JV7Vue(testModuleProperties());

    assertThatModule(module).hasFiles(BANNER_TXT);
  }

  @Test
  @DisplayName("Seed4J Banner V2")
  void shouldCreateModuleSeed4JBannerV2() {
    Seed4JModule module = factory.buildModuleBannerSeed4JV2(testModuleProperties());

    assertThatModule(module).hasFiles(BANNER_TXT);
  }

  @Test
  @DisplayName("Seed4J Banner V3")
  void shouldCreateModuleSeed4JBannerV3() {
    Seed4JModule module = factory.buildModuleBannerSeed4JV3(testModuleProperties());

    assertThatModule(module).hasFiles(BANNER_TXT);
  }
}
