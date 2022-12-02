package com.mohammedsapplication.app.modules.iphone11promaxeleven.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mohammedsapplication.app.R
import com.mohammedsapplication.app.databinding.RowListcomponentlottBinding
import com.mohammedsapplication.app.modules.iphone11promaxeleven.`data`.model.ListcomponentlottRowModel
import kotlin.Int
import kotlin.collections.List

class ListcomponentlottAdapter(
  var list: List<ListcomponentlottRowModel>
) : RecyclerView.Adapter<ListcomponentlottAdapter.RowListcomponentlottVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListcomponentlottVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listcomponentlott,parent,false)
    return RowListcomponentlottVH(view)
  }

  override fun onBindViewHolder(holder: RowListcomponentlottVH, position: Int) {
    val listcomponentlottRowModel = ListcomponentlottRowModel()
    // TODO uncomment following line after integration with data source
    // val listcomponentlottRowModel = list[position]
    holder.binding.listcomponentlottRowModel = listcomponentlottRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListcomponentlottRowModel>) {
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
      item: ListcomponentlottRowModel
    ) {
    }
  }

  inner class RowListcomponentlottVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListcomponentlottBinding = RowListcomponentlottBinding.bind(itemView)
  }
}
