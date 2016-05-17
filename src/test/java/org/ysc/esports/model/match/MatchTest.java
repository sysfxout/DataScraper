package org.ysc.esports.model.match;

import static org.junit.Assert.*;

import org.junit.*;

public class MatchTest {

	private static Match match = new Match();

	@BeforeClass
	public static void setup() {
		match.setTournamentId("MSI");
		match.setYear("16");
		match.setRegion("NA");
		match.setTeam1("Team1");
		match.setTeam2("Team2");
		match.setMatchURL("MatchURL");
		match.setAcsURL("AcsUrl");
		match.setWeek(1);
		match.setDay(1);
		match.setGame(1);
	}

	@Test
	public void testGetId() {
		assertEquals("MSI16-NA-W1D1G1", match.getId());
	}
	
	@Test
	public void testGetGameId(){
		assertEquals("W1D1G1", match.getGameId());
	}

}
