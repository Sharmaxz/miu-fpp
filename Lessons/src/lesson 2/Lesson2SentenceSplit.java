void main() {
    String name = "Hello,string can be fun. They have many uses.";

    String[] words = name.split(",|\\. | |\\.");

    for(String word : words)
        IO.println(word);

    IO.println(words.length);
}
