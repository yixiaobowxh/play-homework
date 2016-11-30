package controllers;

import java.util.List;

import models.User;

public class Users extends App{

    public static void index(String str) {
    	List<User> users =null;
    	if(str==null){
    		users=User.findAll();
    		
    	}else{
    		flash("str",str);
    		users=User.find("name like ? ","%"+str+"%" ).fetch();
    		
    	}
    	
    	
    	
        r(users);
    }
    
    public static void form(Integer id){
    	User user=null;
    	if(id==null){
    		user=new User();
    		
    	}else{
    		user=User.findById(id);
    	}
    	r(user);
    	
    }
       public static void save(User user){
         user.save();
         index(null);
         
       }
       public static void delete(Integer id){
    	   User user=User.findById(id);
    	   user.delete();
    	   index(null);
    	   
       }

}
