package com.ToolsQA.TestScripts;

class Parent {
	public static void foo(){
		System.out.println("I am Foo in Super");
		}

	public static void bar(){
		System.out.println("I am Bar in Super");
	}
}
 public class child extends Parent{
	 public static void foo(){
			System.out.println("I am Foo in child");
			}

		public static void bar(){
			System.out.println("I am Bar in child");
		}
		
		public static void main(String[] args){
			
			Parent par = new child();
			child Child = new child();
			
			par.foo();
			Child.foo();
			
			par.bar();
			Child.bar();
			
			child.foo();
			
			
		}
 }
 