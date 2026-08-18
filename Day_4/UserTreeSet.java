package Day_4;

public class UserTreeSet {

    	private int id;
	private String name;
	private int age;

	public UserTreeSet(int id, String name, int age) {

		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	@Override

	public String toString() {

		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
    
}
