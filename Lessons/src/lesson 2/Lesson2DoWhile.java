void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");

    int n = sc.nextInt();
    int index = 1;
    int result = 0;

    do {
        result = result + (index * index);
        index++;
    } while (index <= n);

    System.out.println(result);
}
