package com.tags;

import java.io.IOException;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class UpperCaseTag extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException,IOException{
		JspWriter out=getJspContext().getOut();
		StringWriter sw=new StringWriter();
		getJspBody().invoke(sw);
		out.print("<b> "+sw.toString().toUpperCase()+"</b>");
	}
}
