package org.example.DAO;

import org.example.DAO.implemantations.BookImp;
import org.example.utils.DBConnection;
import org.example.Entites.BookEntitie;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
        Random random = new Random();
        int randomInt = random.nextInt();
        try{
            PreparedStatement ps = connection.prepareStatement("insert into Book (id,author,title ,ISBN)  values(?,?,?,?)");
            ps.setInt(1, randomInt);
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

            if (result.next()){
               return extractBookFromResultSet(result);
            }

        } catch (SQLException e) {
            e.printStackTrace();
           return null;
        }
        return null;
    }

    @Override
    public List<BookEntitie> getAllBooks() {
       try{
           PreparedStatement ps = connection.prepareStatement("SELECT * FROM Book");
           ResultSet result = ps.executeQuery();
           List<BookEntitie> Books= new ArrayList<BookEntitie>();
           while (result.next()){
               Books.add(extractBookFromResultSet(result));
           }
           return Books;
       }catch (Exception e) {
           e.printStackTrace();
           return null;
       }

    }

    public boolean updateBook(BookEntitie bookEntitie) {
        try {
            PreparedStatement ps = connection.prepareStatement(
                    "UPDATE Book SET author = ?, title = ?, ISBN = ? WHERE id = ?"
            );
            ps.setString(1, bookEntitie.getAuthor());
            ps.setString(2, bookEntitie.getTitle());
            ps.setLong(3, bookEntitie.getISBN());
            ps.setInt(4, bookEntitie.getId());

            int result = ps.executeUpdate();
            return result == 1;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    private BookEntitie extractBookFromResultSet(ResultSet rs) throws SQLException {
        BookEntitie book = new BookEntitie();
        book.setId(rs.getInt("id"));
        book.setAuthor(rs.getString("author"));
        book.setTitle(rs.getString("title"));
        book.setISBN(rs.getLong("ISBN"));
        return book;
    }
}
