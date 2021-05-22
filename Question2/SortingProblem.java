package Question2;
import java.util.*;
public class SortingProblem {

	public static void main(String[] args) {
	      System.out.println("How many student you want to take as input?");
	      Scanner in = new Scanner(System.in);

	      int testCases = Integer.parseInt(in.nextLine());

	      List<Student> studentList = new ArrayList<>();
	          for(int i=0;i<testCases;i++)
	          {
	         int id = in.nextInt();
	         String name = in.next();
	         double cgpa = in.nextDouble();
	         
	         Student st = new Student(id, name, cgpa);
	         studentList.add(st);
	      }
	       studentList.sort(new Comparator<Student>() {
	           @Override
	           public int compare(Student s1, Student s2) {
	               if (s2.getCgpa() > s1.getCgpa()) {
	                   return 1;
	               } else if (s2.getCgpa() < s1.getCgpa()) {
	                   return -1;
	               }
	               else if(s1.getFirstName().compareTo(s2.getFirstName())< 0)
	               {
	                   return -1;
	               }
	               else if(s1.getFirstName().compareTo(s2.getFirstName())>0)
	               {
	                   return 1;
	               }
	               else if(s1.getId()<s2.getId())
	               {
	                   return 1;
	               }
	               return -1;
	           }
	       });
	      
	         for(Student st: studentList){
	         System.out.println(st.getFirstName());
	      }
	   }

	}
