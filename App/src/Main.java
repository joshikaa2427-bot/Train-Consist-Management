public static void main(String[] args) {
    System.out.println("=========================================");
    System.out.println(" UC2 - Add Passenger Bogies to Train ");
    System.out.println("=========================================\n");

    List<String> passengerBogies = new ArrayList<>();

    // ---- CREATE (Add bogies) ----
    passengerBogies.add("Sleeper");
    passengerBogies.add("AC Chair Car");
    passengerBogies.add("General");

    // ---- READ (Display bogies) ----
    System.out.println("Passenger Bogies: " + passengerBogies);

    // ---- UPDATE (Modify bogie) ----
    passengerBogies.set(1, "AC 2-Tier");

    // ---- DELETE (Remove bogie) ----
    passengerBogies.remove("General");

    // ---- CHECK (Availability) ----
    System.out.println("Is Sleeper available? " + passengerBogies.contains("Sleeper"));

    // ---- FINAL CONSIST ----
    System.out.println("Final Train Consist: " + passengerBogies);
}
