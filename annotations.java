package practice.annotations;

/**
 * @author Ishita.Singhal
 *
 */
 class base {
	public void display() {
		System.out.println("This is base class");
	}
}

 class example1 extends base{
	@Override public void display() {
		System.out.println("This is derived class");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		example1 obj1=new example1();
		obj1.display();

	}

}
