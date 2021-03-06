package com.camilolopes.core.domain.ebook;

// Generated 26/08/2013 20:56:10 by Hibernate Tools 3.4.0.CR1

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.codehaus.jackson.annotate.JsonIgnore;


/**
 * CategoryEbook generated by hbm2java
 */
@Entity
@Table(name = "category_ebook", uniqueConstraints = @UniqueConstraint(columnNames = "description"))
public class CategoryEbook implements java.io.Serializable {


	private static final long serialVersionUID = -3855458228642296931L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String description;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoryEbook")
	private Set<Ebook> ebooks;

	public CategoryEbook() {
	}

	@Column(name = "description", unique = true, length = 45)
	public String getDescription() {
		return this.description;
	}
	@JsonIgnore
	public Set<Ebook> getEbooks() {
		return this.ebooks;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public void setEbooks(Set<Ebook> ebooks) {
		this.ebooks = ebooks;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((ebooks == null) ? 0 : ebooks.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof CategoryEbook))
			return false;
		CategoryEbook other = (CategoryEbook) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (ebooks == null) {
			if (other.ebooks != null)
				return false;
		} else if (!ebooks.equals(other.ebooks))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	

}
