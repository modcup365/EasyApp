package modcup.jeera.easyapp.fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import modcup.jeera.easyapp.R;

/**
 * Created by Jeera on 7/10/2560.
 */

public class MainFragment extends Fragment{

    //Explicit
    private ImageView imvImage;
    private Button btnDecrease, btnIncrease;

    //My Constant
    private int[] imageInts = new int[]{
            R.drawable.flower1,
            R.drawable.flower2,
            R.drawable.flower3};
    private int indexAnInt = 0;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Initial View
        initialView();

//        Increase Controller
        increaseController();
//        Decrease Controller
        decreaseController();
    }

    private void decreaseController() {

        btnDecrease.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void  onClick(View v){
//                image < index
               if(indexAnInt<=0){
                  indexAnInt=imageInts.length-1;
               }
//               image decrease normal
                else {
                   indexAnInt-=1;
               }
               imvImage.setImageResource(imageInts[indexAnInt]);

            }

        });

    }

    private void increaseController() {

        final String tag = "8OCT";


        btnIncrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(tag,""+imageInts.length);
                if (indexAnInt < imageInts.length-1) {
                    //Todo
                    indexAnInt += 1;
                } else {
                    indexAnInt = 0;
                }
                imvImage.setImageResource(imageInts[indexAnInt]);

            }   // onClick
        });

    }


    private void initialView() {

        imvImage = getView().findViewById(R.id.imvImage);
        btnDecrease = getView().findViewById(R.id.btnDecrease);
        btnIncrease = getView().findViewById(R.id.btnIncrease);
    }
}   // Main Class