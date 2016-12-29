package com.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.*;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;

import com.controller.Post;
import com.model.UserPost;

public class CarpoolingService {
	DBConnection connectionManager=new DBConnection();;
	Connection con=connectionManager.getConnection();
	
	
	public CarpoolingService(){
	
	}
//public UserPost getPost(){
//	String query="SELECT * FROM carpoolingdb.posts where postid=1";
//	UserPost post=null;
//	try{
//		ResultSet result=getResult(query);
//		post=new UserPost(result.getInt(1),result.getInt(2),result.getString(3),result.getInt(4));
//	}
//	catch(Exception e){
//		e.printStackTrace();
//	}
//	return post;
//}
//
public List<UserPost> retrievePost(){
	String query="SELECT * FROM carpoolingdb.posts";
	List<UserPost>posts=new ArrayList<>();
	try{
		ResultSet result=getResult(query);
		int i=0;
		while(result.next()){
			UserPost post=new UserPost(result.getInt(1),result.getInt(2),result.getString(3),result.getInt(4));
			posts.add(post);
		}
	}
	catch(Exception e){
		e.printStackTrace();
	}
	return posts;
}
public boolean addUser(HttpServletRequest request ){
	
	String firstname=request.getParameter("firstname");
	String middlename=request.getParameter("middlename");
	String lastname=request.getParameter("lastname");
	String fullname=firstname+" "+middlename+" "+lastname;
	
	int gender=Integer.parseInt(request.getParameter("gender"));
	String state=request.getParameter("state");
	String city=request.getParameter("city");
	String street=request.getParameter("street");
	int zipcode=Integer.parseInt(request.getParameter("zipcode"));
	int birthyear=Integer.parseInt(request.getParameter("birthyear"));
	String email=request.getParameter("email");
	String password=request.getParameter("password");
	if(con==null){
		System.out.println("connection is null");
		return false;
	}
	try{
		//Date createdDate=new Date(1l); //better if formatted well
		Timestamp createdDate = new Timestamp(new Date(1l).getTime());
		String query1="SELECT MAX(userid) as userid from carpoolingdb.users";
		ResultSet id=getResult(query1);
		id.next();
		int userid=id.getInt(1);
		    userid+=1;
		String query2="INSERT into carpoolingdb.users(userid, fullname,"
				+ "gender,state,city,street,zipcode,birthyear,email,password) values('"+userid+"','"+fullname+"',"+gender+",'"+state+"','"+
		    city+"','"+street+"',"+zipcode+","+birthyear+",'"+email+"','"+password+"')";
		return insert(query2);

	}
	catch(Exception e){
		e.printStackTrace();
		return false;
	}
	
	
}
public boolean addComment(HttpServletRequest request){
	int postid=Integer.parseInt(request.getParameter("postid"));
	int userid=Integer.parseInt(request.getParameter("userid"));
	String comment=request.getParameter("comment");
	
	Date createDate=new Date(1l);
	String query1="SELECT MAX(commentid) from comment";
	ResultSet id=getResult(query1);
	try{
		int commentid=id.getInt("commentid");
			commentid+=1;
		String query2="INSERT into comment values("+commentid+","+userid+","+postid+","+comment+","+
		createDate+","+createDate+")";
		return insert(query2);
	}
	catch(Exception e){
		return false;
	}
	
	
	
}
public boolean insert(String query){
	if(con==null){
		return false;
	}
	try{
		Statement stmt=con.createStatement();
		stmt.execute(query);
		return true;
		
	}
	catch(Exception E){
		E.printStackTrace();
		return false;
	}
}
public boolean addLike(HttpServletRequest request){
	int postid=Integer.parseInt(request.getParameter("postid"));
	int userid=Integer.parseInt(request.getParameter("userid"));
	
	Date createDate=new Date(1l);
	String query1="SELECT MAX(likeid) from like";
	ResultSet id=getResult(query1);
	try{
		int likeid=id.getInt("likeid");
			likeid+=1;
		String query2="INSERT into like values("+likeid+","+userid+","+postid
				+","+createDate+","+createDate+")";
		return insert(query2);
	}
	catch(Exception e){
		return false;
	}
}

public ResultSet getResult(String query){
	
	if(con==null){
		System.out.println("Connection is null");
		return null;
	}
	try{
		Statement stmt=con.createStatement();
		ResultSet result=stmt.executeQuery(query);
		return result;
	}
	catch(Exception E){
		System.out.println("Exception happened creating Connection ");
		E.printStackTrace();
		return null;
	}
}
public boolean addPost(HttpServletRequest request){
	System.out.println("The function is called");
	int userid=Integer.parseInt(request.getParameter("userid"));
	String post=request.getParameter("post");
	int posttype=Integer.parseInt(request.getParameter("posttype"));
	
	Date createDate=new Date(1l);
	String query1="SELECT MAX(postid) from post";
	ResultSet id=getResult(query1);
	try{
		int postid=id.getInt("postid");
			postid+=1;
		String query2="INSERT into post values("+postid+","+userid+","+post+","+posttype
				+","+createDate+","+createDate+")";
		return insert(query2);
	}
	catch(Exception e){
		return false;
	}
}
public String checkUser(HttpServletRequest request){
	String userName=request.getParameter("username");
	String password=request.getParameter("password");
	
	System.out.println(userName);
	System.out.println(password);
     
	String query="SELECT password from carpoolingdb.users Where email='"+userName+"'";
		   String pass=null;
		try{
			ResultSet result=getResult(query);
			

			if(result.next()){
				pass=result.getNString(1);
			}
			else{
				return "notRegister";
			}
			
			if(pass.equals(password)){
				
				return "matched";
			}
		}
		catch(Exception e){
			System.out.println("Exception happened");
			return null;
		}
	
	
	 return "passwordError";
}
}
