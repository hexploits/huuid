# Huuid
Typed UUIDs in Java.

### Why does this exist? 
I have created this package as I don't believe UUIDs, used as unique identifiers for an entity, should be an exchangeable type.
Entity IDs should be typed and clearly distinguishable.

This package should help distinguish and clearly partition UUIDs of different entities in your application. 

## Example Implementation:
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

## Example Usage:

```java
// Transaction.java
public class Transaction {

  private final TransactionId id;
  private final CustomerId customerId;
  // ...ommitting getters, setters, constructor(s), etc
}

// Customer.java
public class Customer {

  private final CustomerId customerId;
  // ...omitting getters, setters, constructor(s) etc.
}

// CustomerService.java
public class CustomerService {
  // ...omitting boilerplate

  public CustomerId returnCustomerId(final Customer customer) {
    return customer.getCustomerId(); // Type of CustomerId, not UUID.
  }

  public void example0(final CustomerId customerId, final Transaction transaction) {
    // do some business logic here.
    transaction.setId(new TransactionId()); // Typed TransactionId used here.
    transaction.setCustomerId(customerId); // Typed CustomerId used here.
  }

  public void example1() {
    TransactionId transactionId = new TransactionId();
    LocationId locationId = new LocationId();
    UUID customerId = UUID.randomUUID();

    Transaction transaction = new Transaction(
      transactionId,
      customerId // Fails to compile as type should be 'CustomerId'.
    );
    
    Transaction transaction1 = new Transaction(
      transactionId,
      locationId // Fails to compile as type should be 'CustomerId'.
    );
  }
}
```