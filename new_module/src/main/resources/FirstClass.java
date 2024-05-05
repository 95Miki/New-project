import jdk.nashorn.internal.objects.annotations.Getter;

import java.util.Random;

public class FirstClass {
    int s = 22;
    int a = 23;

    public FirstClass(int s, int a) {
        this.s = s;
        this.a = a;
    }

    @Override
    public String toString() {
        return "FirstClass{" +
                "s=" + s +
                ", a=" + a +
                '}';
    }
}

    public static void main(String[] args) {
        if (s>a){
        System.out.println("Hello World");
    }
}
