package day05.MethodChaning;

public class Student {
    private String name;
    private int age;
    
    public Student setName(String name){
        this.name=name;
        return this;
        
    }
    public Student setAge(int age){
        this.age=age;
        return this;
    }
    public void display(){
        System.out.println("Name : "+name+"\tAge : "+age);
    }

    public static void main(String[] args) {
        new Student().setName("Rahul").setAge(22).display();
    }

    
}
