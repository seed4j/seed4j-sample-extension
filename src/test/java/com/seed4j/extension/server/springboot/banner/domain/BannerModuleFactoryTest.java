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
  @DisplayName("JHipster Banner V7")
  void shouldCreateModuleJHipsterBannerV7() {
    Seed4JModule module = factory.buildModuleBannerJHipsterV7(testModuleProperties());

    assertThatModule(module).hasFiles(BANNER_TXT);
  }

  @Test
  @DisplayName("JHipster Banner V7 React")
  void shouldCreateModuleJHipsterBannerV7React() {
    Seed4JModule module = factory.buildModuleBannerJHipsterV7React(testModuleProperties());

    assertThatModule(module).hasFiles(BANNER_TXT);
  }

  @Test
  @DisplayName("JHipster Banner V7 Vue")
  void shouldCreateModuleJHipsterBannerV7Vue() {
    Seed4JModule module = factory.buildModuleBannerJHipsterV7Vue(testModuleProperties());

    assertThatModule(module).hasFiles(BANNER_TXT);
  }

  @Test
  @DisplayName("JHipster Banner V2")
  void shouldCreateModuleJHipsterBannerV2() {
    Seed4JModule module = factory.buildModuleBannerJHipsterV2(testModuleProperties());

    assertThatModule(module).hasFiles(BANNER_TXT);
  }

  @Test
  @DisplayName("JHipster Banner V3")
  void shouldCreateModuleJHipsterBannerV3() {
    Seed4JModule module = factory.buildModuleBannerJHipsterV3(testModuleProperties());

    assertThatModule(module).hasFiles(BANNER_TXT);
  }
}
