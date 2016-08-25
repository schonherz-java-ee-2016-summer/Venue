package hu.schonherz.training.venue.persistence.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Created by Home on 2016. 08. 23..
 */

@MappedSuperclass
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    public Long getOwnerId() {
        return Id;
    }

    public void setOwnerId(Long ownerId) {
        Id = ownerId;
    }
}