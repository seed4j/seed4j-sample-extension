package com.seed4j.extension;

import com.seed4j.extension.shared.generation.domain.ExcludeFromGeneratedCodeCoverage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import tech.jhipster.lite.JHLiteApp;

@SpringBootApplication(scanBasePackageClasses = { JHLiteApp.class, Seed4jSampleExtensionApp.class })
@ExcludeFromGeneratedCodeCoverage(reason = "Not testing logs")
public class Seed4jSampleExtensionApp {

  private static final Logger log = LoggerFactory.getLogger(Seed4jSampleExtensionApp.class);

  public static void main(String[] args) {
    Environment env = SpringApplication.run(Seed4jSampleExtensionApp.class, args).getEnvironment();

    if (log.isInfoEnabled()) {
      log.info(ApplicationStartupTraces.of(env));
    }
  }
}
