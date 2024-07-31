package proxypattern;

public class Test {
	 public static void main(String[] args) {
	        Image image = new ProxyImage("test_image.jpg");
	        image.display(); 
	        image.display(); 
	        }
	}
