package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do departamento: ");
		String departmentName = sc.nextLine();
		System.out.print("Dia do pagamento: ");
		Integer payDay = sc.nextInt();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Telefone: ");
		String phone = sc.next();
		
		Address address = new Address(email, phone);
		Department department = new Department(departmentName, payDay, address);
		
		System.out.print("Quantos funcionários tem o departamento? ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Dados do funcionário "+i+":");
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salario: ");
			double salary = sc.nextDouble();
			
			Employee employee = new Employee(name, salary);
			department.addEmployee(employee);
		}
		
		System.out.println();
		System.out.print(department);
		
		
		
		
		
		
		
		
		sc.close();

	}

}
