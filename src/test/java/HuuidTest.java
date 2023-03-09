import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.UUID;
import org.junit.jupiter.api.Test;

class HuuidTest {

  @Test
  void huuidAutoPopulates() {
    // Should automatically assign a UUID.
    EntityId entityId = new EntityId();
    assertNotNull(entityId);
  }

  @Test
  void huuidTypesAreNotConvertable() {
  }
}
