package assignment01;

public class complexNumber {
	private int real;
	private int Imaginary;
	
	public complexNumber(int real, int Imaginary) {
		this.real = real;
		this.Imaginary = Imaginary;
	}
	public int getReal() {
		return real;
	}
	public void setReal(int real) {
		this.real = real;
	}
	public int getImaginary() {
		return Imaginary;
	}
	public void setImaginary(int Imaginary) {
		this.Imaginary = Imaginary;
	}
	
	void addNumbers(complexNumber c) {
		this.real += c.getReal();
        this.Imaginary += c.getImaginary();
	}
	void subtractNumbers(complexNumber c) {
		this.real -= c.getReal();
		this.Imaginary -= c.getImaginary();
	}
	public void multiply(complexNumber c) {
        int newReal = this.real * c.getReal() - this.Imaginary * c.getImaginary();
        int newImaginary = this.real * c.getImaginary() + this.Imaginary * c.getReal();
        this.real = newReal;
        this.Imaginary = newImaginary;
    }
	void swapNumber(complexNumber c) {
		int tempReal;
		int tempImaginary;
		
		tempReal = c.real;
		tempImaginary = c.Imaginary;
		
		c.real = this.real;
		c.Imaginary = this.Imaginary;
		
		this.real = tempReal;
		this.Imaginary = tempImaginary;
	}
	@Override
	public String toString() {
		return "complexNumber [real=" + real + ", Imaginary=" + Imaginary + "]";
	}
}
