package br.com.cassunde.project.entity;

import java.util.List;

public interface Project {
	
	public String getDescription();
	public Double getDuration();
	public List< ? extends Member> getMembers();
	
}
