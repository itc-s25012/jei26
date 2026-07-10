package d52;

class Cooking {
    private String name;
    private int time;

    Cooking(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }
}

class Cooker {
    private Cooking c1 = new Cooking("ステーキ", 20);
    private Cooking c2 = new Cooking("ミニサラダ", 10);

    public Cooking getC1() {
        return c1;
    }

    public Cooking getC2() {
        return c2;
    }
}

public class Q2Ensyu {
    public static void main(String[] args) {
        Cooker cooker = new Cooker();
        System.out.println(cooker.getC1().getName());
    }
}