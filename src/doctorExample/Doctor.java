package doctorExample;

public class Doctor {
	
	private String speciality;
	private String name;
	private String surname;
	private Integer age;
	
	
	
	public String getSurname() {
		return surname;
	}

//	public void setSurname(String surname) {
//		this.surname = surname;
//	}

	public String getSpeciality() {
		return speciality;
	}

//	public void setSpeciality(String speciality) {
//		this.speciality = speciality;
//	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public void getDoctorDetails() {
		System.out.println("Doctor details");
	}
	
	public String getInfo(String ime) {
		String lokalnaPromenliva;
		
		lokalnaPromenliva = "lokalnaPromenliva";
		
		return "Doctor name from attribute: " + this.name + " \nDoctor name: " + ime;
		
	}

	public Doctor() {
		super();
	}
	
	public Doctor(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	public Doctor(String speciality, String name, String surname) {
		super();
		this.speciality = speciality;
		this.name = name;
		this.surname = surname;
	}


	@Override
	public String toString() {
		return "Doctor [speciality=" + speciality + ", name=" + name + ", surname=" + surname + "]";
	}
	
	
	
	
	
	
	

}
