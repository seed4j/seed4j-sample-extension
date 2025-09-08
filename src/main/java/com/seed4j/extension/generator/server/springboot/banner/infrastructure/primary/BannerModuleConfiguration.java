package com.seed4j.extension.generator.server.springboot.banner.infrastructure.primary;

import static com.seed4j.extension.shared.slug.domain.JhliteExtensionSampleFeatureSlug.*;
import static com.seed4j.extension.shared.slug.domain.JhliteExtensionSampleModuleSlug.*;

import com.seed4j.extension.generator.server.springboot.banner.application.BannerApplicationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.jhipster.lite.module.domain.resource.JHipsterModuleOrganization;
import tech.jhipster.lite.module.domain.resource.JHipsterModuleResource;

@Configuration
class BannerModuleConfiguration {

  private static final String GROUP = "Spring Boot - Banner";
  private static final String SERVER = "server";
  private static final String SPRING = "spring";
  private static final String SPRING_BOOT_TAG = "spring-boot";
  private static final String BANNER_TAG = "banner";

  @Bean
  JHipsterModuleResource jhipsterV7BannerResource(BannerApplicationService banners) {
    return JHipsterModuleResource.builder()
      .slug(BANNER_JHIPSTER_V7)
      .withoutProperties()
      .apiDoc(GROUP, "Add banner JHipster v7 for Angular")
      .organization(organization())
      .tags(SERVER, SPRING, SPRING_BOOT_TAG, BANNER_TAG)
      .factory(banners::buildJHipsterV7Banner);
  }

  @Bean
  JHipsterModuleResource jhipsterV7ReactBannerResource(BannerApplicationService banners) {
    return JHipsterModuleResource.builder()
      .slug(BANNER_JHIPSTER_V7_REACT)
      .withoutProperties()
      .apiDoc(GROUP, "Add banner JHipster v7 for React")
      .organization(organization())
      .tags(SERVER, SPRING, SPRING_BOOT_TAG, BANNER_TAG)
      .factory(banners::buildJHipsterV7ReactBanner);
  }

  @Bean
  JHipsterModuleResource jhipsterV7VueBannerResource(BannerApplicationService banners) {
    return JHipsterModuleResource.builder()
      .slug(BANNER_JHIPSTER_V7_VUE)
      .withoutProperties()
      .apiDoc(GROUP, "Add banner JHipster v7 for Vue")
      .organization(organization())
      .tags(SERVER, SPRING, SPRING_BOOT_TAG, BANNER_TAG)
      .factory(banners::buildJHipsterV7VueBanner);
  }

  @Bean
  JHipsterModuleResource jhipsterV2BannerResource(BannerApplicationService banners) {
    return JHipsterModuleResource.builder()
      .slug(BANNER_JHIPSTER_V2)
      .withoutProperties()
      .apiDoc(GROUP, "Add banner JHipster v2")
      .organization(organization())
      .tags(SERVER, SPRING, SPRING_BOOT_TAG, BANNER_TAG)
      .factory(banners::buildJHipsterV2Banner);
  }

  @Bean
  JHipsterModuleResource jhipsterV3BannerResource(BannerApplicationService banners) {
    return JHipsterModuleResource.builder()
      .slug(BANNER_JHIPSTER_V3)
      .withoutProperties()
      .apiDoc(GROUP, "Add banner JHipster v3")
      .organization(organization())
      .tags(SERVER, SPRING, SPRING_BOOT_TAG, BANNER_TAG)
      .factory(banners::buildJHipsterV3Banner);
  }

  private JHipsterModuleOrganization organization() {
    return JHipsterModuleOrganization.builder()
      .feature(BANNER)
      .addDependency(tech.jhipster.lite.shared.slug.domain.JHLiteModuleSlug.SPRING_BOOT)
      .build();
  }
}
