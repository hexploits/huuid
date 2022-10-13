# Huuid
Typed uuids for large scale projects.

# Example Usage:
```java
@JsonSerialize(using = TypedHuuidSerializer.class)
@JsonDeserialize(using = TypedHuuidDeserializer.class)
public class CustomerId extends Huuid {

  public CustomerId() {
    super();
  }

  public CustomerId(UUID customerId) {
    super(customerId);
  }
}
```
# Unstable Usage:
Might result with undefined behaviour, primiarily serialization issues and lack of support for Swagger v3.
```java
@HuuidSerializer
public class CustomerId extends Huuid {

  public CustomerId() {
    super();
  }

  public CustomerId(UUID customerId) {
    super(customerId);
  }
}
```