/*
 * Group: BAZINGA!
 * @author: Gustavo Maturana
 * @date: 11/06/12
 */

package com.example.grocerylist;


import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
 
public class GroceryList extends Activity {
 
/*
 * When the use click in any of the items that are shown in the list in the main screen
 * the user will be rerouted to this class 
 */
	Button addRecipeBtn;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        

        ActionBar actionBar = getActionBar();
        actionBar.setSubtitle("My List");
        actionBar.setDisplayHomeAsUpEnabled(true);
        
        
        // Button Initialization
        addRecipeBtn = (Button)findViewById(R.id.addRecipe_btn);
        
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.recipe_list_layout, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem)
    {   
    	switch(menuItem.getItemId()){
    	case android.R.id.home:
    	  Intent intent = new Intent(GroceryList.this, MainActivity.class);
    	  intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    	  startActivity(intent);
    	  break; 
    	}
    	return true;
    }

}