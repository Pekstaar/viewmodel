package ke.co.tukenya.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import ke.co.tukenya.viewbinding.databinding.ActivityMainBinding
import ke.co.tukenya.viewbinding.viewmodel.StudentViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding  //defining the binding class
 private lateinit var viewModel:StudentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding=ActivityMainBinding.inflate(layoutInflater)

        setContentView(this.binding.root)
        this.viewModel=ViewModelProvider(this).get(StudentViewModel::class.java)

        this.binding.button.setOnClickListener{
val student = this.viewModel.getNext()
            this.binding.txtViewStudent.text="Name:${student.name} Admin Number:${student.adm}"
        }
    }


}