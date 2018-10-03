package com.mapbox.mapboxsdk.plugins.maps

import com.mapbox.mapboxsdk.camera.CameraPosition
import com.mapbox.mapboxsdk.camera.CameraUpdateFactory
import com.mapbox.mapboxsdk.constants.MapboxConstants
import com.mapbox.mapboxsdk.geometry.LatLng
import com.mapbox.mapboxsdk.maps.MapboxMap

//
// Move camera
//

inline fun MapboxMap.moveCamera(latLng: LatLng) {
    this.moveCamera(CameraUpdateFactory.newLatLng(latLng))
}

inline fun MapboxMap.moveCamera(latLng: LatLng, zoom: Double) {
    this.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoom))
}

inline fun MapboxMap.moveCamera(latLng: LatLng, zoom: Double, bearing: Double) {
    this.moveCamera(
            CameraUpdateFactory.newCameraPosition(
                    CameraPosition.Builder().target(latLng).zoom(zoom).bearing(bearing).build()
            )
    )
}

inline fun MapboxMap.moveCamera(latLng: LatLng, zoom: Double, bearing: Double, tilt: Double) {
    this.moveCamera(
            CameraUpdateFactory.newCameraPosition(
                    CameraPosition.Builder().target(latLng).zoom(zoom).bearing(bearing).tilt(tilt).build()
            )
    )
}

//
// Ease camera
//

inline fun MapboxMap.easeCamera(latLng: LatLng) {
    this.easeCamera(CameraUpdateFactory.newLatLng(latLng))
}

inline fun MapboxMap.easeCamera(latLng: LatLng, duration: Int = MapboxConstants.ANIMATION_DURATION, callback: MapboxMap.CancelableCallback) {
    this.easeCamera(CameraUpdateFactory.newLatLng(latLng), duration, callback)
}

inline fun MapboxMap.easeCamera(latLng: LatLng, callback: MapboxMap.CancelableCallback) {
    this.easeCamera(CameraUpdateFactory.newLatLng(latLng), MapboxConstants.ANIMATION_DURATION, callback)
}

inline fun MapboxMap.easeCamera(latLng: LatLng, zoom: Double) {
    this.easeCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoom))
}

inline fun MapboxMap.easeCamera(latLng: LatLng, zoom: Double, duration: Int = MapboxConstants.ANIMATION_DURATION, callback: MapboxMap.CancelableCallback) {
    this.easeCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoom), duration, callback)
}

inline fun MapboxMap.easeCamera(latLng: LatLng, zoom: Double, callback: MapboxMap.CancelableCallback) {
    this.easeCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoom), MapboxConstants.ANIMATION_DURATION, callback)
}

inline fun MapboxMap.easeCamera(latLng: LatLng, zoom: Double, bearing: Double) {
    this.easeCamera(
            CameraUpdateFactory.newCameraPosition(
                    CameraPosition.Builder().target(latLng).zoom(zoom).bearing(bearing).build()
            )
    )
}

inline fun MapboxMap.easeCamera(latLng: LatLng, zoom: Double, bearing: Double, duration: Int = MapboxConstants.ANIMATION_DURATION, callback: MapboxMap.CancelableCallback) {
    this.easeCamera(
            CameraUpdateFactory.newCameraPosition(
                    CameraPosition.Builder().target(latLng).zoom(zoom).bearing(bearing).build()
            ), duration, callback
    )
}

inline fun MapboxMap.easeCamera(latLng: LatLng, zoom: Double, bearing: Double, callback: MapboxMap.CancelableCallback) {
    this.easeCamera(
            CameraUpdateFactory.newCameraPosition(
                    CameraPosition.Builder().target(latLng).zoom(zoom).bearing(bearing).build()
            ), MapboxConstants.ANIMATION_DURATION, callback
    )
}


inline fun MapboxMap.easeCamera(latLng: LatLng, zoom: Double, bearing: Double, tilt: Double) {
    this.easeCamera(
            CameraUpdateFactory.newCameraPosition(
                    CameraPosition.Builder().target(latLng).zoom(zoom).bearing(bearing).tilt(tilt).build()
            )
    )
}

