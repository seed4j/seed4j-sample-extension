package com.seed4j.extension.shared.slug.domain;

import static com.seed4j.module.domain.resource.Seed4JModuleRank.*;

import com.seed4j.extension.shared.generation.domain.ExcludeFromGeneratedCodeCoverage;
import com.seed4j.module.domain.resource.Seed4JModuleRank;
import com.seed4j.module.domain.resource.Seed4JModuleSlugFactory;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@ExcludeFromGeneratedCodeCoverage
public enum Seed4jSampleExtensionModuleSlug implements Seed4JModuleSlugFactory {
  BANNER_SEED4J_V2("banner-seed4j-v2", RANK_D),
  BANNER_SEED4J_V3("banner-seed4j-v3", RANK_D),
  BANNER_SEED4J_V7("banner-seed4j-v7", RANK_D),
  BANNER_SEED4J_V7_REACT("banner-seed4j-v7-react", RANK_D),
  BANNER_SEED4J_V7_VUE("banner-seed4j-v7-vue", RANK_D),
  PRETTIER_PLUGIN_PROPERTIES("prettier-plugin-properties", RANK_D),
  SPRING_BOOT_STARTUP_REPORT("spring-boot-startup-report", RANK_D);

  // Add here the slugs of your modules
  // e.g.: MY_MODULE("my-module", Seed4JModuleRank.RANK_B),
  private static final Map<String, Seed4jSampleExtensionModuleSlug> moduleSlugMap = Stream.of(values()).collect(
    Collectors.toMap(Seed4jSampleExtensionModuleSlug::get, Function.identity())
  );
  private final String slug;
  private final Seed4JModuleRank rank;

  @SuppressWarnings("java:S1144")
  Seed4jSampleExtensionModuleSlug(String slug, Seed4JModuleRank rank) {
    this.slug = slug;
    this.rank = rank;
  }

  @Override
  public String get() {
    return slug;
  }

  @Override
  public Seed4JModuleRank rank() {
    return rank;
  }

  public static Optional<Seed4jSampleExtensionModuleSlug> fromString(String slug) {
    return Optional.ofNullable(moduleSlugMap.get(slug));
  }
}
