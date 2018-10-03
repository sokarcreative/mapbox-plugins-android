package com.mapbox.mapboxsdk.plugins.testapp.activity.offline

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

import com.mapbox.mapboxsdk.offline.OfflineManager
import com.mapbox.mapboxsdk.offline.OfflineRegion
import com.mapbox.mapboxsdk.offline.OfflineTilePyramidRegionDefinition
import com.mapbox.mapboxsdk.plugins.offline.utils.OfflineUtils
import com.mapbox.mapboxsdk.plugins.testapp.R

import java.util.ArrayList
import java.util.Arrays

/**
 * Activity showing a list of offline regions.
 */
class OfflineRegionListActivity : AppCompatActivity(), AdapterView.OnItemClickListener {

    private var adapter: OfflineRegionAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_offline_region_list)

        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = OfflineRegionAdapter(this)
        listView.emptyView = findViewById(android.R.id.empty)
        listView.onItemClickListener = this
    }

    override fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id: Long) {
        val region = adapter!!.getItem(position)
        val intent = Intent(this, OfflineRegionDetailActivity::class.java)
        intent.putExtra(OfflineRegionDetailActivity.KEY_REGION_ID_BUNDLE, region.id)
        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()
        loadOfflineRegions()
    }

    private fun loadOfflineRegions() {
        OfflineManager.getInstance(this).listOfflineRegions(object : OfflineManager.ListOfflineRegionsCallback {
            override fun onList(offlineRegions: Array<OfflineRegion>?) {
                if (offlineRegions != null) {
                    adapter!!.setOfflineRegions(Arrays.asList(*offlineRegions))
                }
            }

            override fun onError(error: String) {
                Toast.makeText(this@OfflineRegionListActivity, "Error loading regions $error", Toast.LENGTH_LONG).show()
            }
        })
    }

    private class OfflineRegionAdapter internal constructor(private val context: Context) : BaseAdapter() {
        private var offlineRegions: List<OfflineRegion>? = null
        private var currentRegion: OfflineRegion? = null

        init {
            offlineRegions = ArrayList()
        }

        internal fun setOfflineRegions(offlineRegions: List<OfflineRegion>) {
            this.offlineRegions = offlineRegions
            notifyDataSetChanged()
        }

        override fun getCount(): Int {
            return offlineRegions!!.size
        }

        override fun getItem(position: Int): OfflineRegion {
            return offlineRegions!![position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
            var convertView = convertView
            val holder: ViewHolder

            if (convertView == null) {
                holder = ViewHolder()
                convertView = LayoutInflater.from(context).inflate(R.layout.item_feature, parent, false)
                holder.text = convertView!!.findViewById(R.id.nameView)
                holder.subText = convertView.findViewById(R.id.descriptionView)
                convertView.tag = holder
            } else {
                holder = convertView.tag as ViewHolder
            }

            currentRegion = getItem(position)
            holder.text!!.text = OfflineUtils.convertRegionName(currentRegion!!.metadata)
            holder.subText!!.text = (currentRegion!!.definition as OfflineTilePyramidRegionDefinition).styleURL
            return convertView
        }

        internal class ViewHolder {
            var text: TextView? = null
            var subText: TextView? = null
        }
    }
}