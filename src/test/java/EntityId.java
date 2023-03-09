import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hexploits.common.huuid.Huuid;
import com.hexploits.common.huuid.serializer.TypedHuuidDeserializer;
import com.hexploits.common.huuid.serializer.TypedHuuidSerializer;
import java.util.UUID;

@JsonSerialize(using = TypedHuuidSerializer.class)
@JsonDeserialize(using = TypedHuuidDeserializer.class)
public class EntityId extends Huuid {

  public EntityId() {
    super();
  }

  public EntityId(UUID uuid) {
    super(uuid);
  }
}
