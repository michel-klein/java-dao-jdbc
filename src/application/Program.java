package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        List<Seller> sellerList = sellerDao.findByDepartment(2);
        for (Seller sellerItem : sellerList) {
            System.out.println(sellerItem);
        }
    }
}
