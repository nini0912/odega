<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.sql.*"%>



<%

Connection conn = null;	
PreparedStatement pstmt = null;
ResultSet rs = null;

try {
	Class.forName("oracle.jdbc.driver.OracleDriver");		
	String url ="jdbc:oracle:thin:@58.73.200.225/orcl";
	String user="java01";
	String pw ="java";
	conn = DriverManager.getConnection(url,user,pw);
	
} catch (SQLException ex) {
	out.println("데이터베이스 연결이 실패되었습니다.<br>");
	out.println("SQLException: " + ex.getMessage());
}


%>