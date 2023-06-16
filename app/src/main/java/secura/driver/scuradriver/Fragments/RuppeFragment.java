package secura.driver.scuradriver.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import secura.driver.scuradriver.CheckBalance;
import secura.driver.scuradriver.R;
import secura.driver.scuradriver.databinding.FragmentRuppeBinding;


public class RuppeFragment extends Fragment {

   FragmentRuppeBinding binding;

    public RuppeFragment() {

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding=FragmentRuppeBinding.inflate(getLayoutInflater());
        binding.layBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), CheckBalance.class);
                 startActivity(intent );
            }
        });
        return binding.getRoot();
    }
}