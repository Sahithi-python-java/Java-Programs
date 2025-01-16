package main;

import models.Patron;
import repositories.PatronRepository;
import models.enums.Result;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PatronRepository patronRepo = new PatronRepository();

        // Add a Patron
        Patron patron = new Patron("pat1", "George", null);
        if (patronRepo.add(patron) == Result.SUCCESS) {
            System.out.println("Patron added successfully!");
        } else {
            System.out.println("Failed to add Patron.");
        }

        // Find a Patron by ID
        Patron foundPatron = patronRepo.findPatronById("pat1");
        if (foundPatron != null) {
            System.out.println("Found Patron: " + foundPatron.getName());
        } else {
            System.out.println("Patron not found.");
        }

        // Find Patrons by Name
        System.out.println("Find Patrons by Name (e.g., George):");
        List<Patron> patronsByName = patronRepo.findPatron("George");
        for (Patron p : patronsByName) {
            System.out.println("ID: " + p.getId() + ", Name: " + p.getName());
        }

        // Update a Patron
        patron.setName("Updated George");
        if (patronRepo.update(patron) == Result.SUCCESS) {
            System.out.println("Patron updated successfully!");
        } else {
            System.out.println("Failed to update Patron.");
        }

        // Delete a Patron
        if (patronRepo.remove(patron) == Result.SUCCESS) {
            System.out.println("Patron deleted successfully!");
        } else {
            System.out.println("Failed to delete Patron.");
        }
    }
}
