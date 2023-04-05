package veterinary.management;

import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GuncellemeIslemleri {

    Database db = new Database();
    private Connection conn = db.getCon();

    private Statement statement = null;

    private PreparedStatement preparedStatement = null;

    public void clientGuncelle(String oldSSN, String newName, String newAddress, String newSSN) {

        String sorgu = "UPDATE client SET clientName = ?, clientAddress = ?, clientSSN = ? WHERE clientSSN = ?";
        try {
            preparedStatement = conn.prepareCall(sorgu);
            preparedStatement.setString(1, newName);
            preparedStatement.setString(2, newAddress);
            preparedStatement.setString(3, newSSN);
            preparedStatement.setString(4, oldSSN);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EklemeIslemeleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void petGuncelle(String newRace, String newPetName, String newMustDoneVaccines, String newDoneVaccines,
            String newPetID, int newWeight, String newBdate, String clientSSN) {

        String sorgu = "UPDATE pet SET Race = ?, petName = ?, mustDoneVaccine = ?, doneVaccines = ?, petID = ?, Weight = ?, birthDate = ? WHERE clientSSN = ?";
        try {
            preparedStatement = conn.prepareCall(sorgu);
            preparedStatement.setString(1, newRace);
            preparedStatement.setString(2, newPetName);
            preparedStatement.setString(3, newMustDoneVaccines);
            preparedStatement.setString(4, newDoneVaccines);
            preparedStatement.setString(5, newPetID);
            preparedStatement.setString(6, String.valueOf(newWeight));
            preparedStatement.setString(7, newBdate);
            preparedStatement.setString(8, clientSSN);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EklemeIslemeleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void productGuncelle(String price, String productName, String pid, String category, String oldPid) {

        String sorgu = "UPDATE product SET Price = ?, productName = ?, pid = ?, Category = ? WHERE pid = ?";
        try {
            preparedStatement = conn.prepareCall(sorgu);
            preparedStatement.setString(1, price);
            preparedStatement.setString(2, productName);
            preparedStatement.setString(3, pid);
            preparedStatement.setString(4, category);
            preparedStatement.setString(5, oldPid);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EklemeIslemeleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void employeeGuncelle(String vName, String vAddress, String vSSN, String vSallary, String vDegree,
            String oldSSN) {

        String sorgu = "UPDATE vet SET vetName = ?, vetAddress = ?, vetSSN = ?, Sallary = ?, Degree = ? WHERE vetSSN = ?";
        try {
            preparedStatement = conn.prepareCall(sorgu);
            preparedStatement.setString(1, vName);
            preparedStatement.setString(2, vAddress);
            preparedStatement.setString(3, vSSN);
            preparedStatement.setString(4, vSallary);
            preparedStatement.setString(5, vDegree);
            preparedStatement.setString(6, oldSSN);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EklemeIslemeleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void reservationGuncelle(String date, String clientSSN, String oldDate) {

        String sorgu = "UPDATE reservation SET Date = ?, clientSSN = ? WHERE Date = ?";
        try {
            preparedStatement = conn.prepareCall(sorgu);
            preparedStatement.setString(1, date);
            preparedStatement.setString(2, clientSSN);
            preparedStatement.setString(3, oldDate);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EklemeIslemeleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void treatsGuncelle(String treats, String date, String treatID, String oldID) {

        String sorgu = "UPDATE reservation_treats SET Treats = ?, Date = ?, treatID = ? WHERE treatID = ?";
        try {
            preparedStatement = conn.prepareCall(sorgu);
            preparedStatement.setString(1, treats);
            preparedStatement.setString(2, date);
            preparedStatement.setString(3, treatID);
            preparedStatement.setString(4, oldID);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EklemeIslemeleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void vetPhoneGuncelle(String no, String ssn, String oldSSN) {

        String sorgu = "UPDATE vet_vetphoneno SET vetPhoneNo = ?, vetSSN = ? WHERE vetSSN = ?";
        try {
            preparedStatement = conn.prepareCall(sorgu);
            preparedStatement.setString(1, no);
            preparedStatement.setString(2, ssn);
            preparedStatement.setString(3, oldSSN);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EklemeIslemeleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void clientPhoneGuncelle(String no, String ssn, String oldSSN) {

        String sorgu = "UPDATE client_clientphoneno SET clientPhoneNo = ?, clientSSN = ? WHERE clientSSN = ?";
        try {
            preparedStatement = conn.prepareCall(sorgu);
            preparedStatement.setString(1, no);
            preparedStatement.setString(2, ssn);
            preparedStatement.setString(3, oldSSN);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EklemeIslemeleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void treatmentGuncelle(String petID, String vetSSN, String treatID) {

        String sorgu = "UPDATE treatment SET petID = ?, vetSSN = ? WHERE treatID = ?";
        try {
            preparedStatement = conn.prepareCall(sorgu);
            preparedStatement.setString(1, petID);
            preparedStatement.setString(2, vetSSN);
            preparedStatement.setString(3, treatID);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EklemeIslemeleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
