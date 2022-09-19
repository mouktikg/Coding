package com.mouktik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class  Message {
final private  Long id;
final private List<String> text;
public Long getId() {
return id;
}



public Message(Long id, List<String> text) {
	super();
	this.id = id;
	this.text = new ArrayList(text);
}



/*
 * public void setId(Long id) { this.id = id; }
 */
public List<String> getText() {
return new ArrayList(text);
}
/*
 * public void setText(List<String> text) { this.text = text; }
 */


public static void main(String[] args) {
	
	List<String> list = Arrays.asList("aaa","bbb");
	Message msg = new Message(1l, list);
	
	msg.getText().add("sss");
	
	System.out.println(msg.getText());
	
	
	
}
}