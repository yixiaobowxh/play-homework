package controllers;


import models.User;
import play.Yuns;

public class Logins extends Yuns{
	public static void index(){
		if(session.get("acc")!=null){
		Users.index(null);
		}else{
			r(null);
		}
	}
	public static void loginCheck(String acc,String pwd){
		System.out.println(acc+"        "+pwd);
		User user=User.find("acc=? and pwd=?", acc,pwd).first();
		if(user==null){
			flash.put("loginErr", "账号密码有误");
			
		}else{
			session.put("acc", acc);
	        Users.index(null);
		}
		}		
	public static void logout() {
			session.clear();
			index();
		}


}
