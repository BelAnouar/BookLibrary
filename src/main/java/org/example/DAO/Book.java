package org.example.DAO;

import org.example.DAO.implemantations.BookImp;
import org.example.DataBase.DBConnection;
import org.example.Entites.BookEntitie;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Book implements BookImp {
     private static  Connection connection;

    static {
        try {
            connection = DBConnection.getInstance().getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean addBook(BookEntitie book) {
        try{
            PreparedStatement ps = connection.prepareStatement("insert into Book (id,author,title ,ISBN)  values(?,?,?,?)");
            ps.setInt(1, 1);
            ps.setString(2,book.getAuthor());
            ps.setString(3,book.getTitle());
            ps.setLong(4,book.getISBN());
            int resl= ps.executeUpdate();
            return resl ==1 ? true :false;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean removeBook(int bookId) {
        try {
            PreparedStatement ps = connection.prepareStatement("DELETE FROM Book WHERE id = ?");
            ps.setInt(1,bookId);
            int result = ps.executeUpdate();
            return result == 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }





    @Override
    public BookEntitie getBook(int id) {
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM Book WHERE id = ?");
            ps.setInt(1,id);
            ResultSet result = ps.executeQuery();
            BookEntitie BookE= new BookEntitie();
            while (result.next()){
              BookE.setId(result.getInt("id"));
              BookE.setAuthor(result.getString("author"));
              BookE.setTitle(result.getString("title"));
              BookE.setISBN(result.getLong("ISBN"));
            }
            return BookE;
        } catch (SQLException e) {
            e.printStackTrace();
           return null;
        }
    }

    @Override
    public List<BookEntitie> getAllBooks() {
       try{
           PreparedStatement ps = connection.prepareStatement("SELECT * FROM Book");
           ResultSet result = ps.executeQuery();
           List<BookEntitie> Books= new ArrayList<BookEntitie>();
           while (result.next()){
               BookEntitie BookE= new BookEntitie();
               BookE.setId(result.getInt("id"));
               BookE.setAuthor(result.getString("author"));
               BookE.setTitle(result.getString("title"));
               BookE.setISBN(result.getLong("ISBN"));
               Books.add(BookE);
           }
           return Books;
       }catch (Exception e) {
           e.printStackTrace();
           return null;
       }

    }
}
