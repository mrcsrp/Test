import java.util.Scanner;
class A{
private int num1;
private int num2;

	public A(){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter your first number :");
	num1=sc.nextInt();
	System.out.print("Enter your Secont number :");
	num2=sc.nextInt();
	}
	public int getNum1(){
		return num1;
		}
	public int getNum2(){
		return num2;
		}
}
class B{
	private int num1;
	private int num2;
	
	public B(int num1, int num2){
		this.num1=num1%100;
		this.num2=num2%100;
	}
	public int getNum1(){
		return num1;
		}
	public int getNum2(){
		return num2;
		}
}
class C{
	public static void main(String args[]){
	A a=new A();
	B b=new B(a.getNum1(), a.getNum2());
	System.out.println("Result:"+(b.getNum1()*b.getNum2()));
	}
}