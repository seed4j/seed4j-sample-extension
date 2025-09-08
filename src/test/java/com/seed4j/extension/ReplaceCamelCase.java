package com.seed4j.extension;

import java.lang.reflect.Method;
import java.util.List;
import org.junit.jupiter.api.DisplayNameGenerator;

public class ReplaceCamelCase extends DisplayNameGenerator.Standard {

  @Override
  public String generateDisplayNameForMethod(List<Class<?>> enclosingInstanceTypes, Class<?> testClass, Method testMethod) {
    return this.replaceCapitals(testMethod.getName());
  }

  private String replaceCapitals(String name) {
    name = name.replaceAll("([A-Z])", " $1");
    name = name.replaceAll("([0-9]+)", " $1");
    name = name.toLowerCase();
    return name;
  }
}
