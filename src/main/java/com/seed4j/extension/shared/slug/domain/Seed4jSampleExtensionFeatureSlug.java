package com.seed4j.extension.shared.slug.domain;

import com.seed4j.extension.shared.generation.domain.ExcludeFromGeneratedCodeCoverage;
import com.seed4j.module.domain.resource.Seed4JFeatureSlugFactory;

@ExcludeFromGeneratedCodeCoverage
public enum Seed4jSampleExtensionFeatureSlug implements Seed4JFeatureSlugFactory {
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
