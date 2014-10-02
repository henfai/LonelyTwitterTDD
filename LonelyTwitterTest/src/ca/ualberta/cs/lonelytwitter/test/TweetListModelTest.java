package ca.ualberta.cs.lonelytwitter.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import android.test.ActivityInstrumentationTestCase2;
import ca.ualberta.cs.lonelytwitter.AbstractTweet;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.Tweet;
import ca.ualberta.cs.lonelytwitter.data.TweetListModel;


public class TweetListModelTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity>
{
	public TweetListModelTest(){		
		super(LonelyTwitterActivity.class);
	}
	
	
	public void testAddTweet(){
		TweetListModel TLM = new TweetListModel();
		Tweet t = new Tweet("Hello");
		TLM.addTweet(t);
		assertEquals("Okay", 1, TLM.getCount());
		Tweet t2 = new Tweet("Hello");
		try{
			TLM.addTweet(t2);
			fail();
		} catch(Exception e){
			assertEquals(e.getMessage(), "Illegal Argument Exception");	
		}
		assertEquals("Okay", 1, TLM.getCount());
	}
	
	public void testHasTweet(){
		TweetListModel TLM = new TweetListModel();
		Tweet t = new Tweet("Hello");
		TLM.addTweet(t);
		Tweet t2 = new Tweet("Hello");
		assertTrue(TLM.hasTweet(t2));
		
	}
	
	public void testGetCount(){
		TweetListModel TLM = new TweetListModel();
		Tweet t = new Tweet("Hello");
		TLM.addTweet(t);
		assertEquals("Okay", 1, TLM.getCount());
	}
	
	public void testRemoveTweet(){
		TweetListModel TLM = new TweetListModel();
		Tweet t = new Tweet("Hello");
		TLM.addTweet(t);
		assertEquals("Okay", 1, TLM.getCount());
		assertTrue(TLM.hasTweet(t));
		TLM.removeTweet(t);
		assertEquals("Deleted", 0, TLM.getCount());
	}
	
	public void testGetTweets(){
		TweetListModel TLM = new TweetListModel();
		List<AbstractTweet> temp = new ArrayList<AbstractTweet>();
		Tweet t = new Tweet("xyz");
		Tweet t1 = new Tweet("bcd");
		Tweet t2 = new Tweet("abc");
		TLM.addTweet(t);
		TLM.addTweet(t1);
		TLM.addTweet(t2);
//		temp = TLM.getList();
		List<AbstractTweet> ordered = TLM.getTweets();
		assertTrue(ordered.get(0).getTweetBody().compareTo(ordered.get(1).getTweetBody())>0);
		
		
	}
	
	
	
}
