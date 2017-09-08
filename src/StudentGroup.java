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
	LinkedList<students>list;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
		this.list=new LinkedList<Student>(Arrays.asList(students));
	}

	@Override
	public Student[] getStudents() {
		
		Student[] stud=new Student[students.length];
		for(int i=0;i<students.length;i++)
		{
			stud=students[i];
			
		}
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		students=new Student[students.length];
		for(int i=0;i<student.length;i++)
		{
			list.add(i);
		}
		}

	@Override
	public Student getStudent(int index) {
		
		return get(index);
	}

	@Override
	public void setStudent(Student student, int index) {
		list.add(index,student);
	}

	@Override
	public void addFirst(Student student) {
		list.addFirst(student);
	}

	@Override
	public void addLast(Student student) {
		list.addLast(student);
	}

	@Override
	public void add(Student student, int index) {
		list.add(student,index);
	}

	@Override
	public void remove(int index) {
		list.remove(index);
	}

	@Override
	public void remove(Student student) {
		list.remove(student);
	}

	@Override
	public void removeFromIndex(int index) {
	list.removeFromIndex(student,index);
	}

	@Override
	public void removeFromElement(Student student) {
		list.removeFromElement(student);
	}

	@Override
	public void removeToIndex(int index) {
		list.removeRange(index,list.size());
	}

	@Override
	public void removeToElement(Student student) {
		list.removeToElement(student);
		
	}

	@Override
	public void bubbleSort() {
		Collections.sort(list);
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		list.getByBirthDate(date);
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		if(firstDate==null || lastDate==null)
			throw IllegalArgumentException
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return n;
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
