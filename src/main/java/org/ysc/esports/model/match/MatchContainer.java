package org.ysc.esports.model.match;

import java.util.ArrayList;
import java.util.List;

/*
 * Temp container for holding matches
 * This will change into sql storage code
 */

public class MatchContainer {
	private static List<Match> matchList = new ArrayList<Match>();
	
	public static void add(Match match){
		matchList.add(match);
	}

	public static List<Match> getMatchList() {
		return matchList;
	}
	
	
}
