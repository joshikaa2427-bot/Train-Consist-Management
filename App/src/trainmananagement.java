public static void main(String[] args) {
    System.out.println("===============================================");
    System.out.println(" UCS - Preserve Insertion Order of Bogies ");
    System.out.println("===============================================\n");

    Set<String> formation = new LinkedHashSet<>();

    formation.add("Engine");
    formation.add("Sleeper");
    formation.add("Cargo");
    formation.add("Guard");
    formation.add("Sleeper"); // duplicate ignored

    System.out.println("Final Train Formation:");
    System.out.println(formation);

    System.out.println("\nNote:");
    System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

    System.out.println("\nUCS formation setup completed...");
}
