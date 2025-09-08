package com.seed4j.extension.shared.slug.domain;

import static tech.jhipster.lite.module.domain.resource.JHipsterModuleRank.*;

import com.seed4j.extension.shared.generation.domain.ExcludeFromGeneratedCodeCoverage;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import tech.jhipster.lite.module.domain.resource.JHipsterModuleRank;
import tech.jhipster.lite.module.domain.resource.JHipsterModuleSlugFactory;

@ExcludeFromGeneratedCodeCoverage
public enum Seed4jSampleExtensionModuleSlug implements JHipsterModuleSlugFactory {
  BANNER_JHIPSTER_V2("banner-jhipster-v2", RANK_D),
  BANNER_JHIPSTER_V3("banner-jhipster-v3", RANK_D),
  BANNER_JHIPSTER_V7("banner-jhipster-v7", RANK_D),
  BANNER_JHIPSTER_V7_REACT("banner-jhipster-v7-react", RANK_D),
  BANNER_JHIPSTER_V7_VUE("banner-jhipster-v7-vue", RANK_D),
  PRETTIER_PLUGIN_PROPERTIES("prettier-plugin-properties", RANK_D),
  SPRING_BOOT_STARTUP_REPORT("spring-boot-startup-report", RANK_D);

  // Add here the slugs of your modules
  // e.g.: MY_MODULE("my-module", JHipsterModuleRank.RANK_B),
  private static final Map<String, Seed4jSampleExtensionModuleSlug> moduleSlugMap = Stream.of(values()).collect(
    Collectors.toMap(Seed4jSampleExtensionModuleSlug::get, Function.identity())
  );
  private final String slug;
  private final JHipsterModuleRank rank;

  @SuppressWarnings("java:S1144")
  Seed4jSampleExtensionModuleSlug(String slug, JHipsterModuleRank rank) {
    this.slug = slug;
    this.rank = rank;
  }

  @Override
  public String get() {
    return slug;
  }

  @Override
  public JHipsterModuleRank rank() {
    return rank;
  }

  public static Optional<Seed4jSampleExtensionModuleSlug> fromString(String slug) {
    return Optional.ofNullable(moduleSlugMap.get(slug));
  }
}
