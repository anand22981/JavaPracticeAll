package com.insertObject;

public class StudentApp {
public static void main(String[] args) {
	Student s1 = new Student(1,"Deep","CS");
	Student s2 = new Student(2,"Ashiu","EC");
	DbApp.insertObject(s1);
	DbApp.insertObject(s2);
}
}
