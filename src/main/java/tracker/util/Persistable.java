package tracker.util;

import java.io.Serializable;

/**
 * @author Created by Igor
 */
public interface Persistable<ID extends Serializable> extends Serializable{
    ID getId();
}

