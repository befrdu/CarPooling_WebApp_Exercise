package com.controller;

import java.util.List;

import org.json.JSONObject;

import com.model.UserPost;
import com.service.CarpoolingService;

public class Test {

	public static void main(String[] args) {
		CarpoolingService service=new CarpoolingService();
       List<UserPost> post=service.retrievePost();
        
        for(int i=0;i<post.size();i++){
        	System.out.println(post.get(i));
        	System.out.println("-----------------------------------------------------");
        }
        
	}

}
