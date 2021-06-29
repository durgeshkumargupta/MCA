import java.util.Scanner;
import java.sql.*;

public class ConnectionDB {
	Scanner sc = new Scanner(System.in);
	Connection conn = null;
	PreparedStatement pst = null;
	Statement st = null;
	ResultSet rs = null;

	public void createConnection() {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/RVCE_LAB", "root", "");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e2)
		{
			e2.printStackTrace();
		}

	}

	public void closeConnection() {

		try {
			if (conn == null)
				return;
			conn.close();
			pst.close();
			st.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateByUsn() {
		try {
			pst = conn.prepareStatement("update student set name=? where usn=?");

			System.out.println("Enter USN=");
			String usn = sc.nextLine();
			
				if (usn.length() <= 4)
					throw new MyException("Please Enter Minimum 4 Character");
		
			pst.setString(2, usn);
			System.out.println("Enter Name=");
			String name = sc.nextLine();
			pst.setString(1, name);

			System.out.println(pst);

			pst.executeUpdate();

			System.out.println("Data update");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void deleteByUsn() {
		try {
			String sql = "delete from student where usn = ?";
			pst = conn.prepareStatement(sql);

			System.out.println("Enter USN=");
			String usn = sc.nextLine();
			pst.setString(1, usn);
			pst.executeUpdate();
			System.out.println("Record delete Suceessfully");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void searchByUsn() throws MyException {

		try {

			pst = conn.prepareStatement("select * from student where usn=?");

			System.out.println("Enter USN=");
			String usn = sc.nextLine();
			
				if (usn.length() <= 4)
					throw new MyException("Length is not full fil Please enter min 4 character");
			

			pst.setString(1, usn);
			rs = pst.executeQuery();

			while (rs.next()) {
				String usn1 = rs.getString(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				String phone = rs.getString(4);
				Integer sem = rs.getInt(5);
				String section = rs.getString(6);
				String department = rs.getString(7);

				System.out.println(" Name:" + name + " USN:" + usn1 + " address:" + address + " Phone Number: " + phone
						+ " Semester: " + sem + " section: " + section + " Department: " + department);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void insertData() {
		try {

			System.out.println("__________________insert data___________________");
			pst = conn.prepareStatement(
					"insert into student(usn,name,address,phone,sem,section,department) values(?,?,?,?,?,?,?)");

			System.out.println("Enter USN=");
			String usn = sc.nextLine();
			pst.setString(1, usn);

			System.out.println("Enter Name=");
			String name = sc.nextLine();
			pst.setString(2, name);

			System.out.println("Enter Address=");
			String address = sc.nextLine();
			pst.setString(3, address);

			System.out.println("Enter Phone Number=");
			String phone = sc.nextLine();
			pst.setString(4, phone);

			System.out.println("Enter Semester=");
			int sem = sc.nextInt();
			pst.setInt(5, sem);

			System.out.println("Enter Section=");
			sc.nextLine();
			String section = sc.nextLine();
			pst.setString(6, section);

			System.out.println("Enter Department=");
			String department = sc.nextLine();
			pst.setString(7, department);

			pst.execute();
			System.out.println("Data insert");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void displayData() {
		try {
			System.out.println("______________Show Data__________________________");
			st = conn.createStatement();
			rs = st.executeQuery("select * from student");
			while (rs.next()) {
				String usn = rs.getString(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				String phone = rs.getString(4);
				String sem = rs.getString(5);
				String section = rs.getString(6);
				String department = rs.getString(7);
				System.out.println("USN:" + usn + " Name:" + name + " Address:" + address + " phone:" + phone
						+ " Semester:" + sem + " Section:" + section + " Department:" + department);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
