package three.controller;

import three.view.StringView;
/**
 *The StringControlller class name.
 */
public class StringController
{
	//Declaration Section
	//All needed models and view objects
	
	/**
	 * Creates a StringView called myView.
	 */
	private StringView myView;
	
	/**
	 * Creates a StringController object.
	 */
	public StringController()
	{
		myView = new StringView();
		
	}
	
	/**
	 * Starts the view using the displayError method from StringView.
	 * @param  
	 */
	public void start()
	{
		myView.displayError();	
		String myResponse = myView.getResponse();
		myView.ShowPassedValue(myResponse);
		FriendController();
		myView.moreinteractive("Spencer Davy", myResponse);	
	}

	private void FriendController()
	{
		
	}
}