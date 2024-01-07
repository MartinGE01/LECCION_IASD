package com.example.myapplicationpruebalec.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplicationpruebalec.databinding.FragmentHomeBinding
import com.example.myapplicationpruebalec.ui.leccion.leccion1
import com.example.myapplicationpruebalec.ui.leccion.leccion2
import com.example.myapplicationpruebalec.ui.leccion.leccion3
import com.example.myapplicationpruebalec.ui.leccion.leccion4
import com.example.myapplicationpruebalec.ui.leccion.leccion5
import com.example.myapplicationpruebalec.ui.leccion.leccion6
import com.example.myapplicationpruebalec.ui.leccion.leccion7
import com.example.myapplicationpruebalec.ui.leccion.leccion8
import com.example.myapplicationpruebalec.ui.leccion.leccion9
import com.example.myapplicationpruebalec.ui.leccion.leccion10
import com.example.myapplicationpruebalec.ui.leccion.leccion11
import com.example.myapplicationpruebalec.ui.leccion.leccion12
import com.example.myapplicationpruebalec.ui.leccion.leccion13
import com.example.myapplicationpruebalec.ui.leccion.leccion14
import com.example.myapplicationpruebalec.ui.leccion.leccion15
import com.example.myapplicationpruebalec.ui.leccion.leccion16
import com.example.myapplicationpruebalec.ui.leccion.leccion17
import com.example.myapplicationpruebalec.ui.leccion.leccion18
import com.example.myapplicationpruebalec.ui.leccion.leccion19
import com.example.myapplicationpruebalec.ui.leccion.leccion20
import com.example.myapplicationpruebalec.ui.leccion.leccion21
import com.example.myapplicationpruebalec.ui.leccion.leccion22
import com.example.myapplicationpruebalec.ui.leccion.leccion23
import com.example.myapplicationpruebalec.ui.leccion.leccion24
import com.example.myapplicationpruebalec.ui.leccion.leccion25
import com.example.myapplicationpruebalec.ui.leccion.leccion26


// Importa las otras clases de lecciones aquí

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val button1: Button = binding.button1
        val button2: Button = binding.button2
        val button3: Button = binding.button3
        val button4: Button = binding.button4
        val button5: Button = binding.button5
        val button6: Button = binding.button6
        val button7: Button = binding.button7
        val button8: Button = binding.button8
        val button9: Button = binding.button9
        val button10: Button = binding.button10
        val button11: Button = binding.button11
        val button12: Button = binding.button12
        val button13: Button = binding.button13
        val button14: Button = binding.button14
        val button15: Button = binding.button15
        val button16: Button = binding.button16
        val button17: Button = binding.button17
        val button18: Button = binding.button18
        val button19: Button = binding.button19
        val button20: Button = binding.button20
        val button21: Button = binding.button21
        val button22: Button = binding.button22
        val button23: Button = binding.button23
        val button24: Button = binding.button24
        val button25: Button = binding.button25
        val button26: Button = binding.button26

        button1.setOnClickListener {
            val intent = Intent(requireActivity(), leccion1::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(requireActivity(), leccion2::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent = Intent(requireActivity(), leccion3::class.java)
            startActivity(intent)
        }

        // Repite este bloque para los otros botones
        button4.setOnClickListener {
            val intent = Intent(requireActivity(), leccion4::class.java)
            startActivity(intent)
        }

        button5.setOnClickListener {
            val intent = Intent(requireActivity(), leccion5::class.java)
            startActivity(intent)
        }

        button6.setOnClickListener {
            val intent = Intent(requireActivity(), leccion6::class.java)
            startActivity(intent)
        }

        button7.setOnClickListener {
            val intent = Intent(requireActivity(), leccion7::class.java)
            startActivity(intent)
        }

        button8.setOnClickListener {
            val intent = Intent(requireActivity(), leccion8::class.java)
            startActivity(intent)
        }

        button9.setOnClickListener {
            val intent = Intent(requireActivity(), leccion9::class.java)
            startActivity(intent)
        }

        button10.setOnClickListener {
            val intent = Intent(requireActivity(), leccion10::class.java)
            startActivity(intent)
        }

        button11.setOnClickListener {
            val intent = Intent(requireActivity(), leccion11::class.java)
            startActivity(intent)
        }

        button12.setOnClickListener {
            val intent = Intent(requireActivity(), leccion12::class.java)
            startActivity(intent)
        }

        button13.setOnClickListener {
            val intent = Intent(requireActivity(), leccion13::class.java)
            startActivity(intent)
        }

        button14.setOnClickListener {
            val intent = Intent(requireActivity(), leccion14::class.java)
            startActivity(intent)
        }

        button15.setOnClickListener {
            val intent = Intent(requireActivity(), leccion15::class.java)
            startActivity(intent)
        }

        button16.setOnClickListener {
            val intent = Intent(requireActivity(), leccion16::class.java)
            startActivity(intent)
        }

        button17.setOnClickListener {
            val intent = Intent(requireActivity(), leccion17::class.java)
            startActivity(intent)
        }

        button18.setOnClickListener {
            val intent = Intent(requireActivity(), leccion18::class.java)
            startActivity(intent)
        }

        button19.setOnClickListener {
            val intent = Intent(requireActivity(), leccion19::class.java)
            startActivity(intent)
        }

        button20.setOnClickListener {
            val intent = Intent(requireActivity(), leccion20::class.java)
            startActivity(intent)
        }

        button21.setOnClickListener {
            val intent = Intent(requireActivity(), leccion21::class.java)
            startActivity(intent)
        }

        button22.setOnClickListener {
            val intent = Intent(requireActivity(), leccion22::class.java)
            startActivity(intent)
        }

        button23.setOnClickListener {
            val intent = Intent(requireActivity(), leccion23::class.java)
            startActivity(intent)
        }

        button24.setOnClickListener {
            val intent = Intent(requireActivity(), leccion24::class.java)
            startActivity(intent)
        }

        button25.setOnClickListener {
            val intent = Intent(requireActivity(), leccion25::class.java)
            startActivity(intent)
        }

        button26.setOnClickListener {
            val intent = Intent(requireActivity(), leccion26::class.java)
            startActivity(intent)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
