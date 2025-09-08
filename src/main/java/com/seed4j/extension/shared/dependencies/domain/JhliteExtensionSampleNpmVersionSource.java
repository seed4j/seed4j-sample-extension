package com.seed4j.extension.shared.dependencies.domain;

import tech.jhipster.lite.module.domain.nodejs.NodePackagesVersionSource;
import tech.jhipster.lite.module.domain.nodejs.NodePackagesVersionSourceFactory;

public enum JhliteExtensionSampleNpmVersionSource implements NodePackagesVersionSourceFactory {
  JHLITE_EXTENSION_SAMPLE("jhlite-extension-sample");

  private final String source;

  JhliteExtensionSampleNpmVersionSource(String source) {
    this.source = source;
  }

  @Override
  public NodePackagesVersionSource build() {
    return new NodePackagesVersionSource(source);
  }
}
