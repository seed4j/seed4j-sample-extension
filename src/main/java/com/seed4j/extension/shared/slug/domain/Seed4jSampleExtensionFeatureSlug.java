package com.seed4j.extension.shared.slug.domain;

import com.seed4j.extension.shared.generation.domain.ExcludeFromGeneratedCodeCoverage;
import tech.jhipster.lite.module.domain.resource.JHipsterFeatureSlugFactory;

@ExcludeFromGeneratedCodeCoverage
public enum Seed4jSampleExtensionFeatureSlug implements JHipsterFeatureSlugFactory {
  BANNER("banner");

  // Add here the slugs of your features
  // e.g.: MY_FEATURE("my-feature")
  private final String slug;

  @SuppressWarnings("java:S1144")
  Seed4jSampleExtensionFeatureSlug(String slug) {
    this.slug = slug;
  }

  @Override
  public String get() {
    return slug;
  }
}
