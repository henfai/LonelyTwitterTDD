package ca.ualberta.cs.lonelytwitter.test;

import android.test.ActivityInstrumentationTestCase2;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.Tweet;
import ca.ualberta.cs.lonelytwitter.data.TweetListModel;


public class AbstractTweetTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity>
{
	public AbstractTweetTest(){
		super(LonelyTwitterActivity.class);
	}
	
	public void testFiveIsFive(){
		assertEquals("Five is Five",6 ,6);
	}
	
	public void testAbstractTweet(){
		Tweet t = new Tweet("Hello");
		String actual = t.getTweetBody();
		
		Tweet s = new Tweet("Hello");
		
		assertEquals("yes", "Hello", actual);
		assertEquals("same", t, s);
	}
	
	
	
	
}
