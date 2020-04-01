package com.kucharski.michal.weatheracc.ui.fragment

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController

import com.kucharski.michal.weatheracc.R
import com.kucharski.michal.weatheracc.viewModels.SplashViewModel


class TemporaryFragment : Fragment() {

    private lateinit var viewModel: SplashViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_temporary, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SplashViewModel::class.java)
        // TODO: Use the ViewModel

    }


}
