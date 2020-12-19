package com.daniel.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;

	private String[] operatingSystems;

	private LinkedHashMap<String, String> coutnryOptions;

	public Student() {

		// populate country options: used ISO country code
		coutnryOptions = new LinkedHashMap<>();

		coutnryOptions.put("BR", "Brazil");
		coutnryOptions.put("FR", "France");
		coutnryOptions.put("DE", "Germany");
		coutnryOptions.put("NP", "Nepal");
		coutnryOptions.put("CA", "Canada");
		coutnryOptions.put("US", "United States");

		favoriteLanguageOptions = new LinkedHashMap<>();

		favoriteLanguageOptions.put("Java", "Java");
		favoriteLanguageOptions.put("C#", "C#");
		favoriteLanguageOptions.put("PHP", "PHP");
		favoriteLanguageOptions.put("Python", "Python");
	}

	private LinkedHashMap<String, String> favoriteLanguageOptions;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCoutnryOptions() {
		return coutnryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

}
