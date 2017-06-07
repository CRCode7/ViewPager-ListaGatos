package com.crcr.listagatos.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.crcr.listagatos.R;
import com.crcr.listagatos.adapter.GatoAdaptador;
import com.crcr.listagatos.pojo.Gato;

import java.util.ArrayList;

/**
 * Created by Criro on 05/06/2017.
 */

public class RecyclerView1Fragment extends Fragment{

    ArrayList<Gato> gatos;
    private RecyclerView listaGatos;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_recyclerview1, container, false);


        listaGatos = (RecyclerView) v.findViewById(R.id.rvGatos);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaGatos.setLayoutManager(llm);

        inicializarListaGatos();
        inicializaAdaptador();


        return v;
    }

    public void inicializarListaGatos(){
        gatos = new ArrayList<Gato>();

        gatos.add(new Gato(R.drawable.onegatosomali,"Gato Somali","3"));
        gatos.add(new Gato(R.drawable.twogatohimalayo,"Gato Himalayo","4"));
        gatos.add(new Gato(R.drawable.threecymric,"Cymric","2"));
        gatos.add(new Gato(R.drawable.foursnowshoe,"Snowshoe","5"));
        gatos.add(new Gato(R.drawable.fivegatopersa,"Gato Persa","4"));
    }

    public void inicializaAdaptador(){
        GatoAdaptador adaptador = new GatoAdaptador(gatos, getActivity());
        listaGatos.setAdapter(adaptador);
    }
}
