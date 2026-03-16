void main() {
    String[] courses = {"CS390", "CS401", "CS422", "CS455", "CS501", "CS522", "CS555"};

    String[] c400 = new String[3];
    System.arraycopy(courses, 1, c400, 0, 3);

    System.out.println("System.arraycopy:" + Arrays.toString(c400));
}
