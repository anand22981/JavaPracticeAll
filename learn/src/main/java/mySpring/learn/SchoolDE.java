package mySpring.learn;
import java.util.*;
public class SchoolDE {

	List<String>clients;
	Set<String>teams;
	Map<String,String>trainers;
	
	
	public SchoolDE() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SchoolDE(List<String> clients, Set<String> teams, Map<String, String> trainers) {
		super();
		this.clients = clients;
		this.teams = teams;
		this.trainers = trainers;
	}
	public List<String> getClients() {
		return clients;
	}
	public void setClients(List<String> clients) {
		this.clients = clients;
	}
	public Set<String> getTeams() {
		return teams;
	}
	public void setTeams(Set<String> teams) {
		this.teams = teams;
	}
	public Map<String, String> getTrainers() {
		return trainers;
	}
	public void setTrainers(Map<String, String> trainers) {
		this.trainers = trainers;
	}
	@Override
	public String toString() {
		return "SchoolDE [clients=" + clients + ", teams=" + teams + ", trainers=" + trainers + "]";
	}
	

}
