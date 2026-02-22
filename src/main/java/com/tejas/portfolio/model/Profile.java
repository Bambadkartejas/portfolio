package com.tejas.portfolio.model;

import java.util.List;

public class Profile {

    public String name;
    public String role;
    public int experience;
    public List<String> skills;

    public Profile(String name, String role, int experience, List<String> skills) {
        this.name = name;
        this.role = role;
        this.experience = experience;
        this.skills = skills;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
    
    
}
