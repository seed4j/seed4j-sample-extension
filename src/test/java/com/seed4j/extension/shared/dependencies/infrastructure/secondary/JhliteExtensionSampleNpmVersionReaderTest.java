package com.seed4j.extension.shared.dependencies.infrastructure.secondary;

import static com.seed4j.extension.shared.dependencies.domain.JhliteExtensionSampleNpmVersionSource.JHLITE_EXTENSION_SAMPLE;
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
import tech.jhipster.lite.module.domain.nodejs.NodePackageName;
import tech.jhipster.lite.module.domain.nodejs.NodePackageVersion;

@UnitTest
@ExtendWith(MockitoExtension.class)
class JhliteExtensionSampleNpmVersionReaderTest {

  @Mock
  private ProjectFiles projectFiles;

  @InjectMocks
  private JhliteExtensionSampleNpmVersionReader reader;

  @Test
  void shouldGetVersionFromCustomSource() {
    mockProjectFiles();

    NodePackageVersion version = reader.get().get(new NodePackageName("vue"), JHLITE_EXTENSION_SAMPLE.build());

    assertThat(version).isEqualTo(new NodePackageVersion("1.2.3"));
  }

  private void mockProjectFiles() {
    when(projectFiles.readString(anyString())).thenReturn(
        """
        {
          "dependencies": {
            "vue": "1.2.3"
          },
        }
        """
      );
  }
}
