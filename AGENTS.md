# Repository Guidelines

## Project Structure & Module Organization

- Main code lives in `src/main/java/com/seed4j/extension`.
- Feature modules follow hexagonal layers under `generator/**`: `application`, `domain`, and `infrastructure` (`primary`/`secondary`).
- Shared cross-module utilities live in `shared/**`.
- Generator templates and runtime resources are in `src/main/resources/generator/**` and `src/main/resources/config/**`.
- Tests are split across `src/test/java` (JUnit/Cucumber glue), `src/test/features` (Gherkin), and `src/test/resources` (fixtures).
- CI helper scripts are in `tests-ci/`; supporting docs are in `documentation/`.

## Build, Test, and Development Commands

- `./mvnw`: run the app locally (`spring-boot:run` is the Maven default goal).
- `./mvnw clean verify`: full build (unit + integration + cucumber tests, checkstyle, JaCoCo checks).
- `./mvnw test`: fast test pass (Surefire; excludes `*IT*` and `*CucumberTest*`).
- `./mvnw failsafe:integration-test failsafe:verify`: run integration and Cucumber suites only.
- `npm ci`: install Node-based tooling.
- `npm run prettier:check`: verify formatting.
- `npm run prettier:format`: apply formatting fixes.

## Coding Style & Naming Conventions

- Follow `.editorconfig`: UTF-8, LF, final newline, 2-space indentation.
- Java style is enforced by Checkstyle (`checkstyle.xml`): lower-case packages, `UpperCamelCase` types, `lowerCamelCase` methods/fields.
- Use JUnit 5 (`org.junit.jupiter`); non-Jupiter `org.junit` imports are blocked.
- Keep hexagonal boundaries strict: business rules in `domain`, orchestration in `application`, framework adapters in `infrastructure`.
- Run Prettier for changed files (`.husky/pre-commit` executes `lint-staged`).

## Testing Guidelines

- Frameworks: JUnit 5, AssertJ, Cucumber, Spring Boot Test.
- Preferred test annotations: `@UnitTest`, `@ComponentTest`, `@IntegrationTest`.
- Naming: unit/component tests as `*Test`; integration tests as `*IT*`; Cucumber launcher as `*CucumberTest*`.
- Coverage is strict: JaCoCo enforces 100% line and branch coverage at class level during `verify`.
- Keep Gherkin scenarios in `src/test/features` and glue code in `src/test/java/.../cucumber`.

## Commit & Pull Request Guidelines

- Follow existing history style: short imperative subjects (example: `Fix sonar configuration`).
- Conventional commit prefixes are used for dependency automation (example: `chore(deps): ...`, `fix(deps): ...`).
- Keep commits focused and atomic; avoid mixing refactors with behavior changes.
- PRs should include: what changed, why, validation steps run (at least `./mvnw clean verify` and `npm run prettier:check`), and linked issue/context.

## Execution Plans for Complex Tasks

For complex features or significant refactors, use an Execution Plan (see `.agent/PLANS.md`) from design through implementation.

## Sonar and Cleanup Learnings

For Sonar-specific cleanup patterns and the validated local Sonar workflow used in this repository, see `.agent/SONAR_LEARNINGS.md`.
