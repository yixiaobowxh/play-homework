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
// NOTE: This file was generated from: japidviews/_tags/statusRadio.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class statusRadio extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/_tags/statusRadio.html";
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


	public statusRadio() {
		super(null);
	}
	public statusRadio(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"name", "value", "showValues", "fieldName",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"String", "Integer", "String[]", "String",  };
	public static final Object[] argDefaults= new Object[] {null,null,new String[] { "有效", "无效" },"状态", };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._tags.statusRadio.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private String name; // line 1
	private Integer value; // line 1
	private String[] showValues; // line 1
	private String fieldName; // line 1
	public cn.bran.japid.template.RenderResult render(String name,Integer value,String[] showValues,String fieldName) {
		this.name = name;
		this.value = value;
		this.showValues = showValues;
		this.fieldName = fieldName;
		long t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 1
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), t, actionRunners, sourceTemplate);
	}
	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1
		p("\n" + 
"<div class=\"control-group\">\n" + 
"    <label class=\"control-label\" >");// line 1
		final red _red0 = new red(getOut()); _red0.setActionRunners(getActionRunners()).setOut(getOut()); _red0.render(); // line 3// line 3
		;// line 3
		p(fieldName);// line 3
		p(":</label>\n" + 
"    <div class=\"controls\">\n" + 
"    	<div class=\"input-prepend input-append\">\n" + 
"    		<label class=\"checkbox control-inline\">\n" + 
"                <input type=\"radio\" name=\"");// line 3
		p(name);// line 7
		p("\" value=\"1\" ");// line 7
		if(value==null || value==1){// line 7
		p(" checked=\"true\" ");// line 7
		}// line 7
		p("><span class=\"blue\"> ");// line 7
		p(showValues[0]);// line 7
		p("</span>\n" + 
"            </label>\n" + 
"            <label class=\"checkbox control-inline\">\n" + 
"                <input type=\"radio\" name=\"");// line 7
		p(name);// line 10
		p("\" value=\"0\"  ");// line 10
		if(value!=null && value==0){// line 10
		p(" checked=\"true\" ");// line 10
		}// line 10
		p("><span class=\"red\"> ");// line 10
		p(showValues[1]);// line 10
		p("</span>\n" + 
"            </label>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"</div>");// line 10
		
		endDoLayout(sourceTemplate);
	}

}