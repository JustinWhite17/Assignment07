/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// Create instances
		Freshman freshman = new Freshman("Michael", (short) 20, 12);
		Senior senior = new Senior("John", (short) 30, 90);

		Scanner scanner = new Scanner(System.in);

		// Get GPA
		System.out.println("Enter GPA for " + freshman.getName() + ":");
		freshman.setGpa(scanner.nextDouble());

		System.out.println("Enter GPA for " + senior.getName() + ":");
		senior.setGpa(scanner.nextDouble());

		// print
		System.out.println(freshman);
		System.out.println(senior);
	}
}


