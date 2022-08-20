package String;

import com.mysql.cj.conf.url.XDevApiDnsSrvConnectionUrl;

public class Person {

    private int pId;
    private String name;
    private  String mobile;

    @Override
    public String toString() {
        return "Person{" +
                "pId=" + pId +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Person p=new Person();
        p.pId = 1;
        p.name="iphone";
        p.mobile="12233333";
        System.out.println(p.toString());

    }
}
