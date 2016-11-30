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
// NOTE: This file was generated from: japidviews/Users/form.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class form extends main
{
	public static final String sourceTemplate = "japidviews/Users/form.html";
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


	public form() {
		super(null);
	}
	public form(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"user",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"User",  };
	public static final Object[] argDefaults= new Object[] {null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Users.form.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private User user; // line 5
	public cn.bran.japid.template.RenderResult render(User user) {
		this.user = user;
		long t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 5
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), t, actionRunners, sourceTemplate);
	}
	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1
// line 3
		;// line 4
		p("\n" + 
"<h2>用户-表单</h2>\n" + 
"\n" + 
"<form action=\"");// line 5
		p(lookup("save", new Object[]{}));// line 8
		p("\">\n" + 
"	<input type=\"hidden\" name=\"user.id\" value=\"");// line 8
		p(user.id);// line 9
		p("\" >\n" + 
"	<h3>账号：<input name=\"user.acc\" value=\"");// line 9
		p(user.acc);// line 10
		p("\" ></h3>\n" + 
"	<h3>密码：<input name=\"user.pwd\"  value=\"");// line 10
		p(user.pwd);// line 11
		p("\"></h3>\n" + 
"	<h3>姓名：<input name=\"user.name\" value=\"");// line 11
		p(user.name);// line 12
		p("\"></h3>\n" + 
"	<h3>性别：<input name=\"user.sex\" value=\"1\" type=\"radio\" ");// line 12
		p(user.sex==null || user.sex==1 ? "checked" : "");// line 13
		p(">男 &nbsp;&nbsp;&nbsp;&nbsp;<input name=\"user.sex\" value=\"0\" type=\"radio\" ");// line 13
		p(user.sex!=null&&user.sex==0 ? "checked" : "");// line 13
		p(">女</h3>\n" + 
"	<h3>状态：<input name=\"user.status\" value=\"1\" type=\"radio\" ");// line 13
		p(user.status==null || user.status==1 ? "checked" : "");// line 14
		p(">有效 &nbsp;&nbsp;&nbsp;&nbsp;<input name=\"user.status\" value=\"0\" type=\"radio\" ");// line 14
		p(user.sex!=null&&user.status==0 ? "checked" : "");// line 14
		p(">无效</h3>\n" + 
"	<h3><input type=\"submit\" value=\"保存\"><input type=\"reset\" value=\"重置\"></h3>\n" + 
"</form>\n" + 
"\n");// line 14
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p("思信科技：培训用例：用户管理");;
	}
	@Override protected void js() {
		// line 3
;
	}
}