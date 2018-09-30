package myUtils;

public class Text{
	public String text;

	public String subString (String wordStart, String wordEnd){
		int d= text.indexOf (wordStart);
		int f= text.indexOf (wordEnd, d);
		d+= wordStart.length();
		String subStr = text.substring (d,f);
		return subStr;
	}
	public Text (String text){ this.text = text; }
	public Text(){ this (""); }
}