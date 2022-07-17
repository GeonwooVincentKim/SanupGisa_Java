class Child extends Parent {
	int compute(int num) {
		if (num <= 1)
			return num;

		return compute(num - 1) + compute(num - 3);
	}
}
