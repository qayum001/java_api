package web.api.models;

import java.util.UUID;

public class Entity {
    private UUID Id;

    public Entity(UUID id) {
        this.Id = id;
    }

    public UUID getId() {
        return this.Id;
    }
}
