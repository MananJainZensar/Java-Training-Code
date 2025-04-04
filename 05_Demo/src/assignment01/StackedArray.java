package assignment01;

import java.util.Arrays;

public class StackedArray {
	private int arr[];
	private int top;
	private int size;
	
	public StackedArray(int size) {
		arr = new int[size];
		this.size = size;
		top = -1;
	}
	public void push(int a) {
		top ++;
		arr[top] = a;
	}
	public int pop(int a) {
		top --;
		return arr[top] = a;
	}
	@Override
	public String toString() {
		return "StackedArray [arr=" + Arrays.toString(arr) + ", top=" + top + ", size=" + size + "]";
	}
}
