package com.seed4j.extension.shared.dependencies.infrastructure.secondary;

import com.seed4j.module.domain.ProjectFiles;
import com.seed4j.module.domain.javadependency.JavaDependenciesVersions;
import com.seed4j.module.infrastructure.secondary.javadependency.FileSystemMavenDependenciesReader;
import com.seed4j.module.infrastructure.secondary.javadependency.JavaDependenciesReader;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;

@Repository
@Order(Ordered.HIGHEST_PRECEDENCE)
public class Seed4jSampleExtensionMavenDependenciesReader implements JavaDependenciesReader {

  private static final String CURRENT_VERSIONS_FILE = "/generator/seed4j-sample-extension-dependencies/pom.xml";

  private final FileSystemMavenDependenciesReader reader;

  public Seed4jSampleExtensionMavenDependenciesReader(ProjectFiles files) {
    this.reader = new FileSystemMavenDependenciesReader(files, CURRENT_VERSIONS_FILE);
  }

  @Override
  public JavaDependenciesVersions get() {
    return reader.get();
  }
}
