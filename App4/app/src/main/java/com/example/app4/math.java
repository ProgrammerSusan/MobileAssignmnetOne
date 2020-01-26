package com.example.app4;

import android.widget.TextView;

public class math {
    public static int mathmatics(int cred, boolean ug, boolean grad, boolean ndeg,
                            boolean in, boolean out, boolean drm, boolean dine,
                            boolean park, int tuition)
    {

        tuition = 0;
        if(ug)
            if(in)
                tuition =cred *500;
            else
                tuition =cred *1000;
        else if(grad)
            if(in)
                tuition =cred *800;
            else
                tuition =cred *1600;
        else if(ndeg)
            if(in)
                tuition =cred *300;
                else
                tuition =cred *600;

        if(drm)
            tuition =tuition +5000;

        if(dine)
            tuition =tuition +2000;

        if(park)
            tuition =tuition +1000;

        return tuition;
    }
}
