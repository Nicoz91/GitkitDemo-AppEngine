package it.polimi.appengine.entity;

import java.util.Date;

import javax.jdo.annotations.Persistent;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.datanucleus.api.jpa.annotations.Extension;

@Entity
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Extension(vendorName="datanucleus", key="gae.encoded-pk", value="true")
	private String id;
	
	@Persistent
	private int evaluation;
	@Persistent
	private String description;
	
	@Persistent
	private String fromName;
	@Persistent
	private String fromSurname;
	@Persistent
	private Date fromAge;
	@Persistent
	private boolean fromGender;
	@Persistent
	private String fromPhotoURL;
	
	@Persistent
	@ManyToOne(cascade = CascadeType.ALL)
	private User to;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getEvaluation() {
		return evaluation;
	}
	public void setEvaluation(int evaluation) {
		this.evaluation = evaluation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public User getTo() {
		return to;
	}
	public void setTo(User to) {
		this.to = to;
	}
	public String getFromName() {
		return fromName;
	}
	public void setFromName(String fromName) {
		this.fromName = fromName;
	}
	public String getFromSurname() {
		return fromSurname;
	}
	public void setFromSurname(String fromSurname) {
		this.fromSurname = fromSurname;
	}
	public Date getFromAge() {
		return fromAge;
	}
	public void setFromAge(Date fromAge) {
		this.fromAge = fromAge;
	}
	public boolean isFromGender() {
		return fromGender;
	}
	public void setFromGender(boolean fromGender) {
		this.fromGender = fromGender;
	}
	public String isFromPhotoURL() {
		return fromPhotoURL;
	}
	public void setFromPhotoURL(String fromPhotoURL) {
		this.fromPhotoURL = fromPhotoURL;
	}
	
}
