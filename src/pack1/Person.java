package pack1;

public class Person 
{
	private String personName;
	private Integer personAge;
	private String personCountry;
	
	public Person(String personName, Integer personAge, String personCountry)
	{
		super();
		this.personName = personName;
		this.personAge = personAge;
		this.personCountry = personCountry;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Integer getPersonAge() {
		return personAge;
	}

	public void setPersonAge(Integer personAge) {
		this.personAge = personAge;
	}

	public String getPersonCountry() {
		return personCountry;
	}

	public void setPersonCountry(String personCountry) {
		this.personCountry = personCountry;
	}
	
	

}
