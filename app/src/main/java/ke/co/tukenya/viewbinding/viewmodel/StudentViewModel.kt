package ke.co.tukenya.viewbinding.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import ke.co.tukenya.viewbinding.model.Student

class StudentViewModel: ViewModel() {
    private lateinit var students:MutableList<Student>
    private var index:Int

    init{
        this.students= mutableListOf()
        this.students.add(Student("00453","John Doe"))
        this.students.add(Student("02223","Ben Maina "))
        this.students.add(Student("34343","New User"))
this.index=-1
    }

 fun getNext():Student{
     this.index++
     if(this.index>=this.students.size){
this.index=0
     }
     return this.students[index]
 }

    override fun onCleared(){
        super.onCleared()
        Log.w("STUDENT VIEW MODEL","ONCLEARED: RecordCleared")

    }
}