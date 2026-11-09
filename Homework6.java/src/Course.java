public class Course {
    protected String code;
    protected String name;

    Course(String s1, String s2){
        this.code = s1;
        this.name = s2;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

}
