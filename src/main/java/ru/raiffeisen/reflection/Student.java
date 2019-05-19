package ru.raiffeisen.reflection;

public class Student extends PersonBase implements Studying {
//public class Student extends PersonBase implements Person, Studying{
//	protected String  name;

    private String grade;
    private String id;

    public Student() {
//		super();
        super("ilker", 12);
    }

    public Student(String name, Integer age) {
        super(name, age);
//		this.name = name;
//		this.age = age;
    }

/*
	public Student(String _name, Integer _age, String _grade) {
//		super();	// this line is implied if it is not there
		super.name = _name;
		this.name = _name + "goes to this classes attribute";
		name = _name + "interesting";
		super.age = _age + 10;
		this.age = _age + 20;
		age = _age;
		grade = _grade;
	}
*/

    public Student(String name, Integer age, String grade) {
        this(name, age);
//		name = _name;
//		age = _age;
        this.grade = grade;
    }


    public Student(String name, Integer age, String grade, String id) {
        this(name, age, grade);
//		super(_name, _age);
//		name = _name;
//		age = _age;
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public String getId() {
        return id;
    }

    /**
     *
     */
//	@Override
    public String getName(String _name, Integer _age) {
        return name;
    }

    public String getName(String _lastName) {
        return name + _lastName;
    }

    /* (non-Javadoc)
     * @see com.mycompany.myapp.mycomponent.Person#getAge()
     */
    @Override
    public Integer getAge() {
        return age - 10;
    }

    @Override
    public String studyFor() {
        // TODO Auto-generated method stub
        return "JAVA";
    }

}

