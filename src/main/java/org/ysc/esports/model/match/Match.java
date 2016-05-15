package org.ysc.esports.model.match;
/*
 * 
 */
public class Match {
	private String tournamentId;
	private String season;
	private String region;
	private String team1, team2;
	private String matchURL, acsURL;
	private int week, day, game;
	
	public String getTournamentId() {
		return tournamentId;
	}
	public void setTournamentId(String tournamentId) {
		this.tournamentId = tournamentId;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	public String getMatchURL() {
		return matchURL;
	}
	public void setMatchURL(String matchURL) {
		this.matchURL = matchURL;
	}
	public String getAcsURL() {
		return acsURL;
	}
	public void setAcsURL(String acsURL) {
		this.acsURL = acsURL;
	}
	public int getWeek() {
		return week;
	}
	public void setWeek(int week) {
		this.week = week;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getGame() {
		return game;
	}
	public void setGame(int game) {
		this.game = game;
	}
	
	@Override
	public String toString() {
		return "Match [tournamentId=" + tournamentId + ", season=" + season
				+ ", region=" + region + ", team1=" + team1 + ", team2="
				+ team2 + ", matchURL=" + matchURL + ", acsURL=" + acsURL
				+ ", week=" + week + ", day=" + day + ", game=" + game + "]";
	}
}
