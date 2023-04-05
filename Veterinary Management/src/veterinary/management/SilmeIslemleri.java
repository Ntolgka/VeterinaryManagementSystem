package veterinary.management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SilmeIslemleri {
    Database db = new Database();
    private Connection conn = db.getCon();
    private PreparedStatement preparedStatement = null;

    public void clientDelete(String curSSN) {

        String sorgu = "DELETE from client WHERE clientSSN = ?";
        try {
            preparedStatement=conn.prepareCall(sorgu);
            preparedStatement.setString(1, curSSN);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EklemeIslemeleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void petDelete(String curPetID) {

        String sorgu = "DELETE from pet WHERE petID = ?";
        try {
            preparedStatement=conn.prepareCall(sorgu);
            preparedStatement.setString(1, curPetID);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EklemeIslemeleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void productDelete(String curPID) {

        String sorgu = "DELETE from product WHERE pid = ?";
        try {
            preparedStatement=conn.prepareCall(sorgu);
            preparedStatement.setString(1, curPID);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EklemeIslemeleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void employeeDelete(String curVetSSN) {

        String sorgu = "DELETE from vet WHERE vetSSN = ?";
        try {
            preparedStatement=conn.prepareCall(sorgu);
            preparedStatement.setString(1, curVetSSN);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EklemeIslemeleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void reservationDelete(String curDate) {

        String sorgu = "DELETE from reservation WHERE Date = ?";
        try {
            preparedStatement=conn.prepareCall(sorgu);
            preparedStatement.setString(1, curDate);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EklemeIslemeleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void treatsDelete(String curID) {

        String sorgu = "DELETE from reservation_treats WHERE treatID = ?";
        try {
            preparedStatement=conn.prepareCall(sorgu);
            preparedStatement.setString(1, curID);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EklemeIslemeleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void vetPhoneDelete(String curSSN) {

        String sorgu = "DELETE from vet_vetphoneno WHERE vetSSN = ?";
        try {
            preparedStatement=conn.prepareCall(sorgu);
            preparedStatement.setString(1, curSSN);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EklemeIslemeleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void clientPhoneDelete(String curSSN) {

        String sorgu = "DELETE from client_clientphoneno WHERE clientSSN = ?";
        try {
            preparedStatement=conn.prepareCall(sorgu);
            preparedStatement.setString(1, curSSN);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EklemeIslemeleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void treatmentDelete(String curID) {

        String sorgu = "DELETE from treatment WHERE treatID = ?";
        try {
            preparedStatement=conn.prepareCall(sorgu);
            preparedStatement.setString(1, curID);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EklemeIslemeleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
