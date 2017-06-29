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

/*
There are some inconveniences in this mechanism
1. we cant store differnt classo bject into the same array...array only store one data type of elements...see above array..we created just one type (student array)
2. adding objects at end is easy..but inserting and deleting the elements in the middle of array is difficult..we have to re-arrange all the elements of array.
3.retriving the elemnts from an array is easy but after reteriving the elements,if we want to process them, there are no methods available ex getFirst (to get first element ) , index0f (to find index of particular element)..we have to add all things manually.
so we needed other better mechanism to store group of object.. so we got alternative is to store group of objects into an object....we can use class object as an array..called 
collection object or container object. 
ex Set<T> , List<T> , Queue, Map..  */
