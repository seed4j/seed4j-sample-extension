# Sonar Learnings (2026-03-20)

## Purpose

Capture practical decisions and pitfalls observed while fixing Sonar issues in this repository, so future cleanups are faster and more consistent.

## Java and test code patterns

- Prefer unnamed catch variables (`catch (... _)`) when the exception is intentionally unused.
- For `try-with-resources` where the resource is intentionally unused, `_` is valid with Java 25.
- Do not add no-op calls just to mark a variable as "used" (for example, `flush()` right before close).
- Avoid empty `try` blocks in tests when a simpler equivalent exists.
  - For creating a minimal JAR file, direct close is clearer:
    - `new JarOutputStream(Files.newOutputStream(jarPath), manifest).close();`
- When Sonar requests assertion-chain unification, keep all assertions on the same subject in one chain, including the first `contains(...)` when applicable.

## Parameterized test migration

- Parameterize only homogeneous scenarios (same setup shape and same assertion contract).
- Use named arguments (`@MethodSource` with scenario names) so failures are immediately identifiable.
- Keep explicit assertions inside the test body; do not hide core checks in helper assertions.

## Sonar local execution workflow

- Local Sonar run requires Dockerized SonarQube for this repository.
- Standard flow used successfully:
  - `docker compose -f src/main/docker/sonar.yml up -d`
  - wait for `http://localhost:9001/api/system/status` to become `UP`
  - read token from `docker logs sonar-token`
  - run `./mvnw clean verify sonar:sonar -Dsonar.token=<token>`
- Sonar analysis is asynchronous; after scanner success, wait for CE task completion (`/api/ce/task?id=<taskId>`) before checking issue counts.

## Verification strategy that worked

- Run focused tests after each slice (production fixes, direct test fixes, parameterization).
- Run full `./mvnw clean verify` before final Sonar analysis.
- Confirm closure through Sonar API (issue count per touched file and project-level total).

## Notes about environment noise

- Maven Enforcer dependency-convergence warnings appear in this project but did not fail the build in this workflow.
- Sonar may warn about missing SCM blame on local uncommitted files; this warning did not block analysis.
