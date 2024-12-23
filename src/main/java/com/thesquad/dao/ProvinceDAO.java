package com.thesquad.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.thesquad.models.ProvinceModel;
import com.thesquad.connection.DBConnection;

public class ProvinceDAO {

    public ProvinceDAO() {

    }

    public void create(ProvinceModel province, DBConnection connection) {
        String sql = "INSERT INTO provincia(nome, fk_pais) values(?, ?)";
        try {
            PreparedStatement ps = connection.getConnection().prepareStatement(sql);
            ps.setString(1, province.getName());
            ps.setInt(2, province.getCountryId());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(ProvinceModel province, DBConnection connection) {
        String sql = "UPDATE provincia SET nome = ?, fk_pais = ? WHERE pk_provincia = ?";
        try {
            PreparedStatement ps = connection.getConnection().prepareStatement(sql);
            ps.setString(1, province.getName());
            ps.setInt(2, province.getCountryId());
            ps.setInt(3, province.getProvinceId());

            ps.executeUpdate();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int provinceId, DBConnection connection) {
        String sql = "DELETE FROM provincia WHERE pk_provincia = ?";
        try {
            PreparedStatement ps = connection.getConnection().prepareStatement(sql);
            ps.setInt(1, provinceId);

            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<ProvinceModel> getAll(DBConnection connection) {
        String sql = "SELECT * FROM provincia";

        List<ProvinceModel> provinceList = new ArrayList<>();

        try {
            PreparedStatement ps = connection.getConnection().prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                ProvinceModel province = new ProvinceModel();
                province.setProvinceId(resultSet.getInt(1));
                province.setName(resultSet.getString(2));
                province.setCountryId(resultSet.getInt(3));
                province.setCreationDate(resultSet.getTimestamp(4).toLocalDateTime());

                provinceList.add(province);
            }
            ps.close();
            resultSet.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return provinceList;
    }

    public ProvinceModel getProvinceById(int provinceId, DBConnection connection) {
        String sql = "SELECT * FROM provincia WHERE pk_provincia = ?";

        try {
            ProvinceModel province = new ProvinceModel();
            PreparedStatement ps = connection.getConnection().prepareStatement(sql);
            ps.setInt(1, provinceId);

            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                province.setProvinceId(resultSet.getInt(1));
                province.setName(resultSet.getString(2));
                province.setCountryId(resultSet.getInt(3));
                province.setCreationDate(resultSet.getTimestamp(4).toLocalDateTime());
            }

            ps.close();
            resultSet.close();
            return province;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<ProvinceModel> getProvincesByCountryId(int countryId, DBConnection connection) {
        String sql = "SELECT * FROM provincia WHERE fk_pais = " + countryId;

        List<ProvinceModel> provinceList = new ArrayList<>();

        try {
            PreparedStatement ps = connection.getConnection().prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                ProvinceModel province = new ProvinceModel();
                province.setProvinceId(resultSet.getInt(1));
                province.setName(resultSet.getString(2));
                province.setCountryId(resultSet.getInt(3));
                province.setCreationDate(resultSet.getTimestamp(4).toLocalDateTime());

                provinceList.add(province);
            }
            ps.close();
            resultSet.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return provinceList;
    }
}
