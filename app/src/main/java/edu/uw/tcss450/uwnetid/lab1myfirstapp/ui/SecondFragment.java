package edu.uw.tcss450.uwnetid.lab1myfirstapp.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.uw.tcss450.uwnetid.lab1myfirstapp.R;
import edu.uw.tcss450.uwnetid.lab1myfirstapp.databinding.FragmentSecondBinding;

/**
 * create an instance of this fragment.
 */
public class SecondFragment extends Fragment {

    private FragmentSecondBinding mBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding = FragmentSecondBinding.inflate(inflater, container, false);
        return mBinding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mBinding = null;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);    //Get a reference to the SafeArgs object
        SecondFragmentArgs args = SecondFragmentArgs.fromBundle(getArguments());    //Set the text color of the label. NOTE no need to cast
        mBinding.textMessage.setText(args.getMessage());
    }
}