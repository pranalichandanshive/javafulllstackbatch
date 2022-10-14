package String;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        builder.append("codekul.");
        System.out.println(builder);
        builder.append("pvt.");
        System.out.println(builder);
        builder.append("Ltd.");
        System.out.println(builder);
        builder.insert(0,"**");
        System.out.println(builder);
    }
}
