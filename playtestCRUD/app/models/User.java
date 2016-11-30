package models;

import javax.persistence.*;

import java.sql.*;
import java.sql.Blob;
import javax.sql.*;

import org.hibernate.annotations.GenericGenerator;

import java.math.*;
import java.util.*;
import java.util.Date;

import play.db.jpa.*;

@Entity
@Table(name="user" , catalog = "user_crud")
public class User extends GenericModel{


	@Id
	@Column(name="id")
	
	@GeneratedValue(generator = "db-gen")
	@GenericGenerator(name = "db-gen", strategy = "identity")
	public Integer id;

	@Column(name="acc", length=50)
	public String acc;

	@Column(name="name", length=500)
	public String name;

	@Column(name="pwd", length=100)
	public String pwd;

	@Column(name="birthday", length=100)
	public String birthday;

	@Column(name="create_time")
	public Timestamp createTime;

	@Column(name="modi_time")
	public Timestamp modiTime;

	@Column(name="sex")
	public Integer sex;

	@Column(name="status")
	public Integer status;

	@Column(name="remark", length=200)
	public String remark;

}
