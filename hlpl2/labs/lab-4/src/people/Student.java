package people;

public class Student extends ComparablePerson {
    private final String neptune;
    private String program;

    public Student(String id, String name, int age, String neptune, String program) {
        super(id, name, age);
        this.neptune = neptune;
        this.program = program;
    }

    public Student(String id, String name, String neptune, String program) {
        super(id, name, 18);
        this.neptune = neptune;
        this.program = program;
    }

    public Student(String id, String name, String neptune) {
        super(id, name, 18);
        this.neptune = neptune;
        this.program = "CS BSc";
    }

    public String getNeptune() {
        return neptune;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", program='" + program + '\'' +
                ", neptune='" + neptune + '\'' +
                '}';
    }
}
