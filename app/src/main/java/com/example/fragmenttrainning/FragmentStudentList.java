package com.example.fragmenttrainning;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmenttrainning.databinding.FragmentStudentListBinding;

import java.util.ArrayList;

public class FragmentStudentList extends ListFragment {
    ArrayList<Student> arraystudent;
    StudentAdapter adapter;
    FragmentStudentListBinding viewListBinding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        viewListBinding = FragmentStudentListBinding.inflate(inflater,container,false);

        arraystudent = new ArrayList<>();
        addStudent();
        adapter = new StudentAdapter(getActivity(),R.layout.line_student,arraystudent);
        setListAdapter(adapter);



        return viewListBinding.getRoot();
    }
    private void addStudent(){
        arraystudent.add(new Student("Do Duc Thuan",2002,"Thanh Xuan, Ha Noi","ducthuan232tn@gmail.com"));
        arraystudent.add(new Student("Le Minh Duc",2002,"Ta Quang Buu, Ha Noi","LeDucNeuK64@gmail.com"));
        arraystudent.add(new Student("Do Le Duy",2002,"Xuan Thuy, Ha Noi","LeDuy2002tn@gmail.com"));
        arraystudent.add(new Student("Do Thanh Luan",2002,"Ha Dong, Ha Noi","ThanhLuan05032002@gmail.com"));
        arraystudent.add(new Student("Nguyen Thi Thuy Dung",2002,"Kim Giang, Ha Noi","nttd2002@gmail.com"));
        arraystudent.add(new Student("Nguyen Viet Dung",2002,"Ha Dong, Ha Noi","viedunHau2002@gmail.com"));
    }
}
