package easemob.com.bottomsheetdialog

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.google.android.material.bottomsheet.BottomSheetDialog
import easemob.com.bottomsheetdialog.databinding.ActivityMainBinding
import easemob.com.bottomsheetdialog.databinding.DialogBottomNewBinding


class MainActivity : ComponentActivity(), View.OnClickListener {
    var binding:ActivityMainBinding  ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding?.root
        setContentView(view)
        binding!!.btSheetDialog.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val mBottomSheetDialog = BottomSheetDialog(this,R.style.BottomSheetDialog)
        val binding: DialogBottomNewBinding = DialogBottomNewBinding.inflate(layoutInflater)
        val view = binding.root
        view.let { mBottomSheetDialog.setContentView(it) }
        //设置点击dialog外部不消失
        mBottomSheetDialog.setCanceledOnTouchOutside(false)
        mBottomSheetDialog.show()
    }
}

