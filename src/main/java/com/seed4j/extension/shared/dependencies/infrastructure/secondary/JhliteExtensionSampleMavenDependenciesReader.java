package com.seed4j.extension.shared.dependencies.infrastructure.secondary;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;
import tech.jhipster.lite.module.domain.ProjectFiles;
import tech.jhipster.lite.module.domain.javadependency.JavaDependenciesVersions;
import tech.jhipster.lite.module.infrastructure.secondary.javadependency.FileSystemMavenDependenciesReader;
import tech.jhipster.lite.module.infrastructure.secondary.javadependency.JavaDependenciesReader;

@Repository
@Order(Ordered.HIGHEST_PRECEDENCE)
public class JhliteExtensionSampleMavenDependenciesReader implements JavaDependenciesReader {

  private static final String CURRENT_VERSIONS_FILE = "/generator/jhlite-extension-sample-dependencies/pom.xml";

  private final FileSystemMavenDependenciesReader reader;

  public JhliteExtensionSampleMavenDependenciesReader(ProjectFiles files) {
    this.reader = new FileSystemMavenDependenciesReader(files, CURRENT_VERSIONS_FILE);
  }

  @Override
  public JavaDependenciesVersions get() {
    return reader.get();
  }
}
