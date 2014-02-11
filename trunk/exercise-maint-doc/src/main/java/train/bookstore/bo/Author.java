package train.bookstore.bo;

import org.kuali.rice.krad.bo.PersistableBusinessObjectBase;

/**
 * A business object that represents an Author of a Book.
 * 
 * @author Eric Westfall
 */
public class Author extends PersistableBusinessObjectBase {

	private static final long serialVersionUID = 6385381349983978326L;

	private Long id;
	private String firstName;
	private String middleName;
	private String lastName;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getName() {
		StringBuilder builder = new StringBuilder();
		builder.append(lastName).append(", ");
		builder.append(firstName);
		if (middleName != null && !"".equals(middleName.trim())) {
			builder.append(" ").append(middleName);
		}
		return builder.toString();
	}

}
