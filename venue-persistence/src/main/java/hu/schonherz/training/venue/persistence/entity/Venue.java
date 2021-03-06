package hu.schonherz.training.venue.persistence.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "venue")
public class Venue extends BaseEntity {

    @Basic
    // @Column(nullable = false)
    private Long ownerId;

    @Column(nullable = false)
    private String name;

    @Basic
    private String description;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "type_id")
    private Type type;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(mappedBy = "venue", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Collection<Event> events;

    @OneToMany(mappedBy = "venue", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Collection<VenueImage> images;

    @OneToOne
    @JoinColumn(name = "profile_image_id")
    private VenueImage profileImage;

    @Basic
    @Column(name="admin_message")
    private String adminMessage;

    @Column(nullable = false, columnDefinition = "boolean default true")
    private Boolean enabled;

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Collection<Event> getEvents() {
        return events;
    }

    public void setEvents(Collection<Event> events) {
        this.events = events;
    }

    public Collection<VenueImage> getImages() {
        return images;
    }

    public void setImages(Collection<VenueImage> images) {
        this.images = images;
    }

    public VenueImage getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(VenueImage profileImage) {
        this.profileImage = profileImage;
    }

    public String getAdminMessage() {
        return adminMessage;
    }

    public void setAdminMessage(String adminMessage) {
        this.adminMessage = adminMessage;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}