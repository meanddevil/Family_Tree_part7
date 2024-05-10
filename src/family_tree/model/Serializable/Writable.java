package family_tree.model.Serializable;

import java.io.Serializable;

public interface Writable {
    boolean save(Serializable serializable, String file);
    Object read(String file);
}
