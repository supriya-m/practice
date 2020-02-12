package com.capgemini.basics.lab8;
import java.io.FileInputStream; 
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.capgemini.basics.lab5.eis.bean.P_5_Employee;

public class P_8_3_EmployeeDetails {
	public static void main(String[] args) throws Exception {
		
		P_5_Employee e1 = new P_5_Employee();
		e1.setEmpId(101);
		e1.setEmpName("Jay");
		e1.setEmpSal(40000.45);
		e1.setEmpDesig("analyst");
		e1.setEmpIScheme("Scheme A");
		
		try {
			FileOutputStream fos = new FileOutputStream("employeeDetails.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(e1);
			
			oos.close();
			fos.close();
			
			FileInputStream fis = new FileInputStream("employeeDetails.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			P_5_Employee employee1 = (P_5_Employee) ois.readObject();
			
			ois.close();
			fis.close();
			System.out.println(employee1);
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
