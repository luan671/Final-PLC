public class Main {

public static void main(String[] args) {

int first = 23, second = 56, third = -1;

int min, max, mid;

max = Math.max(first, Math.max(second, third));

min = -Math.max(-first, Math.max(-second, -third));

mid = (first + second + third) - (min + max);

System.out.println(min + ", " + mid + ", " + max);

}

}
