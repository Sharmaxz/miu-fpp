void main() {
    String[] names = {"John", "Jane", "Jack", "João Pedro" };

    for(String name : names)
        if(name.length() >= 5)
            System.out.println(name);
}
