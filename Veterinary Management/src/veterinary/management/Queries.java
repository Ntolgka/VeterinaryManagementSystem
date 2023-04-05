package veterinary.management;

import javax.swing.*;
import javax.swing.plaf.nimbus.State;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Queries {

    Database db = new Database();

    public String mostUsedTreat() {

        String query = "SELECT reservation_treats.Treats, COUNT(*) AS MostUsedTreat from reservation_treats GROUP BY reservation_treats.Treats ORDER BY MostUsedTreat DESC LIMIT 1";

        Statement st = null;
        try {
            st = db.getCon().createStatement();
            ResultSet res = st.executeQuery(query);
            res.next();
            String rs = res.getString("Treats") + ": ";
            rs += res.getString("MostUsedTreat") + " veri";
            return rs;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } return null;
    }

    public String mostSoldMedicine() {

        String query = "SELECT buy.pid, COUNT(*) AS MostSoldMedicine from buy WHERE MOD(pid, 2) = 0 GROUP BY buy.pid ORDER BY MostSoldMedicine DESC LIMIT 1;";

        Statement st = null;
        Statement st2 = null;
        try {
            st = db.getCon().createStatement();
            st2 = db.getCon().createStatement();
            ResultSet res = st.executeQuery(query);
            res.next();
            String rs = res.getString("pid");
            String query2 = "SELECT product.productName from product WHERE product.pid = " + rs + ";";
            ResultSet res2 = st2.executeQuery(query2);
            res2.next();
            String temp = " " + res2.getString("productName") + ": " + res.getString("MostSoldMedicine") + " veri";
            return temp;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } return null;
    }

    public String mostCommonRace() {

        String query = "SELECT pet.Race, COUNT(*) AS MostCommonRace from pet GROUP BY pet.Race ORDER BY MostCommonRace DESC LIMIT 1";
        Statement st = null;
        try {
            st = db.getCon().createStatement();
            ResultSet res = st.executeQuery(query);
            res.next();
            String rs = res.getString("Race") + ": ";
            rs += res.getString("MostCommonRace") + " veri";
            return rs;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } return null;
    }

    public String mostOperatingVet() {

        String query = "SELECT treatment.vetSSN, COUNT(*) AS MostOperatingVet from treatment GROUP BY treatment.vetSSN ORDER BY MostOperatingVet DESC LIMIT 1;";

        Statement st = null;
        Statement st2 = null;
        try {
            st = db.getCon().createStatement();
            st2 = db.getCon().createStatement();
            ResultSet res = st.executeQuery(query);
            res.next();
            String rs = res.getString("vetSSN");
            String query2 = "SELECT vet.vetName from vet WHERE vet.vetSSN = " + rs + ";";
            ResultSet res2 = st2.executeQuery(query2);
            res2.next();
            String temp = " " + res2.getString("vetName") + ": " + res.getString("MostOperatingVet") + " veri";
            return temp;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } return null;
    }

    public String avgProductPrice() {

        //SELECT AVG(Sales) FROM Store_Information;
        String query = "SELECT AVG(product.Price) FROM product";
        Statement st = null;
        try {
            st = db.getCon().createStatement();
            ResultSet res = st.executeQuery(query);
            res.next();
            String rs = "Average of Product Prices: " + res.getString("AVG(product.Price)");
            return rs;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } return null;
    }

}
