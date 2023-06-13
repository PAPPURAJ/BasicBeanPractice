package io.github.pappuraj.construction_ambiguity;

public class Calculation {
		public Calculation(int a, int b) {
			System.out.println("Calculated by int: "+(a+b));
		}
		
		public Calculation(float a, float b) {
			System.out.println("Calculated by float: "+(a+b));
		}
		
		public Calculation(double a, double b) {
			System.out.println("Calculated by double: "+(a+b));
		}
		
		public Calculation(String a, String b) {
			System.out.println("Calculated by String: "+(Integer.parseInt(a)+Integer.parseInt(b)));
		}
		
		
		public void onInit() {
			System.out.println("On init called!");
		}
		
		
		public void onDestroy() {
						System.out.println("On destroy called!");

		}
}
