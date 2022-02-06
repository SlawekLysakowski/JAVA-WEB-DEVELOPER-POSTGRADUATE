package pl.edu.wszib.jdbc;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import pl.edu.wszib.enums.Computation;

import java.math.BigDecimal;
import java.security.spec.RSAOtherPrimeInfo;
import java.sql.*;
import java.text.NumberFormat;

public class HomeBudget {

    private static final String DB_HOST= "morfeusz.wszib.edu.pl";
    private static final String DB_USER= "lysakows";
    private static final String DB_Pass= "Poland11!";
    private static final String DB_Name= "lysakows";
    private static final int DB_PORT= 1433;

    private  static final String INSERT_ENTRY_SQL = "insert into Budget.BudgetEntries(EntryName, Amount) VALUES (?, ?)";
    private  static final String GET_SUM_SQL = "insert into Budget.BudgetEntries(EntryName, Amount) VALUES (?, ?)";



    public static void main(String[] args) {

        // TODO - konieczna walidacja

        BudgetEntry be = new BudgetEntry();
        be.setEntryName(args[0]);
        be.setAmount(new BigDecimal(args[1]));

        HomeBudget hb = new HomeBudget();

        try (Connection con = hb.connect(DB_USER, DB_Pass, DB_Name);
             Statement stmt = con.createStatement()) {

            PreparedStatement ps = con.prepareStatement(INSERT_ENTRY_SQL);
            ps.setString(1, be.getEntryName());
            ps.setBigDecimal(2, be.getAmount());
            ps.execute();

            BigDecimal balance;
            ResultSet rs = stmt.executeQuery(GET_SUM_SQL);
            if(rs.next()) {
                balance = rs.getBigDecimal("sum");
            } else {
                balance = BigDecimal.ZERO;
            }

            System.out.print("Zapisano! kwota " + currencyFormat(be.getAmount()));
            System.out.print(", nazwa " + be.getEntryName());
            System.out.println(", saldo: " + currencyFormat(balance));

        } catch (SQLException e) {
            System.out.println("coś poszło nei tak ");
            e.printStackTrace();

        }







    }

    Connection connect(String username, String password, String db) throws SQLServerException {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(username);
        ds.setPassword(password);
        ds.setServerName(DB_HOST);
        ds.setPortNumber(DB_PORT);
        ds.setDatabaseName(DB_Name);
        ds.setTrustServerCertificate(true);
        return ds.getConnection();
    }

    public static String currencyFormat(BigDecimal n) {
        return NumberFormat.getCurrencyInstance().format(n);
    }

}
