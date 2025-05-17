## 1  Monorepo layout

```
integration-as-code/
├── hello-worlds/             # Example integration services
├── patterns/                 # Fundamental EIP implementations
│   ├── content-based-router/
│   │   ├── java-camel/
│   │   ├── kotlin-spring-boot/
│   │   ├── dotnet/
│   │   └── ballerina/
│   ├── message-filter/
│   │   ├── java-camel/
│   │   ├── kotlin-spring-boot/
│   │   ├── dotnet/
│   │   └── ballerina/
│   └── transformation/
│       ├── java-camel/
│       ├── kotlin-spring-boot/
│       ├── dotnet/
│       └── ballerina/
├── composites/               # Higher‑level orchestrations (e.g., Saga)
│   └── order‑saga/
│       ├── java-camel/
│       ├── dotnet/ …
├── infra/
│   ├── docker/
│   │   └── docker-compose.yml
│   └── k8s/                  # Helm charts for “phase 2”
├── build-logic/              # Gradle convention plugins
├── scripts/                  # bootstrap.sh, test‑local.sh
├── .github/workflows/        # ci.yml, nightly‑k8s.yml
└── docs/
```

### Naming convention

`<pattern>/<language>/<impl>` keeps demos discoverable.
Each folder is a self‑contained build target that publishes either a JAR, NuGet package, or Ballerina module.

---

## 2  Build‑tools

| Ecosystem   | Tool                              |
| ----------- | --------------------------------- |
| Java/Kotlin | **Gradle 8 + Kotlin DSL**         |
| .NET        | **dotnet SDK 8 LTS**              |
| Ballerina   | **bal 2201.12.3** (Swan Lake U12) |
| CI          | GitHub Actions                    |                                                             |

---

## 3  Frameworks

| Ecosystem   | Framework(s)                        |
| ----------- | ----------------------------------- |
| Java/Kotlin | Apache Camel 4.x (Spring Boot—TBD)  |
| .NET        | MassTransit 8+ (TBD)                |
| Ballerina   | Ballerina Integration               |

---

## 4  Runtime infrastructure

TBD

---

## 5  GitHub Actions (`ci.yml` core)

TBD
---
