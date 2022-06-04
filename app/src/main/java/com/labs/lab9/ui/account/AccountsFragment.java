package com.labs.lab9.ui.account;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;


import com.labs.lab9.FAQ;
import com.labs.lab9.Login;
import com.labs.lab9.R;
import com.labs.lab9.databinding.FragmentAccountBinding;

public class AccountsFragment extends Fragment {
Button btn1,btn2;
    private FragmentAccountBinding binding;

    public View onCreateView( LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AccountsViewModel accountsViewModel =
                new ViewModelProvider(this).get(AccountsViewModel.class);

        binding = FragmentAccountBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        btn1= root.findViewById(R.id.btn1);
        btn2=root.findViewById(R.id.btn2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Enter Your Credentials", Toast.LENGTH_SHORT).show();
              /*LoginFragment loginFragment= new LoginFragment();
                FragmentTransaction fragmentTransaction=getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, loginFragment);
                fragmentTransaction.commit();
*/
                startActivity(new Intent(getContext(), Login.class));

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), FAQ.class));
            }
        });

        final TextView textView = binding.textAccount;
        accountsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        return root;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}