package selfProject;

import java.util.Scanner;

public class MePractice {

	public static void main(String[] args) {
		

		
//	int [][] maryamlove = { {2,3},{4,6,7,4},{3,5,8,9}}; 
//		
//		double sum = 0;
//		double average = 0;
//		int min = maryamlove [0][0];
//		int max = maryamlove [0][0];
//		
//		for ( int i =0; i <maryamlove.length ;i++ ) {
//			for ( int j =0; j<maryamlove[i].length;i++ ) {
//				sum += maryamlove[i][j];
//			}
//			
//		}
//				
//		System.out.println("sum is :" + sum);
		
		
		// aski
		
		
		
		System.out.println("------------------------");
		
		//break after n
		
//		for (char c = 'a'; c <= 'z'; c++) {
//			//System.out.print(c+" "); // it is included 'n', because it if before conditon
//			if (c=='n') {
//				continue;
//			}
//			System.out.print(c+" "); // it is not included 'n' because it is after condition
//		}
		
//		char c ='a';
//		while ( c<='z') {
//			if (c =='n') {
//				continue;
//			}
//			
//			System.out.print(c++);
//			
//			
//			
//		}
//		
		
		Scanner s = new Scanner (System.in);
		String CityNames [] = new String[5];
		
		System.out.println("please enter city name");
		
		for (int i = 0; i < CityNames.length; i++) {
			CityNames [i] =  s.nextLine(); 
		} 
		//System.out.println(CityNames[0]);
		for (int i = 0; i < CityNames.length; i++) {
			if (CityNames[i].charAt(0)== 'D' || CityNames[i].startsWith("d") ) {
				System.out.println(CityNames[i]);
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
	}	
	
	
	
