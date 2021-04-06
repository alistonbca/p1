package p1;


public class student {
	String name;
    String rollno;
    int age;
    
    
   public student()
    {
       name="xxxxx";
       rollno="R/BCA xx-xxx";
       age=0;
    }
 
   public student (String name,String rollno,int age)
    {
    	this.name = name;
    	this.rollno = rollno;
    	this.age = age;
    }
   public void setName(String name)
   {
	   this.name=name;
   }
   String getName()
   {
	   return name;
   }
   public void setRollno(String rollno)
   {
	   this.rollno = rollno;
   }
   public String getRollno()
   {
	   return rollno;
   }
   public void setAge(int age)
   {
	   this.age = age;
   }   
   public int getage() {
	   return age;
   }
   
   public void display()
   {
	   System.out.println("Students Name is" + getName());
	   System.out.println("The students roll no is " + getRollno());
	   System.out.println("Students age is " + getage());
   }
	public static void main(String[] args) {
	   student ali=new student("aliston","rbca19117",29);
	   ali.display();   
   }
}
   