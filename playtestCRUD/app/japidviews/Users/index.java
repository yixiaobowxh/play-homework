package japidviews.Users;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
import japidviews._layouts.*;
import play.i18n.Messages;
import play.data.validation.Validation;
import play.mvc.Scope.*;
import models.*;
import play.data.validation.Error;
import play.i18n.Lang;
import japidviews._tags.*;
import play.mvc.Http.*;
import controllers.*;
//
// NOTE: This file was generated from: japidviews/Users/index.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class index extends main
{
	public static final String sourceTemplate = "japidviews/Users/index.html";
	{
		putHeader("Content-Type", "text/html; charset=utf-8");
		setContentType("text/html; charset=utf-8");
	}

// - add implicit fields with Play

	final play.mvc.Http.Request request = play.mvc.Http.Request.current(); 
	final play.mvc.Http.Response response = play.mvc.Http.Response.current(); 
	final play.mvc.Scope.Session session = play.mvc.Scope.Session.current();
	final play.mvc.Scope.RenderArgs renderArgs = play.mvc.Scope.RenderArgs.current();
	final play.mvc.Scope.Params params = play.mvc.Scope.Params.current();
	final play.data.validation.Validation validation = play.data.validation.Validation.current();
	final cn.bran.play.FieldErrors errors = new cn.bran.play.FieldErrors(validation);
	final play.Play _play = new play.Play(); 

// - end of implicit fields with Play 


	public index() {
		super(null);
	}
	public index(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"users",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"List<User>",  };
	public static final Object[] argDefaults= new Object[] {null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Users.index.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private List<User> users; // line 10
	public cn.bran.japid.template.RenderResult render(List<User> users) {
		this.users = users;
		long t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 10
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), t, actionRunners, sourceTemplate);
	}
	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1
		;// line 1
		p(" \n" + 
"\n");// line 2
// line 6
// line 8
		;// line 9
		p("\n" + 
"<a href=\"");// line 10
		p(lookup("Logins.logout", new Object[]{}));// line 12
		p("\">注销</a>\n" + 
"<h2>用户管理</h2>\n" + 
"<form  action=\"");// line 12
		p(lookup("index", new Object[]{}));// line 14
		p("\">\n" + 
"模糊查询<input name=\"likerStr\" value=\"");// line 14
		p(flash.get("str"));// line 15
		p("\" ><input  type=\"submit\" value=\"查询\">\n" + 
"\n" + 
"</form>\n" + 
"<a href=\"");// line 15
		p(lookup("form", new Object[]{}));// line 18
		p("\">新增</a>\n" + 
"<a href=\"");// line 18
		p(lookup("User2s.index", new Object[]{}));// line 19
		p("\">分页管理</a>\n" + 
"<br><br>\n" + 
"<table border=1>\n" + 
"<tr><td>主键</td><td>账号</td><td>姓名</td><td>生日</td><td>性别</td><td>状态</td><td>账操作</td>\n" + 
"    ");// line 19
		for(User u : users){// line 23
		p("     <tr><td>");// line 23
		p(u.id);// line 24
		p("</td><td>");// line 24
		p(u.acc);// line 24
		p("</td><td>");// line 24
		p(u.name);// line 24
		p("</td><td>");// line 24
		p(u.birthday);// line 24
		p("</td><td>");// line 24
		p(u.sex==1 ? "男" : "女");// line 24
		p("</td><td>");// line 24
		p(u.status==1 ? "有效" : "无效");// line 24
		p("</td><td><a href=\"");// line 24
		p(lookup("form", u.id));// line 24
		p("\">修改</a> <a href=\"");// line 24
		p(lookup("delete", u.id));// line 24
		p("\">删除</a></td></tr>\n" + 
"     ");// line 24
		}// line 25
		p("</tr>\n" + 
"</table>\n");// line 25
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p("index");;
	}
	@Override protected void js() {
		// line 8
;
	}
	@Override protected void css() {
		// line 6
;
	}
}