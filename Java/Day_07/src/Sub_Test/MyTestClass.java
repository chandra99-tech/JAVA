package Sub_Test;

public class MyTestClass {
	
	public int Max(int a,int b) {
		return (a>b)?a:b;
		}
	public float Max(float a,float b) {
		return (a>b)?a:b;
		}
	
	public String Max(String a,String b) {
		return (a.length()>b.length())?a:b;
		}
	
	public int Max(int a,int b,int c) {
		return (a>b)?((a>c)?a:c):b;
		}
	
	public int add(int x, int ...arr) {
		int sum=x;
		for(int a: arr) {
			sum+=a;
		}
		return sum;
	}
	

}
