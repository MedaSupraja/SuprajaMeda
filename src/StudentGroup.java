import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		
		
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		 int id;
		 String fullName;
		 Date day;
		 double avg;
		 SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		 id=sc.nextInt();
		 fullName=sc.next();
		 day=sc.hasNext();
		 avg=sc.nextDouble();
		 s[i]=setId(id);
		 s[i]=setFullName(fullNmae);
		 s[i]=setBirthDate(day);
		 s[i]=setAvgMark(avg);
			 
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		    checkIndex(index);
		    for (int i = index; i < size() - 1; i++)
		      s[i] = s[i + 1];
		    
		    s--;
		  
	
	}

	@Override
	public void remove(Student student) {
		
		// Add your implementation here
		students.remove(student)
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		 Node temp = head;
		  Node temp2 =null;
		  // Check for underflow  
		  if(temp.getNext()==null){
		  
		   return;
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		 int out, i;

	      for(out=n-1; out>0; out--) 
	         for(ii=0; i<out; in++)     // "in < out" better than "in < nElems-1"   
	            if (a[i] > a[i+1])     // out of order?
	               swap(i, i+1);       // swap them

		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
