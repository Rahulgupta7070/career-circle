package ComparableAndComparator;

public class Student implements Comparable<Student>{

	String name;
    int Sid;
   
       Student(String name, int sid) {
		this.name = name;
		Sid = sid;
	}
       @Override
    public String toString() {
   		return "Student [name=" + name + ", Sid=" + Sid + "]";
   	}
	   @Override
	   public int compareTo(Student o) {
		// TODO Auto-generated method stub
//		return this.Sid.compareTo(o.Sid);
//			if(this.Sid<o.Sid) {
//				return 1;
//			}
//			if(this.Sid>o.Sid) {
//				return -1;
//			}
//			return 0;
		   
		   //return (this.Sid>o.Sid)?1:(this.Sid<o.Sid)?-1:0;
		   
		   return (this.Sid-o.Sid); 
	   }
}
