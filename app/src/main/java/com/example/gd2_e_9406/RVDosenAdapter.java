package com.example.gd2_e_9406;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gd2_e_9406.entity.Dosen;

public class RVDosenAdapter extends RecyclerView.Adapter<RVDosenAdapter.viewHolder> {
    private final Dosen[] listDosen;

    // Kelas ini berguna untuk menghubungkan view view yang ada pada item di recycler view kita.
    public class viewHolder extends RecyclerView.ViewHolder{
        TextView tvNama;
        TextView tvDetails;


        public viewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tv_nama);
            tvDetails = itemView.findViewById(R.id.tv_details);
        }
    }

    //  Constructor adapter kita
    RVDosenAdapter(Dosen[] data){
        listDosen = data;
    }

    @NonNull
    @Override
    public RVDosenAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //  Disini kita menghubungkan layout item recycler view kita
        return new RVDosenAdapter.viewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item_dosen,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RVDosenAdapter.viewHolder holder, int position) {
        //  Karena kita sudah mendefinisikan dan menghubungkan view kita,
        //  kita bisa memakai view tersebut dan Melakukan setText pada view tersebut

        holder.tvNama.setText(listDosen[position].getName());
        holder.tvDetails.setText(listDosen[position].getTnoDosen() + " - " + listDosen[position].getMasa());
    }

    @Override
    public int getItemCount() {
        //  Disini kita memberitahu jumlah dari item pada recycler view kita.
        return listDosen.length;
    }

}
