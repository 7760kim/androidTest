package test;

public class Test {

	private final TestVO testVO;
	private final String str1;

	private int int1;
	private double double1;

	public static class Builder {
		private final TestVO testVO;
		private final String str1;

		private int int1 = 0;
		private double double1 = 0;

		public Builder( TestVO vo, String str ) {
			this.testVO = vo;
			this.str1 = str;
		}

		public Builder int1(int val) {
			this.int1 = val;
			return this;
		}

		public Builder double1(double val) {
			this.double1 = val;
			return this;
		}
	}

	public Test(Builder builder) {
		this.testVO = builder.testVO;
		this.str1 = builder.str1;
		this.int1 = builder.int1;
		this.double1 = builder.double1;
	}
}
