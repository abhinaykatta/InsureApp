package com.mohammedsapplication.app.modules.iphone11promaxtwelve.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mohammedsapplication.app.R
import com.mohammedsapplication.app.databinding.RowListcomponentlott1Binding
import com.mohammedsapplication.app.modules.iphone11promaxtwelve.`data`.model.Listcomponentlott1RowModel
import kotlin.Int
import kotlin.collections.List

class ListcomponentlottAdapter(
  var list: List<Listcomponentlott1RowModel>
) : RecyclerView.Adapter<ListcomponentlottAdapter.RowListcomponentlott1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListcomponentlott1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listcomponentlott1,parent,false)
    return RowListcomponentlott1VH(view)
  }

  override fun onBindViewHolder(holder: RowListcomponentlott1VH, position: Int) {
    val listcomponentlott1RowModel = Listcomponentlott1RowModel()
    // TODO uncomment following line after integration with data source
    // val listcomponentlott1RowModel = list[position]
    holder.binding.listcomponentlott1RowModel = listcomponentlott1RowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listcomponentlott1RowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: Listcomponentlott1RowModel
    ) {
    }
  }

  inner class RowListcomponentlott1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListcomponentlott1Binding = RowListcomponentlott1Binding.bind(itemView)
  }
}
