package com.seed4j.extension.shared.dependencies.infrastructure.secondary;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import com.seed4j.extension.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import tech.jhipster.lite.module.domain.ProjectFiles;
import tech.jhipster.lite.module.domain.javabuild.VersionSlug;
import tech.jhipster.lite.module.domain.javadependency.JavaDependencyVersion;
import tech.jhipster.lite.module.domain.javadependency.Version;

@UnitTest
@ExtendWith(MockitoExtension.class)
class Seed4jSampleExtensionMavenDependenciesReaderTest {

  @Mock
  private ProjectFiles projectFiles;

  @InjectMocks
  private Seed4jSampleExtensionMavenDependenciesReader reader;

  @Test
  void shouldGetVersionFromCustomSource() {
    mockProjectFiles();

    JavaDependencyVersion version = reader.get().get(new VersionSlug("jacoco"));

    assertThat(version.version()).isEqualTo(new Version("0.8.12"));
  }

  private void mockProjectFiles() {
    when(projectFiles.readString(anyString())).thenReturn(
        """
        <?xml version="1.0" encoding="UTF-8" ?>
        <project
          xmlns="http://maven.apache.org/POM/4.0.0"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd"
        >
          <properties>
            <jacoco.version>0.8.12</jacoco.version>
          </properties>

          <dependencyManagement>
            <dependencies>
              <dependency>
                <groupId>org.jacoco</groupId>
                <artifactId>jacoco-maven-plugin</artifactId>
                <version>${jacoco.version}</version>
              </dependency>
            </dependencies>
          </dependencyManagement>
        </project>
        """
      );
  }
}
