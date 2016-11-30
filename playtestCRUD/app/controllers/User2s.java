package controllers;

import java.util.List;

import models.User;

public class User2s extends App {
	
	public static void index(String likeStr, Integer page) {
		if(page == null)page=1;
		List<User> users = null;
		long total = 0; int length = 2;
		if(likeStr == null) {
			users = User.all().fetch(page, length);
			total = User.count();
		} else {
			flash.put("likeStr", likeStr);
			users = User.find("name like ?", "%" + likeStr + "%").fetch(page, length);
			total = User.count("name like ?", "%" + likeStr + "%");
		}
		r(users, page, (int)(total/length) +(total%length>0 ? 1 : 0));
	}

	public static void form(Integer id) {
		User user = null;
		if(id == null) {
			user = new User();
		} else {
			user = User.findById(id);
		}
		r(user);
	}
	
	public static void save(User user) {
		user.save();
		index(null, 1);
	}

	public static void delete(Integer id) {
		User u = User.findById(id);
		u.delete();
		index(null, 1);
	}
}
