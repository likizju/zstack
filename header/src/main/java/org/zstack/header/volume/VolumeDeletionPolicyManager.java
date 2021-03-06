package org.zstack.header.volume;

/**
 * Created by frank on 11/12/2015.
 */
public interface VolumeDeletionPolicyManager {
    enum VolumeDeletionPolicy {
        Direct,
        Delay,
        Never
    }

    VolumeDeletionPolicy getDeletionPolicy(String volumeUuid);
}
