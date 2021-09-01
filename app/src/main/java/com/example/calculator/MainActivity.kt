package com.example.calculator

import android.annotation.SuppressLint
import android.icu.number.NumberFormatter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.OneShotPreDrawListener
import com.example.calculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder
import javax.xml.xpath.XPathExpression

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bclear.setOnClickListener{
            binding.input.setText("")
            binding.output.text = ""
        }
        binding.bzero.setOnClickListener{
            binding.input.append("0")
        }
        binding.bone.setOnClickListener{
            binding.input.append("1")
        }
        binding.btwo.setOnClickListener{
            binding.input.append("2")
        }
        binding.bthree.setOnClickListener{
            binding.input.append("3")
        }
        binding.bfour.setOnClickListener{
            binding.input.append("4")
        }
        binding.bfive.setOnClickListener{
            binding.input.append("5")
        }
        binding.bsix.setOnClickListener{
            binding.input.append("6")
        }
        binding.bseven.setOnClickListener{
            binding.input.append("7")
        }
        binding.beight.setOnClickListener{
            binding.input.append("8")
        }
        binding.bnine.setOnClickListener{
            binding.input.append("9")
        }

        binding.bdot.setOnClickListener{
            binding.input.append(".")
        }
        binding.startpara.setOnClickListener{
            binding.input.append("(")
        }
        binding.endpara.setOnClickListener{
            binding.input.append(")")
        }
        binding.bdiv.setOnClickListener{
            binding.input.append("/")
        }
        binding.bmul.setOnClickListener{
            binding.input.append("*")
        }
        binding.bsub.setOnClickListener{
            binding.input.append("-")
        }
        binding.badd.setOnClickListener{
            binding.input.append("+")
        }
        binding.bequal.setOnClickListener{
            val expression = ExpressionBuilder(binding.input.text.toString()).build()
            val result = expression.evaluate()
            val longresult = result.toLong()
            if(result == longresult.toDouble()){
                binding.output.text = longresult.toString()
            }
            else{
                binding.output.text = result.toString()
            }
        }
    }


    }




