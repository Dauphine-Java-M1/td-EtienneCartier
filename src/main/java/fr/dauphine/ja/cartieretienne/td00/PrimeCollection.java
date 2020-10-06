package fr.dauphine.ja.cartieretienne.td00;

import java.util.ArrayList;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class PrimeCollection {
	private ArrayList<Integer> numbers;
	
	public PrimeCollection() {
		numbers = new ArrayList<Integer>();
	}
	
	public void initRandom(int n, int m) {
		Random stream = new Random();
		for(int i = 0; i < n; i++) {
			numbers.add((stream.nextInt() % (m - 1)) + 1);
		}
	}
	
	public boolean isPrime(int p) {
		for(int i = 2; i < Math.sqrt(p); i++) {
			if(p % i == 0) return false;
		}
		return true;
	}
	
	public void printPrime() {
		for(int i = 0; i < this.numbers.size(); i++) {
			if(isPrime(this.numbers.get(i))) {
				System.out.println(this.numbers.get(i));
			}
		}
	}
	
    public static void main( String[] args ) {
    	PrimeCollection collect = new PrimeCollection();
    	collect.initRandom(100, 1000);
    	collect.printPrime();
    }
}
