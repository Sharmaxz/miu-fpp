
String findGreatest(int a, int b) {
    return a > b ?
            "A is greater than B!"
            :
            a < b ? "B is greater than A!" : "A and B are equal!";
}

String findGreatestWith3Inputs(int a, int b, int c) {
    return a > b && a > c ?
            "A is greater than B and C!"
            :
            b > a && b > c ? "B is greater than A and C!" : "C are greater than A and B!";
}

void main() {
    //System.out.println("Use \"\\t\" to produce a tab");

    String result = findGreatest(1, 2);
    IO.println(result);
}
