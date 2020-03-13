package ua.lviv.lgs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static ua.lviv.lgs.ConnectionUtils.openConnection;

public class ClothesDAO {
    static String READ_ALL = "select * from Shop";
    static String CREATE = "INSERT INTO Shop (`name`, `dept`, `Size_id`, `kind_of_clothes_id`,`tissue_id`, `producer_id`," +
            "`type_id`, `price_id` ) VALUES (?,?,?,?,?,?,?,?)";
    static String READ_BY_ID = "select * from Shop where id = ?";
    static String UPDATE_BY_ID = "update Shop set name = ?," +
            " dept = ?, Size_id = ?, kind_of_clothes_id = ?,  tissue_id = ?, producer_id = ?, type_id = ?, price_id = ? where id = ?";
    static String DELETE_BY_ID = "delete from Shop where id = ? ";

    private Connection connection;
    private PreparedStatement preparedStatement;
    public ClothesDAO(Connection connection){
        this.connection = connection;
    }

    public List<Сlothes> readAll() throws Exception, SQLException {
        List<Сlothes> listofClothes = new ArrayList<>();
        preparedStatement = connection.prepareStatement(READ_ALL);
        ResultSet result = preparedStatement.executeQuery();
        while (result.next()) {
            listofClothes.add(ClothesMap.map(result));
        }
        return listofClothes;
    }

    public void insert(Сlothes clothes) throws SQLException {
        preparedStatement = connection.prepareStatement(CREATE);
        preparedStatement.setString(1, clothes.getName());
        preparedStatement.setString(2, clothes.getDept());
        preparedStatement.setInt(3, clothes.getSize());
        preparedStatement.setInt(4, clothes.getKind_of_clothes());
        preparedStatement.setInt(5,clothes.getTissue());
        preparedStatement.setInt(6, clothes.getProducer());
        preparedStatement.setInt(7, clothes.getType());
        preparedStatement.setInt(8,clothes.getPrice());

        preparedStatement.executeUpdate();
    }

    public void update(Сlothes clothes) throws SQLException {
        preparedStatement = connection.prepareStatement(UPDATE_BY_ID);
        preparedStatement.setString(1, clothes.getName());
        preparedStatement.setString(2, clothes.getDept());
        preparedStatement.setInt(3, clothes.getSize());
        preparedStatement.executeUpdate();
    }

    public void delete(int id) throws SQLException {
        preparedStatement = connection.prepareStatement(DELETE_BY_ID);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
    }
}
