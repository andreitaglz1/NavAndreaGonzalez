package ni.edu.uca.navandreagonzalez

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import ni.edu.uca.navandreagonzalez.databinding.FragmentLoginBinding


class FragmentLogin {
    private lateinit var binding: FragmentLoginBinding
    val usuario:String = "UCA"
    val pass:String = "Damo1"


    private fun limpiar(){
        binding.username.setText("")
        binding.password.setText("")
    }

}