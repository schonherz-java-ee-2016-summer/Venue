package hu.schonherz.training.venue.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

/**
 * The Vo of Venue.
 */
public class VenueVo implements Serializable {

    private static final long serialVersionUID = 568123L;

    private Long id;

    private Long ownerId;

    private String name;

    private String description;

    private TypeVo type;

    private AddressVo address;

    private Collection<EventsVo> events;

    private Collection<VenueImageVo> images;


    public VenueVo() {
        address = new AddressVo();
        events = new ArrayList<>();
        images = new ArrayList<>();

    }

    /**
     * Return the id of venue.
     *
     * @return the id of venue
     */
    public Long getId() {
        return id;
    }

    /**
     * Set the id of venue .
     *
     * @param id the id of venue
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Return the id of venue owner.
     *
     * @return the id of venue owner
     */
    public Long getOwnerId() {
        return ownerId;
    }

    /**
     * Set the id of venue owner.
     *
     * @param ownerId the id of venue owner
     */
    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * Return the name of venue.
     *
     * @return the name of venue
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of venue.
     *
     * @param name the name of venue
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Return the description of venue.
     *
     * @return the description of venue
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the description of venue.
     *
     * @param description the description of venue
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Return the type of venue.
     *
     * @return the type of venue
     */
    public TypeVo getType() {
        return type;
    }

    /**
     * Set the type of venue.
     *
     * @param type the type of venue
     */
    public void setType(TypeVo type) {
        this.type = type;
    }

    /**
     * Return the address of venue.
     *
     * @return the address of venue
     */
    public AddressVo getAddress() {
        return address;
    }

    /**
     * Set the address of venue.
     *
     * @param address the address of venue
     */
    public void setAddress(AddressVo address) {
        this.address = address;
    }

    /**
     * Return the collection of events in venue.
     *
     * @return the collection of events in venue
     */
    public Collection<EventsVo> getEvents() {
        return events;
    }

    /**
     * Set the collection of events in venue.
     *
     * @param events the collection of events in venue.
     */
    public void setEvents(Collection<EventsVo> events) {
        this.events = events;
    }

    public Collection<VenueImageVo> getImages() {
        return images;
    }

    public void setImages(Collection<VenueImageVo> images) {
        this.images = images;
    }
}
