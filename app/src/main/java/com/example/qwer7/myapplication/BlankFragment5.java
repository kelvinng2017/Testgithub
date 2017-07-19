package com.example.qwer7.myapplication;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BlankFragment5.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BlankFragment5#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment5 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    String Q="",T="";
    int a,s;
    private OnFragmentInteractionListener mListener;

    public BlankFragment5() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlankFragment5.
     */
    // TODO: Rename and change types and number of parameters
    public static BlankFragment5 newInstance(String param1, String param2) {
        BlankFragment5 fragment = new BlankFragment5();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View BBB=inflater.inflate(R.layout.fragment_blank_fragment5,container,false);
        final Button butt=(Button)BBB.findViewById(R.id.button4);
        final TextView tevi1=(TextView)BBB.findViewById(R.id.textView7);
        final Button butt1=(Button)BBB.findViewById(R.id.button5);
        final Button butt2=(Button)BBB.findViewById(R.id.button6);
        final Button butt3=(Button)BBB.findViewById(R.id.button7);
        final Button butt4=(Button)BBB.findViewById(R.id.button8);
        a=Integer.valueOf(mParam1);
        s=Integer.valueOf(mParam2);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q="+";
                T="?";
                tevi1.setText("    "+mParam1+"  "+Q+"  "+mParam2+"     =     "+T);
            }
        });
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q="-";
                T="?";
                tevi1.setText("    "+mParam1+"  "+Q+"   "+mParam2+"     =     "+T);
            }
        });
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q="*";
                T="?";
                tevi1.setText("    "+mParam1+"  "+Q+"   "+mParam2+"     =     "+T);
            }
        });
        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q="/";
                T="?";
                tevi1.setText("    "+mParam1+"  "+Q+"   "+mParam2+"     =     "+T);
            }
        });

        tevi1.setText("    "+mParam1+"  "+Q+"    "+mParam2+"     =     "+T);

        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (Q)
                {
                    case "+":
                        T=Integer.toString(a+s);
                        tevi1.setText("    "+mParam1+"  "+Q+"   "+mParam2+"     = "+T);
                        break;
                    case "-":
                        T=Integer.toString(a-s);
                        tevi1.setText("    "+mParam1+"  "+Q+"   "+mParam2+"     = "+T);
                        break;
                    case "*":
                        T=Integer.toString(a*s);
                        tevi1.setText("    "+mParam1+"  "+Q+"   "+mParam2+"     = "+T);
                        break;
                    case "/":
                        T=Integer.toString(a/s);
                        tevi1.setText("    "+mParam1+"  "+Q+"   "+mParam2+"     = "+T);
                        break;

                }

            }
        });
        return BBB;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(String uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(String uri);
    }
}
