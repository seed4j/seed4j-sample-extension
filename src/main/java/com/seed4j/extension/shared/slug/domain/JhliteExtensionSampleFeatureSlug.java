package com.seed4j.extension.shared.slug.domain;

import tech.jhipster.lite.module.domain.resource.JHipsterFeatureSlugFactory;

public enum JhliteExtensionSampleFeatureSlug implements JHipsterFeatureSlugFactory {
  BANNER("banner");

  private final String slug;

  @SuppressWarnings("java:S1144")
  JhliteExtensionSampleFeatureSlug(String slug) {
    this.slug = slug;
  }

  @Override
  public String get() {
    return slug;
  }
}
