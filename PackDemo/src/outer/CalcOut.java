package outer;

import pack.Calc;

public class CalcOut extends Calc
{
	public static void main(String args[])
	{
		Calc.add(10, 20);
		CalcOut co=new CalcOut();
		co.sub(30, 5);
	}
}
