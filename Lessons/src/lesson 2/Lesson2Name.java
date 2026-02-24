void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("What's your name?: ");

    String name = sc.nextLine();
    int count = 0;
    for(int i = 0; i < name.length(); i++) {
        if(name.split("")[i].equals("e"))
            count++;
    }

    System.out.println(count);
    sc.close();
}
