package MyPackage;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Factorial extends TagSupport {
	private String num;

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
	
	@Override
	public int doStartTag() throws JspException {
		JspWriter out= pageContext.getOut();
		int sum=1;
		
		for (int i=Integer.parseInt(num); i>=1;i--) {
			sum=sum*i;
		}
		
		try {
			out .println("Factorial: "+ sum);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return super.doStartTag();
	}


}
