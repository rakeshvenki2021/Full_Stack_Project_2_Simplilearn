package com.simplilearn.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.simplilearn.bean.Students;
import com.simplilearn.bean.Subjects;
import com.simplilearn.bean.Teachers;
import com.simplilearn.bean.User;

public class UserDao {

	public static Connection getConnection() {
		Connection con = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/learners_academy", "root", "admin");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;

	}

/*	public static int save(User u) throws SQLException {
		int status = 0;
		Connection conn = getConnection();
		PreparedStatement ps = conn
				.prepareStatement("insert into user(name, password, email, gender, country) values(?,?,?,?,?)");
		ps.setString(1, u.getName());
		ps.setString(2, u.getPassword());
		ps.setString(3, u.getEmail());
		ps.setString(4, u.getGender());
		ps.setString(5, u.getCountry());
		status = ps.executeUpdate();

		return status;
	}
*/
	public static List<User> getAllUsers() throws SQLException {

		List<User> userList = new ArrayList<>();
		Connection conn = getConnection();
		PreparedStatement ps = conn.prepareStatement("select * from classes");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			User u = new User();
			u.setId(rs.getInt("id"));
			u.setSection(rs.getInt("section"));
			u.setTeacher(rs.getInt("teacher"));
			u.setSubject(rs.getInt("subject"));
			u.setTime(rs.getString("time"));
			userList.add(u);
		}

		return userList;

	}
	public static List<Subjects> getAllSubjects() throws SQLException {

		List<Subjects> userList = new ArrayList<>();
		Connection conn = getConnection();
		PreparedStatement ps = conn.prepareStatement("select * from subjects");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Subjects u = new Subjects();
			u.setId(rs.getInt("id"));
			u.setName(rs.getString("name"));
			u.setShortcuts(rs.getString("shortcut"));
			userList.add(u);
		}

		return userList;

	}
	public static List<Teachers> getAllTeachers() throws SQLException {

		List<Teachers> userList = new ArrayList<>();
		Connection conn = getConnection();
		PreparedStatement ps = conn.prepareStatement("select * from teachers");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Teachers u = new Teachers();
			u.setId(rs.getInt("id"));
			u.setFname(rs.getString("fname"));
			u.setLname(rs.getString("lname"));
			u.setAge(rs.getString("age"));
			userList.add(u);
		}

		return userList;

	}
	public static List<Students> getAllStudents() throws SQLException {

		List<Students> userList = new ArrayList<>();
		Connection conn = getConnection();
		PreparedStatement ps = conn.prepareStatement("select * from students");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Students u = new Students();
			u.setId(rs.getInt("id"));
			u.setFname(rs.getString("fname"));
			u.setLname(rs.getString("lname"));
			u.setAge(rs.getInt("age"));
			u.setAclass(rs.getInt("class"));
			userList.add(u);
		}

		return userList;

	}

}