package ua.lviv.lgs;

import javax.xml.transform.Result;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClothesMap {

    public static Сlothes map (ResultSet result) throws Exception{
        String name =  result.getString("name");
        String dept = result.getString("dept");
        int size = result.getInt("Size_id");
        int  kind_of_clothes = result.getInt("kind_of_clothes_id");
        int  tissue = result.getInt("tissue_id");
        int producer = result.getInt("producer_id");
        int  type = result.getInt("type_id") ;
        int price = result.getInt("price_id");

        return new Сlothes (name, dept, size, kind_of_clothes,tissue, producer,type, price);
    }
}
