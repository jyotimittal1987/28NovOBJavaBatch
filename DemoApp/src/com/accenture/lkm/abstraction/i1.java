package com.accenture.lkm.abstraction;

public interface i1 {
	// All methods in interface are by default abstract and public
	// no need to mention public and abstract keyword.
	void add();

	void sub();

}
interface i2
{
	void add();
}
interface i3 extends i2
{
	void mul();
}

//class Test implements i1,i2
class Test implements i3 {

	public void add() {
		// TODO Auto-generated method stub

	}

	/*
	 * public void sub() { // TODO Auto-generated method stub
	 * 
	 * }
	 */
	public void mul() {
		// TODO Auto-generated method stub
		
	}

}
