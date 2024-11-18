package com.thesquad.dao;

import com.thesquad.models.AddressModel;
import com.thesquad.connection.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddressDAO {

    private static final Logger LOGGER = Logger.getLogger(AddressDAO.class.getName());

    public AddressDAO() {}

    public void create(AddressModel address, DBConnection connection) {
        String sql = "INSERT INTO morada(num_casa, rua, bairro, fk_comuna) VALUES(?, ?, ?, ?)";
        try (PreparedStatement ps = connection.getConnection().prepareStatement(sql)) {
            ps.setInt(1, address.getHouseNum());
            ps.setString(2, address.getStreet());
            ps.setString(3, address.getDistrict());
            ps.setInt(4, address.getCommuneId());

            ps.executeUpdate();
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error creating address", e);
        }
    }

    public void update(AddressModel address, DBConnection connection) {
        String sql = "UPDATE morada SET num_casa = ?, rua = ?, bairro = ?, fk_comuna = ? WHERE pk_morada = ?";
        try (PreparedStatement ps = connection.getConnection().prepareStatement(sql)) {
            ps.setInt(1, address.getHouseNum());
            ps.setString(2, address.getStreet());
            ps.setString(3, address.getDistrict());            
            ps.setInt(4, address.getCommuneId());
            ps.setInt(5, address.getAddressId());

            ps.executeUpdate();
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error updating address", e);
        }
    }

    public void delete(int addressId, DBConnection connection) {
        String sql = "DELETE FROM morada WHERE pk_morada = ?";
        try (PreparedStatement ps = connection.getConnection().prepareStatement(sql)) {
            ps.setInt(1, addressId);

            ps.executeUpdate();
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error deleting address", e);
        }
    }

    public List<AddressModel> getAll(DBConnection connection) {
        String sql = "SELECT * FROM morada";
        List<AddressModel> addressList = new ArrayList<>();

        try (PreparedStatement ps = connection.getConnection().prepareStatement(sql);
             ResultSet resultSet = ps.executeQuery()) {

            while (resultSet.next()) {
                AddressModel address = new AddressModel();
                address.setAddressId(resultSet.getInt("pk_morada"));
                address.setStreet(resultSet.getString("rua"));
                address.setHouseNum(resultSet.getInt("num_casa"));
                address.setDistrict(resultSet.getString("bairro"));
                address.setCommuneId(resultSet.getInt("fk_comuna"));
                address.setCreationDate(resultSet.getTimestamp("data_criacao").toLocalDateTime());

                addressList.add(address);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error fetching all addresses", e);
        }

        return addressList;  // Return an empty list if no addresses are found
    }

    public AddressModel getAddressById(int addressId, DBConnection connection) {
        String sql = "SELECT * FROM morada WHERE pk_morada = ?";
        try (PreparedStatement ps = connection.getConnection().prepareStatement(sql)) {
            ps.setInt(1, addressId);

            try (ResultSet resultSet = ps.executeQuery()) {
                if (resultSet.next()) {
                    AddressModel address = new AddressModel();
                    address.setAddressId(resultSet.getInt("pk_morada"));
                    address.setStreet(resultSet.getString("rua"));
                    address.setHouseNum(resultSet.getInt("num_casa"));
                    address.setDistrict(resultSet.getString("bairro"));
                    address.setCommuneId(resultSet.getInt("fk_comuna"));
                    address.setCreationDate(resultSet.getTimestamp("data_criacao").toLocalDateTime());

                    return address;
                }
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error fetching address by ID", e);
        }

        return null;  // Return null if address not found, or return empty model instead
    }
}
