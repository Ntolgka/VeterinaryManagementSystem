package veterinary.management;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EklemeIslemeleri {
    Database db = new Database();
    private Connection conn = db.getCon();

    private Statement statement = null;

    private PreparedStatement preparedStatement = null;

    public void clientekle(String name, String address, String ssn) {
        String sorgu = "insert into client(clientName,clientAddress,clientSSN) VALUES(?,?,?) ";
        try {
            preparedStatement = conn.prepareCall(sorgu);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, address);
            preparedStatement.setString(3, ssn);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "The data you want to add already exists.");
        }
    }

    public void employeeekle(String name, String adres, String vetssn, String sallary, String degree) {
        String sorgu = "insert into vet(vetName,vetAddress,vetSSN,Sallary,Degree) VALUES(?,?,?,?,?) ";
        try {
            preparedStatement = conn.prepareCall(sorgu);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, adres);
            preparedStatement.setString(3, vetssn);
            preparedStatement.setString(4, sallary);
            preparedStatement.setString(5, degree);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "The data you want to add already exists.");
            Logger.getLogger(EklemeIslemeleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void productekle(String price, String productName, String pid, String category) {
        String sorgu = "insert into product(Price,productName,pid,Category) VALUES(?,?,?,?) ";
        try {
            preparedStatement = conn.prepareCall(sorgu);
            preparedStatement.setString(1, price);
            preparedStatement.setString(2, productName);
            preparedStatement.setString(3, pid);
            preparedStatement.setString(4, category);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "The data you want to add already exists.");
            Logger.getLogger(EklemeIslemeleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void petekle(String Race, String petName, String mustDoneVaccine, String doneVaccines, String petID,
            String Weight, String birthDate, String clientSSN) {

        String sorgu = "insert into pet(Race,petName,mustDoneVaccine,doneVaccines,petID,Weight,birthDate,clientSSN) VALUES(?,?,?,?,?,?,?,?) ";
        try {
            preparedStatement = conn.prepareCall(sorgu);
            preparedStatement.setString(1, Race);
            preparedStatement.setString(2, petName);
            preparedStatement.setString(3, mustDoneVaccine);
            preparedStatement.setString(4, doneVaccines);
            preparedStatement.setString(5, petID);
            preparedStatement.setString(6, Weight);
            preparedStatement.setString(7, birthDate);
            preparedStatement.setString(8, clientSSN);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "The data you want to add already exists.");
            Logger.getLogger(EklemeIslemeleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void treatsekle(String treats, String date, int treatID) {
        String sorgu = "insert into reservation_treats VALUES(?,?,?) ";
        try {
            preparedStatement = conn.prepareCall(sorgu);
            preparedStatement.setString(1, treats);
            preparedStatement.setString(2, date);
            preparedStatement.setInt(3, treatID);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "The data you want to add already exists.");
            Logger.getLogger(EklemeIslemeleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void reservationekle(String date, String clientSSN) {
        String sorgu = "insert into reservation(Date,clientSSN) VALUES(?,?) ";
        try {
            preparedStatement = conn.prepareCall(sorgu);
            preparedStatement.setString(1, date);
            preparedStatement.setString(2, clientSSN);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "The data you want to add already exists.");
            Logger.getLogger(EklemeIslemeleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void purchaseekle(String pid, String clientSSN) {
        String sorgu = "insert into buy VALUES(?,?,NULL) ";
        try {
            preparedStatement = conn.prepareCall(sorgu);
            preparedStatement.setString(1, pid);
            preparedStatement.setString(2, clientSSN);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "The data you want to add already exists.");
            Logger.getLogger(EklemeIslemeleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void clientPhoneekle(String no, String clientSSN) {
        String sorgu = "insert into client_clientphoneno VALUES(?,?) ";
        try {
            preparedStatement = conn.prepareCall(sorgu);
            preparedStatement.setString(1, no);
            preparedStatement.setString(2, clientSSN);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "The data you want to add already exists.");
            Logger.getLogger(EklemeIslemeleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void vetPhoneekle(String no, String clientSSN) {
        String sorgu = "insert into vet_vetphoneno VALUES(?,?) ";
        try {
            preparedStatement = conn.prepareCall(sorgu);
            preparedStatement.setString(1, no);
            preparedStatement.setString(2, clientSSN);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "The data you want to add already exists.");
            Logger.getLogger(EklemeIslemeleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void treatmentekle(String petID, String vetSSN) {
        String sorgu = "insert into treatment VALUES(?,?,NULL) ";
        try {
            preparedStatement = conn.prepareCall(sorgu);
            preparedStatement.setString(1, petID);
            preparedStatement.setString(2, vetSSN);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "The data you want to add already exists.");
            Logger.getLogger(EklemeIslemeleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
