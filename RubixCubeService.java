package RubiksCube;

public class RubixCubeService 
{
	private Cube cube;
	private Player player;
	private static final String CLOCKWISE="clockwise";
	private static final String ANTI_CLOCKWISE="anticlockwise";
	
	public RubixCubeService(String name,char front[][],char left[][],char right[][],char back[][],char top[][], char bottom[][])
	{
		cube=new Cube(front,left,right,back,top,bottom);
		player=new Player(name);
	}
	
	private void rotateAntiClockwise(char first[][],char second[][],char third[][],char fourth[][],int index1,int index2,int index3,int index4)
	{
		char temp[]=first[index1];
		
		first[index1]=fourth[index4];
		fourth[index4]=third[index3];
		third[index3]=second[index2];
		second[index2]=temp;
	}
	
	private void rotateClockwise(char first[][],char second[][],char third[][],char fourth[][],int index1,int index2,int index3,int index4)
	{
		char temp[]=first[index1];
		
		first[index1]=second[index2];
		second[index2]=third[index3];
		third[index3]=fourth[index4];
		fourth[index4]=temp;
	}
	
	public void rotateTop(String direction)
	{
		char front[][]=cube.getFront();
		char left[][]=cube.getLeft();
		char right[][]=cube.getRight();
		char back[][]=cube.getBack();
		
		if(direction.equals(CLOCKWISE))
			rotateClockwise(front,right,back,left,0,0,0,0);
		else if(direction.equals(ANTI_CLOCKWISE))
			rotateAntiClockwise(front,right,back,left,0,0,0,0);
		
		cube.setBack(back);
		cube.setFront(front);
		cube.setLeft(left);
		cube.setRight(right);
	}
	
	public void rotateBottom(String direction)
	{
		char front[][]=cube.getFront();
		char left[][]=cube.getLeft();
		char right[][]=cube.getRight();
		char back[][]=cube.getBack();
		
		if(direction.equals(CLOCKWISE))
			rotateClockwise(front,right,back,left,2,2,2,2);
		else if(direction.equals(ANTI_CLOCKWISE))
			rotateAntiClockwise(front,right,back,left,2,2,2,2);
		
		cube.setBack(back);
		cube.setFront(front);
		cube.setLeft(left);
		cube.setRight(right);
	}
	
	public void rotateFront(String direction)
	{
		char left[][]=cube.getLeft();
		char right[][]=cube.getRight();
		char top[][]=cube.getTop();
		char bottom[][]=cube.getBottom();
		
		transpose(left);
		transpose(right);
		
		if(direction.equals(CLOCKWISE))
			rotateClockwise(top,left,bottom,right,2,2,0,0);
		else if(direction.equals(ANTI_CLOCKWISE))
			rotateAntiClockwise(top,left,bottom,right,2,2,0,0);
		
		transpose(left);
		transpose(right);
		
		cube.setLeft(left);
		cube.setRight(right);
		cube.setTop(top);
		cube.setBottom(bottom);
	}
	
	
	public void rotateBack(String direction)
	{
		char left[][]=cube.getLeft();
		char right[][]=cube.getRight();
		char top[][]=cube.getTop();
		char bottom[][]=cube.getBottom();
		
		transpose(left);
		transpose(right);
		
		if(direction.equals(CLOCKWISE))
			rotateClockwise(top,left,bottom,right,0,0,2,2);
		else if(direction.equals(ANTI_CLOCKWISE))
			rotateAntiClockwise(top,left,bottom,right,0,0,2,2);
		
		transpose(left);
		transpose(right);
		
		cube.setLeft(left);
		cube.setRight(right);
		cube.setTop(top);
		cube.setBottom(bottom);
	}
	
	public void rotateRight(String direction)
	{
		char top[][]=cube.getTop();
		char bottom[][]=cube.getBottom();
		char front[][]=cube.getFront();
		char back[][]=cube.getBack();
		
		transpose(front);
		transpose(back);
		
		if(direction.equals(CLOCKWISE))
			rotateClockwise(top,front,bottom,back,2,2,0,0);
		else if(direction.equals(ANTI_CLOCKWISE))
			rotateAntiClockwise(top,front,bottom,back,2,2,0,0);
		
		transpose(front);
		transpose(back);
		
		cube.setTop(top);
		cube.setBottom(bottom);
		cube.setBack(back);
		cube.setFront(front);
	}
	
	public void rotateLeft(String direction)
	{
		char top[][]=cube.getTop();
		char bottom[][]=cube.getBottom();
		char front[][]=cube.getFront();
		char back[][]=cube.getBack();
		
		transpose(front);
		transpose(back);
		
		if(direction.equals(CLOCKWISE))
			rotateClockwise(top,front,bottom,back,0,0,2,2);
		else if(direction.equals(ANTI_CLOCKWISE))
			rotateAntiClockwise(top,front,bottom,back,0,0,2,2);
		
		transpose(front);
		transpose(back);
		
		cube.setTop(top);
		cube.setBottom(bottom);
		cube.setBack(back);
		cube.setFront(front);
	}
	
	
	private void transpose(char arr[][])
	{
		for(int i=0;i<3;i++)
		{
			for(int j=i;j<3;j++)
			{
				char temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
	}
}
