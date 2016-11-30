package japidviews._tags;
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
// NOTE: This file was generated from: japidviews/_tags/statusStr.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class statusStr extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/_tags/statusStr.html";
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


	public statusStr() {
		super(null);
	}
	public statusStr(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"value", "showValues", "nullShowValue",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"Integer", "String[]", "String",  };
	public static final Object[] argDefaults= new Object[] {null,new String[] { "有效", "无效" },"", };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._tags.statusStr.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private Integer value; // line 1
	private String[] showValues; // line 1
	private String nullShowValue; // line 1
	public cn.bran.japid.template.RenderResult render(Integer value,String[] showValues,String nullShowValue) {
		this.value = value;
		this.showValues = showValues;
		this.nullShowValue = nullShowValue;
		long t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 1
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), t, actionRunners, sourceTemplate);
	}
	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1
		p("\n");// line 1
		if(value==null) {// line 2
		p("	");// line 2
		p(nullShowValue);// line 3
		p("\n");// line 3
		}else if(value==0) {// line 4
		p("<span class=\"red\">");// line 4
		p(showValues[1]);// line 5
		p("</span>\n");// line 5
		} else {// line 6
		p("<span class=\"blue\">");// line 6
		p(showValues[0]);// line 7
		p("</span>\n");// line 7
		}// line 8
		
		endDoLayout(sourceTemplate);
	}

}