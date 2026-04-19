# Blog Platform API — Session Log

---

### Session 3 — 2026-04-19
Completed:
- Answered warm-up question on `ddl-auto=create-drop`
- Built full Author layer: Author.java, AuthorRepository, AuthorService, AuthorController
- Added `@GeneratedValue(IDENTITY)`, `@PrePersist` for auto createdAt, removed setId/setCreatedAt
- Created AuthorRequest, AuthorResponse DTOs and static AuthorMapper
- Wired DTOs through service and controller — no raw entity exposure
- Tested all three endpoints (POST, GET by id, GET by username) — all passing

Left unfinished:
- Nothing — Phase 1 complete

Next session starts at:
- Phase 2: JPA Relationships — build Post entity with @ManyToOne to Author

---

### Session 2 — 2026-04-18
Completed:
- Established tutoring rules and session-notes workflow (BLOG_PROJECT_NOTES.md created)
- Filled in background profile (4 yrs Java, Reladomo ORM, enterprise production experience)
- Confirmed tutoring approach: enterprise pace, map Spring concepts to Reladomo equivalents
- Recapped Session 1 work (project generation, file walkthrough, entity diagram, SecurityConfig, application.properties)
- Posed warm-up question on `ddl-auto=create-drop` — left unanswered (session ended first)

Left unfinished:
- Warm-up question unanswered: "What does `ddl-auto=create-drop` do and why is it dangerous in production?"
- Author entity not started

Next session starts at:
- Answer the warm-up question, then write `Author.java` in `src/main/java/com/blog/author/`

---

### Session 1 — 2026-04-18
Completed:
- Generated project via Spring Initializr (Spring Boot 3.5.0, Java 17)
- Walked through every generated file and folder
- Drew ASCII entity diagram (Author, Post, Comment, Tag, User)
- Wrote application.properties (H2 config, JPA settings, H2 console)
- Created SecurityConfig.java (permit-all, temporary — will be replaced in Phase 5)
- Created package skeleton: author/, post/, comment/, common/, config/

Left unfinished:
- Author entity, AuthorRepository, AuthorService, AuthorController, DTOs

Next session starts at:
- Step 4: Write Author.java (JPA entity) — bottom of the dependency chain first
