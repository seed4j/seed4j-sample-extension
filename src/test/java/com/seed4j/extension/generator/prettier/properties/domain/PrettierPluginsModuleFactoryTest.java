package com.seed4j.extension.generator.prettier.properties.domain;

import static com.seed4j.module.infrastructure.secondary.Seed4JModulesAssertions.*;

import com.seed4j.TestFileUtils;
import com.seed4j.extension.UnitTest;
import com.seed4j.extension.shared.dependencies.infrastructure.secondary.Seed4jSampleExtensionNodePackagesVersionsReader;
import com.seed4j.module.domain.Seed4JModule;
import com.seed4j.module.domain.Seed4JModulesFixture;
import com.seed4j.module.domain.properties.Seed4JModuleProperties;
import com.seed4j.module.infrastructure.secondary.FileSystemProjectFiles;
import com.seed4j.module.infrastructure.secondary.TestSeed4JModules;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@UnitTest
class PrettierPluginsModuleFactoryTest {

  private final PrettierPluginsModuleFactory factory = new PrettierPluginsModuleFactory();

  @BeforeEach
  void setup() {
    TestSeed4JModules.register(new Seed4jSampleExtensionNodePackagesVersionsReader(new FileSystemProjectFiles()));
  }

  @AfterEach
  void tearDown() {
    TestSeed4JModules.unregisterReaders();
  }

  @Test
  void shouldBuildPropertiesPluginModule() {
    Seed4JModuleProperties properties = Seed4JModulesFixture.propertiesBuilder(TestFileUtils.tmpDirForTest()).build();

    Seed4JModule module = factory.buildPropertiesPluginModule(properties);

    assertThatModuleWithFiles(module, packageJsonFile())
      .hasFile("package.json")
      .containing(
        """
        "prettier-plugin-properties": "\
        """
      );
  }

  public static ModuleFile packageJsonFile() {
    return file("src/test/resources/projects/empty-node/package.json", "package.json");
  }
}
