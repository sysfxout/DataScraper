package org.ysc.esports.model.match;

import java.util.ArrayList;
import java.util.List;

public class MatchContainer {
	private static List<Match> matchList = new ArrayList<Match>();
	
	public static void add(Match match){
		matchList.add(match);
	}

	public static List<Match> getMatchList() {
		return matchList;
	}
	
	
}
