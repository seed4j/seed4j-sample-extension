package com.seed4j.extension.generator.server.springboot.banner.infrastructure.primary;

import static com.seed4j.extension.shared.slug.domain.Seed4jSampleExtensionFeatureSlug.*;
import static com.seed4j.extension.shared.slug.domain.Seed4jSampleExtensionModuleSlug.*;

import com.seed4j.extension.generator.server.springboot.banner.application.BannerApplicationService;
import com.seed4j.module.domain.resource.Seed4JModuleOrganization;
import com.seed4j.module.domain.resource.Seed4JModuleResource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class BannerModuleConfiguration {

  private static final String GROUP = "Spring Boot - Banner";
  private static final String SERVER = "server";
  private static final String SPRING = "spring";
  private static final String SPRING_BOOT_TAG = "spring-boot";
  private static final String BANNER_TAG = "banner";

  @Bean
  Seed4JModuleResource seed4JV7BannerResource(BannerApplicationService banners) {
    return Seed4JModuleResource.builder()
      .slug(BANNER_SEED4J_V7)
      .withoutProperties()
      .apiDoc(GROUP, "Add banner Seed4J v7 for Angular")
      .organization(organization())
      .tags(SERVER, SPRING, SPRING_BOOT_TAG, BANNER_TAG)
      .factory(banners::buildSeed4JV7Banner);
  }

  @Bean
  Seed4JModuleResource seed4JV7ReactBannerResource(BannerApplicationService banners) {
    return Seed4JModuleResource.builder()
      .slug(BANNER_SEED4J_V7_REACT)
      .withoutProperties()
      .apiDoc(GROUP, "Add banner Seed4J v7 for React")
      .organization(organization())
      .tags(SERVER, SPRING, SPRING_BOOT_TAG, BANNER_TAG)
      .factory(banners::buildSeed4JV7ReactBanner);
  }

  @Bean
  Seed4JModuleResource seed4JV7VueBannerResource(BannerApplicationService banners) {
    return Seed4JModuleResource.builder()
      .slug(BANNER_SEED4J_V7_VUE)
      .withoutProperties()
      .apiDoc(GROUP, "Add banner Seed4J v7 for Vue")
      .organization(organization())
      .tags(SERVER, SPRING, SPRING_BOOT_TAG, BANNER_TAG)
      .factory(banners::buildSeed4JV7VueBanner);
  }

  @Bean
  Seed4JModuleResource seed4JV2BannerResource(BannerApplicationService banners) {
    return Seed4JModuleResource.builder()
      .slug(BANNER_SEED4J_V2)
      .withoutProperties()
      .apiDoc(GROUP, "Add banner Seed4J v2")
      .organization(organization())
      .tags(SERVER, SPRING, SPRING_BOOT_TAG, BANNER_TAG)
      .factory(banners::buildSeed4JV2Banner);
  }

  @Bean
  Seed4JModuleResource seed4JV3BannerResource(BannerApplicationService banners) {
    return Seed4JModuleResource.builder()
      .slug(BANNER_SEED4J_V3)
      .withoutProperties()
      .apiDoc(GROUP, "Add banner Seed4J v3")
      .organization(organization())
      .tags(SERVER, SPRING, SPRING_BOOT_TAG, BANNER_TAG)
      .factory(banners::buildSeed4JV3Banner);
  }

  private Seed4JModuleOrganization organization() {
    return Seed4JModuleOrganization.builder()
      .feature(BANNER)
      .addDependency(com.seed4j.shared.slug.domain.Seed4JCoreModuleSlug.SPRING_BOOT)
      .build();
  }
}
