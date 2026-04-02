public static void main(String[] args) {
 uc4
    System.out.println("=====================================");
    System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
    System.out.println("=====================================\n");

    List<String> trainConsist = new LinkedList<>();

    trainConsist.add("Engine");
    trainConsist.add("Sleeper");
    trainConsist.add("AC");
    trainConsist.add("Cargo");
    trainConsist.add("Guard");

    System.out.println("Initial Train Consist:");
    System.out.println(trainConsist);

    trainConsist.add(2, "Pantry Car");
    System.out.println("\nAfter Inserting 'Pantry Car' at position 2:");
    System.out.println(trainConsist);

    trainConsist.remove(0);
    trainConsist.remove(trainConsist.size() - 1);
    System.out.println("\nAfter Removing First and Last Bogie:");
    System.out.println(trainConsist);

    System.out.println("\nUC4 ordered consist operations completed...");

    System.out.println("===========================================");
    System.out.println(" UC3 - Track Unique Bogie IDs ");
    System.out.println("===========================================\n");

    Set<String> bogies = new HashSet<>();

    bogies.add("BG101");
    bogies.add("BG102");
    bogies.add("BG103");
    bogies.add("BG104");
    bogies.add("BG101");
    bogies.add("BG102");

    System.out.println("Bogie IDs After Insertion:");
    System.out.println(bogies);

    System.out.println("\nNote:");
    System.out.println("Duplicates are automatically ignored by HashSet.");

    System.out.println("\nUC3 uniqueness validation completed...");
 main
}
