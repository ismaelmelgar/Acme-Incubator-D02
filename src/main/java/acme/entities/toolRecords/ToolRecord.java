
package acme.entities.toolRecords;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ToolRecord extends DomainEntity {

	//Serialisation identifier ---------------------------------------

	public static final long	serialVersionUID	= 1L;

	//Attributes -----------------------------------------------------

	@NotBlank
	private String				title;

	@NotBlank
	private String				activitySector;

	@NotBlank
	private String				inventor;

	@NotBlank
	private String				description;

	@URL
	@NotBlank
	private String				web;

	@NotBlank
	@Email
	private String				email;

	@NotBlank
	@Pattern(regexp = "^(Open-source|Closed-source)$")
	private String				sourceType;

	@Range(min = -5, max = 5)
	private Integer				stars;

}
