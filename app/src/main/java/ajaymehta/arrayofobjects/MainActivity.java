package ajaymehta.arrayofobjects;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    // see i took a data source (model) as Array...u can take Getter Setter (POJO) , any Input method or anything...its own u..

    int[] rollno = new int[] {101, 102, 103, 104, 105};
    String[] names = new String[] {"Michel","Ria","Simi","Diler","Rocky"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Student[] student = new Student[5];     // got 5 students

        for(int i = 0 ; i< student.length; i++) {   // giving bith to all 5 object...all gonna have same name (student ) ..but they will be stored at different location of array..so no collision will be occured..

            student[i] = new Student(rollno[i], names[i]);   // ..we not sending array to constructor..we took i with them to send a particulr array element as int and string paramenter..
        }

        // To print students data

        for(int i= 0 ; i<student.length; i++) {

            student[i].printStudentsData(i , this);
        }

    }
}
