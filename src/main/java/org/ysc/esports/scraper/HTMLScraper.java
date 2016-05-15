package org.ysc.esports.scraper;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.ysc.esports.model.match.Match;

/*
 * Class used for scraping data for a given URL
 * 
 * This is just a skeleton that you can follow to create the class
 * You can create more methods/variables/classes if you want
 * 
 */

public class HTMLScraper {
	
	private Document doc; 
	private String tableClass; //Name of the table's class to search for (e.g. wikitable, prettytable) 
	private String region; //Region data is dealing with
	private String tournamentId; //Season or Tournament concatenated with the year (e.g. SPR16, SUM16, MSI16)
	
	/*
	 * Initialize the variables
	 * Set 'doc' by using Jsoup to connect to the 'url'
	 */
	public HTMLScraper(String url, String tableClass, String region, String tournamentId){
		
	}
	
	/*
	 * User will call this method to start the scraping process
	 * You do not need to modify this at the moment
	 */
	public void scrape(){
		scrapeSPRNA2016();
		
	}
	
	/*
	 * Generate an algorithm to parse the table and create a Match object
	 * After creating the Match object, add it to the MatchContainer (MatchContainer.add(match))
	 * Check the Match object to see which elements need to be filled out
	 * 
	 * Only work with Spring NA 2016 URL
	 * http://lol.esportspedia.com/wiki/League_Championship_Series/North_America/2016_Season/Spring_Season/Match_Details
	 * 
	 */
	private void scrapeSPRNA2016(){
		
	}
	
	/*
	 * Helper method for scrapeTable*******()
	 * Use jsoup to parse the html of tables where class = tableClass
	 * Returns all data tables with the corresponding class
	 */
	private Elements findDataTables(){
		return null;
	}
	
}
