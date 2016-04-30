/**
 * 
 */
package com.mohammad;

/**
 * @author Mohammad Najar
 *
 */
public class MainThread extends Thread {

	@Override
	public void run() {
		System.out.println("This is my thread. " + Thread.currentThread().getId());
	}
	
	
}
