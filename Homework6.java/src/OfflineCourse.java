public class OfflineCourse extends Course{

    OfflineCourse(String s1, String s2){
        super(s1, s2);
    }

    @Override
    public String toString(){
        return "Code: " + code + ", Name: " + name + ", Type: Offline";
    }


}
