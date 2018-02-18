public class CloneableEg implements Cloneable {

   private String dname;

	
   public String getDname() {
      return dname;
   }

   public void setDname(String dname) {
      this.dname = dname;
   }

   // Overriding clone() method of Object class
   public Object clone()throws CloneNotSupportedException{  
      return (CloneableEg)super.clone();  
   }
	
   public static void main(String[] args) {
      CloneableEg obj1 = new CloneableEg();
      try {
	obj1.setDname("Dog1");
	//Cloning obj1 into obj2
	CloneableEg obj2 = (CloneableEg) obj1.clone();
			
	//Displaying both the objects content
	System.out.println(obj1.getDname());
	System.out.println(obj2.getDname());
			
	//Setting up name in obj2
	obj1.setDname("Dog2");
			
	//Displaying both the objects content
	System.out.println(obj1.getDname());
	System.out.println(obj2.getDname());
      } catch (CloneNotSupportedException e) {
	   e.printStackTrace();
	}
   }
}