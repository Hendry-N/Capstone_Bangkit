// AngketAdapter.kt
package capstone.product.tim.majorsmatch.view.majorsmatch

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import capstone.product.tim.majorsmatch.databinding.ItemAngketBinding

class AngketAdapter : RecyclerView.Adapter<AngketAdapter.AngketViewHolder>() {

    // Sample data model (replace with your actual data model)
    data class AngketItem(val mudahText: String, val sulitText: String, var isMudahChecked: Boolean, var isSulitChecked: Boolean)

    // ViewHolder class
    class AngketViewHolder(val binding: ItemAngketBinding) : RecyclerView.ViewHolder(binding.root)

    // Sample data (replace with your actual data set)
    private val angketItems = listOf(
        AngketItem("Mudah 1", "Sulit 1", false, false),
        AngketItem("Mudah 2", "Sulit 2", false, false),
        // Add more items as needed
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AngketViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemAngketBinding.inflate(inflater, parent, false)
        return AngketViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AngketViewHolder, position: Int) {
        val currentItem = angketItems[position]

        // Use binding to access views
        with(holder.binding) {
            mudah.text = currentItem.mudahText
            sulit.text = currentItem.sulitText

            // Checkbox logic
            mudah.isChecked = currentItem.isMudahChecked
            sulit.isChecked = currentItem.isSulitChecked

            mudah.setOnCheckedChangeListener { _, isChecked ->
                currentItem.isMudahChecked = isChecked
                if (isChecked) {
                    // Uncheck Sulit CheckBox if Mudah is checked
                    sulit.isChecked = false
                }
                // Add your additional logic here
            }

            sulit.setOnCheckedChangeListener { _, isChecked ->
                currentItem.isSulitChecked = isChecked
                if (isChecked) {
                    // Uncheck Mudah CheckBox if Sulit is checked
                    mudah.isChecked = false
                }
                // Add your additional logic here
            }

            // Bind other views as needed
        }
    }

    override fun getItemCount(): Int {
        // Return the number of items in your data set
        return angketItems.size
    }
}
