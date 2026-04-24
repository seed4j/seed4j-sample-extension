package com.seed4j.extension.shared.dependencies.domain;

import com.seed4j.module.domain.nodejs.NodePackagesVersionSource;
import com.seed4j.module.domain.nodejs.NodePackagesVersionSourceFactory;

public enum Seed4jSampleExtensionNodePackagesVersionSource implements NodePackagesVersionSourceFactory {
  SEED4J_SAMPLE_EXTENSION("seed4j-sample-extension");

  private final String source;

  Seed4jSampleExtensionNodePackagesVersionSource(String source) {
    this.source = source;
  }

  @Override
  public NodePackagesVersionSource build() {
    return new NodePackagesVersionSource(source);
  }
}
