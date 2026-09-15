class Subway{
    int line;

    void run(){System.out.printf("line " + line + " run");}
    void setLine(int linenum){line = linenum;}
}

class Test{
    public static void main(String[] args){
        Subway testsub = new Subway();
        testsub.setLine(9);
        testsub.run();
    }
}