public static void main(String[] args) {
 uc7
    System.out.println("===============================================");
    System.out.println(" UC7 - Sort Bogies by Capacity (Comparator) ");
    System.out.println("===============================================\n");

    List<Bogie> bogies = new ArrayList<>();

    bogies.add(new Bogie("Sleeper", 72));
    bogies.add(new Bogie("AC Chair", 56));
    bogies.add(new Bogie("First Class", 24));
    bogies.add(new Bogie("General", 90));

    System.out.println("Before Sorting:");
    for (Bogie b : bogies) {
        System.out.println(b.name + " -> " + b.capacity);
    }

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
    System.out.println(" UC6 - Map Bogie to Capacity (HashMap) ");
    System.out.println("===========================================\n");

    Map<String, Integer> capacityMap = new HashMap<>();

    capacityMap.put("First Class", 24);
    capacityMap.put("Cargo", 120);
    capacityMap.put("Sleeper", 72);
    capacityMap.put("AC Chair", 56);

    System.out.println("Bogie Capacity Details:");
    for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
        System.out.println(entry.getKey() + " -> " + entry.getValue());
    }

 uc6
    System.out.println("\nUC6 bogie-capacity mapping completed...");
 main

    bogies.sort(Comparator.comparingInt(b -> b.capacity));

 uc7
    System.out.println("\nAfter Sorting by Capacity:");
    for (Bogie b : bogies) {
        System.out.println(b.name + " -> " + b.capacity);
    }

    System.out.println("\nUC7 sorting completed...");
}

static class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    System.out.println("\nUC3 uniqueness validation completed...");
 main
 main
main
}
