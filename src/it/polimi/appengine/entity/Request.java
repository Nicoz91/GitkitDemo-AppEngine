package it.polimi.appengine.entity;

import java.util.Date;
import java.util.Set;
import javax.jdo.annotations.Persistent;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.datanucleus.api.jpa.annotations.Extension;

import com.google.appengine.api.datastore.GeoPt;
import com.google.appengine.api.datastore.Key;

@Entity
public class Request {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Extension(vendorName="datanucleus", key="gae.encoded-pk", value="true")
	private String id;
	
	@Persistent
	private String type;
	@Persistent
	private String title;
	@Persistent
	private String description;
	@Persistent
	private GeoPt place;
	@Persistent
	private Date start;
	@Persistent
	private Date end;
	@Persistent
	private int maxPartecipants;
	@Persistent
	private Set<Key> partecipants;
	@Persistent
	@ManyToOne(cascade = CascadeType.ALL)
	private User owner;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public GeoPt getPlace() {
		return place;
	}
	public void setPlace(GeoPt place) {
		this.place = place;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public int getMaxPartecipants() {
		return maxPartecipants;
	}
	public void setMaxPartecipants(int maxPartecipants) {
		this.maxPartecipants = maxPartecipants;
	}
	public Set<Key> getPartecipants() {
		return partecipants;
	}
	public void setPartecipants(Set<Key> partecipants) {
		this.partecipants = partecipants;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	
}
