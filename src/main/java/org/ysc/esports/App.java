package org.ysc.esports;

import org.ysc.esports.model.match.Match;
import org.ysc.esports.model.match.MatchContainer;
import org.ysc.esports.scraper.HTMLScraper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String url = "http://lol.esportspedia.com/wiki/League_Championship_Series/North_America/2016_Season/Spring_Season/Match_Details";
    	String tableClass = ""; //You will need to figure out what the table class name is
    	String region = "NA";
    	String tournamentId = "SPR16";
    
        System.out.println("STARTING");
        
        HTMLScraper scraper = new HTMLScraper(url, tableClass, region, tournamentId);
        scraper.scrape();
        
        printMatches();
        
        System.out.println("SCRAPE COMPLETE");
        
    }
    
    private static void printMatches(){
    	for(Match match : MatchContainer.getMatchList())
    		System.out.println(match);
    }
}
