package boot.assignment.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@Entity
@Table(name="dennis")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Dennis implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="dennisId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long dennisId;
	
	@Column(name="craziness")
	@NotNull
	private String craziness;
	
	@Column(name="language")
	@NotNull
	private String language;
	
	@Column(name="age")
	@NotNull
	private Long age;
	
	@Column(name="laughterLevel")
	@NotNull
	private Long laughterLevel;

	public Dennis() {
		super();
		
	}

	public Dennis(@NotNull String craziness, @NotNull String language, @NotNull Long age, @NotNull Long laughterLevel) {
		super();
		this.craziness = craziness;
		this.language = language;
		this.age = age;
		this.laughterLevel = laughterLevel;
	}

	public Dennis(Long dennisId, @NotNull String craziness, @NotNull String language, @NotNull Long age,
			@NotNull Long laughterLevel) {
		super();
		this.dennisId = dennisId;
		this.craziness = craziness;
		this.language = language;
		this.age = age;
		this.laughterLevel = laughterLevel;
	}

	public Long getDennisId() {
		return dennisId;
	}

	public void setDennisId(Long dennisId) {
		this.dennisId = dennisId;
	}

	public String getCraziness() {
		return craziness;
	}

	public void setCraziness(String craziness) {
		this.craziness = craziness;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public Long getLaughterLevel() {
		return laughterLevel;
	}

	public void setLaughterLevel(Long laughterLevel) {
		this.laughterLevel = laughterLevel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((craziness == null) ? 0 : craziness.hashCode());
		result = prime * result + ((dennisId == null) ? 0 : dennisId.hashCode());
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		result = prime * result + ((laughterLevel == null) ? 0 : laughterLevel.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dennis other = (Dennis) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (craziness == null) {
			if (other.craziness != null)
				return false;
		} else if (!craziness.equals(other.craziness))
			return false;
		if (dennisId == null) {
			if (other.dennisId != null)
				return false;
		} else if (!dennisId.equals(other.dennisId))
			return false;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (laughterLevel == null) {
			if (other.laughterLevel != null)
				return false;
		} else if (!laughterLevel.equals(other.laughterLevel))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dennis [dennisId=" + dennisId + ", craziness=" + craziness + ", language=" + language + ", age=" + age
				+ ", laughterLevel=" + laughterLevel + "]";
	}
	
	
	

}
