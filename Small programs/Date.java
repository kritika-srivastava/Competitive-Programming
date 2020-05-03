class Date {
	int dd, mm, yy;

	public Date() {
		dd = 0;
		mm = 0;
		yy = 0;
	}

	public Date(int d, int m, int y) {
		dd = d;
		mm = m;
		yy = y;
	}

	public void UseDate() {
		Date date = new Date(1, 1, 2014);
		System.out.println(date.dd + "/" + date.mm + "/" + date.yy);
		Date date1 = new Date();
		System.out.println(date1.dd + "/" + date1.mm + "/" + date1.yy);

	}
}
