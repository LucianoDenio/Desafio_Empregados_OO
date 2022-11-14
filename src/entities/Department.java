package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
	
	private String name;
	private Integer payDay;
	private Address address;
	
	private List <Employee> employee = new ArrayList<>();
	
	public Department () {
	}
	
	public Department(String name, Integer payDay, Address address) {
		this.name = name;
		this.payDay = payDay;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Integer getPayDay() {
		return payDay;
	}

	public void setPayDay(Integer payDay) {
		this.payDay = payDay;
	}

	public void addEmployee(Employee employee) {
		this.employee.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		this.employee.add(employee);
	}
	
	public double payrool () {
		double sum = 0.0;
		for (Employee c : employee) {
			sum += c.getSalary();
			}
		return sum;
	}
	
	@Override
	
	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append("FOLHA DE PAGAMENTO: \n");
		sb.append("Departamento Vendas = R$ ");
		sb.append(String.format("%.2f%n", payrool()));
		sb.append("Pagamento realizado no dia ");
		sb.append(payDay + "\n");
		sb.append("Funcionários: \n");
		for (Employee c : employee) {
			sb.append(c.getName() + "\n");
		}
		sb.append("Para dúvidas favor entrar em contato: ");
		sb.append(address);
		return sb.toString();
	}
	
}