inline fun MapboxMap.easeCamera(latLng: LatLng, zoom: Double, bearing: Double, tilt: Double, duration: Int = MapboxConstants.ANIMATION_DURATION, callback: MapboxMap.CancelableCallback) {
    this.easeCamera(
            CameraUpdateFactory.newCameraPosition(
                    CameraPosition.Builder().target(latLng).zoom(zoom).bearing(bearing).tilt(tilt).build()
            ), duration, callback
    )
}

inline fun MapboxMap.easeCamera(latLng: LatLng, zoom: Double, bearing: Double, tilt: Double, callback: MapboxMap.CancelableCallback) {
    this.easeCamera(
            CameraUpdateFactory.newCameraPosition(
                    CameraPosition.Builder().target(latLng).zoom(zoom).bearing(bearing).tilt(tilt).build()
            ), MapboxConstants.ANIMATION_DURATION, callback
    )
}


//
// Animate camera
//

inline fun MapboxMap.animateCamera(latLng: LatLng) {
    this.animateCamera(CameraUpdateFactory.newLatLng(latLng))
}

inline fun MapboxMap.animateCamera(latLng: LatLng, callback: MapboxMap.CancelableCallback) {
    this.animateCamera(CameraUpdateFactory.newLatLng(latLng), callback)
}

inline fun MapboxMap.animateCamera(latLng: LatLng, duration: Int = MapboxConstants.ANIMATION_DURATION, callback: MapboxMap.CancelableCallback) {
    this.animateCamera(CameraUpdateFactory.newLatLng(latLng), duration, callback)
}

inline fun MapboxMap.animateCamera(latLng: LatLng, zoom: Double) {
    this.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoom))
}

inline fun MapboxMap.animateCamera(latLng: LatLng, zoom: Double, callback: MapboxMap.CancelableCallback) {
    this.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoom), callback)
}

inline fun MapboxMap.animateCamera(latLng: LatLng, zoom: Double, duration: Int = MapboxConstants.ANIMATION_DURATION, callback: MapboxMap.CancelableCallback) {
    this.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoom), duration, callback)
}

inline fun MapboxMap.animateCamera(latLng: LatLng, zoom: Double, bearing: Double) {
    this.animateCamera(
            CameraUpdateFactory.newCameraPosition(
                    CameraPosition.Builder().target(latLng).zoom(zoom).bearing(bearing).build()
            )
    )
}

inline fun MapboxMap.animateCamera(latLng: LatLng, zoom: Double, bearing: Double, callback: MapboxMap.CancelableCallback) {
    this.animateCamera(
            CameraUpdateFactory.newCameraPosition(
                    CameraPosition.Builder().target(latLng).zoom(zoom).bearing(bearing).build()
            ), callback
    )
}

inline fun MapboxMap.animateCamera(latLng: LatLng, zoom: Double, bearing: Double, duration: Int = MapboxConstants.ANIMATION_DURATION, callback: MapboxMap.CancelableCallback) {
    this.animateCamera(
            CameraUpdateFactory.newCameraPosition(
                    CameraPosition.Builder().target(latLng).zoom(zoom).bearing(bearing).build()
            ), duration, callback
    )
}

inline fun MapboxMap.animateCamera(latLng: LatLng, zoom: Double, bearing: Double, tilt: Double) {
    this.animateCamera(
            CameraUpdateFactory.newCameraPosition(
                    CameraPosition.Builder().target(latLng).zoom(zoom).bearing(bearing).tilt(tilt).build()
            )
    )
}

inline fun MapboxMap.animateCamera(latLng: LatLng, zoom: Double, bearing: Double, tilt: Double, callback: MapboxMap.CancelableCallback) {
    this.animateCamera(
            CameraUpdateFactory.newCameraPosition(
                    CameraPosition.Builder().target(latLng).zoom(zoom).bearing(bearing).tilt(tilt).build()
            ), callback
    )
}

inline fun MapboxMap.animateCamera(latLng: LatLng, zoom: Double, bearing: Double, tilt: Double, duration: Int = MapboxConstants.ANIMATION_DURATION, callback: MapboxMap.CancelableCallback) {
    this.animateCamera(
            CameraUpdateFactory.newCameraPosition(
                    CameraPosition.Builder().target(latLng).zoom(zoom).bearing(bearing).tilt(tilt).build()
            ), duration, callback
    )
}


