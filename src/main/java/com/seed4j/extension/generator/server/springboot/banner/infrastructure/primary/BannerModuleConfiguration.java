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
  Seed4JModuleResource jhipsterV7BannerResource(BannerApplicationService banners) {
    return Seed4JModuleResource.builder()
      .slug(BANNER_JHIPSTER_V7)
      .withoutProperties()
      .apiDoc(GROUP, "Add banner JHipster v7 for Angular")
      .organization(organization())
      .tags(SERVER, SPRING, SPRING_BOOT_TAG, BANNER_TAG)
      .factory(banners::buildJHipsterV7Banner);
  }

  @Bean
  Seed4JModuleResource jhipsterV7ReactBannerResource(BannerApplicationService banners) {
    return Seed4JModuleResource.builder()
      .slug(BANNER_JHIPSTER_V7_REACT)
      .withoutProperties()
      .apiDoc(GROUP, "Add banner JHipster v7 for React")
      .organization(organization())
      .tags(SERVER, SPRING, SPRING_BOOT_TAG, BANNER_TAG)
      .factory(banners::buildJHipsterV7ReactBanner);
  }

  @Bean
  Seed4JModuleResource jhipsterV7VueBannerResource(BannerApplicationService banners) {
    return Seed4JModuleResource.builder()
      .slug(BANNER_JHIPSTER_V7_VUE)
      .withoutProperties()
      .apiDoc(GROUP, "Add banner JHipster v7 for Vue")
      .organization(organization())
      .tags(SERVER, SPRING, SPRING_BOOT_TAG, BANNER_TAG)
      .factory(banners::buildJHipsterV7VueBanner);
  }

  @Bean
  Seed4JModuleResource jhipsterV2BannerResource(BannerApplicationService banners) {
    return Seed4JModuleResource.builder()
      .slug(BANNER_JHIPSTER_V2)
      .withoutProperties()
      .apiDoc(GROUP, "Add banner JHipster v2")
      .organization(organization())
      .tags(SERVER, SPRING, SPRING_BOOT_TAG, BANNER_TAG)
      .factory(banners::buildJHipsterV2Banner);
  }

  @Bean
  Seed4JModuleResource jhipsterV3BannerResource(BannerApplicationService banners) {
    return Seed4JModuleResource.builder()
      .slug(BANNER_JHIPSTER_V3)
      .withoutProperties()
      .apiDoc(GROUP, "Add banner JHipster v3")
      .organization(organization())
      .tags(SERVER, SPRING, SPRING_BOOT_TAG, BANNER_TAG)
      .factory(banners::buildJHipsterV3Banner);
  }

  private Seed4JModuleOrganization organization() {
    return Seed4JModuleOrganization.builder()
      .feature(BANNER)
      .addDependency(com.seed4j.shared.slug.domain.Seed4JCoreModuleSlug.SPRING_BOOT)
      .build();
  }
}
