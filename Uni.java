import java.util.*;

class Vorodi implements Comparable<Vorodi> {
    private String name;
    private int code;
    private double moadel;

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setCode(int c) {
        this.code = c;
    }

    public int getCode() {
        return code;
    }

    public void setMoadel(double m) {
        this.moadel = m;
    }

    public double getMoadel() {
        return moadel;
    }

    public int compareTo(Vorodi other) {
        return Integer.compare(this.code, other.code);
    }

    public Vorodi(String n, int c, double m) {
        setName(n);
        setCode(c);
        setMoadel(m);
    }

    public String d() {
        return ("[" + getName() + "," + getCode() + "," + getMoadel() + "]");
    }
}

public class Uni {
    public static void main(String[]args) {
        TreeSet<Vorodi> studentSet = new TreeSet<>();
        Scanner s = new Scanner(System.in);
        int tedad = s.nextInt();


            for (int i = 0; i < tedad; i++) {
                String n = s.next();
                int c = s.nextInt();
                double m = s.nextDouble();
                Vorodi student = new Vorodi(n, c, m);
                studentSet.add(student);
            }

            int searchId = s.nextInt();
            boolean found = false;
            for (Vorodi i : studentSet) {
                if (searchId == i.getCode()) {
                    System.out.println("Student Found");
                    System.out.println("name :" + i.getName() + "\nId : " + i.getCode() + "\nmoadel :" + i.getMoadel());
                    found = true;
                }
            }

            if (!found) {
                System.out.println("Student not Found");
            }
        }

}