# Codex Execution Plans (ExecPlans)

This file defines how to write and maintain an ExecPlan. An ExecPlan is a self-contained, living design and execution document that a coding agent can follow to implement a meaningful change from start to finish without prior project context.

## How To Use ExecPlans and PLANS.md

When executing a large task, start by reading this file. If this file is empty, read the parent directory copy and use that guidance.

When writing an ExecPlan, begin with the skeleton in this file and expand it as you research. Keep the plan current:

- Update `Progress` and `Decisions` as you work.
- Record surprises immediately.
- Include enough detail so someone can continue from only the plan file.

## Requirements

Non-negotiable requirements for every ExecPlan:

- Every ExecPlan must be fully self-contained.
- Every ExecPlan must be a living document and updated as work progresses.
- Every ExecPlan must enable a novice to complete the task end-to-end with no prior repo knowledge.
- Every ExecPlan must produce observable behavior, not only code changes.
- Every term that is uncommon, project-specific, or newly introduced must be defined inline.

Start by briefly explaining why the change matters from a user perspective, then provide exact steps to make and verify the change, including what files to edit and which commands to run.

The executing agent can list files, read files, search, run the project, and run tests. It has no memory of prior work. Restate all assumptions. Do not reference external blog posts or hidden context. If this plan builds on another ExecPlan and that file is committed, reference it; otherwise include all necessary context directly.

## Formatting

Each ExecPlan must be one fenced `md` code block if embedded in another message. If written as a standalone `.md` file, do not wrap with triple backticks.

Write in plain prose first. Prefer short sections with clear headings. Use checklists only in the `Progress` section.

## Guidelines

Clarity and self-containment are mandatory:

- Define terms where they first appear.
- Describe where to edit, what to add, and what to run.
- Avoid requiring the reader to infer hidden behavior.

Prefer robust behavior over temporary patches. Do not defer critical decisions unless explicitly labeled as optional.

Describe how to run and observe the result. Specify concrete commands and expected outcomes.

## Milestones

Milestones help checkpoint progress and validation. For each milestone:

- State scope and resulting behavior.
- List commands to run.
- State acceptance criteria in observable terms.

Keep milestones small and verifiable.

## Living Plans

Keep the plan current during execution:

- Update `Progress` with completed and remaining work.
- Update `Decisions` with why changes were made.
- Update `Lessons Learned` with concrete discoveries.
- If direction changes, update sections before continuing.

## Prototyping Milestones and Parallel Implementations

Prototyping is allowed when risk or uncertainty is high. Use explicit labels:

- Add a `Prototype` milestone with the hypothesis and how success will be measured.
- Keep prototype changes isolated.
- Replace prototype code with final code before closing the plan unless the prototype is intentionally promoted.

If comparing approaches in parallel:

- Document each approach and its trade-offs.
- Describe how each was validated.
- Record the chosen approach in `Decisions` with reasons.
- Remove or archive rejected approach code before finalizing.

## Skeleton of a Good ExecPlan

# <Short, action-oriented title>

This ExecPlan is a living document. Keep `Progress`, `Decisions`, `Risks`, and `Lessons Learned` up to date as work advances.

## Purpose / Big Picture

Explain in 2-4 sentences what user-visible capability is delivered and how to observe it working.

## Scope

State in-scope and out-of-scope items clearly.

## Definitions

Define project-specific terms, modules, flags, or protocols needed to understand this plan.

## Existing Context

Describe the current behavior and architecture relevant to this change. Reference specific files and classes.

## Desired End State

Describe expected behavior and code state after completion.

## Milestones

### Milestone 1 - <Name>

#### Goal

Describe what this milestone achieves.

#### Changes

- [ ] File-level edits with exact paths and intent.
- [ ] Data model or type updates.
- [ ] API, CLI, or UX behavior updates.

#### Validation

- [ ] Command: `<exact command>`
- [ ] Expected result: `<observable outcome>`

#### Acceptance Criteria

- [ ] Behavior is visible through a concrete scenario.
- [ ] Tests prove expected behavior.

### Milestone 2 - <Name>

Repeat structure above.

## Progress

Use a flat checkbox list and update continuously.

- [ ] Milestone 1 started
- [ ] Milestone 1 completed
- [ ] Milestone 2 started
- [ ] Milestone 2 completed

## Decisions

Record decisions as they happen.

- Decision: <what>
  Rationale: <why>
  Date/Author: <YYYY-MM-DD / name>

## Risks and Mitigations

List meaningful risks and the mitigation for each.

- Risk: <description>
  Mitigation: <how to reduce or monitor>

## Validation Strategy

List full validation flow, from focused checks to full suite.

1. Run targeted tests relevant to modified packages.
2. Run the repository validation command (`./mvnw clean verify`).
3. Manually exercise the changed CLI behavior when applicable.

## Rollout and Recovery

Explain how to deploy or release safely and how to revert if needed.

## Lessons Learned

Capture non-obvious findings that help the next engineer.
