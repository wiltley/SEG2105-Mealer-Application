package com.example.mealerapplication.ui.Recipe;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.mealerapplication.R;
import com.example.mealerapplication.data.accounthandling.CookHandler;
import com.example.mealerapplication.data.model.Recipe;


public class CreateRecipe extends AppCompatActivity {

    private final int GALLERY_REQ_CODE = 1000;
    ImageView imgGallery;
    BottomNavigationView nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_recipe);

        EditText recipeName = findViewById(R.id.new_meal_name);
        EditText recipeCuisine = findViewById(R.id.new_meal_name);
        EditText recipeDescription = findViewById(R.id.new_meal_description);
        EditText recipePrice = findViewById(R.id.new_meal_price);
          Button submitRecipe = findViewById(R.id.create_new_recipe);

        Recipe recipe = new Recipe();


        submitRecipe.setOnClickListener(new View.OnClickListener(){

           @Override
            public void onClick(View view){



               recipe.setRecipeName(String.valueOf(recipeName.getText()));
               recipe.setDescription(String.valueOf(recipeDescription.getText()));
               recipe.setDescription(String.valueOf(recipeDescription.getText()));
               recipe.setCuisineType(String.valueOf(recipeCuisine.getText()));

               // We're definetely want to do some checks to see if the data
               // enter is valid before sending it to the database
               // Such as making sure none of the fields are empty

               CookHandler.addRecipe(recipe);

           }
           }
        );

        //imgGallery = findViewById(R.id.imageFood);
        //Button btnGallery = findViewById(R.id.imageUpload);

        //btnGallery.setOnClickListener(new View.OnClickListener() {
         //   @Override
         //   public void onClick(View view) {

          //      Intent iGallery = new Intent(Intent.ACTION_PICK);
           //     iGallery.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            //    startActivityForResult(iGallery,GALLERY_REQ_CODE);

            //}
        //});

    //}

    //@Override
    //protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
     //   super.onActivityResult(requestCode, resultCode, data);

      //  if(resultCode == RESULT_OK) {
       //     if (requestCode == GALLERY_REQ_CODE) {
        //        imgGallery.setImageURI(data.getData());
        //}
    //}
        nav = findViewById(R.id.btm_nav);

        nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.myMenu:
                        Intent intent = new Intent(CreateRecipe.this, MyMealsActivity.class);
                        startActivity(intent);


                    case R.id.createFood:
                        break;

                    case R.id.requests:
                        Toast.makeText(CreateRecipe.this, "requests", Toast.LENGTH_LONG).show();
//                        Intent intent2 = new Intent(MyMealsActivity.this, .class);
//                        startActivity(intent2);
                        break;
                    case R.id.myProfile:
                        Toast.makeText(CreateRecipe.this, "profile", Toast.LENGTH_LONG).show();
//                        Intent intent2 = new Intent(MyMealsActivity.this, .class);
//                        startActivity(intent2);
                        break;

                    default:
                }

                return true;
            }
        });
    }

}