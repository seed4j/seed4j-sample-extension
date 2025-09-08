package com.seed4j.extension.shared.dependencies.infrastructure.secondary;

import com.seed4j.extension.shared.dependencies.domain.JhliteExtensionSampleNpmVersionSource;
import java.util.List;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;
import tech.jhipster.lite.module.domain.ProjectFiles;
import tech.jhipster.lite.module.domain.nodejs.NodePackagesVersions;
import tech.jhipster.lite.module.infrastructure.secondary.nodejs.FileSystemNodePackagesVersionReader;
import tech.jhipster.lite.module.infrastructure.secondary.nodejs.NodePackagesVersionsReader;

@Repository
@Order(Ordered.HIGHEST_PRECEDENCE)
public class JhliteExtensionSampleNpmVersionReader implements NodePackagesVersionsReader {

  private static final String PARENT_FOLDER = "/generator/jhlite-extension-sample-dependencies/";

  private final FileSystemNodePackagesVersionReader reader;

  public JhliteExtensionSampleNpmVersionReader(ProjectFiles projectFiles) {
    reader = new FileSystemNodePackagesVersionReader(projectFiles, List.of(JhliteExtensionSampleNpmVersionSource.values()), PARENT_FOLDER);
  }

  @Override
  public NodePackagesVersions get() {
    return reader.get();
  }
}
