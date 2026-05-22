Spring Boot Profile

#dev have most priority (prod has less priority). priority goes from left(minimum) to right(maximum).
spring.profiles.active: prod, test, dev

Run Application through Command Line
#java -jar your-app.jar --spring.profiles.active=prod
#mvn spring-boot:run -Dspring-boot.run.profiles=dev

The @Profile annotation in Spring Boot is used to conditionally load beans and
configurations based on the currently active environment (e.g., dev, test, or prod). 
It allows you to segregate parts of your application and ensure they only run when 
a specific profile is active.

Core Usage
Class-Level: Use it on classes annotated with
@Component, @Service, or @Configuration to register the entire class only if the 
profile matches.

Method-Level: Use it on @Bean methods within a configuration class
to create specific beans for certain environments.

Key Syntax Examples
Single Profile: @Profile("dev") 
loads the component only when the "dev" profile is active.

Multiple Profiles (OR): @Profile({"dev", "test"}) loads the component if either 
"dev" or "test" is active.

Negation (NOT): @Profile("!prod") loads the component for any active profile 
except "prod".
