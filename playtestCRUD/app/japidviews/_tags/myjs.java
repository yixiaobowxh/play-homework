package japidviews._tags;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import play.utils.StrUtils;
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
// NOTE: This file was generated from: japidviews/_tags/myjs.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class myjs extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/_tags/myjs.html";
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


	public myjs() {
		super(null);
	}
	public myjs(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"jsPath", "others",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"String", "String",  };
	public static final Object[] argDefaults= new Object[] {null,null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._tags.myjs.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private String jsPath; // line 2
	private String others; // line 2
	public cn.bran.japid.template.RenderResult render(String jsPath,String others) {
		this.jsPath = jsPath;
		this.others = others;
		long t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 2
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), t, actionRunners, sourceTemplate);
	}
	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1
		;// line 1
		p("\n");// line 5
		jsPath = jsPath.replace("japidviews", "").replace(".html", ".js");// line 6
		p("<script src=\"");// line 6
		p(_play.ctxPath);// line 7
		p("/public/javascripts");// line 7
		p(jsPath);// line 7
		p("\"></script>\n");// line 7
		if(!StrUtils.isEmpty(others)) {// line 8
	String[] oarr = StrUtils.splitc(others, ",");// line 9
	String[] parr = StrUtils.splitc(jsPath, "/");// line 10
	for(String o : oarr) {// line 11
		parr[parr.length-1] = o + ".js";// line 12
		String opath = StrUtils.join(parr, "/");// line 13
		p("		<script src=\"");// line 13
		p(_play.ctxPath);// line 14
		p("/public/javascripts");// line 14
		p(opath);// line 14
		p("\"></script>\n");// line 14
			}// line 15
} // line 16
		;// line 16
		
		endDoLayout(sourceTemplate);
	}

}