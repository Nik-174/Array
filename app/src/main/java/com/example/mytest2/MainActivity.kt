package com.example.mytest2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val bad = 0..3
    val normal = 4..6
    val nice = 7..9
    val excellent = 10
    val gradeArray = arrayOf(5, 7, 10, 4, 3, 2)
    val badArray = ArrayList<String>()
    val normalArray = ArrayList<String>()
    val niceArray = ArrayList<String>()
    val excellentArray = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameArray = resources.getStringArray(R.array.nameArray)
        for ((index, grade) in gradeArray.withIndex()) {
            if (grade in bad) {
                Log.d("myTag", "Плохие оценки: ${nameArray[index]} - $grade")
            } else if (grade in normal) {
                Log.d("myTag", "Нормальные оценки: ${nameArray[index]} - $grade")
            } else if (grade in nice) {
                Log.d("myTag", "Хорошие оценки: ${nameArray[index]} - $grade")
            } else {
                Log.d("myTag", "Отличные оценки: ${nameArray[index]} - $grade")
            }

        }
//        
        gradeArray.toString()
        for((index,grade) in gradeArray.withIndex()){
            when(grade){
                in bad ->badArray.add("Плохие оценки: Ученик : ${nameArray[index]} - ${grade}")
                in normal -> normalArray.add("Нормальные оценки: Ученик : ${nameArray[index]} - ${grade}")
                in nice -> niceArray.add("Хорошие оценки: Ученик : ${nameArray[index]} - ${grade}")
                excellent ->excellentArray.add("Отличные оценки: Ученик : ${nameArray[index]} - ${grade}")
            }
        }
        badArray.forEach{Log.d("myTag","$it")}
        normalArray.forEach{Log.d("myTag","$it")}
        niceArray.forEach{Log.d("myTag","$it")}
        excellentArray.forEach{Log.d("myTag","$it")}



    }
}