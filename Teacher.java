package pkg1;

// PART A, B, C
class Teacher extends Person {
    private String subject;
    private int salary;

    public Teacher() {
        super();
    }

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public Teacher(String name, String subject, int salary) {
        super(name);
        this.subject = subject;
        this.salary = salary;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void sayHiTeacher() {
        System.out.println("hi i am a teacher");
    }

    // PART C
    public boolean equals(Object o) {
        if(o.getClass() != this.getClass()) {
            System.out.println("false because this is not a teacher");
            return false;
        } else if (!((Teacher) o).getName().equals(this.getName())) {
            System.out.println("false because these are different people");
            return false;
        } else {
            boolean result = ((Teacher) o).getSubject().equals(this.getSubject());
            System.out.println(result ? "true because same person and same subject taught" : "false because different subjects taught");
            return result;
        }
    }

    public int compareTo(Object o) {
        if(o.getClass() != this.getClass()) {
            System.out.print("ERROR: this is not a teacher ");
            return 404;
        } else {
            if(((Teacher) o).getSalary() == this.getSalary()) {
                System.out.print("same salary so ");
                return 0;
            } else {
                System.out.print("price difference: ");
                return this.salary - ((Teacher) o).getSalary();
            }
        }
    }
}
