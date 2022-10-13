# Huuid
Allow you to add types to UUIDs.

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