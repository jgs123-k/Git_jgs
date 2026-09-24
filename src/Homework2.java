import java.util.Scanner;

class Student {
    private int stdid;
    private String name;
    private String major;

    private long phonenum;


    public Student(int id, String n, String m, long p) {
        stdid = id;
        name = n;
        major = m;
        phonenum = p;
    }





    public int getStdid() { return stdid; }
    public void setStdid(int stdid) { this.stdid = stdid; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    public long getPhonenum() { return phonenum; }
    public void setPhonenum(long phonenum) { this.phonenum = phonenum; }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Student[] students = new Student[3];


        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            int id = scanner.nextInt();
            String name = scanner.next();
            String major = scanner.next();
            long phone = scanner.nextLong();
            students[i] = new Student(id, name, major, phone);
        }

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");


        for (int i = 0; i < 3; i++) {
            Student s = students[i];


            String phoneStr = "0" + Long.toString(s.getPhonenum());


            String formattedPhone = phoneStr.substring(0, 3) + "-" +
                    phoneStr.substring(3, 7) + "-" +
                    phoneStr.substring(7);

            System.out.println((i + 1) + "번째 학생: " +
                    s.getStdid() + " " +
                    s.getName() + " " +
                    s.getMajor() + " " +
                    formattedPhone);
        }

        scanner.close();
    }
}
