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
	@ManyToOne(cascade = CascadeType.ALL)
	private User from;
	
	@Persistent
	private String request;
	
	@Persistent
	private Long toId;
	
	@Persistent
	@ManyToOne
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
	public User getFrom() {
		return from;
	}
	public void setFrom(User from) {
		this.from = from;
	}
	public String getRequest() {
		return request;
	}
	public void setRequest(String request) {
		this.request = request;
	}
	public Long getToId() {
		return toId;
	}
	public void setToId(Long toId) {
		this.toId = toId;
	}
	public User getTo() {
		return to;
	}
	public void setTo(User to) {
		this.to = to;
	}

	
}
