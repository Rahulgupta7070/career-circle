package Day_4;

public class TreeSetProgramStudent {

    private int id;
	private String name;

	TreeSetProgramStudent() {
		// default constructor
	}

	TreeSetProgramStudent(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {

		return "Student [id=" + id + ", name=" + name + "]";
	}
    
}
