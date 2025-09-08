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
public enum JhliteExtensionSampleModuleSlug implements JHipsterModuleSlugFactory {
  BANNER_JHIPSTER_V2("banner-jhipster-v2", RANK_D),
  BANNER_JHIPSTER_V3("banner-jhipster-v3", RANK_D),
  BANNER_JHIPSTER_V7("banner-jhipster-v7", RANK_D),
  BANNER_JHIPSTER_V7_REACT("banner-jhipster-v7-react", RANK_D),
  BANNER_JHIPSTER_V7_VUE("banner-jhipster-v7-vue", RANK_D),
  PRETTIER_PLUGIN_PROPERTIES("prettier-plugin-properties", RANK_D),
  SPRING_BOOT_STARTUP_REPORT("spring-boot-startup-report", RANK_D);

  private static final Map<String, JhliteExtensionSampleModuleSlug> moduleSlugMap = Stream.of(values()).collect(
    Collectors.toMap(JhliteExtensionSampleModuleSlug::get, Function.identity())
  );
  private final String slug;
  private final JHipsterModuleRank rank;

  @SuppressWarnings("java:S1144")
  JhliteExtensionSampleModuleSlug(String slug, JHipsterModuleRank rank) {
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

  public static Optional<JhliteExtensionSampleModuleSlug> fromString(String slug) {
    return Optional.ofNullable(moduleSlugMap.get(slug));
  }
}
