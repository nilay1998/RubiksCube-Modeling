package RubiksCube;

public class Driver 
{
	public static void main(String args[])
	{
		char front[][]=new char[3][3];
		char left[][]=new char[3][3];
		char right[][]=new char[3][3];
		char back[][]=new char[3][3];
		char top[][]=new char[3][3];
		char bottom[][]=new char[3][3];
		
		String name="";
		
		RubixCubeService service=new RubixCubeService(name,front,left,right,back,top,bottom);
		
		
	}
}
