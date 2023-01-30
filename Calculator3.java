package week02.day01;

public class Calculator3 {
	public int add(int a,int b) {
		int c=a+b;
		return c;
	}
	public void sub(int d,int e) {
		int f=d-e;
		System.out.println("Sub : "+f);
	}
	public void multi(int d,int g) {
		int h=d*g;
		System.out.println("Multi : "+h);
	}
	public void div(int p,int k) {
		int l=p/k;
		System.out.println("Div : "+l);
	}
public static void main(String[] args) {
	Calculator3 kk=new Calculator3();
	int d=kk.add(4, 5);
	System.out.println("ADD : "+d);
	kk.sub(10,d);
	kk.multi(d,8);
	kk.div(4,2);
	
}
}
