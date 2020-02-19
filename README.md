# Modular Spring boot Application.

This is a sample module spring-boot application that leverages custom classpath scanning
to allow only packages that are enabled to be enabled at runtime.

The benefits of this is that we can have a modular monolith application but
only run certain parts of the code without running all components.

To achieve this modular architecture, we need to leverage packages as modules. Each
package must be able to run on its own without needing any packages. This falls on the developer
to ensure that there are no cross-cutting concerns that are leaking in each package.

## Code Organization.

Each package needs a `PackageModuleConfiguration` class that is annotated with `@Configuration` and a custom
`@ComponentScan` of the current package it is residing in. Below is a sample configuration

```java
@Configuration
@ConditionalOnProperty(name = "com.demo.propertyscan.repository.enabled",
        havingValue = "true")
@ComponentScan(basePackages = "com.demo.propertyscan.repository")
public class RepositoryModuleConfiguration {
}
```

Additionally, move the `SpringBootApplication` to a sub package so `@ComponentScan` does not inadvertently
pick up any bean that does not need to be scanned.

Finally import all the `PackageModuleConfiguration` classes in your `SpringBootApplication` main class.

```java
@SpringBootApplication
@Import({RepositoryModuleConfiguration.class, ServiceModuleConfiguration.class})
public class ProperyScanApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProperyScanApplication.class, args);
    }
}
```

Most of this code and architecture is inspired by [Reflectoring.io](https://reflectoring.io/spring-boot-modules/) 
website as well as [Modular Monolith](https://github.com/odrotbohm/moduliths)