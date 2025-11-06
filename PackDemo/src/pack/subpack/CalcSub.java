package pack.subpack;
import pack.Calc;
public class CalcSub extends Calc
{
	public static void main(String args[])
	{
		Calc.add(10, 20);
		CalcSub cs=new CalcSub();
		cs.sub(30, 5);
	}
}
