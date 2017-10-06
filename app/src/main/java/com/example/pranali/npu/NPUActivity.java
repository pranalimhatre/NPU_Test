package com.example.pranali.npu;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class NPUActivity extends AppCompatActivity {

    int[] bookImg = {R.drawable.book,R.drawable.book,R.drawable.book,R.drawable.book};
    String[] courseCode = {"CS571","CS548","CS551","CS595"};
    String[] cousersDesc = {"Cloud Management- Hadoop Administration","Web Services Techniques and REST Technologies","Mobile Computing for Android Mobile Devices","Computer Science Capstone Course"};
    String[] creditCount = {"(3.0)","(3.0)","(3.0)","(3.0)"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_npu);

        ListView courseList = (ListView) findViewById(R.id.courseList);
        CustomeAdaptor customeAdaptor = new CustomeAdaptor();

        courseList.setAdapter(customeAdaptor);
      // courseList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//           @Override
//           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//showPopupMenu(view);
//           }
//       });
        //PopupMenu pp = new PopupMenu();
    }
    private void showPopupMenu(View view) {

        PopupMenu popup = new PopupMenu(this, view);

        popup.getMenuInflater().inflate(R.menu.popupmenu_course, popup.getMenu());

        popup.show();
    }
    class CustomeAdaptor extends BaseAdapter{


        @Override
        public int getCount() {
            return bookImg.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.courselistitem,null);
            ImageView bookimg = (ImageView)view.findViewById(R.id.imageView3);
            TextView txtCourseCode = (TextView)view.findViewById(R.id.txt_coursecode);
            TextView txtCourseDesc = (TextView)view.findViewById(R.id.txt_courename);
            TextView txtCredit = (TextView)view.findViewById(R.id.txt_credits);
            ImageButton imgbtn = (ImageButton)view.findViewById(R.id.imageButton) ;
            //  getMenuInflater().inflate(R.menu.toolbar_menu,menu);
            bookimg.setImageResource(bookImg[i]);
            txtCourseCode.setText(courseCode[i]);
            txtCourseDesc.setText(cousersDesc[i]);
            txtCredit.setText(creditCount[i]);
            imgbtn.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {
                                              showPopupMenu(view);
                                          }
                                      }
            );
            return view;
        }

        @Override
        public CharSequence[] getAutofillOptions() {
            return new CharSequence[0];
        }
    }

}
