package Encapsulation;

public class Cricket {
private int runs;
private int matches;
public int getRuns() {
	return runs;
}
public void setRuns(int runs) {
	this.runs = runs;
}
public int getMatches() {
	return matches;
}
public void setMatches(int matches) {
	this.matches = matches;
}
public int avg() {
	int avg = runs/matches;
	return avg;
}
}
