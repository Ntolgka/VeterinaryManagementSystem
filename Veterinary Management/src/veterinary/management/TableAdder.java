package veterinary.management;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class TableAdder {

    Database db = new Database();

    public void clientTable(JTable jTable) {

        DefaultTableModel tempModel = (DefaultTableModel) jTable.getModel();
        tempModel.setRowCount(0);

        String query = "SELECT * from client ORDER BY clientSSN";
        try {

            Statement st = db.getCon().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                String name = rs.getString("clientName");
                String address = rs.getString("clientAddress");
                String ssn = rs.getString("clientSSN");

                String tableData[] = {name, address, ssn};
                DefaultTableModel tableModel = (DefaultTableModel) jTable.getModel();
                tableModel.addRow(tableData);

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public void search(JTable jTable, String search) {

        DefaultTableModel tempModel = (DefaultTableModel) jTable.getModel();
        tempModel.setRowCount(0);

        String query = "SELECT * from client WHERE clientSSN LIKE '%" + search + "%'";
        try {

            Statement st = db.getCon().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                String name = rs.getString("clientName");
                String address = rs.getString("clientAddress");
                String ssn = rs.getString("clientSSN");

                String tableData[] = {name, address, ssn};
                DefaultTableModel tableModel = (DefaultTableModel) jTable.getModel();
                tableModel.addRow(tableData);

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public void petTable(JTable jTable) {

        DefaultTableModel tempModel = (DefaultTableModel) jTable.getModel();
        tempModel.setRowCount(0);

        String query = "SELECT * from pet ORDER BY petID";
        try {

            Statement st = db.getCon().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                String race = rs.getString("Race");
                String petName = rs.getString("petName");
                String mustDoneVaccines = rs.getString("mustDoneVaccine");
                String doneVaccines = rs.getString("doneVaccines");
                String petID = rs.getString("petID");
                String weight = String.valueOf(rs.getInt("Weight"));
                Date bdate = rs.getDate("birthDate");
                String clientSSN = rs.getString("clientSSN");

                String tableData[] = {race, petName, mustDoneVaccines, doneVaccines, petID, weight, String.valueOf(bdate), clientSSN};
                DefaultTableModel tableModel = (DefaultTableModel) jTable.getModel();
                tableModel.addRow(tableData);

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public void productTable(JTable jTable) {

        DefaultTableModel tempModel = (DefaultTableModel) jTable.getModel();
        tempModel.setRowCount(0);

        String query = "SELECT * from product ORDER BY pid";
        try {

            Statement st = db.getCon().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                String price = rs.getString("Price");
                String name = rs.getString("productName");
                String pid = rs.getString("pid");
                String category = rs.getString("Category");

                String tableData[] = {price, name, pid, category};
                DefaultTableModel tableModel = (DefaultTableModel) jTable.getModel();
                tableModel.addRow(tableData);

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
    public void employeeTable(JTable jTable) {

        DefaultTableModel tempModel = (DefaultTableModel) jTable.getModel();
        tempModel.setRowCount(0);

        String query = "SELECT * from vet ORDER BY vetSSN";
        try {

            Statement st = db.getCon().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                String vetName = rs.getString("vetName");
                String vetAddress = rs.getString("vetAddress");
                String vetSSN = rs.getString("vetSSN");
                String vetSallary = rs.getString("Sallary");
                String degree = rs.getString("Degree");

                String tableData[] = {vetName, vetAddress, vetSSN, vetSallary, degree};
                DefaultTableModel tableModel = (DefaultTableModel) jTable.getModel();
                tableModel.addRow(tableData);

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void reservationTable(JTable jTable) {

        DefaultTableModel tempModel = (DefaultTableModel) jTable.getModel();
        tempModel.setRowCount(0);

        String query = "SELECT * from reservation ORDER BY Date";
        try {

            Statement st = db.getCon().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                String date = rs.getString("Date");
                String clientSSN = rs.getString("clientSSN");

                String tableData[] = {date, clientSSN};
                DefaultTableModel tableModel = (DefaultTableModel) jTable.getModel();
                tableModel.addRow(tableData);

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public void treatsTable(JTable jTable) {

        DefaultTableModel tempModel = (DefaultTableModel) jTable.getModel();
        tempModel.setRowCount(0);

        String query = "SELECT * from reservation_treats ORDER BY treatID";
        try {

            Statement st = db.getCon().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                String treats = rs.getString("Treats");
                String date = rs.getString("Date");
                String treatID = rs.getString("treatID");


                String tableData[] = {treats, date, treatID};
                DefaultTableModel tableModel = (DefaultTableModel) jTable.getModel();
                tableModel.addRow(tableData);

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public void purchasesTable(JTable jTable) {

        DefaultTableModel tempModel = (DefaultTableModel) jTable.getModel();
        tempModel.setRowCount(0);

        String query = "SELECT * from buy ORDER BY invoiceNO";
        try {

            Statement st = db.getCon().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                String pid = rs.getString("pid");
                String ssn = rs.getString("clientSSN");
                String invoiceNo = rs.getString("invoiceNo");


                String tableData[] = {pid, ssn, invoiceNo};
                DefaultTableModel tableModel = (DefaultTableModel) jTable.getModel();
                tableModel.addRow(tableData);

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public void vetPhoneTable(JTable jTable) {

        DefaultTableModel tempModel = (DefaultTableModel) jTable.getModel();
        tempModel.setRowCount(0);

        String query = "SELECT * from vet_vetphoneno ORDER BY vetSSN";
        try {

            Statement st = db.getCon().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                String no = rs.getString("vetPhoneNo");
                String ssn = rs.getString("vetSSN");


                String[] tableData = {no, ssn};
                DefaultTableModel tableModel = (DefaultTableModel) jTable.getModel();
                tableModel.addRow(tableData);

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void clientPhoneTable(JTable jTable) {

        DefaultTableModel tempModel = (DefaultTableModel) jTable.getModel();
        tempModel.setRowCount(0);

        String query = "SELECT * from client_clientphoneno ORDER BY clientSSN";
        try {

            Statement st = db.getCon().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                String no = rs.getString("clientPhoneNo");
                String ssn = rs.getString("clientSSN");


                String[] tableData = {no, ssn};
                DefaultTableModel tableModel = (DefaultTableModel) jTable.getModel();
                tableModel.addRow(tableData);

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void treatmentTable(JTable jTable) {

        DefaultTableModel tempModel = (DefaultTableModel) jTable.getModel();
        tempModel.setRowCount(0);

        String query = "SELECT * from treatment ORDER BY treatID";
        try {

            Statement st = db.getCon().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                String petID = rs.getString("petID");
                String vetSSN = rs.getString("vetSSN");
                String treatID = rs.getString("treatID");


                String[] tableData = {petID, vetSSN, treatID};
                DefaultTableModel tableModel = (DefaultTableModel) jTable.getModel();
                tableModel.addRow(tableData);

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
