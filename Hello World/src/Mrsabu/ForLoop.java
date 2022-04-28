package Mrsabu;

public class ForLoop {
//prime nor Not prime
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, sum = 0, c=0;
		int num = 7;
		for(i=1;i<=num;i++) {
			if(i%2==0)
			//if(1%1==0) 
				{
				c++;
			}
		}
		if(c==2) {
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
			}
		}

	}


