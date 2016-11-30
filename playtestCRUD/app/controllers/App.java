package controllers;

import play.Yuns;
import play.mvc.Before;

public class App extends Yuns{
	@Before
	public  static void  check(){
		if(session.get("acc")==null){
			Logins.index();
		}
	}

}
