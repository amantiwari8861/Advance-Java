package sys.daoimpl;

import java.util.*;
import sys.dao.SubjectDAO;
import sys.entity.Subject;
import sys.util.ConnectionProvider;
import java.sql.*;

public class SubjectDAOImpl implements SubjectDAO{

    public int save(Subject e) {
        int status = 0;
        try {
            Connection con = ConnectionProvider.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into Subjects(sid,subject,category) values (?,?,?)");
            ps.setInt(1, e.getSubId());
            ps.setString(2, e.getSubject());
            ps.setString(3, e.getCategory());

            status = ps.executeUpdate();

            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return status;
    }

    public  int update(Subject e) {
        int status = 0;
        try {
            Connection con = ConnectionProvider.getConnection();
            PreparedStatement ps = con.prepareStatement("update Subjects set subject=?,category=? where subid=?");
            ps.setString(1, e.getSubject());
            ps.setString(2, e.getCategory());
            status = ps.executeUpdate();

            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return status;
    }

    public  int delete(int id) {
        int status = 0;
        try {
            Connection con = ConnectionProvider.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from Subjects where id=?");
            ps.setInt(1, id);
            status = ps.executeUpdate();

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    public  Subject getSubjectById(int id) {
        Subject e = new Subject();

        try {
            Connection con = ConnectionProvider.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from Subjects where id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {// for cursor increment
                e.setSubId(rs.getInt("subid"));
                e.setSubject(rs.getString("subject"));
                e.setCategory(rs.getString("category"));
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return e;
    }

    public  List<Subject> getAllSubjects() {
        List<Subject> list = new ArrayList<Subject>();

        try {
            Connection con = ConnectionProvider.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from Subjects");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Subject e = new Subject();
                e.setSubId(rs.getInt(1));
                e.setSubject(rs.getString(2));
                e.setCategory(rs.getString(3));
                list.add(e);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
