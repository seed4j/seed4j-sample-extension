package com.seed4j.extension.generator.server.springboot.startupreport.domain;

import static com.seed4j.module.infrastructure.secondary.Seed4JModulesAssertions.*;

import com.seed4j.TestFileUtils;
import com.seed4j.extension.UnitTest;
import com.seed4j.extension.shared.dependencies.infrastructure.secondary.Seed4jSampleExtensionMavenDependenciesReader;
import com.seed4j.module.domain.Seed4JModule;
import com.seed4j.module.domain.Seed4JModulesFixture;
import com.seed4j.module.domain.properties.Seed4JModuleProperties;
import com.seed4j.module.infrastructure.secondary.FileSystemProjectFiles;
import com.seed4j.module.infrastructure.secondary.Seed4JModulesAssertions;
import com.seed4j.module.infrastructure.secondary.TestSeed4JModules;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@UnitTest
class SpringBootStartupReportModuleFactoryTest {

  private final SpringBootStartupReportModuleFactory factory = new SpringBootStartupReportModuleFactory();

  @BeforeEach
  void setup() {
    TestSeed4JModules.register(new Seed4jSampleExtensionMavenDependenciesReader(new FileSystemProjectFiles()));
  }

  @AfterEach
  void tearDown() {
    TestSeed4JModules.unregisterReaders();
  }

  @Test
  void shouldBuildPropertiesPluginModule() {
    Seed4JModuleProperties properties = Seed4JModulesFixture.propertiesBuilder(TestFileUtils.tmpDirForTest()).build();

    Seed4JModule module = factory.buildModule(properties);

    assertThatModuleWithFiles(module, pomFile()).hasFile("pom.xml").containing("spring-boot-startup-report");
  }

  public static Seed4JModulesAssertions.ModuleFile pomFile() {
    return file("src/test/resources/projects/init-maven/pom.xml", "pom.xml");
  }
}
