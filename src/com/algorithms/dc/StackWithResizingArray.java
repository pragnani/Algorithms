package com.algorithms.dc;

public class StackWithResizingArray {

	String[] items;
	int top;
	

	public StackWithResizingArray(int size) {
		items = new String[size];
	}

	public void push(String s) {
		items[top++]= s;
		
		
	}

	public String pop() {
		String item = items[top--];
		item=null;
		return item;
	}
	
	public String[] resizeArray(String[] items){
		String[] temp=new String[items.length*2/3];
		for(int i=0;i<items.length;i++){
			temp[i]=items[i];
		}
		return temp;
	}

}
