package ua.lviv.lgs;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static ua.lviv.lgs.ConnectionUtils.openConnection;

public class App {

    public static void main(String[] args) throws Exception, SQLException{
        ClothesDAO clothesDAO = new ClothesDAO(openConnection());
        clothesDAO.readAll();

//        clothesDAO.readAll().forEach(System.out::println);
//        System.out.println("************************************************\n");

        List<Сlothes> listofClothes = new  ArrayList<>();
        listofClothes.add(new Сlothes ("Тарас","IT", 1, 1, 1, 1, 1, 1));
        listofClothes.add(new Сlothes ("Тарас","IT", 1, 1, 1, 1, 1, 1));
        listofClothes.add(new Сlothes ("Тарас","IT", 1, 1, 1, 1, 1, 1));

//        listofClothes.forEach(clothes -> {
//            try {
//                clothesDAO.insert(clothes);
//            } catch (SQLException c ){
//                c.printStackTrace();
//            }
//        });

//        clothesDAO.readAll().forEach(System.out::println);
//        System.out.println("************************************************\n");
    }




}

