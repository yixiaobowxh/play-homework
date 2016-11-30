package japidviews.Logins;
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
// NOTE: This file was generated from: japidviews/Logins/index.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class index extends main
{
	public static final String sourceTemplate = "japidviews/Logins/index.html";
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
	public static final String[] argNames = new String[] {/* args of the template*/"arg1",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"Object",  };
	public static final Object[] argDefaults= new Object[] {null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Logins.index.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private Object arg1; // line 2
	public cn.bran.japid.template.RenderResult render(Object arg1) {
		this.arg1 = arg1;
		long t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 2
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
		p("<center>\n" + 
"    <h2 style=\"color:red;\">");// line 9
		p(flash.get("loginErr"));// line 11
		p("</h2>\n" + 
"    <h2>用户登录</h2>\n" + 
"    <form action=\"");// line 11
		p(lookup("Logins.loginCheck", new Object[]{}));// line 13
		p("\">\n" + 
"    <h3>账号：<input name=\"acc\" value=\"");// line 13
		p(flash.get("tempAcc"));// line 14
		p("\"></h3>\n" + 
"    <h3>密码：<input name=\"pwd\" type=\"password\"></h3>\n" + 
"    <h3><input type=\"submit\"></h3>\n" + 
"    </form>\n" + 
"</center>\n");// line 14
		
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