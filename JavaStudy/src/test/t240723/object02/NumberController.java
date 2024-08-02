package test.t240723.object02;

public class NumberController {

	public NumberController() {
		super();
	}

	public boolean checkDouble(int num1, int num2) throws NumRangeException {
		if (((0 < num1 && num1 < 101) && (0 < num2 && num2 < 101))) {
			return (num1 % num2 == 0);
		} else {
			throw new NumRangeException("1 부터 100 사이의 값이 아닙니다.");
		}
	}
}
