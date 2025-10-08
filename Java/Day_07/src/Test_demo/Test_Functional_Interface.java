package Test_demo;
import Sub_Test.MyNewCompare;
import Sub_Test.MyComparable;

public class Test_Functional_Interface {

	public static void main(String[] args) {
		MyNewCompare obj = new MyNewCompare();
		obj.compare(10,20);
		
		MyComparable obj1 =new MyComparable() {
			
			@Override
			public int compare(int i,int j) {
				System.out.println("in annonymous class compare" +i+","+j);
				return 0;
			}
			
		};
		int c =obj1.compare(45, 54);
		
		MyComparable obj2=(i,j)->{
				System.out.println("in lambda class compare" +i+","+j);
				return 0;
			
		};
		int x=obj2.compare(74, 47);
			
		}

	}


