package repositories;

import models.Patron;
import models.enums.Result;
import utils.DatabaseUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PatronRepository {

    // Add a Patron
    public Result add(Patron patron) {
        String sql = "INSERT INTO Patron (id, name, image) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, patron.getId());
            stmt.setString(2, patron.getName());
            stmt.setBytes(3, patron.getImage());
            stmt.executeUpdate();
            return Result.SUCCESS;
        } catch (SQLException e) {
            e.printStackTrace();
            return Result.FAILURE;
        }
    }

    // Remove a Patron
    public Result remove(Patron patron) {
        String sql = "DELETE FROM Patron WHERE id = ?";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, patron.getId());
            stmt.executeUpdate();
            return Result.SUCCESS;
        } catch (SQLException e) {
            e.printStackTrace();
            return Result.FAILURE;
        }
    }

    // Update a Patron
    public Result update(Patron patron) {
        String sql = "UPDATE Patron SET name = ?, image = ? WHERE id = ?";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, patron.getName());
            stmt.setBytes(2, patron.getImage());
            stmt.setString(3, patron.getId());
            stmt.executeUpdate();
            return Result.SUCCESS;
        } catch (SQLException e) {
            e.printStackTrace();
            return Result.FAILURE;
        }
    }

    // Find a Patron by ID
    public Patron findPatronById(String id) {
        String sql = "SELECT * FROM Patron WHERE id = ?";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Patron(rs.getString("id"), rs.getString("name"), rs.getBytes("image"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Find Patrons by Name
    public List<Patron> findPatron(String name) {
        String sql = "SELECT * FROM Patron WHERE name LIKE ?";
        List<Patron> patrons = new ArrayList<>();
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + name + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                patrons.add(new Patron(rs.getString("id"), rs.getString("name"), rs.getBytes("image")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return patrons;
    }

    // Find All Patrons
    public List<Patron> findAllPatrons() {
        String sql = "SELECT * FROM Patron";
        List<Patron> patrons = new ArrayList<>();
        try (Connection conn = DatabaseUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                patrons.add(new Patron(rs.getString("id"), rs.getString("name"), rs.getBytes("image")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return patrons;
    }
}
