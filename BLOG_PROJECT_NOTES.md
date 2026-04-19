# Blog Platform API — Session Notes

## Project
Spring Boot Blog Platform REST API  
Stack: Java 17, Spring Boot 3.5.0, Spring Data JPA, Spring Security 6, H2 (→ Postgres in Phase 5), Redis (Phase 7), Maven, Lombok  
Repo path: D:\projects\SpringApp\blog-api

## My Background
- 4 years Java experience — confident with the language, OOP, generics, exceptions
- Built enterprise production REST APIs with controllers and databases at work
- Strong ORM understanding via **Reladomo** (Goldman Sachs ORM — XML-based entity definitions, Finder pattern for queries, relationship optimization)
- JPA/Hibernate is new but the *concepts* (entities, relationships, queries) are very familiar
- Knows Jackson (JSON), JUnit (testing), custom dependency management
- Main gaps: Spring-specific annotations and terminology, Spring Security, Spring Data JPA syntax

**Tutoring approach:** Skip basics, move at enterprise pace. Map new Spring concepts to Reladomo equivalents where helpful (e.g. JpaRepository ≈ Finder, @Entity + annotations ≈ XML descriptor, @Transactional ≈ Reladomo's MithraTransaction). Focus explanations on "why Spring does it this way" not "what is an ORM".

## Phase Progress
- [ ] Phase 1 — Foundation
- [ ] Phase 2 — JPA Relationships
- [ ] Phase 3 — Validation & Error Handling
- [ ] Phase 4 — Search, Filtering & Pagination
- [ ] Phase 5 — Spring Security + Auth
- [ ] Phase 6 — Async & Scheduled Tasks
- [ ] Phase 7 — Caching & Performance
- [ ] Phase 8 — Testing
- [ ] Phase 9 — Ship It

## Current Status
Phase: Phase 1 — Foundation (in progress)  
Last session: Session 2  
Pick up here next time: Step 4 — Write `Author.java` (JPA entity) — answer the warm-up question on `ddl-auto=create-drop` first, then build Entity → Repository → Service → Controller → DTOs

## Session Log
→ See [SESSION_LOG.md](SESSION_LOG.md)

## Concepts Learned
| Annotation / Concept | Plain-English Explanation | Phase |
|---|---|---|
| `@SpringBootApplication` | Fuses `@Configuration` + `@EnableAutoConfiguration` + `@ComponentScan` — boots the whole app from one class | 1 |
| `@EnableAutoConfiguration` | Scans the classpath and wires up sensible defaults automatically (e.g. sees H2 → creates a DataSource) | 1 |
| `@ComponentScan` | Tells Spring which package tree to search for beans — everything must live inside `com.blog` | 1 |
| `spring-boot-starter-*` | Curated dependency bundles — one starter pulls in a tested set of jars instead of you managing each version | 1 |
| `ddl-auto=create-drop` | Hibernate creates tables on startup, drops them on shutdown — clean slate every restart, never use in prod | 1 |
| `@Configuration` | Marks a class as a source of bean definitions — Spring reads it at startup | 1 |
| `@EnableWebSecurity` | Activates Spring Security's filter chain — without it, security beans are ignored | 1 |
| `SecurityFilterChain` (bean) | Modern replacement for `WebSecurityConfigurerAdapter` (removed in Spring Security 6) — defines HTTP security rules as a bean | 1 |

## Quiz Scores
| Phase | Score | Topics to Revisit |
|---|---|---|
| | | |
