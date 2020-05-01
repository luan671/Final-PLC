public class Main {

public static void main(String[] args) {

int first = 23, second = 56, third = -1;

int min, max, mid;

if (first >= second && first >= third) {

max = first;

if (second >= third) {

mid = second;

min = third;

} else {

mid = third;

min = second;

}

} else if (second >= first && second >= third) {

max = second;

if (first >= third) {

mid = first;

min = third;

} else {

mid = third;

min = first;

}

} else {

max = third;

if (first >= second) {

mid = first;

min = second;

} else {

mid = second;

min = first;

}

}

System.out.println(min + ", " + mid + ", " + max);

}

}
