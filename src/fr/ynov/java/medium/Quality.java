import java.util.Objects;

public class Quality {
    private int id;
    private String name;

    Quality(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public static void main(String[] args) {
        Quality q = new Quality(1, "Quality");
        Quality q2 = new Quality(1, "Quality");
        System.out.println(q.equals(q2));
        System.out.println(q.hashCode(q2));
    }

    public boolean equals(Quality q) {
        return this.id == q.id && Objects.equals(this.name, q.name);
    }

    public boolean hashCode(Quality q) {
        return this.id == q.id && Objects.equals(this.name, q.name);
    }
}
