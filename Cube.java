package RubiksCube;

import java.util.*;

public class Cube 
{
	private char front[][];
	private char left[][];
	private char right[][];
	private char back[][];
	private char top[][];
	private char bottom[][];
	
	
	public Cube(char front[][],char left[][],char right[][],char back[][],char top[][], char bottom[][])
	{
		this.front=front;
		this.back=back;
		this.left=left;
		this.right=right;
		this.top=top;
		this.bottom=bottom;
	}
	
	public char[][] getFront(){
		return front;
	}
	public char[][] getLeft(){
		return left;
	}
	public char[][] getRight(){
		return right;
	}
	public char[][] getBack(){
		return back;
	}
	public char[][] getTop(){
		return top;
	}
	public char[][] getBottom(){
		return bottom;
	}
	
	public void setFront(char arr[][]) {
		front=arr;
	}
	public void setLeft(char arr[][]) {
		left=arr;
	}
	public void setRight(char arr[][]) {
		right=arr;
	}
	public void setBack(char arr[][]) {
		back=arr;
	}
	public void setTop(char arr[][]) {
		top=arr;
	}
	public void setBottom(char arr[][]) {
		bottom=arr;
	}
}
