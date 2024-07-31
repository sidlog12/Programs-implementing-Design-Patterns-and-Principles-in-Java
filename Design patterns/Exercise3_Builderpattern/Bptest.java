package test;
import java.util.Scanner;

public class Bptest {
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 String s=sc.next();

	        Computer PC = new Computer.Builder()
	            .setCPU("CPU: "+s)
	            .setRAM("RAM: "+s)
	            .setStorage("Storage: "+s)
	            .setGPU("GPU"+s)
	            .setMotherboard("Motherboard: "+s)
	            .setPowerSupply("Power Suppy: "+s)
	            .build();
	        System.out.println(PC);
	 }
}
