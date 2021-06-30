package com.finderestteam.finderest.ui.chats

import com.finderestteam.finderest.PersonData
import com.finderestteam.finderest.R
import com.squareup.picasso.Picasso
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item
import kotlinx.android.synthetic.main.message_from_chatlog.view.*

class MessageFromItem(val message: Message, val user: PersonData): Item<GroupieViewHolder>() {
    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.itemView.textview_from_chatlog.text = message.text
        Picasso.get().load(user.profileImageUrl).into(viewHolder.itemView.imageview_from_chatlog)
    }

    override fun getLayout(): Int {
        return R.layout.message_from_chatlog
    }
}